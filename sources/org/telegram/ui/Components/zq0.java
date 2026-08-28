package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zq0 extends org.telegram.ui.x01 {
    public final /* synthetic */ eu0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq0(eu0 eu0Var, Context context, xu0 xu0Var, ih.j6 j6Var, yq0 yq0Var) {
        super(context, xu0Var, j6Var, yq0Var);
        this.D = eu0Var;
    }

    @Override // org.telegram.ui.x01
    public final void a() {
        dr0 dr0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.B;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        eu0 eu0Var = this.D;
        xs0[] xs0VarArr = eu0Var.g0;
        if (xs0VarArr != null) {
            for (xs0 xs0Var : xs0VarArr) {
                if (xs0Var != null && (dr0Var = xs0Var.h) != null) {
                    int paddingLeft = dr0Var.getPaddingLeft();
                    int Z = eu0Var.Z(xs0Var.B);
                    int paddingRight = xs0Var.h.getPaddingRight();
                    dr0 dr0Var2 = xs0Var.h;
                    int Y = eu0Var.Y(eu0Var.v0());
                    dr0Var2.a3 = Y;
                    dr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        eu0Var.K();
    }
}
