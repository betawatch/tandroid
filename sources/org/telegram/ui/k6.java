package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class k6 extends org.telegram.ui.Components.id0 {
    public final /* synthetic */ c7 D0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(c7 c7Var, Context context) {
        super(context);
        this.D0 = c7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        super.dispatchDraw(canvas);
        boolean Y = Y();
        c7 c7Var = this.D0;
        if (Y) {
            float f7 = c7Var.j0;
            if (f7 != 0.0f) {
                c7Var.j0 = f7 - 0.16f;
                invalidate();
                c7Var.j0 = Utilities.clamp(c7Var.j0, 1.0f, 0.0f);
                h5Var = ((org.telegram.ui.ActionBar.o2) c7Var).parentLayout;
                if (h5Var == null) {
                    h5Var2 = ((org.telegram.ui.ActionBar.o2) c7Var).parentLayout;
                    ActionBarLayout actionBarLayout = (ActionBarLayout) h5Var2;
                    actionBarLayout.p(canvas, (int) (c7Var.h0 * 255.0f * c7Var.j0), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
                    return;
                }
                return;
            }
        }
        if (!Y) {
            float f10 = c7Var.j0;
            if (f10 != 1.0f) {
                c7Var.j0 = f10 + 0.16f;
                invalidate();
            }
        }
        c7Var.j0 = Utilities.clamp(c7Var.j0, 1.0f, 0.0f);
        h5Var = ((org.telegram.ui.ActionBar.o2) c7Var).parentLayout;
        if (h5Var == null) {
        }
    }
}
