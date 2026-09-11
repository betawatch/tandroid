package bi;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class l9 {
    public final int a;
    public final lu b;
    public final o20 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.h5 f;
    public final org.telegram.ui.Components.h5 g;

    public l9(View view) {
        lu luVar = new lu(1, view);
        this.a = UserConfig.selectedAccount;
        this.b = luVar;
        pr prVar = pr.h;
        this.f = new org.telegram.ui.Components.h5(luVar, 350L, prVar);
        this.g = new org.telegram.ui.Components.h5(luVar, 350L, prVar);
        o20 o20Var = new o20();
        this.c = o20Var;
        o20Var.a = true;
        o20Var.b = true;
        b(false);
        o20Var.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        o20Var.c.setStyle(Paint.Style.STROKE);
        o20Var.c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f.a(this.d, false);
        int a10 = this.g.a(this.e, false);
        o20 o20Var = this.c;
        o20Var.d(a2, a10, 0, 0);
        o20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return o20Var.c;
    }

    public final void b(boolean z10) {
        d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ik, false), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        if (peerColor != null) {
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.j6.I.q()), z10);
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
        lu luVar = this.b;
        if (luVar != null) {
            luVar.run();
        }
    }
}
