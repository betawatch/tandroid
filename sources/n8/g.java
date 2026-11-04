package n8;

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
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import g2.n0;
import java.util.ArrayList;
import o8.h;
import p4.i;
import p4.o;
import p4.p;
import p4.v;
import p4.w;
import p4.x;
import p6.h0;
import p6.k;
import p6.r;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i3) {
        this.a = i3;
    }

    public static void a(p6.g gVar, Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = gVar.a;
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = gVar.b;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = gVar.c;
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(i12);
        j8.a.m(parcel, 4, gVar.d);
        j8.a.g(parcel, 5, gVar.e);
        j8.a.p(parcel, 6, gVar.f, i3);
        j8.a.c(parcel, 7, gVar.h);
        j8.a.l(parcel, 8, gVar.n, i3);
        j8.a.p(parcel, 10, gVar.r, i3);
        j8.a.p(parcel, 11, gVar.s, i3);
        boolean z10 = gVar.w;
        j8.a.r(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i13 = gVar.x;
        j8.a.r(parcel, 13, 4);
        parcel.writeInt(i13);
        boolean z11 = gVar.y;
        j8.a.r(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        j8.a.m(parcel, 15, gVar.E);
        j8.a.t(parcel, s6);
    }

    /* JADX WARN: Removed duplicated region for block: B:450:0x0470  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createFromParcel(Parcel parcel) {
        Uri uri;
        switch (this.a) {
            case 0:
                int z10 = g6.e.z(parcel);
                while (parcel.dataPosition() < z10) {
                    g6.e.y(parcel, parcel.readInt());
                }
                g6.e.m(parcel, z10);
                return new c();
            case 1:
                int z11 = g6.e.z(parcel);
                while (parcel.dataPosition() < z11) {
                    g6.e.y(parcel, parcel.readInt());
                }
                g6.e.m(parcel, z11);
                return new d();
            case 2:
                int z12 = g6.e.z(parcel);
                int i3 = 0;
                int i10 = 0;
                Uri uri2 = null;
                int i11 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 == 1) {
                        i3 = g6.e.u(parcel, readInt);
                    } else if (c2 == 2) {
                        uri2 = (Uri) g6.e.g(parcel, readInt, Uri.CREATOR);
                    } else if (c2 == 3) {
                        i11 = g6.e.u(parcel, readInt);
                    } else if (c2 != 4) {
                        g6.e.y(parcel, readInt);
                    } else {
                        i10 = g6.e.u(parcel, readInt);
                    }
                }
                g6.e.m(parcel, z12);
                return new o6.a(i3, uri2, i11, i10);
            case 3:
                int z13 = g6.e.z(parcel);
                String str = null;
                while (parcel.dataPosition() < z13) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 2) {
                        g6.e.y(parcel, readInt2);
                    } else {
                        str = g6.e.h(parcel, readInt2);
                    }
                }
                g6.e.m(parcel, z13);
                return new o8.e(str);
            case 4:
                int z14 = g6.e.z(parcel);
                String str2 = null;
                int i12 = 0;
                byte[] bArr = null;
                while (parcel.dataPosition() < z14) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 2) {
                        str2 = g6.e.h(parcel, readInt3);
                    } else if (c10 == 3) {
                        bArr = g6.e.b(parcel, readInt3);
                    } else if (c10 != 4) {
                        g6.e.y(parcel, readInt3);
                    } else {
                        i12 = g6.e.u(parcel, readInt3);
                    }
                }
                g6.e.m(parcel, z14);
                return new o8.a(i12, str2, bArr);
            case 5:
                int z15 = g6.e.z(parcel);
                long j10 = 0;
                o8.a[] aVarArr = null;
                int i13 = 0;
                boolean z16 = false;
                while (parcel.dataPosition() < z15) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 2) {
                        j10 = g6.e.w(parcel, readInt4);
                    } else if (c11 == 3) {
                        aVarArr = (o8.a[]) g6.e.k(parcel, readInt4, o8.a.CREATOR);
                    } else if (c11 == 4) {
                        i13 = g6.e.u(parcel, readInt4);
                    } else if (c11 != 5) {
                        g6.e.y(parcel, readInt4);
                    } else {
                        z16 = g6.e.n(parcel, readInt4);
                    }
                }
                g6.e.m(parcel, z15);
                return new o8.f(j10, aVarArr, i13, z16);
            case 6:
                int z17 = g6.e.z(parcel);
                String str3 = null;
                while (parcel.dataPosition() < z17) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        g6.e.y(parcel, readInt5);
                    } else {
                        str3 = g6.e.h(parcel, readInt5);
                    }
                }
                g6.e.m(parcel, z17);
                return new o8.g(str3);
            case 7:
                int z18 = g6.e.z(parcel);
                int i14 = 0;
                boolean z19 = false;
                while (parcel.dataPosition() < z18) {
                    int readInt6 = parcel.readInt();
                    char c12 = (char) readInt6;
                    if (c12 == 2) {
                        i14 = g6.e.u(parcel, readInt6);
                    } else if (c12 != 3) {
                        g6.e.y(parcel, readInt6);
                    } else {
                        z19 = g6.e.n(parcel, readInt6);
                    }
                }
                g6.e.m(parcel, z18);
                return new h(i14, z19);
            case 8:
                int z20 = g6.e.z(parcel);
                String str4 = null;
                byte[] bArr2 = null;
                long j11 = 0;
                DataHolder dataHolder = null;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < z20) {
                    int readInt7 = parcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 == 2) {
                        str4 = g6.e.h(parcel, readInt7);
                    } else if (c13 == 3) {
                        dataHolder = (DataHolder) g6.e.g(parcel, readInt7, DataHolder.CREATOR);
                    } else if (c13 == 4) {
                        parcelFileDescriptor = (ParcelFileDescriptor) g6.e.g(parcel, readInt7, ParcelFileDescriptor.CREATOR);
                    } else if (c13 == 5) {
                        j11 = g6.e.w(parcel, readInt7);
                    } else if (c13 != 6) {
                        g6.e.y(parcel, readInt7);
                    } else {
                        bArr2 = g6.e.b(parcel, readInt7);
                    }
                }
                g6.e.m(parcel, z20);
                o8.b bVar = new o8.b();
                bVar.a = str4;
                bVar.b = dataHolder;
                bVar.c = parcelFileDescriptor;
                bVar.d = j11;
                bVar.e = bArr2;
                return bVar;
            case 9:
                MediaDescription mediaDescription = (MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel);
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle o10 = n0.o(mediaDescription.getExtras());
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
                        p4.h hVar = new p4.h(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
                        hVar.s = mediaDescription;
                        return hVar;
                    }
                } else {
                    uri = null;
                }
                bundle = o10;
                if (uri == null) {
                }
                p4.h hVar2 = new p4.h(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
                hVar2.s = mediaDescription;
                return hVar2;
            case 10:
                return new i(parcel);
            case 11:
                return new o(parcel);
            case 12:
                MediaSession.Token token = (MediaSession.Token) parcel.readParcelable(null);
                token.getClass();
                return new p(token, null);
            case 13:
                return new w(parcel);
            case 14:
                return new v(parcel);
            case 15:
                return new x(parcel.readInt(), parcel.readFloat());
            case 16:
                int z21 = g6.e.z(parcel);
                String str5 = null;
                int i15 = 0;
                while (parcel.dataPosition() < z21) {
                    int readInt8 = parcel.readInt();
                    char c14 = (char) readInt8;
                    if (c14 == 1) {
                        i15 = g6.e.u(parcel, readInt8);
                    } else if (c14 != 2) {
                        g6.e.y(parcel, readInt8);
                    } else {
                        str5 = g6.e.h(parcel, readInt8);
                    }
                }
                g6.e.m(parcel, z21);
                return new p6.e(i15, str5);
            case 17:
                int z22 = g6.e.z(parcel);
                ArrayList arrayList = null;
                int i16 = 0;
                while (parcel.dataPosition() < z22) {
                    int readInt9 = parcel.readInt();
                    char c15 = (char) readInt9;
                    if (c15 == 1) {
                        i16 = g6.e.u(parcel, readInt9);
                    } else if (c15 != 2) {
                        g6.e.y(parcel, readInt9);
                    } else {
                        arrayList = g6.e.l(parcel, readInt9, k.CREATOR);
                    }
                }
                g6.e.m(parcel, z22);
                return new p6.p(i16, arrayList);
            case 18:
                int z23 = g6.e.z(parcel);
                int i17 = 0;
                int i18 = 0;
                boolean z24 = false;
                long j12 = 0;
                String str6 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt10 = parcel.readInt();
                    char c16 = (char) readInt10;
                    if (c16 == 1) {
                        i17 = g6.e.u(parcel, readInt10);
                    } else if (c16 == 2) {
                        str6 = g6.e.h(parcel, readInt10);
                    } else if (c16 == 3) {
                        j12 = g6.e.w(parcel, readInt10);
                    } else if (c16 == 4) {
                        i18 = g6.e.u(parcel, readInt10);
                    } else if (c16 != 5) {
                        g6.e.y(parcel, readInt10);
                    } else {
                        z24 = g6.e.n(parcel, readInt10);
                    }
                }
                g6.e.m(parcel, z23);
                return new r(i17, i18, j12, str6, z24);
            case 19:
                int z25 = g6.e.z(parcel);
                int i19 = -1;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                String str7 = null;
                String str8 = null;
                long j13 = 0;
                long j14 = 0;
                while (parcel.dataPosition() < z25) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            i20 = g6.e.u(parcel, readInt11);
                            break;
                        case 2:
                            i21 = g6.e.u(parcel, readInt11);
                            break;
                        case 3:
                            i22 = g6.e.u(parcel, readInt11);
                            break;
                        case 4:
                            j13 = g6.e.w(parcel, readInt11);
                            break;
                        case 5:
                            j14 = g6.e.w(parcel, readInt11);
                            break;
                        case 6:
                            str7 = g6.e.h(parcel, readInt11);
                            break;
                        case 7:
                            str8 = g6.e.h(parcel, readInt11);
                            break;
                        case '\b':
                            i23 = g6.e.u(parcel, readInt11);
                            break;
                        case '\t':
                            i19 = g6.e.u(parcel, readInt11);
                            break;
                        default:
                            g6.e.y(parcel, readInt11);
                            break;
                    }
                }
                g6.e.m(parcel, z25);
                return new k(i20, i21, i22, j13, j14, str7, str8, i23, i19);
            case 20:
                int z26 = g6.e.z(parcel);
                Account account = null;
                int i24 = 0;
                int i25 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < z26) {
                    int readInt12 = parcel.readInt();
                    char c17 = (char) readInt12;
                    if (c17 == 1) {
                        i24 = g6.e.u(parcel, readInt12);
                    } else if (c17 == 2) {
                        account = (Account) g6.e.g(parcel, readInt12, Account.CREATOR);
                    } else if (c17 == 3) {
                        i25 = g6.e.u(parcel, readInt12);
                    } else if (c17 != 4) {
                        g6.e.y(parcel, readInt12);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) g6.e.g(parcel, readInt12, GoogleSignInAccount.CREATOR);
                    }
                }
                g6.e.m(parcel, z26);
                return new p6.w(i24, account, i25, googleSignInAccount);
            case 21:
                int z27 = g6.e.z(parcel);
                int i26 = 0;
                boolean z28 = false;
                boolean z29 = false;
                IBinder iBinder = null;
                m6.a aVar = null;
                while (parcel.dataPosition() < z27) {
                    int readInt13 = parcel.readInt();
                    char c18 = (char) readInt13;
                    if (c18 == 1) {
                        i26 = g6.e.u(parcel, readInt13);
                    } else if (c18 == 2) {
                        iBinder = g6.e.t(parcel, readInt13);
                    } else if (c18 == 3) {
                        aVar = (m6.a) g6.e.g(parcel, readInt13, m6.a.CREATOR);
                    } else if (c18 == 4) {
                        z28 = g6.e.n(parcel, readInt13);
                    } else if (c18 != 5) {
                        g6.e.y(parcel, readInt13);
                    } else {
                        z29 = g6.e.n(parcel, readInt13);
                    }
                }
                g6.e.m(parcel, z27);
                return new p6.x(i26, iBinder, aVar, z28, z29);
            case 22:
                int z30 = g6.e.z(parcel);
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                boolean z31 = false;
                boolean z32 = false;
                while (parcel.dataPosition() < z30) {
                    int readInt14 = parcel.readInt();
                    char c19 = (char) readInt14;
                    if (c19 == 1) {
                        i27 = g6.e.u(parcel, readInt14);
                    } else if (c19 == 2) {
                        z31 = g6.e.n(parcel, readInt14);
                    } else if (c19 == 3) {
                        z32 = g6.e.n(parcel, readInt14);
                    } else if (c19 == 4) {
                        i28 = g6.e.u(parcel, readInt14);
                    } else if (c19 != 5) {
                        g6.e.y(parcel, readInt14);
                    } else {
                        i29 = g6.e.u(parcel, readInt14);
                    }
                }
                g6.e.m(parcel, z30);
                return new p6.o(i27, i28, i29, z31, z32);
            case 23:
                return new BinderWrapper(parcel);
            case 24:
                int z33 = g6.e.z(parcel);
                Bundle bundle2 = null;
                p6.f fVar = null;
                int i30 = 0;
                m6.c[] cVarArr = null;
                while (parcel.dataPosition() < z33) {
                    int readInt15 = parcel.readInt();
                    char c20 = (char) readInt15;
                    if (c20 == 1) {
                        bundle2 = g6.e.a(parcel, readInt15);
                    } else if (c20 == 2) {
                        cVarArr = (m6.c[]) g6.e.k(parcel, readInt15, m6.c.CREATOR);
                    } else if (c20 == 3) {
                        i30 = g6.e.u(parcel, readInt15);
                    } else if (c20 != 4) {
                        g6.e.y(parcel, readInt15);
                    } else {
                        fVar = (p6.f) g6.e.g(parcel, readInt15, p6.f.CREATOR);
                    }
                }
                g6.e.m(parcel, z33);
                h0 h0Var = new h0();
                h0Var.a = bundle2;
                h0Var.b = cVarArr;
                h0Var.c = i30;
                h0Var.d = fVar;
                return h0Var;
            case 25:
                int z34 = g6.e.z(parcel);
                p6.o oVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z35 = false;
                boolean z36 = false;
                int i31 = 0;
                while (parcel.dataPosition() < z34) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            oVar = (p6.o) g6.e.g(parcel, readInt16, p6.o.CREATOR);
                            break;
                        case 2:
                            z35 = g6.e.n(parcel, readInt16);
                            break;
                        case 3:
                            z36 = g6.e.n(parcel, readInt16);
                            break;
                        case 4:
                            iArr = g6.e.d(parcel, readInt16);
                            break;
                        case 5:
                            i31 = g6.e.u(parcel, readInt16);
                            break;
                        case 6:
                            iArr2 = g6.e.d(parcel, readInt16);
                            break;
                        default:
                            g6.e.y(parcel, readInt16);
                            break;
                    }
                }
                g6.e.m(parcel, z34);
                return new p6.f(oVar, z35, z36, iArr, i31, iArr2);
            case 26:
                int z37 = g6.e.z(parcel);
                Bundle bundle3 = new Bundle();
                Scope[] scopeArr = p6.g.F;
                String str9 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str10 = null;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                boolean z38 = false;
                int i35 = 0;
                boolean z39 = false;
                m6.c[] cVarArr2 = p6.g.G;
                m6.c[] cVarArr3 = cVarArr2;
                while (parcel.dataPosition() < z37) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            i32 = g6.e.u(parcel, readInt17);
                            break;
                        case 2:
                            i33 = g6.e.u(parcel, readInt17);
                            break;
                        case 3:
                            i34 = g6.e.u(parcel, readInt17);
                            break;
                        case 4:
                            str9 = g6.e.h(parcel, readInt17);
                            break;
                        case 5:
                            iBinder2 = g6.e.t(parcel, readInt17);
                            break;
                        case 6:
                            scopeArr = (Scope[]) g6.e.k(parcel, readInt17, Scope.CREATOR);
                            break;
                        case 7:
                            bundle3 = g6.e.a(parcel, readInt17);
                            break;
                        case '\b':
                            account2 = (Account) g6.e.g(parcel, readInt17, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            g6.e.y(parcel, readInt17);
                            break;
                        case '\n':
                            cVarArr2 = (m6.c[]) g6.e.k(parcel, readInt17, m6.c.CREATOR);
                            break;
                        case 11:
                            cVarArr3 = (m6.c[]) g6.e.k(parcel, readInt17, m6.c.CREATOR);
                            break;
                        case '\f':
                            z38 = g6.e.n(parcel, readInt17);
                            break;
                        case '\r':
                            i35 = g6.e.u(parcel, readInt17);
                            break;
                        case 14:
                            z39 = g6.e.n(parcel, readInt17);
                            break;
                        case 15:
                            str10 = g6.e.h(parcel, readInt17);
                            break;
                    }
                }
                g6.e.m(parcel, z37);
                return new p6.g(i32, i33, i34, str9, iBinder2, scopeArr, bundle3, account2, cVarArr2, cVarArr3, z38, i35, z39, str10);
            case 27:
                int z40 = g6.e.z(parcel);
                Intent intent = null;
                int i36 = 0;
                int i37 = 0;
                while (parcel.dataPosition() < z40) {
                    int readInt18 = parcel.readInt();
                    char c21 = (char) readInt18;
                    if (c21 == 1) {
                        i36 = g6.e.u(parcel, readInt18);
                    } else if (c21 == 2) {
                        i37 = g6.e.u(parcel, readInt18);
                    } else if (c21 != 3) {
                        g6.e.y(parcel, readInt18);
                    } else {
                        intent = (Intent) g6.e.g(parcel, readInt18, Intent.CREATOR);
                    }
                }
                g6.e.m(parcel, z40);
                return new q8.b(i36, i37, intent);
            case 28:
                int z41 = g6.e.z(parcel);
                ArrayList arrayList2 = null;
                String str11 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt19 = parcel.readInt();
                    char c22 = (char) readInt19;
                    if (c22 == 1) {
                        arrayList2 = g6.e.j(parcel, readInt19);
                    } else if (c22 != 2) {
                        g6.e.y(parcel, readInt19);
                    } else {
                        str11 = g6.e.h(parcel, readInt19);
                    }
                }
                g6.e.m(parcel, z41);
                return new q8.f(str11, arrayList2);
            default:
                int z42 = g6.e.z(parcel);
                p6.w wVar = null;
                int i38 = 0;
                while (parcel.dataPosition() < z42) {
                    int readInt20 = parcel.readInt();
                    char c23 = (char) readInt20;
                    if (c23 == 1) {
                        i38 = g6.e.u(parcel, readInt20);
                    } else if (c23 != 2) {
                        g6.e.y(parcel, readInt20);
                    } else {
                        wVar = (p6.w) g6.e.g(parcel, readInt20, p6.w.CREATOR);
                    }
                }
                g6.e.m(parcel, z42);
                return new q8.g(i38, wVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.a) {
            case 0:
                return new c[i3];
            case 1:
                return new d[i3];
            case 2:
                return new o6.a[i3];
            case 3:
                return new o8.e[i3];
            case 4:
                return new o8.a[i3];
            case 5:
                return new o8.f[i3];
            case 6:
                return new o8.g[i3];
            case 7:
                return new h[i3];
            case 8:
                return new o8.b[i3];
            case 9:
                return new p4.h[i3];
            case 10:
                return new i[i3];
            case 11:
                return new o[i3];
            case 12:
                return new p[i3];
            case 13:
                return new w[i3];
            case 14:
                return new v[i3];
            case 15:
                return new x[i3];
            case 16:
                return new p6.e[i3];
            case 17:
                return new p6.p[i3];
            case 18:
                return new r[i3];
            case 19:
                return new k[i3];
            case 20:
                return new p6.w[i3];
            case 21:
                return new p6.x[i3];
            case 22:
                return new p6.o[i3];
            case 23:
                return new BinderWrapper[i3];
            case 24:
                return new h0[i3];
            case 25:
                return new p6.f[i3];
            case 26:
                return new p6.g[i3];
            case 27:
                return new q8.b[i3];
            case 28:
                return new q8.f[i3];
            default:
                return new q8.g[i3];
        }
    }
}
