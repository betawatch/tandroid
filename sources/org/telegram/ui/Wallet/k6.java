package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class k6 extends ug.f {
    public final /* synthetic */ l6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(l6 l6Var, Context context) {
        super(context);
        this.L = l6Var;
    }

    @Override // ug.f, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.L.x && super.onTouchEvent(motionEvent);
    }
}
