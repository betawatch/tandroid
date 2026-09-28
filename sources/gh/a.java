package gh;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
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
