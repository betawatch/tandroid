package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class p10 extends org.telegram.ui.Components.pm0 {
    public final /* synthetic */ w10 c;

    public p10(w10 w10Var) {
        this.c = w10Var;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override // s4.i0
    public final int h() {
        w10 w10Var = this.c;
        if (w10Var.f.isEmpty()) {
            return 0;
        }
        return w10Var.f.size() + (!w10Var.N ? 1 : 0);
    }

    @Override // s4.i0
    public final int j(int i10) {
        return i10 >= this.c.f.size() ? 3 : 0;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        if (d1Var.f == 0) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) d1Var.a;
            w10 w10Var = this.c;
            MessageObject messageObject = (MessageObject) w10Var.f.get(i10);
            s2Var.O = w10Var.p0;
            s2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            s2Var.s2 = i10 != h() - 1;
            s2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.qk(this, s2Var, messageObject, s2Var.getMessage() != null && s2Var.getMessage().getId() == messageObject.getId(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        gg.z zVar;
        if (i10 == 0) {
            zVar = new gg.z(2, viewGroup.getContext(), true);
        } else if (i10 != 3) {
            org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
            v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            zVar = v3Var;
        } else {
            org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(viewGroup.getContext(), null);
            j10Var.setIsSingleCell(true);
            j10Var.setViewType(1);
            zVar = j10Var;
        }
        return com.google.android.gms.internal.vision.e2.k(zVar, zVar, -1, -2);
    }
}
