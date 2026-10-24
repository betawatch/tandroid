package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.wz0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class e6 implements m2 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ wz0 c;

    public e6(wz0 wz0Var, org.telegram.ui.ActionBar.o2 o2Var, Context context) {
        this.c = wz0Var;
        this.a = o2Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Cells.m2
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Cells.m2
    public final void c() {
        org.telegram.ui.ActionBar.o2 o2Var = this.a;
        ci.h7 storiesController = o2Var.getMessagesController().getStoriesController();
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
        o2Var.getOrCreateStoryViewer().G(this.b, null, arrayList2, 0, null, null, new ci.q7(this.c), false);
    }

    @Override // org.telegram.ui.Cells.m2
    public final void e(q2 q2Var) {
        org.telegram.ui.ActionBar.o2 o2Var = this.a;
        if (o2Var.getMessagesController().getStoriesController().I(q2Var.getDialogId())) {
            o2Var.getOrCreateStoryViewer().getClass();
            o2Var.getOrCreateStoryViewer().D(o2Var.getContext(), q2Var.getDialogId(), new ci.q7(this.c));
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
