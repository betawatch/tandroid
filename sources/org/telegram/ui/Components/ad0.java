package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.Build;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class ad0 {
    public final Shader.TileMode a;
    public final Matrix b = new Matrix();
    public boolean c;
    public BitmapShader d;
    public WeakReference e;

    public ad0(Shader.TileMode tileMode) {
        this.a = tileMode;
    }

    public final void a(boolean z10) {
        BitmapShader bitmapShader;
        if (this.c != z10) {
            this.c = z10;
            if (Build.VERSION.SDK_INT < 33 || (bitmapShader = this.d) == null) {
                return;
            }
            bitmapShader.setFilterMode(z10 ? 1 : 2);
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
