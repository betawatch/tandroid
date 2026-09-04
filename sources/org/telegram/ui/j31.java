package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class j31 extends org.telegram.ui.Components.kl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ n31 d;

    public j31(n31 n31Var, Context context) {
        this.d = n31Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        n31 n31Var = this.d;
        return n31Var.h + (n31Var.f < 0 ? n31Var.getMediaDataController().getReactionsList().size() : 0) + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        n31 n31Var = this.d;
        if (i10 == n31Var.d) {
            return 2;
        }
        if (i10 == n31Var.f) {
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
        n31 n31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = n31Var.getMediaDataController().getReactionsList().get(i10 - n31Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.n2) n31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.n2) n31Var).currentAccount;
        yVar.a(tL_availableReaction, contains, i12);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        View view;
        n31 n31Var = this.d;
        Context context = this.c;
        if (i10 == 0) {
            d5Var = ((org.telegram.ui.ActionBar.n2) n31Var).parentLayout;
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context, d5Var, 2);
            iaVar.setImportantForAccessibility(4);
            iaVar.r = n31Var;
            view = iaVar;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            view = e9Var;
        } else if (i10 == 3) {
            m31 m31Var = new m31(n31Var, context);
            m31Var.a(false);
            view = m31Var;
        } else if (i10 != 4) {
            view = new org.telegram.ui.Cells.y(context, true, true);
        } else {
            View jnVar = new org.telegram.ui.Components.jn(context, 23);
            jnVar.setTag(-33024);
            view = jnVar;
        }
        return new org.telegram.ui.Components.vk0(view);
    }
}
