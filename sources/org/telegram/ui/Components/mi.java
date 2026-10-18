package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class mi extends oi {
    public TLRPC.User b;
    public TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ ti d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(ti tiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        this.d = tiVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        d6Var = ((org.telegram.ui.ActionBar.f3) tiVar).resourcesProvider;
        ph.b bVar = new ph.b(context);
        bVar.d = d6Var;
        bVar.Q = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.b.setVisibility(8);
        bVar.a(false);
        w9 w9Var = new w9(context);
        bVar.c = w9Var;
        bVar.addView(w9Var, w7.z5.a(24.0f, 0.0f, 4.0f, 0.0f, 0.0f, 24, 49));
        bVar.w = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.cl, d6Var);
        bVar.s = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.al, d6Var);
        bVar.v = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.bl, d6Var);
        bVar.f();
        this.a = bVar;
        bVar.getBackupImageView().a.setDelegate(new k2(12));
        addView(this.a, w7.z5.d(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11 = this.c != null && (-this.b.id) == this.d.Z0;
        this.a.e(z11, z10);
        uj0 lottieAnimation = this.a.getBackupImageView().getImageReceiver().getLottieAnimation();
        if (!z10) {
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                lottieAnimation.T(0.0f, false);
                return;
            }
            return;
        }
        if (!z11 || lottieAnimation == null) {
            return;
        }
        lottieAnimation.K(0);
        lottieAnimation.P(-1);
        lottieAnimation.T(0.0f, false);
        lottieAnimation.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
    }
}
