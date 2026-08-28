package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d21 extends org.telegram.ui.Components.vk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ h21 d;

    public d21(h21 h21Var, Context context) {
        this.d = h21Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 3 || i9 == 2;
    }

    @Override // f2.r0
    public final int h() {
        h21 h21Var = this.d;
        return h21Var.h + (h21Var.f < 0 ? h21Var.getMediaDataController().getReactionsList().size() : 0) + 1;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        h21 h21Var = this.d;
        if (i9 == h21Var.d) {
            return 2;
        }
        if (i9 == h21Var.f) {
            return 3;
        }
        return i9 == h() - 1 ? 4 : 1;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        if (j(i9) != 1) {
            return;
        }
        org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) q1Var.a;
        h21 h21Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = h21Var.getMediaDataController().getReactionsList().get(i9 - h21Var.e);
        String str = tL_availableReaction.reaction;
        i10 = ((org.telegram.ui.ActionBar.o2) h21Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i10).getDoubleTapReaction());
        i11 = ((org.telegram.ui.ActionBar.o2) h21Var).currentAccount;
        yVar.a(tL_availableReaction, contains, i11);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b5 b5Var;
        View view;
        h21 h21Var = this.d;
        Context context = this.c;
        if (i9 == 0) {
            b5Var = ((org.telegram.ui.ActionBar.o2) h21Var).parentLayout;
            org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context, b5Var, 2);
            faVar.setImportantForAccessibility(4);
            faVar.r = h21Var;
            view = faVar;
        } else if (i9 == 2) {
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            b9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            view = b9Var;
        } else if (i9 == 3) {
            g21 g21Var = new g21(h21Var, context);
            g21Var.a(false);
            view = g21Var;
        } else if (i9 != 4) {
            view = new org.telegram.ui.Cells.y(context, true, true);
        } else {
            View anVar = new org.telegram.ui.Components.an(context, 24);
            anVar.setTag(-33024);
            view = anVar;
        }
        return new org.telegram.ui.Components.ik0(view);
    }
}
