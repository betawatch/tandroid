package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class nd1 implements org.telegram.ui.Components.ok0 {
    public final /* synthetic */ xn a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ org.telegram.ui.Components.pk0 c;
    public final /* synthetic */ rd1 d;

    public nd1(rd1 rd1Var, xn xnVar, MessageObject messageObject, org.telegram.ui.Components.pk0 pk0Var) {
        this.d = rd1Var;
        this.a = xnVar;
        this.b = messageObject;
        this.c = pk0Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean h() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // org.telegram.ui.Components.ok0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        float f10;
        mg.r0 r0Var;
        mg.o0 m9;
        float f11;
        int i10;
        float f12;
        int id2 = this.b.getId();
        xn xnVar = this.a;
        org.telegram.ui.Cells.a0 q82 = xnVar.q8(id2, true);
        float f13 = 0.0f;
        if (q82 instanceof org.telegram.ui.Cells.t1) {
            mg.r0 r0Var2 = ((org.telegram.ui.Cells.t1) q82).K;
            mg.o0 m10 = r0Var2.m(q0Var);
            if (m10 == null) {
                f12 = 0.0f;
                f10 = f12;
                xnVar.ab(q82, this.b, this.c, view, f13, f10, q0Var, false, (q0Var == null && q0Var.a) ? true : z4, z10, false);
                this.d.c(false);
            }
            f13 = r0Var2.c + m10.x + (m10.A / 2.0f);
            f11 = r0Var2.d + m10.y;
            i10 = m10.B;
        } else if (!(q82 instanceof org.telegram.ui.Cells.v0) || (m9 = (r0Var = ((org.telegram.ui.Cells.v0) q82).z0).m(q0Var)) == null) {
            f10 = 0.0f;
            xnVar.ab(q82, this.b, this.c, view, f13, f10, q0Var, false, (q0Var == null && q0Var.a) ? true : z4, z10, false);
            this.d.c(false);
        } else {
            f13 = r0Var.c + m9.x + (m9.A / 2.0f);
            f11 = r0Var.d + m9.y;
            i10 = m9.B;
        }
        f12 = f11 + (i10 / 2.0f);
        f10 = f12;
        xnVar.ab(q82, this.b, this.c, view, f13, f10, q0Var, false, (q0Var == null && q0Var.a) ? true : z4, z10, false);
        this.d.c(false);
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean s() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void n(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
