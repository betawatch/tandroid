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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class oc1 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ qc1 d;

    public oc1(Context context, qc1 qc1Var) {
        this.d = qc1Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        ArrayList arrayList = this.d.Q0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        BlendMode blendMode;
        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) n1Var.a;
        qc1 qc1Var = this.d;
        i5Var.setPattern((TLRPC.TL_wallPaper) qc1Var.Q0.get(i10));
        i5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(qc1Var.f1, qc1Var.o1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (qc1Var.b == 1) {
                int B0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                long j10 = qc1Var.s.l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    i11 = i12 != 0 ? i12 : B0;
                }
            } else if (qc1Var.x1 instanceof zh1) {
                i11 = qc1Var.Y0;
            }
            if (i11 == 0 || qc1Var.h1 < 0.0f) {
                i5Var.getImageReceiver().setBlendMode(null);
                return;
            }
            ImageReceiver imageReceiver = qc1Var.t0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.setBlendMode(blendMode);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.D1;
        nc1 nc1Var = new nc1(this);
        org.telegram.ui.Cells.i5 i5Var = new org.telegram.ui.Cells.i5(this.c);
        i5Var.C = new RectF();
        int i12 = UserConfig.selectedAccount;
        i5Var.F = i12;
        i5Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        i5Var.Q = i11;
        i5Var.P = nc1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(i5Var, null);
        i5Var.D = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        i5Var.M = new Paint(3);
        i5Var.O = DownloadController.getInstance(i12).generateObserverTag();
        i5Var.setOutlineProvider(new eg.k1(7));
        i5Var.setClipToOutline(true);
        return new org.telegram.ui.Components.vk0(i5Var);
    }
}
