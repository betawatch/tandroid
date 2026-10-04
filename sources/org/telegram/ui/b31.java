package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class b31 extends org.telegram.ui.Components.yl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ f31 d;

    public b31(f31 f31Var, Context context) {
        this.d = f31Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        f31 f31Var = this.d;
        return f31Var.h + (f31Var.f < 0 ? f31Var.getMediaDataController().getReactionsList().size() : 0) + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        f31 f31Var = this.d;
        if (i10 == f31Var.d) {
            return 2;
        }
        if (i10 == f31Var.f) {
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
        f31 f31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = f31Var.getMediaDataController().getReactionsList().get(i10 - f31Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.n2) f31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.n2) f31Var).currentAccount;
        yVar.a(tL_availableReaction, contains, i12);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        View view;
        f31 f31Var = this.d;
        Context context = this.c;
        if (i10 == 0) {
            c5Var = ((org.telegram.ui.ActionBar.n2) f31Var).parentLayout;
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context, c5Var, 2);
            iaVar.setImportantForAccessibility(4);
            iaVar.r = f31Var;
            view = iaVar;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            view = e9Var;
        } else if (i10 == 3) {
            e31 e31Var = new e31(f31Var, context);
            e31Var.a(false);
            view = e31Var;
        } else if (i10 != 4) {
            view = new org.telegram.ui.Cells.y(context, true, true);
        } else {
            View nnVar = new org.telegram.ui.Components.nn(context, 23);
            nnVar.setTag(-33024);
            view = nnVar;
        }
        return new org.telegram.ui.Components.il0(view);
    }
}
