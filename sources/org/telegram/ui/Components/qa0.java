package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class qa0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ xa0 a;

    public qa0(xa0 xa0Var) {
        this.a = xa0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        xa0 xa0Var = this.a;
        if (i10 == -1) {
            if (xa0Var.V.M(true)) {
                return;
            }
            xa0Var.finishFragment();
            return;
        }
        if (i10 != 2) {
            if (i10 == 10) {
                ua0 ua0Var = xa0Var.V;
                ua0Var.f1(ua0Var.getClosestTab(), false);
                return;
            } else {
                if (i10 == 11) {
                    xa0Var.V.M(true);
                    xa0Var.V.getSearchItem().z(false);
                    return;
                }
                return;
            }
        }
        if (xa0Var.I != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < xa0Var.I.size(); i11++) {
                TL_stories.StoryItem storyItem = ((MessageObject) xa0Var.I.valueAt(i11)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xa0Var.getParentActivity(), 0, xa0Var.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
            alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new p2(19, this, arrayList));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new e2(23));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.show();
            c2Var.i();
        }
    }
}
