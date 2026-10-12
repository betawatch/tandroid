package bi;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class l9 extends ImageReceiver {
    public final /* synthetic */ Runnable[] a;
    public final /* synthetic */ n9 b;

    public l9(Runnable[] runnableArr, n9 n9Var) {
        this.a = runnableArr;
        this.b = n9Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        Runnable runnable = this.a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            ((u8) this.b.d).run();
        }
        AndroidUtilities.runOnUIThread(new a3.d(this, 27));
        return imageBitmapByKey;
    }
}
