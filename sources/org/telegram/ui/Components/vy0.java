package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class vy0 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public TextView a;
    public uy0 b;
    public TLRPC.TL_help_termsOfService c;
    public int d;

    public final void a() {
        uy0 uy0Var = this.b;
        int i7 = this.d;
        org.telegram.ui.m80 m80Var = (org.telegram.ui.m80) uy0Var;
        m80Var.getClass();
        org.telegram.messenger.i10.i(i7).a0 = null;
        org.telegram.messenger.i10.i(i7).v(false);
        LaunchActivity launchActivity = m80Var.a;
        ArrayList arrayList = launchActivity.e0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList)).onResume();
        }
        launchActivity.B0.animate().alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.kz(m80Var, 17)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.id = this.c.id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new fi.l5(22));
    }

    public void setDelegate(uy0 uy0Var) {
        this.b = uy0Var;
    }
}
