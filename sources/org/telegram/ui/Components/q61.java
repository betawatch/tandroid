package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class q61 extends d20 {
    public final lg.f G;
    public final /* synthetic */ r61 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q61(r61 r61Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.H = r61Var;
        lg.f fVar = this.r;
        this.G = fVar;
        fVar.setImeOptions(268435459);
        fVar.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        fVar.addTextChangedListener(new eh.c(this, 14));
        fVar.setOnEditorActionListener(new d1(this, 10));
    }

    @Override // org.telegram.ui.Components.d20
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.H.D(motionEvent, this.G);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
