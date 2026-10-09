package m8;

import android.accounts.Account;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.ArrayList;
import n4.e0;
import n4.f0;
import n4.g0;
import n4.l;
import n4.m;
import n4.u;
import n4.v;
import n4.w;
import n4.x;
import n6.j;
import n6.n;
import n6.o;
import w7.c0;
import w7.d0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i10) {
        this.a = i10;
    }

    public static void a(n6.f fVar, Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        int i11 = fVar.a;
        d0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = fVar.b;
        d0.s(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = fVar.c;
        d0.s(parcel, 3, 4);
        parcel.writeInt(i13);
        d0.l(parcel, 4, fVar.d);
        d0.f(parcel, 5, fVar.e);
        d0.o(parcel, 6, fVar.f, i10);
        d0.b(parcel, 7, fVar.h);
        d0.k(parcel, 8, fVar.n, i10);
        d0.o(parcel, 10, fVar.r, i10);
        d0.o(parcel, 11, fVar.s, i10);
        boolean z10 = fVar.v;
        d0.s(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i14 = fVar.w;
        d0.s(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z11 = fVar.x;
        d0.s(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        d0.l(parcel, 15, fVar.y);
        d0.r(parcel, q6);
    }

    /* JADX WARN: Removed duplicated region for block: B:545:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x058e  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createFromParcel(Parcel parcel) {
        Uri uri;
        switch (this.a) {
            case 0:
                int z10 = c0.z(parcel);
                String str = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 2) {
                        c0.y(parcel, readInt);
                    } else {
                        str = c0.h(parcel, readInt);
                    }
                }
                c0.m(parcel, z10);
                return new g(str);
            case 1:
                int z11 = c0.z(parcel);
                int i10 = 0;
                boolean z12 = false;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 2) {
                        i10 = c0.u(parcel, readInt2);
                    } else if (c10 != 3) {
                        c0.y(parcel, readInt2);
                    } else {
                        z12 = c0.n(parcel, readInt2);
                    }
                }
                c0.m(parcel, z11);
                return new i(i10, z12);
            case 2:
                int z13 = c0.z(parcel);
                String str2 = null;
                byte[] bArr = null;
                long j3 = 0;
                DataHolder dataHolder = null;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < z13) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 2) {
                        str2 = c0.h(parcel, readInt3);
                    } else if (c11 == 3) {
                        dataHolder = (DataHolder) c0.g(parcel, readInt3, DataHolder.CREATOR);
                    } else if (c11 == 4) {
                        parcelFileDescriptor = (ParcelFileDescriptor) c0.g(parcel, readInt3, ParcelFileDescriptor.CREATOR);
                    } else if (c11 == 5) {
                        j3 = c0.w(parcel, readInt3);
                    } else if (c11 != 6) {
                        c0.y(parcel, readInt3);
                    } else {
                        bArr = c0.b(parcel, readInt3);
                    }
                }
                c0.m(parcel, z13);
                b bVar = new b();
                bVar.a = str2;
                bVar.b = dataHolder;
                bVar.c = parcelFileDescriptor;
                bVar.d = j3;
                bVar.e = bArr;
                return bVar;
            case 3:
                MediaDescription mediaDescription = (MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel);
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                Bundle bundle = null;
                if (extras != null) {
                    x.Q(extras);
                    try {
                        extras.isEmpty();
                    } catch (BadParcelableException unused) {
                        Log.e("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    if (extras != null) {
                        extras = new Bundle(extras);
                    }
                    if (extras == null) {
                        uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                        if (uri != null) {
                            if (!extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || extras.size() != 2) {
                                extras.remove("android.support.v4.media.description.MEDIA_URI");
                                extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                            }
                            if (uri == null) {
                                uri = mediaDescription.getMediaUri();
                            }
                            l lVar = new l(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
                            lVar.r = mediaDescription;
                            return lVar;
                        }
                    } else {
                        uri = null;
                    }
                    bundle = extras;
                    if (uri == null) {
                    }
                    l lVar2 = new l(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
                    lVar2.r = mediaDescription;
                    return lVar2;
                }
                extras = null;
                if (extras != null) {
                }
                if (extras == null) {
                }
                bundle = extras;
                if (uri == null) {
                }
                l lVar22 = new l(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
                lVar22.r = mediaDescription;
                return lVar22;
            case 4:
                return new m(parcel);
            case 5:
                return new u(parcel);
            case 6:
                v vVar = new v();
                vVar.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return vVar;
            case 7:
                MediaSession.Token token = (MediaSession.Token) parcel.readParcelable(null);
                token.getClass();
                return new w(token, null);
            case 8:
                n4.d0 d0Var = new n4.d0();
                d0Var.a = parcel.readInt();
                d0Var.c = parcel.readInt();
                d0Var.d = parcel.readInt();
                d0Var.e = parcel.readInt();
                d0Var.b = parcel.readInt();
                return d0Var;
            case 9:
                return new f0(parcel);
            case 10:
                return new e0(parcel);
            case 11:
                return new g0(parcel.readInt(), parcel.readFloat());
            case 12:
                int z14 = c0.z(parcel);
                String str3 = null;
                int i11 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 1) {
                        i11 = c0.u(parcel, readInt4);
                    } else if (c12 != 2) {
                        c0.y(parcel, readInt4);
                    } else {
                        str3 = c0.h(parcel, readInt4);
                    }
                }
                c0.m(parcel, z14);
                return new n6.d(i11, str3);
            case 13:
                int z15 = c0.z(parcel);
                ArrayList arrayList = null;
                int i12 = 0;
                while (parcel.dataPosition() < z15) {
                    int readInt5 = parcel.readInt();
                    char c13 = (char) readInt5;
                    if (c13 == 1) {
                        i12 = c0.u(parcel, readInt5);
                    } else if (c13 != 2) {
                        c0.y(parcel, readInt5);
                    } else {
                        arrayList = c0.l(parcel, readInt5, j.CREATOR);
                    }
                }
                c0.m(parcel, z15);
                return new o(i12, arrayList);
            case 14:
                int z16 = c0.z(parcel);
                int i13 = -1;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                String str4 = null;
                String str5 = null;
                long j10 = 0;
                long j11 = 0;
                while (parcel.dataPosition() < z16) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i14 = c0.u(parcel, readInt6);
                            break;
                        case 2:
                            i15 = c0.u(parcel, readInt6);
                            break;
                        case 3:
                            i16 = c0.u(parcel, readInt6);
                            break;
                        case 4:
                            j10 = c0.w(parcel, readInt6);
                            break;
                        case 5:
                            j11 = c0.w(parcel, readInt6);
                            break;
                        case 6:
                            str4 = c0.h(parcel, readInt6);
                            break;
                        case 7:
                            str5 = c0.h(parcel, readInt6);
                            break;
                        case '\b':
                            i17 = c0.u(parcel, readInt6);
                            break;
                        case '\t':
                            i13 = c0.u(parcel, readInt6);
                            break;
                        default:
                            c0.y(parcel, readInt6);
                            break;
                    }
                }
                c0.m(parcel, z16);
                return new j(i14, i15, i16, j10, j11, str4, str5, i17, i13);
            case 15:
                int z17 = c0.z(parcel);
                Account account = null;
                int i18 = 0;
                int i19 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < z17) {
                    int readInt7 = parcel.readInt();
                    char c14 = (char) readInt7;
                    if (c14 == 1) {
                        i18 = c0.u(parcel, readInt7);
                    } else if (c14 == 2) {
                        account = (Account) c0.g(parcel, readInt7, Account.CREATOR);
                    } else if (c14 == 3) {
                        i19 = c0.u(parcel, readInt7);
                    } else if (c14 != 4) {
                        c0.y(parcel, readInt7);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) c0.g(parcel, readInt7, GoogleSignInAccount.CREATOR);
                    }
                }
                c0.m(parcel, z17);
                return new n6.v(i18, account, i19, googleSignInAccount);
            case 16:
                int z18 = c0.z(parcel);
                int i20 = 0;
                boolean z19 = false;
                boolean z20 = false;
                IBinder iBinder = null;
                k6.a aVar = null;
                while (parcel.dataPosition() < z18) {
                    int readInt8 = parcel.readInt();
                    char c15 = (char) readInt8;
                    if (c15 == 1) {
                        i20 = c0.u(parcel, readInt8);
                    } else if (c15 == 2) {
                        iBinder = c0.t(parcel, readInt8);
                    } else if (c15 == 3) {
                        aVar = (k6.a) c0.g(parcel, readInt8, k6.a.CREATOR);
                    } else if (c15 == 4) {
                        z19 = c0.n(parcel, readInt8);
                    } else if (c15 != 5) {
                        c0.y(parcel, readInt8);
                    } else {
                        z20 = c0.n(parcel, readInt8);
                    }
                }
                c0.m(parcel, z18);
                return new n6.w(i20, iBinder, aVar, z19, z20);
            case 17:
                int z21 = c0.z(parcel);
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                boolean z22 = false;
                boolean z23 = false;
                while (parcel.dataPosition() < z21) {
                    int readInt9 = parcel.readInt();
                    char c16 = (char) readInt9;
                    if (c16 == 1) {
                        i21 = c0.u(parcel, readInt9);
                    } else if (c16 == 2) {
                        z22 = c0.n(parcel, readInt9);
                    } else if (c16 == 3) {
                        z23 = c0.n(parcel, readInt9);
                    } else if (c16 == 4) {
                        i22 = c0.u(parcel, readInt9);
                    } else if (c16 != 5) {
                        c0.y(parcel, readInt9);
                    } else {
                        i23 = c0.u(parcel, readInt9);
                    }
                }
                c0.m(parcel, z21);
                return new n(i21, i22, i23, z22, z23);
            case 18:
                return new BinderWrapper(parcel);
            case 19:
                int z24 = c0.z(parcel);
                Bundle bundle2 = null;
                n6.e eVar = null;
                int i24 = 0;
                k6.c[] cVarArr = null;
                while (parcel.dataPosition() < z24) {
                    int readInt10 = parcel.readInt();
                    char c17 = (char) readInt10;
                    if (c17 == 1) {
                        bundle2 = c0.a(parcel, readInt10);
                    } else if (c17 == 2) {
                        cVarArr = (k6.c[]) c0.k(parcel, readInt10, k6.c.CREATOR);
                    } else if (c17 == 3) {
                        i24 = c0.u(parcel, readInt10);
                    } else if (c17 != 4) {
                        c0.y(parcel, readInt10);
                    } else {
                        eVar = (n6.e) c0.g(parcel, readInt10, n6.e.CREATOR);
                    }
                }
                c0.m(parcel, z24);
                n6.g0 g0Var = new n6.g0();
                g0Var.a = bundle2;
                g0Var.b = cVarArr;
                g0Var.c = i24;
                g0Var.d = eVar;
                return g0Var;
            case 20:
                int z25 = c0.z(parcel);
                n nVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z26 = false;
                boolean z27 = false;
                int i25 = 0;
                while (parcel.dataPosition() < z25) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            nVar = (n) c0.g(parcel, readInt11, n.CREATOR);
                            break;
                        case 2:
                            z26 = c0.n(parcel, readInt11);
                            break;
                        case 3:
                            z27 = c0.n(parcel, readInt11);
                            break;
                        case 4:
                            iArr = c0.d(parcel, readInt11);
                            break;
                        case 5:
                            i25 = c0.u(parcel, readInt11);
                            break;
                        case 6:
                            iArr2 = c0.d(parcel, readInt11);
                            break;
                        default:
                            c0.y(parcel, readInt11);
                            break;
                    }
                }
                c0.m(parcel, z25);
                return new n6.e(nVar, z26, z27, iArr, i25, iArr2);
            case 21:
                int z28 = c0.z(parcel);
                Bundle bundle3 = new Bundle();
                Scope[] scopeArr = n6.f.E;
                String str6 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str7 = null;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                boolean z29 = false;
                int i29 = 0;
                boolean z30 = false;
                k6.c[] cVarArr2 = n6.f.F;
                k6.c[] cVarArr3 = cVarArr2;
                while (parcel.dataPosition() < z28) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            i26 = c0.u(parcel, readInt12);
                            break;
                        case 2:
                            i27 = c0.u(parcel, readInt12);
                            break;
                        case 3:
                            i28 = c0.u(parcel, readInt12);
                            break;
                        case 4:
                            str6 = c0.h(parcel, readInt12);
                            break;
                        case 5:
                            iBinder2 = c0.t(parcel, readInt12);
                            break;
                        case 6:
                            scopeArr = (Scope[]) c0.k(parcel, readInt12, Scope.CREATOR);
                            break;
                        case 7:
                            bundle3 = c0.a(parcel, readInt12);
                            break;
                        case '\b':
                            account2 = (Account) c0.g(parcel, readInt12, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            c0.y(parcel, readInt12);
                            break;
                        case '\n':
                            cVarArr2 = (k6.c[]) c0.k(parcel, readInt12, k6.c.CREATOR);
                            break;
                        case 11:
                            cVarArr3 = (k6.c[]) c0.k(parcel, readInt12, k6.c.CREATOR);
                            break;
                        case '\f':
                            z29 = c0.n(parcel, readInt12);
                            break;
                        case '\r':
                            i29 = c0.u(parcel, readInt12);
                            break;
                        case 14:
                            z30 = c0.n(parcel, readInt12);
                            break;
                        case 15:
                            str7 = c0.h(parcel, readInt12);
                            break;
                    }
                }
                c0.m(parcel, z28);
                return new n6.f(i26, i27, i28, str6, iBinder2, scopeArr, bundle3, account2, cVarArr2, cVarArr3, z29, i29, z30, str7);
            case 22:
                int z31 = c0.z(parcel);
                Intent intent = null;
                int i30 = 0;
                int i31 = 0;
                while (parcel.dataPosition() < z31) {
                    int readInt13 = parcel.readInt();
                    char c18 = (char) readInt13;
                    if (c18 == 1) {
                        i30 = c0.u(parcel, readInt13);
                    } else if (c18 == 2) {
                        i31 = c0.u(parcel, readInt13);
                    } else if (c18 != 3) {
                        c0.y(parcel, readInt13);
                    } else {
                        intent = (Intent) c0.g(parcel, readInt13, Intent.CREATOR);
                    }
                }
                c0.m(parcel, z31);
                return new o8.b(i30, i31, intent);
            case 23:
                int z32 = c0.z(parcel);
                ArrayList arrayList2 = null;
                String str8 = null;
                while (parcel.dataPosition() < z32) {
                    int readInt14 = parcel.readInt();
                    char c19 = (char) readInt14;
                    if (c19 == 1) {
                        arrayList2 = c0.j(parcel, readInt14);
                    } else if (c19 != 2) {
                        c0.y(parcel, readInt14);
                    } else {
                        str8 = c0.h(parcel, readInt14);
                    }
                }
                c0.m(parcel, z32);
                return new o8.f(str8, arrayList2);
            case 24:
                int z33 = c0.z(parcel);
                n6.v vVar2 = null;
                int i32 = 0;
                while (parcel.dataPosition() < z33) {
                    int readInt15 = parcel.readInt();
                    char c20 = (char) readInt15;
                    if (c20 == 1) {
                        i32 = c0.u(parcel, readInt15);
                    } else if (c20 != 2) {
                        c0.y(parcel, readInt15);
                    } else {
                        vVar2 = (n6.v) c0.g(parcel, readInt15, n6.v.CREATOR);
                    }
                }
                c0.m(parcel, z33);
                return new o8.g(i32, vVar2);
            case 25:
                int z34 = c0.z(parcel);
                k6.a aVar2 = null;
                int i33 = 0;
                n6.w wVar = null;
                while (parcel.dataPosition() < z34) {
                    int readInt16 = parcel.readInt();
                    char c21 = (char) readInt16;
                    if (c21 == 1) {
                        i33 = c0.u(parcel, readInt16);
                    } else if (c21 == 2) {
                        aVar2 = (k6.a) c0.g(parcel, readInt16, k6.a.CREATOR);
                    } else if (c21 != 3) {
                        c0.y(parcel, readInt16);
                    } else {
                        wVar = (n6.w) c0.g(parcel, readInt16, n6.w.CREATOR);
                    }
                }
                c0.m(parcel, z34);
                return new o8.h(i33, aVar2, wVar);
            case 26:
                int z35 = c0.z(parcel);
                p7.g[] gVarArr = null;
                Account account3 = null;
                boolean z36 = false;
                String str9 = null;
                while (parcel.dataPosition() < z35) {
                    int readInt17 = parcel.readInt();
                    char c22 = (char) readInt17;
                    if (c22 == 1) {
                        gVarArr = (p7.g[]) c0.k(parcel, readInt17, p7.g.CREATOR);
                    } else if (c22 == 2) {
                        str9 = c0.h(parcel, readInt17);
                    } else if (c22 == 3) {
                        z36 = c0.n(parcel, readInt17);
                    } else if (c22 != 4) {
                        c0.y(parcel, readInt17);
                    } else {
                        account3 = (Account) c0.g(parcel, readInt17, Account.CREATOR);
                    }
                }
                c0.m(parcel, z35);
                return new p7.e(gVarArr, str9, z36, account3);
            case 27:
                int z37 = c0.z(parcel);
                String str10 = null;
                String str11 = null;
                String str12 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt18 = parcel.readInt();
                    char c23 = (char) readInt18;
                    if (c23 == 1) {
                        str10 = c0.h(parcel, readInt18);
                    } else if (c23 == 2) {
                        str11 = c0.h(parcel, readInt18);
                    } else if (c23 != 3) {
                        c0.y(parcel, readInt18);
                    } else {
                        str12 = c0.h(parcel, readInt18);
                    }
                }
                c0.m(parcel, z37);
                return new p7.f(str10, str11, str12);
            case 28:
                int z38 = c0.z(parcel);
                String str13 = null;
                byte[] bArr2 = null;
                int i34 = -1;
                p7.l lVar3 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt19 = parcel.readInt();
                    char c24 = (char) readInt19;
                    if (c24 == 1) {
                        str13 = c0.h(parcel, readInt19);
                    } else if (c24 == 3) {
                        lVar3 = (p7.l) c0.g(parcel, readInt19, p7.l.CREATOR);
                    } else if (c24 == 4) {
                        i34 = c0.u(parcel, readInt19);
                    } else if (c24 != 5) {
                        c0.y(parcel, readInt19);
                    } else {
                        bArr2 = c0.b(parcel, readInt19);
                    }
                }
                c0.m(parcel, z38);
                return new p7.g(str13, lVar3, i34, bArr2);
            default:
                int z39 = c0.z(parcel);
                int i35 = 0;
                Bundle bundle4 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt20 = parcel.readInt();
                    char c25 = (char) readInt20;
                    if (c25 == 1) {
                        i35 = c0.u(parcel, readInt20);
                    } else if (c25 != 2) {
                        c0.y(parcel, readInt20);
                    } else {
                        bundle4 = c0.a(parcel, readInt20);
                    }
                }
                c0.m(parcel, z39);
                return new p7.h(i35, bundle4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new g[i10];
            case 1:
                return new i[i10];
            case 2:
                return new b[i10];
            case 3:
                return new l[i10];
            case 4:
                return new m[i10];
            case 5:
                return new u[i10];
            case 6:
                return new v[i10];
            case 7:
                return new w[i10];
            case 8:
                return new n4.d0[i10];
            case 9:
                return new f0[i10];
            case 10:
                return new e0[i10];
            case 11:
                return new g0[i10];
            case 12:
                return new n6.d[i10];
            case 13:
                return new o[i10];
            case 14:
                return new j[i10];
            case 15:
                return new n6.v[i10];
            case 16:
                return new n6.w[i10];
            case 17:
                return new n[i10];
            case 18:
                return new BinderWrapper[i10];
            case 19:
                return new n6.g0[i10];
            case 20:
                return new n6.e[i10];
            case 21:
                return new n6.f[i10];
            case 22:
                return new o8.b[i10];
            case 23:
                return new o8.f[i10];
            case 24:
                return new o8.g[i10];
            case 25:
                return new o8.h[i10];
            case 26:
                return new p7.e[i10];
            case 27:
                return new p7.f[i10];
            case 28:
                return new p7.g[i10];
            default:
                return new p7.h[i10];
        }
    }
}
