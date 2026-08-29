package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r90 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ y90 a;

    public r90(y90 y90Var) {
        this.a = y90Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        y90 y90Var = this.a;
        if (i10 == -1) {
            if (y90Var.R.L(true)) {
                return;
            }
            y90Var.finishFragment();
            return;
        }
        if (i10 != 2) {
            if (i10 == 10) {
                v90 v90Var = y90Var.R;
                v90Var.c1(v90Var.getClosestTab(), false);
                return;
            } else {
                if (i10 == 11) {
                    y90Var.R.L(true);
                    y90Var.R.getSearchItem().z(false);
                    return;
                }
                return;
            }
        }
        if (y90Var.E != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < y90Var.E.size(); i11++) {
                TL_stories.StoryItem storyItem = ((MessageObject) y90Var.E.valueAt(i11)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y90Var.getParentActivity(), 0, y90Var.getResourceProvider());
            alertDialog$Builder.a.N = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
            alertDialog$Builder.a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j1(22, this, arrayList));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new r2(11));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.show();
            c2Var.h();
        }
    }
}
