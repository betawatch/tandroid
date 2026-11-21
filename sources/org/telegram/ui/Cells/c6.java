package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.bw0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class c6 implements q2 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ bw0 c;

    public c6(bw0 bw0Var, org.telegram.ui.ActionBar.g2 g2Var, Context context) {
        this.c = bw0Var;
        this.a = g2Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Cells.q2
    public final boolean m() {
        return true;
    }

    @Override // org.telegram.ui.Cells.q2
    public final void q() {
        org.telegram.ui.ActionBar.g2 g2Var = this.a;
        fi.p6 R1 = g2Var.getMessagesController().R1();
        ArrayList arrayList = R1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z10 = R1.E(0, org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long o4 = org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList.get(i7)).peer);
            if (!z10 || R1.E(0, o4) != 0) {
                arrayList2.add(Long.valueOf(o4));
            }
        }
        g2Var.getOrCreateStoryViewer().M(this.b, null, arrayList2, 0, null, null, new fi.y6(this.c), false);
    }

    @Override // org.telegram.ui.Cells.q2
    public final void u(u2 u2Var) {
        org.telegram.ui.ActionBar.g2 g2Var = this.a;
        if (g2Var.getMessagesController().R1().K(u2Var.getDialogId())) {
            g2Var.getOrCreateStoryViewer().getClass();
            g2Var.getOrCreateStoryViewer().J(g2Var.getContext(), u2Var.getDialogId(), new fi.y6(this.c));
        }
    }

    @Override // org.telegram.ui.Cells.q2
    public final void l(u2 u2Var) {
    }

    @Override // org.telegram.ui.Cells.q2
    public final void r(u2 u2Var) {
    }

    @Override // org.telegram.ui.Cells.q2
    public final void w(u2 u2Var) {
    }
}
