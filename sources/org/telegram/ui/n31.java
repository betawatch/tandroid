package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class n31 extends org.telegram.ui.Components.ul0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ r31 d;

    public n31(r31 r31Var, Context context) {
        this.d = r31Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        r31 r31Var = this.d;
        return r31Var.h + (r31Var.f < 0 ? r31Var.getMediaDataController().getReactionsList().size() : 0) + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        r31 r31Var = this.d;
        if (i10 == r31Var.d) {
            return 2;
        }
        if (i10 == r31Var.f) {
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
        r31 r31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = r31Var.getMediaDataController().getReactionsList().get(i10 - r31Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.p2) r31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.p2) r31Var).currentAccount;
        yVar.a(tL_availableReaction, contains, i12);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        View view;
        r31 r31Var = this.d;
        Context context = this.c;
        if (i10 == 0) {
            f5Var = ((org.telegram.ui.ActionBar.p2) r31Var).parentLayout;
            org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(context, f5Var, 2);
            kaVar.setImportantForAccessibility(4);
            kaVar.r = r31Var;
            view = kaVar;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
            f9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            view = f9Var;
        } else if (i10 == 3) {
            q31 q31Var = new q31(r31Var, context);
            q31Var.a(false);
            view = q31Var;
        } else if (i10 != 4) {
            view = new org.telegram.ui.Cells.y(context, true, true);
        } else {
            View qnVar = new org.telegram.ui.Components.qn(context, 22);
            qnVar.setTag(-33024);
            view = qnVar;
        }
        return new org.telegram.ui.Components.fl0(view);
    }
}
