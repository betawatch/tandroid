package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class q7 extends t7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Context F;
    public final /* synthetic */ KeyEvent.Callback G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q7(KeyEvent.Callback callback, Context context, Context context2, int i7) {
        super(context);
        this.E = i7;
        this.G = callback;
        this.F = context2;
    }

    @Override // org.telegram.ui.Components.t7
    public final TextView a() {
        switch (this.E) {
            case 0:
                r80 r80Var = new r80(this.F);
                org.telegram.ui.ActionBar.q6.U(r80Var, org.telegram.ui.ActionBar.j6.Fj, ((y7) this.G).J0);
                r80Var.setTextSize(1, 17.0f);
                r80Var.setTypeface(org.telegram.messenger.g0.o());
                r80Var.setEllipsize(TextUtils.TruncateAt.END);
                r80Var.setSingleLine(true);
                return r80Var;
            case 1:
                r80 r80Var2 = new r80(this.F);
                int i7 = org.telegram.ui.ActionBar.j6.Jj;
                y7 y7Var = (y7) this.G;
                org.telegram.ui.ActionBar.q6.U(r80Var2, i7, y7Var.J0);
                r80Var2.setTextSize(1, 13.0f);
                r80Var2.setEllipsize(TextUtils.TruncateAt.END);
                r80Var2.setSingleLine(true);
                r80Var2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f));
                int i10 = org.telegram.ui.ActionBar.j6.i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i10, y7Var.J0), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
                org.telegram.ui.ActionBar.e6 e6Var = y7Var.J0;
                r80Var2.setBackground(a02);
                org.telegram.ui.ActionBar.q6.j(r80Var2, a02, null, M, e6Var);
                r80Var2.setOnClickListener(new n2(4, this, r80Var2));
                return r80Var2;
            default:
                r80 r80Var3 = new r80(this.F);
                org.telegram.ui.ActionBar.q6.U(r80Var3, org.telegram.ui.ActionBar.j6.Jj, ((qm0) this.G).O);
                r80Var3.setTextSize(1, 12.0f);
                r80Var3.setEllipsize(TextUtils.TruncateAt.END);
                r80Var3.setSingleLine(true);
                r80Var3.setPadding(org.telegram.messenger.g0.L(0.0f), 0, org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(0.0f));
                return r80Var3;
        }
    }
}
