package dg;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.List;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
