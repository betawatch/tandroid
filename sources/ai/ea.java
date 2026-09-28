package ai;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.sr;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final class ea {
    public final int a;
    public final pu b;
    public final r20 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.h5 f;
    public final org.telegram.ui.Components.h5 g;

    public ea(View view) {
        pu puVar = new pu(1, view);
        this.a = UserConfig.selectedAccount;
        this.b = puVar;
        sr srVar = sr.h;
        this.f = new org.telegram.ui.Components.h5(puVar, 350L, srVar);
        this.g = new org.telegram.ui.Components.h5(puVar, 350L, srVar);
        r20 r20Var = new r20();
        this.c = r20Var;
        r20Var.a = true;
        r20Var.b = true;
        b(false);
        r20Var.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        r20Var.c.setStyle(Paint.Style.STROKE);
        r20Var.c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f.a(this.d, false);
        int a10 = this.g.a(this.e, false);
        r20 r20Var = this.c;
        r20Var.d(a2, a10, 0, 0);
        r20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return r20Var.c;
    }

    public final void b(boolean z10) {
        d(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.hk, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.ik, false), z10);
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
        pu puVar = this.b;
        if (puVar != null) {
            puVar.run();
        }
    }
}
