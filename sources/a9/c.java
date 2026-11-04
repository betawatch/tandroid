package a9;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i3) {
        this.a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = g6.e.z(parcel);
                String str = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 == 2) {
                        str = g6.e.h(parcel, readInt);
                    } else if (c2 != 3) {
                        g6.e.y(parcel, readInt);
                    } else {
                        arrayList = g6.e.l(parcel, readInt, l0.CREATOR);
                    }
                }
                g6.e.m(parcel, z10);
                return new b(str, arrayList);
            case 1:
                int z11 = g6.e.z(parcel);
                f fVar = null;
                int i3 = 0;
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 2) {
                        fVar = (f) g6.e.g(parcel, readInt2, f.CREATOR);
                    } else if (c10 == 3) {
                        i3 = g6.e.u(parcel, readInt2);
                    } else if (c10 == 4) {
                        i10 = g6.e.u(parcel, readInt2);
                    } else if (c10 != 5) {
                        g6.e.y(parcel, readInt2);
                    } else {
                        i11 = g6.e.u(parcel, readInt2);
                    }
                }
                g6.e.m(parcel, z11);
                return new e(fVar, i3, i10, i11);
            case 2:
                int z12 = g6.e.z(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 2) {
                        str2 = g6.e.h(parcel, readInt3);
                    } else if (c11 == 3) {
                        str3 = g6.e.h(parcel, readInt3);
                    } else if (c11 != 4) {
                        g6.e.y(parcel, readInt3);
                    } else {
                        str4 = g6.e.h(parcel, readInt3);
                    }
                }
                g6.e.m(parcel, z12);
                return new f(str2, str3, str4);
            case 3:
                int z13 = g6.e.z(parcel);
                int i12 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 2) {
                        g6.e.y(parcel, readInt4);
                    } else {
                        i12 = g6.e.u(parcel, readInt4);
                    }
                }
                g6.e.m(parcel, z13);
                return new g(i12);
            case 4:
                int z14 = g6.e.z(parcel);
                int i13 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        g6.e.y(parcel, readInt5);
                    } else {
                        i13 = g6.e.u(parcel, readInt5);
                    }
                }
                g6.e.m(parcel, z14);
                return new h(i13);
            case 5:
                int z15 = g6.e.z(parcel);
                int i14 = 0;
                while (parcel.dataPosition() < z15) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 2) {
                        g6.e.y(parcel, readInt6);
                    } else {
                        i14 = g6.e.u(parcel, readInt6);
                    }
                }
                g6.e.m(parcel, z15);
                return new i(i14);
            case 6:
                int z16 = g6.e.z(parcel);
                int i15 = 0;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                while (parcel.dataPosition() < z16) {
                    int readInt7 = parcel.readInt();
                    char c12 = (char) readInt7;
                    if (c12 == 1) {
                        i15 = g6.e.u(parcel, readInt7);
                    } else if (c12 == 2) {
                        z17 = g6.e.n(parcel, readInt7);
                    } else if (c12 == 3) {
                        z18 = g6.e.n(parcel, readInt7);
                    } else if (c12 == 4) {
                        z19 = g6.e.n(parcel, readInt7);
                    } else if (c12 != 5) {
                        g6.e.y(parcel, readInt7);
                    } else {
                        z20 = g6.e.n(parcel, readInt7);
                    }
                }
                g6.e.m(parcel, z16);
                return new j(i15, z17, z18, z19, z20);
            case 7:
                int z21 = g6.e.z(parcel);
                String str5 = null;
                String str6 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt8 = parcel.readInt();
                    char c13 = (char) readInt8;
                    if (c13 == 2) {
                        str5 = g6.e.h(parcel, readInt8);
                    } else if (c13 != 3) {
                        g6.e.y(parcel, readInt8);
                    } else {
                        str6 = g6.e.h(parcel, readInt8);
                    }
                }
                g6.e.m(parcel, z21);
                return new DataItemAssetParcelable(str5, str6);
            case 8:
                int z22 = g6.e.z(parcel);
                Uri uri = null;
                Bundle bundle = null;
                byte[] bArr = null;
                while (parcel.dataPosition() < z22) {
                    int readInt9 = parcel.readInt();
                    char c14 = (char) readInt9;
                    if (c14 == 2) {
                        uri = (Uri) g6.e.g(parcel, readInt9, Uri.CREATOR);
                    } else if (c14 == 4) {
                        bundle = g6.e.a(parcel, readInt9);
                    } else if (c14 != 5) {
                        g6.e.y(parcel, readInt9);
                    } else {
                        bArr = g6.e.b(parcel, readInt9);
                    }
                }
                g6.e.m(parcel, z22);
                return new k(uri, bundle, bArr);
            case 9:
                int z23 = g6.e.z(parcel);
                int i16 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < z23) {
                    int readInt10 = parcel.readInt();
                    char c15 = (char) readInt10;
                    if (c15 == 2) {
                        i16 = g6.e.u(parcel, readInt10);
                    } else if (c15 != 3) {
                        g6.e.y(parcel, readInt10);
                    } else {
                        i17 = g6.e.u(parcel, readInt10);
                    }
                }
                g6.e.m(parcel, z23);
                return new l(i16, i17);
            case 10:
                int z24 = g6.e.z(parcel);
                int i18 = 0;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt11 = parcel.readInt();
                    char c16 = (char) readInt11;
                    if (c16 == 2) {
                        i18 = g6.e.u(parcel, readInt11);
                    } else if (c16 != 3) {
                        g6.e.y(parcel, readInt11);
                    } else {
                        arrayList2 = g6.e.l(parcel, readInt11, b.CREATOR);
                    }
                }
                g6.e.m(parcel, z24);
                return new m(i18, arrayList2);
            case 11:
                int z25 = g6.e.z(parcel);
                int i19 = 0;
                b bVar = null;
                while (parcel.dataPosition() < z25) {
                    int readInt12 = parcel.readInt();
                    char c17 = (char) readInt12;
                    if (c17 == 2) {
                        i19 = g6.e.u(parcel, readInt12);
                    } else if (c17 != 3) {
                        g6.e.y(parcel, readInt12);
                    } else {
                        bVar = (b) g6.e.g(parcel, readInt12, b.CREATOR);
                    }
                }
                g6.e.m(parcel, z25);
                return new n(i19, bVar);
            case 12:
                int z26 = g6.e.z(parcel);
                int i20 = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < z26) {
                    int readInt13 = parcel.readInt();
                    char c18 = (char) readInt13;
                    if (c18 == 2) {
                        i20 = g6.e.u(parcel, readInt13);
                    } else if (c18 != 3) {
                        g6.e.y(parcel, readInt13);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) g6.e.g(parcel, readInt13, ParcelFileDescriptor.CREATOR);
                    }
                }
                g6.e.m(parcel, z26);
                return new o(i20, parcelFileDescriptor);
            case 13:
                int z27 = g6.e.z(parcel);
                int i21 = 0;
                ParcelFileDescriptor parcelFileDescriptor2 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt14 = parcel.readInt();
                    char c19 = (char) readInt14;
                    if (c19 == 2) {
                        i21 = g6.e.u(parcel, readInt14);
                    } else if (c19 != 3) {
                        g6.e.y(parcel, readInt14);
                    } else {
                        parcelFileDescriptor2 = (ParcelFileDescriptor) g6.e.g(parcel, readInt14, ParcelFileDescriptor.CREATOR);
                    }
                }
                g6.e.m(parcel, z27);
                return new p(i21, parcelFileDescriptor2);
            case 14:
                int z28 = g6.e.z(parcel);
                int i22 = 0;
                boolean z29 = false;
                while (parcel.dataPosition() < z28) {
                    int readInt15 = parcel.readInt();
                    char c20 = (char) readInt15;
                    if (c20 == 2) {
                        i22 = g6.e.u(parcel, readInt15);
                    } else if (c20 != 3) {
                        g6.e.y(parcel, readInt15);
                    } else {
                        z29 = g6.e.n(parcel, readInt15);
                    }
                }
                g6.e.m(parcel, z28);
                return new q(i22, z29);
            case 15:
                int z30 = g6.e.z(parcel);
                int i23 = 0;
                boolean z31 = false;
                boolean z32 = false;
                while (parcel.dataPosition() < z30) {
                    int readInt16 = parcel.readInt();
                    char c21 = (char) readInt16;
                    if (c21 == 2) {
                        i23 = g6.e.u(parcel, readInt16);
                    } else if (c21 == 3) {
                        z31 = g6.e.n(parcel, readInt16);
                    } else if (c21 != 4) {
                        g6.e.y(parcel, readInt16);
                    } else {
                        z32 = g6.e.n(parcel, readInt16);
                    }
                }
                g6.e.m(parcel, z30);
                return new r(i23, z31, z32);
            case 16:
                int z33 = g6.e.z(parcel);
                int i24 = 0;
                boolean z34 = false;
                while (parcel.dataPosition() < z33) {
                    int readInt17 = parcel.readInt();
                    char c22 = (char) readInt17;
                    if (c22 == 2) {
                        i24 = g6.e.u(parcel, readInt17);
                    } else if (c22 != 3) {
                        g6.e.y(parcel, readInt17);
                    } else {
                        z34 = g6.e.n(parcel, readInt17);
                    }
                }
                g6.e.m(parcel, z33);
                return new s(i24, z34);
            case 17:
                int z35 = g6.e.z(parcel);
                int i25 = 0;
                String str7 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt18 = parcel.readInt();
                    char c23 = (char) readInt18;
                    if (c23 == 2) {
                        i25 = g6.e.u(parcel, readInt18);
                    } else if (c23 != 3) {
                        g6.e.y(parcel, readInt18);
                    } else {
                        str7 = g6.e.h(parcel, readInt18);
                    }
                }
                g6.e.m(parcel, z35);
                return new t(i25, str7);
            case 18:
                int z36 = g6.e.z(parcel);
                int i26 = 0;
                ConnectionConfiguration connectionConfiguration = null;
                while (parcel.dataPosition() < z36) {
                    int readInt19 = parcel.readInt();
                    char c24 = (char) readInt19;
                    if (c24 == 2) {
                        i26 = g6.e.u(parcel, readInt19);
                    } else if (c24 != 3) {
                        g6.e.y(parcel, readInt19);
                    } else {
                        connectionConfiguration = (ConnectionConfiguration) g6.e.g(parcel, readInt19, ConnectionConfiguration.CREATOR);
                    }
                }
                g6.e.m(parcel, z36);
                return new u(i26, connectionConfiguration);
            case 19:
                int z37 = g6.e.z(parcel);
                int i27 = 0;
                ConnectionConfiguration[] connectionConfigurationArr = null;
                while (parcel.dataPosition() < z37) {
                    int readInt20 = parcel.readInt();
                    char c25 = (char) readInt20;
                    if (c25 == 2) {
                        i27 = g6.e.u(parcel, readInt20);
                    } else if (c25 != 3) {
                        g6.e.y(parcel, readInt20);
                    } else {
                        connectionConfigurationArr = (ConnectionConfiguration[]) g6.e.k(parcel, readInt20, ConnectionConfiguration.CREATOR);
                    }
                }
                g6.e.m(parcel, z37);
                return new v(i27, connectionConfigurationArr);
            case 20:
                int z38 = g6.e.z(parcel);
                int i28 = 0;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt21 = parcel.readInt();
                    char c26 = (char) readInt21;
                    if (c26 == 2) {
                        i28 = g6.e.u(parcel, readInt21);
                    } else if (c26 != 3) {
                        g6.e.y(parcel, readInt21);
                    } else {
                        arrayList3 = g6.e.l(parcel, readInt21, l0.CREATOR);
                    }
                }
                g6.e.m(parcel, z38);
                return new w(i28, arrayList3);
            case 21:
                int z39 = g6.e.z(parcel);
                int i29 = 0;
                k kVar = null;
                while (parcel.dataPosition() < z39) {
                    int readInt22 = parcel.readInt();
                    char c27 = (char) readInt22;
                    if (c27 == 2) {
                        i29 = g6.e.u(parcel, readInt22);
                    } else if (c27 != 3) {
                        g6.e.y(parcel, readInt22);
                    } else {
                        kVar = (k) g6.e.g(parcel, readInt22, k.CREATOR);
                    }
                }
                g6.e.m(parcel, z39);
                return new x(i29, kVar);
            case 22:
                int z40 = g6.e.z(parcel);
                int i30 = 0;
                String str8 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt23 = parcel.readInt();
                    char c28 = (char) readInt23;
                    if (c28 == 2) {
                        i30 = g6.e.u(parcel, readInt23);
                    } else if (c28 != 3) {
                        g6.e.y(parcel, readInt23);
                    } else {
                        str8 = g6.e.h(parcel, readInt23);
                    }
                }
                g6.e.m(parcel, z40);
                return new y(i30, str8);
            case 23:
                int z41 = g6.e.z(parcel);
                int i31 = 0;
                ParcelFileDescriptor parcelFileDescriptor3 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt24 = parcel.readInt();
                    char c29 = (char) readInt24;
                    if (c29 == 2) {
                        i31 = g6.e.u(parcel, readInt24);
                    } else if (c29 != 3) {
                        g6.e.y(parcel, readInt24);
                    } else {
                        parcelFileDescriptor3 = (ParcelFileDescriptor) g6.e.g(parcel, readInt24, ParcelFileDescriptor.CREATOR);
                    }
                }
                g6.e.m(parcel, z41);
                return new z(i31, parcelFileDescriptor3);
            case 24:
                int z42 = g6.e.z(parcel);
                int i32 = 0;
                l0 l0Var = null;
                while (parcel.dataPosition() < z42) {
                    int readInt25 = parcel.readInt();
                    char c30 = (char) readInt25;
                    if (c30 == 2) {
                        i32 = g6.e.u(parcel, readInt25);
                    } else if (c30 != 3) {
                        g6.e.y(parcel, readInt25);
                    } else {
                        l0Var = (l0) g6.e.g(parcel, readInt25, l0.CREATOR);
                    }
                }
                g6.e.m(parcel, z42);
                return new a0(i32, l0Var);
            case 25:
                int z43 = g6.e.z(parcel);
                int i33 = 0;
                String str9 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt26 = parcel.readInt();
                    char c31 = (char) readInt26;
                    if (c31 == 2) {
                        i33 = g6.e.u(parcel, readInt26);
                    } else if (c31 != 3) {
                        g6.e.y(parcel, readInt26);
                    } else {
                        str9 = g6.e.h(parcel, readInt26);
                    }
                }
                g6.e.m(parcel, z43);
                return new b0(i33, str9);
            case 26:
                int z44 = g6.e.z(parcel);
                String str10 = null;
                int i34 = 0;
                int i35 = 0;
                while (parcel.dataPosition() < z44) {
                    int readInt27 = parcel.readInt();
                    char c32 = (char) readInt27;
                    if (c32 == 1) {
                        str10 = g6.e.h(parcel, readInt27);
                    } else if (c32 == 2) {
                        i34 = g6.e.u(parcel, readInt27);
                    } else if (c32 != 3) {
                        g6.e.y(parcel, readInt27);
                    } else {
                        i35 = g6.e.u(parcel, readInt27);
                    }
                }
                g6.e.m(parcel, z44);
                return new a1(str10, i34, i35);
            case 27:
                int z45 = g6.e.z(parcel);
                int i36 = 0;
                String str11 = null;
                byte[] bArr2 = null;
                String str12 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt28 = parcel.readInt();
                    char c33 = (char) readInt28;
                    if (c33 == 2) {
                        i36 = g6.e.u(parcel, readInt28);
                    } else if (c33 == 3) {
                        str11 = g6.e.h(parcel, readInt28);
                    } else if (c33 == 4) {
                        bArr2 = g6.e.b(parcel, readInt28);
                    } else if (c33 != 5) {
                        g6.e.y(parcel, readInt28);
                    } else {
                        str12 = g6.e.h(parcel, readInt28);
                    }
                }
                g6.e.m(parcel, z45);
                return new k0(i36, str11, str12, bArr2);
            case 28:
                int z46 = g6.e.z(parcel);
                int i37 = 0;
                while (parcel.dataPosition() < z46) {
                    int readInt29 = parcel.readInt();
                    if (((char) readInt29) != 2) {
                        g6.e.y(parcel, readInt29);
                    } else {
                        i37 = g6.e.u(parcel, readInt29);
                    }
                }
                g6.e.m(parcel, z46);
                return new e0(i37);
            default:
                int z47 = g6.e.z(parcel);
                String str13 = null;
                int i38 = 0;
                boolean z48 = false;
                String str14 = null;
                while (parcel.dataPosition() < z47) {
                    int readInt30 = parcel.readInt();
                    char c34 = (char) readInt30;
                    if (c34 == 2) {
                        str13 = g6.e.h(parcel, readInt30);
                    } else if (c34 == 3) {
                        str14 = g6.e.h(parcel, readInt30);
                    } else if (c34 == 4) {
                        i38 = g6.e.u(parcel, readInt30);
                    } else if (c34 != 5) {
                        g6.e.y(parcel, readInt30);
                    } else {
                        z48 = g6.e.n(parcel, readInt30);
                    }
                }
                g6.e.m(parcel, z47);
                return new l0(i38, str13, str14, z48);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.a) {
            case 0:
                return new b[i3];
            case 1:
                return new e[i3];
            case 2:
                return new f[i3];
            case 3:
                return new g[i3];
            case 4:
                return new h[i3];
            case 5:
                return new i[i3];
            case 6:
                return new j[i3];
            case 7:
                return new DataItemAssetParcelable[i3];
            case 8:
                return new k[i3];
            case 9:
                return new l[i3];
            case 10:
                return new m[i3];
            case 11:
                return new n[i3];
            case 12:
                return new o[i3];
            case 13:
                return new p[i3];
            case 14:
                return new q[i3];
            case 15:
                return new r[i3];
            case 16:
                return new s[i3];
            case 17:
                return new t[i3];
            case 18:
                return new u[i3];
            case 19:
                return new v[i3];
            case 20:
                return new w[i3];
            case 21:
                return new x[i3];
            case 22:
                return new y[i3];
            case 23:
                return new z[i3];
            case 24:
                return new a0[i3];
            case 25:
                return new b0[i3];
            case 26:
                return new a1[i3];
            case 27:
                return new k0[i3];
            case 28:
                return new e0[i3];
            default:
                return new l0[i3];
        }
    }
}
