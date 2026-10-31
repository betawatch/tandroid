package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.bi0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class kc {
    public String a;
    public final boolean b;
    public Bitmap c;
    public Drawable d;
    public int e;

    public kc(Bitmap bitmap, String str, int i10) {
        this.c = bitmap;
        this.a = str;
        this.e = i10;
        if (str != null) {
            hc.D().H(this.a);
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
        boolean p5 = hc.D().p(this.a);
        if (!hc.D().J(this.a, false) && p5) {
            Bitmap bitmap2 = this.c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    if (drawable instanceof bi0) {
                        ((bi0) drawable).C(false);
                    } else if (drawable instanceof org.telegram.ui.Components.s5) {
                        ((org.telegram.ui.Components.s5) drawable).u();
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

    public kc(Bitmap bitmap) {
        this.c = bitmap;
        this.b = true;
    }
}
