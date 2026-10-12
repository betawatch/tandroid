package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ol extends UndoView {
    public final /* synthetic */ fo f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(fo foVar, Activity activity, fo foVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, foVar2, true, c6Var);
        this.f0 = foVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        this.f0.X7(characterStyle, false, null, null);
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        mk mkVar = this.f0.X1;
        setAdditionalTranslationY((mkVar == null || !(((i11 = mkVar.U) == 1 || i11 == 3) && mkVar.T)) ? 0.0f : AndroidUtilities.dp(mkVar.getStyleHeight()));
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
