package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.e01;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class d6 implements n2 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ e01 c;

    public d6(e01 e01Var, org.telegram.ui.ActionBar.p2 p2Var, Context context) {
        this.c = e01Var;
        this.a = p2Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Cells.n2
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Cells.n2
    public final void c() {
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        oh.t6 storiesController = p2Var.getMessagesController().getStoriesController();
        ArrayList arrayList = storiesController.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z4 = storiesController.D(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z4 || storiesController.D(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        p2Var.getOrCreateStoryViewer().F(this.b, null, arrayList2, 0, null, null, new oh.c7(this.c), false);
    }

    @Override // org.telegram.ui.Cells.n2
    public final void e(r2 r2Var) {
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        if (p2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            p2Var.getOrCreateStoryViewer().getClass();
            p2Var.getOrCreateStoryViewer().D(p2Var.getContext(), r2Var.getDialogId(), new oh.c7(this.c));
        }
    }

    @Override // org.telegram.ui.Cells.n2
    public final void a(r2 r2Var) {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void d(r2 r2Var) {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void f(r2 r2Var) {
    }
}
