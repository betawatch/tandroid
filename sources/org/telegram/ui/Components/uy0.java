package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class uy0 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public TextView a;
    public ty0 b;
    public TLRPC.TL_help_termsOfService c;
    public int d;

    public final void a() {
        ty0 ty0Var = this.b;
        int i7 = this.d;
        org.telegram.ui.m80 m80Var = (org.telegram.ui.m80) ty0Var;
        m80Var.getClass();
        org.telegram.messenger.j10.i(i7).a0 = null;
        org.telegram.messenger.j10.i(i7).v(false);
        LaunchActivity launchActivity = m80Var.a;
        ArrayList arrayList = launchActivity.e0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList)).onResume();
        }
        launchActivity.B0.animate().alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.lz(m80Var, 17)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new fi.k5(22));
    }

    public void setDelegate(ty0 ty0Var) {
        this.b = ty0Var;
    }
}
