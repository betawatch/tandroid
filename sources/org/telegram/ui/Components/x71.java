package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class x71 implements z71 {
    public final View a;
    public final String b;
    public final org.telegram.utils.twidget.d1 c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final Paint e = new Paint(1);
    public final Path f = new Path();
    public a81 h;
    public int n;
    public boolean r;

    public x71(org.telegram.ui.Cells.h2 h2Var, int i7, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.i6 i6Var) {
        this.a = h2Var;
        this.d = i6Var;
        String v = org.telegram.utils.twidget.n0.v(i7, botInlineResult);
        this.b = v;
        this.c = org.telegram.utils.twidget.n0.i(v);
    }

    public final void a(int i7) {
        org.telegram.utils.twidget.d1 d1Var = this.c;
        if (d1Var == null || i7 <= 0) {
            return;
        }
        this.n = i7;
        d1Var.l(i7);
        if (this.r) {
            return;
        }
        this.r = true;
        d1Var.j(org.telegram.utils.twidget.q1.a(this.d, true));
        if (this.h == null) {
            this.h = new a81(this, org.telegram.messenger.g0.p);
        }
        this.h.b(d1Var);
        this.h.q(true);
        org.telegram.utils.twidget.n0.t(d1Var);
    }

    @Override // org.telegram.ui.Components.z71
    public final void h() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.z71
    public final void j() {
        View view = this.a;
        view.requestLayout();
        view.invalidate();
    }

    @Override // org.telegram.ui.Components.z71
    public final void b(boolean z10) {
    }

    @Override // org.telegram.ui.Components.z71
    public final /* synthetic */ void f(String str) {
    }

    @Override // org.telegram.ui.Components.z71
    public final /* synthetic */ void d() {
    }
}
