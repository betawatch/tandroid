package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jq0 implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.fs {
    public final /* synthetic */ zt0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ jq0(zt0 zt0Var, TL_stories.StoryItem storyItem) {
        this.a = zt0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.messenger.fs
    public void a(String str) {
        r0.getStoriesController().r(r0.l1, str, new vg(13, this.a, this.b));
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        zt0 zt0Var = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.x1;
        k2Var.getMessagesController().O1().s(arrayList, zt0Var.l1);
        cc.a0(k2Var).Q(R.raw.ic_delete, 36, org.telegram.messenger.cd.G(1, "StoriesDeleted", new Object[0])).j();
        zt0Var.T(false);
    }
}
