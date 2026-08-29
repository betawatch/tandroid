package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g6 extends org.telegram.ui.Components.ic0 {
    public final /* synthetic */ x6 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(x6 x6Var, Context context) {
        super(context);
        this.z0 = x6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        super.dispatchDraw(canvas);
        boolean Z = Z();
        x6 x6Var = this.z0;
        if (Z) {
            float f9 = x6Var.f0;
            if (f9 != 0.0f) {
                x6Var.f0 = f9 - 0.16f;
                invalidate();
                x6Var.f0 = Utilities.clamp(x6Var.f0, 1.0f, 0.0f);
                b5Var = ((org.telegram.ui.ActionBar.o2) x6Var).parentLayout;
                if (b5Var == null) {
                    b5Var2 = ((org.telegram.ui.ActionBar.o2) x6Var).parentLayout;
                    ActionBarLayout actionBarLayout = (ActionBarLayout) b5Var2;
                    actionBarLayout.p(canvas, (int) (x6Var.d0 * 255.0f * x6Var.f0), org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
                    return;
                }
                return;
            }
        }
        if (!Z) {
            float f10 = x6Var.f0;
            if (f10 != 1.0f) {
                x6Var.f0 = f10 + 0.16f;
                invalidate();
            }
        }
        x6Var.f0 = Utilities.clamp(x6Var.f0, 1.0f, 0.0f);
        b5Var = ((org.telegram.ui.ActionBar.o2) x6Var).parentLayout;
        if (b5Var == null) {
        }
    }
}
