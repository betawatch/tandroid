package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import j7.l0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                int z4 = l0.z(parcel);
                h hVar = null;
                while (parcel.dataPosition() < z4) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        l0.y(parcel, readInt);
                    } else {
                        hVar = (h) l0.g(parcel, readInt, h.CREATOR);
                    }
                }
                l0.m(parcel, z4);
                return new g(hVar);
            case 1:
                int z10 = l0.z(parcel);
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                boolean z11 = true;
                while (parcel.dataPosition() < z10) {
                    int readInt2 = parcel.readInt();
                    char c3 = (char) readInt2;
                    if (c3 == 1) {
                        i10 = l0.u(parcel, readInt2);
                    } else if (c3 == 2) {
                        i11 = l0.u(parcel, readInt2);
                    } else if (c3 == 3) {
                        i12 = l0.u(parcel, readInt2);
                    } else if (c3 != 4) {
                        l0.y(parcel, readInt2);
                    } else {
                        z11 = l0.n(parcel, readInt2);
                    }
                }
                l0.m(parcel, z10);
                return new h(i10, i11, i12, z11);
            case 2:
                int z12 = l0.z(parcel);
                String str = null;
                int i13 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        i13 = l0.u(parcel, readInt3);
                    } else if (c10 != 2) {
                        l0.y(parcel, readInt3);
                    } else {
                        str = l0.h(parcel, readInt3);
                    }
                }
                l0.m(parcel, z12);
                return new Scope(i13, str);
            default:
                int z13 = l0.z(parcel);
                String str2 = null;
                PendingIntent pendingIntent = null;
                y5.a aVar = null;
                int i14 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        i14 = l0.u(parcel, readInt4);
                    } else if (c11 == 2) {
                        str2 = l0.h(parcel, readInt4);
                    } else if (c11 == 3) {
                        pendingIntent = (PendingIntent) l0.g(parcel, readInt4, PendingIntent.CREATOR);
                    } else if (c11 != 4) {
                        l0.y(parcel, readInt4);
                    } else {
                        aVar = (y5.a) l0.g(parcel, readInt4, y5.a.CREATOR);
                    }
                }
                l0.m(parcel, z13);
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
