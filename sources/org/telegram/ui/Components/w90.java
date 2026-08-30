package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class w90 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ da0 a;

    public w90(da0 da0Var) {
        this.a = da0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        da0 da0Var = this.a;
        if (i10 == -1) {
            if (da0Var.S.L(true)) {
                return;
            }
            da0Var.finishFragment();
            return;
        }
        if (i10 != 2) {
            if (i10 == 10) {
                aa0 aa0Var = da0Var.S;
                aa0Var.c1(aa0Var.getClosestTab(), false);
                return;
            } else {
                if (i10 == 11) {
                    da0Var.S.L(true);
                    da0Var.S.getSearchItem().z(false);
                    return;
                }
                return;
            }
        }
        if (da0Var.F != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < da0Var.F.size(); i11++) {
                TL_stories.StoryItem storyItem = ((MessageObject) da0Var.F.valueAt(i11)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(da0Var.getParentActivity(), 0, da0Var.getResourceProvider());
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
