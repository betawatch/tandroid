package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.vb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class t implements Parcelable.Creator {
    public static final t b = new t(0);
    public final /* synthetic */ int a;

    public /* synthetic */ t(int i7) {
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
                int z9 = vb.z(parcel);
                boolean z10 = false;
                h hVar = null;
                while (parcel.dataPosition() < z9) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        hVar = (h) vb.g(parcel, readInt, h.CREATOR);
                    } else if (c10 != 2) {
                        vb.y(parcel, readInt);
                    } else {
                        z10 = vb.n(parcel, readInt);
                    }
                }
                vb.m(parcel, z9);
                return new g(hVar, z10);
            case 1:
                int z11 = vb.z(parcel);
                int i7 = 0;
                boolean z12 = true;
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 1) {
                        i7 = vb.u(parcel, readInt2);
                    } else if (c11 == 2) {
                        i10 = vb.u(parcel, readInt2);
                    } else if (c11 == 3) {
                        i11 = vb.u(parcel, readInt2);
                    } else if (c11 != 4) {
                        vb.y(parcel, readInt2);
                    } else {
                        z12 = vb.n(parcel, readInt2);
                    }
                }
                vb.m(parcel, z11);
                return new h(i7, i10, i11, z12);
            case 2:
                int z13 = vb.z(parcel);
                String str = null;
                int i12 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 1) {
                        i12 = vb.u(parcel, readInt3);
                    } else if (c12 != 2) {
                        vb.y(parcel, readInt3);
                    } else {
                        str = vb.h(parcel, readInt3);
                    }
                }
                vb.m(parcel, z13);
                return new Scope(i12, str);
            default:
                int z14 = vb.z(parcel);
                String str2 = null;
                n6.a aVar = null;
                int i13 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z14) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 == 1) {
                        i13 = vb.u(parcel, readInt4);
                    } else if (c13 == 2) {
                        str2 = vb.h(parcel, readInt4);
                    } else if (c13 == 3) {
                        pendingIntent = (PendingIntent) vb.g(parcel, readInt4, PendingIntent.CREATOR);
                    } else if (c13 != 4) {
                        vb.y(parcel, readInt4);
                    } else {
                        aVar = (n6.a) vb.g(parcel, readInt4, n6.a.CREATOR);
                    }
                }
                vb.m(parcel, z14);
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
