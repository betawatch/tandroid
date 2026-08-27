package jh;

import android.graphics.drawable.Drawable;
import hh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class g7 extends ImageReceiver {
    public final /* synthetic */ Runnable[] a;
    public final /* synthetic */ i7 b;

    public g7(Runnable[] runnableArr, i7 i7Var) {
        this.a = runnableArr;
        this.b = i7Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        Runnable runnable = this.a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.b.c.run();
        }
        AndroidUtilities.runOnUIThread(new y9(this, 21));
        return imageBitmapByKey;
    }
}
