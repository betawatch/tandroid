// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.Build;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bf7 {
    public final Shader.TileMode a;
    public final Matrix b = new Matrix();
    public boolean c;
    public BitmapShader d;
    public WeakReference e;

    public bf7(Shader.TileMode tileMode) {
        this.a = tileMode;
    }

    public final void a(boolean z) {
        BitmapShader bitmapShader;
        if (this.c != z) {
            this.c = z;
            if (Build.VERSION.SDK_INT < 33 || (bitmapShader = this.d) == null) {
                return;
            }
            bitmapShader.setFilterMode(z ? 1 : 2);
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
