package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mr0 implements org.telegram.ui.ActionBar.z1, MessagesStorage.StringCallback {
    public final /* synthetic */ jv0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ mr0(jv0 jv0Var, TL_stories.StoryItem storyItem) {
        this.a = jv0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        jv0 jv0Var = this.a;
        org.telegram.ui.ActionBar.m2 m2Var = jv0Var.v1;
        m2Var.getMessagesController().getStoriesController().s(jv0Var.j1, arrayList);
        xc.a0(m2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        jv0Var.L(false);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.j1, str, new org.telegram.ui.oc(29, this.a, this.b));
    }
}
