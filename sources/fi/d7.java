package fi;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
    public final boolean x0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        boolean x02 = super.x0(drawable, str, i7, z10, i10);
        Runnable runnable = this.K1[0];
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            ((a6) this.L1.d).run();
        }
        org.telegram.messenger.g0.g3(new f2.a(this, 16));
        return x02;
    }
}
