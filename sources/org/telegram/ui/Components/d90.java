package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d90 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ k90 a;

    public d90(k90 k90Var) {
        this.a = k90Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        k90 k90Var = this.a;
        if (i9 == -1) {
            if (k90Var.R.L(true)) {
                return;
            }
            k90Var.finishFragment();
            return;
        }
        if (i9 != 2) {
            if (i9 == 10) {
                h90 h90Var = k90Var.R;
                h90Var.c1(h90Var.getClosestTab(), false);
                return;
            } else {
                if (i9 == 11) {
                    k90Var.R.L(true);
                    k90Var.R.getSearchItem().z(false);
                    return;
                }
                return;
            }
        }
        if (k90Var.E != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < k90Var.E.size(); i10++) {
                TL_stories.StoryItem storyItem = ((MessageObject) k90Var.E.valueAt(i10)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k90Var.getParentActivity(), 0, k90Var.getResourceProvider());
            alertDialog$Builder.a.N = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
            alertDialog$Builder.a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new g1(22, this, arrayList));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new g2(17));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.show();
            c2Var.h();
        }
    }
}
