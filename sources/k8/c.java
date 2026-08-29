package k8;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int A = ce.b.A(parcel);
                String str = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < A) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 2) {
                        str = ce.b.i(parcel, readInt);
                    } else if (c3 != 3) {
                        ce.b.z(parcel, readInt);
                    } else {
                        arrayList = ce.b.m(parcel, readInt, n0.CREATOR);
                    }
                }
                ce.b.n(parcel, A);
                return new b(str, arrayList);
            case 1:
                int A2 = ce.b.A(parcel);
                f fVar = null;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (parcel.dataPosition() < A2) {
                    int readInt2 = parcel.readInt();
                    char c6 = (char) readInt2;
                    if (c6 == 2) {
                        fVar = (f) ce.b.h(parcel, readInt2, f.CREATOR);
                    } else if (c6 == 3) {
                        i10 = ce.b.v(parcel, readInt2);
                    } else if (c6 == 4) {
                        i11 = ce.b.v(parcel, readInt2);
                    } else if (c6 != 5) {
                        ce.b.z(parcel, readInt2);
                    } else {
                        i12 = ce.b.v(parcel, readInt2);
                    }
                }
                ce.b.n(parcel, A2);
                return new e(fVar, i10, i11, i12);
            case 2:
                int A3 = ce.b.A(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < A3) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 2) {
                        str2 = ce.b.i(parcel, readInt3);
                    } else if (c10 == 3) {
                        str3 = ce.b.i(parcel, readInt3);
                    } else if (c10 != 4) {
                        ce.b.z(parcel, readInt3);
                    } else {
                        str4 = ce.b.i(parcel, readInt3);
                    }
                }
                ce.b.n(parcel, A3);
                return new f(str2, str3, str4);
            case 3:
                int A4 = ce.b.A(parcel);
                int i13 = 0;
                while (parcel.dataPosition() < A4) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 2) {
                        ce.b.z(parcel, readInt4);
                    } else {
                        i13 = ce.b.v(parcel, readInt4);
                    }
                }
                ce.b.n(parcel, A4);
                return new g(i13);
            case 4:
                int A5 = ce.b.A(parcel);
                int i14 = 0;
                while (parcel.dataPosition() < A5) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        ce.b.z(parcel, readInt5);
                    } else {
                        i14 = ce.b.v(parcel, readInt5);
                    }
                }
                ce.b.n(parcel, A5);
                return new h(i14);
            case 5:
                int A6 = ce.b.A(parcel);
                int i15 = 0;
                while (parcel.dataPosition() < A6) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 2) {
                        ce.b.z(parcel, readInt6);
                    } else {
                        i15 = ce.b.v(parcel, readInt6);
                    }
                }
                ce.b.n(parcel, A6);
                return new i(i15);
            case 6:
                int A7 = ce.b.A(parcel);
                int i16 = 0;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                while (parcel.dataPosition() < A7) {
                    int readInt7 = parcel.readInt();
                    char c11 = (char) readInt7;
                    if (c11 == 1) {
                        i16 = ce.b.v(parcel, readInt7);
                    } else if (c11 == 2) {
                        z10 = ce.b.o(parcel, readInt7);
                    } else if (c11 == 3) {
                        z11 = ce.b.o(parcel, readInt7);
                    } else if (c11 == 4) {
                        z12 = ce.b.o(parcel, readInt7);
                    } else if (c11 != 5) {
                        ce.b.z(parcel, readInt7);
                    } else {
                        z13 = ce.b.o(parcel, readInt7);
                    }
                }
                ce.b.n(parcel, A7);
                return new j(i16, z10, z11, z12, z13);
            case 7:
                int A8 = ce.b.A(parcel);
                String str5 = null;
                String str6 = null;
                while (parcel.dataPosition() < A8) {
                    int readInt8 = parcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 == 2) {
                        str5 = ce.b.i(parcel, readInt8);
                    } else if (c12 != 3) {
                        ce.b.z(parcel, readInt8);
                    } else {
                        str6 = ce.b.i(parcel, readInt8);
                    }
                }
                ce.b.n(parcel, A8);
                return new DataItemAssetParcelable(str5, str6);
            case 8:
                int A9 = ce.b.A(parcel);
                Uri uri = null;
                Bundle bundle = null;
                byte[] bArr = null;
                while (parcel.dataPosition() < A9) {
                    int readInt9 = parcel.readInt();
                    char c13 = (char) readInt9;
                    if (c13 == 2) {
                        uri = (Uri) ce.b.h(parcel, readInt9, Uri.CREATOR);
                    } else if (c13 == 4) {
                        bundle = ce.b.b(parcel, readInt9);
                    } else if (c13 != 5) {
                        ce.b.z(parcel, readInt9);
                    } else {
                        bArr = ce.b.c(parcel, readInt9);
                    }
                }
                ce.b.n(parcel, A9);
                return new m(uri, bundle, bArr);
            case 9:
                int A10 = ce.b.A(parcel);
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < A10) {
                    int readInt10 = parcel.readInt();
                    char c14 = (char) readInt10;
                    if (c14 == 2) {
                        i17 = ce.b.v(parcel, readInt10);
                    } else if (c14 != 3) {
                        ce.b.z(parcel, readInt10);
                    } else {
                        i18 = ce.b.v(parcel, readInt10);
                    }
                }
                ce.b.n(parcel, A10);
                return new n(i17, i18);
            case 10:
                int A11 = ce.b.A(parcel);
                int i19 = 0;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < A11) {
                    int readInt11 = parcel.readInt();
                    char c15 = (char) readInt11;
                    if (c15 == 2) {
                        i19 = ce.b.v(parcel, readInt11);
                    } else if (c15 != 3) {
                        ce.b.z(parcel, readInt11);
                    } else {
                        arrayList2 = ce.b.m(parcel, readInt11, b.CREATOR);
                    }
                }
                ce.b.n(parcel, A11);
                return new o(i19, arrayList2);
            case 11:
                int A12 = ce.b.A(parcel);
                int i20 = 0;
                b bVar = null;
                while (parcel.dataPosition() < A12) {
                    int readInt12 = parcel.readInt();
                    char c16 = (char) readInt12;
                    if (c16 == 2) {
                        i20 = ce.b.v(parcel, readInt12);
                    } else if (c16 != 3) {
                        ce.b.z(parcel, readInt12);
                    } else {
                        bVar = (b) ce.b.h(parcel, readInt12, b.CREATOR);
                    }
                }
                ce.b.n(parcel, A12);
                return new p(i20, bVar);
            case 12:
                int A13 = ce.b.A(parcel);
                int i21 = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < A13) {
                    int readInt13 = parcel.readInt();
                    char c17 = (char) readInt13;
                    if (c17 == 2) {
                        i21 = ce.b.v(parcel, readInt13);
                    } else if (c17 != 3) {
                        ce.b.z(parcel, readInt13);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) ce.b.h(parcel, readInt13, ParcelFileDescriptor.CREATOR);
                    }
                }
                ce.b.n(parcel, A13);
                return new q(i21, parcelFileDescriptor);
            case 13:
                int A14 = ce.b.A(parcel);
                int i22 = 0;
                ParcelFileDescriptor parcelFileDescriptor2 = null;
                while (parcel.dataPosition() < A14) {
                    int readInt14 = parcel.readInt();
                    char c18 = (char) readInt14;
                    if (c18 == 2) {
                        i22 = ce.b.v(parcel, readInt14);
                    } else if (c18 != 3) {
                        ce.b.z(parcel, readInt14);
                    } else {
                        parcelFileDescriptor2 = (ParcelFileDescriptor) ce.b.h(parcel, readInt14, ParcelFileDescriptor.CREATOR);
                    }
                }
                ce.b.n(parcel, A14);
                return new r(i22, parcelFileDescriptor2);
            case 14:
                int A15 = ce.b.A(parcel);
                int i23 = 0;
                boolean z14 = false;
                while (parcel.dataPosition() < A15) {
                    int readInt15 = parcel.readInt();
                    char c19 = (char) readInt15;
                    if (c19 == 2) {
                        i23 = ce.b.v(parcel, readInt15);
                    } else if (c19 != 3) {
                        ce.b.z(parcel, readInt15);
                    } else {
                        z14 = ce.b.o(parcel, readInt15);
                    }
                }
                ce.b.n(parcel, A15);
                return new s(i23, z14);
            case 15:
                int A16 = ce.b.A(parcel);
                int i24 = 0;
                boolean z15 = false;
                boolean z16 = false;
                while (parcel.dataPosition() < A16) {
                    int readInt16 = parcel.readInt();
                    char c20 = (char) readInt16;
                    if (c20 == 2) {
                        i24 = ce.b.v(parcel, readInt16);
                    } else if (c20 == 3) {
                        z15 = ce.b.o(parcel, readInt16);
                    } else if (c20 != 4) {
                        ce.b.z(parcel, readInt16);
                    } else {
                        z16 = ce.b.o(parcel, readInt16);
                    }
                }
                ce.b.n(parcel, A16);
                return new t(i24, z15, z16);
            case 16:
                int A17 = ce.b.A(parcel);
                int i25 = 0;
                boolean z17 = false;
                while (parcel.dataPosition() < A17) {
                    int readInt17 = parcel.readInt();
                    char c21 = (char) readInt17;
                    if (c21 == 2) {
                        i25 = ce.b.v(parcel, readInt17);
                    } else if (c21 != 3) {
                        ce.b.z(parcel, readInt17);
                    } else {
                        z17 = ce.b.o(parcel, readInt17);
                    }
                }
                ce.b.n(parcel, A17);
                return new u(i25, z17);
            case 17:
                int A18 = ce.b.A(parcel);
                int i26 = 0;
                String str7 = null;
                while (parcel.dataPosition() < A18) {
                    int readInt18 = parcel.readInt();
                    char c22 = (char) readInt18;
                    if (c22 == 2) {
                        i26 = ce.b.v(parcel, readInt18);
                    } else if (c22 != 3) {
                        ce.b.z(parcel, readInt18);
                    } else {
                        str7 = ce.b.i(parcel, readInt18);
                    }
                }
                ce.b.n(parcel, A18);
                return new v(i26, str7);
            case 18:
                int A19 = ce.b.A(parcel);
                int i27 = 0;
                ConnectionConfiguration connectionConfiguration = null;
                while (parcel.dataPosition() < A19) {
                    int readInt19 = parcel.readInt();
                    char c23 = (char) readInt19;
                    if (c23 == 2) {
                        i27 = ce.b.v(parcel, readInt19);
                    } else if (c23 != 3) {
                        ce.b.z(parcel, readInt19);
                    } else {
                        connectionConfiguration = (ConnectionConfiguration) ce.b.h(parcel, readInt19, ConnectionConfiguration.CREATOR);
                    }
                }
                ce.b.n(parcel, A19);
                return new w(i27, connectionConfiguration);
            case 19:
                int A20 = ce.b.A(parcel);
                int i28 = 0;
                ConnectionConfiguration[] connectionConfigurationArr = null;
                while (parcel.dataPosition() < A20) {
                    int readInt20 = parcel.readInt();
                    char c24 = (char) readInt20;
                    if (c24 == 2) {
                        i28 = ce.b.v(parcel, readInt20);
                    } else if (c24 != 3) {
                        ce.b.z(parcel, readInt20);
                    } else {
                        connectionConfigurationArr = (ConnectionConfiguration[]) ce.b.l(parcel, readInt20, ConnectionConfiguration.CREATOR);
                    }
                }
                ce.b.n(parcel, A20);
                return new x(i28, connectionConfigurationArr);
            case 20:
                int A21 = ce.b.A(parcel);
                int i29 = 0;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < A21) {
                    int readInt21 = parcel.readInt();
                    char c25 = (char) readInt21;
                    if (c25 == 2) {
                        i29 = ce.b.v(parcel, readInt21);
                    } else if (c25 != 3) {
                        ce.b.z(parcel, readInt21);
                    } else {
                        arrayList3 = ce.b.m(parcel, readInt21, n0.CREATOR);
                    }
                }
                ce.b.n(parcel, A21);
                return new y(i29, arrayList3);
            case 21:
                int A22 = ce.b.A(parcel);
                int i30 = 0;
                m mVar = null;
                while (parcel.dataPosition() < A22) {
                    int readInt22 = parcel.readInt();
                    char c26 = (char) readInt22;
                    if (c26 == 2) {
                        i30 = ce.b.v(parcel, readInt22);
                    } else if (c26 != 3) {
                        ce.b.z(parcel, readInt22);
                    } else {
                        mVar = (m) ce.b.h(parcel, readInt22, m.CREATOR);
                    }
                }
                ce.b.n(parcel, A22);
                return new z(i30, mVar);
            case 22:
                int A23 = ce.b.A(parcel);
                int i31 = 0;
                String str8 = null;
                while (parcel.dataPosition() < A23) {
                    int readInt23 = parcel.readInt();
                    char c27 = (char) readInt23;
                    if (c27 == 2) {
                        i31 = ce.b.v(parcel, readInt23);
                    } else if (c27 != 3) {
                        ce.b.z(parcel, readInt23);
                    } else {
                        str8 = ce.b.i(parcel, readInt23);
                    }
                }
                ce.b.n(parcel, A23);
                return new a0(i31, str8);
            case 23:
                int A24 = ce.b.A(parcel);
                int i32 = 0;
                ParcelFileDescriptor parcelFileDescriptor3 = null;
                while (parcel.dataPosition() < A24) {
                    int readInt24 = parcel.readInt();
                    char c28 = (char) readInt24;
                    if (c28 == 2) {
                        i32 = ce.b.v(parcel, readInt24);
                    } else if (c28 != 3) {
                        ce.b.z(parcel, readInt24);
                    } else {
                        parcelFileDescriptor3 = (ParcelFileDescriptor) ce.b.h(parcel, readInt24, ParcelFileDescriptor.CREATOR);
                    }
                }
                ce.b.n(parcel, A24);
                return new b0(i32, parcelFileDescriptor3);
            case 24:
                int A25 = ce.b.A(parcel);
                int i33 = 0;
                n0 n0Var = null;
                while (parcel.dataPosition() < A25) {
                    int readInt25 = parcel.readInt();
                    char c29 = (char) readInt25;
                    if (c29 == 2) {
                        i33 = ce.b.v(parcel, readInt25);
                    } else if (c29 != 3) {
                        ce.b.z(parcel, readInt25);
                    } else {
                        n0Var = (n0) ce.b.h(parcel, readInt25, n0.CREATOR);
                    }
                }
                ce.b.n(parcel, A25);
                return new c0(i33, n0Var);
            case 25:
                int A26 = ce.b.A(parcel);
                int i34 = 0;
                String str9 = null;
                while (parcel.dataPosition() < A26) {
                    int readInt26 = parcel.readInt();
                    char c30 = (char) readInt26;
                    if (c30 == 2) {
                        i34 = ce.b.v(parcel, readInt26);
                    } else if (c30 != 3) {
                        ce.b.z(parcel, readInt26);
                    } else {
                        str9 = ce.b.i(parcel, readInt26);
                    }
                }
                ce.b.n(parcel, A26);
                return new d0(i34, str9);
            case 26:
                int A27 = ce.b.A(parcel);
                String str10 = null;
                int i35 = 0;
                int i36 = 0;
                while (parcel.dataPosition() < A27) {
                    int readInt27 = parcel.readInt();
                    char c31 = (char) readInt27;
                    if (c31 == 1) {
                        str10 = ce.b.i(parcel, readInt27);
                    } else if (c31 == 2) {
                        i35 = ce.b.v(parcel, readInt27);
                    } else if (c31 != 3) {
                        ce.b.z(parcel, readInt27);
                    } else {
                        i36 = ce.b.v(parcel, readInt27);
                    }
                }
                ce.b.n(parcel, A27);
                return new c1(str10, i35, i36);
            case 27:
                int A28 = ce.b.A(parcel);
                int i37 = 0;
                String str11 = null;
                byte[] bArr2 = null;
                String str12 = null;
                while (parcel.dataPosition() < A28) {
                    int readInt28 = parcel.readInt();
                    char c32 = (char) readInt28;
                    if (c32 == 2) {
                        i37 = ce.b.v(parcel, readInt28);
                    } else if (c32 == 3) {
                        str11 = ce.b.i(parcel, readInt28);
                    } else if (c32 == 4) {
                        bArr2 = ce.b.c(parcel, readInt28);
                    } else if (c32 != 5) {
                        ce.b.z(parcel, readInt28);
                    } else {
                        str12 = ce.b.i(parcel, readInt28);
                    }
                }
                ce.b.n(parcel, A28);
                return new m0(i37, str11, str12, bArr2);
            case 28:
                int A29 = ce.b.A(parcel);
                int i38 = 0;
                while (parcel.dataPosition() < A29) {
                    int readInt29 = parcel.readInt();
                    if (((char) readInt29) != 2) {
                        ce.b.z(parcel, readInt29);
                    } else {
                        i38 = ce.b.v(parcel, readInt29);
                    }
                }
                ce.b.n(parcel, A29);
                return new g0(i38);
            default:
                int A30 = ce.b.A(parcel);
                String str13 = null;
                String str14 = null;
                int i39 = 0;
                boolean z18 = false;
                while (parcel.dataPosition() < A30) {
                    int readInt30 = parcel.readInt();
                    char c33 = (char) readInt30;
                    if (c33 == 2) {
                        str13 = ce.b.i(parcel, readInt30);
                    } else if (c33 == 3) {
                        str14 = ce.b.i(parcel, readInt30);
                    } else if (c33 == 4) {
                        i39 = ce.b.v(parcel, readInt30);
                    } else if (c33 != 5) {
                        ce.b.z(parcel, readInt30);
                    } else {
                        z18 = ce.b.o(parcel, readInt30);
                    }
                }
                ce.b.n(parcel, A30);
                return new n0(i39, str13, str14, z18);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new b[i10];
            case 1:
                return new e[i10];
            case 2:
                return new f[i10];
            case 3:
                return new g[i10];
            case 4:
                return new h[i10];
            case 5:
                return new i[i10];
            case 6:
                return new j[i10];
            case 7:
                return new DataItemAssetParcelable[i10];
            case 8:
                return new m[i10];
            case 9:
                return new n[i10];
            case 10:
                return new o[i10];
            case 11:
                return new p[i10];
            case 12:
                return new q[i10];
            case 13:
                return new r[i10];
            case 14:
                return new s[i10];
            case 15:
                return new t[i10];
            case 16:
                return new u[i10];
            case 17:
                return new v[i10];
            case 18:
                return new w[i10];
            case 19:
                return new x[i10];
            case 20:
                return new y[i10];
            case 21:
                return new z[i10];
            case 22:
                return new a0[i10];
            case 23:
                return new b0[i10];
            case 24:
                return new c0[i10];
            case 25:
                return new d0[i10];
            case 26:
                return new c1[i10];
            case 27:
                return new m0[i10];
            case 28:
                return new g0[i10];
            default:
                return new n0[i10];
        }
    }
}
