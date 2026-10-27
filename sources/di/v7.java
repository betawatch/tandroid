package di;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class v7 extends ImageReceiver {
    public final /* synthetic */ Runnable[] a;
    public final /* synthetic */ x7 b;

    public v7(Runnable[] runnableArr, x7 x7Var) {
        this.a = runnableArr;
        this.b = x7Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        Runnable runnable = this.a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            ((b4) this.b.d).run();
        }
        AndroidUtilities.runOnUIThread(new bi.u6(this, 27));
        return imageBitmapByKey;
    }
}
