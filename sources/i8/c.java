package i8;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import g7.o8;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = o8.z(parcel);
                String str = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        str = o8.h(parcel, readInt);
                    } else if (c10 != 3) {
                        o8.y(parcel, readInt);
                    } else {
                        arrayList = o8.l(parcel, readInt, n0.CREATOR);
                    }
                }
                o8.m(parcel, z10);
                return new b(str, arrayList);
            case 1:
                int z11 = o8.z(parcel);
                f fVar = null;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 2) {
                        fVar = (f) o8.g(parcel, readInt2, f.CREATOR);
                    } else if (c11 == 3) {
                        i9 = o8.u(parcel, readInt2);
                    } else if (c11 == 4) {
                        i10 = o8.u(parcel, readInt2);
                    } else if (c11 != 5) {
                        o8.y(parcel, readInt2);
                    } else {
                        i11 = o8.u(parcel, readInt2);
                    }
                }
                o8.m(parcel, z11);
                return new e(fVar, i9, i10, i11);
            case 2:
                int z12 = o8.z(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 2) {
                        str2 = o8.h(parcel, readInt3);
                    } else if (c12 == 3) {
                        str3 = o8.h(parcel, readInt3);
                    } else if (c12 != 4) {
                        o8.y(parcel, readInt3);
                    } else {
                        str4 = o8.h(parcel, readInt3);
                    }
                }
                o8.m(parcel, z12);
                return new f(str2, str3, str4);
            case 3:
                int z13 = o8.z(parcel);
                int i12 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 2) {
                        o8.y(parcel, readInt4);
                    } else {
                        i12 = o8.u(parcel, readInt4);
                    }
                }
                o8.m(parcel, z13);
                return new g(i12);
            case 4:
                int z14 = o8.z(parcel);
                int i13 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        o8.y(parcel, readInt5);
                    } else {
                        i13 = o8.u(parcel, readInt5);
                    }
                }
                o8.m(parcel, z14);
                return new h(i13);
            case 5:
                int z15 = o8.z(parcel);
                int i14 = 0;
                while (parcel.dataPosition() < z15) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 2) {
                        o8.y(parcel, readInt6);
                    } else {
                        i14 = o8.u(parcel, readInt6);
                    }
                }
                o8.m(parcel, z15);
                return new i(i14);
            case 6:
                int z16 = o8.z(parcel);
                int i15 = 0;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                while (parcel.dataPosition() < z16) {
                    int readInt7 = parcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 == 1) {
                        i15 = o8.u(parcel, readInt7);
                    } else if (c13 == 2) {
                        z17 = o8.n(parcel, readInt7);
                    } else if (c13 == 3) {
                        z18 = o8.n(parcel, readInt7);
                    } else if (c13 == 4) {
                        z19 = o8.n(parcel, readInt7);
                    } else if (c13 != 5) {
                        o8.y(parcel, readInt7);
                    } else {
                        z20 = o8.n(parcel, readInt7);
                    }
                }
                o8.m(parcel, z16);
                return new j(i15, z17, z18, z19, z20);
            case 7:
                int z21 = o8.z(parcel);
                String str5 = null;
                String str6 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt8 = parcel.readInt();
                    char c14 = (char) readInt8;
                    if (c14 == 2) {
                        str5 = o8.h(parcel, readInt8);
                    } else if (c14 != 3) {
                        o8.y(parcel, readInt8);
                    } else {
                        str6 = o8.h(parcel, readInt8);
                    }
                }
                o8.m(parcel, z21);
                return new DataItemAssetParcelable(str5, str6);
            case 8:
                int z22 = o8.z(parcel);
                Uri uri = null;
                Bundle bundle = null;
                byte[] bArr = null;
                while (parcel.dataPosition() < z22) {
                    int readInt9 = parcel.readInt();
                    char c15 = (char) readInt9;
                    if (c15 == 2) {
                        uri = (Uri) o8.g(parcel, readInt9, Uri.CREATOR);
                    } else if (c15 == 4) {
                        bundle = o8.a(parcel, readInt9);
                    } else if (c15 != 5) {
                        o8.y(parcel, readInt9);
                    } else {
                        bArr = o8.b(parcel, readInt9);
                    }
                }
                o8.m(parcel, z22);
                return new m(uri, bundle, bArr);
            case 9:
                int z23 = o8.z(parcel);
                int i16 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < z23) {
                    int readInt10 = parcel.readInt();
                    char c16 = (char) readInt10;
                    if (c16 == 2) {
                        i16 = o8.u(parcel, readInt10);
                    } else if (c16 != 3) {
                        o8.y(parcel, readInt10);
                    } else {
                        i17 = o8.u(parcel, readInt10);
                    }
                }
                o8.m(parcel, z23);
                return new n(i16, i17);
            case 10:
                int z24 = o8.z(parcel);
                int i18 = 0;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt11 = parcel.readInt();
                    char c17 = (char) readInt11;
                    if (c17 == 2) {
                        i18 = o8.u(parcel, readInt11);
                    } else if (c17 != 3) {
                        o8.y(parcel, readInt11);
                    } else {
                        arrayList2 = o8.l(parcel, readInt11, b.CREATOR);
                    }
                }
                o8.m(parcel, z24);
                return new o(i18, arrayList2);
            case 11:
                int z25 = o8.z(parcel);
                int i19 = 0;
                b bVar = null;
                while (parcel.dataPosition() < z25) {
                    int readInt12 = parcel.readInt();
                    char c18 = (char) readInt12;
                    if (c18 == 2) {
                        i19 = o8.u(parcel, readInt12);
                    } else if (c18 != 3) {
                        o8.y(parcel, readInt12);
                    } else {
                        bVar = (b) o8.g(parcel, readInt12, b.CREATOR);
                    }
                }
                o8.m(parcel, z25);
                return new p(i19, bVar);
            case 12:
                int z26 = o8.z(parcel);
                int i20 = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < z26) {
                    int readInt13 = parcel.readInt();
                    char c19 = (char) readInt13;
                    if (c19 == 2) {
                        i20 = o8.u(parcel, readInt13);
                    } else if (c19 != 3) {
                        o8.y(parcel, readInt13);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) o8.g(parcel, readInt13, ParcelFileDescriptor.CREATOR);
                    }
                }
                o8.m(parcel, z26);
                return new q(i20, parcelFileDescriptor);
            case 13:
                int z27 = o8.z(parcel);
                int i21 = 0;
                ParcelFileDescriptor parcelFileDescriptor2 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt14 = parcel.readInt();
                    char c20 = (char) readInt14;
                    if (c20 == 2) {
                        i21 = o8.u(parcel, readInt14);
                    } else if (c20 != 3) {
                        o8.y(parcel, readInt14);
                    } else {
                        parcelFileDescriptor2 = (ParcelFileDescriptor) o8.g(parcel, readInt14, ParcelFileDescriptor.CREATOR);
                    }
                }
                o8.m(parcel, z27);
                return new r(i21, parcelFileDescriptor2);
            case 14:
                int z28 = o8.z(parcel);
                int i22 = 0;
                boolean z29 = false;
                while (parcel.dataPosition() < z28) {
                    int readInt15 = parcel.readInt();
                    char c21 = (char) readInt15;
                    if (c21 == 2) {
                        i22 = o8.u(parcel, readInt15);
                    } else if (c21 != 3) {
                        o8.y(parcel, readInt15);
                    } else {
                        z29 = o8.n(parcel, readInt15);
                    }
                }
                o8.m(parcel, z28);
                return new s(i22, z29);
            case 15:
                int z30 = o8.z(parcel);
                int i23 = 0;
                boolean z31 = false;
                boolean z32 = false;
                while (parcel.dataPosition() < z30) {
                    int readInt16 = parcel.readInt();
                    char c22 = (char) readInt16;
                    if (c22 == 2) {
                        i23 = o8.u(parcel, readInt16);
                    } else if (c22 == 3) {
                        z31 = o8.n(parcel, readInt16);
                    } else if (c22 != 4) {
                        o8.y(parcel, readInt16);
                    } else {
                        z32 = o8.n(parcel, readInt16);
                    }
                }
                o8.m(parcel, z30);
                return new t(i23, z31, z32);
            case 16:
                int z33 = o8.z(parcel);
                int i24 = 0;
                boolean z34 = false;
                while (parcel.dataPosition() < z33) {
                    int readInt17 = parcel.readInt();
                    char c23 = (char) readInt17;
                    if (c23 == 2) {
                        i24 = o8.u(parcel, readInt17);
                    } else if (c23 != 3) {
                        o8.y(parcel, readInt17);
                    } else {
                        z34 = o8.n(parcel, readInt17);
                    }
                }
                o8.m(parcel, z33);
                return new u(i24, z34);
            case 17:
                int z35 = o8.z(parcel);
                int i25 = 0;
                String str7 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt18 = parcel.readInt();
                    char c24 = (char) readInt18;
                    if (c24 == 2) {
                        i25 = o8.u(parcel, readInt18);
                    } else if (c24 != 3) {
                        o8.y(parcel, readInt18);
                    } else {
                        str7 = o8.h(parcel, readInt18);
                    }
                }
                o8.m(parcel, z35);
                return new v(i25, str7);
            case 18:
                int z36 = o8.z(parcel);
                int i26 = 0;
                ConnectionConfiguration connectionConfiguration = null;
                while (parcel.dataPosition() < z36) {
                    int readInt19 = parcel.readInt();
                    char c25 = (char) readInt19;
                    if (c25 == 2) {
                        i26 = o8.u(parcel, readInt19);
                    } else if (c25 != 3) {
                        o8.y(parcel, readInt19);
                    } else {
                        connectionConfiguration = (ConnectionConfiguration) o8.g(parcel, readInt19, ConnectionConfiguration.CREATOR);
                    }
                }
                o8.m(parcel, z36);
                return new w(i26, connectionConfiguration);
            case 19:
                int z37 = o8.z(parcel);
                int i27 = 0;
                ConnectionConfiguration[] connectionConfigurationArr = null;
                while (parcel.dataPosition() < z37) {
                    int readInt20 = parcel.readInt();
                    char c26 = (char) readInt20;
                    if (c26 == 2) {
                        i27 = o8.u(parcel, readInt20);
                    } else if (c26 != 3) {
                        o8.y(parcel, readInt20);
                    } else {
                        connectionConfigurationArr = (ConnectionConfiguration[]) o8.k(parcel, readInt20, ConnectionConfiguration.CREATOR);
                    }
                }
                o8.m(parcel, z37);
                return new x(i27, connectionConfigurationArr);
            case 20:
                int z38 = o8.z(parcel);
                int i28 = 0;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt21 = parcel.readInt();
                    char c27 = (char) readInt21;
                    if (c27 == 2) {
                        i28 = o8.u(parcel, readInt21);
                    } else if (c27 != 3) {
                        o8.y(parcel, readInt21);
                    } else {
                        arrayList3 = o8.l(parcel, readInt21, n0.CREATOR);
                    }
                }
                o8.m(parcel, z38);
                return new y(i28, arrayList3);
            case 21:
                int z39 = o8.z(parcel);
                int i29 = 0;
                m mVar = null;
                while (parcel.dataPosition() < z39) {
                    int readInt22 = parcel.readInt();
                    char c28 = (char) readInt22;
                    if (c28 == 2) {
                        i29 = o8.u(parcel, readInt22);
                    } else if (c28 != 3) {
                        o8.y(parcel, readInt22);
                    } else {
                        mVar = (m) o8.g(parcel, readInt22, m.CREATOR);
                    }
                }
                o8.m(parcel, z39);
                return new z(i29, mVar);
            case 22:
                int z40 = o8.z(parcel);
                int i30 = 0;
                String str8 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt23 = parcel.readInt();
                    char c29 = (char) readInt23;
                    if (c29 == 2) {
                        i30 = o8.u(parcel, readInt23);
                    } else if (c29 != 3) {
                        o8.y(parcel, readInt23);
                    } else {
                        str8 = o8.h(parcel, readInt23);
                    }
                }
                o8.m(parcel, z40);
                return new a0(i30, str8);
            case 23:
                int z41 = o8.z(parcel);
                int i31 = 0;
                ParcelFileDescriptor parcelFileDescriptor3 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt24 = parcel.readInt();
                    char c30 = (char) readInt24;
                    if (c30 == 2) {
                        i31 = o8.u(parcel, readInt24);
                    } else if (c30 != 3) {
                        o8.y(parcel, readInt24);
                    } else {
                        parcelFileDescriptor3 = (ParcelFileDescriptor) o8.g(parcel, readInt24, ParcelFileDescriptor.CREATOR);
                    }
                }
                o8.m(parcel, z41);
                return new b0(i31, parcelFileDescriptor3);
            case 24:
                int z42 = o8.z(parcel);
                int i32 = 0;
                n0 n0Var = null;
                while (parcel.dataPosition() < z42) {
                    int readInt25 = parcel.readInt();
                    char c31 = (char) readInt25;
                    if (c31 == 2) {
                        i32 = o8.u(parcel, readInt25);
                    } else if (c31 != 3) {
                        o8.y(parcel, readInt25);
                    } else {
                        n0Var = (n0) o8.g(parcel, readInt25, n0.CREATOR);
                    }
                }
                o8.m(parcel, z42);
                return new c0(i32, n0Var);
            case 25:
                int z43 = o8.z(parcel);
                int i33 = 0;
                String str9 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt26 = parcel.readInt();
                    char c32 = (char) readInt26;
                    if (c32 == 2) {
                        i33 = o8.u(parcel, readInt26);
                    } else if (c32 != 3) {
                        o8.y(parcel, readInt26);
                    } else {
                        str9 = o8.h(parcel, readInt26);
                    }
                }
                o8.m(parcel, z43);
                return new d0(i33, str9);
            case 26:
                int z44 = o8.z(parcel);
                String str10 = null;
                int i34 = 0;
                int i35 = 0;
                while (parcel.dataPosition() < z44) {
                    int readInt27 = parcel.readInt();
                    char c33 = (char) readInt27;
                    if (c33 == 1) {
                        str10 = o8.h(parcel, readInt27);
                    } else if (c33 == 2) {
                        i34 = o8.u(parcel, readInt27);
                    } else if (c33 != 3) {
                        o8.y(parcel, readInt27);
                    } else {
                        i35 = o8.u(parcel, readInt27);
                    }
                }
                o8.m(parcel, z44);
                return new c1(str10, i34, i35);
            case 27:
                int z45 = o8.z(parcel);
                int i36 = 0;
                String str11 = null;
                byte[] bArr2 = null;
                String str12 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt28 = parcel.readInt();
                    char c34 = (char) readInt28;
                    if (c34 == 2) {
                        i36 = o8.u(parcel, readInt28);
                    } else if (c34 == 3) {
                        str11 = o8.h(parcel, readInt28);
                    } else if (c34 == 4) {
                        bArr2 = o8.b(parcel, readInt28);
                    } else if (c34 != 5) {
                        o8.y(parcel, readInt28);
                    } else {
                        str12 = o8.h(parcel, readInt28);
                    }
                }
                o8.m(parcel, z45);
                return new m0(i36, str11, str12, bArr2);
            case 28:
                int z46 = o8.z(parcel);
                int i37 = 0;
                while (parcel.dataPosition() < z46) {
                    int readInt29 = parcel.readInt();
                    if (((char) readInt29) != 2) {
                        o8.y(parcel, readInt29);
                    } else {
                        i37 = o8.u(parcel, readInt29);
                    }
                }
                o8.m(parcel, z46);
                return new g0(i37);
            default:
                int z47 = o8.z(parcel);
                String str13 = null;
                String str14 = null;
                int i38 = 0;
                boolean z48 = false;
                while (parcel.dataPosition() < z47) {
                    int readInt30 = parcel.readInt();
                    char c35 = (char) readInt30;
                    if (c35 == 2) {
                        str13 = o8.h(parcel, readInt30);
                    } else if (c35 == 3) {
                        str14 = o8.h(parcel, readInt30);
                    } else if (c35 == 4) {
                        i38 = o8.u(parcel, readInt30);
                    } else if (c35 != 5) {
                        o8.y(parcel, readInt30);
                    } else {
                        z48 = o8.n(parcel, readInt30);
                    }
                }
                o8.m(parcel, z47);
                return new n0(i38, str13, str14, z48);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        switch (this.a) {
            case 0:
                return new b[i9];
            case 1:
                return new e[i9];
            case 2:
                return new f[i9];
            case 3:
                return new g[i9];
            case 4:
                return new h[i9];
            case 5:
                return new i[i9];
            case 6:
                return new j[i9];
            case 7:
                return new DataItemAssetParcelable[i9];
            case 8:
                return new m[i9];
            case 9:
                return new n[i9];
            case 10:
                return new o[i9];
            case 11:
                return new p[i9];
            case 12:
                return new q[i9];
            case 13:
                return new r[i9];
            case 14:
                return new s[i9];
            case 15:
                return new t[i9];
            case 16:
                return new u[i9];
            case 17:
                return new v[i9];
            case 18:
                return new w[i9];
            case 19:
                return new x[i9];
            case 20:
                return new y[i9];
            case 21:
                return new z[i9];
            case 22:
                return new a0[i9];
            case 23:
                return new b0[i9];
            case 24:
                return new c0[i9];
            case 25:
                return new d0[i9];
            case 26:
                return new c1[i9];
            case 27:
                return new m0[i9];
            case 28:
                return new g0[i9];
            default:
                return new n0[i9];
        }
    }
}
