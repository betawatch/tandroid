package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class oz0 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public TextView a;
    public nz0 b;
    public TLRPC.TL_help_termsOfService c;
    public int d;

    public final void a() {
        nz0 nz0Var = this.b;
        int i10 = this.d;
        org.telegram.ui.ga0 ga0Var = (org.telegram.ui.ga0) nz0Var;
        ga0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = ga0Var.a;
        ArrayList arrayList = launchActivity.Z;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList)).onResume();
        }
        launchActivity.y0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.r00(ga0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new jh.m5(13));
    }

    public void setDelegate(nz0 nz0Var) {
        this.b = nz0Var;
    }
}
