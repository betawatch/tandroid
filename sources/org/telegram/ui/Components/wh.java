package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class wh extends yh {
    public TLRPC.User b;
    public TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ di d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(di diVar, Context context) {
        super(context);
        this.d = diVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i7 = di.E4;
        org.telegram.ui.ActionBar.f6 f6Var = diVar.I0;
        qh.b bVar = new qh.b(context);
        bVar.d = f6Var;
        bVar.Q = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b.setVisibility(8);
        bVar.b(false);
        l9 l9Var = new l9(context);
        bVar.c = l9Var;
        bVar.addView(l9Var, c8.ha.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.x = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ql, f6Var);
        bVar.s = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ol, f6Var);
        bVar.w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Pl, f6Var);
        bVar.a();
        this.a = bVar;
        bVar.getBackupImageView().a.g1 = new k2(13);
        addView(this.a, c8.ha.c(-1.0f, -1));
    }

    public final void a(boolean z9) {
        boolean z10 = this.c != null && (-this.b.id) == this.d.Q2;
        this.a.f(z10, z9);
        zg0 B = this.a.getBackupImageView().getImageReceiver().B();
        if (!z9) {
            if (B != null) {
                B.stop();
                B.T(false, 0.0f);
                return;
            }
            return;
        }
        if (!z10 || B == null) {
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
