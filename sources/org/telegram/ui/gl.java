package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class gl extends UndoView {
    public final /* synthetic */ xn c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(xn xnVar, Activity activity, xn xnVar2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, xnVar2, true, g6Var);
        this.c0 = xnVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        this.c0.U7(characterStyle, false, null, null);
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        dk dkVar = this.c0.U1;
        setAdditionalTranslationY((dkVar == null || !(((i11 = dkVar.Q) == 1 || i11 == 3) && dkVar.P)) ? 0.0f : AndroidUtilities.dp(dkVar.getStyleHeight()));
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
