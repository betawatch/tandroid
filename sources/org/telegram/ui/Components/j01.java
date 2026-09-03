package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        org.telegram.ui.oa0 oa0Var = (org.telegram.ui.oa0) i01Var;
        oa0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = oa0Var.a;
        ArrayList arrayList = launchActivity.a0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.p2) l.d.i(1, arrayList)).onResume();
        }
        launchActivity.z0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.c10(oa0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new oh.p5(12));
    }

    public void setDelegate(i01 i01Var) {
        this.b = i01Var;
    }
}
