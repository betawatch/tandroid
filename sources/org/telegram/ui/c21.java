package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class c21 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ g21 d;

    public c21(g21 g21Var, Context context) {
        this.d = g21Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        g21 g21Var = this.d;
        return g21Var.f + (g21Var.e < 0 ? g21Var.getMediaDataController().getReactionsList().size() : 0) + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        g21 g21Var = this.d;
        if (i10 == g21Var.c) {
            return 2;
        }
        if (i10 == g21Var.e) {
            return 3;
        }
        return i10 == h() - 1 ? 4 : 1;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        int i12;
        if (j(i10) != 1) {
            return;
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) e1Var.a;
        g21 g21Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = g21Var.getMediaDataController().getReactionsList().get(i10 - g21Var.d);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.r2) g21Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.r2) g21Var).currentAccount;
        xVar.a(tL_availableReaction, contains, i12);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        View view;
        g21 g21Var = this.d;
        Context context = this.c;
        if (i10 == 0) {
            j5Var = ((org.telegram.ui.ActionBar.r2) g21Var).parentLayout;
            org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(context, j5Var, 2);
            kaVar.setImportantForAccessibility(4);
            kaVar.r = g21Var;
            view = kaVar;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context);
            i9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            view = i9Var;
        } else if (i10 == 3) {
            f21 f21Var = new f21(g21Var, context);
            f21Var.a(false);
            view = f21Var;
        } else if (i10 != 4) {
            view = new org.telegram.ui.Cells.x(context, true, true);
        } else {
            View vnVar = new org.telegram.ui.Components.vn(context, 23);
            vnVar.setTag(-33024);
            view = vnVar;
        }
        return new org.telegram.ui.Components.vl0(view);
    }
}
