package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e61 extends x10 {
    public final ig.f F;
    public final /* synthetic */ f61 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e61(f61 f61Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.G = f61Var;
        ig.f fVar = this.r;
        this.F = fVar;
        fVar.setImeOptions(268435459);
        fVar.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        fVar.addTextChangedListener(new bh.c(this, 15));
        fVar.setOnEditorActionListener(new f1(this, 10));
    }

    @Override // org.telegram.ui.Components.x10
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.G.D(motionEvent, this.F);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
