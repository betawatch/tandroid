package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import b6.m;
import c6.a;
import j7.f5;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaDataController;
import u6.p;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class DataHolder extends a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new p(23);
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

    public final int e(int i10) {
        int length;
        int i11 = 0;
        m.k(i10 >= 0 && i10 < this.n);
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

    public final void f(int i10, String str) {
        boolean z4;
        Bundle bundle = this.c;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(str));
        }
        synchronized (this) {
            z4 = this.r;
        }
        if (z4) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i10 < 0 || i10 >= this.n) {
            throw new CursorIndexOutOfBoundsException(i10, this.n);
        }
    }

    public final void finalize() {
        boolean z4;
        try {
            if (this.d.length > 0) {
                synchronized (this) {
                    z4 = this.r;
                }
                if (!z4) {
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
        int q10 = f5.q(parcel, 20293);
        f5.m(parcel, 1, this.b);
        f5.o(parcel, 2, this.d, i10);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.e);
        f5.b(parcel, 4, this.f);
        f5.s(parcel, MediaDataController.MAX_STYLE_RUNS_COUNT, 4);
        parcel.writeInt(this.a);
        f5.r(parcel, q10);
        if ((i10 & 1) != 0) {
            close();
        }
    }
}
