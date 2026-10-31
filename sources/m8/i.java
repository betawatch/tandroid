package m8;

import android.accounts.Account;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import e2.l0;
import java.util.ArrayList;
import n4.o;
import n4.p;
import n4.v;
import n4.w;
import n4.x;
import n6.f0;
import n6.j;
import n6.n;
import n6.u;
import p7.k;
import p7.l;
import p7.m;
import w7.g0;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i10) {
        this.a = i10;
    }

    public static void a(n6.f fVar, Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        int i11 = fVar.a;
        h0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = fVar.b;
        h0.s(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = fVar.c;
        h0.s(parcel, 3, 4);
        parcel.writeInt(i13);
        h0.l(parcel, 4, fVar.d);
        h0.f(parcel, 5, fVar.e);
        h0.o(parcel, 6, fVar.f, i10);
        h0.b(parcel, 7, fVar.h);
        h0.k(parcel, 8, fVar.n, i10);
        h0.o(parcel, 10, fVar.r, i10);
        h0.o(parcel, 11, fVar.s, i10);
        boolean z10 = fVar.w;
        h0.s(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i14 = fVar.x;
        h0.s(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z11 = fVar.y;
        h0.s(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        h0.l(parcel, 15, fVar.D);
        h0.r(parcel, q6);
    }

    /* JADX WARN: Removed duplicated region for block: B:638:0x062a  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createFromParcel(Parcel parcel) {
        Uri uri;
        switch (this.a) {
            case 0:
                int z10 = g0.z(parcel);
                int i10 = 0;
                boolean z11 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 2) {
                        i10 = g0.u(parcel, readInt);
                    } else if (c10 != 3) {
                        g0.y(parcel, readInt);
                    } else {
                        z11 = g0.n(parcel, readInt);
                    }
                }
                g0.m(parcel, z10);
                return new h(i10, z11);
            case 1:
                int z12 = g0.z(parcel);
                String str = null;
                byte[] bArr = null;
                long j10 = 0;
                DataHolder dataHolder = null;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 2) {
                        str = g0.h(parcel, readInt2);
                    } else if (c11 == 3) {
                        dataHolder = (DataHolder) g0.g(parcel, readInt2, DataHolder.CREATOR);
                    } else if (c11 == 4) {
                        parcelFileDescriptor = (ParcelFileDescriptor) g0.g(parcel, readInt2, ParcelFileDescriptor.CREATOR);
                    } else if (c11 == 5) {
                        j10 = g0.w(parcel, readInt2);
                    } else if (c11 != 6) {
                        g0.y(parcel, readInt2);
                    } else {
                        bArr = g0.b(parcel, readInt2);
                    }
                }
                g0.m(parcel, z12);
                b bVar = new b();
                bVar.a = str;
                bVar.b = dataHolder;
                bVar.c = parcelFileDescriptor;
                bVar.d = j10;
                bVar.e = bArr;
                return bVar;
            case 2:
                MediaDescription mediaDescription = (MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel);
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle o10 = l0.o(mediaDescription.getExtras());
                if (o10 != null) {
                    o10 = new Bundle(o10);
                }
                Bundle bundle = null;
                if (o10 != null) {
                    uri = (Uri) o10.getParcelable("android.support.v4.media.description.MEDIA_URI");
                    if (uri != null) {
                        if (!o10.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || o10.size() != 2) {
                            o10.remove("android.support.v4.media.description.MEDIA_URI");
                            o10.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                        }
                        if (uri == null) {
                            uri = mediaDescription.getMediaUri();
                        }
                        n4.h hVar = new n4.h(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
                        hVar.s = mediaDescription;
                        return hVar;
                    }
                } else {
                    uri = null;
                }
                bundle = o10;
                if (uri == null) {
                }
                n4.h hVar2 = new n4.h(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
                hVar2.s = mediaDescription;
                return hVar2;
            case 3:
                return new n4.i(parcel);
            case 4:
                return new o(parcel);
            case 5:
                MediaSession.Token token = (MediaSession.Token) parcel.readParcelable(null);
                token.getClass();
                return new p(token, null);
            case 6:
                return new w(parcel);
            case 7:
                return new v(parcel);
            case 8:
                return new x(parcel.readInt(), parcel.readFloat());
            case 9:
                int z13 = g0.z(parcel);
                String str2 = null;
                int i11 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 1) {
                        i11 = g0.u(parcel, readInt3);
                    } else if (c12 != 2) {
                        g0.y(parcel, readInt3);
                    } else {
                        str2 = g0.h(parcel, readInt3);
                    }
                }
                g0.m(parcel, z13);
                return new n6.d(i11, str2);
            case 10:
                int z14 = g0.z(parcel);
                ArrayList arrayList = null;
                int i12 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 == 1) {
                        i12 = g0.u(parcel, readInt4);
                    } else if (c13 != 2) {
                        g0.y(parcel, readInt4);
                    } else {
                        arrayList = g0.l(parcel, readInt4, j.CREATOR);
                    }
                }
                g0.m(parcel, z14);
                return new n6.o(i12, arrayList);
            case 11:
                int z15 = g0.z(parcel);
                int i13 = -1;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                String str3 = null;
                String str4 = null;
                long j11 = 0;
                long j12 = 0;
                while (parcel.dataPosition() < z15) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            i14 = g0.u(parcel, readInt5);
                            break;
                        case 2:
                            i15 = g0.u(parcel, readInt5);
                            break;
                        case 3:
                            i16 = g0.u(parcel, readInt5);
                            break;
                        case 4:
                            j11 = g0.w(parcel, readInt5);
                            break;
                        case 5:
                            j12 = g0.w(parcel, readInt5);
                            break;
                        case 6:
                            str3 = g0.h(parcel, readInt5);
                            break;
                        case 7:
                            str4 = g0.h(parcel, readInt5);
                            break;
                        case '\b':
                            i17 = g0.u(parcel, readInt5);
                            break;
                        case '\t':
                            i13 = g0.u(parcel, readInt5);
                            break;
                        default:
                            g0.y(parcel, readInt5);
                            break;
                    }
                }
                g0.m(parcel, z15);
                return new j(i14, i15, i16, j11, j12, str3, str4, i17, i13);
            case 12:
                int z16 = g0.z(parcel);
                Account account = null;
                int i18 = 0;
                int i19 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < z16) {
                    int readInt6 = parcel.readInt();
                    char c14 = (char) readInt6;
                    if (c14 == 1) {
                        i18 = g0.u(parcel, readInt6);
                    } else if (c14 == 2) {
                        account = (Account) g0.g(parcel, readInt6, Account.CREATOR);
                    } else if (c14 == 3) {
                        i19 = g0.u(parcel, readInt6);
                    } else if (c14 != 4) {
                        g0.y(parcel, readInt6);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) g0.g(parcel, readInt6, GoogleSignInAccount.CREATOR);
                    }
                }
                g0.m(parcel, z16);
                return new u(i18, account, i19, googleSignInAccount);
            case 13:
                int z17 = g0.z(parcel);
                int i20 = 0;
                boolean z18 = false;
                boolean z19 = false;
                IBinder iBinder = null;
                k6.a aVar = null;
                while (parcel.dataPosition() < z17) {
                    int readInt7 = parcel.readInt();
                    char c15 = (char) readInt7;
                    if (c15 == 1) {
                        i20 = g0.u(parcel, readInt7);
                    } else if (c15 == 2) {
                        iBinder = g0.t(parcel, readInt7);
                    } else if (c15 == 3) {
                        aVar = (k6.a) g0.g(parcel, readInt7, k6.a.CREATOR);
                    } else if (c15 == 4) {
                        z18 = g0.n(parcel, readInt7);
                    } else if (c15 != 5) {
                        g0.y(parcel, readInt7);
                    } else {
                        z19 = g0.n(parcel, readInt7);
                    }
                }
                g0.m(parcel, z17);
                return new n6.v(i20, iBinder, aVar, z18, z19);
            case 14:
                int z20 = g0.z(parcel);
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                boolean z21 = false;
                boolean z22 = false;
                while (parcel.dataPosition() < z20) {
                    int readInt8 = parcel.readInt();
                    char c16 = (char) readInt8;
                    if (c16 == 1) {
                        i21 = g0.u(parcel, readInt8);
                    } else if (c16 == 2) {
                        z21 = g0.n(parcel, readInt8);
                    } else if (c16 == 3) {
                        z22 = g0.n(parcel, readInt8);
                    } else if (c16 == 4) {
                        i22 = g0.u(parcel, readInt8);
                    } else if (c16 != 5) {
                        g0.y(parcel, readInt8);
                    } else {
                        i23 = g0.u(parcel, readInt8);
                    }
                }
                g0.m(parcel, z20);
                return new n(i21, i22, i23, z21, z22);
            case 15:
                return new BinderWrapper(parcel);
            case 16:
                int z23 = g0.z(parcel);
                Bundle bundle2 = null;
                n6.e eVar = null;
                int i24 = 0;
                k6.c[] cVarArr = null;
                while (parcel.dataPosition() < z23) {
                    int readInt9 = parcel.readInt();
                    char c17 = (char) readInt9;
                    if (c17 == 1) {
                        bundle2 = g0.a(parcel, readInt9);
                    } else if (c17 == 2) {
                        cVarArr = (k6.c[]) g0.k(parcel, readInt9, k6.c.CREATOR);
                    } else if (c17 == 3) {
                        i24 = g0.u(parcel, readInt9);
                    } else if (c17 != 4) {
                        g0.y(parcel, readInt9);
                    } else {
                        eVar = (n6.e) g0.g(parcel, readInt9, n6.e.CREATOR);
                    }
                }
                g0.m(parcel, z23);
                f0 f0Var = new f0();
                f0Var.a = bundle2;
                f0Var.b = cVarArr;
                f0Var.c = i24;
                f0Var.d = eVar;
                return f0Var;
            case 17:
                int z24 = g0.z(parcel);
                n nVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z25 = false;
                boolean z26 = false;
                int i25 = 0;
                while (parcel.dataPosition() < z24) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            nVar = (n) g0.g(parcel, readInt10, n.CREATOR);
                            break;
                        case 2:
                            z25 = g0.n(parcel, readInt10);
                            break;
                        case 3:
                            z26 = g0.n(parcel, readInt10);
                            break;
                        case 4:
                            iArr = g0.d(parcel, readInt10);
                            break;
                        case 5:
                            i25 = g0.u(parcel, readInt10);
                            break;
                        case 6:
                            iArr2 = g0.d(parcel, readInt10);
                            break;
                        default:
                            g0.y(parcel, readInt10);
                            break;
                    }
                }
                g0.m(parcel, z24);
                return new n6.e(nVar, z25, z26, iArr, i25, iArr2);
            case 18:
                int z27 = g0.z(parcel);
                Bundle bundle3 = new Bundle();
                Scope[] scopeArr = n6.f.E;
                String str5 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str6 = null;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                boolean z28 = false;
                int i29 = 0;
                boolean z29 = false;
                k6.c[] cVarArr2 = n6.f.F;
                k6.c[] cVarArr3 = cVarArr2;
                while (parcel.dataPosition() < z27) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            i26 = g0.u(parcel, readInt11);
                            break;
                        case 2:
                            i27 = g0.u(parcel, readInt11);
                            break;
                        case 3:
                            i28 = g0.u(parcel, readInt11);
                            break;
                        case 4:
                            str5 = g0.h(parcel, readInt11);
                            break;
                        case 5:
                            iBinder2 = g0.t(parcel, readInt11);
                            break;
                        case 6:
                            scopeArr = (Scope[]) g0.k(parcel, readInt11, Scope.CREATOR);
                            break;
                        case 7:
                            bundle3 = g0.a(parcel, readInt11);
                            break;
                        case '\b':
                            account2 = (Account) g0.g(parcel, readInt11, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            g0.y(parcel, readInt11);
                            break;
                        case '\n':
                            cVarArr2 = (k6.c[]) g0.k(parcel, readInt11, k6.c.CREATOR);
                            break;
                        case 11:
                            cVarArr3 = (k6.c[]) g0.k(parcel, readInt11, k6.c.CREATOR);
                            break;
                        case '\f':
                            z28 = g0.n(parcel, readInt11);
                            break;
                        case '\r':
                            i29 = g0.u(parcel, readInt11);
                            break;
                        case 14:
                            z29 = g0.n(parcel, readInt11);
                            break;
                        case 15:
                            str6 = g0.h(parcel, readInt11);
                            break;
                    }
                }
                g0.m(parcel, z27);
                return new n6.f(i26, i27, i28, str5, iBinder2, scopeArr, bundle3, account2, cVarArr2, cVarArr3, z28, i29, z29, str6);
            case 19:
                int z30 = g0.z(parcel);
                Intent intent = null;
                int i30 = 0;
                int i31 = 0;
                while (parcel.dataPosition() < z30) {
                    int readInt12 = parcel.readInt();
                    char c18 = (char) readInt12;
                    if (c18 == 1) {
                        i30 = g0.u(parcel, readInt12);
                    } else if (c18 == 2) {
                        i31 = g0.u(parcel, readInt12);
                    } else if (c18 != 3) {
                        g0.y(parcel, readInt12);
                    } else {
                        intent = (Intent) g0.g(parcel, readInt12, Intent.CREATOR);
                    }
                }
                g0.m(parcel, z30);
                return new o8.b(i30, i31, intent);
            case 20:
                int z31 = g0.z(parcel);
                ArrayList arrayList2 = null;
                String str7 = null;
                while (parcel.dataPosition() < z31) {
                    int readInt13 = parcel.readInt();
                    char c19 = (char) readInt13;
                    if (c19 == 1) {
                        arrayList2 = g0.j(parcel, readInt13);
                    } else if (c19 != 2) {
                        g0.y(parcel, readInt13);
                    } else {
                        str7 = g0.h(parcel, readInt13);
                    }
                }
                g0.m(parcel, z31);
                return new o8.f(str7, arrayList2);
            case 21:
                int z32 = g0.z(parcel);
                u uVar = null;
                int i32 = 0;
                while (parcel.dataPosition() < z32) {
                    int readInt14 = parcel.readInt();
                    char c20 = (char) readInt14;
                    if (c20 == 1) {
                        i32 = g0.u(parcel, readInt14);
                    } else if (c20 != 2) {
                        g0.y(parcel, readInt14);
                    } else {
                        uVar = (u) g0.g(parcel, readInt14, u.CREATOR);
                    }
                }
                g0.m(parcel, z32);
                return new o8.g(i32, uVar);
            case 22:
                int z33 = g0.z(parcel);
                k6.a aVar2 = null;
                int i33 = 0;
                n6.v vVar = null;
                while (parcel.dataPosition() < z33) {
                    int readInt15 = parcel.readInt();
                    char c21 = (char) readInt15;
                    if (c21 == 1) {
                        i33 = g0.u(parcel, readInt15);
                    } else if (c21 == 2) {
                        aVar2 = (k6.a) g0.g(parcel, readInt15, k6.a.CREATOR);
                    } else if (c21 != 3) {
                        g0.y(parcel, readInt15);
                    } else {
                        vVar = (n6.v) g0.g(parcel, readInt15, n6.v.CREATOR);
                    }
                }
                g0.m(parcel, z33);
                return new o8.h(i33, aVar2, vVar);
            case 23:
                int z34 = g0.z(parcel);
                p7.g[] gVarArr = null;
                Account account3 = null;
                boolean z35 = false;
                String str8 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt16 = parcel.readInt();
                    char c22 = (char) readInt16;
                    if (c22 == 1) {
                        gVarArr = (p7.g[]) g0.k(parcel, readInt16, p7.g.CREATOR);
                    } else if (c22 == 2) {
                        str8 = g0.h(parcel, readInt16);
                    } else if (c22 == 3) {
                        z35 = g0.n(parcel, readInt16);
                    } else if (c22 != 4) {
                        g0.y(parcel, readInt16);
                    } else {
                        account3 = (Account) g0.g(parcel, readInt16, Account.CREATOR);
                    }
                }
                g0.m(parcel, z34);
                return new p7.e(gVarArr, str8, z35, account3);
            case 24:
                int z36 = g0.z(parcel);
                String str9 = null;
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < z36) {
                    int readInt17 = parcel.readInt();
                    char c23 = (char) readInt17;
                    if (c23 == 1) {
                        str9 = g0.h(parcel, readInt17);
                    } else if (c23 == 2) {
                        str10 = g0.h(parcel, readInt17);
                    } else if (c23 != 3) {
                        g0.y(parcel, readInt17);
                    } else {
                        str11 = g0.h(parcel, readInt17);
                    }
                }
                g0.m(parcel, z36);
                return new p7.f(str9, str10, str11);
            case 25:
                int z37 = g0.z(parcel);
                String str12 = null;
                byte[] bArr2 = null;
                int i34 = -1;
                k kVar = null;
                while (parcel.dataPosition() < z37) {
                    int readInt18 = parcel.readInt();
                    char c24 = (char) readInt18;
                    if (c24 == 1) {
                        str12 = g0.h(parcel, readInt18);
                    } else if (c24 == 3) {
                        kVar = (k) g0.g(parcel, readInt18, k.CREATOR);
                    } else if (c24 == 4) {
                        i34 = g0.u(parcel, readInt18);
                    } else if (c24 != 5) {
                        g0.y(parcel, readInt18);
                    } else {
                        bArr2 = g0.b(parcel, readInt18);
                    }
                }
                g0.m(parcel, z37);
                return new p7.g(str12, kVar, i34, bArr2);
            case 26:
                int z38 = g0.z(parcel);
                int i35 = 0;
                Bundle bundle4 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt19 = parcel.readInt();
                    char c25 = (char) readInt19;
                    if (c25 == 1) {
                        i35 = g0.u(parcel, readInt19);
                    } else if (c25 != 2) {
                        g0.y(parcel, readInt19);
                    } else {
                        bundle4 = g0.a(parcel, readInt19);
                    }
                }
                g0.m(parcel, z38);
                return new p7.h(i35, bundle4);
            case 27:
                int z39 = g0.z(parcel);
                Status status = null;
                ArrayList arrayList3 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < z39) {
                    int readInt20 = parcel.readInt();
                    char c26 = (char) readInt20;
                    if (c26 == 1) {
                        status = (Status) g0.g(parcel, readInt20, Status.CREATOR);
                    } else if (c26 == 2) {
                        arrayList3 = g0.l(parcel, readInt20, m.CREATOR);
                    } else if (c26 != 3) {
                        g0.y(parcel, readInt20);
                    } else {
                        strArr = g0.i(parcel, readInt20);
                    }
                }
                g0.m(parcel, z39);
                p7.i iVar = new p7.i();
                iVar.a = status;
                iVar.b = arrayList3;
                iVar.c = strArr;
                return iVar;
            case 28:
                int z40 = g0.z(parcel);
                String str13 = null;
                String str14 = null;
                String str15 = null;
                p7.h[] hVarArr = null;
                String str16 = null;
                l lVar = null;
                boolean z41 = false;
                boolean z42 = false;
                int i36 = 1;
                while (parcel.dataPosition() < z40) {
                    int readInt21 = parcel.readInt();
                    char c27 = (char) readInt21;
                    if (c27 == 11) {
                        str16 = g0.h(parcel, readInt21);
                    } else if (c27 != '\f') {
                        switch (c27) {
                            case 1:
                                str13 = g0.h(parcel, readInt21);
                                break;
                            case 2:
                                str14 = g0.h(parcel, readInt21);
                                break;
                            case 3:
                                z41 = g0.n(parcel, readInt21);
                                break;
                            case 4:
                                i36 = g0.u(parcel, readInt21);
                                break;
                            case 5:
                                z42 = g0.n(parcel, readInt21);
                                break;
                            case 6:
                                str15 = g0.h(parcel, readInt21);
                                break;
                            case 7:
                                hVarArr = (p7.h[]) g0.k(parcel, readInt21, p7.h.CREATOR);
                                break;
                            default:
                                g0.y(parcel, readInt21);
                                break;
                        }
                    } else {
                        lVar = (l) g0.g(parcel, readInt21, l.CREATOR);
                    }
                }
                g0.m(parcel, z40);
                return new k(str13, str14, z41, i36, z42, str15, hVarArr, str16, lVar);
            default:
                int z43 = g0.z(parcel);
                boolean z44 = false;
                while (parcel.dataPosition() < z43) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        g0.y(parcel, readInt22);
                    } else {
                        z44 = g0.n(parcel, readInt22);
                    }
                }
                g0.m(parcel, z43);
                return new l(z44);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new h[i10];
            case 1:
                return new b[i10];
            case 2:
                return new n4.h[i10];
            case 3:
                return new n4.i[i10];
            case 4:
                return new o[i10];
            case 5:
                return new p[i10];
            case 6:
                return new w[i10];
            case 7:
                return new v[i10];
            case 8:
                return new x[i10];
            case 9:
                return new n6.d[i10];
            case 10:
                return new n6.o[i10];
            case 11:
                return new j[i10];
            case 12:
                return new u[i10];
            case 13:
                return new n6.v[i10];
            case 14:
                return new n[i10];
            case 15:
                return new BinderWrapper[i10];
            case 16:
                return new f0[i10];
            case 17:
                return new n6.e[i10];
            case 18:
                return new n6.f[i10];
            case 19:
                return new o8.b[i10];
            case 20:
                return new o8.f[i10];
            case 21:
                return new o8.g[i10];
            case 22:
                return new o8.h[i10];
            case 23:
                return new p7.e[i10];
            case 24:
                return new p7.f[i10];
            case 25:
                return new p7.g[i10];
            case 26:
                return new p7.h[i10];
            case 27:
                return new p7.i[i10];
            case 28:
                return new k[i10];
            default:
                return new l[i10];
        }
    }
}
