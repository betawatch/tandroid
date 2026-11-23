package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ap extends v4.i0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ bp d;

    public ap(bp bpVar, Context context) {
        this.d = bpVar;
        this.c = context;
    }

    @Override // v4.i0
    public final int b() {
        bp bpVar = this.d;
        return (!bpVar.d.isEmpty() ? bpVar.n.size() + 1 : 0) + 2;
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
        bp bpVar = this.d;
        if (d != 0) {
            if (d == 1) {
                ((org.telegram.ui.Cells.o4) view).setText(org.telegram.messenger.gd.N0(2131747628, null));
                return;
            } else {
                if (d != 2) {
                    return;
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) bpVar.n.get(i7 - 3);
                boolean contains = bpVar.d.contains(tL_availableReaction.reaction);
                i10 = ((org.telegram.ui.ActionBar.g2) bpVar).currentAccount;
                ((org.telegram.ui.Cells.x) view).a(tL_availableReaction, contains, i10);
                return;
            }
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        org.telegram.ui.ActionBar.u6.U(z8Var.getTextView(), org.telegram.ui.ActionBar.n6.B6, null);
        int i11 = bpVar.s;
        if (i11 == 1) {
            z8Var.setText(org.telegram.messenger.gd.N0(2131751135, null));
        } else if (i11 == 0) {
            z8Var.setText(org.telegram.messenger.gd.N0(2131751147, null));
        } else if (i11 == 2) {
            z8Var.setText(org.telegram.messenger.gd.N0(2131751417, null));
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        if (i7 == 0) {
            return new org.telegram.ui.Components.mj0(new org.telegram.ui.Cells.z8(context));
        }
        if (i7 == 1) {
            return new org.telegram.ui.Components.mj0(new org.telegram.ui.Cells.o4(context, 23));
        }
        if (i7 != 3) {
            return new org.telegram.ui.Components.mj0(new org.telegram.ui.Cells.x(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        bp bpVar = this.d;
        org.telegram.messenger.g0.E2(bpVar.r);
        frameLayout.addView(bpVar.r);
        frameLayout.setLayoutParams(new v4.q0(-1, -2));
        return new org.telegram.ui.Components.mj0(frameLayout);
    }
}
