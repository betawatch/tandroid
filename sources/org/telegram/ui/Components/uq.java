package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class uq extends tj0 {
    public final /* synthetic */ vq c;

    public uq(vq vqVar) {
        this.c = vqVar;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f == 3;
    }

    @Override // v4.h0
    public final int b() {
        vq vqVar = this.c;
        return vqVar.V1 ? vqVar.U1.size() + 3 : vqVar.W1 ? 2 : 1;
    }

    @Override // v4.h0
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

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        TLObject M0;
        String str;
        int i10 = e1Var.f;
        View view = e1Var.a;
        if (i10 != 3) {
            if (i10 != 2) {
                if (i10 == 1) {
                    ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131743430, null), org.telegram.ui.ActionBar.j6.L6, 0, new fo(this, 5), null), true, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
                    return;
                }
                return;
            } else {
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                n4Var.setTextSize(15.0f);
                n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(2.0f));
                n4Var.setText(org.telegram.messenger.hd.M0(2131743443, null).replace(":", ""));
                return;
            }
        }
        vq vqVar = this.c;
        TLRPC.Peer peer = (TLRPC.Peer) vqVar.U1.get(i7 - 3);
        long B1 = org.telegram.messenger.gj.B1(peer);
        if (B1 > 0) {
            M0 = org.telegram.messenger.np.s1(vqVar.a).a2(Long.valueOf(B1));
            str = org.telegram.messenger.hd.M0(2131743349, null);
        } else {
            M0 = org.telegram.messenger.np.s1(vqVar.a).M0(Long.valueOf(-B1));
            str = null;
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        h4Var.e(M0, null, str, i7 != b() - 1);
        h4Var.c(peer == vqVar.Z1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [ai.q2, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = viewGroup.getContext();
        vq vqVar = this.c;
        if (i7 == 1) {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.a7, y8Var, vqVar.J0);
            y8Var.setTopPadding(17);
            y8Var.setBottomPadding(17);
            frameLayout = y8Var;
        } else if (i7 == 2) {
            frameLayout = new org.telegram.ui.Cells.n4(context, 22);
        } else if (i7 != 3) {
            boolean z10 = vqVar.X1;
            ?? q2Var = new ai.q2(context, 6);
            q2Var.setOrientation(1);
            fh0 fh0Var = new fh0(context);
            fh0Var.setAutoRepeat(true);
            fh0Var.f(R.raw.utyan_schedule, org.telegram.messenger.ns.x1, org.telegram.messenger.ns.x1, null);
            fh0Var.d();
            q2Var.addView(fh0Var, c8.ja.t(org.telegram.messenger.ns.x1, org.telegram.messenger.ns.x1, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(z10 ? org.telegram.messenger.hd.a0(null, null, 2131744903, new Object[0]) : org.telegram.messenger.hd.a0(null, null, 2131744900, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
            q2Var.addView(textView, c8.ja.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.j5, null);
            textView2.setText(z10 ? org.telegram.messenger.hd.a0(null, null, 2131743458, new Object[0]) : org.telegram.messenger.hd.a0(null, null, 2131743333, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            q2Var.addView(textView2, c8.ja.t(-2, -2, 1, 28, 0, 28, 17));
            frameLayout = q2Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.h4(context, 1, 0, false);
        }
        frameLayout.setLayoutParams(new v4.p0(-1, -2));
        return new cj0(frameLayout);
    }
}
