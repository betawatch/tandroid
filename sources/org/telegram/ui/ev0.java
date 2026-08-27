package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ev0 implements org.telegram.ui.Components.vj0 {
    public final /* synthetic */ rn a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ org.telegram.ui.Components.wj0 c;
    public final /* synthetic */ jv0 d;

    public ev0(jv0 jv0Var, rn rnVar, MessageObject messageObject, org.telegram.ui.Components.wj0 wj0Var) {
        this.d = jv0Var;
        this.a = rnVar;
        this.b = messageObject;
        this.c = wj0Var;
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ boolean m() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // org.telegram.ui.Components.vj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(View view, ig.q0 q0Var, boolean z10, boolean z11) {
        float f10;
        ig.r0 r0Var;
        ig.o0 l10;
        float f11;
        int i10;
        float f12;
        int id2 = this.b.getId();
        rn rnVar = this.a;
        org.telegram.ui.Cells.a0 q82 = rnVar.q8(id2, true);
        float f13 = 0.0f;
        if (q82 instanceof org.telegram.ui.Cells.s1) {
            ig.r0 r0Var2 = ((org.telegram.ui.Cells.s1) q82).J;
            ig.o0 l11 = r0Var2.l(q0Var);
            if (l11 == null) {
                f12 = 0.0f;
                f10 = f12;
                rnVar.ab(q82, this.b, this.c, view, f13, f10, q0Var, false, (q0Var == null && q0Var.a) ? true : z10, z11, false);
                this.d.c(false);
            }
            f13 = r0Var2.c + l11.x + (l11.A / 2.0f);
            f11 = r0Var2.d + l11.y;
            i10 = l11.B;
        } else if (!(q82 instanceof org.telegram.ui.Cells.v0) || (l10 = (r0Var = ((org.telegram.ui.Cells.v0) q82).y0).l(q0Var)) == null) {
            f10 = 0.0f;
            rnVar.ab(q82, this.b, this.c, view, f13, f10, q0Var, false, (q0Var == null && q0Var.a) ? true : z10, z11, false);
            this.d.c(false);
        } else {
            f13 = r0Var.c + l10.x + (l10.A / 2.0f);
            f11 = r0Var.d + l10.y;
            i10 = l10.B;
        }
        f12 = f11 + (i10 / 2.0f);
        f10 = f12;
        rnVar.ab(q82, this.b, this.c, view, f13, f10, q0Var, false, (q0Var == null && q0Var.a) ? true : z10, z11, false);
        this.d.c(false);
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.vj0
    public final /* synthetic */ void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
    }
}
