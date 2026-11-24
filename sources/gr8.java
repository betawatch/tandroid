// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gr8 implements dg3 {
    public final /* synthetic */ d a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ bq8 c;

    public gr8(bq8 bq8Var, d dVar, Context context) {
        this.c = bq8Var;
        this.a = dVar;
        this.b = context;
    }

    @Override // dg3
    public final void k(hg3 hg3Var) {
        d dVar = this.a;
        if (dVar.getMessagesController().N1().J(hg3Var.getDialogId())) {
            dVar.getOrCreateStoryViewer().getClass();
            dVar.getOrCreateStoryViewer().H(dVar.getContext(), hg3Var.getDialogId(), new q4b(this.c));
        }
    }

    @Override // dg3
    public final boolean m() {
        return true;
    }

    @Override // dg3
    public final void r() {
        d dVar = this.a;
        h4b N1 = dVar.getMessagesController().N1();
        ArrayList arrayList = N1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z = N1.D(0, pg3.n(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            long n = pg3.n(((TL_stories.PeerStories) arrayList.get(i)).peer);
            if (!z || N1.D(0, n) != 0) {
                arrayList2.add(Long.valueOf(n));
            }
        }
        dVar.getOrCreateStoryViewer().K(this.b, null, arrayList2, 0, null, null, new q4b(this.c), false);
    }

    @Override // dg3
    public final void o(hg3 hg3Var) {
    }

    @Override // dg3
    public final void u(hg3 hg3Var) {
    }

    @Override // dg3
    public final void v(hg3 hg3Var) {
    }
}
