package b9;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.vb;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z9 = vb.z(parcel);
                String str = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z9) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        str = vb.h(parcel, readInt);
                    } else if (c10 != 3) {
                        vb.y(parcel, readInt);
                    } else {
                        arrayList = vb.l(parcel, readInt, l0.CREATOR);
                    }
                }
                vb.m(parcel, z9);
                return new b(str, arrayList);
            case 1:
                int z10 = vb.z(parcel);
                f fVar = null;
                int i7 = 0;
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 2) {
                        fVar = (f) vb.g(parcel, readInt2, f.CREATOR);
                    } else if (c11 == 3) {
                        i7 = vb.u(parcel, readInt2);
                    } else if (c11 == 4) {
                        i10 = vb.u(parcel, readInt2);
                    } else if (c11 != 5) {
                        vb.y(parcel, readInt2);
                    } else {
                        i11 = vb.u(parcel, readInt2);
                    }
                }
                vb.m(parcel, z10);
                return new e(fVar, i7, i10, i11);
            case 2:
                int z11 = vb.z(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 2) {
                        str2 = vb.h(parcel, readInt3);
                    } else if (c12 == 3) {
                        str3 = vb.h(parcel, readInt3);
                    } else if (c12 != 4) {
                        vb.y(parcel, readInt3);
                    } else {
                        str4 = vb.h(parcel, readInt3);
                    }
                }
                vb.m(parcel, z11);
                return new f(str2, str3, str4);
            case 3:
                int z12 = vb.z(parcel);
                int i12 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 2) {
                        vb.y(parcel, readInt4);
                    } else {
                        i12 = vb.u(parcel, readInt4);
                    }
                }
                vb.m(parcel, z12);
                return new g(i12);
            case 4:
                int z13 = vb.z(parcel);
                int i13 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        vb.y(parcel, readInt5);
                    } else {
                        i13 = vb.u(parcel, readInt5);
                    }
                }
                vb.m(parcel, z13);
                return new h(i13);
            case 5:
                int z14 = vb.z(parcel);
                int i14 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 2) {
                        vb.y(parcel, readInt6);
                    } else {
                        i14 = vb.u(parcel, readInt6);
                    }
                }
                vb.m(parcel, z14);
                return new i(i14);
            case 6:
                int z15 = vb.z(parcel);
                int i15 = 0;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                while (parcel.dataPosition() < z15) {
                    int readInt7 = parcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 == 1) {
                        i15 = vb.u(parcel, readInt7);
                    } else if (c13 == 2) {
                        z16 = vb.n(parcel, readInt7);
                    } else if (c13 == 3) {
                        z17 = vb.n(parcel, readInt7);
                    } else if (c13 == 4) {
                        z18 = vb.n(parcel, readInt7);
                    } else if (c13 != 5) {
                        vb.y(parcel, readInt7);
                    } else {
                        z19 = vb.n(parcel, readInt7);
                    }
                }
                vb.m(parcel, z15);
                return new j(i15, z16, z17, z18, z19);
            case 7:
                int z20 = vb.z(parcel);
                String str5 = null;
                String str6 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt8 = parcel.readInt();
                    char c14 = (char) readInt8;
                    if (c14 == 2) {
                        str5 = vb.h(parcel, readInt8);
                    } else if (c14 != 3) {
                        vb.y(parcel, readInt8);
                    } else {
                        str6 = vb.h(parcel, readInt8);
                    }
                }
                vb.m(parcel, z20);
                return new DataItemAssetParcelable(str5, str6);
            case 8:
                int z21 = vb.z(parcel);
                Uri uri = null;
                Bundle bundle = null;
                byte[] bArr = null;
                while (parcel.dataPosition() < z21) {
                    int readInt9 = parcel.readInt();
                    char c15 = (char) readInt9;
                    if (c15 == 2) {
                        uri = (Uri) vb.g(parcel, readInt9, Uri.CREATOR);
                    } else if (c15 == 4) {
                        bundle = vb.a(parcel, readInt9);
                    } else if (c15 != 5) {
                        vb.y(parcel, readInt9);
                    } else {
                        bArr = vb.b(parcel, readInt9);
                    }
                }
                vb.m(parcel, z21);
                return new k(uri, bundle, bArr);
            case 9:
                int z22 = vb.z(parcel);
                int i16 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < z22) {
                    int readInt10 = parcel.readInt();
                    char c16 = (char) readInt10;
                    if (c16 == 2) {
                        i16 = vb.u(parcel, readInt10);
                    } else if (c16 != 3) {
                        vb.y(parcel, readInt10);
                    } else {
                        i17 = vb.u(parcel, readInt10);
                    }
                }
                vb.m(parcel, z22);
                return new l(i16, i17);
            case 10:
                int z23 = vb.z(parcel);
                int i18 = 0;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt11 = parcel.readInt();
                    char c17 = (char) readInt11;
                    if (c17 == 2) {
                        i18 = vb.u(parcel, readInt11);
                    } else if (c17 != 3) {
                        vb.y(parcel, readInt11);
                    } else {
                        arrayList2 = vb.l(parcel, readInt11, b.CREATOR);
                    }
                }
                vb.m(parcel, z23);
                return new m(i18, arrayList2);
            case 11:
                int z24 = vb.z(parcel);
                int i19 = 0;
                b bVar = null;
                while (parcel.dataPosition() < z24) {
                    int readInt12 = parcel.readInt();
                    char c18 = (char) readInt12;
                    if (c18 == 2) {
                        i19 = vb.u(parcel, readInt12);
                    } else if (c18 != 3) {
                        vb.y(parcel, readInt12);
                    } else {
                        bVar = (b) vb.g(parcel, readInt12, b.CREATOR);
                    }
                }
                vb.m(parcel, z24);
                return new n(i19, bVar);
            case 12:
                int z25 = vb.z(parcel);
                int i20 = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < z25) {
                    int readInt13 = parcel.readInt();
                    char c19 = (char) readInt13;
                    if (c19 == 2) {
                        i20 = vb.u(parcel, readInt13);
                    } else if (c19 != 3) {
                        vb.y(parcel, readInt13);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) vb.g(parcel, readInt13, ParcelFileDescriptor.CREATOR);
                    }
                }
                vb.m(parcel, z25);
                return new o(i20, parcelFileDescriptor);
            case 13:
                int z26 = vb.z(parcel);
                int i21 = 0;
                ParcelFileDescriptor parcelFileDescriptor2 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt14 = parcel.readInt();
                    char c20 = (char) readInt14;
                    if (c20 == 2) {
                        i21 = vb.u(parcel, readInt14);
                    } else if (c20 != 3) {
                        vb.y(parcel, readInt14);
                    } else {
                        parcelFileDescriptor2 = (ParcelFileDescriptor) vb.g(parcel, readInt14, ParcelFileDescriptor.CREATOR);
                    }
                }
                vb.m(parcel, z26);
                return new p(i21, parcelFileDescriptor2);
            case 14:
                int z27 = vb.z(parcel);
                int i22 = 0;
                boolean z28 = false;
                while (parcel.dataPosition() < z27) {
                    int readInt15 = parcel.readInt();
                    char c21 = (char) readInt15;
                    if (c21 == 2) {
                        i22 = vb.u(parcel, readInt15);
                    } else if (c21 != 3) {
                        vb.y(parcel, readInt15);
                    } else {
                        z28 = vb.n(parcel, readInt15);
                    }
                }
                vb.m(parcel, z27);
                return new q(i22, z28);
            case 15:
                int z29 = vb.z(parcel);
                int i23 = 0;
                boolean z30 = false;
                boolean z31 = false;
                while (parcel.dataPosition() < z29) {
                    int readInt16 = parcel.readInt();
                    char c22 = (char) readInt16;
                    if (c22 == 2) {
                        i23 = vb.u(parcel, readInt16);
                    } else if (c22 == 3) {
                        z30 = vb.n(parcel, readInt16);
                    } else if (c22 != 4) {
                        vb.y(parcel, readInt16);
                    } else {
                        z31 = vb.n(parcel, readInt16);
                    }
                }
                vb.m(parcel, z29);
                return new r(i23, z30, z31);
            case 16:
                int z32 = vb.z(parcel);
                int i24 = 0;
                boolean z33 = false;
                while (parcel.dataPosition() < z32) {
                    int readInt17 = parcel.readInt();
                    char c23 = (char) readInt17;
                    if (c23 == 2) {
                        i24 = vb.u(parcel, readInt17);
                    } else if (c23 != 3) {
                        vb.y(parcel, readInt17);
                    } else {
                        z33 = vb.n(parcel, readInt17);
                    }
                }
                vb.m(parcel, z32);
                return new s(i24, z33);
            case 17:
                int z34 = vb.z(parcel);
                int i25 = 0;
                String str7 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt18 = parcel.readInt();
                    char c24 = (char) readInt18;
                    if (c24 == 2) {
                        i25 = vb.u(parcel, readInt18);
                    } else if (c24 != 3) {
                        vb.y(parcel, readInt18);
                    } else {
                        str7 = vb.h(parcel, readInt18);
                    }
                }
                vb.m(parcel, z34);
                return new t(i25, str7);
            case 18:
                int z35 = vb.z(parcel);
                int i26 = 0;
                ConnectionConfiguration connectionConfiguration = null;
                while (parcel.dataPosition() < z35) {
                    int readInt19 = parcel.readInt();
                    char c25 = (char) readInt19;
                    if (c25 == 2) {
                        i26 = vb.u(parcel, readInt19);
                    } else if (c25 != 3) {
                        vb.y(parcel, readInt19);
                    } else {
                        connectionConfiguration = (ConnectionConfiguration) vb.g(parcel, readInt19, ConnectionConfiguration.CREATOR);
                    }
                }
                vb.m(parcel, z35);
                return new u(i26, connectionConfiguration);
            case 19:
                int z36 = vb.z(parcel);
                int i27 = 0;
                ConnectionConfiguration[] connectionConfigurationArr = null;
                while (parcel.dataPosition() < z36) {
                    int readInt20 = parcel.readInt();
                    char c26 = (char) readInt20;
                    if (c26 == 2) {
                        i27 = vb.u(parcel, readInt20);
                    } else if (c26 != 3) {
                        vb.y(parcel, readInt20);
                    } else {
                        connectionConfigurationArr = (ConnectionConfiguration[]) vb.k(parcel, readInt20, ConnectionConfiguration.CREATOR);
                    }
                }
                vb.m(parcel, z36);
                return new v(i27, connectionConfigurationArr);
            case 20:
                int z37 = vb.z(parcel);
                int i28 = 0;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt21 = parcel.readInt();
                    char c27 = (char) readInt21;
                    if (c27 == 2) {
                        i28 = vb.u(parcel, readInt21);
                    } else if (c27 != 3) {
                        vb.y(parcel, readInt21);
                    } else {
                        arrayList3 = vb.l(parcel, readInt21, l0.CREATOR);
                    }
                }
                vb.m(parcel, z37);
                return new w(i28, arrayList3);
            case 21:
                int z38 = vb.z(parcel);
                int i29 = 0;
                k kVar = null;
                while (parcel.dataPosition() < z38) {
                    int readInt22 = parcel.readInt();
                    char c28 = (char) readInt22;
                    if (c28 == 2) {
                        i29 = vb.u(parcel, readInt22);
                    } else if (c28 != 3) {
                        vb.y(parcel, readInt22);
                    } else {
                        kVar = (k) vb.g(parcel, readInt22, k.CREATOR);
                    }
                }
                vb.m(parcel, z38);
                return new x(i29, kVar);
            case 22:
                int z39 = vb.z(parcel);
                int i30 = 0;
                String str8 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt23 = parcel.readInt();
                    char c29 = (char) readInt23;
                    if (c29 == 2) {
                        i30 = vb.u(parcel, readInt23);
                    } else if (c29 != 3) {
                        vb.y(parcel, readInt23);
                    } else {
                        str8 = vb.h(parcel, readInt23);
                    }
                }
                vb.m(parcel, z39);
                return new y(i30, str8);
            case 23:
                int z40 = vb.z(parcel);
                int i31 = 0;
                ParcelFileDescriptor parcelFileDescriptor3 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt24 = parcel.readInt();
                    char c30 = (char) readInt24;
                    if (c30 == 2) {
                        i31 = vb.u(parcel, readInt24);
                    } else if (c30 != 3) {
                        vb.y(parcel, readInt24);
                    } else {
                        parcelFileDescriptor3 = (ParcelFileDescriptor) vb.g(parcel, readInt24, ParcelFileDescriptor.CREATOR);
                    }
                }
                vb.m(parcel, z40);
                return new z(i31, parcelFileDescriptor3);
            case 24:
                int z41 = vb.z(parcel);
                int i32 = 0;
                l0 l0Var = null;
                while (parcel.dataPosition() < z41) {
                    int readInt25 = parcel.readInt();
                    char c31 = (char) readInt25;
                    if (c31 == 2) {
                        i32 = vb.u(parcel, readInt25);
                    } else if (c31 != 3) {
                        vb.y(parcel, readInt25);
                    } else {
                        l0Var = (l0) vb.g(parcel, readInt25, l0.CREATOR);
                    }
                }
                vb.m(parcel, z41);
                return new a0(i32, l0Var);
            case 25:
                int z42 = vb.z(parcel);
                int i33 = 0;
                String str9 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt26 = parcel.readInt();
                    char c32 = (char) readInt26;
                    if (c32 == 2) {
                        i33 = vb.u(parcel, readInt26);
                    } else if (c32 != 3) {
                        vb.y(parcel, readInt26);
                    } else {
                        str9 = vb.h(parcel, readInt26);
                    }
                }
                vb.m(parcel, z42);
                return new b0(i33, str9);
            case 26:
                int z43 = vb.z(parcel);
                String str10 = null;
                int i34 = 0;
                int i35 = 0;
                while (parcel.dataPosition() < z43) {
                    int readInt27 = parcel.readInt();
                    char c33 = (char) readInt27;
                    if (c33 == 1) {
                        str10 = vb.h(parcel, readInt27);
                    } else if (c33 == 2) {
                        i34 = vb.u(parcel, readInt27);
                    } else if (c33 != 3) {
                        vb.y(parcel, readInt27);
                    } else {
                        i35 = vb.u(parcel, readInt27);
                    }
                }
                vb.m(parcel, z43);
                return new a1(str10, i34, i35);
            case 27:
                int z44 = vb.z(parcel);
                int i36 = 0;
                String str11 = null;
                byte[] bArr2 = null;
                String str12 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt28 = parcel.readInt();
                    char c34 = (char) readInt28;
                    if (c34 == 2) {
                        i36 = vb.u(parcel, readInt28);
                    } else if (c34 == 3) {
                        str11 = vb.h(parcel, readInt28);
                    } else if (c34 == 4) {
                        bArr2 = vb.b(parcel, readInt28);
                    } else if (c34 != 5) {
                        vb.y(parcel, readInt28);
                    } else {
                        str12 = vb.h(parcel, readInt28);
                    }
                }
                vb.m(parcel, z44);
                return new k0(i36, str11, str12, bArr2);
            case 28:
                int z45 = vb.z(parcel);
                int i37 = 0;
                while (parcel.dataPosition() < z45) {
                    int readInt29 = parcel.readInt();
                    if (((char) readInt29) != 2) {
                        vb.y(parcel, readInt29);
                    } else {
                        i37 = vb.u(parcel, readInt29);
                    }
                }
                vb.m(parcel, z45);
                return new e0(i37);
            default:
                int z46 = vb.z(parcel);
                String str13 = null;
                int i38 = 0;
                boolean z47 = false;
                String str14 = null;
                while (parcel.dataPosition() < z46) {
                    int readInt30 = parcel.readInt();
                    char c35 = (char) readInt30;
                    if (c35 == 2) {
                        str13 = vb.h(parcel, readInt30);
                    } else if (c35 == 3) {
                        str14 = vb.h(parcel, readInt30);
                    } else if (c35 == 4) {
                        i38 = vb.u(parcel, readInt30);
                    } else if (c35 != 5) {
                        vb.y(parcel, readInt30);
                    } else {
                        z47 = vb.n(parcel, readInt30);
                    }
                }
                vb.m(parcel, z46);
                return new l0(i38, str13, str14, z47);
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
                return new a1[i7];
            case 27:
                return new k0[i7];
            case 28:
                return new e0[i7];
            default:
                return new l0[i7];
        }
    }
}
