package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class da0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ka0 a;

    public da0(ka0 ka0Var) {
        this.a = ka0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        ka0 ka0Var = this.a;
        if (i10 == -1) {
            if (ka0Var.V.L(true)) {
                return;
            }
            ka0Var.finishFragment();
            return;
        }
        if (i10 != 2) {
            if (i10 == 10) {
                ha0 ha0Var = ka0Var.V;
                ha0Var.c1(ha0Var.getClosestTab(), false);
                return;
            } else {
                if (i10 == 11) {
                    ka0Var.V.L(true);
                    ka0Var.V.getSearchItem().z(false);
                    return;
                }
                return;
            }
        }
        if (ka0Var.I != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < ka0Var.I.size(); i11++) {
                TL_stories.StoryItem storyItem = ((MessageObject) ka0Var.I.valueAt(i11)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ka0Var.getParentActivity(), 0, ka0Var.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
            alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b3(13, this, arrayList));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new j2(17));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.show();
            b2Var.h();
        }
    }
}
