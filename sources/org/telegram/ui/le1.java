package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class le1 implements org.telegram.ui.Components.ok0 {
    public final /* synthetic */ eo a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ org.telegram.ui.Components.pk0 c;
    public final /* synthetic */ pe1 d;

    public le1(pe1 pe1Var, eo eoVar, MessageObject messageObject, org.telegram.ui.Components.pk0 pk0Var) {
        this.d = pe1Var;
        this.a = eoVar;
        this.b = messageObject;
        this.c = pk0Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean k() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // org.telegram.ui.Components.ok0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(View view, yg.p0 p0Var, boolean z10, boolean z11) {
        float f7;
        yg.q0 q0Var;
        yg.n0 m10;
        float f10;
        int i10;
        float f11;
        int id2 = this.b.getId();
        eo eoVar = this.a;
        org.telegram.ui.Cells.a0 q82 = eoVar.q8(id2, true);
        float f12 = 0.0f;
        if (q82 instanceof org.telegram.ui.Cells.t1) {
            yg.q0 q0Var2 = ((org.telegram.ui.Cells.t1) q82).N;
            yg.n0 m11 = q0Var2.m(p0Var);
            if (m11 == null) {
                f11 = 0.0f;
                f7 = f11;
                eoVar.ab(q82, this.b, this.c, view, f12, f7, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
                this.d.c(false);
            }
            f12 = q0Var2.c + m11.x + (m11.A / 2.0f);
            f10 = q0Var2.d + m11.y;
            i10 = m11.B;
        } else if (!(q82 instanceof org.telegram.ui.Cells.w0) || (m10 = (q0Var = ((org.telegram.ui.Cells.w0) q82).C0).m(p0Var)) == null) {
            f7 = 0.0f;
            eoVar.ab(q82, this.b, this.c, view, f12, f7, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
            this.d.c(false);
        } else {
            f12 = q0Var.c + m10.x + (m10.A / 2.0f);
            f10 = q0Var.d + m10.y;
            i10 = m10.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f7 = f11;
        eoVar.ab(q82, this.b, this.c, view, f12, f7, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
        this.d.c(false);
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
