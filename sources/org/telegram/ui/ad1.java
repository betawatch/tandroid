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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ad1 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ cd1 d;

    public ad1(Context context, cd1 cd1Var) {
        this.d = cd1Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override // f2.o0
    public final int h() {
        ArrayList arrayList = this.d.R0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // f2.o0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        BlendMode blendMode;
        org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) l1Var.a;
        cd1 cd1Var = this.d;
        k5Var.setPattern((TLRPC.TL_wallPaper) cd1Var.R0.get(i10));
        k5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(cd1Var.g1, cd1Var.p1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (cd1Var.b == 1) {
                int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                long j10 = cd1Var.s.l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    i11 = i12 != 0 ? i12 : B0;
                }
            } else if (cd1Var.y1 instanceof mi1) {
                i11 = cd1Var.Z0;
            }
            if (i11 == 0 || cd1Var.i1 < 0.0f) {
                k5Var.getImageReceiver().setBlendMode(null);
                return;
            }
            ImageReceiver imageReceiver = cd1Var.u0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.setBlendMode(blendMode);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        int i11 = this.d.E1;
        zc1 zc1Var = new zc1(this);
        org.telegram.ui.Cells.k5 k5Var = new org.telegram.ui.Cells.k5(this.c);
        k5Var.D = new RectF();
        int i12 = UserConfig.selectedAccount;
        k5Var.G = i12;
        k5Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        k5Var.R = i11;
        k5Var.Q = zc1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(k5Var, null);
        k5Var.E = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        k5Var.N = new Paint(3);
        k5Var.P = DownloadController.getInstance(i12).generateObserverTag();
        k5Var.setOutlineProvider(new gg.j1(5));
        k5Var.setClipToOutline(true);
        return new org.telegram.ui.Components.el0(k5Var);
    }
}
