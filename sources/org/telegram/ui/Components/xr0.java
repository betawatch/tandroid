package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class xr0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final /* synthetic */ tv0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ xr0(tv0 tv0Var, TL_stories.StoryItem storyItem) {
        this.a = tv0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        tv0 tv0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = tv0Var.v1;
        n2Var.getMessagesController().getStoriesController().s(tv0Var.j1, arrayList);
        xc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        tv0Var.L(false);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.j1, str, new qy(5, this.a, this.b));
    }
}
