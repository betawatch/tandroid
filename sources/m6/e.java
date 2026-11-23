package m6;

import android.app.PendingIntent;
import android.database.CursorWindow;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.ac;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import h2.l0;
import hi.t5;
import java.util.ArrayList;
import q4.p;
import q4.v;
import q4.w;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i7) {
        this.a = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createFromParcel(Parcel parcel) {
        Uri uri;
        switch (this.a) {
            case 0:
                return new g(parcel.readStrongBinder());
            case 1:
                int z10 = ac.z(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                int i7 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            str = ac.h(parcel, readInt);
                            break;
                        case 2:
                            str2 = ac.h(parcel, readInt);
                            break;
                        case 3:
                            str3 = ac.h(parcel, readInt);
                            break;
                        case 4:
                            str4 = ac.h(parcel, readInt);
                            break;
                        case 5:
                            str5 = ac.h(parcel, readInt);
                            break;
                        case 6:
                            i7 = ac.u(parcel, readInt);
                            break;
                        case 7:
                            str6 = ac.h(parcel, readInt);
                            break;
                        default:
                            ac.y(parcel, readInt);
                            break;
                    }
                }
                ac.m(parcel, z10);
                return new b(str, str2, str3, str4, str5, i7, str6);
            case 2:
                int z11 = ac.z(parcel);
                LatLng latLng = null;
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 2) {
                        latLng = (LatLng) ac.g(parcel, readInt2, LatLng.CREATOR);
                    } else if (c10 == 3) {
                        f10 = ac.r(parcel, readInt2);
                    } else if (c10 == 4) {
                        f11 = ac.r(parcel, readInt2);
                    } else if (c10 != 5) {
                        ac.y(parcel, readInt2);
                    } else {
                        f12 = ac.r(parcel, readInt2);
                    }
                }
                ac.m(parcel, z11);
                return new CameraPosition(latLng, f10, f11, f12);
            case 3:
                int z12 = ac.z(parcel);
                LatLng latLng2 = null;
                float f13 = 0.0f;
                int i10 = 0;
                int i11 = 0;
                boolean z13 = false;
                boolean z14 = false;
                double d = 0.0d;
                float f14 = 0.0f;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            latLng2 = (LatLng) ac.g(parcel, readInt3, LatLng.CREATOR);
                            break;
                        case 3:
                            d = ac.q(parcel, readInt3);
                            break;
                        case 4:
                            f14 = ac.r(parcel, readInt3);
                            break;
                        case 5:
                            i10 = ac.u(parcel, readInt3);
                            break;
                        case 6:
                            i11 = ac.u(parcel, readInt3);
                            break;
                        case 7:
                            f13 = ac.r(parcel, readInt3);
                            break;
                        case '\b':
                            z13 = ac.n(parcel, readInt3);
                            break;
                        case '\t':
                            z14 = ac.n(parcel, readInt3);
                            break;
                        case '\n':
                            arrayList = ac.l(parcel, readInt3, m8.h.CREATOR);
                            break;
                        default:
                            ac.y(parcel, readInt3);
                            break;
                    }
                }
                ac.m(parcel, z12);
                m8.b bVar = new m8.b();
                bVar.a = latLng2;
                bVar.b = d;
                bVar.c = f14;
                bVar.d = i10;
                bVar.e = i11;
                bVar.f = f13;
                bVar.h = z13;
                bVar.n = z14;
                bVar.r = arrayList;
                return bVar;
            case 4:
                int z15 = ac.z(parcel);
                LatLng latLng3 = null;
                LatLng latLng4 = null;
                while (parcel.dataPosition() < z15) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 2) {
                        latLng3 = (LatLng) ac.g(parcel, readInt4, LatLng.CREATOR);
                    } else if (c11 != 3) {
                        ac.y(parcel, readInt4);
                    } else {
                        latLng4 = (LatLng) ac.g(parcel, readInt4, LatLng.CREATOR);
                    }
                }
                ac.m(parcel, z15);
                return new LatLngBounds(latLng3, latLng4);
            case 5:
                int z16 = ac.z(parcel);
                double d2 = 0.0d;
                double d10 = 0.0d;
                while (parcel.dataPosition() < z16) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 2) {
                        d2 = ac.q(parcel, readInt5);
                    } else if (c12 != 3) {
                        ac.y(parcel, readInt5);
                    } else {
                        d10 = ac.q(parcel, readInt5);
                    }
                }
                ac.m(parcel, z16);
                return new LatLng(d2, d10);
            case 6:
                int z17 = ac.z(parcel);
                String str7 = null;
                while (parcel.dataPosition() < z17) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 2) {
                        ac.y(parcel, readInt6);
                    } else {
                        str7 = ac.h(parcel, readInt6);
                    }
                }
                ac.m(parcel, z17);
                return new m8.e(str7);
            case 7:
                int z18 = ac.z(parcel);
                boolean z19 = false;
                boolean z20 = false;
                boolean z21 = false;
                float f15 = 0.5f;
                float f16 = 1.0f;
                LatLng latLng5 = null;
                String str8 = null;
                String str9 = null;
                IBinder iBinder = null;
                float f17 = 0.0f;
                float f18 = 0.0f;
                float f19 = 0.0f;
                float f20 = 0.0f;
                float f21 = 0.0f;
                while (parcel.dataPosition() < z18) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 2:
                            latLng5 = (LatLng) ac.g(parcel, readInt7, LatLng.CREATOR);
                            break;
                        case 3:
                            str8 = ac.h(parcel, readInt7);
                            break;
                        case 4:
                            str9 = ac.h(parcel, readInt7);
                            break;
                        case 5:
                            iBinder = ac.t(parcel, readInt7);
                            break;
                        case 6:
                            f17 = ac.r(parcel, readInt7);
                            break;
                        case 7:
                            f18 = ac.r(parcel, readInt7);
                            break;
                        case '\b':
                            z19 = ac.n(parcel, readInt7);
                            break;
                        case '\t':
                            z20 = ac.n(parcel, readInt7);
                            break;
                        case '\n':
                            z21 = ac.n(parcel, readInt7);
                            break;
                        case 11:
                            f19 = ac.r(parcel, readInt7);
                            break;
                        case '\f':
                            f15 = ac.r(parcel, readInt7);
                            break;
                        case '\r':
                            f20 = ac.r(parcel, readInt7);
                            break;
                        case 14:
                            f16 = ac.r(parcel, readInt7);
                            break;
                        case 15:
                            f21 = ac.r(parcel, readInt7);
                            break;
                        default:
                            ac.y(parcel, readInt7);
                            break;
                    }
                }
                ac.m(parcel, z18);
                m8.g gVar = new m8.g();
                gVar.e = 0.5f;
                gVar.f = 1.0f;
                gVar.n = true;
                gVar.r = false;
                gVar.s = 0.0f;
                gVar.w = 0.5f;
                gVar.x = 0.0f;
                gVar.y = 1.0f;
                gVar.a = latLng5;
                gVar.b = str8;
                gVar.c = str9;
                if (iBinder == null) {
                    gVar.d = null;
                } else {
                    gVar.d = new t5(a7.b.m1(iBinder));
                }
                gVar.e = f17;
                gVar.f = f18;
                gVar.h = z19;
                gVar.n = z20;
                gVar.r = z21;
                gVar.s = f19;
                gVar.w = f15;
                gVar.x = f20;
                gVar.y = f16;
                gVar.E = f21;
                return gVar;
            case 8:
                int z22 = ac.z(parcel);
                int i12 = 0;
                Float f22 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt8 = parcel.readInt();
                    char c13 = (char) readInt8;
                    if (c13 == 2) {
                        i12 = ac.u(parcel, readInt8);
                    } else if (c13 != 3) {
                        ac.y(parcel, readInt8);
                    } else {
                        f22 = ac.s(parcel, readInt8);
                    }
                }
                ac.m(parcel, z22);
                return new m8.h(i12, f22);
            case 9:
                int z23 = ac.z(parcel);
                PendingIntent pendingIntent = null;
                String str10 = null;
                Integer num = null;
                int i13 = 0;
                int i14 = 0;
                while (parcel.dataPosition() < z23) {
                    int readInt9 = parcel.readInt();
                    char c14 = (char) readInt9;
                    if (c14 == 1) {
                        i13 = ac.u(parcel, readInt9);
                    } else if (c14 == 2) {
                        i14 = ac.u(parcel, readInt9);
                    } else if (c14 == 3) {
                        pendingIntent = (PendingIntent) ac.g(parcel, readInt9, PendingIntent.CREATOR);
                    } else if (c14 == 4) {
                        str10 = ac.h(parcel, readInt9);
                    } else if (c14 != 5) {
                        ac.y(parcel, readInt9);
                    } else {
                        num = ac.v(parcel, readInt9);
                    }
                }
                ac.m(parcel, z23);
                return new n6.a(i13, i14, pendingIntent, str10, num);
            case 10:
                int z24 = ac.z(parcel);
                int i15 = 0;
                boolean z25 = false;
                long j3 = -1;
                String str11 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt10 = parcel.readInt();
                    char c15 = (char) readInt10;
                    if (c15 == 1) {
                        str11 = ac.h(parcel, readInt10);
                    } else if (c15 == 2) {
                        i15 = ac.u(parcel, readInt10);
                    } else if (c15 == 3) {
                        j3 = ac.w(parcel, readInt10);
                    } else if (c15 != 4) {
                        ac.y(parcel, readInt10);
                    } else {
                        z25 = ac.n(parcel, readInt10);
                    }
                }
                ac.m(parcel, z24);
                return new n6.c(str11, i15, j3, z25);
            case 11:
                int z26 = ac.z(parcel);
                String str12 = null;
                byte[] bArr = null;
                byte[][] bArr2 = null;
                byte[][] bArr3 = null;
                byte[][] bArr4 = null;
                byte[][] bArr5 = null;
                int[] iArr = null;
                byte[][] bArr6 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            str12 = ac.h(parcel, readInt11);
                            break;
                        case 3:
                            bArr = ac.b(parcel, readInt11);
                            break;
                        case 4:
                            bArr2 = ac.c(parcel, readInt11);
                            break;
                        case 5:
                            bArr3 = ac.c(parcel, readInt11);
                            break;
                        case 6:
                            bArr4 = ac.c(parcel, readInt11);
                            break;
                        case 7:
                            bArr5 = ac.c(parcel, readInt11);
                            break;
                        case '\b':
                            iArr = ac.d(parcel, readInt11);
                            break;
                        case '\t':
                            bArr6 = ac.c(parcel, readInt11);
                            break;
                        default:
                            ac.y(parcel, readInt11);
                            break;
                    }
                }
                ac.m(parcel, z26);
                return new n8.a(str12, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6);
            case 12:
                int z27 = ac.z(parcel);
                String[] strArr = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundle = null;
                int i16 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < z27) {
                    int readInt12 = parcel.readInt();
                    char c16 = (char) readInt12;
                    if (c16 == 1) {
                        strArr = ac.i(parcel, readInt12);
                    } else if (c16 == 2) {
                        cursorWindowArr = (CursorWindow[]) ac.k(parcel, readInt12, CursorWindow.CREATOR);
                    } else if (c16 == 3) {
                        i17 = ac.u(parcel, readInt12);
                    } else if (c16 == 4) {
                        bundle = ac.a(parcel, readInt12);
                    } else if (c16 != 1000) {
                        ac.y(parcel, readInt12);
                    } else {
                        i16 = ac.u(parcel, readInt12);
                    }
                }
                ac.m(parcel, z27);
                DataHolder dataHolder = new DataHolder(i16, strArr, cursorWindowArr, i17, bundle);
                dataHolder.c = new Bundle();
                int i18 = 0;
                while (true) {
                    String[] strArr2 = dataHolder.b;
                    if (i18 >= strArr2.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.d;
                        dataHolder.h = new int[cursorWindowArr2.length];
                        int i19 = 0;
                        for (int i20 = 0; i20 < cursorWindowArr2.length; i20++) {
                            dataHolder.h[i20] = i19;
                            i19 += cursorWindowArr2[i20].getNumRows() - (i19 - cursorWindowArr2[i20].getStartPosition());
                        }
                        dataHolder.n = i19;
                        return dataHolder;
                    }
                    dataHolder.c.putInt(strArr2[i18], i18);
                    i18++;
                }
            case 13:
                int z28 = ac.z(parcel);
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt13 = parcel.readInt();
                    char c17 = (char) readInt13;
                    if (c17 == 1) {
                        str13 = ac.h(parcel, readInt13);
                    } else if (c17 != 2) {
                        ac.y(parcel, readInt13);
                    } else {
                        str14 = ac.h(parcel, readInt13);
                    }
                }
                ac.m(parcel, z28);
                o8.a aVar = new o8.a();
                aVar.a = str13;
                aVar.b = str14;
                return aVar;
            case 14:
                int z29 = ac.z(parcel);
                String str15 = null;
                while (parcel.dataPosition() < z29) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        ac.y(parcel, readInt14);
                    } else {
                        str15 = ac.h(parcel, readInt14);
                    }
                }
                ac.m(parcel, z29);
                o8.b bVar2 = new o8.b();
                bVar2.a = str15;
                return bVar2;
            case 15:
                int z30 = ac.z(parcel);
                while (parcel.dataPosition() < z30) {
                    ac.y(parcel, parcel.readInt());
                }
                ac.m(parcel, z30);
                return new o8.c();
            case 16:
                int z31 = ac.z(parcel);
                while (parcel.dataPosition() < z31) {
                    ac.y(parcel, parcel.readInt());
                }
                ac.m(parcel, z31);
                return new o8.d();
            case 17:
                int z32 = ac.z(parcel);
                int i21 = 0;
                int i22 = 0;
                Uri uri2 = null;
                int i23 = 0;
                while (parcel.dataPosition() < z32) {
                    int readInt15 = parcel.readInt();
                    char c18 = (char) readInt15;
                    if (c18 == 1) {
                        i21 = ac.u(parcel, readInt15);
                    } else if (c18 == 2) {
                        uri2 = (Uri) ac.g(parcel, readInt15, Uri.CREATOR);
                    } else if (c18 == 3) {
                        i23 = ac.u(parcel, readInt15);
                    } else if (c18 != 4) {
                        ac.y(parcel, readInt15);
                    } else {
                        i22 = ac.u(parcel, readInt15);
                    }
                }
                ac.m(parcel, z32);
                return new p6.a(i21, uri2, i23, i22);
            case 18:
                int z33 = ac.z(parcel);
                String str16 = null;
                while (parcel.dataPosition() < z33) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 2) {
                        ac.y(parcel, readInt16);
                    } else {
                        str16 = ac.h(parcel, readInt16);
                    }
                }
                ac.m(parcel, z33);
                return new p8.e(str16);
            case 19:
                int z34 = ac.z(parcel);
                String str17 = null;
                int i24 = 0;
                byte[] bArr7 = null;
                while (parcel.dataPosition() < z34) {
                    int readInt17 = parcel.readInt();
                    char c19 = (char) readInt17;
                    if (c19 == 2) {
                        str17 = ac.h(parcel, readInt17);
                    } else if (c19 == 3) {
                        bArr7 = ac.b(parcel, readInt17);
                    } else if (c19 != 4) {
                        ac.y(parcel, readInt17);
                    } else {
                        i24 = ac.u(parcel, readInt17);
                    }
                }
                ac.m(parcel, z34);
                return new p8.a(i24, str17, bArr7);
            case 20:
                int z35 = ac.z(parcel);
                long j10 = 0;
                p8.a[] aVarArr = null;
                int i25 = 0;
                boolean z36 = false;
                while (parcel.dataPosition() < z35) {
                    int readInt18 = parcel.readInt();
                    char c20 = (char) readInt18;
                    if (c20 == 2) {
                        j10 = ac.w(parcel, readInt18);
                    } else if (c20 == 3) {
                        aVarArr = (p8.a[]) ac.k(parcel, readInt18, p8.a.CREATOR);
                    } else if (c20 == 4) {
                        i25 = ac.u(parcel, readInt18);
                    } else if (c20 != 5) {
                        ac.y(parcel, readInt18);
                    } else {
                        z36 = ac.n(parcel, readInt18);
                    }
                }
                ac.m(parcel, z35);
                return new p8.f(j10, aVarArr, i25, z36);
            case 21:
                int z37 = ac.z(parcel);
                String str18 = null;
                while (parcel.dataPosition() < z37) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 2) {
                        ac.y(parcel, readInt19);
                    } else {
                        str18 = ac.h(parcel, readInt19);
                    }
                }
                ac.m(parcel, z37);
                return new p8.g(str18);
            case 22:
                int z38 = ac.z(parcel);
                int i26 = 0;
                boolean z39 = false;
                while (parcel.dataPosition() < z38) {
                    int readInt20 = parcel.readInt();
                    char c21 = (char) readInt20;
                    if (c21 == 2) {
                        i26 = ac.u(parcel, readInt20);
                    } else if (c21 != 3) {
                        ac.y(parcel, readInt20);
                    } else {
                        z39 = ac.n(parcel, readInt20);
                    }
                }
                ac.m(parcel, z38);
                return new p8.h(i26, z39);
            case 23:
                int z40 = ac.z(parcel);
                String str19 = null;
                byte[] bArr8 = null;
                long j11 = 0;
                DataHolder dataHolder2 = null;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < z40) {
                    int readInt21 = parcel.readInt();
                    char c22 = (char) readInt21;
                    if (c22 == 2) {
                        str19 = ac.h(parcel, readInt21);
                    } else if (c22 == 3) {
                        dataHolder2 = (DataHolder) ac.g(parcel, readInt21, DataHolder.CREATOR);
                    } else if (c22 == 4) {
                        parcelFileDescriptor = (ParcelFileDescriptor) ac.g(parcel, readInt21, ParcelFileDescriptor.CREATOR);
                    } else if (c22 == 5) {
                        j11 = ac.w(parcel, readInt21);
                    } else if (c22 != 6) {
                        ac.y(parcel, readInt21);
                    } else {
                        bArr8 = ac.b(parcel, readInt21);
                    }
                }
                ac.m(parcel, z40);
                p8.b bVar3 = new p8.b();
                bVar3.a = str19;
                bVar3.b = dataHolder2;
                bVar3.c = parcelFileDescriptor;
                bVar3.d = j11;
                bVar3.e = bArr8;
                return bVar3;
            case 24:
                MediaDescription mediaDescription = (MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel);
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle o4 = l0.o(mediaDescription.getExtras());
                if (o4 != null) {
                    o4 = new Bundle(o4);
                }
                Bundle bundle2 = null;
                if (o4 != null) {
                    uri = (Uri) o4.getParcelable("android.support.v4.media.description.MEDIA_URI");
                    if (uri != null) {
                        if (!o4.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || o4.size() != 2) {
                            o4.remove("android.support.v4.media.description.MEDIA_URI");
                            o4.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                        }
                        if (uri == null) {
                            uri = mediaDescription.getMediaUri();
                        }
                        q4.h hVar = new q4.h(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle2, uri);
                        hVar.s = mediaDescription;
                        return hVar;
                    }
                } else {
                    uri = null;
                }
                bundle2 = o4;
                if (uri == null) {
                }
                q4.h hVar2 = new q4.h(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle2, uri);
                hVar2.s = mediaDescription;
                return hVar2;
            case 25:
                return new q4.i(parcel);
            case 26:
                return new q4.o(parcel);
            case 27:
                MediaSession.Token token = (MediaSession.Token) parcel.readParcelable(null);
                token.getClass();
                return new p(token, null);
            case 28:
                return new w(parcel);
            default:
                return new v(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.a) {
            case 0:
                return new g[i7];
            case 1:
                return new b[i7];
            case 2:
                return new CameraPosition[i7];
            case 3:
                return new m8.b[i7];
            case 4:
                return new LatLngBounds[i7];
            case 5:
                return new LatLng[i7];
            case 6:
                return new m8.e[i7];
            case 7:
                return new m8.g[i7];
            case 8:
                return new m8.h[i7];
            case 9:
                return new n6.a[i7];
            case 10:
                return new n6.c[i7];
            case 11:
                return new n8.a[i7];
            case 12:
                return new DataHolder[i7];
            case 13:
                return new o8.a[i7];
            case 14:
                return new o8.b[i7];
            case 15:
                return new o8.c[i7];
            case 16:
                return new o8.d[i7];
            case 17:
                return new p6.a[i7];
            case 18:
                return new p8.e[i7];
            case 19:
                return new p8.a[i7];
            case 20:
                return new p8.f[i7];
            case 21:
                return new p8.g[i7];
            case 22:
                return new p8.h[i7];
            case 23:
                return new p8.b[i7];
            case 24:
                return new q4.h[i7];
            case 25:
                return new q4.i[i7];
            case 26:
                return new q4.o[i7];
            case 27:
                return new p[i7];
            case 28:
                return new w[i7];
            default:
                return new v[i7];
        }
    }
}
