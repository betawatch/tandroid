package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class vp0 implements org.telegram.messenger.sr, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ jt0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ vp0(jt0 jt0Var, TL_stories.StoryItem storyItem) {
        this.a = jt0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.messenger.sr
    public void a(String str) {
        r0.getStoriesController().r(r0.m1, str, new rh(10, this.a, this.b));
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        jt0 jt0Var = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = jt0Var.y1;
        g2Var.getMessagesController().R1().s(arrayList, jt0Var.m1);
        lc.b0(g2Var).Q(R.raw.ic_delete, 36, org.telegram.messenger.hd.G(1, "StoriesDeleted", new Object[0])).j();
        jt0Var.V(false);
    }
}
