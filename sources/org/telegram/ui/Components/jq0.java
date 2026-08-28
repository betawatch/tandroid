package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jq0 implements org.telegram.ui.ActionBar.b2, MessagesStorage.StringCallback {
    public final /* synthetic */ eu0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ jq0(eu0 eu0Var, TL_stories.StoryItem storyItem) {
        this.a = eu0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        eu0 eu0Var = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
        o2Var.getMessagesController().getStoriesController().s(eu0Var.f1, arrayList);
        oc.a0(o2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        eu0Var.L(false);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.f1, str, new org.telegram.ui.df(24, this.a, this.b));
    }
}
