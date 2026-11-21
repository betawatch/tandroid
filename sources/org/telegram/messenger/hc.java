package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.oh0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class hc {
    public String a;
    public final boolean b;
    public Bitmap c;
    public Drawable d;
    public int e;

    public hc(Bitmap bitmap, String str, int i7) {
        this.c = bitmap;
        this.a = str;
        this.e = i7;
        if (str != null) {
            ec.D().H(this.a);
        }
    }

    public final void a() {
        Bitmap bitmap;
        if (this.a == null) {
            if (this.b && (bitmap = this.c) != null) {
                bitmap.recycle();
            }
            this.c = null;
            this.d = null;
            return;
        }
        boolean p10 = ec.D().p(this.a);
        if (!ec.D().J(this.a, false) && p10) {
            Bitmap bitmap2 = this.c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    if (drawable instanceof oh0) {
                        ((oh0) drawable).C(false);
                    } else if (drawable instanceof org.telegram.ui.Components.c6) {
                        ((org.telegram.ui.Components.c6) drawable).u();
                    } else if (drawable instanceof BitmapDrawable) {
                        ((BitmapDrawable) drawable).getBitmap().recycle();
                    }
                }
            }
        }
        this.a = null;
        this.c = null;
        this.d = null;
    }

    public hc(Bitmap bitmap) {
        this.c = bitmap;
        this.b = true;
    }
}
