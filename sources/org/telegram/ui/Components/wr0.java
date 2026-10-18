package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final /* synthetic */ sv0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ wr0(sv0 sv0Var, TL_stories.StoryItem storyItem) {
        this.a = sv0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        sv0 sv0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = sv0Var.v1;
        n2Var.getMessagesController().getStoriesController().s(sv0Var.j1, arrayList);
        xc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        sv0Var.L(false);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.j1, str, new qy(5, this.a, this.b));
    }
}
