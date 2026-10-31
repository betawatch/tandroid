package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class na0 extends org.telegram.ui.ActionBar.b1 {
    public final /* synthetic */ int V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ na0(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(i10, context, p6Var, z10, z11);
        this.V = i11;
    }

    @Override // org.telegram.ui.ActionBar.b1
    public final void l() {
        switch (this.V) {
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
        switch (this.V) {
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
