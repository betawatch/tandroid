package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ik extends UndoView {
    public final /* synthetic */ int k0 = 1;
    public final /* synthetic */ Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(u10 u10Var, Context context) {
        super(context);
        this.l0 = u10Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public void b(CharacterStyle characterStyle) {
        switch (this.k0) {
            case 0:
                ((wm) this.l0).j8(characterStyle, false, null, null);
                break;
        }
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public void invalidate() {
        switch (this.k0) {
            case 1:
                super.invalidate();
                ((u10) this.l0).invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public void k(long j10, int i3, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i10;
        switch (this.k0) {
            case 0:
                hj hjVar = ((wm) this.l0).m2;
                setAdditionalTranslationY((hjVar == null || !(((i10 = hjVar.V) == 1 || i10 == 3) && hjVar.U)) ? 0.0f : org.telegram.messenger.g0.L(hjVar.getStyleHeight()));
                super.k(j10, i3, obj, obj2, runnable, runnable2);
                break;
            default:
                super.k(j10, i3, obj, obj2, runnable, runnable2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(wm wmVar, Activity activity, wm wmVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, wmVar2, true, e6Var);
        this.l0 = wmVar;
    }
}
