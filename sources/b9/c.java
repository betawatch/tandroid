package b9;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.ac;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = ac.z(parcel);
                String str = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        str = ac.h(parcel, readInt);
                    } else if (c10 != 3) {
                        ac.y(parcel, readInt);
                    } else {
                        arrayList = ac.l(parcel, readInt, m0.CREATOR);
                    }
                }
                ac.m(parcel, z10);
                return new b(str, arrayList);
            case 1:
                int z11 = ac.z(parcel);
                f fVar = null;
                int i7 = 0;
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 2) {
                        fVar = (f) ac.g(parcel, readInt2, f.CREATOR);
                    } else if (c11 == 3) {
                        i7 = ac.u(parcel, readInt2);
                    } else if (c11 == 4) {
                        i10 = ac.u(parcel, readInt2);
                    } else if (c11 != 5) {
                        ac.y(parcel, readInt2);
                    } else {
                        i11 = ac.u(parcel, readInt2);
                    }
                }
                ac.m(parcel, z11);
                return new e(fVar, i7, i10, i11);
            case 2:
                int z12 = ac.z(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 2) {
                        str2 = ac.h(parcel, readInt3);
                    } else if (c12 == 3) {
                        str3 = ac.h(parcel, readInt3);
                    } else if (c12 != 4) {
                        ac.y(parcel, readInt3);
                    } else {
                        str4 = ac.h(parcel, readInt3);
                    }
                }
                ac.m(parcel, z12);
                return new f(str2, str3, str4);
            case 3:
                int z13 = ac.z(parcel);
                int i12 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 2) {
                        ac.y(parcel, readInt4);
                    } else {
                        i12 = ac.u(parcel, readInt4);
                    }
                }
                ac.m(parcel, z13);
                return new g(i12);
            case 4:
                int z14 = ac.z(parcel);
                int i13 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        ac.y(parcel, readInt5);
                    } else {
                        i13 = ac.u(parcel, readInt5);
                    }
                }
                ac.m(parcel, z14);
                return new h(i13);
            case 5:
                int z15 = ac.z(parcel);
                int i14 = 0;
                while (parcel.dataPosition() < z15) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 2) {
                        ac.y(parcel, readInt6);
                    } else {
                        i14 = ac.u(parcel, readInt6);
                    }
                }
                ac.m(parcel, z15);
                return new i(i14);
            case 6:
                int z16 = ac.z(parcel);
                int i15 = 0;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                while (parcel.dataPosition() < z16) {
                    int readInt7 = parcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 == 1) {
                        i15 = ac.u(parcel, readInt7);
                    } else if (c13 == 2) {
                        z17 = ac.n(parcel, readInt7);
                    } else if (c13 == 3) {
                        z18 = ac.n(parcel, readInt7);
                    } else if (c13 == 4) {
                        z19 = ac.n(parcel, readInt7);
                    } else if (c13 != 5) {
                        ac.y(parcel, readInt7);
                    } else {
                        z20 = ac.n(parcel, readInt7);
                    }
                }
                ac.m(parcel, z16);
                return new j(i15, z17, z18, z19, z20);
            case 7:
                int z21 = ac.z(parcel);
                String str5 = null;
                String str6 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt8 = parcel.readInt();
                    char c14 = (char) readInt8;
                    if (c14 == 2) {
                        str5 = ac.h(parcel, readInt8);
                    } else if (c14 != 3) {
                        ac.y(parcel, readInt8);
                    } else {
                        str6 = ac.h(parcel, readInt8);
                    }
                }
                ac.m(parcel, z21);
                return new DataItemAssetParcelable(str5, str6);
            case 8:
                int z22 = ac.z(parcel);
                Uri uri = null;
                Bundle bundle = null;
                byte[] bArr = null;
                while (parcel.dataPosition() < z22) {
                    int readInt9 = parcel.readInt();
                    char c15 = (char) readInt9;
                    if (c15 == 2) {
                        uri = (Uri) ac.g(parcel, readInt9, Uri.CREATOR);
                    } else if (c15 == 4) {
                        bundle = ac.a(parcel, readInt9);
                    } else if (c15 != 5) {
                        ac.y(parcel, readInt9);
                    } else {
                        bArr = ac.b(parcel, readInt9);
                    }
                }
                ac.m(parcel, z22);
                return new k(uri, bundle, bArr);
            case 9:
                int z23 = ac.z(parcel);
                int i16 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < z23) {
                    int readInt10 = parcel.readInt();
                    char c16 = (char) readInt10;
                    if (c16 == 2) {
                        i16 = ac.u(parcel, readInt10);
                    } else if (c16 != 3) {
                        ac.y(parcel, readInt10);
                    } else {
                        i17 = ac.u(parcel, readInt10);
                    }
                }
                ac.m(parcel, z23);
                return new l(i16, i17);
            case 10:
                int z24 = ac.z(parcel);
                int i18 = 0;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt11 = parcel.readInt();
                    char c17 = (char) readInt11;
                    if (c17 == 2) {
                        i18 = ac.u(parcel, readInt11);
                    } else if (c17 != 3) {
                        ac.y(parcel, readInt11);
                    } else {
                        arrayList2 = ac.l(parcel, readInt11, b.CREATOR);
                    }
                }
                ac.m(parcel, z24);
                return new m(i18, arrayList2);
            case 11:
                int z25 = ac.z(parcel);
                int i19 = 0;
                b bVar = null;
                while (parcel.dataPosition() < z25) {
                    int readInt12 = parcel.readInt();
                    char c18 = (char) readInt12;
                    if (c18 == 2) {
                        i19 = ac.u(parcel, readInt12);
                    } else if (c18 != 3) {
                        ac.y(parcel, readInt12);
                    } else {
                        bVar = (b) ac.g(parcel, readInt12, b.CREATOR);
                    }
                }
                ac.m(parcel, z25);
                return new n(i19, bVar);
            case 12:
                int z26 = ac.z(parcel);
                int i20 = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < z26) {
                    int readInt13 = parcel.readInt();
                    char c19 = (char) readInt13;
                    if (c19 == 2) {
                        i20 = ac.u(parcel, readInt13);
                    } else if (c19 != 3) {
                        ac.y(parcel, readInt13);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) ac.g(parcel, readInt13, ParcelFileDescriptor.CREATOR);
                    }
                }
                ac.m(parcel, z26);
                return new o(i20, parcelFileDescriptor);
            case 13:
                int z27 = ac.z(parcel);
                int i21 = 0;
                ParcelFileDescriptor parcelFileDescriptor2 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt14 = parcel.readInt();
                    char c20 = (char) readInt14;
                    if (c20 == 2) {
                        i21 = ac.u(parcel, readInt14);
                    } else if (c20 != 3) {
                        ac.y(parcel, readInt14);
                    } else {
                        parcelFileDescriptor2 = (ParcelFileDescriptor) ac.g(parcel, readInt14, ParcelFileDescriptor.CREATOR);
                    }
                }
                ac.m(parcel, z27);
                return new p(i21, parcelFileDescriptor2);
            case 14:
                int z28 = ac.z(parcel);
                int i22 = 0;
                boolean z29 = false;
                while (parcel.dataPosition() < z28) {
                    int readInt15 = parcel.readInt();
                    char c21 = (char) readInt15;
                    if (c21 == 2) {
                        i22 = ac.u(parcel, readInt15);
                    } else if (c21 != 3) {
                        ac.y(parcel, readInt15);
                    } else {
                        z29 = ac.n(parcel, readInt15);
                    }
                }
                ac.m(parcel, z28);
                return new q(i22, z29);
            case 15:
                int z30 = ac.z(parcel);
                int i23 = 0;
                boolean z31 = false;
                boolean z32 = false;
                while (parcel.dataPosition() < z30) {
                    int readInt16 = parcel.readInt();
                    char c22 = (char) readInt16;
                    if (c22 == 2) {
                        i23 = ac.u(parcel, readInt16);
                    } else if (c22 == 3) {
                        z31 = ac.n(parcel, readInt16);
                    } else if (c22 != 4) {
                        ac.y(parcel, readInt16);
                    } else {
                        z32 = ac.n(parcel, readInt16);
                    }
                }
                ac.m(parcel, z30);
                return new r(i23, z31, z32);
            case 16:
                int z33 = ac.z(parcel);
                int i24 = 0;
                boolean z34 = false;
                while (parcel.dataPosition() < z33) {
                    int readInt17 = parcel.readInt();
                    char c23 = (char) readInt17;
                    if (c23 == 2) {
                        i24 = ac.u(parcel, readInt17);
                    } else if (c23 != 3) {
                        ac.y(parcel, readInt17);
                    } else {
                        z34 = ac.n(parcel, readInt17);
                    }
                }
                ac.m(parcel, z33);
                return new s(i24, z34);
            case 17:
                int z35 = ac.z(parcel);
                int i25 = 0;
                String str7 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt18 = parcel.readInt();
                    char c24 = (char) readInt18;
                    if (c24 == 2) {
                        i25 = ac.u(parcel, readInt18);
                    } else if (c24 != 3) {
                        ac.y(parcel, readInt18);
                    } else {
                        str7 = ac.h(parcel, readInt18);
                    }
                }
                ac.m(parcel, z35);
                return new t(i25, str7);
            case 18:
                int z36 = ac.z(parcel);
                int i26 = 0;
                ConnectionConfiguration connectionConfiguration = null;
                while (parcel.dataPosition() < z36) {
                    int readInt19 = parcel.readInt();
                    char c25 = (char) readInt19;
                    if (c25 == 2) {
                        i26 = ac.u(parcel, readInt19);
                    } else if (c25 != 3) {
                        ac.y(parcel, readInt19);
                    } else {
                        connectionConfiguration = (ConnectionConfiguration) ac.g(parcel, readInt19, ConnectionConfiguration.CREATOR);
                    }
                }
                ac.m(parcel, z36);
                return new u(i26, connectionConfiguration);
            case 19:
                int z37 = ac.z(parcel);
                int i27 = 0;
                ConnectionConfiguration[] connectionConfigurationArr = null;
                while (parcel.dataPosition() < z37) {
                    int readInt20 = parcel.readInt();
                    char c26 = (char) readInt20;
                    if (c26 == 2) {
                        i27 = ac.u(parcel, readInt20);
                    } else if (c26 != 3) {
                        ac.y(parcel, readInt20);
                    } else {
                        connectionConfigurationArr = (ConnectionConfiguration[]) ac.k(parcel, readInt20, ConnectionConfiguration.CREATOR);
                    }
                }
                ac.m(parcel, z37);
                return new v(i27, connectionConfigurationArr);
            case 20:
                int z38 = ac.z(parcel);
                int i28 = 0;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt21 = parcel.readInt();
                    char c27 = (char) readInt21;
                    if (c27 == 2) {
                        i28 = ac.u(parcel, readInt21);
                    } else if (c27 != 3) {
                        ac.y(parcel, readInt21);
                    } else {
                        arrayList3 = ac.l(parcel, readInt21, m0.CREATOR);
                    }
                }
                ac.m(parcel, z38);
                return new w(i28, arrayList3);
            case 21:
                int z39 = ac.z(parcel);
                int i29 = 0;
                k kVar = null;
                while (parcel.dataPosition() < z39) {
                    int readInt22 = parcel.readInt();
                    char c28 = (char) readInt22;
                    if (c28 == 2) {
                        i29 = ac.u(parcel, readInt22);
                    } else if (c28 != 3) {
                        ac.y(parcel, readInt22);
                    } else {
                        kVar = (k) ac.g(parcel, readInt22, k.CREATOR);
                    }
                }
                ac.m(parcel, z39);
                return new x(i29, kVar);
            case 22:
                int z40 = ac.z(parcel);
                int i30 = 0;
                String str8 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt23 = parcel.readInt();
                    char c29 = (char) readInt23;
                    if (c29 == 2) {
                        i30 = ac.u(parcel, readInt23);
                    } else if (c29 != 3) {
                        ac.y(parcel, readInt23);
                    } else {
                        str8 = ac.h(parcel, readInt23);
                    }
                }
                ac.m(parcel, z40);
                return new y(i30, str8);
            case 23:
                int z41 = ac.z(parcel);
                int i31 = 0;
                ParcelFileDescriptor parcelFileDescriptor3 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt24 = parcel.readInt();
                    char c30 = (char) readInt24;
                    if (c30 == 2) {
                        i31 = ac.u(parcel, readInt24);
                    } else if (c30 != 3) {
                        ac.y(parcel, readInt24);
                    } else {
                        parcelFileDescriptor3 = (ParcelFileDescriptor) ac.g(parcel, readInt24, ParcelFileDescriptor.CREATOR);
                    }
                }
                ac.m(parcel, z41);
                return new z(i31, parcelFileDescriptor3);
            case 24:
                int z42 = ac.z(parcel);
                int i32 = 0;
                m0 m0Var = null;
                while (parcel.dataPosition() < z42) {
                    int readInt25 = parcel.readInt();
                    char c31 = (char) readInt25;
                    if (c31 == 2) {
                        i32 = ac.u(parcel, readInt25);
                    } else if (c31 != 3) {
                        ac.y(parcel, readInt25);
                    } else {
                        m0Var = (m0) ac.g(parcel, readInt25, m0.CREATOR);
                    }
                }
                ac.m(parcel, z42);
                return new a0(i32, m0Var);
            case 25:
                int z43 = ac.z(parcel);
                int i33 = 0;
                String str9 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt26 = parcel.readInt();
                    char c32 = (char) readInt26;
                    if (c32 == 2) {
                        i33 = ac.u(parcel, readInt26);
                    } else if (c32 != 3) {
                        ac.y(parcel, readInt26);
                    } else {
                        str9 = ac.h(parcel, readInt26);
                    }
                }
                ac.m(parcel, z43);
                return new b0(i33, str9);
            case 26:
                int z44 = ac.z(parcel);
                String str10 = null;
                int i34 = 0;
                int i35 = 0;
                while (parcel.dataPosition() < z44) {
                    int readInt27 = parcel.readInt();
                    char c33 = (char) readInt27;
                    if (c33 == 1) {
                        str10 = ac.h(parcel, readInt27);
                    } else if (c33 == 2) {
                        i34 = ac.u(parcel, readInt27);
                    } else if (c33 != 3) {
                        ac.y(parcel, readInt27);
                    } else {
                        i35 = ac.u(parcel, readInt27);
                    }
                }
                ac.m(parcel, z44);
                return new b1(str10, i34, i35);
            case 27:
                int z45 = ac.z(parcel);
                int i36 = 0;
                String str11 = null;
                byte[] bArr2 = null;
                String str12 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt28 = parcel.readInt();
                    char c34 = (char) readInt28;
                    if (c34 == 2) {
                        i36 = ac.u(parcel, readInt28);
                    } else if (c34 == 3) {
                        str11 = ac.h(parcel, readInt28);
                    } else if (c34 == 4) {
                        bArr2 = ac.b(parcel, readInt28);
                    } else if (c34 != 5) {
                        ac.y(parcel, readInt28);
                    } else {
                        str12 = ac.h(parcel, readInt28);
                    }
                }
                ac.m(parcel, z45);
                return new l0(i36, str11, str12, bArr2);
            case 28:
                int z46 = ac.z(parcel);
                int i37 = 0;
                while (parcel.dataPosition() < z46) {
                    int readInt29 = parcel.readInt();
                    if (((char) readInt29) != 2) {
                        ac.y(parcel, readInt29);
                    } else {
                        i37 = ac.u(parcel, readInt29);
                    }
                }
                ac.m(parcel, z46);
                return new e0(i37);
            default:
                int z47 = ac.z(parcel);
                String str13 = null;
                int i38 = 0;
                boolean z48 = false;
                String str14 = null;
                while (parcel.dataPosition() < z47) {
                    int readInt30 = parcel.readInt();
                    char c35 = (char) readInt30;
                    if (c35 == 2) {
                        str13 = ac.h(parcel, readInt30);
                    } else if (c35 == 3) {
                        str14 = ac.h(parcel, readInt30);
                    } else if (c35 == 4) {
                        i38 = ac.u(parcel, readInt30);
                    } else if (c35 != 5) {
                        ac.y(parcel, readInt30);
                    } else {
                        z48 = ac.n(parcel, readInt30);
                    }
                }
                ac.m(parcel, z47);
                return new m0(i38, str13, str14, z48);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new b[i7];
            case 1:
                return new e[i7];
            case 2:
                return new f[i7];
            case 3:
                return new g[i7];
            case 4:
                return new h[i7];
            case 5:
                return new i[i7];
            case 6:
                return new j[i7];
            case 7:
                return new DataItemAssetParcelable[i7];
            case 8:
                return new k[i7];
            case 9:
                return new l[i7];
            case 10:
                return new m[i7];
            case 11:
                return new n[i7];
            case 12:
                return new o[i7];
            case 13:
                return new p[i7];
            case 14:
                return new q[i7];
            case 15:
                return new r[i7];
            case 16:
                return new s[i7];
            case 17:
                return new t[i7];
            case 18:
                return new u[i7];
            case 19:
                return new v[i7];
            case 20:
                return new w[i7];
            case 21:
                return new x[i7];
            case 22:
                return new y[i7];
            case 23:
                return new z[i7];
            case 24:
                return new a0[i7];
            case 25:
                return new b0[i7];
            case 26:
                return new b1[i7];
            case 27:
                return new l0[i7];
            case 28:
                return new e0[i7];
            default:
                return new m0[i7];
        }
    }
}
