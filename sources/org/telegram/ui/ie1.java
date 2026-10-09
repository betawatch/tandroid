package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ie1 implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ zn a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ org.telegram.ui.Components.kl0 c;
    public final /* synthetic */ me1 d;

    public ie1(me1 me1Var, zn znVar, MessageObject messageObject, org.telegram.ui.Components.kl0 kl0Var) {
        this.d = me1Var;
        this.a = znVar;
        this.b = messageObject;
        this.c = kl0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // org.telegram.ui.Components.jl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        float f7;
        zg.o0 o0Var;
        zg.l0 m10;
        float f10;
        int i10;
        float f11;
        int id2 = this.b.getId();
        zn znVar = this.a;
        org.telegram.ui.Cells.a0 t82 = znVar.t8(id2, true);
        float f12 = 0.0f;
        if (t82 instanceof org.telegram.ui.Cells.u1) {
            zg.o0 o0Var2 = ((org.telegram.ui.Cells.u1) t82).N;
            zg.l0 m11 = o0Var2.m(n0Var);
            if (m11 == null) {
                f11 = 0.0f;
                f7 = f11;
                znVar.eb(t82, this.b, this.c, view, f12, f7, n0Var, false, (n0Var == null && n0Var.a) ? true : z10, z11, false);
                this.d.c(false);
            }
            f12 = o0Var2.c + m11.x + (m11.A / 2.0f);
            f10 = o0Var2.d + m11.y;
            i10 = m11.B;
        } else if (!(t82 instanceof org.telegram.ui.Cells.w0) || (m10 = (o0Var = ((org.telegram.ui.Cells.w0) t82).E0).m(n0Var)) == null) {
            f7 = 0.0f;
            znVar.eb(t82, this.b, this.c, view, f12, f7, n0Var, false, (n0Var == null && n0Var.a) ? true : z10, z11, false);
            this.d.c(false);
        } else {
            f12 = o0Var.c + m10.x + (m10.A / 2.0f);
            f10 = o0Var.d + m10.y;
            i10 = m10.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f7 = f11;
        znVar.eb(t82, this.b, this.c, view, f12, f7, n0Var, false, (n0Var == null && n0Var.a) ? true : z10, z11, false);
        this.d.c(false);
    }

    @Override // org.telegram.ui.Components.jl0
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // org.telegram.ui.Components.jl0
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.jl0
    public final /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
