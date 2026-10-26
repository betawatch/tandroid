package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class js0 implements org.telegram.ui.ActionBar.b2, MessagesStorage.StringCallback {
    public final /* synthetic */ aw0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ js0(aw0 aw0Var, TL_stories.StoryItem storyItem) {
        this.a = aw0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        aw0 aw0Var = this.a;
        org.telegram.ui.ActionBar.r2 r2Var = aw0Var.x1;
        r2Var.getMessagesController().getStoriesController().s(aw0Var.l1, arrayList);
        wc.b0(r2Var).R(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        aw0Var.S(false);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.l1, str, new oy(6, this.a, this.b));
    }
}
