package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class k6 extends org.telegram.ui.Components.md0 {
    public final /* synthetic */ d7 D0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(d7 d7Var, Context context) {
        super(context);
        this.D0 = d7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        super.dispatchDraw(canvas);
        boolean Z = Z();
        d7 d7Var = this.D0;
        if (Z) {
            float f7 = d7Var.j0;
            if (f7 != 0.0f) {
                d7Var.j0 = f7 - 0.16f;
                invalidate();
                d7Var.j0 = Utilities.clamp(d7Var.j0, 1.0f, 0.0f);
                b5Var = ((org.telegram.ui.ActionBar.m2) d7Var).parentLayout;
                if (b5Var == null) {
                    b5Var2 = ((org.telegram.ui.ActionBar.m2) d7Var).parentLayout;
                    ActionBarLayout actionBarLayout = (ActionBarLayout) b5Var2;
                    actionBarLayout.p(canvas, (int) (d7Var.h0 * 255.0f * d7Var.j0), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
                    return;
                }
                return;
            }
        }
        if (!Z) {
            float f10 = d7Var.j0;
            if (f10 != 1.0f) {
                d7Var.j0 = f10 + 0.16f;
                invalidate();
            }
        }
        d7Var.j0 = Utilities.clamp(d7Var.j0, 1.0f, 0.0f);
        b5Var = ((org.telegram.ui.ActionBar.m2) d7Var).parentLayout;
        if (b5Var == null) {
        }
    }
}
