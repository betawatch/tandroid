package ei;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n7 extends ImageReceiver {
    public final /* synthetic */ Runnable[] K1;
    public final /* synthetic */ p7 L1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(Runnable[] runnableArr, p7 p7Var) {
        super(null);
        this.K1 = runnableArr;
        this.L1 = p7Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i3, boolean z10, int i10) {
        boolean x02 = super.x0(drawable, str, i3, z10, i10);
        Runnable runnable = this.K1[0];
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            ((b0) this.L1.d).run();
        }
        org.telegram.messenger.g0.h3(new z5(this, 4));
        return x02;
    }
}
