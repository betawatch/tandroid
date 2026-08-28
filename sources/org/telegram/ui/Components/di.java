package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class di extends fi {
    public TLRPC.User b;
    public TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ ki d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(ki kiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b6 b6Var;
        this.d = kiVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        b6Var = ((org.telegram.ui.ActionBar.f3) kiVar).resourcesProvider;
        wg.b bVar = new wg.b(context);
        bVar.d = b6Var;
        bVar.M = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.b.setVisibility(8);
        bVar.a(false);
        o9 o9Var = new o9(context);
        bVar.c = o9Var;
        bVar.addView(o9Var, g7.e6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.w = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.cl, b6Var);
        bVar.s = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.al, b6Var);
        bVar.v = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.bl, b6Var);
        bVar.f();
        this.a = bVar;
        bVar.getBackupImageView().a.setDelegate(new g2(12));
        addView(this.a, g7.e6.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11 = this.c != null && (-this.b.id) == this.d.S0;
        this.a.e(z11, z10);
        mi0 lottieAnimation = this.a.getBackupImageView().getImageReceiver().getLottieAnimation();
        if (!z10) {
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                lottieAnimation.Q(0.0f, false);
                return;
            }
            return;
        }
        if (!z11 || lottieAnimation == null) {
            return;
        }
        lottieAnimation.I(0);
        lottieAnimation.N(-1);
        lottieAnimation.Q(0.0f, false);
        lottieAnimation.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
    }
}
