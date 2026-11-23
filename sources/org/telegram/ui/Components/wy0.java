package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class wy0 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public TextView a;
    public vy0 b;
    public TLRPC.TL_help_termsOfService c;
    public int d;

    public final void a() {
        vy0 vy0Var = this.b;
        int i7 = this.d;
        org.telegram.ui.n80 n80Var = (org.telegram.ui.n80) vy0Var;
        n80Var.getClass();
        org.telegram.messenger.k10.i(i7).a0 = null;
        org.telegram.messenger.k10.i(i7).v(false);
        LaunchActivity launchActivity = n80Var.a;
        ArrayList arrayList = launchActivity.e0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList)).onResume();
        }
        launchActivity.B0.animate().alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.lz(n80Var, 17)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new fi.l5(22));
    }

    public void setDelegate(vy0 vy0Var) {
        this.b = vy0Var;
    }
}
