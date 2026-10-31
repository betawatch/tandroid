package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pz0 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public TextView a;
    public oz0 b;
    public TLRPC.TL_help_termsOfService c;
    public int d;

    public final void a() {
        oz0 oz0Var = this.b;
        int i10 = this.d;
        org.telegram.ui.o90 o90Var = (org.telegram.ui.o90) oz0Var;
        o90Var.getClass();
        org.telegram.messenger.d20.i(i10).Z = null;
        org.telegram.messenger.d20.i(i10).v(false);
        LaunchActivity launchActivity = o90Var.a;
        ArrayList arrayList = launchActivity.d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.messenger.i0.G).withEndAction(new org.telegram.ui.zy(o90Var, 18)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ag.c3(17));
    }

    public void setDelegate(oz0 oz0Var) {
        this.b = oz0Var;
    }
}
