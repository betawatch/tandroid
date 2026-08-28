package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f6 extends org.telegram.ui.Components.tb0 {
    public final /* synthetic */ y6 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(y6 y6Var, Context context) {
        super(context);
        this.z0 = y6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        super.dispatchDraw(canvas);
        boolean Z = Z();
        y6 y6Var = this.z0;
        if (Z) {
            float f10 = y6Var.f0;
            if (f10 != 0.0f) {
                y6Var.f0 = f10 - 0.16f;
                invalidate();
                y6Var.f0 = Utilities.clamp(y6Var.f0, 1.0f, 0.0f);
                b5Var = ((org.telegram.ui.ActionBar.o2) y6Var).parentLayout;
                if (b5Var == null) {
                    b5Var2 = ((org.telegram.ui.ActionBar.o2) y6Var).parentLayout;
                    ActionBarLayout actionBarLayout = (ActionBarLayout) b5Var2;
                    actionBarLayout.p(canvas, (int) (y6Var.d0 * 255.0f * y6Var.f0), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
                    return;
                }
                return;
            }
        }
        if (!Z) {
            float f11 = y6Var.f0;
            if (f11 != 1.0f) {
                y6Var.f0 = f11 + 0.16f;
                invalidate();
            }
        }
        y6Var.f0 = Utilities.clamp(y6Var.f0, 1.0f, 0.0f);
        b5Var = ((org.telegram.ui.ActionBar.o2) y6Var).parentLayout;
        if (b5Var == null) {
        }
    }
}
