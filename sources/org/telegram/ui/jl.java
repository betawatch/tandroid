package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class jl extends UndoView {
    public final /* synthetic */ bo f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(bo boVar, Activity activity, bo boVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, boVar2, true, f6Var);
        this.f0 = boVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        this.f0.U7(characterStyle, false, null, null);
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        ik ikVar = this.f0.X1;
        setAdditionalTranslationY((ikVar == null || !(((i11 = ikVar.T) == 1 || i11 == 3) && ikVar.S)) ? 0.0f : AndroidUtilities.dp(ikVar.getStyleHeight()));
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
