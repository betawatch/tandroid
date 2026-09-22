package ai;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class aa extends ImageReceiver {
    public final /* synthetic */ Runnable[] a;
    public final /* synthetic */ da b;

    public aa(Runnable[] runnableArr, da daVar) {
        this.a = runnableArr;
        this.b = daVar;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        Runnable runnable = this.a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            ((a1.e) this.b.d).run();
        }
        AndroidUtilities.runOnUIThread(new a3.d(this, 16));
        return imageBitmapByKey;
    }
}
