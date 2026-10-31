package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mb0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ yb0 a;

    public mb0(yb0 yb0Var) {
        this.a = yb0Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        yb0 yb0Var = this.a;
        if (i10 == -1) {
            yb0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                yb0Var.D0(false);
                return;
            }
            if (i10 == 6) {
                yb0Var.C0(null);
                return;
            }
            if ((i10 == 2 || i10 == 3 || i10 == 4) && yb0Var.G != null) {
                yb0Var.E0();
                yb0Var.G.k(i10 != 3 ? i10 == 4 ? 2 : 0 : 1);
                return;
            }
            return;
        }
        try {
            TLRPC.GeoPoint geoPoint = yb0Var.J0.k.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            yb0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
