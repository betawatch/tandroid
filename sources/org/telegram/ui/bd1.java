package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bd1 implements org.telegram.ui.Components.ek0 {
    public final /* synthetic */ tn a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ org.telegram.ui.Components.fk0 c;
    public final /* synthetic */ fd1 d;

    public bd1(fd1 fd1Var, tn tnVar, MessageObject messageObject, org.telegram.ui.Components.fk0 fk0Var) {
        this.d = fd1Var;
        this.a = tnVar;
        this.b = messageObject;
        this.c = fk0Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean O() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // org.telegram.ui.Components.ek0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(View view, kg.q0 q0Var, boolean z10, boolean z11) {
        float f9;
        kg.r0 r0Var;
        kg.o0 m10;
        float f10;
        int i10;
        float f11;
        int id2 = this.b.getId();
        tn tnVar = this.a;
        org.telegram.ui.Cells.a0 q82 = tnVar.q8(id2, true);
        float f12 = 0.0f;
        if (q82 instanceof org.telegram.ui.Cells.s1) {
            kg.r0 r0Var2 = ((org.telegram.ui.Cells.s1) q82).J;
            kg.o0 m11 = r0Var2.m(q0Var);
            if (m11 == null) {
                f11 = 0.0f;
                f9 = f11;
                tnVar.ab(q82, this.b, this.c, view, f12, f9, q0Var, false, (q0Var == null && q0Var.a) ? true : z10, z11, false);
                this.d.c(false);
            }
            f12 = r0Var2.c + m11.x + (m11.A / 2.0f);
            f10 = r0Var2.d + m11.y;
            i10 = m11.B;
        } else if (!(q82 instanceof org.telegram.ui.Cells.v0) || (m10 = (r0Var = ((org.telegram.ui.Cells.v0) q82).y0).m(q0Var)) == null) {
            f9 = 0.0f;
            tnVar.ab(q82, this.b, this.c, view, f12, f9, q0Var, false, (q0Var == null && q0Var.a) ? true : z10, z11, false);
            this.d.c(false);
        } else {
            f12 = r0Var.c + m10.x + (m10.A / 2.0f);
            f10 = r0Var.d + m10.y;
            i10 = m10.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f9 = f11;
        tnVar.ab(q82, this.b, this.c, view, f12, f9, q0Var, false, (q0Var == null && q0Var.a) ? true : z10, z11, false);
        this.d.c(false);
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void G(Canvas canvas, RectF rectF, float f9, float f10, float f11, int i10, boolean z10) {
    }
}
