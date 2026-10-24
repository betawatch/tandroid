package ci;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class w7 extends ImageReceiver {
    public final /* synthetic */ Runnable[] a;
    public final /* synthetic */ y7 b;

    public w7(Runnable[] runnableArr, y7 y7Var) {
        this.a = runnableArr;
        this.b = y7Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        Runnable runnable = this.a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            ((u7) this.b.d).run();
        }
        AndroidUtilities.runOnUIThread(new androidx.fragment.app.d(this, 20));
        return imageBitmapByKey;
    }
}
