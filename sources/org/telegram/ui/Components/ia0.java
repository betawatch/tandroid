package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ia0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ pa0 a;

    public ia0(pa0 pa0Var) {
        this.a = pa0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        pa0 pa0Var = this.a;
        if (i10 == -1) {
            if (pa0Var.V.L(true)) {
                return;
            }
            pa0Var.finishFragment();
            return;
        }
        if (i10 != 2) {
            if (i10 == 10) {
                ma0 ma0Var = pa0Var.V;
                ma0Var.c1(ma0Var.getClosestTab(), false);
                return;
            } else {
                if (i10 == 11) {
                    pa0Var.V.L(true);
                    pa0Var.V.getSearchItem().z(false);
                    return;
                }
                return;
            }
        }
        if (pa0Var.I != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < pa0Var.I.size(); i11++) {
                TL_stories.StoryItem storyItem = ((MessageObject) pa0Var.I.valueAt(i11)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pa0Var.getParentActivity(), 0, pa0Var.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
            alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new w2(15, this, arrayList));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ru(2));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.show();
            b2Var.h();
        }
    }
}
