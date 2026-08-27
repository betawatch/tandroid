package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kq0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final /* synthetic */ hu0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ kq0(hu0 hu0Var, TL_stories.StoryItem storyItem) {
        this.a = hu0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        hu0 hu0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.r1;
        n2Var.getMessagesController().getStoriesController().s(hu0Var.f1, arrayList);
        mc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        hu0Var.L(false);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.f1, str, new org.telegram.ui.df(24, this.a, this.b));
    }
}
