package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp0 implements org.telegram.messenger.wr, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ xs0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ fp0(xs0 xs0Var, TL_stories.StoryItem storyItem) {
        this.a = xs0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.messenger.wr
    public void a(String str) {
        r0.getStoriesController().r(r0.l1, str, new fx(5, this.a, this.b));
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        xs0 xs0Var = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.x1;
        f2Var.getMessagesController().P1().s(arrayList, xs0Var.l1);
        hc.a0(f2Var).Q(R.raw.ic_delete, 36, org.telegram.messenger.id.G(1, "StoriesDeleted", new Object[0])).j();
        xs0Var.V(false);
    }
}
