package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class hl extends UndoView {
    public final /* synthetic */ zn f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(zn znVar, Activity activity, zn znVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, znVar2, true, f6Var);
        this.f0 = znVar;
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
