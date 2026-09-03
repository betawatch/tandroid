package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x90 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ea0 a;

    public x90(ea0 ea0Var) {
        this.a = ea0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        ea0 ea0Var = this.a;
        if (i10 == -1) {
            if (ea0Var.S.L(true)) {
                return;
            }
            ea0Var.finishFragment();
            return;
        }
        if (i10 != 2) {
            if (i10 == 10) {
                ba0 ba0Var = ea0Var.S;
                ba0Var.c1(ba0Var.getClosestTab(), false);
                return;
            } else {
                if (i10 == 11) {
                    ea0Var.S.L(true);
                    ea0Var.S.getSearchItem().z(false);
                    return;
                }
                return;
            }
        }
        if (ea0Var.F != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < ea0Var.F.size(); i11++) {
                TL_stories.StoryItem storyItem = ((MessageObject) ea0Var.F.valueAt(i11)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ea0Var.getParentActivity(), 0, ea0Var.getResourceProvider());
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
