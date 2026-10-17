package ci;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.x20;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class a8 {
    public final int a;
    public final uu b;
    public final x20 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.i5 f;
    public final org.telegram.ui.Components.i5 g;

    public a8(View view) {
        uu uuVar = new uu(1, view);
        this.a = UserConfig.selectedAccount;
        this.b = uuVar;
        bs bsVar = bs.h;
        this.f = new org.telegram.ui.Components.i5(uuVar, 350L, bsVar);
        this.g = new org.telegram.ui.Components.i5(uuVar, 350L, bsVar);
        x20 x20Var = new x20();
        this.c = x20Var;
        x20Var.a = true;
        x20Var.b = true;
        b(false);
        x20Var.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        x20Var.c.setStyle(Paint.Style.STROKE);
        x20Var.c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f.a(this.d, false);
        int a10 = this.g.a(this.e, false);
        x20 x20Var = this.c;
        x20Var.d(a2, a10, 0, 0);
        x20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return x20Var.c;
    }

    public final void b(boolean z10) {
        d(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.hk, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.ik, false), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        if (peerColor != null) {
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.h6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.h6.I.q()), z10);
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
        uu uuVar = this.b;
        if (uuVar != null) {
            uuVar.run();
        }
    }
}
