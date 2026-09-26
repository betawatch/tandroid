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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class md1 extends org.telegram.ui.Components.vl0 {
    public final Context c;
    public final /* synthetic */ od1 d;

    public md1(Context context, od1 od1Var) {
        this.d = od1Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        ArrayList arrayList = this.d.U0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        BlendMode blendMode;
        org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) c1Var.a;
        od1 od1Var = this.d;
        k5Var.setPattern((TLRPC.TL_wallPaper) od1Var.U0.get(i10));
        k5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(od1Var.j1, od1Var.s1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (od1Var.b == 1) {
                int B0 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Pd);
                long j3 = od1Var.s.l;
                int i12 = (int) j3;
                if (i12 != 0 || j3 == 0) {
                    i11 = i12 != 0 ? i12 : B0;
                }
            } else if (od1Var.B1 instanceof yi1) {
                i11 = od1Var.c1;
            }
            if (i11 == 0 || od1Var.l1 < 0.0f) {
                k5Var.getImageReceiver().setBlendMode(null);
                return;
            }
            ImageReceiver imageReceiver = od1Var.x0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.setBlendMode(blendMode);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.H1;
        ld1 ld1Var = new ld1(this);
        org.telegram.ui.Cells.k5 k5Var = new org.telegram.ui.Cells.k5(this.c);
        k5Var.G = new RectF();
        int i12 = UserConfig.selectedAccount;
        k5Var.J = i12;
        k5Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        k5Var.U = i11;
        k5Var.T = ld1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(k5Var, null);
        k5Var.H = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        k5Var.Q = new Paint(3);
        k5Var.S = DownloadController.getInstance(i12).generateObserverTag();
        k5Var.setOutlineProvider(new ai.k2(7));
        k5Var.setClipToOutline(true);
        return new org.telegram.ui.Components.gl0(k5Var);
    }
}
