package oh;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q20;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class k7 {
    public final int a;
    public final ju b;
    public final q20 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.c5 f;
    public final org.telegram.ui.Components.c5 g;

    public k7(View view) {
        ju juVar = new ju(1, view);
        this.a = UserConfig.selectedAccount;
        this.b = juVar;
        pr prVar = pr.h;
        this.f = new org.telegram.ui.Components.c5(juVar, 350L, prVar);
        this.g = new org.telegram.ui.Components.c5(juVar, 350L, prVar);
        q20 q20Var = new q20();
        this.c = q20Var;
        q20Var.a = true;
        q20Var.b = true;
        b(false);
        q20Var.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        q20Var.c.setStyle(Paint.Style.STROKE);
        q20Var.c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f.a(this.d, false);
        int a10 = this.g.a(this.e, false);
        q20 q20Var = this.c;
        q20Var.d(a2, a10, 0, 0);
        q20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return q20Var.c;
    }

    public final void b(boolean z4) {
        d(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.hk, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ik, false), z4);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z4) {
        if (peerColor != null) {
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.k6.I.q()), z4);
        } else {
            b(z4);
        }
    }

    public final void d(int i10, int i11, boolean z4) {
        this.d = i10;
        this.e = i11;
        if (!z4) {
            this.f.a(i10, true);
            this.g.a(i11, true);
        }
        ju juVar = this.b;
        if (juVar != null) {
            juVar.run();
        }
    }
}
