package gg;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
