package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class pa0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ wa0 a;

    public pa0(wa0 wa0Var) {
        this.a = wa0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        wa0 wa0Var = this.a;
        if (i10 == -1) {
            if (wa0Var.V.L(true)) {
                return;
            }
            wa0Var.finishFragment();
            return;
        }
        if (i10 != 2) {
            if (i10 == 10) {
                ta0 ta0Var = wa0Var.V;
                ta0Var.e1(ta0Var.getClosestTab(), false);
                return;
            } else {
                if (i10 == 11) {
                    wa0Var.V.L(true);
                    wa0Var.V.getSearchItem().z(false);
                    return;
                }
                return;
            }
        }
        if (wa0Var.I != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < wa0Var.I.size(); i11++) {
                TL_stories.StoryItem storyItem = ((MessageObject) wa0Var.I.valueAt(i11)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wa0Var.getParentActivity(), 0, wa0Var.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
            alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new q2(18, this, arrayList));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new k2(17));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.show();
            b2Var.h();
        }
    }
}
