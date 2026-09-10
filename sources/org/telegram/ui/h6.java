package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h6 extends org.telegram.ui.Components.vc0 {
    public final /* synthetic */ y6 D0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(y6 y6Var, Context context) {
        super(context);
        this.D0 = y6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        super.dispatchDraw(canvas);
        boolean Z = Z();
        y6 y6Var = this.D0;
        if (Z) {
            float f7 = y6Var.j0;
            if (f7 != 0.0f) {
                y6Var.j0 = f7 - 0.16f;
                invalidate();
                y6Var.j0 = Utilities.clamp(y6Var.j0, 1.0f, 0.0f);
                f5Var = ((org.telegram.ui.ActionBar.p2) y6Var).parentLayout;
                if (f5Var == null) {
                    f5Var2 = ((org.telegram.ui.ActionBar.p2) y6Var).parentLayout;
                    ActionBarLayout actionBarLayout = (ActionBarLayout) f5Var2;
                    actionBarLayout.p(canvas, (int) (y6Var.h0 * 255.0f * y6Var.j0), org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
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
        f5Var = ((org.telegram.ui.ActionBar.p2) y6Var).parentLayout;
        if (f5Var == null) {
        }
    }
}
