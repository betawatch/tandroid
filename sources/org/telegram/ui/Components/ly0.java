package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        org.telegram.ui.k80 k80Var = (org.telegram.ui.k80) ky0Var;
        k80Var.getClass();
        org.telegram.messenger.p10.i(i7).Z = null;
        org.telegram.messenger.p10.i(i7).v(false);
        LaunchActivity launchActivity = k80Var.a;
        ArrayList arrayList = launchActivity.d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList)).onResume();
        }
        launchActivity.A0.animate().alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.hz(k80Var, 17)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new di.u5(22));
    }

    public void setDelegate(ky0 ky0Var) {
        this.b = ky0Var;
    }
}
