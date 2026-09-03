package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l6 extends org.telegram.ui.Components.pc0 {
    public final /* synthetic */ d7 A0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(d7 d7Var, Context context) {
        super(context);
        this.A0 = d7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        super.dispatchDraw(canvas);
        boolean Z = Z();
        d7 d7Var = this.A0;
        if (Z) {
            float f10 = d7Var.g0;
            if (f10 != 0.0f) {
                d7Var.g0 = f10 - 0.16f;
                invalidate();
                d7Var.g0 = Utilities.clamp(d7Var.g0, 1.0f, 0.0f);
                e5Var = ((org.telegram.ui.ActionBar.p2) d7Var).parentLayout;
                if (e5Var == null) {
                    e5Var2 = ((org.telegram.ui.ActionBar.p2) d7Var).parentLayout;
                    ActionBarLayout actionBarLayout = (ActionBarLayout) e5Var2;
                    actionBarLayout.p(canvas, (int) (d7Var.e0 * 255.0f * d7Var.g0), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
                    return;
                }
                return;
            }
        }
        if (!Z) {
            float f11 = d7Var.g0;
            if (f11 != 1.0f) {
                d7Var.g0 = f11 + 0.16f;
                invalidate();
            }
        }
        d7Var.g0 = Utilities.clamp(d7Var.g0, 1.0f, 0.0f);
        e5Var = ((org.telegram.ui.ActionBar.p2) d7Var).parentLayout;
        if (e5Var == null) {
        }
    }
}
