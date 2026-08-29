package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                int A = ce.b.A(parcel);
                h hVar = null;
                while (parcel.dataPosition() < A) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        ce.b.z(parcel, readInt);
                    } else {
                        hVar = (h) ce.b.h(parcel, readInt, h.CREATOR);
                    }
                }
                ce.b.n(parcel, A);
                return new g(hVar);
            case 1:
                int A2 = ce.b.A(parcel);
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                boolean z10 = true;
                while (parcel.dataPosition() < A2) {
                    int readInt2 = parcel.readInt();
                    char c3 = (char) readInt2;
                    if (c3 == 1) {
                        i10 = ce.b.v(parcel, readInt2);
                    } else if (c3 == 2) {
                        i11 = ce.b.v(parcel, readInt2);
                    } else if (c3 == 3) {
                        i12 = ce.b.v(parcel, readInt2);
                    } else if (c3 != 4) {
                        ce.b.z(parcel, readInt2);
                    } else {
                        z10 = ce.b.o(parcel, readInt2);
                    }
                }
                ce.b.n(parcel, A2);
                return new h(i10, i11, i12, z10);
            case 2:
                int A3 = ce.b.A(parcel);
                String str = null;
                int i13 = 0;
                while (parcel.dataPosition() < A3) {
                    int readInt3 = parcel.readInt();
                    char c6 = (char) readInt3;
                    if (c6 == 1) {
                        i13 = ce.b.v(parcel, readInt3);
                    } else if (c6 != 2) {
                        ce.b.z(parcel, readInt3);
                    } else {
                        str = ce.b.i(parcel, readInt3);
                    }
                }
                ce.b.n(parcel, A3);
                return new Scope(i13, str);
            default:
                int A4 = ce.b.A(parcel);
                String str2 = null;
                PendingIntent pendingIntent = null;
                w5.a aVar = null;
                int i14 = 0;
                while (parcel.dataPosition() < A4) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 == 1) {
                        i14 = ce.b.v(parcel, readInt4);
                    } else if (c10 == 2) {
                        str2 = ce.b.i(parcel, readInt4);
                    } else if (c10 == 3) {
                        pendingIntent = (PendingIntent) ce.b.h(parcel, readInt4, PendingIntent.CREATOR);
                    } else if (c10 != 4) {
                        ce.b.z(parcel, readInt4);
                    } else {
                        aVar = (w5.a) ce.b.h(parcel, readInt4, w5.a.CREATOR);
                    }
                }
                ce.b.n(parcel, A4);
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
