package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yz0 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public TextView a;
    public xz0 b;
    public TLRPC.TL_help_termsOfService c;
    public int d;

    public final void a() {
        xz0 xz0Var = this.b;
        int i10 = this.d;
        org.telegram.ui.fa0 fa0Var = (org.telegram.ui.fa0) xz0Var;
        fa0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = fa0Var.a;
        ArrayList arrayList = launchActivity.Z;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList)).onResume();
        }
        launchActivity.y0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.q00(fa0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new lh.o5(13));
    }

    public void setDelegate(xz0 xz0Var) {
        this.b = xz0Var;
    }
}
