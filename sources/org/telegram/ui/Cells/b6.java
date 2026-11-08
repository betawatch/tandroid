package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.aw0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class b6 implements p2 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ aw0 c;

    public b6(aw0 aw0Var, org.telegram.ui.ActionBar.f2 f2Var, Context context) {
        this.c = aw0Var;
        this.a = f2Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean m() {
        return true;
    }

    @Override // org.telegram.ui.Cells.p2
    public final void q() {
        org.telegram.ui.ActionBar.f2 f2Var = this.a;
        di.y6 P1 = f2Var.getMessagesController().P1();
        ArrayList arrayList = P1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z9 = P1.E(0, org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long o4 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i7)).peer);
            if (!z9 || P1.E(0, o4) != 0) {
                arrayList2.add(Long.valueOf(o4));
            }
        }
        f2Var.getOrCreateStoryViewer().M(this.b, null, arrayList2, 0, null, null, new di.h7(this.c), false);
    }

    @Override // org.telegram.ui.Cells.p2
    public final void u(t2 t2Var) {
        org.telegram.ui.ActionBar.f2 f2Var = this.a;
        if (f2Var.getMessagesController().P1().K(t2Var.getDialogId())) {
            f2Var.getOrCreateStoryViewer().getClass();
            f2Var.getOrCreateStoryViewer().J(f2Var.getContext(), t2Var.getDialogId(), new di.h7(this.c));
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
