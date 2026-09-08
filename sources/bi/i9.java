package bi;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class i9 extends ImageReceiver {
    public final /* synthetic */ Runnable[] a;
    public final /* synthetic */ k9 b;

    public i9(Runnable[] runnableArr, k9 k9Var) {
        this.a = runnableArr;
        this.b = k9Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        Runnable runnable = this.a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            ((s8) this.b.d).run();
        }
        AndroidUtilities.runOnUIThread(new a3.d(this, 26));
        return imageBitmapByKey;
    }
}
