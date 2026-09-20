package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ie1 implements org.telegram.ui.Components.ok0 {
    public final /* synthetic */ zn a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ org.telegram.ui.Components.pk0 c;
    public final /* synthetic */ me1 d;

    public ie1(me1 me1Var, zn znVar, MessageObject messageObject, org.telegram.ui.Components.pk0 pk0Var) {
        this.d = me1Var;
        this.a = znVar;
        this.b = messageObject;
        this.c = pk0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // org.telegram.ui.Components.ok0
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
        zn znVar = this.a;
        org.telegram.ui.Cells.a0 q82 = znVar.q8(id2, true);
        float f12 = 0.0f;
        if (q82 instanceof org.telegram.ui.Cells.u1) {
            zg.p0 p0Var2 = ((org.telegram.ui.Cells.u1) q82).N;
            zg.m0 m11 = p0Var2.m(o0Var);
            if (m11 == null) {
                f11 = 0.0f;
                f7 = f11;
                znVar.ab(q82, this.b, this.c, view, f12, f7, o0Var, false, (o0Var == null && o0Var.a) ? true : z10, z11, false);
                this.d.c(false);
            }
            f12 = p0Var2.c + m11.x + (m11.A / 2.0f);
            f10 = p0Var2.d + m11.y;
            i10 = m11.B;
        } else if (!(q82 instanceof org.telegram.ui.Cells.w0) || (m10 = (p0Var = ((org.telegram.ui.Cells.w0) q82).C0).m(o0Var)) == null) {
            f7 = 0.0f;
            znVar.ab(q82, this.b, this.c, view, f12, f7, o0Var, false, (o0Var == null && o0Var.a) ? true : z10, z11, false);
            this.d.c(false);
        } else {
            f12 = p0Var.c + m10.x + (m10.A / 2.0f);
            f10 = p0Var.d + m10.y;
            i10 = m10.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f7 = f11;
        znVar.ab(q82, this.b, this.c, view, f12, f7, o0Var, false, (o0Var == null && o0Var.a) ? true : z10, z11, false);
        this.d.c(false);
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean r() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
