package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class o31 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ s31 d;

    public o31(s31 s31Var, Context context) {
        this.d = s31Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.g0
    public final int h() {
        s31 s31Var = this.d;
        return s31Var.h + (s31Var.f < 0 ? s31Var.getMediaDataController().getReactionsList().size() : 0) + 1;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        s31 s31Var = this.d;
        if (i10 == s31Var.d) {
            return 2;
        }
        if (i10 == s31Var.f) {
            return 3;
        }
        return i10 == h() - 1 ? 4 : 1;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        if (j(i10) != 1) {
            return;
        }
        org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) b1Var.a;
        s31 s31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = s31Var.getMediaDataController().getReactionsList().get(i10 - s31Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.m2) s31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.m2) s31Var).currentAccount;
        yVar.a(tL_availableReaction, contains, i12);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        View view;
        s31 s31Var = this.d;
        Context context = this.c;
        if (i10 == 0) {
            b5Var = ((org.telegram.ui.ActionBar.m2) s31Var).parentLayout;
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context, b5Var, 2);
            gaVar.setImportantForAccessibility(4);
            gaVar.r = s31Var;
            view = gaVar;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            view = e9Var;
        } else if (i10 == 3) {
            r31 r31Var = new r31(s31Var, context);
            r31Var.a(false);
            view = r31Var;
        } else if (i10 != 4) {
            view = new org.telegram.ui.Cells.y(context, true, true);
        } else {
            View xnVar = new org.telegram.ui.Components.xn(context, 23);
            xnVar.setTag(-33024);
            view = xnVar;
        }
        return new org.telegram.ui.Components.wl0(view);
    }
}
