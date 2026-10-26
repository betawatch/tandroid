package ih;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class a {
    public WeakReference a;
    public long b;
    public boolean c = true;

    public final boolean a(Bitmap bitmap) {
        if (this.c) {
            return true;
        }
        WeakReference weakReference = this.a;
        if ((weakReference != null ? (Bitmap) weakReference.get() : null) != bitmap) {
            return true;
        }
        return ((bitmap == null || bitmap.isRecycled()) ? 0L : (long) bitmap.getGenerationId()) != this.b;
    }

    public final void b(Bitmap bitmap) {
        this.a = bitmap != null ? new WeakReference(bitmap) : null;
        this.b = (bitmap == null || bitmap.isRecycled()) ? 0L : bitmap.getGenerationId();
        this.c = false;
    }
}
