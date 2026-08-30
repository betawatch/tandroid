package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ei extends gi {
    public TLRPC.User b;
    public TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ li d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei(li liVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.d = liVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        f6Var = ((org.telegram.ui.ActionBar.g3) liVar).resourcesProvider;
        bh.b bVar = new bh.b(context);
        bVar.d = f6Var;
        bVar.N = true;
        TextView textView = bVar.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.b.setVisibility(8);
        bVar.a(false);
        p9 p9Var = new p9(context);
        bVar.c = p9Var;
        bVar.addView(p9Var, k7.b6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, f6Var);
        bVar.s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, f6Var);
        bVar.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bl, f6Var);
        bVar.f();
        this.a = bVar;
        bVar.getBackupImageView().a.setDelegate(new k2(11));
        addView(this.a, k7.b6.c(-1.0f, -1));
    }

    public final void a(boolean z4) {
        boolean z10 = this.c != null && (-this.b.id) == this.d.T0;
        this.a.e(z10, z4);
        gj0 lottieAnimation = this.a.getBackupImageView().getImageReceiver().getLottieAnimation();
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
