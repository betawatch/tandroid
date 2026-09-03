package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n10 extends org.telegram.ui.Components.ql0 {
    public final /* synthetic */ u10 c;

    public n10(u10 u10Var) {
        this.c = u10Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
    public final int h() {
        u10 u10Var = this.c;
        if (u10Var.f.isEmpty()) {
            return 0;
        }
        return u10Var.f.size() + (!u10Var.K ? 1 : 0);
    }

    @Override // f2.o0
    public final int j(int i10) {
        return i10 >= this.c.f.size() ? 3 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        if (l1Var.f == 0) {
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) l1Var.a;
            u10 u10Var = this.c;
            MessageObject messageObject = (MessageObject) u10Var.f.get(i10);
            q2Var.L = u10Var.m0;
            q2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            q2Var.p2 = i10 != h() - 1;
            q2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.fk(this, q2Var, messageObject, q2Var.getMessage() != null && q2Var.getMessage().getId() == messageObject.getId(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.iu0 iu0Var;
        if (i10 == 0) {
            iu0Var = new org.telegram.ui.Components.iu0(1, viewGroup.getContext(), true);
        } else if (i10 != 3) {
            org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(viewGroup.getContext(), null);
            t3Var.setText(LocaleController.getString(R.string.SearchMessages));
            iu0Var = t3Var;
        } else {
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(viewGroup.getContext(), null);
            u00Var.setIsSingleCell(true);
            u00Var.setViewType(1);
            iu0Var = u00Var;
        }
        return ai.n(iu0Var, iu0Var, -1, -2);
    }
}
