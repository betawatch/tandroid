package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ci0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class lc {
    public String a;
    public final boolean b;
    public Bitmap c;
    public Drawable d;
    public int e;

    public lc(Bitmap bitmap, String str, int i10) {
        this.c = bitmap;
        this.a = str;
        this.e = i10;
        if (str != null) {
            ic.D().H(this.a);
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
        boolean p5 = ic.D().p(this.a);
        if (!ic.D().J(this.a, false) && p5) {
            Bitmap bitmap2 = this.c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    if (drawable instanceof ci0) {
                        ((ci0) drawable).C(false);
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

    public lc(Bitmap bitmap) {
        this.c = bitmap;
        this.b = true;
    }
}
