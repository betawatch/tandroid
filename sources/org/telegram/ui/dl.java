package org.telegram.ui;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class dl extends UndoView {
    public final /* synthetic */ un j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(un unVar, Activity activity, un unVar2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, unVar2, true, u6Var);
        this.j0 = unVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void b(CharacterStyle characterStyle) {
        this.j0.b8(characterStyle, false, null, null);
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        bk bkVar = this.j0.j2;
        setAdditionalTranslationY((bkVar == null || !(((i11 = bkVar.U) == 1 || i11 == 3) && bkVar.T)) ? 0.0f : AndroidUtilities.dp(bkVar.getStyleHeight()));
        super.k(j10, i10, obj, obj2, runnable, runnable2);
    }
}
