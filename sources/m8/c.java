package m8;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import j7.f5;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z4 = f5.z(parcel);
                String str = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z4) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 2) {
                        str = f5.h(parcel, readInt);
                    } else if (c3 != 3) {
                        f5.y(parcel, readInt);
                    } else {
                        arrayList = f5.l(parcel, readInt, m0.CREATOR);
                    }
                }
                f5.m(parcel, z4);
                return new b(str, arrayList);
            case 1:
                int z10 = f5.z(parcel);
                f fVar = null;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 2) {
                        fVar = (f) f5.g(parcel, readInt2, f.CREATOR);
                    } else if (c10 == 3) {
                        i10 = f5.u(parcel, readInt2);
                    } else if (c10 == 4) {
                        i11 = f5.u(parcel, readInt2);
                    } else if (c10 != 5) {
                        f5.y(parcel, readInt2);
                    } else {
                        i12 = f5.u(parcel, readInt2);
                    }
                }
                f5.m(parcel, z10);
                return new e(fVar, i10, i11, i12);
            case 2:
                int z11 = f5.z(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 2) {
                        str2 = f5.h(parcel, readInt3);
                    } else if (c11 == 3) {
                        str3 = f5.h(parcel, readInt3);
                    } else if (c11 != 4) {
                        f5.y(parcel, readInt3);
                    } else {
                        str4 = f5.h(parcel, readInt3);
                    }
                }
                f5.m(parcel, z11);
                return new f(str2, str3, str4);
            case 3:
                int z12 = f5.z(parcel);
                int i13 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 2) {
                        f5.y(parcel, readInt4);
                    } else {
                        i13 = f5.u(parcel, readInt4);
                    }
                }
                f5.m(parcel, z12);
                return new g(i13);
            case 4:
                int z13 = f5.z(parcel);
                int i14 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        f5.y(parcel, readInt5);
                    } else {
                        i14 = f5.u(parcel, readInt5);
                    }
                }
                f5.m(parcel, z13);
                return new h(i14);
            case 5:
                int z14 = f5.z(parcel);
                int i15 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 2) {
                        f5.y(parcel, readInt6);
                    } else {
                        i15 = f5.u(parcel, readInt6);
                    }
                }
                f5.m(parcel, z14);
                return new i(i15);
            case 6:
                int z15 = f5.z(parcel);
                int i16 = 0;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                while (parcel.dataPosition() < z15) {
                    int readInt7 = parcel.readInt();
                    char c12 = (char) readInt7;
                    if (c12 == 1) {
                        i16 = f5.u(parcel, readInt7);
                    } else if (c12 == 2) {
                        z16 = f5.n(parcel, readInt7);
                    } else if (c12 == 3) {
                        z17 = f5.n(parcel, readInt7);
                    } else if (c12 == 4) {
                        z18 = f5.n(parcel, readInt7);
                    } else if (c12 != 5) {
                        f5.y(parcel, readInt7);
                    } else {
                        z19 = f5.n(parcel, readInt7);
                    }
                }
                f5.m(parcel, z15);
                return new j(i16, z16, z17, z18, z19);
            case 7:
                int z20 = f5.z(parcel);
                String str5 = null;
                String str6 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt8 = parcel.readInt();
                    char c13 = (char) readInt8;
                    if (c13 == 2) {
                        str5 = f5.h(parcel, readInt8);
                    } else if (c13 != 3) {
                        f5.y(parcel, readInt8);
                    } else {
                        str6 = f5.h(parcel, readInt8);
                    }
                }
                f5.m(parcel, z20);
                return new DataItemAssetParcelable(str5, str6);
            case 8:
                int z21 = f5.z(parcel);
                Uri uri = null;
                Bundle bundle = null;
                byte[] bArr = null;
                while (parcel.dataPosition() < z21) {
                    int readInt9 = parcel.readInt();
                    char c14 = (char) readInt9;
                    if (c14 == 2) {
                        uri = (Uri) f5.g(parcel, readInt9, Uri.CREATOR);
                    } else if (c14 == 4) {
                        bundle = f5.a(parcel, readInt9);
                    } else if (c14 != 5) {
                        f5.y(parcel, readInt9);
                    } else {
                        bArr = f5.b(parcel, readInt9);
                    }
                }
                f5.m(parcel, z21);
                return new m(uri, bundle, bArr);
            case 9:
                int z22 = f5.z(parcel);
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < z22) {
                    int readInt10 = parcel.readInt();
                    char c15 = (char) readInt10;
                    if (c15 == 2) {
                        i17 = f5.u(parcel, readInt10);
                    } else if (c15 != 3) {
                        f5.y(parcel, readInt10);
                    } else {
                        i18 = f5.u(parcel, readInt10);
                    }
                }
                f5.m(parcel, z22);
                return new n(i17, i18);
            case 10:
                int z23 = f5.z(parcel);
                int i19 = 0;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt11 = parcel.readInt();
                    char c16 = (char) readInt11;
                    if (c16 == 2) {
                        i19 = f5.u(parcel, readInt11);
                    } else if (c16 != 3) {
                        f5.y(parcel, readInt11);
                    } else {
                        arrayList2 = f5.l(parcel, readInt11, b.CREATOR);
                    }
                }
                f5.m(parcel, z23);
                return new o(i19, arrayList2);
            case 11:
                int z24 = f5.z(parcel);
                int i20 = 0;
                b bVar = null;
                while (parcel.dataPosition() < z24) {
                    int readInt12 = parcel.readInt();
                    char c17 = (char) readInt12;
                    if (c17 == 2) {
                        i20 = f5.u(parcel, readInt12);
                    } else if (c17 != 3) {
                        f5.y(parcel, readInt12);
                    } else {
                        bVar = (b) f5.g(parcel, readInt12, b.CREATOR);
                    }
                }
                f5.m(parcel, z24);
                return new p(i20, bVar);
            case 12:
                int z25 = f5.z(parcel);
                int i21 = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < z25) {
                    int readInt13 = parcel.readInt();
                    char c18 = (char) readInt13;
                    if (c18 == 2) {
                        i21 = f5.u(parcel, readInt13);
                    } else if (c18 != 3) {
                        f5.y(parcel, readInt13);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) f5.g(parcel, readInt13, ParcelFileDescriptor.CREATOR);
                    }
                }
                f5.m(parcel, z25);
                return new q(i21, parcelFileDescriptor);
            case 13:
                int z26 = f5.z(parcel);
                int i22 = 0;
                ParcelFileDescriptor parcelFileDescriptor2 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt14 = parcel.readInt();
                    char c19 = (char) readInt14;
                    if (c19 == 2) {
                        i22 = f5.u(parcel, readInt14);
                    } else if (c19 != 3) {
                        f5.y(parcel, readInt14);
                    } else {
                        parcelFileDescriptor2 = (ParcelFileDescriptor) f5.g(parcel, readInt14, ParcelFileDescriptor.CREATOR);
                    }
                }
                f5.m(parcel, z26);
                return new r(i22, parcelFileDescriptor2);
            case 14:
                int z27 = f5.z(parcel);
                int i23 = 0;
                boolean z28 = false;
                while (parcel.dataPosition() < z27) {
                    int readInt15 = parcel.readInt();
                    char c20 = (char) readInt15;
                    if (c20 == 2) {
                        i23 = f5.u(parcel, readInt15);
                    } else if (c20 != 3) {
                        f5.y(parcel, readInt15);
                    } else {
                        z28 = f5.n(parcel, readInt15);
                    }
                }
                f5.m(parcel, z27);
                return new s(i23, z28);
            case 15:
                int z29 = f5.z(parcel);
                int i24 = 0;
                boolean z30 = false;
                boolean z31 = false;
                while (parcel.dataPosition() < z29) {
                    int readInt16 = parcel.readInt();
                    char c21 = (char) readInt16;
                    if (c21 == 2) {
                        i24 = f5.u(parcel, readInt16);
                    } else if (c21 == 3) {
                        z30 = f5.n(parcel, readInt16);
                    } else if (c21 != 4) {
                        f5.y(parcel, readInt16);
                    } else {
                        z31 = f5.n(parcel, readInt16);
                    }
                }
                f5.m(parcel, z29);
                return new t(i24, z30, z31);
            case 16:
                int z32 = f5.z(parcel);
                int i25 = 0;
                boolean z33 = false;
                while (parcel.dataPosition() < z32) {
                    int readInt17 = parcel.readInt();
                    char c22 = (char) readInt17;
                    if (c22 == 2) {
                        i25 = f5.u(parcel, readInt17);
                    } else if (c22 != 3) {
                        f5.y(parcel, readInt17);
                    } else {
                        z33 = f5.n(parcel, readInt17);
                    }
                }
                f5.m(parcel, z32);
                return new u(i25, z33);
            case 17:
                int z34 = f5.z(parcel);
                int i26 = 0;
                String str7 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt18 = parcel.readInt();
                    char c23 = (char) readInt18;
                    if (c23 == 2) {
                        i26 = f5.u(parcel, readInt18);
                    } else if (c23 != 3) {
                        f5.y(parcel, readInt18);
                    } else {
                        str7 = f5.h(parcel, readInt18);
                    }
                }
                f5.m(parcel, z34);
                return new v(i26, str7);
            case 18:
                int z35 = f5.z(parcel);
                int i27 = 0;
                ConnectionConfiguration connectionConfiguration = null;
                while (parcel.dataPosition() < z35) {
                    int readInt19 = parcel.readInt();
                    char c24 = (char) readInt19;
                    if (c24 == 2) {
                        i27 = f5.u(parcel, readInt19);
                    } else if (c24 != 3) {
                        f5.y(parcel, readInt19);
                    } else {
                        connectionConfiguration = (ConnectionConfiguration) f5.g(parcel, readInt19, ConnectionConfiguration.CREATOR);
                    }
                }
                f5.m(parcel, z35);
                return new w(i27, connectionConfiguration);
            case 19:
                int z36 = f5.z(parcel);
                int i28 = 0;
                ConnectionConfiguration[] connectionConfigurationArr = null;
                while (parcel.dataPosition() < z36) {
                    int readInt20 = parcel.readInt();
                    char c25 = (char) readInt20;
                    if (c25 == 2) {
                        i28 = f5.u(parcel, readInt20);
                    } else if (c25 != 3) {
                        f5.y(parcel, readInt20);
                    } else {
                        connectionConfigurationArr = (ConnectionConfiguration[]) f5.k(parcel, readInt20, ConnectionConfiguration.CREATOR);
                    }
                }
                f5.m(parcel, z36);
                return new x(i28, connectionConfigurationArr);
            case 20:
                int z37 = f5.z(parcel);
                int i29 = 0;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt21 = parcel.readInt();
                    char c26 = (char) readInt21;
                    if (c26 == 2) {
                        i29 = f5.u(parcel, readInt21);
                    } else if (c26 != 3) {
                        f5.y(parcel, readInt21);
                    } else {
                        arrayList3 = f5.l(parcel, readInt21, m0.CREATOR);
                    }
                }
                f5.m(parcel, z37);
                return new y(i29, arrayList3);
            case 21:
                int z38 = f5.z(parcel);
                int i30 = 0;
                m mVar = null;
                while (parcel.dataPosition() < z38) {
                    int readInt22 = parcel.readInt();
                    char c27 = (char) readInt22;
                    if (c27 == 2) {
                        i30 = f5.u(parcel, readInt22);
                    } else if (c27 != 3) {
                        f5.y(parcel, readInt22);
                    } else {
                        mVar = (m) f5.g(parcel, readInt22, m.CREATOR);
                    }
                }
                f5.m(parcel, z38);
                return new z(i30, mVar);
            case 22:
                int z39 = f5.z(parcel);
                int i31 = 0;
                String str8 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt23 = parcel.readInt();
                    char c28 = (char) readInt23;
                    if (c28 == 2) {
                        i31 = f5.u(parcel, readInt23);
                    } else if (c28 != 3) {
                        f5.y(parcel, readInt23);
                    } else {
                        str8 = f5.h(parcel, readInt23);
                    }
                }
                f5.m(parcel, z39);
                return new a0(i31, str8);
            case 23:
                int z40 = f5.z(parcel);
                int i32 = 0;
                ParcelFileDescriptor parcelFileDescriptor3 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt24 = parcel.readInt();
                    char c29 = (char) readInt24;
                    if (c29 == 2) {
                        i32 = f5.u(parcel, readInt24);
                    } else if (c29 != 3) {
                        f5.y(parcel, readInt24);
                    } else {
                        parcelFileDescriptor3 = (ParcelFileDescriptor) f5.g(parcel, readInt24, ParcelFileDescriptor.CREATOR);
                    }
                }
                f5.m(parcel, z40);
                return new b0(i32, parcelFileDescriptor3);
            case 24:
                int z41 = f5.z(parcel);
                int i33 = 0;
                m0 m0Var = null;
                while (parcel.dataPosition() < z41) {
                    int readInt25 = parcel.readInt();
                    char c30 = (char) readInt25;
                    if (c30 == 2) {
                        i33 = f5.u(parcel, readInt25);
                    } else if (c30 != 3) {
                        f5.y(parcel, readInt25);
                    } else {
                        m0Var = (m0) f5.g(parcel, readInt25, m0.CREATOR);
                    }
                }
                f5.m(parcel, z41);
                return new c0(i33, m0Var);
            case 25:
                int z42 = f5.z(parcel);
                int i34 = 0;
                String str9 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt26 = parcel.readInt();
                    char c31 = (char) readInt26;
                    if (c31 == 2) {
                        i34 = f5.u(parcel, readInt26);
                    } else if (c31 != 3) {
                        f5.y(parcel, readInt26);
                    } else {
                        str9 = f5.h(parcel, readInt26);
                    }
                }
                f5.m(parcel, z42);
                return new d0(i34, str9);
            case 26:
                int z43 = f5.z(parcel);
                String str10 = null;
                int i35 = 0;
                int i36 = 0;
                while (parcel.dataPosition() < z43) {
                    int readInt27 = parcel.readInt();
                    char c32 = (char) readInt27;
                    if (c32 == 1) {
                        str10 = f5.h(parcel, readInt27);
                    } else if (c32 == 2) {
                        i35 = f5.u(parcel, readInt27);
                    } else if (c32 != 3) {
                        f5.y(parcel, readInt27);
                    } else {
                        i36 = f5.u(parcel, readInt27);
                    }
                }
                f5.m(parcel, z43);
                return new b1(str10, i35, i36);
            case 27:
                int z44 = f5.z(parcel);
                int i37 = 0;
                String str11 = null;
                byte[] bArr2 = null;
                String str12 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt28 = parcel.readInt();
                    char c33 = (char) readInt28;
                    if (c33 == 2) {
                        i37 = f5.u(parcel, readInt28);
                    } else if (c33 == 3) {
                        str11 = f5.h(parcel, readInt28);
                    } else if (c33 == 4) {
                        bArr2 = f5.b(parcel, readInt28);
                    } else if (c33 != 5) {
                        f5.y(parcel, readInt28);
                    } else {
                        str12 = f5.h(parcel, readInt28);
                    }
                }
                f5.m(parcel, z44);
                return new l0(i37, str11, str12, bArr2);
            case 28:
                int z45 = f5.z(parcel);
                int i38 = 0;
                while (parcel.dataPosition() < z45) {
                    int readInt29 = parcel.readInt();
                    if (((char) readInt29) != 2) {
                        f5.y(parcel, readInt29);
                    } else {
                        i38 = f5.u(parcel, readInt29);
                    }
                }
                f5.m(parcel, z45);
                return new g0(i38);
            default:
                int z46 = f5.z(parcel);
                String str13 = null;
                String str14 = null;
                int i39 = 0;
                boolean z47 = false;
                while (parcel.dataPosition() < z46) {
                    int readInt30 = parcel.readInt();
                    char c34 = (char) readInt30;
                    if (c34 == 2) {
                        str13 = f5.h(parcel, readInt30);
                    } else if (c34 == 3) {
                        str14 = f5.h(parcel, readInt30);
                    } else if (c34 == 4) {
                        i39 = f5.u(parcel, readInt30);
                    } else if (c34 != 5) {
                        f5.y(parcel, readInt30);
                    } else {
                        z47 = f5.n(parcel, readInt30);
                    }
                }
                f5.m(parcel, z46);
                return new m0(i39, str13, str14, z47);
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
                return new b1[i10];
            case 27:
                return new l0[i10];
            case 28:
                return new g0[i10];
            default:
                return new m0[i10];
        }
    }
}
