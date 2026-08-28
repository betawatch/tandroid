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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mc1 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ oc1 d;

    public mc1(Context context, oc1 oc1Var) {
        this.d = oc1Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override // f2.r0
    public final int h() {
        ArrayList arrayList = this.d.Q0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // f2.r0
    public final int j(int i9) {
        return 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        BlendMode blendMode;
        org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) q1Var.a;
        oc1 oc1Var = this.d;
        k5Var.setPattern((TLRPC.TL_wallPaper) oc1Var.Q0.get(i9));
        k5Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(oc1Var.f1, oc1Var.o1));
        if (Build.VERSION.SDK_INT >= 29) {
            int i10 = 0;
            if (oc1Var.b == 1) {
                int B0 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Pd);
                long j10 = oc1Var.s.l;
                int i11 = (int) j10;
                if (i11 != 0 || j10 == 0) {
                    i10 = i11 != 0 ? i11 : B0;
                }
            } else if (oc1Var.x1 instanceof xh1) {
                i10 = oc1Var.Y0;
            }
            if (i10 == 0 || oc1Var.h1 < 0.0f) {
                k5Var.getImageReceiver().setBlendMode(null);
                return;
            }
            ImageReceiver imageReceiver = oc1Var.t0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.setBlendMode(blendMode);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        int i10 = this.d.D1;
        lc1 lc1Var = new lc1(this);
        org.telegram.ui.Cells.k5 k5Var = new org.telegram.ui.Cells.k5(this.c);
        k5Var.C = new RectF();
        int i11 = UserConfig.selectedAccount;
        k5Var.F = i11;
        k5Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        k5Var.Q = i10;
        k5Var.P = lc1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(k5Var, null);
        k5Var.D = radialProgress2;
        radialProgress2.q(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        k5Var.M = new Paint(3);
        k5Var.O = DownloadController.getInstance(i11).generateObserverTag();
        k5Var.setOutlineProvider(new bg.q1(7));
        k5Var.setClipToOutline(true);
        return new org.telegram.ui.Components.ik0(k5Var);
    }
}
