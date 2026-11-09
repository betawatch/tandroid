package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class t7 extends w7 {
    public final /* synthetic */ int D;
    public final /* synthetic */ Context E;
    public final /* synthetic */ KeyEvent.Callback F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7(KeyEvent.Callback callback, Context context, Context context2, int i7) {
        super(context);
        this.D = i7;
        this.F = callback;
        this.E = context2;
    }

    @Override // org.telegram.ui.Components.w7
    public final TextView a() {
        switch (this.D) {
            case 0:
                p80 p80Var = new p80(this.E);
                org.telegram.ui.ActionBar.s6.U(p80Var, org.telegram.ui.ActionBar.l6.Cj, ((b8) this.F).I0);
                p80Var.setTextSize(1, 17.0f);
                p80Var.setTypeface(org.telegram.messenger.g0.o());
                p80Var.setEllipsize(TextUtils.TruncateAt.END);
                p80Var.setSingleLine(true);
                return p80Var;
            case 1:
                p80 p80Var2 = new p80(this.E);
                int i7 = org.telegram.ui.ActionBar.l6.Gj;
                b8 b8Var = (b8) this.F;
                org.telegram.ui.ActionBar.s6.U(p80Var2, i7, b8Var.I0);
                p80Var2.setTextSize(1, 13.0f);
                p80Var2.setEllipsize(TextUtils.TruncateAt.END);
                p80Var2.setSingleLine(true);
                p80Var2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f));
                int i10 = org.telegram.ui.ActionBar.l6.i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.w0(i10, b8Var.I0), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i10);
                org.telegram.ui.ActionBar.g6 g6Var = b8Var.I0;
                p80Var2.setBackground(a02);
                org.telegram.ui.ActionBar.s6.j(p80Var2, a02, null, M, g6Var);
                p80Var2.setOnClickListener(new org.telegram.ui.ActionBar.l1(27, this, p80Var2));
                return p80Var2;
            default:
                p80 p80Var3 = new p80(this.E);
                org.telegram.ui.ActionBar.s6.U(p80Var3, org.telegram.ui.ActionBar.l6.Gj, ((nm0) this.F).N);
                p80Var3.setTextSize(1, 12.0f);
                p80Var3.setEllipsize(TextUtils.TruncateAt.END);
                p80Var3.setSingleLine(true);
                p80Var3.setPadding(org.telegram.messenger.g0.L(0.0f), 0, org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(0.0f));
                return p80Var3;
        }
    }
}
