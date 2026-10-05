package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final /* synthetic */ qv0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ sr0(qv0 qv0Var, TL_stories.StoryItem storyItem) {
        this.a = qv0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        qv0 qv0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = qv0Var.v1;
        n2Var.getMessagesController().getStoriesController().s(qv0Var.j1, arrayList);
        yc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        qv0Var.L(false);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.j1, str, new org.telegram.ui.qc(29, this.a, this.b));
    }
}
