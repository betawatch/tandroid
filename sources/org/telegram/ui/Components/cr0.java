package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cr0 implements org.telegram.ui.ActionBar.c2, MessagesStorage.StringCallback {
    public final /* synthetic */ yu0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ cr0(yu0 yu0Var, TL_stories.StoryItem storyItem) {
        this.a = yu0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        yu0 yu0Var = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.s1;
        p2Var.getMessagesController().getStoriesController().s(yu0Var.g1, arrayList);
        qc.a0(p2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        yu0Var.L(false);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.g1, str, new vk(9, this.a, this.b));
    }
}
