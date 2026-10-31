package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xq extends sk0 {
    public final /* synthetic */ yq c;

    public xq(yq yqVar) {
        this.c = yqVar;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 3;
    }

    @Override // s4.g0
    public final int b() {
        yq yqVar = this.c;
        return yqVar.R1 ? yqVar.Q1.size() + 3 : yqVar.S1 ? 2 : 1;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                return 3;
            }
        }
        return i11;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        TLObject L0;
        String str;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 3) {
            if (i11 != 2) {
                if (i11 == 1) {
                    ((org.telegram.ui.Cells.b9) view).setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131743456, null), org.telegram.ui.ActionBar.t6.L6, 0, new ho(this, 5), null), true, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f)));
                    return;
                }
                return;
            } else {
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                p4Var.setTextSize(15.0f);
                p4Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(2.0f));
                p4Var.setText(org.telegram.messenger.cd.L0(2131743469, null).replace(":", ""));
                return;
            }
        }
        yq yqVar = this.c;
        TLRPC.Peer peer = (TLRPC.Peer) yqVar.Q1.get(i10 - 3);
        long C1 = org.telegram.messenger.jj.C1(peer);
        if (C1 > 0) {
            L0 = org.telegram.messenger.vp.r1(yqVar.a).Z1(Long.valueOf(C1));
            str = org.telegram.messenger.cd.L0(2131743375, null);
        } else {
            L0 = org.telegram.messenger.vp.r1(yqVar.a).L0(Long.valueOf(-C1));
            str = null;
        }
        org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
        j4Var.e(L0, null, str, i10 != b() - 1);
        j4Var.c(peer == yqVar.V1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewGroup, android.widget.LinearLayout, jg.z2] */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = viewGroup.getContext();
        yq yqVar = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, b9Var, yqVar.I0);
            b9Var.setTopPadding(17);
            b9Var.setBottomPadding(17);
            frameLayout = b9Var;
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.p4(context, 22);
        } else if (i10 != 3) {
            boolean z10 = yqVar.T1;
            ?? z2Var = new jg.z2(context, 6);
            z2Var.setOrientation(1);
            ei0 ei0Var = new ei0(context);
            ei0Var.setAutoRepeat(true);
            ei0Var.f(R.raw.utyan_schedule, org.telegram.messenger.zs.x1, org.telegram.messenger.zs.x1, null);
            ei0Var.d();
            z2Var.addView(ei0Var, w7.b6.t(org.telegram.messenger.zs.x1, org.telegram.messenger.zs.x1, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setText(z10 ? org.telegram.messenger.cd.a0(null, null, 2131744921, new Object[0]) : org.telegram.messenger.cd.a0(null, null, 2131744918, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
            z2Var.addView(textView, w7.b6.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.j5, null);
            textView2.setText(z10 ? org.telegram.messenger.cd.a0(null, null, 2131743484, new Object[0]) : org.telegram.messenger.cd.a0(null, null, 2131743359, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            z2Var.addView(textView2, w7.b6.t(-2, -2, 1, 28, 0, 28, 17));
            frameLayout = z2Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.j4(context, 1, 0, false);
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new ck0(frameLayout);
    }
}
