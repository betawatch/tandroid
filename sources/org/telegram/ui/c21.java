package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c21 extends org.telegram.ui.Components.yk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ g21 d;

    public c21(g21 g21Var, Context context) {
        this.d = g21Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // f2.q0
    public final int h() {
        g21 g21Var = this.d;
        return g21Var.h + (g21Var.f < 0 ? g21Var.getMediaDataController().getReactionsList().size() : 0) + 1;
    }

    @Override // f2.q0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        g21 g21Var = this.d;
        if (i10 == g21Var.d) {
            return 2;
        }
        if (i10 == g21Var.f) {
            return 3;
        }
        return i10 == h() - 1 ? 4 : 1;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        int i12;
        if (j(i10) != 1) {
            return;
        }
        org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) o1Var.a;
        g21 g21Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = g21Var.getMediaDataController().getReactionsList().get(i10 - g21Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.n2) g21Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.n2) g21Var).currentAccount;
        yVar.a(tL_availableReaction, contains, i12);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        View view;
        g21 g21Var = this.d;
        Context context = this.c;
        if (i10 == 0) {
            b5Var = ((org.telegram.ui.ActionBar.n2) g21Var).parentLayout;
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context, b5Var, 2);
            baVar.setImportantForAccessibility(4);
            baVar.r = g21Var;
            view = baVar;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
            x8Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            view = x8Var;
        } else if (i10 == 3) {
            f21 f21Var = new f21(g21Var, context);
            f21Var.a(false);
            view = f21Var;
        } else if (i10 != 4) {
            view = new org.telegram.ui.Cells.y(context, true, true);
        } else {
            View zmVar = new org.telegram.ui.Components.zm(context, 22);
            zmVar.setTag(-33024);
            view = zmVar;
        }
        return new org.telegram.ui.Components.lk0(view);
    }
}
