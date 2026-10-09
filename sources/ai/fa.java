package ai;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class fa {
    public final int a;
    public final dv b;
    public final f30 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.j5 f;
    public final org.telegram.ui.Components.j5 g;

    public fa(View view) {
        dv dvVar = new dv(1, view);
        this.a = UserConfig.selectedAccount;
        this.b = dvVar;
        hs hsVar = hs.h;
        this.f = new org.telegram.ui.Components.j5(dvVar, 350L, hsVar);
        this.g = new org.telegram.ui.Components.j5(dvVar, 350L, hsVar);
        f30 f30Var = new f30();
        this.c = f30Var;
        f30Var.a = true;
        f30Var.b = true;
        b(false);
        f30Var.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        f30Var.c.setStyle(Paint.Style.STROKE);
        f30Var.c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f.a(this.d, false);
        int a10 = this.g.a(this.e, false);
        f30 f30Var = this.c;
        f30Var.d(a2, a10, 0, 0);
        f30Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return f30Var.c;
    }

    public final void b(boolean z10) {
        d(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.hk, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ik, false), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        if (peerColor != null) {
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.i6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.i6.I.q()), z10);
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
        dv dvVar = this.b;
        if (dvVar != null) {
            dvVar.run();
        }
    }
}
