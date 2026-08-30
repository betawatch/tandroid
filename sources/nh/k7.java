package nh;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p20;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class k7 {
    public final int a;
    public final hu b;
    public final p20 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.c5 f;
    public final org.telegram.ui.Components.c5 g;

    public k7(View view) {
        hu huVar = new hu(1, view);
        this.a = UserConfig.selectedAccount;
        this.b = huVar;
        nr nrVar = nr.h;
        this.f = new org.telegram.ui.Components.c5(huVar, 350L, nrVar);
        this.g = new org.telegram.ui.Components.c5(huVar, 350L, nrVar);
        p20 p20Var = new p20();
        this.c = p20Var;
        p20Var.a = true;
        p20Var.b = true;
        b(false);
        p20Var.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        p20Var.c.setStyle(Paint.Style.STROKE);
        p20Var.c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f.a(this.d, false);
        int a10 = this.g.a(this.e, false);
        p20 p20Var = this.c;
        p20Var.d(a2, a10, 0, 0);
        p20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return p20Var.c;
    }

    public final void b(boolean z4) {
        d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ik, false), z4);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z4) {
        if (peerColor != null) {
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.j6.I.q()), z4);
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
        hu huVar = this.b;
        if (huVar != null) {
            huVar.run();
        }
    }
}
