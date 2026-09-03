package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class j6 extends org.telegram.ui.Components.qc0 {
    public final /* synthetic */ b7 A0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(b7 b7Var, Context context) {
        super(context);
        this.A0 = b7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        super.dispatchDraw(canvas);
        boolean Z = Z();
        b7 b7Var = this.A0;
        if (Z) {
            float f10 = b7Var.g0;
            if (f10 != 0.0f) {
                b7Var.g0 = f10 - 0.16f;
                invalidate();
                b7Var.g0 = Utilities.clamp(b7Var.g0, 1.0f, 0.0f);
                f5Var = ((org.telegram.ui.ActionBar.p2) b7Var).parentLayout;
                if (f5Var == null) {
                    f5Var2 = ((org.telegram.ui.ActionBar.p2) b7Var).parentLayout;
                    ActionBarLayout actionBarLayout = (ActionBarLayout) f5Var2;
                    actionBarLayout.p(canvas, (int) (b7Var.e0 * 255.0f * b7Var.g0), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
                    return;
                }
                return;
            }
        }
        if (!Z) {
            float f11 = b7Var.g0;
            if (f11 != 1.0f) {
                b7Var.g0 = f11 + 0.16f;
                invalidate();
            }
        }
        b7Var.g0 = Utilities.clamp(b7Var.g0, 1.0f, 0.0f);
        f5Var = ((org.telegram.ui.ActionBar.p2) b7Var).parentLayout;
        if (f5Var == null) {
        }
    }
}
