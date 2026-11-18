package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tp0 implements org.telegram.messenger.rr, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ gt0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ tp0(gt0 gt0Var, TL_stories.StoryItem storyItem) {
        this.a = gt0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.messenger.rr
    public void a(String str) {
        r0.getStoriesController().r(r0.m1, str, new ph(10, this.a, this.b));
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        gt0 gt0Var = this.a;
        org.telegram.ui.ActionBar.h2 h2Var = gt0Var.y1;
        h2Var.getMessagesController().R1().s(arrayList, gt0Var.m1);
        lc.b0(h2Var).Q(R.raw.ic_delete, 36, org.telegram.messenger.gd.G(1, "StoriesDeleted", new Object[0])).j();
        gt0Var.V(false);
    }
}
