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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ae1 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ ce1 d;

    public ae1(Context context, ce1 ce1Var) {
        this.d = ce1Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
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
        org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) b1Var.a;
        ce1 ce1Var = this.d;
        k5Var.setPattern((TLRPC.TL_wallPaper) ce1Var.U0.get(i10));
        k5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(ce1Var.j1, ce1Var.s1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (ce1Var.b == 1) {
                int C0 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Pd);
                long j10 = ce1Var.s.l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    i11 = i12 != 0 ? i12 : C0;
                }
            } else if (ce1Var.B1 instanceof oj1) {
                i11 = ce1Var.c1;
            }
            if (i11 == 0 || ce1Var.l1 < 0.0f) {
                k5Var.getImageReceiver().setBlendMode(null);
                return;
            }
            ImageReceiver imageReceiver = ce1Var.x0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.setBlendMode(blendMode);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.H1;
        zd1 zd1Var = new zd1(this);
        org.telegram.ui.Cells.k5 k5Var = new org.telegram.ui.Cells.k5(this.c);
        k5Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        k5Var.J = i12;
        k5Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        k5Var.U = i11;
        k5Var.T = zd1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(k5Var, null);
        k5Var.H = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        k5Var.Q = new Paint(3);
        k5Var.S = DownloadController.getInstance(i12).generateObserverTag();
        k5Var.setOutlineProvider(new bi.a2(7));
        k5Var.setClipToOutline(true);
        return new org.telegram.ui.Components.wl0(k5Var);
    }
}
