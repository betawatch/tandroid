package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ga0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ na0 a;

    public ga0(na0 na0Var) {
        this.a = na0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        na0 na0Var = this.a;
        if (i10 == -1) {
            if (na0Var.V.L(true)) {
                return;
            }
            na0Var.finishFragment();
            return;
        }
        if (i10 != 2) {
            if (i10 == 10) {
                ka0 ka0Var = na0Var.V;
                ka0Var.c1(ka0Var.getClosestTab(), false);
                return;
            } else {
                if (i10 == 11) {
                    na0Var.V.L(true);
                    na0Var.V.getSearchItem().z(false);
                    return;
                }
                return;
            }
        }
        if (na0Var.I != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < na0Var.I.size(); i11++) {
                TL_stories.StoryItem storyItem = ((MessageObject) na0Var.I.valueAt(i11)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(na0Var.getParentActivity(), 0, na0Var.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
            alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new w2(14, this, arrayList));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fa0(0));
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
            a2Var.show();
            a2Var.h();
        }
    }
}
