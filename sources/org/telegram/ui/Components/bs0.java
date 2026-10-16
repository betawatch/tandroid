package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs0 implements org.telegram.ui.ActionBar.z1, MessagesStorage.StringCallback {
    public final /* synthetic */ xv0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ bs0(xv0 xv0Var, TL_stories.StoryItem storyItem) {
        this.a = xv0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        xv0 xv0Var = this.a;
        org.telegram.ui.ActionBar.m2 m2Var = xv0Var.v1;
        m2Var.getMessagesController().getStoriesController().s(xv0Var.j1, arrayList);
        zc.a0(m2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        xv0Var.L(false);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.j1, str, new org.telegram.ui.uc(29, this.a, this.b));
    }
}
