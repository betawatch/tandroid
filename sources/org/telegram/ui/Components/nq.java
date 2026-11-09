package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class nq extends pj0 {
    public final /* synthetic */ oq c;

    public nq(oq oqVar) {
        this.c = oqVar;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 3;
    }

    @Override // v4.g0
    public final int b() {
        oq oqVar = this.c;
        return oqVar.R1 ? oqVar.Q1.size() + 3 : oqVar.S1 ? 2 : 1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        int i10 = 1;
        if (i7 != 1) {
            i10 = 2;
            if (i7 != 2) {
                return 3;
            }
        }
        return i10;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        TLObject M0;
        String str;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 3) {
            if (i10 != 2) {
                if (i10 == 1) {
                    ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131743430, null), org.telegram.ui.ActionBar.l6.L6, 0, new gp(this, 3), null), true, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
                    return;
                }
                return;
            } else {
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                n4Var.setTextSize(15.0f);
                n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(2.0f));
                n4Var.setText(org.telegram.messenger.id.M0(2131743443, null).replace(":", ""));
                return;
            }
        }
        oq oqVar = this.c;
        TLRPC.Peer peer = (TLRPC.Peer) oqVar.Q1.get(i7 - 3);
        long B1 = org.telegram.messenger.ij.B1(peer);
        if (B1 > 0) {
            M0 = org.telegram.messenger.qp.s1(oqVar.a).a2(Long.valueOf(B1));
            str = org.telegram.messenger.id.M0(2131743349, null);
        } else {
            M0 = org.telegram.messenger.qp.s1(oqVar.a).M0(Long.valueOf(-B1));
            str = null;
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        h4Var.e(M0, null, str, i7 != b() - 1);
        h4Var.c(peer == oqVar.V1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewGroup, android.widget.LinearLayout, bi.t] */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = viewGroup.getContext();
        oq oqVar = this.c;
        if (i7 == 1) {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.a7, z8Var, oqVar.I0);
            z8Var.setTopPadding(17);
            z8Var.setBottomPadding(17);
            frameLayout = z8Var;
        } else if (i7 == 2) {
            frameLayout = new org.telegram.ui.Cells.n4(context, 22);
        } else if (i7 != 3) {
            boolean z9 = oqVar.T1;
            ?? tVar = new bi.t(context, 6);
            tVar.setOrientation(1);
            dh0 dh0Var = new dh0(context);
            dh0Var.setAutoRepeat(true);
            dh0Var.f(R.raw.utyan_schedule, org.telegram.messenger.qs.x1, org.telegram.messenger.qs.x1, null);
            dh0Var.d();
            tVar.addView(dh0Var, c8.ha.t(org.telegram.messenger.qs.x1, org.telegram.messenger.qs.x1, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(z9 ? org.telegram.messenger.id.a0(null, null, 2131744903, new Object[0]) : org.telegram.messenger.id.a0(null, null, 2131744900, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, null);
            tVar.addView(textView, c8.ha.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.j5, null);
            textView2.setText(z9 ? org.telegram.messenger.id.a0(null, null, 2131743458, new Object[0]) : org.telegram.messenger.id.a0(null, null, 2131743333, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            tVar.addView(textView2, c8.ha.t(-2, -2, 1, 28, 0, 28, 17));
            frameLayout = tVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.h4(context, 1, 0, false);
        }
        frameLayout.setLayoutParams(new v4.o0(-1, -2));
        return new yi0(frameLayout);
    }
}
