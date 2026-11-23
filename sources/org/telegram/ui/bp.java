package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class bp extends v4.i0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ cp d;

    public bp(cp cpVar, Context context) {
        this.d = cpVar;
        this.c = context;
    }

    @Override // v4.i0
    public final int b() {
        cp cpVar = this.d;
        return (!cpVar.d.isEmpty() ? cpVar.n.size() + 1 : 0) + 2;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0) {
            return 3;
        }
        if (i7 == 1) {
            return 0;
        }
        return i7 == 2 ? 1 : 2;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        View view = f1Var.a;
        int d = d(i7);
        cp cpVar = this.d;
        if (d != 0) {
            if (d == 1) {
                ((org.telegram.ui.Cells.o4) view).setText(org.telegram.messenger.hd.N0(2131747628, null));
                return;
            } else {
                if (d != 2) {
                    return;
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) cpVar.n.get(i7 - 3);
                boolean contains = cpVar.d.contains(tL_availableReaction.reaction);
                i10 = ((org.telegram.ui.ActionBar.g2) cpVar).currentAccount;
                ((org.telegram.ui.Cells.x) view).a(tL_availableReaction, contains, i10);
                return;
            }
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        org.telegram.ui.ActionBar.t6.U(a9Var.getTextView(), org.telegram.ui.ActionBar.m6.B6, null);
        int i11 = cpVar.s;
        if (i11 == 1) {
            a9Var.setText(org.telegram.messenger.hd.N0(2131751135, null));
        } else if (i11 == 0) {
            a9Var.setText(org.telegram.messenger.hd.N0(2131751147, null));
        } else if (i11 == 2) {
            a9Var.setText(org.telegram.messenger.hd.N0(2131751417, null));
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        if (i7 == 0) {
            return new org.telegram.ui.Components.mj0(new org.telegram.ui.Cells.a9(context));
        }
        if (i7 == 1) {
            return new org.telegram.ui.Components.mj0(new org.telegram.ui.Cells.o4(context, 23));
        }
        if (i7 != 3) {
            return new org.telegram.ui.Components.mj0(new org.telegram.ui.Cells.x(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        cp cpVar = this.d;
        org.telegram.messenger.g0.E2(cpVar.r);
        frameLayout.addView(cpVar.r);
        frameLayout.setLayoutParams(new v4.q0(-1, -2));
        return new org.telegram.ui.Components.mj0(frameLayout);
    }
}
