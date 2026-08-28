package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import g7.p8;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaDataController;
import q7.j;
import x5.l;
import y5.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public DataHolder(int i9, String[] strArr, CursorWindow[] cursorWindowArr, int i10, Bundle bundle) {
        this.a = i9;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i10;
        this.f = bundle;
    }

    public final int b(int i9) {
        int length;
        int i10 = 0;
        l.k(i9 >= 0 && i9 < this.n);
        while (true) {
            int[] iArr = this.h;
            length = iArr.length;
            if (i10 >= length) {
                break;
            }
            if (i9 < iArr[i10]) {
                i10--;
                break;
            }
            i10++;
        }
        return i10 == length ? i10 - 1 : i10;
    }

    public final void c(int i9, String str) {
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
        if (i9 < 0 || i9 >= this.n) {
            throw new CursorIndexOutOfBoundsException(i9, this.n);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                if (!this.r) {
                    this.r = true;
                    int i9 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.d;
                        if (i9 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i9].close();
                        i9++;
                    }
                }
            } catch (Throwable th) {
                throw th;
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.m(parcel, 1, this.b);
        p8.o(parcel, 2, this.d, i9);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.e);
        p8.b(parcel, 4, this.f);
        p8.s(parcel, MediaDataController.MAX_STYLE_RUNS_COUNT, 4);
        parcel.writeInt(this.a);
        p8.r(parcel, q10);
        if ((i9 & 1) != 0) {
            close();
        }
    }
}
