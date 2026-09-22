package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class i31 extends org.telegram.ui.Components.xl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ m31 d;

    public i31(m31 m31Var, Context context) {
        this.d = m31Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        m31 m31Var = this.d;
        return m31Var.h + (m31Var.f < 0 ? m31Var.getMediaDataController().getReactionsList().size() : 0) + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        m31 m31Var = this.d;
        if (i10 == m31Var.d) {
            return 2;
        }
        if (i10 == m31Var.f) {
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
        m31 m31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = m31Var.getMediaDataController().getReactionsList().get(i10 - m31Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.n2) m31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.n2) m31Var).currentAccount;
        yVar.a(tL_availableReaction, contains, i12);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        View view;
        m31 m31Var = this.d;
        Context context = this.c;
        if (i10 == 0) {
            d5Var = ((org.telegram.ui.ActionBar.n2) m31Var).parentLayout;
            org.telegram.ui.Cells.ja jaVar = new org.telegram.ui.Cells.ja(context, d5Var, 2);
            jaVar.setImportantForAccessibility(4);
            jaVar.r = m31Var;
            view = jaVar;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
            f9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            view = f9Var;
        } else if (i10 == 3) {
            l31 l31Var = new l31(m31Var, context);
            l31Var.a(false);
            view = l31Var;
        } else if (i10 != 4) {
            view = new org.telegram.ui.Cells.y(context, true, true);
        } else {
            View knVar = new org.telegram.ui.Components.kn(context, 23);
            knVar.setTag(-33024);
            view = knVar;
        }
        return new org.telegram.ui.Components.il0(view);
    }
}
