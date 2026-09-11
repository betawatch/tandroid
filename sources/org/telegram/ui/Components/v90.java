package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class v90 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ca0 a;

    public v90(ca0 ca0Var) {
        this.a = ca0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        ca0 ca0Var = this.a;
        if (i10 == -1) {
            if (ca0Var.V.L(true)) {
                return;
            }
            ca0Var.finishFragment();
            return;
        }
        if (i10 != 2) {
            if (i10 == 10) {
                z90 z90Var = ca0Var.V;
                z90Var.c1(z90Var.getClosestTab(), false);
                return;
            } else {
                if (i10 == 11) {
                    ca0Var.V.L(true);
                    ca0Var.V.getSearchItem().z(false);
                    return;
                }
                return;
            }
        }
        if (ca0Var.I != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < ca0Var.I.size(); i11++) {
                TL_stories.StoryItem storyItem = ((MessageObject) ca0Var.I.valueAt(i11)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ca0Var.getParentActivity(), 0, ca0Var.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
            alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b3(13, this, arrayList));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new p2(12));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.show();
            b2Var.h();
        }
    }
}
