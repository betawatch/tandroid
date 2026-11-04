package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t implements Parcelable.Creator {
    public static final t b = new t(0);
    public final /* synthetic */ int a;

    public /* synthetic */ t(int i3) {
        this.a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int dataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(dataPosition - 4);
                    return g.d;
                }
                int z10 = g6.e.z(parcel);
                boolean z11 = false;
                h hVar = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 == 1) {
                        hVar = (h) g6.e.g(parcel, readInt, h.CREATOR);
                    } else if (c2 != 2) {
                        g6.e.y(parcel, readInt);
                    } else {
                        z11 = g6.e.n(parcel, readInt);
                    }
                }
                g6.e.m(parcel, z10);
                return new g(hVar, z11);
            case 1:
                int z12 = g6.e.z(parcel);
                int i3 = 0;
                boolean z13 = true;
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 1) {
                        i3 = g6.e.u(parcel, readInt2);
                    } else if (c10 == 2) {
                        i10 = g6.e.u(parcel, readInt2);
                    } else if (c10 == 3) {
                        i11 = g6.e.u(parcel, readInt2);
                    } else if (c10 != 4) {
                        g6.e.y(parcel, readInt2);
                    } else {
                        z13 = g6.e.n(parcel, readInt2);
                    }
                }
                g6.e.m(parcel, z12);
                return new h(i3, i10, i11, z13);
            case 2:
                int z14 = g6.e.z(parcel);
                String str = null;
                int i12 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        i12 = g6.e.u(parcel, readInt3);
                    } else if (c11 != 2) {
                        g6.e.y(parcel, readInt3);
                    } else {
                        str = g6.e.h(parcel, readInt3);
                    }
                }
                g6.e.m(parcel, z14);
                return new Scope(i12, str);
            default:
                int z15 = g6.e.z(parcel);
                String str2 = null;
                m6.a aVar = null;
                int i13 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z15) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 1) {
                        i13 = g6.e.u(parcel, readInt4);
                    } else if (c12 == 2) {
                        str2 = g6.e.h(parcel, readInt4);
                    } else if (c12 == 3) {
                        pendingIntent = (PendingIntent) g6.e.g(parcel, readInt4, PendingIntent.CREATOR);
                    } else if (c12 != 4) {
                        g6.e.y(parcel, readInt4);
                    } else {
                        aVar = (m6.a) g6.e.g(parcel, readInt4, m6.a.CREATOR);
                    }
                }
                g6.e.m(parcel, z15);
                return new Status(i13, str2, pendingIntent, aVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.a) {
            case 0:
                return new g[i3];
            case 1:
                return new h[i3];
            case 2:
                return new Scope[i3];
            default:
                return new Status[i3];
        }
    }
}
