package dg;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.List;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
