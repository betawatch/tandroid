package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class q21 extends org.telegram.ui.Components.rl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ u21 d;

    public q21(u21 u21Var, Context context) {
        this.d = u21Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // f2.o0
    public final int h() {
        u21 u21Var = this.d;
        return u21Var.h + (u21Var.f < 0 ? u21Var.getMediaDataController().getReactionsList().size() : 0) + 1;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        u21 u21Var = this.d;
        if (i10 == u21Var.d) {
            return 2;
        }
        if (i10 == u21Var.f) {
            return 3;
        }
        return i10 == h() - 1 ? 4 : 1;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12;
        if (j(i10) != 1) {
            return;
        }
        org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) l1Var.a;
        u21 u21Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = u21Var.getMediaDataController().getReactionsList().get(i10 - u21Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.p2) u21Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.p2) u21Var).currentAccount;
        yVar.a(tL_availableReaction, contains, i12);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.e5 e5Var;
        View view;
        u21 u21Var = this.d;
        Context context = this.c;
        if (i10 == 0) {
            e5Var = ((org.telegram.ui.ActionBar.p2) u21Var).parentLayout;
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context, e5Var, 2);
            eaVar.setImportantForAccessibility(4);
            eaVar.r = u21Var;
            view = eaVar;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            a9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            view = a9Var;
        } else if (i10 == 3) {
            t21 t21Var = new t21(u21Var, context);
            t21Var.a(false);
            view = t21Var;
        } else if (i10 != 4) {
            view = new org.telegram.ui.Cells.y(context, true, true);
        } else {
            View hnVar = new org.telegram.ui.Components.hn(context, 20);
            hnVar.setTag(-33024);
            view = hnVar;
        }
        return new org.telegram.ui.Components.el0(view);
    }
}
