package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.sv0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a6 implements p2 {
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ sv0 c;

    public a6(sv0 sv0Var, org.telegram.ui.ActionBar.d2 d2Var, Context context) {
        this.c = sv0Var;
        this.a = d2Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean m() {
        return true;
    }

    @Override // org.telegram.ui.Cells.p2
    public final void q() {
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        ei.z6 P1 = d2Var.getMessagesController().P1();
        ArrayList arrayList = P1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z10 = P1.E(0, org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            long o10 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i3)).peer);
            if (!z10 || P1.E(0, o10) != 0) {
                arrayList2.add(Long.valueOf(o10));
            }
        }
        d2Var.getOrCreateStoryViewer().U(this.b, null, arrayList2, 0, null, null, new ei.i7(this.c), false);
    }

    @Override // org.telegram.ui.Cells.p2
    public final void u(t2 t2Var) {
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        if (d2Var.getMessagesController().P1().K(t2Var.getDialogId())) {
            d2Var.getOrCreateStoryViewer().getClass();
            d2Var.getOrCreateStoryViewer().R(d2Var.getContext(), t2Var.getDialogId(), new ei.i7(this.c));
        }
    }

    @Override // org.telegram.ui.Cells.p2
    public final void l(t2 t2Var) {
    }

    @Override // org.telegram.ui.Cells.p2
    public final void r(t2 t2Var) {
    }

    @Override // org.telegram.ui.Cells.p2
    public final void w(t2 t2Var) {
    }
}
