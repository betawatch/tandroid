package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ll extends UndoView {
    public final /* synthetic */ eo f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(eo eoVar, Activity activity, eo eoVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, eoVar2, true, f6Var);
        this.f0 = eoVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        this.f0.U7(characterStyle, false, null, null);
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        jk jkVar = this.f0.X1;
        setAdditionalTranslationY((jkVar == null || !(((i11 = jkVar.T) == 1 || i11 == 3) && jkVar.S)) ? 0.0f : AndroidUtilities.dp(jkVar.getStyleHeight()));
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
