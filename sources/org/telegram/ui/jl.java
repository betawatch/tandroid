package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
