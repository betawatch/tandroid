package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.e01;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c6 implements m2 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ e01 c;

    public c6(e01 e01Var, org.telegram.ui.ActionBar.p2 p2Var, Context context) {
        this.c = e01Var;
        this.a = p2Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Cells.m2
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Cells.m2
    public final void c() {
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        nh.t6 storiesController = p2Var.getMessagesController().getStoriesController();
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
        p2Var.getOrCreateStoryViewer().F(this.b, null, arrayList2, 0, null, null, new nh.c7(this.c), false);
    }

    @Override // org.telegram.ui.Cells.m2
    public final void e(q2 q2Var) {
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        if (p2Var.getMessagesController().getStoriesController().I(q2Var.getDialogId())) {
            p2Var.getOrCreateStoryViewer().getClass();
            p2Var.getOrCreateStoryViewer().D(p2Var.getContext(), q2Var.getDialogId(), new nh.c7(this.c));
        }
    }

    @Override // org.telegram.ui.Cells.m2
    public final void a(q2 q2Var) {
    }

    @Override // org.telegram.ui.Cells.m2
    public final void d(q2 q2Var) {
    }

    @Override // org.telegram.ui.Cells.m2
    public final void f(q2 q2Var) {
    }
}
