package gg;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class b extends BitmapDrawable {
    public final List a;

    public b(Bitmap bitmap, List list) {
        super(bitmap);
        this.a = list;
    }

    public static BitmapDrawable a(Bitmap bitmap, ArrayList arrayList) {
        if (bitmap == null) {
            return null;
        }
        return (arrayList == null || arrayList.isEmpty()) ? new BitmapDrawable(bitmap) : new b(bitmap, arrayList);
    }
}
