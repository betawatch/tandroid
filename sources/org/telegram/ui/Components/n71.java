package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n71 implements p71 {
    public final View a;
    public final String b;
    public final org.telegram.utils.twidget.y0 c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final Paint e = new Paint(1);
    public final Path f = new Path();
    public q71 h;
    public int n;
    public boolean r;

    public n71(org.telegram.ui.Cells.h2 h2Var, int i7, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = h2Var;
        this.d = e6Var;
        String v = org.telegram.utils.twidget.n0.v(i7, botInlineResult);
        this.b = v;
        this.c = org.telegram.utils.twidget.n0.i(v);
    }

    public final void a(int i7) {
        org.telegram.utils.twidget.y0 y0Var = this.c;
        if (y0Var == null || i7 <= 0) {
            return;
        }
        this.n = i7;
        y0Var.n(i7);
        if (this.r) {
            return;
        }
        this.r = true;
        y0Var.l(org.telegram.utils.twidget.m1.a(this.d, true));
        if (this.h == null) {
            this.h = new q71(this, org.telegram.messenger.g0.p);
        }
        q71 q71Var = this.h;
        if (q71Var.p != y0Var) {
            q71Var.q();
            q71Var.p = y0Var;
            y0Var.h = q71Var;
            y0Var.m(q71Var.q);
        }
        this.h.p(true);
        org.telegram.utils.twidget.n0.t(y0Var);
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
    public final void b(boolean z10) {
    }

    @Override // org.telegram.ui.Components.p71
    public final /* synthetic */ void f(String str) {
    }

    @Override // org.telegram.ui.Components.p71
    public final /* synthetic */ void d() {
    }
}
