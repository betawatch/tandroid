package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ar0 implements org.telegram.ui.ActionBar.b2, MessagesStorage.StringCallback {
    public final /* synthetic */ zu0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ ar0(zu0 zu0Var, TL_stories.StoryItem storyItem) {
        this.a = zu0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        zu0 zu0Var = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.v1;
        o2Var.getMessagesController().getStoriesController().s(zu0Var.j1, arrayList);
        vc.a0(o2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        zu0Var.L(false);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.j1, str, new org.telegram.ui.pf(22, this.a, this.b));
    }
}
