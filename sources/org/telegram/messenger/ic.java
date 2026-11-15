package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class ic {
    public String a;
    public final boolean b;
    public Bitmap c;
    public Drawable d;
    public int e;

    public ic(Bitmap bitmap, String str, int i7) {
        this.c = bitmap;
        this.a = str;
        this.e = i7;
        if (str != null) {
            fc.D().H(this.a);
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
        boolean p10 = fc.D().p(this.a);
        if (!fc.D().J(this.a, false) && p10) {
            Bitmap bitmap2 = this.c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    if (drawable instanceof ch0) {
                        ((ch0) drawable).C(false);
                    } else if (drawable instanceof org.telegram.ui.Components.t5) {
                        ((org.telegram.ui.Components.t5) drawable).u();
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

    public ic(Bitmap bitmap) {
        this.c = bitmap;
        this.b = true;
    }
}
