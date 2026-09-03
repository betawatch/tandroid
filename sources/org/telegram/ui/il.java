package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class il extends UndoView {
    public final /* synthetic */ zn c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(zn znVar, Activity activity, zn znVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, znVar2, true, f6Var);
        this.c0 = znVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        this.c0.U7(characterStyle, false, null, null);
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        fk fkVar = this.c0.U1;
        setAdditionalTranslationY((fkVar == null || !(((i11 = fkVar.Q) == 1 || i11 == 3) && fkVar.P)) ? 0.0f : AndroidUtilities.dp(fkVar.getStyleHeight()));
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
