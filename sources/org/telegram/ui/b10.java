package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class b10 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ i10 c;

    public b10(i10 i10Var) {
        this.c = i10Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        i10 i10Var = this.c;
        if (i10Var.f.isEmpty()) {
            return 0;
        }
        return i10Var.f.size() + (!i10Var.N ? 1 : 0);
    }

    @Override // s4.g0
    public final int j(int i10) {
        return i10 >= this.c.f.size() ? 3 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f == 0) {
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) b1Var.a;
            i10 i10Var = this.c;
            MessageObject messageObject = (MessageObject) i10Var.f.get(i10);
            q2Var.O = i10Var.p0;
            q2Var.V(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            q2Var.s2 = i10 != h() - 1;
            q2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.lk(this, q2Var, messageObject, q2Var.getMessage() != null && q2Var.getMessage().getId() == messageObject.getId(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        hg.z zVar;
        if (i10 == 0) {
            zVar = new hg.z(2, viewGroup.getContext(), true);
        } else if (i10 != 3) {
            org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
            u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            zVar = u3Var;
        } else {
            org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(viewGroup.getContext(), null);
            b10Var.setIsSingleCell(true);
            b10Var.setViewType(1);
            zVar = b10Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(zVar, zVar, -1, -2);
    }
}
