package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class DataHolder extends b4 implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new d3d((byte) 7);
    public final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] h;
    public int n;
    public boolean r = false;

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.a = i;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i2;
        this.f = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.r) {
                this.r = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.d;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void finalize() {
        boolean z;
        try {
            if (this.d.length > 0) {
                synchronized (this) {
                    z = this.r;
                }
                if (!z) {
                    close();
                    String obj = toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + nm7.H2);
                    sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                    sb.append(obj);
                    sb.append(")");
                    Log.e("DataBuffer", sb.toString());
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.m(parcel, 1, this.b);
        mve.o(parcel, 2, this.d, i);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.e);
        mve.b(parcel, 4, this.f);
        mve.q(parcel, 1000, 4);
        parcel.writeInt(this.a);
        mve.s(parcel, r);
        if ((i & 1) != 0) {
            close();
        }
    }
}
