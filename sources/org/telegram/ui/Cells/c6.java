package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.bw0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class c6 implements q2 {
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ bw0 c;

    public c6(bw0 bw0Var, org.telegram.ui.ActionBar.h2 h2Var, Context context) {
        this.c = bw0Var;
        this.a = h2Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Cells.q2
    public final boolean m() {
        return true;
    }

    @Override // org.telegram.ui.Cells.q2
    public final void q() {
        org.telegram.ui.ActionBar.h2 h2Var = this.a;
        fi.p6 R1 = h2Var.getMessagesController().R1();
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
        h2Var.getOrCreateStoryViewer().M(this.b, null, arrayList2, 0, null, null, new fi.y6(this.c), false);
    }

    @Override // org.telegram.ui.Cells.q2
    public final void u(u2 u2Var) {
        org.telegram.ui.ActionBar.h2 h2Var = this.a;
        if (h2Var.getMessagesController().R1().K(u2Var.getDialogId())) {
            h2Var.getOrCreateStoryViewer().getClass();
            h2Var.getOrCreateStoryViewer().J(h2Var.getContext(), u2Var.getDialogId(), new fi.y6(this.c));
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
