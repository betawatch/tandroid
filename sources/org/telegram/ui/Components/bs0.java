package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs0 implements org.telegram.ui.ActionBar.z1, MessagesStorage.StringCallback {
    public final /* synthetic */ xv0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ bs0(xv0 xv0Var, TL_stories.StoryItem storyItem) {
        this.a = xv0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        xv0 xv0Var = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = xv0Var.v1;
        o2Var.getMessagesController().getStoriesController().s(xv0Var.j1, arrayList);
        xc.a0(o2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        xv0Var.M(false);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.j1, str, new qy(5, this.a, this.b));
    }
}
