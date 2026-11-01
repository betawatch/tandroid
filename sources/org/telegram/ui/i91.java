package org.telegram.ui;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class i91 extends org.telegram.ui.Components.tk0 {
    public final Context c;
    public final /* synthetic */ k91 d;

    public i91(Context context, k91 k91Var) {
        this.d = k91Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.g0
    public final int b() {
        ArrayList arrayList = this.d.V0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // s4.g0
    public final int d(int i10) {
        return 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        BlendMode blendMode;
        org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) c1Var.a;
        k91 k91Var = this.d;
        n5Var.setPattern((TLRPC.TL_wallPaper) k91Var.V0.get(i10));
        n5Var.getImageReceiver().o1 = new PorterDuffColorFilter(k91Var.k1, k91Var.t1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = 0;
            if (k91Var.b == 1) {
                int E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.De);
                long j10 = k91Var.w.l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    i11 = i12 != 0 ? i12 : E0;
                }
            } else if (k91Var.C1 instanceof ke1) {
                i11 = k91Var.d1;
            }
            if (i11 == 0 || k91Var.m1 < 0.0f) {
                n5Var.getImageReceiver().Z(null);
                return;
            }
            ImageReceiver imageReceiver = k91Var.y0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.Z(blendMode);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        int i11 = this.d.I1;
        h91 h91Var = new h91(this);
        org.telegram.ui.Cells.n5 n5Var = new org.telegram.ui.Cells.n5(this.c);
        n5Var.G = new RectF();
        int i12 = org.telegram.messenger.e20.s0;
        n5Var.J = i12;
        n5Var.setRoundRadius(org.telegram.messenger.i0.L(6.0f));
        n5Var.U = i11;
        n5Var.T = h91Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(n5Var, null);
        n5Var.H = radialProgress2;
        radialProgress2.r(org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(70.0f), org.telegram.messenger.i0.L(70.0f));
        n5Var.Q = new Paint(3);
        n5Var.S = org.telegram.messenger.b6.q(i12).k();
        n5Var.setOutlineProvider(new bi.d2(6));
        n5Var.setClipToOutline(true);
        return new org.telegram.ui.Components.dk0(n5Var);
    }
}
