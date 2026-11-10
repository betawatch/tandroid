package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import c8.xb;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import m6.e;
import org.telegram.messenger.qs;
import r6.a;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class DataHolder extends a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new e(12);
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

    public DataHolder(int i7, String[] strArr, CursorWindow[] cursorWindowArr, int i10, Bundle bundle) {
        this.a = i7;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i10;
        this.f = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                if (!this.r) {
                    this.r = true;
                    int i7 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.d;
                        if (i7 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i7].close();
                        i7++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        boolean z9;
        try {
            if (this.d.length > 0) {
                synchronized (this) {
                    z9 = this.r;
                }
                if (!z9) {
                    close();
                    String obj = toString();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + qs.I2);
                    sb2.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                    sb2.append(obj);
                    sb2.append(")");
                    Log.e("DataBuffer", sb2.toString());
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.m(parcel, 1, this.b);
        xb.o(parcel, 2, this.d, i7);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.e);
        xb.b(parcel, 4, this.f);
        xb.q(parcel, 1000, 4);
        parcel.writeInt(this.a);
        xb.s(parcel, r10);
        if ((i7 & 1) != 0) {
            close();
        }
    }
}
