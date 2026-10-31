package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.nx0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f6 implements r2 {
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ nx0 c;

    public f6(nx0 nx0Var, org.telegram.ui.ActionBar.k2 k2Var, Context context) {
        this.c = nx0Var;
        this.a = k2Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean m() {
        return true;
    }

    @Override // org.telegram.ui.Cells.r2
    public final void q() {
        org.telegram.ui.ActionBar.k2 k2Var = this.a;
        th.e5 O1 = k2Var.getMessagesController().O1();
        ArrayList arrayList = O1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z10 = O1.E(0, org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long o10 = org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z10 || O1.E(0, o10) != 0) {
                arrayList2.add(Long.valueOf(o10));
            }
        }
        k2Var.getOrCreateStoryViewer().T(this.b, null, arrayList2, 0, null, null, new th.n5(this.c), false);
    }

    @Override // org.telegram.ui.Cells.r2
    public final void u(v2 v2Var) {
        org.telegram.ui.ActionBar.k2 k2Var = this.a;
        if (k2Var.getMessagesController().O1().K(v2Var.getDialogId())) {
            k2Var.getOrCreateStoryViewer().getClass();
            k2Var.getOrCreateStoryViewer().R(k2Var.getContext(), v2Var.getDialogId(), new th.n5(this.c));
        }
    }

    @Override // org.telegram.ui.Cells.r2
    public final void l(v2 v2Var) {
    }

    @Override // org.telegram.ui.Cells.r2
    public final void r(v2 v2Var) {
    }

    @Override // org.telegram.ui.Cells.r2
    public final void x(v2 v2Var) {
    }
}
