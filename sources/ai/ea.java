package ai;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.tr;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class ea {
    public final int a;
    public final qu b;
    public final s20 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.h5 f;
    public final org.telegram.ui.Components.h5 g;

    public ea(View view) {
        qu quVar = new qu(1, view);
        this.a = UserConfig.selectedAccount;
        this.b = quVar;
        tr trVar = tr.h;
        this.f = new org.telegram.ui.Components.h5(quVar, 350L, trVar);
        this.g = new org.telegram.ui.Components.h5(quVar, 350L, trVar);
        s20 s20Var = new s20();
        this.c = s20Var;
        s20Var.a = true;
        s20Var.b = true;
        b(false);
        s20Var.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        s20Var.c.setStyle(Paint.Style.STROKE);
        s20Var.c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f.a(this.d, false);
        int a10 = this.g.a(this.e, false);
        s20 s20Var = this.c;
        s20Var.d(a2, a10, 0, 0);
        s20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return s20Var.c;
    }

    public final void b(boolean z10) {
        d(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.hk, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.ik, false), z10);
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
        qu quVar = this.b;
        if (quVar != null) {
            quVar.run();
        }
    }
}
