package org.telegram.ui;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class kc1 extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public final /* synthetic */ mc1 d;

    public kc1(Context context, mc1 mc1Var) {
        this.d = mc1Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        ArrayList arrayList = this.d.U0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // s4.g0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        BlendMode blendMode;
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) b1Var.a;
        mc1 mc1Var = this.d;
        j5Var.setPattern((TLRPC.TL_wallPaper) mc1Var.U0.get(i10));
        j5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(mc1Var.j1, mc1Var.s1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (mc1Var.b == 1) {
                int C0 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Pd);
                long j10 = mc1Var.s.l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    i11 = i12 != 0 ? i12 : C0;
                }
            } else if (mc1Var.B1 instanceof uh1) {
                i11 = mc1Var.c1;
            }
            if (i11 == 0 || mc1Var.l1 < 0.0f) {
                j5Var.getImageReceiver().setBlendMode(null);
                return;
            }
            ImageReceiver imageReceiver = mc1Var.x0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.setBlendMode(blendMode);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.H1;
        jc1 jc1Var = new jc1(this);
        org.telegram.ui.Cells.j5 j5Var = new org.telegram.ui.Cells.j5(this.c);
        j5Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        j5Var.J = i12;
        j5Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        j5Var.U = i11;
        j5Var.T = jc1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(j5Var, null);
        j5Var.H = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        j5Var.Q = new Paint(3);
        j5Var.S = DownloadController.getInstance(i12).generateObserverTag();
        j5Var.setOutlineProvider(new ci.o1(7));
        j5Var.setClipToOutline(true);
        return new org.telegram.ui.Components.sl0(j5Var);
    }
}
