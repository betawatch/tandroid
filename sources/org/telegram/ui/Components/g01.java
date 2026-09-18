package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class g01 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public TextView a;
    public f01 b;
    public TLRPC.TL_help_termsOfService c;
    public int d;

    public final void a() {
        f01 f01Var = this.b;
        int i10 = this.d;
        org.telegram.ui.za0 za0Var = (org.telegram.ui.za0) f01Var;
        za0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = za0Var.a;
        ArrayList arrayList = launchActivity.d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.o2) hg.k0.h(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.i10(za0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ai.t7(16));
    }

    public void setDelegate(f01 f01Var) {
        this.b = f01Var;
    }
}
