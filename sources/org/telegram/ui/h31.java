package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class h31 extends org.telegram.ui.Components.vl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ l31 d;

    public h31(l31 l31Var, Context context) {
        this.d = l31Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        l31 l31Var = this.d;
        return l31Var.h + (l31Var.f < 0 ? l31Var.getMediaDataController().getReactionsList().size() : 0) + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        l31 l31Var = this.d;
        if (i10 == l31Var.d) {
            return 2;
        }
        if (i10 == l31Var.f) {
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
        l31 l31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = l31Var.getMediaDataController().getReactionsList().get(i10 - l31Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.n2) l31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.n2) l31Var).currentAccount;
        yVar.a(tL_availableReaction, contains, i12);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        View view;
        l31 l31Var = this.d;
        Context context = this.c;
        if (i10 == 0) {
            d5Var = ((org.telegram.ui.ActionBar.n2) l31Var).parentLayout;
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context, d5Var, 2);
            iaVar.setImportantForAccessibility(4);
            iaVar.r = l31Var;
            view = iaVar;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            view = e9Var;
        } else if (i10 == 3) {
            k31 k31Var = new k31(l31Var, context);
            k31Var.a(false);
            view = k31Var;
        } else if (i10 != 4) {
            view = new org.telegram.ui.Cells.y(context, true, true);
        } else {
            View knVar = new org.telegram.ui.Components.kn(context, 23);
            knVar.setTag(-33024);
            view = knVar;
        }
        return new org.telegram.ui.Components.gl0(view);
    }
}
