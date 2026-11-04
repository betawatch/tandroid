package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.Build;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pa0 {
    public final Shader.TileMode a;
    public final Matrix b = new Matrix();
    public boolean c;
    public BitmapShader d;
    public WeakReference e;

    public pa0(Shader.TileMode tileMode) {
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
