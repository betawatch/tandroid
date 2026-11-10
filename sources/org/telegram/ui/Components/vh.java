package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class vh extends xh {
    public TLRPC.User b;
    public TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ ci d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh(ci ciVar, Context context) {
        super(context);
        this.d = ciVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i7 = ci.H4;
        org.telegram.ui.ActionBar.h6 h6Var = ciVar.I0;
        qh.b bVar = new qh.b(context);
        bVar.d = h6Var;
        bVar.Q = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b.setVisibility(8);
        bVar.b(false);
        k9 k9Var = new k9(context);
        bVar.c = k9Var;
        bVar.addView(k9Var, c8.ha.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.x = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ql, h6Var);
        bVar.s = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ol, h6Var);
        bVar.w = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Pl, h6Var);
        bVar.a();
        this.a = bVar;
        bVar.getBackupImageView().a.g1 = new j2(13);
        addView(this.a, c8.ha.c(-1.0f, -1));
    }

    public final void a(boolean z9) {
        boolean z10 = this.c != null && (-this.b.id) == this.d.T2;
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
