package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class dr extends dk0 {
    public final /* synthetic */ er c;

    public dr(er erVar) {
        this.c = erVar;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 3;
    }

    @Override // v4.i0
    public final int b() {
        er erVar = this.c;
        return erVar.V1 ? erVar.U1.size() + 3 : erVar.W1 ? 2 : 1;
    }

    @Override // v4.i0
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

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        TLObject O0;
        String str;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 != 3) {
            if (i10 != 2) {
                if (i10 == 1) {
                    ((org.telegram.ui.Cells.a9) view).setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(2131743185, null), org.telegram.ui.ActionBar.m6.L6, 0, new oo(this, 5), null), true, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
                    return;
                }
                return;
            } else {
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                o4Var.setTextSize(15.0f);
                o4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(2.0f));
                o4Var.setText(org.telegram.messenger.hd.N0(2131743198, null).replace(":", ""));
                return;
            }
        }
        er erVar = this.c;
        TLRPC.Peer peer = (TLRPC.Peer) erVar.U1.get(i7 - 3);
        long B1 = org.telegram.messenger.gj.B1(peer);
        if (B1 > 0) {
            O0 = org.telegram.messenger.np.u1(erVar.a).c2(Long.valueOf(B1));
            str = org.telegram.messenger.hd.N0(2131743104, null);
        } else {
            O0 = org.telegram.messenger.np.u1(erVar.a).O0(Long.valueOf(-B1));
            str = null;
        }
        org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
        i4Var.e(O0, null, str, i7 != b() - 1);
        i4Var.c(peer == erVar.Z1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [ai.u2, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = viewGroup.getContext();
        er erVar = this.c;
        if (i7 == 1) {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.a7, a9Var, erVar.J0);
            a9Var.setTopPadding(17);
            a9Var.setBottomPadding(17);
            frameLayout = a9Var;
        } else if (i7 == 2) {
            frameLayout = new org.telegram.ui.Cells.o4(context, 22);
        } else if (i7 != 3) {
            boolean z10 = erVar.X1;
            ?? u2Var = new ai.u2(context, 6);
            u2Var.setOrientation(1);
            rh0 rh0Var = new rh0(context);
            rh0Var.setAutoRepeat(true);
            rh0Var.f(R.raw.utyan_schedule, org.telegram.messenger.ls.x1, org.telegram.messenger.ls.x1, null);
            rh0Var.d();
            u2Var.addView(rh0Var, c8.ma.t(org.telegram.messenger.ls.x1, org.telegram.messenger.ls.x1, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(z10 ? org.telegram.messenger.hd.a0(null, null, 2131744660, new Object[0]) : org.telegram.messenger.hd.a0(null, null, 2131744657, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
            u2Var.addView(textView, c8.ma.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.j5, null);
            textView2.setText(z10 ? org.telegram.messenger.hd.a0(null, null, 2131743213, new Object[0]) : org.telegram.messenger.hd.a0(null, null, 2131743088, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            u2Var.addView(textView2, c8.ma.t(-2, -2, 1, 28, 0, 28, 17));
            frameLayout = u2Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.i4(context, 1, 0, false);
        }
        frameLayout.setLayoutParams(new v4.q0(-1, -2));
        return new mj0(frameLayout);
    }
}
