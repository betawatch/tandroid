package di;

import android.graphics.drawable.Drawable;
import bi.ab;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class m7 extends ImageReceiver {
    public final /* synthetic */ Runnable[] J1;
    public final /* synthetic */ o7 K1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(Runnable[] runnableArr, o7 o7Var) {
        super(null);
        this.J1 = runnableArr;
        this.K1 = o7Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean x0(Drawable drawable, String str, int i7, boolean z9, int i10) {
        boolean x02 = super.x0(drawable, str, i7, z9, i10);
        Runnable runnable = this.J1[0];
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            ((z0) this.K1.d).run();
        }
        org.telegram.messenger.g0.h3(new ab(this, 29));
        return x02;
    }
}
