package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class kl extends UndoView {
    public final /* synthetic */ zn f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl(zn znVar, Activity activity, zn znVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, znVar2, true, e6Var);
        this.f0 = znVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        this.f0.X7(characterStyle, false, null, null);
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        ik ikVar = this.f0.X1;
        setAdditionalTranslationY((ikVar == null || !(((i11 = ikVar.U) == 1 || i11 == 3) && ikVar.T)) ? 0.0f : AndroidUtilities.dp(ikVar.getStyleHeight()));
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
