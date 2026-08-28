package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mz0 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public TextView a;
    public lz0 b;
    public TLRPC.TL_help_termsOfService c;
    public int d;

    public final void a() {
        lz0 lz0Var = this.b;
        int i9 = this.d;
        org.telegram.ui.ca0 ca0Var = (org.telegram.ui.ca0) lz0Var;
        ca0Var.getClass();
        UserConfig.getInstance(i9).unacceptedTermsOfService = null;
        UserConfig.getInstance(i9).saveConfig(false);
        LaunchActivity launchActivity = ca0Var.a;
        ArrayList arrayList = launchActivity.Z;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList)).onResume();
        }
        launchActivity.y0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.o00(ca0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ih.q5(13));
    }

    public void setDelegate(lz0 lz0Var) {
        this.b = lz0Var;
    }
}
