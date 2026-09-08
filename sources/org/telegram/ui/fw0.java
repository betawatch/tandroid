package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class fw0 implements org.telegram.ui.Components.ek0 {
    public final /* synthetic */ co a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ org.telegram.ui.Components.fk0 c;
    public final /* synthetic */ lw0 d;

    public fw0(lw0 lw0Var, co coVar, MessageObject messageObject, org.telegram.ui.Components.fk0 fk0Var) {
        this.d = lw0Var;
        this.a = coVar;
        this.b = messageObject;
        this.c = fk0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // org.telegram.ui.Components.ek0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(View view, ah.j1 j1Var, boolean z10, boolean z11) {
        float f7;
        ah.k1 k1Var;
        ah.h1 l4;
        float f10;
        int i10;
        float f11;
        int id2 = this.b.getId();
        co coVar = this.a;
        org.telegram.ui.Cells.a0 q82 = coVar.q8(id2, true);
        float f12 = 0.0f;
        if (q82 instanceof org.telegram.ui.Cells.t1) {
            ah.k1 k1Var2 = ((org.telegram.ui.Cells.t1) q82).N;
            ah.h1 l10 = k1Var2.l(j1Var);
            if (l10 == null) {
                f11 = 0.0f;
                f7 = f11;
                coVar.ab(q82, this.b, this.c, view, f12, f7, j1Var, false, (j1Var == null && j1Var.a) ? true : z10, z11, false);
                this.d.c(false);
            }
            f12 = k1Var2.c + l10.x + (l10.A / 2.0f);
            f10 = k1Var2.d + l10.y;
            i10 = l10.B;
        } else if (!(q82 instanceof org.telegram.ui.Cells.w0) || (l4 = (k1Var = ((org.telegram.ui.Cells.w0) q82).C0).l(j1Var)) == null) {
            f7 = 0.0f;
            coVar.ab(q82, this.b, this.c, view, f12, f7, j1Var, false, (j1Var == null && j1Var.a) ? true : z10, z11, false);
            this.d.c(false);
        } else {
            f12 = k1Var.c + l4.x + (l4.A / 2.0f);
            f10 = k1Var.d + l4.y;
            i10 = l4.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f7 = f11;
        coVar.ab(q82, this.b, this.c, view, f12, f7, j1Var, false, (j1Var == null && j1Var.a) ? true : z10, z11, false);
        this.d.c(false);
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean n() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void I(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
