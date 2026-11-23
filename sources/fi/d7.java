package fi;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class d7 extends ImageReceiver {
    public final /* synthetic */ Runnable[] K1;
    public final /* synthetic */ f7 L1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(Runnable[] runnableArr, f7 f7Var) {
        super(null);
        this.K1 = runnableArr;
        this.L1 = f7Var;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean y0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        boolean y02 = super.y0(drawable, str, i7, z10, i10);
        Runnable runnable = this.K1[0];
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            ((l4) this.L1.d).run();
        }
        org.telegram.messenger.g0.g3(new f2.a(this, 15));
        return y02;
    }
}
