package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class k6 extends org.telegram.ui.Components.gd0 {
    public final /* synthetic */ c7 D0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(c7 c7Var, Context context) {
        super(context);
        this.D0 = c7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // org.telegram.ui.Components.lw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        super.dispatchDraw(canvas);
        boolean Z = Z();
        c7 c7Var = this.D0;
        if (Z) {
            float f7 = c7Var.j0;
            if (f7 != 0.0f) {
                c7Var.j0 = f7 - 0.16f;
                invalidate();
                c7Var.j0 = Utilities.clamp(c7Var.j0, 1.0f, 0.0f);
                d5Var = ((org.telegram.ui.ActionBar.n2) c7Var).parentLayout;
                if (d5Var == null) {
                    d5Var2 = ((org.telegram.ui.ActionBar.n2) c7Var).parentLayout;
                    ActionBarLayout actionBarLayout = (ActionBarLayout) d5Var2;
                    actionBarLayout.p(canvas, (int) (c7Var.h0 * 255.0f * c7Var.j0), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
                    return;
                }
                return;
            }
        }
        if (!Z) {
            float f10 = c7Var.j0;
            if (f10 != 1.0f) {
                c7Var.j0 = f10 + 0.16f;
                invalidate();
            }
        }
        c7Var.j0 = Utilities.clamp(c7Var.j0, 1.0f, 0.0f);
        d5Var = ((org.telegram.ui.ActionBar.n2) c7Var).parentLayout;
        if (d5Var == null) {
        }
    }
}
