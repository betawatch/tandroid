package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import l2.b;
import l2.c;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = bVar.f(iconCompat.a, 1);
        byte[] bArr = iconCompat.c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).e;
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
        iconCompat.d = bVar.g(iconCompat.d, 3);
        iconCompat.e = bVar.f(iconCompat.e, 4);
        iconCompat.f = bVar.f(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) bVar.g(iconCompat.g, 6);
        String str = iconCompat.i;
        if (bVar.e(7)) {
            str = ((c) bVar).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (bVar.e(8)) {
            str2 = ((c) bVar).e.readString();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.b = parcelable;
                return iconCompat;
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

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
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
        int i10 = iconCompat.a;
        if (-1 != i10) {
            bVar.j(i10, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            bVar.i(2);
            Parcel parcel = ((c) bVar).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            bVar.k(parcelable, 3);
        }
        int i11 = iconCompat.e;
        if (i11 != 0) {
            bVar.j(i11, 4);
        }
        int i12 = iconCompat.f;
        if (i12 != 0) {
            bVar.j(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            bVar.k(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            bVar.i(7);
            ((c) bVar).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            bVar.i(8);
            ((c) bVar).e.writeString(str2);
        }
    }
}
