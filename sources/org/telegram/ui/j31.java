package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class j31 extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ n31 d;

    public j31(n31 n31Var, Context context) {
        this.d = n31Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
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
        i11 = ((org.telegram.ui.ActionBar.o2) n31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.o2) n31Var).currentAccount;
        yVar.a(tL_availableReaction, contains, i12);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.e5 e5Var;
        View view;
        n31 n31Var = this.d;
        Context context = this.c;
        if (i10 == 0) {
            e5Var = ((org.telegram.ui.ActionBar.o2) n31Var).parentLayout;
            org.telegram.ui.Cells.ja jaVar = new org.telegram.ui.Cells.ja(context, e5Var, 2);
            jaVar.setImportantForAccessibility(4);
            jaVar.r = n31Var;
            view = jaVar;
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
            View knVar = new org.telegram.ui.Components.kn(context, 23);
            knVar.setTag(-33024);
            view = knVar;
        }
        return new org.telegram.ui.Components.wk0(view);
    }
}
