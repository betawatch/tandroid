package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dr0 implements org.telegram.ui.ActionBar.c2, MessagesStorage.StringCallback {
    public final /* synthetic */ zu0 a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ dr0(zu0 zu0Var, TL_stories.StoryItem storyItem) {
        this.a = zu0Var;
        this.b = storyItem;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        zu0 zu0Var = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = zu0Var.s1;
        p2Var.getMessagesController().getStoriesController().s(zu0Var.g1, arrayList);
        qc.a0(p2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        zu0Var.L(false);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        r0.getStoriesController().r(r0.g1, str, new xk(9, this.a, this.b));
    }
}
