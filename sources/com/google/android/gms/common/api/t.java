package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import g7.o8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t implements Parcelable.Creator {
    public static final t b = new t(0);
    public final /* synthetic */ int a;

    public /* synthetic */ t(int i9) {
        this.a = i9;
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
                int z10 = o8.z(parcel);
                h hVar = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        o8.y(parcel, readInt);
                    } else {
                        hVar = (h) o8.g(parcel, readInt, h.CREATOR);
                    }
                }
                o8.m(parcel, z10);
                return new g(hVar);
            case 1:
                int z11 = o8.z(parcel);
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                boolean z12 = true;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 1) {
                        i9 = o8.u(parcel, readInt2);
                    } else if (c10 == 2) {
                        i10 = o8.u(parcel, readInt2);
                    } else if (c10 == 3) {
                        i11 = o8.u(parcel, readInt2);
                    } else if (c10 != 4) {
                        o8.y(parcel, readInt2);
                    } else {
                        z12 = o8.n(parcel, readInt2);
                    }
                }
                o8.m(parcel, z11);
                return new h(i9, i10, i11, z12);
            case 2:
                int z13 = o8.z(parcel);
                String str = null;
                int i12 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        i12 = o8.u(parcel, readInt3);
                    } else if (c11 != 2) {
                        o8.y(parcel, readInt3);
                    } else {
                        str = o8.h(parcel, readInt3);
                    }
                }
                o8.m(parcel, z13);
                return new Scope(i12, str);
            default:
                int z14 = o8.z(parcel);
                String str2 = null;
                PendingIntent pendingIntent = null;
                u5.a aVar = null;
                int i13 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 1) {
                        i13 = o8.u(parcel, readInt4);
                    } else if (c12 == 2) {
                        str2 = o8.h(parcel, readInt4);
                    } else if (c12 == 3) {
                        pendingIntent = (PendingIntent) o8.g(parcel, readInt4, PendingIntent.CREATOR);
                    } else if (c12 != 4) {
                        o8.y(parcel, readInt4);
                    } else {
                        aVar = (u5.a) o8.g(parcel, readInt4, u5.a.CREATOR);
                    }
                }
                o8.m(parcel, z14);
                return new Status(i13, str2, pendingIntent, aVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        switch (this.a) {
            case 0:
                return new g[i9];
            case 1:
                return new h[i9];
            case 2:
                return new Scope[i9];
            default:
                return new Status[i9];
        }
    }
}
