package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class cl extends UndoView {
    public final /* synthetic */ sn j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(sn snVar, Activity activity, sn snVar2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, snVar2, true, g6Var);
        this.j0 = snVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        this.j0.X7(characterStyle, false, null, null);
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        ak akVar = this.j0.j2;
        setAdditionalTranslationY((akVar == null || !(((i11 = akVar.U) == 1 || i11 == 3) && akVar.T)) ? 0.0f : AndroidUtilities.dp(akVar.getStyleHeight()));
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
