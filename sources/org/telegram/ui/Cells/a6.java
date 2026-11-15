package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.zv0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class a6 implements p2 {
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ zv0 c;

    public a6(zv0 zv0Var, org.telegram.ui.ActionBar.e2 e2Var, Context context) {
        this.c = zv0Var;
        this.a = e2Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean m() {
        return true;
    }

    @Override // org.telegram.ui.Cells.p2
    public final void q() {
        org.telegram.ui.ActionBar.e2 e2Var = this.a;
        fi.s6 P1 = e2Var.getMessagesController().P1();
        ArrayList arrayList = P1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z10 = P1.E(0, org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long o4 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i7)).peer);
            if (!z10 || P1.E(0, o4) != 0) {
                arrayList2.add(Long.valueOf(o4));
            }
        }
        e2Var.getOrCreateStoryViewer().M(this.b, null, arrayList2, 0, null, null, new fi.b7(this.c), false);
    }

    @Override // org.telegram.ui.Cells.p2
    public final void u(t2 t2Var) {
        org.telegram.ui.ActionBar.e2 e2Var = this.a;
        if (e2Var.getMessagesController().P1().K(t2Var.getDialogId())) {
            e2Var.getOrCreateStoryViewer().getClass();
            e2Var.getOrCreateStoryViewer().J(e2Var.getContext(), t2Var.getDialogId(), new fi.b7(this.c));
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
