package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class or0 implements org.telegram.ui.ActionBar.z1, MessagesStorage.StringCallback {
    public final /* synthetic */ lv0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ or0(lv0 lv0Var, TL_stories.StoryItem storyItem) {
        this.a = lv0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        lv0 lv0Var = this.a;
        org.telegram.ui.ActionBar.m2 m2Var = lv0Var.v1;
        m2Var.getMessagesController().getStoriesController().s(lv0Var.j1, arrayList);
        xc.a0(m2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        lv0Var.L(false);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.j1, str, new org.telegram.ui.oc(29, this.a, this.b));
    }
}
