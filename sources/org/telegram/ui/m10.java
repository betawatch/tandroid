package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class m10 extends org.telegram.ui.Components.vl0 {
    public final /* synthetic */ t10 c;

    public m10(t10 t10Var) {
        this.c = t10Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        t10 t10Var = this.c;
        if (t10Var.f.isEmpty()) {
            return 0;
        }
        return t10Var.f.size() + (!t10Var.N ? 1 : 0);
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 >= this.c.f.size() ? 3 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 0) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) c1Var.a;
            t10 t10Var = this.c;
            MessageObject messageObject = (MessageObject) t10Var.f.get(i10);
            s2Var.O = t10Var.p0;
            s2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            s2Var.s2 = i10 != h() - 1;
            s2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.nk(this, s2Var, messageObject, s2Var.getMessage() != null && s2Var.getMessage().getId() == messageObject.getId(), 1));
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
