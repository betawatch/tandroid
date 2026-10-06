package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ae1 implements org.telegram.ui.Components.rk0 {
    public final /* synthetic */ yn a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ org.telegram.ui.Components.sk0 c;
    public final /* synthetic */ ee1 d;

    public ae1(ee1 ee1Var, yn ynVar, MessageObject messageObject, org.telegram.ui.Components.sk0 sk0Var) {
        this.d = ee1Var;
        this.a = ynVar;
        this.b = messageObject;
        this.c = sk0Var;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean B() {
        return true;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ boolean K() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // org.telegram.ui.Components.rk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(View view, zg.m0 m0Var, boolean z10, boolean z11) {
        float f7;
        zg.n0 n0Var;
        zg.k0 m10;
        float f10;
        int i10;
        float f11;
        int id2 = this.b.getId();
        yn ynVar = this.a;
        org.telegram.ui.Cells.a0 q82 = ynVar.q8(id2, true);
        float f12 = 0.0f;
        if (q82 instanceof org.telegram.ui.Cells.u1) {
            zg.n0 n0Var2 = ((org.telegram.ui.Cells.u1) q82).N;
            zg.k0 m11 = n0Var2.m(m0Var);
            if (m11 == null) {
                f11 = 0.0f;
                f7 = f11;
                ynVar.Za(q82, this.b, this.c, view, f12, f7, m0Var, false, (m0Var == null && m0Var.a) ? true : z10, z11, false);
                this.d.c(false);
            }
            f12 = n0Var2.c + m11.x + (m11.A / 2.0f);
            f10 = n0Var2.d + m11.y;
            i10 = m11.B;
        } else if (!(q82 instanceof org.telegram.ui.Cells.w0) || (m10 = (n0Var = ((org.telegram.ui.Cells.w0) q82).C0).m(m0Var)) == null) {
            f7 = 0.0f;
            ynVar.Za(q82, this.b, this.c, view, f12, f7, m0Var, false, (m0Var == null && m0Var.a) ? true : z10, z11, false);
            this.d.c(false);
        } else {
            f12 = n0Var.c + m10.x + (m10.A / 2.0f);
            f10 = n0Var.d + m10.y;
            i10 = m10.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f7 = f11;
        ynVar.Za(q82, this.b, this.c, view, f12, f7, m0Var, false, (m0Var == null && m0Var.a) ? true : z10, z11, false);
        this.d.c(false);
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ void I() {
    }

    @Override // org.telegram.ui.Components.rk0
    public final /* synthetic */ void H(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
