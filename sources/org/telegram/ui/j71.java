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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j71 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public final /* synthetic */ l71 d;

    public j71(Context context, l71 l71Var) {
        this.d = l71Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override // u4.h0
    public final int b() {
        ArrayList arrayList = this.d.W0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // u4.h0
    public final int d(int i3) {
        return 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        BlendMode blendMode;
        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) d1Var.a;
        l71 l71Var = this.d;
        i5Var.setPattern((TLRPC.TL_wallPaper) l71Var.W0.get(i3));
        i5Var.getImageReceiver().p1 = new PorterDuffColorFilter(l71Var.l1, l71Var.u1);
        if (Build.VERSION.SDK_INT >= 29) {
            int i10 = 0;
            if (l71Var.b == 1) {
                int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                long j10 = l71Var.w.l;
                int i11 = (int) j10;
                if (i11 != 0 || j10 == 0) {
                    i10 = i11 != 0 ? i11 : E0;
                }
            } else if (l71Var.D1 instanceof kc1) {
                i10 = l71Var.e1;
            }
            if (i10 == 0 || l71Var.n1 < 0.0f) {
                i5Var.getImageReceiver().Z(null);
                return;
            }
            ImageReceiver imageReceiver = l71Var.z0.getImageReceiver();
            blendMode = BlendMode.SOFT_LIGHT;
            imageReceiver.Z(blendMode);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        int i10 = this.d.J1;
        i71 i71Var = new i71(this);
        org.telegram.ui.Cells.i5 i5Var = new org.telegram.ui.Cells.i5(this.c);
        i5Var.H = new RectF();
        int i11 = org.telegram.messenger.h10.t0;
        i5Var.K = i11;
        i5Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        i5Var.V = i10;
        i5Var.U = i71Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(i5Var, null);
        i5Var.I = radialProgress2;
        radialProgress2.r(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        i5Var.R = new Paint(3);
        i5Var.T = org.telegram.messenger.z5.q(i11).k();
        i5Var.setOutlineProvider(new cg.p0(9));
        i5Var.setClipToOutline(true);
        return new org.telegram.ui.Components.bj0(i5Var);
    }
}
