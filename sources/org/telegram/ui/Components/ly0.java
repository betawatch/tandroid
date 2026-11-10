package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ly0 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public TextView a;
    public ky0 b;
    public TLRPC.TL_help_termsOfService c;
    public int d;

    public final void a() {
        ky0 ky0Var = this.b;
        int i7 = this.d;
        org.telegram.ui.n80 n80Var = (org.telegram.ui.n80) ky0Var;
        n80Var.getClass();
        org.telegram.messenger.p10.i(i7).Z = null;
        org.telegram.messenger.p10.i(i7).v(false);
        LaunchActivity launchActivity = n80Var.a;
        ArrayList arrayList = launchActivity.d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList)).onResume();
        }
        launchActivity.A0.animate().alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.kz(n80Var, 17)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new di.v5(22));
    }

    public void setDelegate(ky0 ky0Var) {
        this.b = ky0Var;
    }
}
