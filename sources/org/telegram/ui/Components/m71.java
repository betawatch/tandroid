package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class m71 implements o71 {
    public final View a;
    public final String b;
    public final org.telegram.utils.twidget.v0 c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final Paint e = new Paint(1);
    public final Path f = new Path();
    public p71 h;
    public int n;
    public boolean r;

    public m71(org.telegram.ui.Cells.h2 h2Var, int i7, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = h2Var;
        this.d = f6Var;
        String v = org.telegram.utils.twidget.n0.v(i7, botInlineResult);
        this.b = v;
        this.c = org.telegram.utils.twidget.n0.i(v);
    }

    public final void a(int i7) {
        org.telegram.utils.twidget.v0 v0Var = this.c;
        if (v0Var == null || i7 <= 0) {
            return;
        }
        this.n = i7;
        v0Var.n(i7);
        if (this.r) {
            return;
        }
        this.r = true;
        v0Var.l(org.telegram.utils.twidget.j1.a(this.d, true));
        if (this.h == null) {
            this.h = new p71(this, org.telegram.messenger.g0.p);
        }
        p71 p71Var = this.h;
        if (p71Var.p != v0Var) {
            p71Var.q();
            p71Var.p = v0Var;
            v0Var.h = p71Var;
            v0Var.m(p71Var.q);
        }
        this.h.p(true);
        org.telegram.utils.twidget.n0.t(v0Var);
    }

    @Override // org.telegram.ui.Components.o71
    public final void h() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.o71
    public final void j() {
        View view = this.a;
        view.requestLayout();
        view.invalidate();
    }

    @Override // org.telegram.ui.Components.o71
    public final void b(boolean z9) {
    }

    @Override // org.telegram.ui.Components.o71
    public final /* synthetic */ void f(String str) {
    }

    @Override // org.telegram.ui.Components.o71
    public final /* synthetic */ void d() {
    }
}
