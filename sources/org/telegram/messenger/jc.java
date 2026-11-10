package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class jc {
    public String a;
    public final boolean b;
    public Bitmap c;
    public Drawable d;
    public int e;

    public jc(Bitmap bitmap, String str, int i7) {
        this.c = bitmap;
        this.a = str;
        this.e = i7;
        if (str != null) {
            gc.D().H(this.a);
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
        boolean p10 = gc.D().p(this.a);
        if (!gc.D().J(this.a, false) && p10) {
            Bitmap bitmap2 = this.c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    if (drawable instanceof zg0) {
                        ((zg0) drawable).C(false);
                    } else if (drawable instanceof org.telegram.ui.Components.u5) {
                        ((org.telegram.ui.Components.u5) drawable).u();
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

    public jc(Bitmap bitmap) {
        this.c = bitmap;
        this.b = true;
    }
}
