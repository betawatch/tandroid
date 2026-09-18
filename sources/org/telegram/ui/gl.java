package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class gl extends UndoView {
    public final /* synthetic */ zn f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(zn znVar, Activity activity, zn znVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, znVar2, true, e6Var);
        this.f0 = znVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        this.f0.U7(characterStyle, false, null, null);
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        gk gkVar = this.f0.X1;
        setAdditionalTranslationY((gkVar == null || !(((i11 = gkVar.T) == 1 || i11 == 3) && gkVar.S)) ? 0.0f : AndroidUtilities.dp(gkVar.getStyleHeight()));
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
