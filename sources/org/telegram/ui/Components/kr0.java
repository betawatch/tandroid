package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr0 implements org.telegram.ui.ActionBar.c2, MessagesStorage.StringCallback {
    public final /* synthetic */ iv0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ kr0(iv0 iv0Var, TL_stories.StoryItem storyItem) {
        this.a = iv0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        iv0 iv0Var = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.v1;
        p2Var.getMessagesController().getStoriesController().s(iv0Var.j1, arrayList);
        wc.a0(p2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        iv0Var.L(false);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.j1, str, new org.telegram.ui.pf(22, this.a, this.b));
    }
}
