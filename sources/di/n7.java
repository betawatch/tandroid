package di;

import android.graphics.drawable.Drawable;
import bi.ab;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n7 extends ImageReceiver {
    public final /* synthetic */ Runnable[] J1;
    public final /* synthetic */ p7 K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(Runnable[] runnableArr, p7 p7Var) {
        super(null);
        this.J1 = runnableArr;
        this.K1 = p7Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i7, boolean z9, int i10) {
        boolean x02 = super.x0(drawable, str, i7, z9, i10);
        Runnable runnable = this.J1[0];
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            ((z0) this.K1.d).run();
        }
        org.telegram.messenger.g0.h3(new ab(this, 28));
        return x02;
    }
}
