package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a10 extends org.telegram.ui.Components.il0 {
    public final /* synthetic */ h10 c;

    public a10(h10 h10Var) {
        this.c = h10Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        h10 h10Var = this.c;
        if (h10Var.f.isEmpty()) {
            return 0;
        }
        return h10Var.f.size() + (!h10Var.J ? 1 : 0);
    }

    @Override // f2.p0
    public final int j(int i10) {
        return i10 >= this.c.f.size() ? 3 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        if (n1Var.f == 0) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) n1Var.a;
            h10 h10Var = this.c;
            MessageObject messageObject = (MessageObject) h10Var.f.get(i10);
            p2Var.K = h10Var.l0;
            p2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            p2Var.o2 = i10 != h() - 1;
            p2Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.hk(this, p2Var, messageObject, p2Var.getMessage() != null && p2Var.getMessage().getId() == messageObject.getId(), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.au0 au0Var;
        if (i10 == 0) {
            au0Var = new org.telegram.ui.Components.au0(1, viewGroup.getContext(), true);
        } else if (i10 != 3) {
            org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(viewGroup.getContext(), null);
            s3Var.setText(LocaleController.getString(R.string.SearchMessages));
            au0Var = s3Var;
        } else {
            org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(viewGroup.getContext(), null);
            p00Var.setIsSingleCell(true);
            p00Var.setViewType(1);
            au0Var = p00Var;
        }
        return th.m(au0Var, au0Var, -1, -2);
    }
}
