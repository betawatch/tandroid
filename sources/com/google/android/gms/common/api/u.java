package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class u implements Parcelable.Creator {
    public static final u b = new u(0);
    public final /* synthetic */ int a;

    public /* synthetic */ u(int i7) {
        this.a = i7;
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
                int z10 = xb.z(parcel);
                boolean z11 = false;
                h hVar = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        hVar = (h) xb.g(parcel, readInt, h.CREATOR);
                    } else if (c10 != 2) {
                        xb.y(parcel, readInt);
                    } else {
                        z11 = xb.n(parcel, readInt);
                    }
                }
                xb.m(parcel, z10);
                return new g(hVar, z11);
            case 1:
                int z12 = xb.z(parcel);
                int i7 = 0;
                boolean z13 = true;
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 1) {
                        i7 = xb.u(parcel, readInt2);
                    } else if (c11 == 2) {
                        i10 = xb.u(parcel, readInt2);
                    } else if (c11 == 3) {
                        i11 = xb.u(parcel, readInt2);
                    } else if (c11 != 4) {
                        xb.y(parcel, readInt2);
                    } else {
                        z13 = xb.n(parcel, readInt2);
                    }
                }
                xb.m(parcel, z12);
                return new h(i7, i10, i11, z13);
            case 2:
                int z14 = xb.z(parcel);
                String str = null;
                int i12 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 1) {
                        i12 = xb.u(parcel, readInt3);
                    } else if (c12 != 2) {
                        xb.y(parcel, readInt3);
                    } else {
                        str = xb.h(parcel, readInt3);
                    }
                }
                xb.m(parcel, z14);
                return new Scope(i12, str);
            default:
                int z15 = xb.z(parcel);
                String str2 = null;
                n6.a aVar = null;
                int i13 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z15) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 == 1) {
                        i13 = xb.u(parcel, readInt4);
                    } else if (c13 == 2) {
                        str2 = xb.h(parcel, readInt4);
                    } else if (c13 == 3) {
                        pendingIntent = (PendingIntent) xb.g(parcel, readInt4, PendingIntent.CREATOR);
                    } else if (c13 != 4) {
                        xb.y(parcel, readInt4);
                    } else {
                        aVar = (n6.a) xb.g(parcel, readInt4, n6.a.CREATOR);
                    }
                }
                xb.m(parcel, z15);
                return new Status(i13, str2, pendingIntent, aVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new g[i7];
            case 1:
                return new h[i7];
            case 2:
                return new Scope[i7];
            default:
                return new Status[i7];
        }
    }
}
