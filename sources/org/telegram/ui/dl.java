package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class dl extends UndoView {
    public final /* synthetic */ sn f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(sn snVar, Activity activity, sn snVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, snVar2, true, d6Var);
        this.f0 = snVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        this.f0.X7(characterStyle, false, null, null);
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        bk bkVar = this.f0.X1;
        setAdditionalTranslationY((bkVar == null || !(((i11 = bkVar.U) == 1 || i11 == 3) && bkVar.T)) ? 0.0f : AndroidUtilities.dp(bkVar.getStyleHeight()));
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
