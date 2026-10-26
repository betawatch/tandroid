package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.a01;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class i6 implements l2 {
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ a01 c;

    public i6(a01 a01Var, org.telegram.ui.ActionBar.r2 r2Var, Context context) {
        this.c = a01Var;
        this.a = r2Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Cells.l2
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l2
    public final void c() {
        org.telegram.ui.ActionBar.r2 r2Var = this.a;
        di.h7 storiesController = r2Var.getMessagesController().getStoriesController();
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
        r2Var.getOrCreateStoryViewer().G(this.b, null, arrayList2, 0, null, null, new di.q7(this.c), false);
    }

    @Override // org.telegram.ui.Cells.l2
    public final void e(p2 p2Var) {
        org.telegram.ui.ActionBar.r2 r2Var = this.a;
        if (r2Var.getMessagesController().getStoriesController().I(p2Var.getDialogId())) {
            r2Var.getOrCreateStoryViewer().getClass();
            r2Var.getOrCreateStoryViewer().D(r2Var.getContext(), p2Var.getDialogId(), new di.q7(this.c));
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
