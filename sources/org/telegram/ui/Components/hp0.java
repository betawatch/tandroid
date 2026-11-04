package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hp0 implements org.telegram.messenger.or, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ ws0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ hp0(ws0 ws0Var, TL_stories.StoryItem storyItem) {
        this.a = ws0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.messenger.or
    public void a(String str) {
        r0.getStoriesController().r(r0.m1, str, new ei(9, this.a, this.b));
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        ws0 ws0Var = this.a;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.y1;
        d2Var.getMessagesController().P1().s(arrayList, ws0Var.m1);
        fc.a0(d2Var).Q(R.raw.ic_delete, 36, org.telegram.messenger.bd.G(1, "StoriesDeleted", new Object[0])).j();
        ws0Var.V(false);
    }
}
