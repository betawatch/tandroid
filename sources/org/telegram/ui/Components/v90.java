package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class v90 extends org.telegram.ui.ActionBar.z0 {
    public final /* synthetic */ int V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v90(int i7, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, boolean z10) {
        super(i7, context, f6Var, z9, z10);
        this.V = i10;
    }

    @Override // org.telegram.ui.ActionBar.z0
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
