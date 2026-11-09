package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gp0 implements org.telegram.messenger.wr, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ zs0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ gp0(zs0 zs0Var, TL_stories.StoryItem storyItem) {
        this.a = zs0Var;
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
        zs0 zs0Var = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = zs0Var.x1;
        f2Var.getMessagesController().P1().s(arrayList, zs0Var.l1);
        hc.a0(f2Var).Q(R.raw.ic_delete, 36, org.telegram.messenger.id.G(1, "StoriesDeleted", new Object[0])).j();
        zs0Var.V(false);
    }
}
