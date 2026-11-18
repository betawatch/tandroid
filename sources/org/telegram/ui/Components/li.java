package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class li extends ni {
    public TLRPC.User b;
    public TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ si d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li(si siVar, Context context) {
        super(context);
        this.d = siVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i7 = si.I4;
        org.telegram.ui.ActionBar.i6 i6Var = siVar.J0;
        qh.b bVar = new qh.b(context);
        bVar.d = i6Var;
        bVar.R = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b.setVisibility(8);
        bVar.b(false);
        q9 q9Var = new q9(context);
        bVar.c = q9Var;
        bVar.addView(q9Var, c8.ma.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.x = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Tl, i6Var);
        bVar.s = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Rl, i6Var);
        bVar.w = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Sl, i6Var);
        bVar.a();
        this.a = bVar;
        bVar.getBackupImageView().a.h1 = new k2(18);
        addView(this.a, c8.ma.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11 = this.c != null && (-this.b.id) == this.d.U2;
        this.a.f(z11, z10);
        mh0 B = this.a.getBackupImageView().getImageReceiver().B();
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
