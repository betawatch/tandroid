package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class u90 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ba0 a;

    public u90(ba0 ba0Var) {
        this.a = ba0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        ba0 ba0Var = this.a;
        if (i10 == -1) {
            if (ba0Var.V.L(true)) {
                return;
            }
            ba0Var.finishFragment();
            return;
        }
        if (i10 != 2) {
            if (i10 == 10) {
                y90 y90Var = ba0Var.V;
                y90Var.c1(y90Var.getClosestTab(), false);
                return;
            } else {
                if (i10 == 11) {
                    ba0Var.V.L(true);
                    ba0Var.V.getSearchItem().z(false);
                    return;
                }
                return;
            }
        }
        if (ba0Var.I != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < ba0Var.I.size(); i11++) {
                TL_stories.StoryItem storyItem = ((MessageObject) ba0Var.I.valueAt(i11)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ba0Var.getParentActivity(), 0, ba0Var.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
            alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mf(12, this, arrayList));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new l2(15));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.show();
            c2Var.h();
        }
    }
}
