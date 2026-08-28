package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r51 extends m10 {
    public final fg.g F;
    public final /* synthetic */ s51 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r51(s51 s51Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.G = s51Var;
        fg.g gVar = this.r;
        this.F = gVar;
        gVar.setImeOptions(268435459);
        gVar.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        gVar.addTextChangedListener(new bh.f(this, 15));
        gVar.setOnEditorActionListener(new c1(this, 10));
    }

    @Override // org.telegram.ui.Components.m10
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.G.D(motionEvent, this.F);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
