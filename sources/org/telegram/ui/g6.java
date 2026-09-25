package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class g6 extends org.telegram.ui.Components.wc0 {
    public final /* synthetic */ z6 D0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(z6 z6Var, Context context) {
        super(context);
        this.D0 = z6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        super.dispatchDraw(canvas);
        boolean Z = Z();
        z6 z6Var = this.D0;
        if (Z) {
            float f7 = z6Var.j0;
            if (f7 != 0.0f) {
                z6Var.j0 = f7 - 0.16f;
                invalidate();
                z6Var.j0 = Utilities.clamp(z6Var.j0, 1.0f, 0.0f);
                b5Var = ((org.telegram.ui.ActionBar.m2) z6Var).parentLayout;
                if (b5Var == null) {
                    b5Var2 = ((org.telegram.ui.ActionBar.m2) z6Var).parentLayout;
                    ActionBarLayout actionBarLayout = (ActionBarLayout) b5Var2;
                    actionBarLayout.p(canvas, (int) (z6Var.h0 * 255.0f * z6Var.j0), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
                    return;
                }
                return;
            }
        }
        if (!Z) {
            float f10 = z6Var.j0;
            if (f10 != 1.0f) {
                z6Var.j0 = f10 + 0.16f;
                invalidate();
            }
        }
        z6Var.j0 = Utilities.clamp(z6Var.j0, 1.0f, 0.0f);
        b5Var = ((org.telegram.ui.ActionBar.m2) z6Var).parentLayout;
        if (b5Var == null) {
        }
    }
}
