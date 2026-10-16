package eg;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.List;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
