package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kq0 implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.gs {
    public final /* synthetic */ au0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ kq0(au0 au0Var, TL_stories.StoryItem storyItem) {
        this.a = au0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.messenger.gs
    public void a(String str) {
        r0.getStoriesController().r(r0.l1, str, new vg(13, this.a, this.b));
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        au0 au0Var = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = au0Var.x1;
        k2Var.getMessagesController().O1().s(arrayList, au0Var.l1);
        cc.a0(k2Var).Q(R.raw.ic_delete, 36, org.telegram.messenger.dd.G(1, "StoriesDeleted", new Object[0])).j();
        au0Var.U(false);
    }
}
