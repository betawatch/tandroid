package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class q10 extends org.telegram.ui.Components.xl0 {
    public final /* synthetic */ x10 c;

    public q10(x10 x10Var) {
        this.c = x10Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        x10 x10Var = this.c;
        if (x10Var.f.isEmpty()) {
            return 0;
        }
        return x10Var.f.size() + (!x10Var.N ? 1 : 0);
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 >= this.c.f.size() ? 3 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 0) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) c1Var.a;
            x10 x10Var = this.c;
            MessageObject messageObject = (MessageObject) x10Var.f.get(i10);
            s2Var.O = x10Var.p0;
            s2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            s2Var.s2 = i10 != h() - 1;
            s2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.mk(this, s2Var, messageObject, s2Var.getMessage() != null && s2Var.getMessage().getId() == messageObject.getId(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        gg.a0 a0Var;
        if (i10 == 0) {
            a0Var = new gg.a0(2, viewGroup.getContext(), true);
        } else if (i10 != 3) {
            org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(viewGroup.getContext(), null);
            w3Var.setText(LocaleController.getString(R.string.SearchMessages));
            a0Var = w3Var;
        } else {
            org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(viewGroup.getContext(), null);
            t00Var.setIsSingleCell(true);
            t00Var.setViewType(1);
            a0Var = t00Var;
        }
        return com.google.android.gms.internal.vision.e2.k(a0Var, a0Var, -1, -2);
    }
}
