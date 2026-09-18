package ai;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
