package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class mv0 implements org.telegram.ui.Components.cl0 {
    public final /* synthetic */ qn a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ org.telegram.ui.Components.dl0 c;
    public final /* synthetic */ qv0 d;

    public mv0(qv0 qv0Var, qn qnVar, MessageObject messageObject, org.telegram.ui.Components.dl0 dl0Var) {
        this.d = qv0Var;
        this.a = qnVar;
        this.b = messageObject;
        this.c = dl0Var;
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ boolean m() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // org.telegram.ui.Components.cl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        float f7;
        ah.j1 j1Var;
        ah.g1 l4;
        float f10;
        int i10;
        float f11;
        int id2 = this.b.getId();
        qn qnVar = this.a;
        org.telegram.ui.Cells.a0 t82 = qnVar.t8(id2, true);
        float f12 = 0.0f;
        if (t82 instanceof org.telegram.ui.Cells.u1) {
            ah.j1 j1Var2 = ((org.telegram.ui.Cells.u1) t82).N;
            ah.g1 l10 = j1Var2.l(i1Var);
            if (l10 == null) {
                f11 = 0.0f;
                f7 = f11;
                qnVar.eb(t82, this.b, this.c, view, f12, f7, i1Var, false, (i1Var == null && i1Var.a) ? true : z10, z11, false);
                this.d.c(false);
            }
            f12 = j1Var2.c + l10.x + (l10.A / 2.0f);
            f10 = j1Var2.d + l10.y;
            i10 = l10.B;
        } else if (!(t82 instanceof org.telegram.ui.Cells.w0) || (l4 = (j1Var = ((org.telegram.ui.Cells.w0) t82).E0).l(i1Var)) == null) {
            f7 = 0.0f;
            qnVar.eb(t82, this.b, this.c, view, f12, f7, i1Var, false, (i1Var == null && i1Var.a) ? true : z10, z11, false);
            this.d.c(false);
        } else {
            f12 = j1Var.c + l4.x + (l4.A / 2.0f);
            f10 = j1Var.d + l4.y;
            i10 = l4.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f7 = f11;
        qnVar.eb(t82, this.b, this.c, view, f12, f7, i1Var, false, (i1Var == null && i1Var.a) ? true : z10, z11, false);
        this.d.c(false);
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ void v() {
    }

    @Override // org.telegram.ui.Components.cl0
    public final /* synthetic */ void q(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
