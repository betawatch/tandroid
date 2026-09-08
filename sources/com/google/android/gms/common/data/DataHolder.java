package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import g8.j;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import n6.l;
import o6.a;
import org.telegram.messenger.MediaDataController;
import w7.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class DataHolder extends a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new j(20);
    public final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] h;
    public int n;
    public boolean r = false;

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.a = i10;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i11;
        this.f = bundle;
    }

    public final int b(int i10) {
        int length;
        int i11 = 0;
        l.k(i10 >= 0 && i10 < this.n);
        while (true) {
            int[] iArr = this.h;
            length = iArr.length;
            if (i11 >= length) {
                break;
            }
            if (i10 < iArr[i11]) {
                i11--;
                break;
            }
            i11++;
        }
        return i11 == length ? i11 - 1 : i11;
    }

    public final void c(int i10, String str) {
        boolean z10;
        Bundle bundle = this.c;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(str));
        }
        synchronized (this) {
            z10 = this.r;
        }
        if (z10) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i10 < 0 || i10 >= this.n) {
            throw new CursorIndexOutOfBoundsException(i10, this.n);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                if (!this.r) {
                    this.r = true;
                    int i10 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.d;
                        if (i10 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i10].close();
                        i10++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        boolean z10;
        try {
            if (this.d.length > 0) {
                synchronized (this) {
                    z10 = this.r;
                }
                if (!z10) {
                    close();
                    Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.m(parcel, 1, this.b);
        e0.o(parcel, 2, this.d, i10);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.e);
        e0.b(parcel, 4, this.f);
        e0.s(parcel, MediaDataController.MAX_STYLE_RUNS_COUNT, 4);
        parcel.writeInt(this.a);
        e0.r(parcel, q6);
        if ((i10 & 1) != 0) {
            close();
        }
    }
}
