package l4;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import b7.w0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.wearable.ConnectionConfiguration;
import j7.l0;
import java.util.ArrayList;
import m.o0;
import q6.b0;
import q6.h0;
import q6.m;
import q6.m0;
import q6.n0;
import q6.p0;
import q6.q0;
import q6.t;
import q6.u;
import q6.v;
import q6.w;
import q6.x;
import q6.y;
import q6.z0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new k(parcel.readLong(), parcel.readLong());
            case 1:
                int z4 = l0.z(parcel);
                l5.d dVar = null;
                l5.a aVar = null;
                String str = null;
                l5.c cVar = null;
                l5.b bVar = null;
                boolean z10 = false;
                int i10 = 0;
                boolean z11 = false;
                while (parcel.dataPosition() < z4) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            dVar = (l5.d) l0.g(parcel, readInt, l5.d.CREATOR);
                            break;
                        case 2:
                            aVar = (l5.a) l0.g(parcel, readInt, l5.a.CREATOR);
                            break;
                        case 3:
                            str = l0.h(parcel, readInt);
                            break;
                        case 4:
                            z10 = l0.n(parcel, readInt);
                            break;
                        case 5:
                            i10 = l0.u(parcel, readInt);
                            break;
                        case 6:
                            cVar = (l5.c) l0.g(parcel, readInt, l5.c.CREATOR);
                            break;
                        case 7:
                            bVar = (l5.b) l0.g(parcel, readInt, l5.b.CREATOR);
                            break;
                        case '\b':
                            z11 = l0.n(parcel, readInt);
                            break;
                        default:
                            l0.y(parcel, readInt);
                            break;
                    }
                }
                l0.m(parcel, z4);
                return new l5.e(dVar, aVar, str, z10, i10, cVar, bVar, z11);
            case 2:
                int z12 = l0.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        l0.y(parcel, readInt2);
                    } else {
                        pendingIntent = (PendingIntent) l0.g(parcel, readInt2, PendingIntent.CREATOR);
                    }
                }
                l0.m(parcel, z12);
                return new l5.f(pendingIntent);
            case 3:
                int z13 = l0.z(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                ArrayList arrayList = null;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                while (parcel.dataPosition() < z13) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            z14 = l0.n(parcel, readInt3);
                            break;
                        case 2:
                            str2 = l0.h(parcel, readInt3);
                            break;
                        case 3:
                            str3 = l0.h(parcel, readInt3);
                            break;
                        case 4:
                            z15 = l0.n(parcel, readInt3);
                            break;
                        case 5:
                            str4 = l0.h(parcel, readInt3);
                            break;
                        case 6:
                            arrayList = l0.j(parcel, readInt3);
                            break;
                        case 7:
                            z16 = l0.n(parcel, readInt3);
                            break;
                        default:
                            l0.y(parcel, readInt3);
                            break;
                    }
                }
                l0.m(parcel, z13);
                return new l5.a(z14, str2, str3, z15, str4, arrayList, z16);
            case 4:
                int z17 = l0.z(parcel);
                String str5 = null;
                boolean z18 = false;
                while (parcel.dataPosition() < z17) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 1) {
                        z18 = l0.n(parcel, readInt4);
                    } else if (c3 != 2) {
                        l0.y(parcel, readInt4);
                    } else {
                        str5 = l0.h(parcel, readInt4);
                    }
                }
                l0.m(parcel, z17);
                return new l5.b(str5, z18);
            case 5:
                int z19 = l0.z(parcel);
                byte[] bArr = null;
                String str6 = null;
                boolean z20 = false;
                while (parcel.dataPosition() < z19) {
                    int readInt5 = parcel.readInt();
                    char c10 = (char) readInt5;
                    if (c10 == 1) {
                        z20 = l0.n(parcel, readInt5);
                    } else if (c10 == 2) {
                        bArr = l0.b(parcel, readInt5);
                    } else if (c10 != 3) {
                        l0.y(parcel, readInt5);
                    } else {
                        str6 = l0.h(parcel, readInt5);
                    }
                }
                l0.m(parcel, z19);
                return new l5.c(z20, bArr, str6);
            case 6:
                int z21 = l0.z(parcel);
                boolean z22 = false;
                while (parcel.dataPosition() < z21) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        l0.y(parcel, readInt6);
                    } else {
                        z22 = l0.n(parcel, readInt6);
                    }
                }
                l0.m(parcel, z21);
                return new l5.d(z22);
            case 7:
                int z23 = l0.z(parcel);
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                Uri uri = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                u uVar = null;
                while (parcel.dataPosition() < z23) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            str7 = l0.h(parcel, readInt7);
                            break;
                        case 2:
                            str8 = l0.h(parcel, readInt7);
                            break;
                        case 3:
                            str9 = l0.h(parcel, readInt7);
                            break;
                        case 4:
                            str10 = l0.h(parcel, readInt7);
                            break;
                        case 5:
                            uri = (Uri) l0.g(parcel, readInt7, Uri.CREATOR);
                            break;
                        case 6:
                            str11 = l0.h(parcel, readInt7);
                            break;
                        case 7:
                            str12 = l0.h(parcel, readInt7);
                            break;
                        case '\b':
                            str13 = l0.h(parcel, readInt7);
                            break;
                        case '\t':
                            uVar = (u) l0.g(parcel, readInt7, u.CREATOR);
                            break;
                        default:
                            l0.y(parcel, readInt7);
                            break;
                    }
                }
                l0.m(parcel, z23);
                return new l5.g(str7, str8, str9, str10, uri, str11, str12, str13, uVar);
            case 8:
                int z24 = l0.z(parcel);
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                ArrayList arrayList2 = null;
                int i11 = 0;
                int i12 = 0;
                boolean z25 = false;
                boolean z26 = false;
                boolean z27 = false;
                int i13 = 0;
                while (parcel.dataPosition() < z24) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            str14 = l0.h(parcel, readInt8);
                            break;
                        case 3:
                            str15 = l0.h(parcel, readInt8);
                            break;
                        case 4:
                            i11 = l0.u(parcel, readInt8);
                            break;
                        case 5:
                            i12 = l0.u(parcel, readInt8);
                            break;
                        case 6:
                            z25 = l0.n(parcel, readInt8);
                            break;
                        case 7:
                            z26 = l0.n(parcel, readInt8);
                            break;
                        case '\b':
                            str16 = l0.h(parcel, readInt8);
                            break;
                        case '\t':
                            z27 = l0.n(parcel, readInt8);
                            break;
                        case '\n':
                            str17 = l0.h(parcel, readInt8);
                            break;
                        case 11:
                            str18 = l0.h(parcel, readInt8);
                            break;
                        case '\f':
                            i13 = l0.u(parcel, readInt8);
                            break;
                        case '\r':
                            arrayList2 = l0.j(parcel, readInt8);
                            break;
                        default:
                            l0.y(parcel, readInt8);
                            break;
                    }
                }
                l0.m(parcel, z24);
                return new ConnectionConfiguration(str14, str15, i11, i12, z25, z26, str16, z27, str17, str18, i13, arrayList2);
            case 9:
                o0 o0Var = new o0(parcel);
                o0Var.a = parcel.readByte() != 0;
                return o0Var;
            case 10:
                return new m3.a(parcel);
            case 11:
                return new m3.b(parcel);
            case 12:
                return new m4.a(parcel);
            case 13:
                return new n4.b(parcel);
            case 14:
                return new o3.h(parcel);
            case 15:
                return new o3.g(parcel);
            case 16:
                int z28 = l0.z(parcel);
                Bundle bundle = null;
                int i14 = 0;
                int i15 = 0;
                while (parcel.dataPosition() < z28) {
                    int readInt9 = parcel.readInt();
                    char c11 = (char) readInt9;
                    if (c11 == 1) {
                        i14 = l0.u(parcel, readInt9);
                    } else if (c11 == 2) {
                        i15 = l0.u(parcel, readInt9);
                    } else if (c11 != 3) {
                        l0.y(parcel, readInt9);
                    } else {
                        bundle = l0.a(parcel, readInt9);
                    }
                }
                l0.m(parcel, z28);
                return new o5.a(i14, i15, bundle);
            case 17:
                int z29 = l0.z(parcel);
                String str19 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < z29) {
                    int readInt10 = parcel.readInt();
                    char c12 = (char) readInt10;
                    if (c12 == 2) {
                        str19 = l0.h(parcel, readInt10);
                    } else if (c12 != 5) {
                        l0.y(parcel, readInt10);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) l0.g(parcel, readInt10, GoogleSignInOptions.CREATOR);
                    }
                }
                l0.m(parcel, z29);
                return new SignInConfiguration(str19, googleSignInOptions);
            case 18:
                try {
                    return Transport.a(parcel.readString());
                } catch (o6.a e) {
                    throw new RuntimeException(e);
                }
            case 19:
                try {
                    return q6.c.a(parcel.readString());
                } catch (q6.b e6) {
                    throw new RuntimeException(e6);
                }
            case 20:
                int z30 = l0.z(parcel);
                boolean z31 = false;
                while (parcel.dataPosition() < z30) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        l0.y(parcel, readInt11);
                    } else {
                        z31 = l0.n(parcel, readInt11);
                    }
                }
                l0.m(parcel, z30);
                return new z0(z31);
            case 21:
                int z32 = l0.z(parcel);
                long j10 = 0;
                while (parcel.dataPosition() < z32) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        l0.y(parcel, readInt12);
                    } else {
                        j10 = l0.w(parcel, readInt12);
                    }
                }
                l0.m(parcel, z32);
                return new m0(j10);
            case 22:
                int z33 = l0.z(parcel);
                boolean z34 = false;
                while (parcel.dataPosition() < z33) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        l0.y(parcel, readInt13);
                    } else {
                        z34 = l0.n(parcel, readInt13);
                    }
                }
                l0.m(parcel, z33);
                return new n0(z34);
            case 23:
                int z35 = l0.z(parcel);
                boolean z36 = false;
                while (parcel.dataPosition() < z35) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        l0.y(parcel, readInt14);
                    } else {
                        z36 = l0.n(parcel, readInt14);
                    }
                }
                l0.m(parcel, z35);
                return new t(z36);
            case 24:
                int z37 = l0.z(parcel);
                String str20 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        l0.y(parcel, readInt15);
                    } else {
                        str20 = l0.h(parcel, readInt15);
                    }
                }
                l0.m(parcel, z37);
                return new q6.o0(str20);
            case 25:
                int z38 = l0.z(parcel);
                int i16 = 0;
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt16 = parcel.readInt();
                    char c13 = (char) readInt16;
                    if (c13 == 1) {
                        bArr2 = l0.b(parcel, readInt16);
                    } else if (c13 == 2) {
                        bArr3 = l0.b(parcel, readInt16);
                    } else if (c13 == 3) {
                        bArr4 = l0.b(parcel, readInt16);
                    } else if (c13 != 4) {
                        l0.y(parcel, readInt16);
                    } else {
                        i16 = l0.u(parcel, readInt16);
                    }
                }
                l0.m(parcel, z38);
                return new p0(bArr2 == null ? null : w0.t(bArr2.length, bArr2), bArr3 == null ? null : w0.t(bArr3.length, bArr3), bArr4 != null ? w0.t(bArr4.length, bArr4) : null, i16);
            case 26:
                int z39 = l0.z(parcel);
                byte[][] bArr5 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        l0.y(parcel, readInt17);
                    } else {
                        bArr5 = l0.c(parcel, readInt17);
                    }
                }
                l0.m(parcel, z39);
                return new q0(bArr5);
            case 27:
                int z40 = l0.z(parcel);
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
                q6.f fVar = null;
                String str22 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < z40) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            yVar = (y) l0.g(parcel, readInt18, y.CREATOR);
                            break;
                        case 3:
                            b0Var = (b0) l0.g(parcel, readInt18, b0.CREATOR);
                            break;
                        case 4:
                            bArr6 = l0.b(parcel, readInt18);
                            break;
                        case 5:
                            arrayList3 = l0.l(parcel, readInt18, x.CREATOR);
                            break;
                        case 6:
                            int x10 = l0.x(parcel, readInt18);
                            if (x10 != 0) {
                                l0.A(parcel, x10, 8);
                                d = Double.valueOf(parcel.readDouble());
                                break;
                            } else {
                                d = null;
                                break;
                            }
                        case 7:
                            arrayList4 = l0.l(parcel, readInt18, w.CREATOR);
                            break;
                        case '\b':
                            mVar = (m) l0.g(parcel, readInt18, m.CREATOR);
                            break;
                        case '\t':
                            num = l0.v(parcel, readInt18);
                            break;
                        case '\n':
                            h0Var = (h0) l0.g(parcel, readInt18, h0.CREATOR);
                            break;
                        case 11:
                            str21 = l0.h(parcel, readInt18);
                            break;
                        case '\f':
                            fVar = (q6.f) l0.g(parcel, readInt18, q6.f.CREATOR);
                            break;
                        case '\r':
                            str22 = l0.h(parcel, readInt18);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) l0.g(parcel, readInt18, ResultReceiver.CREATOR);
                            break;
                        default:
                            l0.y(parcel, readInt18);
                            break;
                    }
                }
                l0.m(parcel, z40);
                return new v(yVar, b0Var, bArr6, arrayList3, d, arrayList4, mVar, num, h0Var, str21, fVar, str22, resultReceiver);
            case 28:
                int z41 = l0.z(parcel);
                String str23 = null;
                String str24 = null;
                byte[] bArr7 = null;
                q6.j jVar = null;
                q6.i iVar = null;
                q6.k kVar = null;
                q6.g gVar = null;
                String str25 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            str23 = l0.h(parcel, readInt19);
                            break;
                        case 2:
                            str24 = l0.h(parcel, readInt19);
                            break;
                        case 3:
                            bArr7 = l0.b(parcel, readInt19);
                            break;
                        case 4:
                            jVar = (q6.j) l0.g(parcel, readInt19, q6.j.CREATOR);
                            break;
                        case 5:
                            iVar = (q6.i) l0.g(parcel, readInt19, q6.i.CREATOR);
                            break;
                        case 6:
                            kVar = (q6.k) l0.g(parcel, readInt19, q6.k.CREATOR);
                            break;
                        case 7:
                            gVar = (q6.g) l0.g(parcel, readInt19, q6.g.CREATOR);
                            break;
                        case '\b':
                            str25 = l0.h(parcel, readInt19);
                            break;
                        case '\t':
                            l0.h(parcel, readInt19);
                            break;
                        default:
                            l0.y(parcel, readInt19);
                            break;
                    }
                }
                l0.m(parcel, z41);
                return new u(str23, str24, bArr7, jVar, iVar, kVar, gVar, str25);
            default:
                int z42 = l0.z(parcel);
                String str26 = null;
                byte[] bArr8 = null;
                ArrayList arrayList5 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt20 = parcel.readInt();
                    char c14 = (char) readInt20;
                    if (c14 == 2) {
                        str26 = l0.h(parcel, readInt20);
                    } else if (c14 == 3) {
                        bArr8 = l0.b(parcel, readInt20);
                    } else if (c14 != 4) {
                        l0.y(parcel, readInt20);
                    } else {
                        arrayList5 = l0.l(parcel, readInt20, Transport.CREATOR);
                    }
                }
                l0.m(parcel, z42);
                return new w(str26, bArr8, arrayList5);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new k[i10];
            case 1:
                return new l5.e[i10];
            case 2:
                return new l5.f[i10];
            case 3:
                return new l5.a[i10];
            case 4:
                return new l5.b[i10];
            case 5:
                return new l5.c[i10];
            case 6:
                return new l5.d[i10];
            case 7:
                return new l5.g[i10];
            case 8:
                return new ConnectionConfiguration[i10];
            case 9:
                return new o0[i10];
            case 10:
                return new m3.a[i10];
            case 11:
                return new m3.b[i10];
            case 12:
                return new m4.a[i10];
            case 13:
                return new n4.b[i10];
            case 14:
                return new o3.h[i10];
            case 15:
                return new o3.g[i10];
            case 16:
                return new o5.a[i10];
            case 17:
                return new SignInConfiguration[i10];
            case 18:
                return new Transport[i10];
            case 19:
                return new q6.c[i10];
            case 20:
                return new z0[i10];
            case 21:
                return new m0[i10];
            case 22:
                return new n0[i10];
            case 23:
                return new t[i10];
            case 24:
                return new q6.o0[i10];
            case 25:
                return new p0[i10];
            case 26:
                return new q0[i10];
            case 27:
                return new v[i10];
            case 28:
                return new u[i10];
            default:
                return new w[i10];
        }
    }
}
