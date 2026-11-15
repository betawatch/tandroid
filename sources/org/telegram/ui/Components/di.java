package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class di extends fi {
    public TLRPC.User b;
    public TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ ki d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(ki kiVar, Context context) {
        super(context);
        this.d = kiVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i7 = ki.I4;
        org.telegram.ui.ActionBar.e6 e6Var = kiVar.J0;
        qh.b bVar = new qh.b(context);
        bVar.d = e6Var;
        bVar.R = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b.setVisibility(8);
        bVar.b(false);
        i9 i9Var = new i9(context);
        bVar.c = i9Var;
        bVar.addView(i9Var, c8.ja.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.x = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Tl, e6Var);
        bVar.s = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Rl, e6Var);
        bVar.w = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Sl, e6Var);
        bVar.a();
        this.a = bVar;
        bVar.getBackupImageView().a.h1 = new e2(17);
        addView(this.a, c8.ja.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11 = this.c != null && (-this.b.id) == this.d.U2;
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
