package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class p61 extends c20 {
    public final kg.f G;
    public final /* synthetic */ q61 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p61(q61 q61Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.H = q61Var;
        kg.f fVar = this.r;
        this.G = fVar;
        fVar.setImeOptions(268435459);
        fVar.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        fVar.addTextChangedListener(new dh.c(this, 14));
        fVar.setOnEditorActionListener(new d1(this, 10));
    }

    @Override // org.telegram.ui.Components.c20
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.H.D(motionEvent, this.G);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
