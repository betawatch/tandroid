package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class fa0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ma0 a;

    public fa0(ma0 ma0Var) {
        this.a = ma0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        ma0 ma0Var = this.a;
        if (i10 == -1) {
            if (ma0Var.V.L(true)) {
                return;
            }
            ma0Var.finishFragment();
            return;
        }
        if (i10 != 2) {
            if (i10 == 10) {
                ja0 ja0Var = ma0Var.V;
                ja0Var.c1(ja0Var.getClosestTab(), false);
                return;
            } else {
                if (i10 == 11) {
                    ma0Var.V.L(true);
                    ma0Var.V.getSearchItem().z(false);
                    return;
                }
                return;
            }
        }
        if (ma0Var.I != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < ma0Var.I.size(); i11++) {
                TL_stories.StoryItem storyItem = ((MessageObject) ma0Var.I.valueAt(i11)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ma0Var.getParentActivity(), 0, ma0Var.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
            alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a3(13, this, arrayList));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new i2(19));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.show();
            b2Var.h();
        }
    }
}
