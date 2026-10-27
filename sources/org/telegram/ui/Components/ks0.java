package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ks0 implements org.telegram.ui.ActionBar.b2, MessagesStorage.StringCallback {
    public final /* synthetic */ bw0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ ks0(bw0 bw0Var, TL_stories.StoryItem storyItem) {
        this.a = bw0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        bw0 bw0Var = this.a;
        org.telegram.ui.ActionBar.r2 r2Var = bw0Var.x1;
        r2Var.getMessagesController().getStoriesController().s(bw0Var.l1, arrayList);
        wc.b0(r2Var).R(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        bw0Var.S(false);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.l1, str, new oy(6, this.a, this.b));
    }
}
