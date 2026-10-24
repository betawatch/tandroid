package ci;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.x20;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class z7 {
    public final int a;
    public final uu b;
    public final x20 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.i5 f;
    public final org.telegram.ui.Components.i5 g;
    public boolean h;
    public MessagesController.PeerColor i;
    public int j;

    public z7(View view) {
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
        int storyColor1;
        int storyColor2;
        int i10 = this.j;
        int i11 = org.telegram.ui.ActionBar.r6.b;
        org.telegram.ui.Components.i5 i5Var = this.g;
        org.telegram.ui.Components.i5 i5Var2 = this.f;
        if (i10 != i11) {
            this.j = i11;
            try {
                if (this.h) {
                    storyColor1 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.hk, false);
                    storyColor2 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ik, false);
                } else {
                    MessagesController.PeerColor peerColor = this.i;
                    if (peerColor != null) {
                        storyColor1 = peerColor.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q());
                        storyColor2 = this.i.getStoryColor2(org.telegram.ui.ActionBar.k6.I.q());
                    }
                }
                if (storyColor1 != this.d || storyColor2 != this.e) {
                    this.d = storyColor1;
                    this.e = storyColor2;
                    i5Var2.a(storyColor1, true);
                    i5Var.a(storyColor2, true);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        int a2 = i5Var2.a(this.d, false);
        int a10 = i5Var.a(this.e, false);
        x20 x20Var = this.c;
        x20Var.d(a2, a10, 0, 0);
        x20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return x20Var.c;
    }

    public final void b(boolean z10) {
        this.h = true;
        this.i = null;
        this.j = org.telegram.ui.ActionBar.r6.b;
        d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.hk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ik, false), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        this.i = peerColor;
        this.j = org.telegram.ui.ActionBar.r6.b;
        if (peerColor == null) {
            b(z10);
        } else {
            this.h = false;
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.k6.I.q()), z10);
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
