package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gi extends ii {
    public TLRPC.User b;
    public TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ ni d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(ni niVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        this.d = niVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        c6Var = ((org.telegram.ui.ActionBar.f3) niVar).resourcesProvider;
        zg.b bVar = new zg.b(context);
        bVar.d = c6Var;
        bVar.M = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.b.setVisibility(8);
        bVar.a(false);
        t9 t9Var = new t9(context);
        bVar.c = t9Var;
        bVar.addView(t9Var, i7.f6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.w = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.cl, c6Var);
        bVar.s = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.al, c6Var);
        bVar.v = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.bl, c6Var);
        bVar.f();
        this.a = bVar;
        bVar.getBackupImageView().a.setDelegate(new r2(6));
        addView(this.a, i7.f6.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11 = this.c != null && (-this.b.id) == this.d.S0;
        this.a.e(z11, z10);
        xi0 lottieAnimation = this.a.getBackupImageView().getImageReceiver().getLottieAnimation();
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
