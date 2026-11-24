package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(zbc zbcVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = zbcVar.f(iconCompat.a, 1);
        byte[] bArr = iconCompat.c;
        if (zbcVar.e(2)) {
            Parcel parcel = ((acc) zbcVar).e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = zbcVar.g(iconCompat.d, 3);
        iconCompat.e = zbcVar.f(iconCompat.e, 4);
        iconCompat.f = zbcVar.f(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) zbcVar.g(iconCompat.g, 6);
        String str = iconCompat.i;
        if (zbcVar.e(7)) {
            str = ((acc) zbcVar).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (zbcVar.e(8)) {
            str2 = ((acc) zbcVar).e.readString();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                u36.j("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str3;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, zbc zbcVar) {
        zbcVar.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            zbcVar.j(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            zbcVar.i(2);
            Parcel parcel = ((acc) zbcVar).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            zbcVar.k(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            zbcVar.j(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            zbcVar.j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            zbcVar.k(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            zbcVar.i(7);
            ((acc) zbcVar).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            zbcVar.i(8);
            ((acc) zbcVar).e.writeString(str2);
        }
    }
}
