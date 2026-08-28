package h5;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.wearable.ConnectionConfiguration;
import g7.o8;
import java.util.ArrayList;
import m.o0;
import m6.a0;
import m6.b0;
import m6.h0;
import m6.j;
import m6.k;
import m6.m;
import m6.m0;
import m6.n0;
import m6.p0;
import m6.q0;
import m6.t;
import m6.u;
import m6.v;
import m6.w;
import m6.x;
import m6.y;
import m6.z;
import m6.z0;
import x6.s0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i9) {
        this.a = i9;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = o8.z(parcel);
                d dVar = null;
                a aVar = null;
                String str = null;
                c cVar = null;
                b bVar = null;
                boolean z11 = false;
                int i9 = 0;
                boolean z12 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            dVar = (d) o8.g(parcel, readInt, d.CREATOR);
                            break;
                        case 2:
                            aVar = (a) o8.g(parcel, readInt, a.CREATOR);
                            break;
                        case 3:
                            str = o8.h(parcel, readInt);
                            break;
                        case 4:
                            z11 = o8.n(parcel, readInt);
                            break;
                        case 5:
                            i9 = o8.u(parcel, readInt);
                            break;
                        case 6:
                            cVar = (c) o8.g(parcel, readInt, c.CREATOR);
                            break;
                        case 7:
                            bVar = (b) o8.g(parcel, readInt, b.CREATOR);
                            break;
                        case '\b':
                            z12 = o8.n(parcel, readInt);
                            break;
                        default:
                            o8.y(parcel, readInt);
                            break;
                    }
                }
                o8.m(parcel, z10);
                return new e(dVar, aVar, str, z11, i9, cVar, bVar, z12);
            case 1:
                int z13 = o8.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z13) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        o8.y(parcel, readInt2);
                    } else {
                        pendingIntent = (PendingIntent) o8.g(parcel, readInt2, PendingIntent.CREATOR);
                    }
                }
                o8.m(parcel, z13);
                return new f(pendingIntent);
            case 2:
                int z14 = o8.z(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                ArrayList arrayList = null;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                while (parcel.dataPosition() < z14) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            z15 = o8.n(parcel, readInt3);
                            break;
                        case 2:
                            str2 = o8.h(parcel, readInt3);
                            break;
                        case 3:
                            str3 = o8.h(parcel, readInt3);
                            break;
                        case 4:
                            z16 = o8.n(parcel, readInt3);
                            break;
                        case 5:
                            str4 = o8.h(parcel, readInt3);
                            break;
                        case 6:
                            arrayList = o8.j(parcel, readInt3);
                            break;
                        case 7:
                            z17 = o8.n(parcel, readInt3);
                            break;
                        default:
                            o8.y(parcel, readInt3);
                            break;
                    }
                }
                o8.m(parcel, z14);
                return new a(z15, str2, str3, z16, str4, arrayList, z17);
            case 3:
                int z18 = o8.z(parcel);
                String str5 = null;
                boolean z19 = false;
                while (parcel.dataPosition() < z18) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 == 1) {
                        z19 = o8.n(parcel, readInt4);
                    } else if (c10 != 2) {
                        o8.y(parcel, readInt4);
                    } else {
                        str5 = o8.h(parcel, readInt4);
                    }
                }
                o8.m(parcel, z18);
                return new b(str5, z19);
            case 4:
                int z20 = o8.z(parcel);
                byte[] bArr = null;
                String str6 = null;
                boolean z21 = false;
                while (parcel.dataPosition() < z20) {
                    int readInt5 = parcel.readInt();
                    char c11 = (char) readInt5;
                    if (c11 == 1) {
                        z21 = o8.n(parcel, readInt5);
                    } else if (c11 == 2) {
                        bArr = o8.b(parcel, readInt5);
                    } else if (c11 != 3) {
                        o8.y(parcel, readInt5);
                    } else {
                        str6 = o8.h(parcel, readInt5);
                    }
                }
                o8.m(parcel, z20);
                return new c(z21, bArr, str6);
            case 5:
                int z22 = o8.z(parcel);
                boolean z23 = false;
                while (parcel.dataPosition() < z22) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        o8.y(parcel, readInt6);
                    } else {
                        z23 = o8.n(parcel, readInt6);
                    }
                }
                o8.m(parcel, z22);
                return new d(z23);
            case 6:
                int z24 = o8.z(parcel);
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                Uri uri = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                u uVar = null;
                while (parcel.dataPosition() < z24) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            str7 = o8.h(parcel, readInt7);
                            break;
                        case 2:
                            str8 = o8.h(parcel, readInt7);
                            break;
                        case 3:
                            str9 = o8.h(parcel, readInt7);
                            break;
                        case 4:
                            str10 = o8.h(parcel, readInt7);
                            break;
                        case 5:
                            uri = (Uri) o8.g(parcel, readInt7, Uri.CREATOR);
                            break;
                        case 6:
                            str11 = o8.h(parcel, readInt7);
                            break;
                        case 7:
                            str12 = o8.h(parcel, readInt7);
                            break;
                        case '\b':
                            str13 = o8.h(parcel, readInt7);
                            break;
                        case '\t':
                            uVar = (u) o8.g(parcel, readInt7, u.CREATOR);
                            break;
                        default:
                            o8.y(parcel, readInt7);
                            break;
                    }
                }
                o8.m(parcel, z24);
                return new g(str7, str8, str9, str10, uri, str11, str12, str13, uVar);
            case 7:
                int z25 = o8.z(parcel);
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                ArrayList arrayList2 = null;
                int i10 = 0;
                int i11 = 0;
                boolean z26 = false;
                boolean z27 = false;
                boolean z28 = false;
                int i12 = 0;
                while (parcel.dataPosition() < z25) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            str14 = o8.h(parcel, readInt8);
                            break;
                        case 3:
                            str15 = o8.h(parcel, readInt8);
                            break;
                        case 4:
                            i10 = o8.u(parcel, readInt8);
                            break;
                        case 5:
                            i11 = o8.u(parcel, readInt8);
                            break;
                        case 6:
                            z26 = o8.n(parcel, readInt8);
                            break;
                        case 7:
                            z27 = o8.n(parcel, readInt8);
                            break;
                        case '\b':
                            str16 = o8.h(parcel, readInt8);
                            break;
                        case '\t':
                            z28 = o8.n(parcel, readInt8);
                            break;
                        case '\n':
                            str17 = o8.h(parcel, readInt8);
                            break;
                        case 11:
                            str18 = o8.h(parcel, readInt8);
                            break;
                        case '\f':
                            i12 = o8.u(parcel, readInt8);
                            break;
                        case '\r':
                            arrayList2 = o8.j(parcel, readInt8);
                            break;
                        default:
                            o8.y(parcel, readInt8);
                            break;
                    }
                }
                o8.m(parcel, z25);
                return new ConnectionConfiguration(str14, str15, i10, i11, z26, z27, str16, z28, str17, str18, i12, arrayList2);
            case 8:
                return new i4.b(parcel);
            case 9:
                int z29 = o8.z(parcel);
                Bundle bundle = null;
                int i13 = 0;
                int i14 = 0;
                while (parcel.dataPosition() < z29) {
                    int readInt9 = parcel.readInt();
                    char c12 = (char) readInt9;
                    if (c12 == 1) {
                        i13 = o8.u(parcel, readInt9);
                    } else if (c12 == 2) {
                        i14 = o8.u(parcel, readInt9);
                    } else if (c12 != 3) {
                        o8.y(parcel, readInt9);
                    } else {
                        bundle = o8.a(parcel, readInt9);
                    }
                }
                o8.m(parcel, z29);
                return new k5.a(i13, i14, bundle);
            case 10:
                int z30 = o8.z(parcel);
                String str19 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < z30) {
                    int readInt10 = parcel.readInt();
                    char c13 = (char) readInt10;
                    if (c13 == 2) {
                        str19 = o8.h(parcel, readInt10);
                    } else if (c13 != 5) {
                        o8.y(parcel, readInt10);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) o8.g(parcel, readInt10, GoogleSignInOptions.CREATOR);
                    }
                }
                o8.m(parcel, z30);
                return new SignInConfiguration(str19, googleSignInOptions);
            case 11:
                try {
                    return Transport.a(parcel.readString());
                } catch (k6.a e10) {
                    throw new RuntimeException(e10);
                }
            case 12:
                return new ParcelImpl(parcel);
            case 13:
                return new l3.c(parcel);
            case 14:
                return new l3.b(parcel);
            case 15:
                o0 o0Var = new o0(parcel);
                o0Var.a = parcel.readByte() != 0;
                return o0Var;
            case 16:
                try {
                    return m6.c.a(parcel.readString());
                } catch (m6.b e11) {
                    throw new RuntimeException(e11);
                }
            case 17:
                int z31 = o8.z(parcel);
                boolean z32 = false;
                while (parcel.dataPosition() < z31) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        o8.y(parcel, readInt11);
                    } else {
                        z32 = o8.n(parcel, readInt11);
                    }
                }
                o8.m(parcel, z31);
                return new z0(z32);
            case 18:
                int z33 = o8.z(parcel);
                long j10 = 0;
                while (parcel.dataPosition() < z33) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        o8.y(parcel, readInt12);
                    } else {
                        j10 = o8.w(parcel, readInt12);
                    }
                }
                o8.m(parcel, z33);
                return new m0(j10);
            case 19:
                int z34 = o8.z(parcel);
                boolean z35 = false;
                while (parcel.dataPosition() < z34) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        o8.y(parcel, readInt13);
                    } else {
                        z35 = o8.n(parcel, readInt13);
                    }
                }
                o8.m(parcel, z34);
                return new n0(z35);
            case 20:
                int z36 = o8.z(parcel);
                boolean z37 = false;
                while (parcel.dataPosition() < z36) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        o8.y(parcel, readInt14);
                    } else {
                        z37 = o8.n(parcel, readInt14);
                    }
                }
                o8.m(parcel, z36);
                return new t(z37);
            case 21:
                int z38 = o8.z(parcel);
                String str20 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        o8.y(parcel, readInt15);
                    } else {
                        str20 = o8.h(parcel, readInt15);
                    }
                }
                o8.m(parcel, z38);
                return new m6.o0(str20);
            case 22:
                int z39 = o8.z(parcel);
                int i15 = 0;
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt16 = parcel.readInt();
                    char c14 = (char) readInt16;
                    if (c14 == 1) {
                        bArr2 = o8.b(parcel, readInt16);
                    } else if (c14 == 2) {
                        bArr3 = o8.b(parcel, readInt16);
                    } else if (c14 == 3) {
                        bArr4 = o8.b(parcel, readInt16);
                    } else if (c14 != 4) {
                        o8.y(parcel, readInt16);
                    } else {
                        i15 = o8.u(parcel, readInt16);
                    }
                }
                o8.m(parcel, z39);
                return new p0(bArr2 == null ? null : s0.t(bArr2.length, bArr2), bArr3 == null ? null : s0.t(bArr3.length, bArr3), bArr4 != null ? s0.t(bArr4.length, bArr4) : null, i15);
            case 23:
                int z40 = o8.z(parcel);
                byte[][] bArr5 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        o8.y(parcel, readInt17);
                    } else {
                        bArr5 = o8.c(parcel, readInt17);
                    }
                }
                o8.m(parcel, z40);
                return new q0(bArr5);
            case 24:
                int z41 = o8.z(parcel);
                y yVar = null;
                b0 b0Var = null;
                byte[] bArr6 = null;
                ArrayList arrayList3 = null;
                Double d = null;
                ArrayList arrayList4 = null;
                m mVar = null;
                Integer num = null;
                h0 h0Var = null;
                String str21 = null;
                m6.f fVar = null;
                String str22 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < z41) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            yVar = (y) o8.g(parcel, readInt18, y.CREATOR);
                            break;
                        case 3:
                            b0Var = (b0) o8.g(parcel, readInt18, b0.CREATOR);
                            break;
                        case 4:
                            bArr6 = o8.b(parcel, readInt18);
                            break;
                        case 5:
                            arrayList3 = o8.l(parcel, readInt18, x.CREATOR);
                            break;
                        case 6:
                            int x10 = o8.x(parcel, readInt18);
                            if (x10 != 0) {
                                o8.A(parcel, x10, 8);
                                d = Double.valueOf(parcel.readDouble());
                                break;
                            } else {
                                d = null;
                                break;
                            }
                        case 7:
                            arrayList4 = o8.l(parcel, readInt18, w.CREATOR);
                            break;
                        case '\b':
                            mVar = (m) o8.g(parcel, readInt18, m.CREATOR);
                            break;
                        case '\t':
                            num = o8.v(parcel, readInt18);
                            break;
                        case '\n':
                            h0Var = (h0) o8.g(parcel, readInt18, h0.CREATOR);
                            break;
                        case 11:
                            str21 = o8.h(parcel, readInt18);
                            break;
                        case '\f':
                            fVar = (m6.f) o8.g(parcel, readInt18, m6.f.CREATOR);
                            break;
                        case '\r':
                            str22 = o8.h(parcel, readInt18);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) o8.g(parcel, readInt18, ResultReceiver.CREATOR);
                            break;
                        default:
                            o8.y(parcel, readInt18);
                            break;
                    }
                }
                o8.m(parcel, z41);
                return new v(yVar, b0Var, bArr6, arrayList3, d, arrayList4, mVar, num, h0Var, str21, fVar, str22, resultReceiver);
            case 25:
                int z42 = o8.z(parcel);
                String str23 = null;
                String str24 = null;
                byte[] bArr7 = null;
                j jVar = null;
                m6.i iVar = null;
                k kVar = null;
                m6.g gVar = null;
                String str25 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            str23 = o8.h(parcel, readInt19);
                            break;
                        case 2:
                            str24 = o8.h(parcel, readInt19);
                            break;
                        case 3:
                            bArr7 = o8.b(parcel, readInt19);
                            break;
                        case 4:
                            jVar = (j) o8.g(parcel, readInt19, j.CREATOR);
                            break;
                        case 5:
                            iVar = (m6.i) o8.g(parcel, readInt19, m6.i.CREATOR);
                            break;
                        case 6:
                            kVar = (k) o8.g(parcel, readInt19, k.CREATOR);
                            break;
                        case 7:
                            gVar = (m6.g) o8.g(parcel, readInt19, m6.g.CREATOR);
                            break;
                        case '\b':
                            str25 = o8.h(parcel, readInt19);
                            break;
                        case '\t':
                            o8.h(parcel, readInt19);
                            break;
                        default:
                            o8.y(parcel, readInt19);
                            break;
                    }
                }
                o8.m(parcel, z42);
                return new u(str23, str24, bArr7, jVar, iVar, kVar, gVar, str25);
            case 26:
                int z43 = o8.z(parcel);
                String str26 = null;
                byte[] bArr8 = null;
                ArrayList arrayList5 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt20 = parcel.readInt();
                    char c15 = (char) readInt20;
                    if (c15 == 2) {
                        str26 = o8.h(parcel, readInt20);
                    } else if (c15 == 3) {
                        bArr8 = o8.b(parcel, readInt20);
                    } else if (c15 != 4) {
                        o8.y(parcel, readInt20);
                    } else {
                        arrayList5 = o8.l(parcel, readInt20, Transport.CREATOR);
                    }
                }
                o8.m(parcel, z43);
                return new w(str26, bArr8, arrayList5);
            case 27:
                int z44 = o8.z(parcel);
                String str27 = null;
                Integer num2 = null;
                while (parcel.dataPosition() < z44) {
                    int readInt21 = parcel.readInt();
                    char c16 = (char) readInt21;
                    if (c16 == 2) {
                        str27 = o8.h(parcel, readInt21);
                    } else if (c16 != 3) {
                        o8.y(parcel, readInt21);
                    } else {
                        num2 = o8.v(parcel, readInt21);
                    }
                }
                o8.m(parcel, z44);
                return new x(str27, num2.intValue());
            case 28:
                int z45 = o8.z(parcel);
                String str28 = null;
                String str29 = null;
                String str30 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt22 = parcel.readInt();
                    char c17 = (char) readInt22;
                    if (c17 == 2) {
                        str28 = o8.h(parcel, readInt22);
                    } else if (c17 == 3) {
                        str29 = o8.h(parcel, readInt22);
                    } else if (c17 != 4) {
                        o8.y(parcel, readInt22);
                    } else {
                        str30 = o8.h(parcel, readInt22);
                    }
                }
                o8.m(parcel, z45);
                return new y(str28, str29, str30);
            default:
                try {
                    return a0.a(parcel.readString());
                } catch (z e12) {
                    throw new RuntimeException(e12);
                }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.a) {
            case 0:
                return new e[i9];
            case 1:
                return new f[i9];
            case 2:
                return new a[i9];
            case 3:
                return new b[i9];
            case 4:
                return new c[i9];
            case 5:
                return new d[i9];
            case 6:
                return new g[i9];
            case 7:
                return new ConnectionConfiguration[i9];
            case 8:
                return new i4.b[i9];
            case 9:
                return new k5.a[i9];
            case 10:
                return new SignInConfiguration[i9];
            case 11:
                return new Transport[i9];
            case 12:
                return new ParcelImpl[i9];
            case 13:
                return new l3.c[i9];
            case 14:
                return new l3.b[i9];
            case 15:
                return new o0[i9];
            case 16:
                return new m6.c[i9];
            case 17:
                return new z0[i9];
            case 18:
                return new m0[i9];
            case 19:
                return new n0[i9];
            case 20:
                return new t[i9];
            case 21:
                return new m6.o0[i9];
            case 22:
                return new p0[i9];
            case 23:
                return new q0[i9];
            case 24:
                return new v[i9];
            case 25:
                return new u[i9];
            case 26:
                return new w[i9];
            case 27:
                return new x[i9];
            case 28:
                return new y[i9];
            default:
                return new a0[i9];
        }
    }
}
