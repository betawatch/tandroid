package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class qb0 extends org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qb0(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(i10, context, d6Var, z10, z11);
        this.L = i11;
    }

    @Override // org.telegram.ui.ActionBar.e1
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
