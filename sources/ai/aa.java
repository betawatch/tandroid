package ai;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
