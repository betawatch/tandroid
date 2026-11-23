package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class up0 implements org.telegram.messenger.rr, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ it0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ up0(it0 it0Var, TL_stories.StoryItem storyItem) {
        this.a = it0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.messenger.rr
    public void a(String str) {
        r0.getStoriesController().r(r0.m1, str, new ph(11, this.a, this.b));
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        it0 it0Var = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = it0Var.y1;
        g2Var.getMessagesController().R1().s(arrayList, it0Var.m1);
        kc.b0(g2Var).Q(R.raw.ic_delete, 36, org.telegram.messenger.gd.G(1, "StoriesDeleted", new Object[0])).j();
        it0Var.V(false);
    }
}
