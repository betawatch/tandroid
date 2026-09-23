package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class gl extends UndoView {
    public final /* synthetic */ xn f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(xn xnVar, Activity activity, xn xnVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, xnVar2, true, d6Var);
        this.f0 = xnVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        this.f0.U7(characterStyle, false, null, null);
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        ek ekVar = this.f0.X1;
        setAdditionalTranslationY((ekVar == null || !(((i11 = ekVar.T) == 1 || i11 == 3) && ekVar.S)) ? 0.0f : AndroidUtilities.dp(ekVar.getStyleHeight()));
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
