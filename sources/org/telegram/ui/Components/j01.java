package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j01 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public TextView a;
    public i01 b;
    public TLRPC.TL_help_termsOfService c;
    public int d;

    public final void a() {
        i01 i01Var = this.b;
        int i10 = this.d;
        org.telegram.ui.na0 na0Var = (org.telegram.ui.na0) i01Var;
        na0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = na0Var.a;
        ArrayList arrayList = launchActivity.a0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.p2) kh.a2.i(1, arrayList)).onResume();
        }
        launchActivity.z0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.c10(na0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new nh.p5(12));
    }

    public void setDelegate(i01 i01Var) {
        this.b = i01Var;
    }
}
