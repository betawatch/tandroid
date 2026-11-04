package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uh extends wh {
    public TLRPC.User b;
    public TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ bi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(bi biVar, Context context) {
        super(context);
        this.d = biVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i3 = bi.F4;
        org.telegram.ui.ActionBar.e6 e6Var = biVar.J0;
        rh.b bVar = new rh.b(context);
        bVar.d = e6Var;
        bVar.R = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b.setVisibility(8);
        bVar.b(false);
        k9 k9Var = new k9(context);
        bVar.c = k9Var;
        bVar.addView(k9Var, b8.mf.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.x = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ql, e6Var);
        bVar.s = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ol, e6Var);
        bVar.w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Pl, e6Var);
        bVar.a();
        this.a = bVar;
        bVar.getBackupImageView().a.h1 = new a3(10);
        addView(this.a, b8.mf.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11 = this.c != null && (-this.b.id) == this.d.R2;
        this.a.f(z11, z10);
        ch0 B = this.a.getBackupImageView().getImageReceiver().B();
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
