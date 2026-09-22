package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.q01;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class f6 implements o2 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ q01 c;

    public f6(q01 q01Var, org.telegram.ui.ActionBar.n2 n2Var, Context context) {
        this.c = q01Var;
        this.a = n2Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Cells.o2
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Cells.o2
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        ai.l9 storiesController = n2Var.getMessagesController().getStoriesController();
        ArrayList arrayList = storiesController.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z10 = storiesController.D(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z10 || storiesController.D(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        n2Var.getOrCreateStoryViewer().G(this.b, null, arrayList2, 0, null, null, new ai.u9(this.c), false);
    }

    @Override // org.telegram.ui.Cells.o2
    public final void e(s2 s2Var) {
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        if (n2Var.getMessagesController().getStoriesController().I(s2Var.getDialogId())) {
            n2Var.getOrCreateStoryViewer().getClass();
            n2Var.getOrCreateStoryViewer().D(n2Var.getContext(), s2Var.getDialogId(), new ai.u9(this.c));
        }
    }

    @Override // org.telegram.ui.Cells.o2
    public final void a(s2 s2Var) {
    }

    @Override // org.telegram.ui.Cells.o2
    public final void d(s2 s2Var) {
    }

    @Override // org.telegram.ui.Cells.o2
    public final void f(s2 s2Var) {
    }
}
