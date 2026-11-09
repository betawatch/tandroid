package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class n71 implements p71 {
    public final View a;
    public final String b;
    public final org.telegram.utils.twidget.v0 c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final Paint e = new Paint(1);
    public final Path f = new Path();
    public q71 h;
    public int n;
    public boolean r;

    public n71(org.telegram.ui.Cells.h2 h2Var, int i7, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = h2Var;
        this.d = g6Var;
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
            this.h = new q71(this, org.telegram.messenger.g0.p);
        }
        q71 q71Var = this.h;
        if (q71Var.p != v0Var) {
            q71Var.q();
            q71Var.p = v0Var;
            v0Var.h = q71Var;
            v0Var.m(q71Var.q);
        }
        this.h.p(true);
        org.telegram.utils.twidget.n0.t(v0Var);
    }

    @Override // org.telegram.ui.Components.p71
    public final void h() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.p71
    public final void j() {
        View view = this.a;
        view.requestLayout();
        view.invalidate();
    }

    @Override // org.telegram.ui.Components.p71
    public final void b(boolean z9) {
    }

    @Override // org.telegram.ui.Components.p71
    public final /* synthetic */ void f(String str) {
    }

    @Override // org.telegram.ui.Components.p71
    public final /* synthetic */ void d() {
    }
}
