package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wa0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ db0 a;

    public wa0(db0 db0Var) {
        this.a = db0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        db0 db0Var = this.a;
        if (i10 == -1) {
            if (db0Var.V.L(true)) {
                return;
            }
            db0Var.finishFragment();
            return;
        }
        if (i10 != 2) {
            if (i10 == 10) {
                ab0 ab0Var = db0Var.V;
                ab0Var.c1(ab0Var.getClosestTab(), false);
                return;
            } else {
                if (i10 == 11) {
                    db0Var.V.L(true);
                    db0Var.V.getSearchItem().z(false);
                    return;
                }
                return;
            }
        }
        if (db0Var.I != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < db0Var.I.size(); i11++) {
                TL_stories.StoryItem storyItem = ((MessageObject) db0Var.I.valueAt(i11)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(db0Var.getParentActivity(), 0, db0Var.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
            alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new y2(14, this, arrayList));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new f2(22));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.show();
            b2Var.h();
        }
    }
}
