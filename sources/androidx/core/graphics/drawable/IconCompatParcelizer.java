package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(y9c y9cVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = y9cVar.f(iconCompat.a, 1);
        byte[] bArr = iconCompat.c;
        if (y9cVar.e(2)) {
            Parcel parcel = ((z9c) y9cVar).e;
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
        iconCompat.d = y9cVar.g(iconCompat.d, 3);
        iconCompat.e = y9cVar.f(iconCompat.e, 4);
        iconCompat.f = y9cVar.f(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) y9cVar.g(iconCompat.g, 6);
        String str = iconCompat.i;
        if (y9cVar.e(7)) {
            str = ((z9c) y9cVar).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (y9cVar.e(8)) {
            str2 = ((z9c) y9cVar).e.readString();
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
                w26.j("Invalid icon");
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

    public static void write(IconCompat iconCompat, y9c y9cVar) {
        y9cVar.getClass();
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
            y9cVar.j(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            y9cVar.i(2);
            Parcel parcel = ((z9c) y9cVar).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            y9cVar.k(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            y9cVar.j(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            y9cVar.j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            y9cVar.k(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            y9cVar.i(7);
            ((z9c) y9cVar).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            y9cVar.i(8);
            ((z9c) y9cVar).e.writeString(str2);
        }
    }
}
