package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class oi extends qi {
    public TLRPC.User b;
    public TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ vi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(vi viVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        this.d = viVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        e6Var = ((org.telegram.ui.ActionBar.f3) viVar).resourcesProvider;
        oh.b bVar = new oh.b(context);
        bVar.d = e6Var;
        bVar.Q = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.b.setVisibility(8);
        bVar.a(false);
        u9 u9Var = new u9(context);
        bVar.c = u9Var;
        bVar.addView(u9Var, w7.x5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.w = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.cl, e6Var);
        bVar.s = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.al, e6Var);
        bVar.v = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.bl, e6Var);
        bVar.f();
        this.a = bVar;
        bVar.getBackupImageView().a.setDelegate(new o2(9));
        addView(this.a, w7.x5.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11 = this.c != null && (-this.b.id) == this.d.W0;
        this.a.e(z11, z10);
        xi0 lottieAnimation = this.a.getBackupImageView().getImageReceiver().getLottieAnimation();
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
