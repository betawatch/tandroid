package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qz0 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public TextView a;
    public pz0 b;
    public TLRPC.TL_help_termsOfService c;
    public int d;

    public final void a() {
        pz0 pz0Var = this.b;
        int i10 = this.d;
        org.telegram.ui.n90 n90Var = (org.telegram.ui.n90) pz0Var;
        n90Var.getClass();
        org.telegram.messenger.e20.i(i10).Z = null;
        org.telegram.messenger.e20.i(i10).v(false);
        LaunchActivity launchActivity = n90Var.a;
        ArrayList arrayList = launchActivity.d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.messenger.i0.G).withEndAction(new org.telegram.ui.yy(n90Var, 18)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ag.c3(17));
    }

    public void setDelegate(pz0 pz0Var) {
        this.b = pz0Var;
    }
}
