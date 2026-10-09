package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class t implements Parcelable.Creator {
    public static final t b = new t(0);
    public final /* synthetic */ int a;

    public /* synthetic */ t(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int dataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(dataPosition - 4);
                    return g.b;
                }
                int z10 = c0.z(parcel);
                h hVar = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        c0.y(parcel, readInt);
                    } else {
                        hVar = (h) c0.g(parcel, readInt, h.CREATOR);
                    }
                }
                c0.m(parcel, z10);
                return new g(hVar);
            case 1:
                int z11 = c0.z(parcel);
                int i10 = 0;
                boolean z12 = true;
                int i11 = 0;
                int i12 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 1) {
                        i10 = c0.u(parcel, readInt2);
                    } else if (c10 == 2) {
                        i11 = c0.u(parcel, readInt2);
                    } else if (c10 == 3) {
                        i12 = c0.u(parcel, readInt2);
                    } else if (c10 != 4) {
                        c0.y(parcel, readInt2);
                    } else {
                        z12 = c0.n(parcel, readInt2);
                    }
                }
                c0.m(parcel, z11);
                return new h(i10, i11, i12, z12);
            case 2:
                int z13 = c0.z(parcel);
                String str = null;
                int i13 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        i13 = c0.u(parcel, readInt3);
                    } else if (c11 != 2) {
                        c0.y(parcel, readInt3);
                    } else {
                        str = c0.h(parcel, readInt3);
                    }
                }
                c0.m(parcel, z13);
                return new Scope(i13, str);
            default:
                int z14 = c0.z(parcel);
                String str2 = null;
                k6.a aVar = null;
                int i14 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z14) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 1) {
                        i14 = c0.u(parcel, readInt4);
                    } else if (c12 == 2) {
                        str2 = c0.h(parcel, readInt4);
                    } else if (c12 == 3) {
                        pendingIntent = (PendingIntent) c0.g(parcel, readInt4, PendingIntent.CREATOR);
                    } else if (c12 != 4) {
                        c0.y(parcel, readInt4);
                    } else {
                        aVar = (k6.a) c0.g(parcel, readInt4, k6.a.CREATOR);
                    }
                }
                c0.m(parcel, z14);
                return new Status(i14, str2, pendingIntent, aVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new g[i10];
            case 1:
                return new h[i10];
            case 2:
                return new Scope[i10];
            default:
                return new Status[i10];
        }
    }
}
