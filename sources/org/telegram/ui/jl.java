package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class jl extends UndoView {
    public final /* synthetic */ co f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(co coVar, Activity activity, co coVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, coVar2, true, f6Var);
        this.f0 = coVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        this.f0.U7(characterStyle, false, null, null);
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        hk hkVar = this.f0.X1;
        setAdditionalTranslationY((hkVar == null || !(((i11 = hkVar.T) == 1 || i11 == 3) && hkVar.S)) ? 0.0f : AndroidUtilities.dp(hkVar.getStyleHeight()));
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
