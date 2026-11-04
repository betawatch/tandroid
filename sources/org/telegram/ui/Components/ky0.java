package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ky0 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public TextView a;
    public jy0 b;
    public TLRPC.TL_help_termsOfService c;
    public int d;

    public final void a() {
        jy0 jy0Var = this.b;
        int i3 = this.d;
        org.telegram.ui.h80 h80Var = (org.telegram.ui.h80) jy0Var;
        h80Var.getClass();
        org.telegram.messenger.h10.i(i3).a0 = null;
        org.telegram.messenger.h10.i(i3).v(false);
        LaunchActivity launchActivity = h80Var.a;
        ArrayList arrayList = launchActivity.e0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList)).onResume();
        }
        launchActivity.D0.animate().alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.fz(h80Var, 17)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ei.u5(22));
    }

    public void setDelegate(jy0 jy0Var) {
        this.b = jy0Var;
    }
}
