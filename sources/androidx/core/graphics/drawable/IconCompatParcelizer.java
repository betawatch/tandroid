package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(ydc ydcVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = ydcVar.f(iconCompat.a, 1);
        byte[] bArr = iconCompat.c;
        if (ydcVar.e(2)) {
            Parcel parcel = ((zdc) ydcVar).e;
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
        iconCompat.d = ydcVar.g(iconCompat.d, 3);
        iconCompat.e = ydcVar.f(iconCompat.e, 4);
        iconCompat.f = ydcVar.f(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) ydcVar.g(iconCompat.g, 6);
        String str = iconCompat.i;
        if (ydcVar.e(7)) {
            str = ((zdc) ydcVar).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (ydcVar.e(8)) {
            str2 = ((zdc) ydcVar).e.readString();
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
                lq5.j("Invalid icon");
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

    public static void write(IconCompat iconCompat, ydc ydcVar) {
        ydcVar.getClass();
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
            ydcVar.j(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            ydcVar.i(2);
            Parcel parcel = ((zdc) ydcVar).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            ydcVar.k(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            ydcVar.j(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            ydcVar.j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            ydcVar.k(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            ydcVar.i(7);
            ((zdc) ydcVar).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            ydcVar.i(8);
            ((zdc) ydcVar).e.writeString(str2);
        }
    }
}
