package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zq0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final /* synthetic */ yu0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ zq0(yu0 yu0Var, TL_stories.StoryItem storyItem) {
        this.a = yu0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        yu0 yu0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = yu0Var.v1;
        n2Var.getMessagesController().getStoriesController().s(yu0Var.j1, arrayList);
        vc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        yu0Var.L(false);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.j1, str, new org.telegram.ui.nf(22, this.a, this.b));
    }
}
