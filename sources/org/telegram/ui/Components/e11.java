package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class e11 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public TextView a;
    public d11 b;
    public TLRPC.TL_help_termsOfService c;
    public int d;

    public final void a() {
        d11 d11Var = this.b;
        int i10 = this.d;
        org.telegram.ui.va0 va0Var = (org.telegram.ui.va0) d11Var;
        va0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = va0Var.a;
        ArrayList arrayList = launchActivity.d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) hg.c.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.g10(va0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ai.u7(16));
    }

    public void setDelegate(d11 d11Var) {
        this.b = d11Var;
    }
}
