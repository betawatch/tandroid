package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.Build;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ua0 {
    public final Shader.TileMode a;
    public final Matrix b = new Matrix();
    public boolean c;
    public BitmapShader d;
    public WeakReference e;

    public ua0(Shader.TileMode tileMode) {
        this.a = tileMode;
    }

    public final void a(boolean z9) {
        BitmapShader bitmapShader;
        if (this.c != z9) {
            this.c = z9;
            if (Build.VERSION.SDK_INT < 33 || (bitmapShader = this.d) == null) {
                return;
            }
            bitmapShader.setFilterMode(z9 ? 1 : 2);
        }
    }

    public final boolean b(Bitmap bitmap) {
        WeakReference weakReference = this.e;
        if (weakReference != null && weakReference.get() == bitmap) {
            return false;
        }
        this.e = new WeakReference(bitmap);
        Shader.TileMode tileMode = this.a;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.d = bitmapShader;
        bitmapShader.setLocalMatrix(this.b);
        if (Build.VERSION.SDK_INT >= 33) {
            this.d.setFilterMode(this.c ? 1 : 2);
        }
        return true;
    }
}
