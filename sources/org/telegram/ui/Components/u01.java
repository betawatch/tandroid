package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class u01 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public TextView a;
    public t01 b;
    public TLRPC.TL_help_termsOfService c;
    public int d;

    public final void a() {
        t01 t01Var = this.b;
        int i10 = this.d;
        org.telegram.ui.ra0 ra0Var = (org.telegram.ui.ra0) t01Var;
        ra0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = ra0Var.a;
        ArrayList arrayList = launchActivity.d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.m2) hg.c.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.c10(ra0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ai.u7(16));
    }

    public void setDelegate(t01 t01Var) {
        this.b = t01Var;
    }
}
