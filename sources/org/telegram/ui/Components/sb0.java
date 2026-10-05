package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class sb0 extends org.telegram.ui.ActionBar.f1 {
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb0(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(i10, context, d6Var, z10, z11);
        this.L = i11;
    }

    @Override // org.telegram.ui.ActionBar.f1
    public final void i() {
        switch (this.L) {
            case 0:
                setBackground(null);
                break;
            default:
                setBackground(null);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 0:
                if (getVisibility() == 0 && getAlpha() >= 0.5f) {
                    break;
                }
                break;
            default:
                if (getVisibility() == 0 && getAlpha() >= 0.5f) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
