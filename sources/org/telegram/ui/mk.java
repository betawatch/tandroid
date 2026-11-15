package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class mk extends UndoView {
    public final /* synthetic */ int k0 = 0;
    public final /* synthetic */ Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(y10 y10Var, Context context) {
        super(context);
        this.l0 = y10Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public void b(CharacterStyle characterStyle) {
        switch (this.k0) {
            case 0:
                ((an) this.l0).l8(characterStyle, false, null, null);
                break;
        }
    }

    @Override // org.telegram.ui.Components.UndoView, android.view.View
    public void invalidate() {
        switch (this.k0) {
            case 1:
                super.invalidate();
                ((y10) this.l0).invalidate();
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
                lj ljVar = ((an) this.l0).m2;
                setAdditionalTranslationY((ljVar == null || !(((i10 = ljVar.V) == 1 || i10 == 3) && ljVar.U)) ? 0.0f : org.telegram.messenger.g0.L(ljVar.getStyleHeight()));
                super.k(j3, i7, obj, obj2, runnable, runnable2);
                break;
            default:
                super.k(j3, i7, obj, obj2, runnable, runnable2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(an anVar, Activity activity, an anVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, anVar2, true, e6Var);
        this.l0 = anVar;
    }
}
