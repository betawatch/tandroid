package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class mk extends UndoView {
    public final /* synthetic */ int j0 = 0;
    public final /* synthetic */ Object k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(z10 z10Var, Context context) {
        super(context);
        this.k0 = z10Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public void b(CharacterStyle characterStyle) {
        switch (this.j0) {
            case 0:
                ((an) this.k0).j8(characterStyle, false, null, null);
                break;
        }
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public void invalidate() {
        switch (this.j0) {
            case 1:
                super.invalidate();
                ((z10) this.k0).invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public void k(long j3, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i10;
        switch (this.j0) {
            case 0:
                lj ljVar = ((an) this.k0).l2;
                setAdditionalTranslationY((ljVar == null || !(((i10 = ljVar.U) == 1 || i10 == 3) && ljVar.T)) ? 0.0f : org.telegram.messenger.g0.L(ljVar.getStyleHeight()));
                super.k(j3, i7, obj, obj2, runnable, runnable2);
                break;
            default:
                super.k(j3, i7, obj, obj2, runnable, runnable2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(an anVar, Activity activity, an anVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, anVar2, true, f6Var);
        this.k0 = anVar;
    }
}
