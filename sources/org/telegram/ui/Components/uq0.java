package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uq0 implements org.telegram.ui.ActionBar.b2, MessagesStorage.StringCallback {
    public final /* synthetic */ qu0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ uq0(qu0 qu0Var, TL_stories.StoryItem storyItem) {
        this.a = qu0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        qu0 qu0Var = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.r1;
        o2Var.getMessagesController().getStoriesController().s(qu0Var.f1, arrayList);
        tc.a0(o2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        qu0Var.L(false);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.f1, str, new org.telegram.ui.tm(17, this.a, this.b));
    }
}
