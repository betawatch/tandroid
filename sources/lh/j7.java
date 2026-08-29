package lh;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k20;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class j7 {
    public final int a;
    public final eu b;
    public final k20 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.f5 f;
    public final org.telegram.ui.Components.f5 g;

    public j7(View view) {
        eu euVar = new eu(1, view);
        this.a = UserConfig.selectedAccount;
        this.b = euVar;
        jr jrVar = jr.h;
        this.f = new org.telegram.ui.Components.f5(euVar, 350L, jrVar);
        this.g = new org.telegram.ui.Components.f5(euVar, 350L, jrVar);
        k20 k20Var = new k20();
        this.c = k20Var;
        k20Var.a = true;
        k20Var.b = true;
        b(false);
        k20Var.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        k20Var.c.setStyle(Paint.Style.STROKE);
        k20Var.c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f.a(this.d, false);
        int a10 = this.g.a(this.e, false);
        k20 k20Var = this.c;
        k20Var.d(a2, a10, 0, 0);
        k20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return k20Var.c;
    }

    public final void b(boolean z10) {
        d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ik, false), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        if (peerColor != null) {
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.g6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.g6.I.q()), z10);
        } else {
            b(z10);
        }
    }

    public final void d(int i10, int i11, boolean z10) {
        this.d = i10;
        this.e = i11;
        if (!z10) {
            this.f.a(i10, true);
            this.g.a(i11, true);
        }
        eu euVar = this.b;
        if (euVar != null) {
            euVar.run();
        }
    }
}
