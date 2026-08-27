package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ar0 extends org.telegram.ui.y01 {
    public final /* synthetic */ hu0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar0(hu0 hu0Var, Context context, zu0 zu0Var, jh.f6 f6Var, zq0 zq0Var) {
        super(context, zu0Var, f6Var, zq0Var);
        this.D = hu0Var;
    }

    @Override // org.telegram.ui.y01
    public final void a() {
        er0 er0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.B;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        hu0 hu0Var = this.D;
        zs0[] zs0VarArr = hu0Var.g0;
        if (zs0VarArr != null) {
            for (zs0 zs0Var : zs0VarArr) {
                if (zs0Var != null && (er0Var = zs0Var.h) != null) {
                    int paddingLeft = er0Var.getPaddingLeft();
                    int Z = hu0Var.Z(zs0Var.B);
                    int paddingRight = zs0Var.h.getPaddingRight();
                    er0 er0Var2 = zs0Var.h;
                    int Y = hu0Var.Y(hu0Var.v0());
                    er0Var2.a3 = Y;
                    er0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        hu0Var.K();
    }
}
