package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class fl extends UndoView {
    public final /* synthetic */ yn f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(yn ynVar, Activity activity, yn ynVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, ynVar2, true, d6Var);
        this.f0 = ynVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        this.f0.U7(characterStyle, false, null, null);
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j3, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        ek ekVar = this.f0.V1;
        setAdditionalTranslationY((ekVar == null || !(((i11 = ekVar.T) == 1 || i11 == 3) && ekVar.S)) ? 0.0f : AndroidUtilities.dp(ekVar.getStyleHeight()));
        super.k(j3, i10, obj, obj2, runnable, runnable2);
    }
}
