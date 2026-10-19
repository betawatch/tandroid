package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class bl extends UndoView {
    public final /* synthetic */ qn f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(qn qnVar, Activity activity, qn qnVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, qnVar2, true, d6Var);
        this.f0 = qnVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        this.f0.X7(characterStyle, false, null, null);
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        zj zjVar = this.f0.X1;
        setAdditionalTranslationY((zjVar == null || !(((i11 = zjVar.U) == 1 || i11 == 3) && zjVar.T)) ? 0.0f : AndroidUtilities.dp(zjVar.getStyleHeight()));
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
