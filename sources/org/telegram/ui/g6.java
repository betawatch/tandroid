package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class g6 extends org.telegram.ui.Components.md0 {
    public final /* synthetic */ y6 D0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(y6 y6Var, Context context) {
        super(context);
        this.D0 = y6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        super.dispatchDraw(canvas);
        boolean Z = Z();
        y6 y6Var = this.D0;
        if (Z) {
            float f7 = y6Var.j0;
            if (f7 != 0.0f) {
                y6Var.j0 = f7 - 0.16f;
                invalidate();
                y6Var.j0 = Utilities.clamp(y6Var.j0, 1.0f, 0.0f);
                d5Var = ((org.telegram.ui.ActionBar.n2) y6Var).parentLayout;
                if (d5Var == null) {
                    d5Var2 = ((org.telegram.ui.ActionBar.n2) y6Var).parentLayout;
                    ActionBarLayout actionBarLayout = (ActionBarLayout) d5Var2;
                    actionBarLayout.p(canvas, (int) (y6Var.h0 * 255.0f * y6Var.j0), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
                    return;
                }
                return;
            }
        }
        if (!Z) {
            float f10 = y6Var.j0;
            if (f10 != 1.0f) {
                y6Var.j0 = f10 + 0.16f;
                invalidate();
            }
        }
        y6Var.j0 = Utilities.clamp(y6Var.j0, 1.0f, 0.0f);
        d5Var = ((org.telegram.ui.ActionBar.n2) y6Var).parentLayout;
        if (d5Var == null) {
        }
    }
}
