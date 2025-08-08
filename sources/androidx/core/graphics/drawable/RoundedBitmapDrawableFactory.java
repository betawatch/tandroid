package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public abstract class RoundedBitmapDrawableFactory {
    public static RoundedBitmapDrawable create(Resources resources, Bitmap bitmap) {
        return new RoundedBitmapDrawable21(resources, bitmap);
    }
}
