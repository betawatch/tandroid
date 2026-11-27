// default package

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class jpe {
    public static Icon a(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        switch (iconCompat.a) {
            case -1:
                return (Icon) iconCompat.b;
            case 0:
            default:
                lq5.j("Unknown type");
                return null;
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.b);
                break;
            case 2:
                createWithBitmap = Icon.createWithResource(iconCompat.h(), iconCompat.e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.b, iconCompat.e, iconCompat.f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.b);
                break;
            case 5:
                int i = Build.VERSION.SDK_INT;
                Object obj = iconCompat.b;
                if (i < 26) {
                    createWithBitmap = Icon.createWithBitmap(IconCompat.b((Bitmap) obj, false));
                    break;
                } else {
                    createWithBitmap = j00.b((Bitmap) obj);
                    break;
                }
            case 6:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    createWithBitmap = mka.d(iconCompat.j());
                    break;
                } else {
                    if (context == null) {
                        c22.b(iconCompat.j(), "Context is required to resolve the file uri of the icon: ");
                        return null;
                    }
                    InputStream k = iconCompat.k(context);
                    if (k == null) {
                        lq5.o(iconCompat.j(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    if (i2 < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.b(BitmapFactory.decodeStream(k), false));
                        break;
                    } else {
                        createWithBitmap = j00.b(BitmapFactory.decodeStream(k));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.h;
        if (mode != IconCompat.k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }
}
