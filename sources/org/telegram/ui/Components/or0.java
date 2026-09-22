package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class or0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final /* synthetic */ lv0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ or0(lv0 lv0Var, TL_stories.StoryItem storyItem) {
        this.a = lv0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        lv0 lv0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = lv0Var.v1;
        n2Var.getMessagesController().getStoriesController().s(lv0Var.j1, arrayList);
        xc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        lv0Var.L(false);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.j1, str, new org.telegram.ui.of(22, this.a, this.b));
    }
}
