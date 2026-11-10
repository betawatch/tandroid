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
import c8.wb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import h2.m0;
import java.util.ArrayList;
import q4.p;
import q4.v;
import q4.w;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                int z9 = wb.z(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                int i7 = 0;
                while (parcel.dataPosition() < z9) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            str = wb.h(parcel, readInt);
                            break;
                        case 2:
                            str2 = wb.h(parcel, readInt);
                            break;
                        case 3:
                            str3 = wb.h(parcel, readInt);
                            break;
                        case 4:
                            str4 = wb.h(parcel, readInt);
                            break;
                        case 5:
                            str5 = wb.h(parcel, readInt);
                            break;
                        case 6:
                            i7 = wb.u(parcel, readInt);
                            break;
                        case 7:
                            str6 = wb.h(parcel, readInt);
                            break;
                        default:
                            wb.y(parcel, readInt);
                            break;
                    }
                }
                wb.m(parcel, z9);
                return new b(str, str2, str3, str4, str5, i7, str6);
            case 2:
                int z10 = wb.z(parcel);
                LatLng latLng = null;
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                while (parcel.dataPosition() < z10) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 2) {
                        latLng = (LatLng) wb.g(parcel, readInt2, LatLng.CREATOR);
                    } else if (c10 == 3) {
                        f10 = wb.r(parcel, readInt2);
                    } else if (c10 == 4) {
                        f11 = wb.r(parcel, readInt2);
                    } else if (c10 != 5) {
                        wb.y(parcel, readInt2);
                    } else {
                        f12 = wb.r(parcel, readInt2);
                    }
                }
                wb.m(parcel, z10);
                return new CameraPosition(latLng, f10, f11, f12);
            case 3:
                int z11 = wb.z(parcel);
                LatLng latLng2 = null;
                float f13 = 0.0f;
                int i10 = 0;
                int i11 = 0;
                boolean z12 = false;
                boolean z13 = false;
                double d = 0.0d;
                float f14 = 0.0f;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z11) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            latLng2 = (LatLng) wb.g(parcel, readInt3, LatLng.CREATOR);
                            break;
                        case 3:
                            d = wb.q(parcel, readInt3);
                            break;
                        case 4:
                            f14 = wb.r(parcel, readInt3);
                            break;
                        case 5:
                            i10 = wb.u(parcel, readInt3);
                            break;
                        case 6:
                            i11 = wb.u(parcel, readInt3);
                            break;
                        case 7:
                            f13 = wb.r(parcel, readInt3);
                            break;
                        case '\b':
                            z12 = wb.n(parcel, readInt3);
                            break;
                        case '\t':
                            z13 = wb.n(parcel, readInt3);
                            break;
                        case '\n':
                            arrayList = wb.l(parcel, readInt3, m8.h.CREATOR);
                            break;
                        default:
                            wb.y(parcel, readInt3);
                            break;
                    }
                }
                wb.m(parcel, z11);
                m8.b bVar = new m8.b();
                bVar.a = latLng2;
                bVar.b = d;
                bVar.c = f14;
                bVar.d = i10;
                bVar.e = i11;
                bVar.f = f13;
                bVar.h = z12;
                bVar.n = z13;
                bVar.r = arrayList;
                return bVar;
            case 4:
                int z14 = wb.z(parcel);
                LatLng latLng3 = null;
                LatLng latLng4 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 2) {
                        latLng3 = (LatLng) wb.g(parcel, readInt4, LatLng.CREATOR);
                    } else if (c11 != 3) {
                        wb.y(parcel, readInt4);
                    } else {
                        latLng4 = (LatLng) wb.g(parcel, readInt4, LatLng.CREATOR);
                    }
                }
                wb.m(parcel, z14);
                return new LatLngBounds(latLng3, latLng4);
            case 5:
                int z15 = wb.z(parcel);
                double d2 = 0.0d;
                double d10 = 0.0d;
                while (parcel.dataPosition() < z15) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 2) {
                        d2 = wb.q(parcel, readInt5);
                    } else if (c12 != 3) {
                        wb.y(parcel, readInt5);
                    } else {
                        d10 = wb.q(parcel, readInt5);
                    }
                }
                wb.m(parcel, z15);
                return new LatLng(d2, d10);
            case 6:
                int z16 = wb.z(parcel);
                String str7 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 2) {
                        wb.y(parcel, readInt6);
                    } else {
                        str7 = wb.h(parcel, readInt6);
                    }
                }
                wb.m(parcel, z16);
                return new m8.e(str7);
            case 7:
                int z17 = wb.z(parcel);
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
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
                while (parcel.dataPosition() < z17) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 2:
                            latLng5 = (LatLng) wb.g(parcel, readInt7, LatLng.CREATOR);
                            break;
                        case 3:
                            str8 = wb.h(parcel, readInt7);
                            break;
                        case 4:
                            str9 = wb.h(parcel, readInt7);
                            break;
                        case 5:
                            iBinder = wb.t(parcel, readInt7);
                            break;
                        case 6:
                            f17 = wb.r(parcel, readInt7);
                            break;
                        case 7:
                            f18 = wb.r(parcel, readInt7);
                            break;
                        case '\b':
                            z18 = wb.n(parcel, readInt7);
                            break;
                        case '\t':
                            z19 = wb.n(parcel, readInt7);
                            break;
                        case '\n':
                            z20 = wb.n(parcel, readInt7);
                            break;
                        case 11:
                            f19 = wb.r(parcel, readInt7);
                            break;
                        case '\f':
                            f15 = wb.r(parcel, readInt7);
                            break;
                        case '\r':
                            f20 = wb.r(parcel, readInt7);
                            break;
                        case 14:
                            f16 = wb.r(parcel, readInt7);
                            break;
                        case 15:
                            f21 = wb.r(parcel, readInt7);
                            break;
                        default:
                            wb.y(parcel, readInt7);
                            break;
                    }
                }
                wb.m(parcel, z17);
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
                    gVar.d = new k8.a(a7.b.m1(iBinder), 1);
                }
                gVar.e = f17;
                gVar.f = f18;
                gVar.h = z18;
                gVar.n = z19;
                gVar.r = z20;
                gVar.s = f19;
                gVar.w = f15;
                gVar.x = f20;
                gVar.y = f16;
                gVar.D = f21;
                return gVar;
            case 8:
                int z21 = wb.z(parcel);
                int i12 = 0;
                Float f22 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt8 = parcel.readInt();
                    char c13 = (char) readInt8;
                    if (c13 == 2) {
                        i12 = wb.u(parcel, readInt8);
                    } else if (c13 != 3) {
                        wb.y(parcel, readInt8);
                    } else {
                        f22 = wb.s(parcel, readInt8);
                    }
                }
                wb.m(parcel, z21);
                return new m8.h(i12, f22);
            case 9:
                int z22 = wb.z(parcel);
                PendingIntent pendingIntent = null;
                String str10 = null;
                Integer num = null;
                int i13 = 0;
                int i14 = 0;
                while (parcel.dataPosition() < z22) {
                    int readInt9 = parcel.readInt();
                    char c14 = (char) readInt9;
                    if (c14 == 1) {
                        i13 = wb.u(parcel, readInt9);
                    } else if (c14 == 2) {
                        i14 = wb.u(parcel, readInt9);
                    } else if (c14 == 3) {
                        pendingIntent = (PendingIntent) wb.g(parcel, readInt9, PendingIntent.CREATOR);
                    } else if (c14 == 4) {
                        str10 = wb.h(parcel, readInt9);
                    } else if (c14 != 5) {
                        wb.y(parcel, readInt9);
                    } else {
                        num = wb.v(parcel, readInt9);
                    }
                }
                wb.m(parcel, z22);
                return new n6.a(i13, i14, pendingIntent, str10, num);
            case 10:
                int z23 = wb.z(parcel);
                int i15 = 0;
                boolean z24 = false;
                long j3 = -1;
                String str11 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt10 = parcel.readInt();
                    char c15 = (char) readInt10;
                    if (c15 == 1) {
                        str11 = wb.h(parcel, readInt10);
                    } else if (c15 == 2) {
                        i15 = wb.u(parcel, readInt10);
                    } else if (c15 == 3) {
                        j3 = wb.w(parcel, readInt10);
                    } else if (c15 != 4) {
                        wb.y(parcel, readInt10);
                    } else {
                        z24 = wb.n(parcel, readInt10);
                    }
                }
                wb.m(parcel, z23);
                return new n6.c(str11, i15, j3, z24);
            case 11:
                int z25 = wb.z(parcel);
                String str12 = null;
                byte[] bArr = null;
                byte[][] bArr2 = null;
                byte[][] bArr3 = null;
                byte[][] bArr4 = null;
                byte[][] bArr5 = null;
                int[] iArr = null;
                byte[][] bArr6 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            str12 = wb.h(parcel, readInt11);
                            break;
                        case 3:
                            bArr = wb.b(parcel, readInt11);
                            break;
                        case 4:
                            bArr2 = wb.c(parcel, readInt11);
                            break;
                        case 5:
                            bArr3 = wb.c(parcel, readInt11);
                            break;
                        case 6:
                            bArr4 = wb.c(parcel, readInt11);
                            break;
                        case 7:
                            bArr5 = wb.c(parcel, readInt11);
                            break;
                        case '\b':
                            iArr = wb.d(parcel, readInt11);
                            break;
                        case '\t':
                            bArr6 = wb.c(parcel, readInt11);
                            break;
                        default:
                            wb.y(parcel, readInt11);
                            break;
                    }
                }
                wb.m(parcel, z25);
                return new n8.a(str12, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6);
            case 12:
                int z26 = wb.z(parcel);
                String[] strArr = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundle = null;
                int i16 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < z26) {
                    int readInt12 = parcel.readInt();
                    char c16 = (char) readInt12;
                    if (c16 == 1) {
                        strArr = wb.i(parcel, readInt12);
                    } else if (c16 == 2) {
                        cursorWindowArr = (CursorWindow[]) wb.k(parcel, readInt12, CursorWindow.CREATOR);
                    } else if (c16 == 3) {
                        i17 = wb.u(parcel, readInt12);
                    } else if (c16 == 4) {
                        bundle = wb.a(parcel, readInt12);
                    } else if (c16 != 1000) {
                        wb.y(parcel, readInt12);
                    } else {
                        i16 = wb.u(parcel, readInt12);
                    }
                }
                wb.m(parcel, z26);
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
                int z27 = wb.z(parcel);
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt13 = parcel.readInt();
                    char c17 = (char) readInt13;
                    if (c17 == 1) {
                        str13 = wb.h(parcel, readInt13);
                    } else if (c17 != 2) {
                        wb.y(parcel, readInt13);
                    } else {
                        str14 = wb.h(parcel, readInt13);
                    }
                }
                wb.m(parcel, z27);
                o8.a aVar = new o8.a();
                aVar.a = str13;
                aVar.b = str14;
                return aVar;
            case 14:
                int z28 = wb.z(parcel);
                String str15 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        wb.y(parcel, readInt14);
                    } else {
                        str15 = wb.h(parcel, readInt14);
                    }
                }
                wb.m(parcel, z28);
                o8.b bVar2 = new o8.b();
                bVar2.a = str15;
                return bVar2;
            case 15:
                int z29 = wb.z(parcel);
                while (parcel.dataPosition() < z29) {
                    wb.y(parcel, parcel.readInt());
                }
                wb.m(parcel, z29);
                return new o8.c();
            case 16:
                int z30 = wb.z(parcel);
                while (parcel.dataPosition() < z30) {
                    wb.y(parcel, parcel.readInt());
                }
                wb.m(parcel, z30);
                return new o8.d();
            case 17:
                int z31 = wb.z(parcel);
                int i21 = 0;
                int i22 = 0;
                Uri uri2 = null;
                int i23 = 0;
                while (parcel.dataPosition() < z31) {
                    int readInt15 = parcel.readInt();
                    char c18 = (char) readInt15;
                    if (c18 == 1) {
                        i21 = wb.u(parcel, readInt15);
                    } else if (c18 == 2) {
                        uri2 = (Uri) wb.g(parcel, readInt15, Uri.CREATOR);
                    } else if (c18 == 3) {
                        i23 = wb.u(parcel, readInt15);
                    } else if (c18 != 4) {
                        wb.y(parcel, readInt15);
                    } else {
                        i22 = wb.u(parcel, readInt15);
                    }
                }
                wb.m(parcel, z31);
                return new p6.a(i21, uri2, i23, i22);
            case 18:
                int z32 = wb.z(parcel);
                String str16 = null;
                while (parcel.dataPosition() < z32) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 2) {
                        wb.y(parcel, readInt16);
                    } else {
                        str16 = wb.h(parcel, readInt16);
                    }
                }
                wb.m(parcel, z32);
                return new p8.e(str16);
            case 19:
                int z33 = wb.z(parcel);
                String str17 = null;
                int i24 = 0;
                byte[] bArr7 = null;
                while (parcel.dataPosition() < z33) {
                    int readInt17 = parcel.readInt();
                    char c19 = (char) readInt17;
                    if (c19 == 2) {
                        str17 = wb.h(parcel, readInt17);
                    } else if (c19 == 3) {
                        bArr7 = wb.b(parcel, readInt17);
                    } else if (c19 != 4) {
                        wb.y(parcel, readInt17);
                    } else {
                        i24 = wb.u(parcel, readInt17);
                    }
                }
                wb.m(parcel, z33);
                return new p8.a(i24, str17, bArr7);
            case 20:
                int z34 = wb.z(parcel);
                long j10 = 0;
                p8.a[] aVarArr = null;
                int i25 = 0;
                boolean z35 = false;
                while (parcel.dataPosition() < z34) {
                    int readInt18 = parcel.readInt();
                    char c20 = (char) readInt18;
                    if (c20 == 2) {
                        j10 = wb.w(parcel, readInt18);
                    } else if (c20 == 3) {
                        aVarArr = (p8.a[]) wb.k(parcel, readInt18, p8.a.CREATOR);
                    } else if (c20 == 4) {
                        i25 = wb.u(parcel, readInt18);
                    } else if (c20 != 5) {
                        wb.y(parcel, readInt18);
                    } else {
                        z35 = wb.n(parcel, readInt18);
                    }
                }
                wb.m(parcel, z34);
                return new p8.f(j10, aVarArr, i25, z35);
            case 21:
                int z36 = wb.z(parcel);
                String str18 = null;
                while (parcel.dataPosition() < z36) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 2) {
                        wb.y(parcel, readInt19);
                    } else {
                        str18 = wb.h(parcel, readInt19);
                    }
                }
                wb.m(parcel, z36);
                return new p8.g(str18);
            case 22:
                int z37 = wb.z(parcel);
                int i26 = 0;
                boolean z38 = false;
                while (parcel.dataPosition() < z37) {
                    int readInt20 = parcel.readInt();
                    char c21 = (char) readInt20;
                    if (c21 == 2) {
                        i26 = wb.u(parcel, readInt20);
                    } else if (c21 != 3) {
                        wb.y(parcel, readInt20);
                    } else {
                        z38 = wb.n(parcel, readInt20);
                    }
                }
                wb.m(parcel, z37);
                return new p8.h(i26, z38);
            case 23:
                int z39 = wb.z(parcel);
                String str19 = null;
                byte[] bArr8 = null;
                long j11 = 0;
                DataHolder dataHolder2 = null;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < z39) {
                    int readInt21 = parcel.readInt();
                    char c22 = (char) readInt21;
                    if (c22 == 2) {
                        str19 = wb.h(parcel, readInt21);
                    } else if (c22 == 3) {
                        dataHolder2 = (DataHolder) wb.g(parcel, readInt21, DataHolder.CREATOR);
                    } else if (c22 == 4) {
                        parcelFileDescriptor = (ParcelFileDescriptor) wb.g(parcel, readInt21, ParcelFileDescriptor.CREATOR);
                    } else if (c22 == 5) {
                        j11 = wb.w(parcel, readInt21);
                    } else if (c22 != 6) {
                        wb.y(parcel, readInt21);
                    } else {
                        bArr8 = wb.b(parcel, readInt21);
                    }
                }
                wb.m(parcel, z39);
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
                Bundle o4 = m0.o(mediaDescription.getExtras());
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
