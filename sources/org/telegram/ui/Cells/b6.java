package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.mz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b6 implements l2 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ mz0 c;

    public b6(mz0 mz0Var, org.telegram.ui.ActionBar.o2 o2Var, Context context) {
        this.c = mz0Var;
        this.a = o2Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Cells.l2
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l2
    public final void c() {
        org.telegram.ui.ActionBar.o2 o2Var = this.a;
        lh.s6 storiesController = o2Var.getMessagesController().getStoriesController();
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
        o2Var.getOrCreateStoryViewer().F(this.b, null, arrayList2, 0, null, null, new lh.b7(this.c), false);
    }

    @Override // org.telegram.ui.Cells.l2
    public final void e(p2 p2Var) {
        org.telegram.ui.ActionBar.o2 o2Var = this.a;
        if (o2Var.getMessagesController().getStoriesController().I(p2Var.getDialogId())) {
            o2Var.getOrCreateStoryViewer().getClass();
            o2Var.getOrCreateStoryViewer().D(o2Var.getContext(), p2Var.getDialogId(), new lh.b7(this.c));
        }
    }

    @Override // org.telegram.ui.Cells.l2
    public final void a(p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.l2
    public final void d(p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.l2
    public final void f(p2 p2Var) {
    }
}
