package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t51 extends p10 {
    public final gg.g F;
    public final /* synthetic */ u51 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t51(u51 u51Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.G = u51Var;
        gg.g gVar = this.r;
        this.F = gVar;
        gVar.setImeOptions(268435459);
        gVar.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        gVar.addTextChangedListener(new ch.e(this, 15));
        gVar.setOnEditorActionListener(new c1(this, 10));
    }

    @Override // org.telegram.ui.Components.p10
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.G.E(motionEvent, this.F);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
