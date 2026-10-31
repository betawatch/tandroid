package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import g8.g;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import o6.a;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class DataHolder extends a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new g(19);
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
        int q6 = h0.q(parcel, 20293);
        h0.m(parcel, 1, this.b);
        h0.o(parcel, 2, this.d, i10);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.e);
        h0.b(parcel, 4, this.f);
        h0.s(parcel, 1000, 4);
        parcel.writeInt(this.a);
        h0.r(parcel, q6);
        if ((i10 & 1) != 0) {
            close();
        }
    }
}
