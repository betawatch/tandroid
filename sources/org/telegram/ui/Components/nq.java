package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nq extends sj0 {
    public final /* synthetic */ oq c;

    public nq(oq oqVar) {
        this.c = oqVar;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 3;
    }

    @Override // u4.h0
    public final int b() {
        oq oqVar = this.c;
        return oqVar.S1 ? oqVar.R1.size() + 3 : oqVar.T1 ? 2 : 1;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i10 = 1;
        if (i3 != 1) {
            i10 = 2;
            if (i3 != 2) {
                return 3;
            }
        }
        return i10;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        TLObject M0;
        String str;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 3) {
            if (i10 != 2) {
                if (i10 == 1) {
                    ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131743440, null), org.telegram.ui.ActionBar.k6.L6, 0, new gp(this, 3), null), true, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
                    return;
                }
                return;
            } else {
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                n4Var.setTextSize(15.0f);
                n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(2.0f));
                n4Var.setText(org.telegram.messenger.bd.M0(2131743453, null).replace(":", ""));
                return;
            }
        }
        oq oqVar = this.c;
        TLRPC.Peer peer = (TLRPC.Peer) oqVar.R1.get(i3 - 3);
        long C1 = org.telegram.messenger.zi.C1(peer);
        if (C1 > 0) {
            M0 = org.telegram.messenger.hp.s1(oqVar.a).a2(Long.valueOf(C1));
            str = org.telegram.messenger.bd.M0(2131743359, null);
        } else {
            M0 = org.telegram.messenger.hp.s1(oqVar.a).M0(Long.valueOf(-C1));
            str = null;
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        h4Var.e(M0, null, str, i3 != b() - 1);
        h4Var.c(peer == oqVar.W1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewGroup, android.widget.LinearLayout, ci.q] */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout frameLayout;
        Context context = viewGroup.getContext();
        oq oqVar = this.c;
        if (i3 == 1) {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, y8Var, oqVar.J0);
            y8Var.setTopPadding(17);
            y8Var.setBottomPadding(17);
            frameLayout = y8Var;
        } else if (i3 == 2) {
            frameLayout = new org.telegram.ui.Cells.n4(context, 22);
        } else if (i3 != 3) {
            boolean z10 = oqVar.U1;
            ?? qVar = new ci.q(context, 6);
            qVar.setOrientation(1);
            fh0 fh0Var = new fh0(context);
            fh0Var.setAutoRepeat(true);
            fh0Var.f(R.raw.utyan_schedule, org.telegram.messenger.hs.x1, org.telegram.messenger.hs.x1, null);
            fh0Var.d();
            qVar.addView(fh0Var, b8.mf.t(org.telegram.messenger.hs.x1, org.telegram.messenger.hs.x1, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(z10 ? org.telegram.messenger.bd.a0(null, null, 2131744913, new Object[0]) : org.telegram.messenger.bd.a0(null, null, 2131744910, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
            qVar.addView(textView, b8.mf.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.j5, null);
            textView2.setText(z10 ? org.telegram.messenger.bd.a0(null, null, 2131743468, new Object[0]) : org.telegram.messenger.bd.a0(null, null, 2131743343, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            qVar.addView(textView2, b8.mf.t(-2, -2, 1, 28, 0, 28, 17));
            frameLayout = qVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.h4(context, 1, 0, false);
        }
        frameLayout.setLayoutParams(new u4.p0(-1, -2));
        return new bj0(frameLayout);
    }
}
