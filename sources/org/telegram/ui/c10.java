package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c10 extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ j10 c;

    public c10(j10 j10Var) {
        this.c = j10Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        j10 j10Var = this.c;
        if (j10Var.f.isEmpty()) {
            return 0;
        }
        return j10Var.f.size() + (!j10Var.N ? 1 : 0);
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 >= this.c.f.size() ? 3 : 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        if (e1Var.f == 0) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) e1Var.a;
            j10 j10Var = this.c;
            MessageObject messageObject = (MessageObject) j10Var.f.get(i10);
            p2Var.O = j10Var.p0;
            p2Var.V(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            p2Var.s2 = i10 != h() - 1;
            p2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.lk(this, p2Var, messageObject, p2Var.getMessage() != null && p2Var.getMessage().getId() == messageObject.getId(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        ig.z zVar;
        if (i10 == 0) {
            zVar = new ig.z(2, viewGroup.getContext(), true);
        } else if (i10 != 3) {
            org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(viewGroup.getContext(), null);
            z3Var.setText(LocaleController.getString(R.string.SearchMessages));
            zVar = z3Var;
        } else {
            org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(viewGroup.getContext(), null);
            c10Var.setIsSingleCell(true);
            c10Var.setViewType(1);
            zVar = c10Var;
        }
        return ic.a.n(zVar, zVar, -1, -2);
    }
}
