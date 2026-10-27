package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fl extends UndoView {
    public final /* synthetic */ wn j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(wn wnVar, Activity activity, wn wnVar2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, wnVar2, true, u6Var);
        this.j0 = wnVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        this.j0.d8(characterStyle, false, null, null);
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        dk dkVar = this.j0.j2;
        setAdditionalTranslationY((dkVar == null || !(((i11 = dkVar.U) == 1 || i11 == 3) && dkVar.T)) ? 0.0f : AndroidUtilities.dp(dkVar.getStyleHeight()));
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
