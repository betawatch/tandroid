package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import i7.p;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.hs;
import q6.a;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class DataHolder extends a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new p(27);
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

    public DataHolder(int i3, String[] strArr, CursorWindow[] cursorWindowArr, int i10, Bundle bundle) {
        this.a = i3;
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
                    int i3 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.d;
                        if (i3 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i3].close();
                        i3++;
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
                    String obj = toString();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + hs.I2);
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
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.n(parcel, 1, this.b);
        j8.a.p(parcel, 2, this.d, i3);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.e);
        j8.a.c(parcel, 4, this.f);
        j8.a.r(parcel, 1000, 4);
        parcel.writeInt(this.a);
        j8.a.t(parcel, s6);
        if ((i3 & 1) != 0) {
            close();
        }
    }
}
