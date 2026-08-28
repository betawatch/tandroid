package ih;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class k7 extends ImageReceiver {
    public final /* synthetic */ Runnable[] a;
    public final /* synthetic */ m7 b;

    public k7(Runnable[] runnableArr, m7 m7Var) {
        this.a = runnableArr;
        this.b = m7Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i9, boolean z10, int i10) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i9, z10, i10);
        Runnable runnable = this.a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.b.c.run();
        }
        AndroidUtilities.runOnUIThread(new g(this, 14));
        return imageBitmapByKey;
    }
}
