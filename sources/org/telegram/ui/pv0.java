package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class pv0 implements org.telegram.ui.Components.fl0 {
    public final /* synthetic */ sn a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ org.telegram.ui.Components.gl0 c;
    public final /* synthetic */ uv0 d;

    public pv0(uv0 uv0Var, sn snVar, MessageObject messageObject, org.telegram.ui.Components.gl0 gl0Var) {
        this.d = uv0Var;
        this.a = snVar;
        this.b = messageObject;
        this.c = gl0Var;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean l() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // org.telegram.ui.Components.fl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        float f7;
        ah.j1 j1Var;
        ah.g1 l4;
        float f10;
        int i10;
        float f11;
        int id2 = this.b.getId();
        sn snVar = this.a;
        org.telegram.ui.Cells.z t82 = snVar.t8(id2, true);
        float f12 = 0.0f;
        if (t82 instanceof org.telegram.ui.Cells.t1) {
            ah.j1 j1Var2 = ((org.telegram.ui.Cells.t1) t82).N;
            ah.g1 l10 = j1Var2.l(i1Var);
            if (l10 == null) {
                f11 = 0.0f;
                f7 = f11;
                snVar.eb(t82, this.b, this.c, view, f12, f7, i1Var, false, (i1Var == null && i1Var.a) ? true : z10, z11, false);
                this.d.c(false);
            }
            f12 = j1Var2.c + l10.x + (l10.A / 2.0f);
            f10 = j1Var2.d + l10.y;
            i10 = l10.B;
        } else if (!(t82 instanceof org.telegram.ui.Cells.v0) || (l4 = (j1Var = ((org.telegram.ui.Cells.v0) t82).E0).l(i1Var)) == null) {
            f7 = 0.0f;
            snVar.eb(t82, this.b, this.c, view, f12, f7, i1Var, false, (i1Var == null && i1Var.a) ? true : z10, z11, false);
            this.d.c(false);
        } else {
            f12 = j1Var.c + l4.x + (l4.A / 2.0f);
            f10 = j1Var.d + l4.y;
            i10 = l4.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f7 = f11;
        snVar.eb(t82, this.b, this.c, view, f12, f7, i1Var, false, (i1Var == null && i1Var.a) ? true : z10, z11, false);
        this.d.c(false);
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void s(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
