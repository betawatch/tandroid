package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class il extends UndoView {
    public final /* synthetic */ int j0 = 0;
    public final /* synthetic */ Object k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(y20 y20Var, Context context) {
        super(context);
        this.k0 = y20Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public void b(CharacterStyle characterStyle) {
        switch (this.j0) {
            case 0:
                ((un) this.k0).c8(characterStyle, false, null, null);
                break;
        }
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public void invalidate() {
        switch (this.j0) {
            case 1:
                super.invalidate();
                ((y20) this.k0).invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i11;
        switch (this.j0) {
            case 0:
                gk gkVar = ((un) this.k0).l2;
                setAdditionalTranslationY((gkVar == null || !(((i11 = gkVar.U) == 1 || i11 == 3) && gkVar.T)) ? 0.0f : org.telegram.messenger.i0.L(gkVar.getStyleHeight()));
                super.k(j10, i10, obj, obj2, runnable, runnable2);
                break;
            default:
                super.k(j10, i10, obj, obj2, runnable, runnable2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(un unVar, Activity activity, un unVar2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity, unVar2, true, p6Var);
        this.k0 = unVar;
    }
}
