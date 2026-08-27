package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g6 extends org.telegram.ui.Components.xb0 {
    public final /* synthetic */ z6 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(z6 z6Var, Context context) {
        super(context);
        this.z0 = z6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        super.dispatchDraw(canvas);
        boolean Z = Z();
        z6 z6Var = this.z0;
        if (Z) {
            float f10 = z6Var.f0;
            if (f10 != 0.0f) {
                z6Var.f0 = f10 - 0.16f;
                invalidate();
                z6Var.f0 = Utilities.clamp(z6Var.f0, 1.0f, 0.0f);
                b5Var = ((org.telegram.ui.ActionBar.n2) z6Var).parentLayout;
                if (b5Var == null) {
                    b5Var2 = ((org.telegram.ui.ActionBar.n2) z6Var).parentLayout;
                    ActionBarLayout actionBarLayout = (ActionBarLayout) b5Var2;
                    actionBarLayout.p(canvas, (int) (z6Var.d0 * 255.0f * z6Var.f0), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
                    return;
                }
                return;
            }
        }
        if (!Z) {
            float f11 = z6Var.f0;
            if (f11 != 1.0f) {
                z6Var.f0 = f11 + 0.16f;
                invalidate();
            }
        }
        z6Var.f0 = Utilities.clamp(z6Var.f0, 1.0f, 0.0f);
        b5Var = ((org.telegram.ui.ActionBar.n2) z6Var).parentLayout;
        if (b5Var == null) {
        }
    }
}
