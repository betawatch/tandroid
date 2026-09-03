package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class y90 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ fa0 a;

    public y90(fa0 fa0Var) {
        this.a = fa0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        fa0 fa0Var = this.a;
        if (i10 == -1) {
            if (fa0Var.S.L(true)) {
                return;
            }
            fa0Var.finishFragment();
            return;
        }
        if (i10 != 2) {
            if (i10 == 10) {
                ca0 ca0Var = fa0Var.S;
                ca0Var.c1(ca0Var.getClosestTab(), false);
                return;
            } else {
                if (i10 == 11) {
                    fa0Var.S.L(true);
                    fa0Var.S.getSearchItem().z(false);
                    return;
                }
                return;
            }
        }
        if (fa0Var.F != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < fa0Var.F.size(); i11++) {
                TL_stories.StoryItem storyItem = ((MessageObject) fa0Var.F.valueAt(i11)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fa0Var.getParentActivity(), 0, fa0Var.getResourceProvider());
            alertDialog$Builder.a.O = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
            alertDialog$Builder.a.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new o1(21, this, arrayList));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new k2(16));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.show();
            d2Var.h();
        }
    }
}
