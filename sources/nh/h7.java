package nh;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class h7 extends ImageReceiver {
    public final /* synthetic */ Runnable[] a;
    public final /* synthetic */ j7 b;

    public h7(Runnable[] runnableArr, j7 j7Var) {
        this.a = runnableArr;
        this.b = j7Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z4, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z4, i11);
        Runnable runnable = this.a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.b.c.run();
        }
        AndroidUtilities.runOnUIThread(new n5(this, 5));
        return imageBitmapByKey;
    }
}
