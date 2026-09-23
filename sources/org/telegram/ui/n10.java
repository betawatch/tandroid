package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class n10 extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ u10 c;

    public n10(u10 u10Var) {
        this.c = u10Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        u10 u10Var = this.c;
        if (u10Var.f.isEmpty()) {
            return 0;
        }
        return u10Var.f.size() + (!u10Var.N ? 1 : 0);
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 >= this.c.f.size() ? 3 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 0) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) c1Var.a;
            u10 u10Var = this.c;
            MessageObject messageObject = (MessageObject) u10Var.f.get(i10);
            r2Var.O = u10Var.p0;
            r2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            r2Var.s2 = i10 != h() - 1;
            r2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.nk(this, r2Var, messageObject, r2Var.getMessage() != null && r2Var.getMessage().getId() == messageObject.getId(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        gg.a0 a0Var;
        if (i10 == 0) {
            a0Var = new gg.a0(2, viewGroup.getContext(), true);
        } else if (i10 != 3) {
            org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
            v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            a0Var = v3Var;
        } else {
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(viewGroup.getContext(), null);
            u00Var.setIsSingleCell(true);
            u00Var.setViewType(1);
            a0Var = u00Var;
        }
        return com.google.android.gms.internal.vision.e2.k(a0Var, a0Var, -1, -2);
    }
}
