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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class oc1 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ qc1 d;

    public oc1(Context context, qc1 qc1Var) {
        this.d = qc1Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        ArrayList arrayList = this.d.V0;
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
        qc1 qc1Var = this.d;
        j5Var.setPattern((TLRPC.TL_wallPaper) qc1Var.V0.get(i10));
        j5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(qc1Var.k1, qc1Var.t1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (qc1Var.b == 1) {
                int D0 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Pd);
                long j10 = qc1Var.v.l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    i11 = i12 != 0 ? i12 : D0;
                }
            } else if (qc1Var.C1 instanceof zh1) {
                i11 = qc1Var.d1;
            }
            if (i11 == 0 || qc1Var.m1 < 0.0f) {
                j5Var.getImageReceiver().setBlendMode(null);
                return;
            }
            ImageReceiver imageReceiver = qc1Var.y0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.setBlendMode(blendMode);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.I1;
        nc1 nc1Var = new nc1(this);
        org.telegram.ui.Cells.j5 j5Var = new org.telegram.ui.Cells.j5(this.c);
        j5Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        j5Var.J = i12;
        j5Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        j5Var.U = i11;
        j5Var.T = nc1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(j5Var, null);
        j5Var.H = radialProgress2;
        radialProgress2.r(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        j5Var.Q = new Paint(3);
        j5Var.S = DownloadController.getInstance(i12).generateObserverTag();
        j5Var.setOutlineProvider(new ci.n1(7));
        j5Var.setClipToOutline(true);
        return new org.telegram.ui.Components.wl0(j5Var);
    }
}
