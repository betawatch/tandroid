package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ca0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ja0 a;

    public ca0(ja0 ja0Var) {
        this.a = ja0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        ja0 ja0Var = this.a;
        if (i10 == -1) {
            if (ja0Var.V.L(true)) {
                return;
            }
            ja0Var.finishFragment();
            return;
        }
        if (i10 != 2) {
            if (i10 == 10) {
                ga0 ga0Var = ja0Var.V;
                ga0Var.c1(ga0Var.getClosestTab(), false);
                return;
            } else {
                if (i10 == 11) {
                    ja0Var.V.L(true);
                    ja0Var.V.getSearchItem().z(false);
                    return;
                }
                return;
            }
        }
        if (ja0Var.I != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < ja0Var.I.size(); i11++) {
                TL_stories.StoryItem storyItem = ((MessageObject) ja0Var.I.valueAt(i11)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ja0Var.getParentActivity(), 0, ja0Var.getResourceProvider());
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
