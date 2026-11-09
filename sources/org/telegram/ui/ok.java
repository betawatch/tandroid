package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ok extends UndoView {
    public final /* synthetic */ int j0 = 1;
    public final /* synthetic */ Object k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(b20 b20Var, Context context) {
        super(context);
        this.k0 = b20Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public void b(CharacterStyle characterStyle) {
        switch (this.j0) {
            case 0:
                ((cn) this.k0).k8(characterStyle, false, null, null);
                break;
        }
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public void invalidate() {
        switch (this.j0) {
            case 1:
                super.invalidate();
                ((b20) this.k0).invalidate();
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
                nj njVar = ((cn) this.k0).l2;
                setAdditionalTranslationY((njVar == null || !(((i10 = njVar.U) == 1 || i10 == 3) && njVar.T)) ? 0.0f : org.telegram.messenger.g0.L(njVar.getStyleHeight()));
                super.k(j3, i7, obj, obj2, runnable, runnable2);
                break;
            default:
                super.k(j3, i7, obj, obj2, runnable, runnable2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(cn cnVar, Activity activity, cn cnVar2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, cnVar2, true, g6Var);
        this.k0 = cnVar;
    }
}
