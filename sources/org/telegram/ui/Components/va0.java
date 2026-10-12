package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class va0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ cb0 a;

    public va0(cb0 cb0Var) {
        this.a = cb0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        cb0 cb0Var = this.a;
        if (i10 == -1) {
            if (cb0Var.V.L(true)) {
                return;
            }
            cb0Var.finishFragment();
            return;
        }
        if (i10 != 2) {
            if (i10 == 10) {
                za0 za0Var = cb0Var.V;
                za0Var.c1(za0Var.getClosestTab(), false);
                return;
            } else {
                if (i10 == 11) {
                    cb0Var.V.L(true);
                    cb0Var.V.getSearchItem().z(false);
                    return;
                }
                return;
            }
        }
        if (cb0Var.I != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < cb0Var.I.size(); i11++) {
                TL_stories.StoryItem storyItem = ((MessageObject) cb0Var.I.valueAt(i11)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cb0Var.getParentActivity(), 0, cb0Var.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
            alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new t2(17, this, arrayList));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new l2(17));
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
            a2Var.show();
            a2Var.h();
        }
    }
}
