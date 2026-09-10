package m8;

import android.accounts.Account;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
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
import n4.g0;
import n4.h0;
import n4.i0;
import n4.l;
import n4.m;
import n4.v;
import n4.w;
import n4.x;
import n4.y;
import n6.f0;
import n6.j;
import n6.n;
import n6.o;
import n6.u;
import w7.d0;
import w7.e0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i10) {
        this.a = i10;
    }

    public static void a(n6.f fVar, Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = fVar.a;
        e0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = fVar.b;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = fVar.c;
        e0.s(parcel, 3, 4);
        parcel.writeInt(i13);
        e0.l(parcel, 4, fVar.d);
        e0.f(parcel, 5, fVar.e);
        e0.o(parcel, 6, fVar.f, i10);
        e0.b(parcel, 7, fVar.h);
        e0.k(parcel, 8, fVar.n, i10);
        e0.o(parcel, 10, fVar.r, i10);
        e0.o(parcel, 11, fVar.s, i10);
        boolean z10 = fVar.v;
        e0.s(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i14 = fVar.w;
        e0.s(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z11 = fVar.x;
        e0.s(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        e0.l(parcel, 15, fVar.y);
        e0.r(parcel, q6);
    }

    /* JADX WARN: Removed duplicated region for block: B:545:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x058e  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createFromParcel(Parcel parcel) {
        Uri uri;
        Uri j3;
        Bundle bundle;
        switch (this.a) {
            case 0:
                int z10 = d0.z(parcel);
                String str = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 2) {
                        d0.y(parcel, readInt);
                    } else {
                        str = d0.h(parcel, readInt);
                    }
                }
                d0.m(parcel, z10);
                return new g(str);
            case 1:
                int z11 = d0.z(parcel);
                int i10 = 0;
                boolean z12 = false;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 2) {
                        i10 = d0.u(parcel, readInt2);
                    } else if (c10 != 3) {
                        d0.y(parcel, readInt2);
                    } else {
                        z12 = d0.n(parcel, readInt2);
                    }
                }
                d0.m(parcel, z11);
                return new i(i10, z12);
            case 2:
                int z13 = d0.z(parcel);
                String str2 = null;
                byte[] bArr = null;
                long j10 = 0;
                DataHolder dataHolder = null;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < z13) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 2) {
                        str2 = d0.h(parcel, readInt3);
                    } else if (c11 == 3) {
                        dataHolder = (DataHolder) d0.g(parcel, readInt3, DataHolder.CREATOR);
                    } else if (c11 == 4) {
                        parcelFileDescriptor = (ParcelFileDescriptor) d0.g(parcel, readInt3, ParcelFileDescriptor.CREATOR);
                    } else if (c11 == 5) {
                        j10 = d0.w(parcel, readInt3);
                    } else if (c11 != 6) {
                        d0.y(parcel, readInt3);
                    } else {
                        bArr = d0.b(parcel, readInt3);
                    }
                }
                d0.m(parcel, z13);
                b bVar = new b();
                bVar.a = str2;
                bVar.b = dataHolder;
                bVar.c = parcelFileDescriptor;
                bVar.d = j10;
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
                if (extras != null) {
                    y.i(extras);
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
                            if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                                extras = null;
                            } else {
                                extras.remove("android.support.v4.media.description.MEDIA_URI");
                                extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                            }
                        }
                    } else {
                        uri = null;
                    }
                    if (uri == null) {
                        bundle = extras;
                        j3 = uri;
                    } else {
                        j3 = Build.VERSION.SDK_INT >= 23 ? e0.b.j(mediaDescription) : null;
                        bundle = extras;
                    }
                    l lVar = new l(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, j3);
                    lVar.r = mediaDescription;
                    return lVar;
                }
                extras = null;
                if (extras != null) {
                }
                if (extras == null) {
                }
                if (uri == null) {
                }
                l lVar2 = new l(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, j3);
                lVar2.r = mediaDescription;
                return lVar2;
            case 4:
                return new m(parcel);
            case 5:
                return new v(parcel);
            case 6:
                w wVar = new w();
                wVar.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return wVar;
            case 7:
                MediaSession.Token token = (MediaSession.Token) parcel.readParcelable(null);
                token.getClass();
                return new x(token, null);
            case 8:
                n4.e0 e0Var = new n4.e0();
                e0Var.a = parcel.readInt();
                e0Var.c = parcel.readInt();
                e0Var.d = parcel.readInt();
                e0Var.e = parcel.readInt();
                e0Var.b = parcel.readInt();
                return e0Var;
            case 9:
                return new h0(parcel);
            case 10:
                return new g0(parcel);
            case 11:
                return new i0(parcel.readInt(), parcel.readFloat());
            case 12:
                int z14 = d0.z(parcel);
                String str3 = null;
                int i11 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 1) {
                        i11 = d0.u(parcel, readInt4);
                    } else if (c12 != 2) {
                        d0.y(parcel, readInt4);
                    } else {
                        str3 = d0.h(parcel, readInt4);
                    }
                }
                d0.m(parcel, z14);
                return new n6.d(i11, str3);
            case 13:
                int z15 = d0.z(parcel);
                ArrayList arrayList = null;
                int i12 = 0;
                while (parcel.dataPosition() < z15) {
                    int readInt5 = parcel.readInt();
                    char c13 = (char) readInt5;
                    if (c13 == 1) {
                        i12 = d0.u(parcel, readInt5);
                    } else if (c13 != 2) {
                        d0.y(parcel, readInt5);
                    } else {
                        arrayList = d0.l(parcel, readInt5, j.CREATOR);
                    }
                }
                d0.m(parcel, z15);
                return new o(i12, arrayList);
            case 14:
                int z16 = d0.z(parcel);
                String str4 = null;
                String str5 = null;
                long j11 = 0;
                long j12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = -1;
                while (parcel.dataPosition() < z16) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i13 = d0.u(parcel, readInt6);
                            break;
                        case 2:
                            i14 = d0.u(parcel, readInt6);
                            break;
                        case 3:
                            i15 = d0.u(parcel, readInt6);
                            break;
                        case 4:
                            j11 = d0.w(parcel, readInt6);
                            break;
                        case 5:
                            j12 = d0.w(parcel, readInt6);
                            break;
                        case 6:
                            str4 = d0.h(parcel, readInt6);
                            break;
                        case 7:
                            str5 = d0.h(parcel, readInt6);
                            break;
                        case '\b':
                            i16 = d0.u(parcel, readInt6);
                            break;
                        case '\t':
                            i17 = d0.u(parcel, readInt6);
                            break;
                        default:
                            d0.y(parcel, readInt6);
                            break;
                    }
                }
                d0.m(parcel, z16);
                return new j(i13, i14, i15, j11, j12, str4, str5, i16, i17);
            case 15:
                int z17 = d0.z(parcel);
                Account account = null;
                GoogleSignInAccount googleSignInAccount = null;
                int i18 = 0;
                int i19 = 0;
                while (parcel.dataPosition() < z17) {
                    int readInt7 = parcel.readInt();
                    char c14 = (char) readInt7;
                    if (c14 == 1) {
                        i18 = d0.u(parcel, readInt7);
                    } else if (c14 == 2) {
                        account = (Account) d0.g(parcel, readInt7, Account.CREATOR);
                    } else if (c14 == 3) {
                        i19 = d0.u(parcel, readInt7);
                    } else if (c14 != 4) {
                        d0.y(parcel, readInt7);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) d0.g(parcel, readInt7, GoogleSignInAccount.CREATOR);
                    }
                }
                d0.m(parcel, z17);
                return new u(i18, account, i19, googleSignInAccount);
            case 16:
                int z18 = d0.z(parcel);
                IBinder iBinder = null;
                k6.a aVar = null;
                int i20 = 0;
                boolean z19 = false;
                boolean z20 = false;
                while (parcel.dataPosition() < z18) {
                    int readInt8 = parcel.readInt();
                    char c15 = (char) readInt8;
                    if (c15 == 1) {
                        i20 = d0.u(parcel, readInt8);
                    } else if (c15 == 2) {
                        iBinder = d0.t(parcel, readInt8);
                    } else if (c15 == 3) {
                        aVar = (k6.a) d0.g(parcel, readInt8, k6.a.CREATOR);
                    } else if (c15 == 4) {
                        z19 = d0.n(parcel, readInt8);
                    } else if (c15 != 5) {
                        d0.y(parcel, readInt8);
                    } else {
                        z20 = d0.n(parcel, readInt8);
                    }
                }
                d0.m(parcel, z18);
                return new n6.v(i20, iBinder, aVar, z19, z20);
            case 17:
                int z21 = d0.z(parcel);
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                boolean z22 = false;
                boolean z23 = false;
                while (parcel.dataPosition() < z21) {
                    int readInt9 = parcel.readInt();
                    char c16 = (char) readInt9;
                    if (c16 == 1) {
                        i21 = d0.u(parcel, readInt9);
                    } else if (c16 == 2) {
                        z22 = d0.n(parcel, readInt9);
                    } else if (c16 == 3) {
                        z23 = d0.n(parcel, readInt9);
                    } else if (c16 == 4) {
                        i22 = d0.u(parcel, readInt9);
                    } else if (c16 != 5) {
                        d0.y(parcel, readInt9);
                    } else {
                        i23 = d0.u(parcel, readInt9);
                    }
                }
                d0.m(parcel, z21);
                return new n(i21, i22, i23, z22, z23);
            case 18:
                return new BinderWrapper(parcel);
            case 19:
                int z24 = d0.z(parcel);
                Bundle bundle2 = null;
                k6.c[] cVarArr = null;
                n6.e eVar = null;
                int i24 = 0;
                while (parcel.dataPosition() < z24) {
                    int readInt10 = parcel.readInt();
                    char c17 = (char) readInt10;
                    if (c17 == 1) {
                        bundle2 = d0.a(parcel, readInt10);
                    } else if (c17 == 2) {
                        cVarArr = (k6.c[]) d0.k(parcel, readInt10, k6.c.CREATOR);
                    } else if (c17 == 3) {
                        i24 = d0.u(parcel, readInt10);
                    } else if (c17 != 4) {
                        d0.y(parcel, readInt10);
                    } else {
                        eVar = (n6.e) d0.g(parcel, readInt10, n6.e.CREATOR);
                    }
                }
                d0.m(parcel, z24);
                f0 f0Var = new f0();
                f0Var.a = bundle2;
                f0Var.b = cVarArr;
                f0Var.c = i24;
                f0Var.d = eVar;
                return f0Var;
            case 20:
                int z25 = d0.z(parcel);
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
                            nVar = (n) d0.g(parcel, readInt11, n.CREATOR);
                            break;
                        case 2:
                            z26 = d0.n(parcel, readInt11);
                            break;
                        case 3:
                            z27 = d0.n(parcel, readInt11);
                            break;
                        case 4:
                            iArr = d0.d(parcel, readInt11);
                            break;
                        case 5:
                            i25 = d0.u(parcel, readInt11);
                            break;
                        case 6:
                            iArr2 = d0.d(parcel, readInt11);
                            break;
                        default:
                            d0.y(parcel, readInt11);
                            break;
                    }
                }
                d0.m(parcel, z25);
                return new n6.e(nVar, z26, z27, iArr, i25, iArr2);
            case 21:
                int z28 = d0.z(parcel);
                Bundle bundle3 = new Bundle();
                Scope[] scopeArr = n6.f.E;
                String str6 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str7 = null;
                k6.c[] cVarArr2 = n6.f.F;
                k6.c[] cVarArr3 = cVarArr2;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                boolean z29 = false;
                int i29 = 0;
                boolean z30 = false;
                while (parcel.dataPosition() < z28) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            i26 = d0.u(parcel, readInt12);
                            break;
                        case 2:
                            i27 = d0.u(parcel, readInt12);
                            break;
                        case 3:
                            i28 = d0.u(parcel, readInt12);
                            break;
                        case 4:
                            str6 = d0.h(parcel, readInt12);
                            break;
                        case 5:
                            iBinder2 = d0.t(parcel, readInt12);
                            break;
                        case 6:
                            scopeArr = (Scope[]) d0.k(parcel, readInt12, Scope.CREATOR);
                            break;
                        case 7:
                            bundle3 = d0.a(parcel, readInt12);
                            break;
                        case '\b':
                            account2 = (Account) d0.g(parcel, readInt12, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            d0.y(parcel, readInt12);
                            break;
                        case '\n':
                            cVarArr2 = (k6.c[]) d0.k(parcel, readInt12, k6.c.CREATOR);
                            break;
                        case 11:
                            cVarArr3 = (k6.c[]) d0.k(parcel, readInt12, k6.c.CREATOR);
                            break;
                        case '\f':
                            z29 = d0.n(parcel, readInt12);
                            break;
                        case '\r':
                            i29 = d0.u(parcel, readInt12);
                            break;
                        case 14:
                            z30 = d0.n(parcel, readInt12);
                            break;
                        case 15:
                            str7 = d0.h(parcel, readInt12);
                            break;
                    }
                }
                d0.m(parcel, z28);
                return new n6.f(i26, i27, i28, str6, iBinder2, scopeArr, bundle3, account2, cVarArr2, cVarArr3, z29, i29, z30, str7);
            case 22:
                int z31 = d0.z(parcel);
                Intent intent = null;
                int i30 = 0;
                int i31 = 0;
                while (parcel.dataPosition() < z31) {
                    int readInt13 = parcel.readInt();
                    char c18 = (char) readInt13;
                    if (c18 == 1) {
                        i30 = d0.u(parcel, readInt13);
                    } else if (c18 == 2) {
                        i31 = d0.u(parcel, readInt13);
                    } else if (c18 != 3) {
                        d0.y(parcel, readInt13);
                    } else {
                        intent = (Intent) d0.g(parcel, readInt13, Intent.CREATOR);
                    }
                }
                d0.m(parcel, z31);
                return new o8.b(i30, i31, intent);
            case 23:
                int z32 = d0.z(parcel);
                ArrayList arrayList2 = null;
                String str8 = null;
                while (parcel.dataPosition() < z32) {
                    int readInt14 = parcel.readInt();
                    char c19 = (char) readInt14;
                    if (c19 == 1) {
                        arrayList2 = d0.j(parcel, readInt14);
                    } else if (c19 != 2) {
                        d0.y(parcel, readInt14);
                    } else {
                        str8 = d0.h(parcel, readInt14);
                    }
                }
                d0.m(parcel, z32);
                return new o8.f(str8, arrayList2);
            case 24:
                int z33 = d0.z(parcel);
                u uVar = null;
                int i32 = 0;
                while (parcel.dataPosition() < z33) {
                    int readInt15 = parcel.readInt();
                    char c20 = (char) readInt15;
                    if (c20 == 1) {
                        i32 = d0.u(parcel, readInt15);
                    } else if (c20 != 2) {
                        d0.y(parcel, readInt15);
                    } else {
                        uVar = (u) d0.g(parcel, readInt15, u.CREATOR);
                    }
                }
                d0.m(parcel, z33);
                return new o8.g(i32, uVar);
            case 25:
                int z34 = d0.z(parcel);
                k6.a aVar2 = null;
                n6.v vVar = null;
                int i33 = 0;
                while (parcel.dataPosition() < z34) {
                    int readInt16 = parcel.readInt();
                    char c21 = (char) readInt16;
                    if (c21 == 1) {
                        i33 = d0.u(parcel, readInt16);
                    } else if (c21 == 2) {
                        aVar2 = (k6.a) d0.g(parcel, readInt16, k6.a.CREATOR);
                    } else if (c21 != 3) {
                        d0.y(parcel, readInt16);
                    } else {
                        vVar = (n6.v) d0.g(parcel, readInt16, n6.v.CREATOR);
                    }
                }
                d0.m(parcel, z34);
                return new o8.h(i33, aVar2, vVar);
            case 26:
                int z35 = d0.z(parcel);
                p7.g[] gVarArr = null;
                String str9 = null;
                Account account3 = null;
                boolean z36 = false;
                while (parcel.dataPosition() < z35) {
                    int readInt17 = parcel.readInt();
                    char c22 = (char) readInt17;
                    if (c22 == 1) {
                        gVarArr = (p7.g[]) d0.k(parcel, readInt17, p7.g.CREATOR);
                    } else if (c22 == 2) {
                        str9 = d0.h(parcel, readInt17);
                    } else if (c22 == 3) {
                        z36 = d0.n(parcel, readInt17);
                    } else if (c22 != 4) {
                        d0.y(parcel, readInt17);
                    } else {
                        account3 = (Account) d0.g(parcel, readInt17, Account.CREATOR);
                    }
                }
                d0.m(parcel, z35);
                return new p7.e(gVarArr, str9, z36, account3);
            case 27:
                int z37 = d0.z(parcel);
                String str10 = null;
                String str11 = null;
                String str12 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt18 = parcel.readInt();
                    char c23 = (char) readInt18;
                    if (c23 == 1) {
                        str10 = d0.h(parcel, readInt18);
                    } else if (c23 == 2) {
                        str11 = d0.h(parcel, readInt18);
                    } else if (c23 != 3) {
                        d0.y(parcel, readInt18);
                    } else {
                        str12 = d0.h(parcel, readInt18);
                    }
                }
                d0.m(parcel, z37);
                return new p7.f(str10, str11, str12);
            case 28:
                int z38 = d0.z(parcel);
                String str13 = null;
                p7.l lVar3 = null;
                byte[] bArr2 = null;
                int i34 = -1;
                while (parcel.dataPosition() < z38) {
                    int readInt19 = parcel.readInt();
                    char c24 = (char) readInt19;
                    if (c24 == 1) {
                        str13 = d0.h(parcel, readInt19);
                    } else if (c24 == 3) {
                        lVar3 = (p7.l) d0.g(parcel, readInt19, p7.l.CREATOR);
                    } else if (c24 == 4) {
                        i34 = d0.u(parcel, readInt19);
                    } else if (c24 != 5) {
                        d0.y(parcel, readInt19);
                    } else {
                        bArr2 = d0.b(parcel, readInt19);
                    }
                }
                d0.m(parcel, z38);
                return new p7.g(str13, lVar3, i34, bArr2);
            default:
                int z39 = d0.z(parcel);
                int i35 = 0;
                Bundle bundle4 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt20 = parcel.readInt();
                    char c25 = (char) readInt20;
                    if (c25 == 1) {
                        i35 = d0.u(parcel, readInt20);
                    } else if (c25 != 2) {
                        d0.y(parcel, readInt20);
                    } else {
                        bundle4 = d0.a(parcel, readInt20);
                    }
                }
                d0.m(parcel, z39);
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
                return new v[i10];
            case 6:
                return new w[i10];
            case 7:
                return new x[i10];
            case 8:
                return new n4.e0[i10];
            case 9:
                return new h0[i10];
            case 10:
                return new g0[i10];
            case 11:
                return new i0[i10];
            case 12:
                return new n6.d[i10];
            case 13:
                return new o[i10];
            case 14:
                return new j[i10];
            case 15:
                return new u[i10];
            case 16:
                return new n6.v[i10];
            case 17:
                return new n[i10];
            case 18:
                return new BinderWrapper[i10];
            case 19:
                return new f0[i10];
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
