package ih;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
