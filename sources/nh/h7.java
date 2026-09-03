package nh;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
            ((n4) this.b.d).run();
        }
        AndroidUtilities.runOnUIThread(new n5(this, 5));
        return imageBitmapByKey;
    }
}
