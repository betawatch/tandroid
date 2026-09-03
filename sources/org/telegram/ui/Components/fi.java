package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class fi extends hi {
    public TLRPC.User b;
    public TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ mi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(mi miVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        this.d = miVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        g6Var = ((org.telegram.ui.ActionBar.h3) miVar).resourcesProvider;
        ch.b bVar = new ch.b(context);
        bVar.d = g6Var;
        bVar.N = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.b.setVisibility(8);
        bVar.a(false);
        p9 p9Var = new p9(context);
        bVar.c = p9Var;
        bVar.addView(p9Var, k7.c6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.w = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.cl, g6Var);
        bVar.s = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.al, g6Var);
        bVar.v = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.bl, g6Var);
        bVar.f();
        this.a = bVar;
        bVar.getBackupImageView().a.setDelegate(new k2(11));
        addView(this.a, k7.c6.c(-1.0f, -1));
    }

    public final void a(boolean z4) {
        boolean z10 = this.c != null && (-this.b.id) == this.d.T0;
        this.a.e(z10, z4);
        hj0 lottieAnimation = this.a.getBackupImageView().getImageReceiver().getLottieAnimation();
        if (!z4) {
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                lottieAnimation.Q(0.0f, false);
                return;
            }
            return;
        }
        if (!z10 || lottieAnimation == null) {
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
