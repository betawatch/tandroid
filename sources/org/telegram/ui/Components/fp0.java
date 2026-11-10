package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp0 implements org.telegram.messenger.wr, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ ys0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ fp0(ys0 ys0Var, TL_stories.StoryItem storyItem) {
        this.a = ys0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.messenger.wr
    public void a(String str) {
        r0.getStoriesController().r(r0.l1, str, new ex(5, this.a, this.b));
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        ys0 ys0Var = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = ys0Var.x1;
        f2Var.getMessagesController().P1().s(arrayList, ys0Var.l1);
        gc.a0(f2Var).Q(R.raw.ic_delete, 36, org.telegram.messenger.id.G(1, "StoriesDeleted", new Object[0])).j();
        ys0Var.V(false);
    }
}
