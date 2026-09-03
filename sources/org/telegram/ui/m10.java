package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class m10 extends org.telegram.ui.Components.rl0 {
    public final /* synthetic */ t10 c;

    public m10(t10 t10Var) {
        this.c = t10Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        t10 t10Var = this.c;
        if (t10Var.f.isEmpty()) {
            return 0;
        }
        return t10Var.f.size() + (!t10Var.K ? 1 : 0);
    }

    @Override // f2.p0
    public final int j(int i10) {
        return i10 >= this.c.f.size() ? 3 : 0;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        if (m1Var.f == 0) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) m1Var.a;
            t10 t10Var = this.c;
            MessageObject messageObject = (MessageObject) t10Var.f.get(i10);
            r2Var.L = t10Var.m0;
            r2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            r2Var.p2 = i10 != h() - 1;
            r2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.hk(this, r2Var, messageObject, r2Var.getMessage() != null && r2Var.getMessage().getId() == messageObject.getId(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.iu0 iu0Var;
        if (i10 == 0) {
            iu0Var = new org.telegram.ui.Components.iu0(1, viewGroup.getContext(), true);
        } else if (i10 != 3) {
            org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
            u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            iu0Var = u3Var;
        } else {
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(viewGroup.getContext(), null);
            u00Var.setIsSingleCell(true);
            u00Var.setViewType(1);
            iu0Var = u00Var;
        }
        return yh.o(iu0Var, iu0Var, -1, -2);
    }
}
