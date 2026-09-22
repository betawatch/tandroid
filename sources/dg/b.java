package dg;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.List;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class b extends BitmapDrawable {
    public final List a;

    public b(Bitmap bitmap, List list) {
        super(bitmap);
        this.a = list;
    }

    public static BitmapDrawable a(Bitmap bitmap, List list) {
        if (bitmap == null) {
            return null;
        }
        return (list == null || list.isEmpty()) ? new BitmapDrawable(bitmap) : new b(bitmap, list);
    }
}
