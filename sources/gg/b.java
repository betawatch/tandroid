package gg;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
