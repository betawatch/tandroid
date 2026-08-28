package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class na0 extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ na0(int i9, int i10, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11) {
        super(i9, context, b6Var, z10, z11);
        this.H = i10;
    }

    @Override // org.telegram.ui.ActionBar.g1
    public final void i() {
        switch (this.H) {
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
        switch (this.H) {
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
