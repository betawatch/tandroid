package di;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.z20;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class y7 {
    public final int a;
    public final vu b;
    public final z20 c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.j5 f;
    public final org.telegram.ui.Components.j5 g;
    public boolean h;
    public MessagesController.PeerColor i;
    public int j;

    public y7(View view) {
        vu vuVar = new vu(1, view);
        this.a = UserConfig.selectedAccount;
        this.b = vuVar;
        ds dsVar = ds.h;
        this.f = new org.telegram.ui.Components.j5(vuVar, 350L, dsVar);
        this.g = new org.telegram.ui.Components.j5(vuVar, 350L, dsVar);
        z20 z20Var = new z20();
        this.c = z20Var;
        z20Var.a = true;
        z20Var.b = true;
        b(false);
        z20Var.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        z20Var.c.setStyle(Paint.Style.STROKE);
        z20Var.c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int storyColor1;
        int storyColor2;
        int i10 = this.j;
        int i11 = org.telegram.ui.ActionBar.f7.b;
        org.telegram.ui.Components.j5 j5Var = this.g;
        org.telegram.ui.Components.j5 j5Var2 = this.f;
        if (i10 != i11) {
            this.j = i11;
            try {
                if (this.h) {
                    storyColor1 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.hk, false);
                    storyColor2 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ik, false);
                } else {
                    MessagesController.PeerColor peerColor = this.i;
                    if (peerColor != null) {
                        storyColor1 = peerColor.getStoryColor1(org.telegram.ui.ActionBar.y6.I.q());
                        storyColor2 = this.i.getStoryColor2(org.telegram.ui.ActionBar.y6.I.q());
                    }
                }
                if (storyColor1 != this.d || storyColor2 != this.e) {
                    this.d = storyColor1;
                    this.e = storyColor2;
                    j5Var2.a(storyColor1, true);
                    j5Var.a(storyColor2, true);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        int a2 = j5Var2.a(this.d, false);
        int a10 = j5Var.a(this.e, false);
        z20 z20Var = this.c;
        z20Var.d(a2, a10, 0, 0);
        z20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return z20Var.c;
    }

    public final void b(boolean z10) {
        this.h = true;
        this.i = null;
        this.j = org.telegram.ui.ActionBar.f7.b;
        d(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.hk, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ik, false), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        this.i = peerColor;
        this.j = org.telegram.ui.ActionBar.f7.b;
        if (peerColor == null) {
            b(z10);
        } else {
            this.h = false;
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.y6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.y6.I.q()), z10);
        }
    }

    public final void d(int i10, int i11, boolean z10) {
        this.d = i10;
        this.e = i11;
        if (!z10) {
            this.f.a(i10, true);
            this.g.a(i11, true);
        }
        vu vuVar = this.b;
        if (vuVar != null) {
            vuVar.run();
        }
    }
}
