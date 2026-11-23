package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class nk extends UndoView {
    public final /* synthetic */ int k0 = 1;
    public final /* synthetic */ Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(b20 b20Var, Context context) {
        super(context);
        this.l0 = b20Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public void b(CharacterStyle characterStyle) {
        switch (this.k0) {
            case 0:
                ((bn) this.l0).l8(characterStyle, false, null, null);
                break;
        }
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public void invalidate() {
        switch (this.k0) {
            case 1:
                super.invalidate();
                ((b20) this.l0).invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public void k(long j3, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        int i10;
        switch (this.k0) {
            case 0:
                mj mjVar = ((bn) this.l0).m2;
                setAdditionalTranslationY((mjVar == null || !(((i10 = mjVar.V) == 1 || i10 == 3) && mjVar.U)) ? 0.0f : org.telegram.messenger.g0.L(mjVar.getStyleHeight()));
                super.k(j3, i7, obj, obj2, runnable, runnable2);
                break;
            default:
                super.k(j3, i7, obj, obj2, runnable, runnable2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(bn bnVar, Activity activity, bn bnVar2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, bnVar2, true, h6Var);
        this.l0 = bnVar;
    }
}
