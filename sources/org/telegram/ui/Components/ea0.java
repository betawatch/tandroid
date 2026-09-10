package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ea0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ la0 a;

    public ea0(la0 la0Var) {
        this.a = la0Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        la0 la0Var = this.a;
        if (i10 == -1) {
            if (la0Var.V.L(true)) {
                return;
            }
            la0Var.finishFragment();
            return;
        }
        if (i10 != 2) {
            if (i10 == 10) {
                ia0 ia0Var = la0Var.V;
                ia0Var.c1(ia0Var.getClosestTab(), false);
                return;
            } else {
                if (i10 == 11) {
                    la0Var.V.L(true);
                    la0Var.V.getSearchItem().z(false);
                    return;
                }
                return;
            }
        }
        if (la0Var.I != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < la0Var.I.size(); i11++) {
                TL_stories.StoryItem storyItem = ((MessageObject) la0Var.I.valueAt(i11)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(la0Var.getParentActivity(), 0, la0Var.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
            alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new km(8, this, arrayList));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new q2(13));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.show();
            d2Var.h();
        }
    }
}
