package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class jp0 implements org.telegram.messenger.tr, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ ys0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ jp0(ys0 ys0Var, TL_stories.StoryItem storyItem) {
        this.a = ys0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.messenger.tr
    public void a(String str) {
        r0.getStoriesController().r(r0.m1, str, new gh(10, this.a, this.b));
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        ys0 ys0Var = this.a;
        org.telegram.ui.ActionBar.e2 e2Var = ys0Var.y1;
        e2Var.getMessagesController().P1().s(arrayList, ys0Var.m1);
        cc.a0(e2Var).Q(R.raw.ic_delete, 36, org.telegram.messenger.hd.G(1, "StoriesDeleted", new Object[0])).j();
        ys0Var.V(false);
    }
}
