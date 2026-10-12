package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class mw0 implements org.telegram.ui.Components.fl0 {
    public final /* synthetic */ fo a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ org.telegram.ui.Components.gl0 c;
    public final /* synthetic */ sw0 d;

    public mw0(sw0 sw0Var, fo foVar, MessageObject messageObject, org.telegram.ui.Components.gl0 gl0Var) {
        this.d = sw0Var;
        this.a = foVar;
        this.b = messageObject;
        this.c = gl0Var;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean n() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // org.telegram.ui.Components.fl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        float f7;
        ah.j1 j1Var;
        ah.g1 l4;
        float f10;
        int i10;
        float f11;
        int id2 = this.b.getId();
        fo foVar = this.a;
        org.telegram.ui.Cells.a0 t82 = foVar.t8(id2, true);
        float f12 = 0.0f;
        if (t82 instanceof org.telegram.ui.Cells.u1) {
            ah.j1 j1Var2 = ((org.telegram.ui.Cells.u1) t82).N;
            ah.g1 l10 = j1Var2.l(i1Var);
            if (l10 == null) {
                f11 = 0.0f;
                f7 = f11;
                foVar.eb(t82, this.b, this.c, view, f12, f7, i1Var, false, (i1Var == null && i1Var.a) ? true : z10, z11, false);
                this.d.c(false);
            }
            f12 = j1Var2.c + l10.x + (l10.A / 2.0f);
            f10 = j1Var2.d + l10.y;
            i10 = l10.B;
        } else if (!(t82 instanceof org.telegram.ui.Cells.x0) || (l4 = (j1Var = ((org.telegram.ui.Cells.x0) t82).E0).l(i1Var)) == null) {
            f7 = 0.0f;
            foVar.eb(t82, this.b, this.c, view, f12, f7, i1Var, false, (i1Var == null && i1Var.a) ? true : z10, z11, false);
            this.d.c(false);
        } else {
            f12 = j1Var.c + l4.x + (l4.A / 2.0f);
            f10 = j1Var.d + l4.y;
            i10 = l4.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f7 = f11;
        foVar.eb(t82, this.b, this.c, view, f12, f7, i1Var, false, (i1Var == null && i1Var.a) ? true : z10, z11, false);
        this.d.c(false);
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void y() {
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void w(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
