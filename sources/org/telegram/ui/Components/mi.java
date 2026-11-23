package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class mi extends oi {
    public TLRPC.User b;
    public TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ ti d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(ti tiVar, Context context) {
        super(context);
        this.d = tiVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i7 = ti.I4;
        org.telegram.ui.ActionBar.i6 i6Var = tiVar.J0;
        qh.b bVar = new qh.b(context);
        bVar.d = i6Var;
        bVar.R = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.b.setVisibility(8);
        bVar.b(false);
        p9 p9Var = new p9(context);
        bVar.c = p9Var;
        bVar.addView(p9Var, c8.na.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.x = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Tl, i6Var);
        bVar.s = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Rl, i6Var);
        bVar.w = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Sl, i6Var);
        bVar.a();
        this.a = bVar;
        bVar.getBackupImageView().a.h1 = new k2(18);
        addView(this.a, c8.na.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11 = this.c != null && (-this.b.id) == this.d.U2;
        this.a.f(z11, z10);
        nh0 C = this.a.getBackupImageView().getImageReceiver().C();
        if (!z10) {
            if (C != null) {
                C.stop();
                C.T(false, 0.0f);
                return;
            }
            return;
        }
        if (!z11 || C == null) {
            return;
        }
        C.K(0);
        C.P(-1);
        C.T(false, 0.0f);
        C.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
    }
}
