package jh;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.xt;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class j7 {
    public final int a;
    public final xt b;
    public final c20 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.b5 f;
    public final org.telegram.ui.Components.b5 g;

    public j7(View view) {
        xt xtVar = new xt(1, view);
        this.a = UserConfig.selectedAccount;
        this.b = xtVar;
        er erVar = er.h;
        this.f = new org.telegram.ui.Components.b5(xtVar, 350L, erVar);
        this.g = new org.telegram.ui.Components.b5(xtVar, 350L, erVar);
        c20 c20Var = new c20();
        this.c = c20Var;
        c20Var.a = true;
        c20Var.b = true;
        b(false);
        c20Var.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        c20Var.c.setStyle(Paint.Style.STROKE);
        c20Var.c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f.a(this.d, false);
        int a3 = this.g.a(this.e, false);
        c20 c20Var = this.c;
        c20Var.d(a2, a3, 0, 0);
        c20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return c20Var.c;
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
        xt xtVar = this.b;
        if (xtVar != null) {
            xtVar.run();
        }
    }
}
