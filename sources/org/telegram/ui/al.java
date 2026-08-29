package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class al extends UndoView {
    public final /* synthetic */ tn b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(tn tnVar, Activity activity, tn tnVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, tnVar2, true, c6Var);
        this.b0 = tnVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        this.b0.U7(characterStyle, false, null, null);
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        yj yjVar = this.b0.T1;
        setAdditionalTranslationY((yjVar == null || !(((i11 = yjVar.P) == 1 || i11 == 3) && yjVar.O)) ? 0.0f : AndroidUtilities.dp(yjVar.getStyleHeight()));
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
