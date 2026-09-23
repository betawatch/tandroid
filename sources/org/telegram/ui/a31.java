package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class a31 extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ e31 d;

    public a31(e31 e31Var, Context context) {
        this.d = e31Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        e31 e31Var = this.d;
        return e31Var.h + (e31Var.f < 0 ? e31Var.getMediaDataController().getReactionsList().size() : 0) + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        e31 e31Var = this.d;
        if (i10 == e31Var.d) {
            return 2;
        }
        if (i10 == e31Var.f) {
            return 3;
        }
        return i10 == h() - 1 ? 4 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        if (j(i10) != 1) {
            return;
        }
        org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) c1Var.a;
        e31 e31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = e31Var.getMediaDataController().getReactionsList().get(i10 - e31Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.n2) e31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.n2) e31Var).currentAccount;
        yVar.a(tL_availableReaction, contains, i12);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        View view;
        e31 e31Var = this.d;
        Context context = this.c;
        if (i10 == 0) {
            c5Var = ((org.telegram.ui.ActionBar.n2) e31Var).parentLayout;
            org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(context, c5Var, 2);
            kaVar.setImportantForAccessibility(4);
            kaVar.r = e31Var;
            view = kaVar;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
            f9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            view = f9Var;
        } else if (i10 == 3) {
            d31 d31Var = new d31(e31Var, context);
            d31Var.a(false);
            view = d31Var;
        } else if (i10 != 4) {
            view = new org.telegram.ui.Cells.y(context, true, true);
        } else {
            View lnVar = new org.telegram.ui.Components.ln(context, 23);
            lnVar.setTag(-33024);
            view = lnVar;
        }
        return new org.telegram.ui.Components.wk0(view);
    }
}
