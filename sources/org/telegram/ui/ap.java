package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ap extends v4.g0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ bp d;

    public ap(bp bpVar, Context context) {
        this.d = bpVar;
        this.c = context;
    }

    @Override // v4.g0
    public final int b() {
        bp bpVar = this.d;
        return (!bpVar.d.isEmpty() ? bpVar.n.size() + 1 : 0) + 2;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return 3;
        }
        if (i7 == 1) {
            return 0;
        }
        return i7 == 2 ? 1 : 2;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        View view = d1Var.a;
        int d = d(i7);
        bp bpVar = this.d;
        if (d != 0) {
            if (d == 1) {
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.id.M0(2131747822, null));
                return;
            } else {
                if (d != 2) {
                    return;
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) bpVar.n.get(i7 - 3);
                boolean contains = bpVar.d.contains(tL_availableReaction.reaction);
                i10 = ((org.telegram.ui.ActionBar.f2) bpVar).currentAccount;
                ((org.telegram.ui.Cells.x) view).a(tL_availableReaction, contains, i10);
                return;
            }
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        org.telegram.ui.ActionBar.t6.U(z8Var.getTextView(), org.telegram.ui.ActionBar.m6.B6, null);
        int i11 = bpVar.s;
        if (i11 == 1) {
            z8Var.setText(org.telegram.messenger.id.M0(2131751147, null));
        } else if (i11 == 0) {
            z8Var.setText(org.telegram.messenger.id.M0(2131751159, null));
        } else if (i11 == 2) {
            z8Var.setText(org.telegram.messenger.id.M0(2131751429, null));
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        if (i7 == 0) {
            return new org.telegram.ui.Components.xi0(new org.telegram.ui.Cells.z8(context));
        }
        if (i7 == 1) {
            return new org.telegram.ui.Components.xi0(new org.telegram.ui.Cells.n4(context, 23));
        }
        if (i7 != 3) {
            return new org.telegram.ui.Components.xi0(new org.telegram.ui.Cells.x(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        bp bpVar = this.d;
        org.telegram.messenger.g0.E2(bpVar.r);
        frameLayout.addView(bpVar.r);
        frameLayout.setLayoutParams(new v4.o0(-1, -2));
        return new org.telegram.ui.Components.xi0(frameLayout);
    }
}
