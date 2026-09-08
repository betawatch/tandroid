package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.r01;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class d6 implements n2 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ r01 c;

    public d6(r01 r01Var, org.telegram.ui.ActionBar.n2 n2Var, Context context) {
        this.c = r01Var;
        this.a = n2Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Cells.n2
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Cells.n2
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        bi.u8 storiesController = n2Var.getMessagesController().getStoriesController();
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
        n2Var.getOrCreateStoryViewer().G(this.b, null, arrayList2, 0, null, null, new bi.d9(this.c), false);
    }

    @Override // org.telegram.ui.Cells.n2
    public final void e(r2 r2Var) {
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        if (n2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            n2Var.getOrCreateStoryViewer().getClass();
            n2Var.getOrCreateStoryViewer().D(n2Var.getContext(), r2Var.getDialogId(), new bi.d9(this.c));
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
