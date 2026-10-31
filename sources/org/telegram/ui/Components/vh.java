package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vh extends xh {
    public TLRPC.User b;
    public TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ bi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh(bi biVar, Context context) {
        super(context);
        this.d = biVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i10 = bi.E4;
        org.telegram.ui.ActionBar.p6 p6Var = biVar.I0;
        gh.b bVar = new gh.b(context);
        bVar.d = p6Var;
        bVar.Q = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        bVar.b.setVisibility(8);
        bVar.b(false);
        g9 g9Var = new g9(context);
        bVar.c = g9Var;
        bVar.addView(g9Var, w7.b6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.x = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ql, p6Var);
        bVar.s = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ol, p6Var);
        bVar.w = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Pl, p6Var);
        bVar.a();
        this.a = bVar;
        bVar.getBackupImageView().a.g1 = new v1(27);
        addView(this.a, w7.b6.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11 = this.c != null && (-this.b.id) == this.d.Q2;
        this.a.f(z11, z10);
        bi0 B = this.a.getBackupImageView().getImageReceiver().B();
        if (!z10) {
            if (B != null) {
                B.stop();
                B.T(false, 0.0f);
                return;
            }
            return;
        }
        if (!z11 || B == null) {
            return;
        }
        B.K(0);
        B.P(-1);
        B.T(false, 0.0f);
        B.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
    }
}
