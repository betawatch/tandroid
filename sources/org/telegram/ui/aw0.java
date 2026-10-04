package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class aw0 implements org.telegram.ui.Components.rk0 {
    public final /* synthetic */ yn a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ org.telegram.ui.Components.sk0 c;
    public final /* synthetic */ gw0 d;

    public aw0(gw0 gw0Var, yn ynVar, MessageObject messageObject, org.telegram.ui.Components.sk0 sk0Var) {
        this.d = gw0Var;
        this.a = ynVar;
        this.b = messageObject;
        this.c = sk0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // org.telegram.ui.Components.rk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        float f7;
        zg.p0 p0Var;
        zg.m0 m10;
        float f10;
        int i10;
        float f11;
        int id2 = this.b.getId();
        yn ynVar = this.a;
        org.telegram.ui.Cells.a0 q82 = ynVar.q8(id2, true);
        float f12 = 0.0f;
        if (q82 instanceof org.telegram.ui.Cells.u1) {
            zg.p0 p0Var2 = ((org.telegram.ui.Cells.u1) q82).N;
            zg.m0 m11 = p0Var2.m(o0Var);
            if (m11 == null) {
                f11 = 0.0f;
                f7 = f11;
                ynVar.Za(q82, this.b, this.c, view, f12, f7, o0Var, false, (o0Var == null && o0Var.a) ? true : z10, z11, false);
                this.d.c(false);
            }
            f12 = p0Var2.c + m11.x + (m11.A / 2.0f);
            f10 = p0Var2.d + m11.y;
            i10 = m11.B;
        } else if (!(q82 instanceof org.telegram.ui.Cells.w0) || (m10 = (p0Var = ((org.telegram.ui.Cells.w0) q82).C0).m(o0Var)) == null) {
            f7 = 0.0f;
            ynVar.Za(q82, this.b, this.c, view, f12, f7, o0Var, false, (o0Var == null && o0Var.a) ? true : z10, z11, false);
            this.d.c(false);
        } else {
            f12 = p0Var.c + m10.x + (m10.A / 2.0f);
            f10 = p0Var.d + m10.y;
            i10 = m10.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f7 = f11;
        ynVar.Za(q82, this.b, this.c, view, f12, f7, o0Var, false, (o0Var == null && o0Var.a) ? true : z10, z11, false);
        this.d.c(false);
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
