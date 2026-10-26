package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ed1 implements org.telegram.ui.Components.el0 {
    public final /* synthetic */ un a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ org.telegram.ui.Components.fl0 c;
    public final /* synthetic */ id1 d;

    public ed1(id1 id1Var, un unVar, MessageObject messageObject, org.telegram.ui.Components.fl0 fl0Var) {
        this.d = id1Var;
        this.a = unVar;
        this.b = messageObject;
        this.c = fl0Var;
    }

    @Override // org.telegram.ui.Components.el0
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.el0
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // org.telegram.ui.Components.el0
    public final /* synthetic */ boolean o() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // org.telegram.ui.Components.el0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(View view, bh.x0 x0Var, boolean z10, boolean z11) {
        float f7;
        bh.y0 y0Var;
        bh.v0 l4;
        float f10;
        int i10;
        float f11;
        int id2 = this.b.getId();
        un unVar = this.a;
        org.telegram.ui.Cells.z x82 = unVar.x8(id2, true);
        float f12 = 0.0f;
        if (x82 instanceof org.telegram.ui.Cells.s1) {
            bh.y0 y0Var2 = ((org.telegram.ui.Cells.s1) x82).N;
            bh.v0 l10 = y0Var2.l(x0Var);
            if (l10 == null) {
                f11 = 0.0f;
                f7 = f11;
                unVar.jb(x82, this.b, this.c, view, f12, f7, x0Var, false, (x0Var == null && x0Var.a) ? true : z10, z11, false);
                this.d.c(false);
            }
            f12 = y0Var2.c + l10.x + (l10.A / 2.0f);
            f10 = y0Var2.d + l10.y;
            i10 = l10.B;
        } else if (!(x82 instanceof org.telegram.ui.Cells.v0) || (l4 = (y0Var = ((org.telegram.ui.Cells.v0) x82).E0).l(x0Var)) == null) {
            f7 = 0.0f;
            unVar.jb(x82, this.b, this.c, view, f12, f7, x0Var, false, (x0Var == null && x0Var.a) ? true : z10, z11, false);
            this.d.c(false);
        } else {
            f12 = y0Var.c + l4.x + (l4.A / 2.0f);
            f10 = y0Var.d + l4.y;
            i10 = l4.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f7 = f11;
        unVar.jb(x82, this.b, this.c, view, f12, f7, x0Var, false, (x0Var == null && x0Var.a) ? true : z10, z11, false);
        this.d.c(false);
    }

    @Override // org.telegram.ui.Components.el0
    public final /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.el0
    public final /* synthetic */ void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
