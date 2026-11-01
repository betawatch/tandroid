package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class lb0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ xb0 a;

    public lb0(xb0 xb0Var) {
        this.a = xb0Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        xb0 xb0Var = this.a;
        if (i10 == -1) {
            xb0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                xb0Var.E0(false);
                return;
            }
            if (i10 == 6) {
                xb0Var.D0(null);
                return;
            }
            if ((i10 == 2 || i10 == 3 || i10 == 4) && xb0Var.G != null) {
                xb0Var.F0();
                xb0Var.G.k(i10 != 3 ? i10 == 4 ? 2 : 0 : 1);
                return;
            }
            return;
        }
        try {
            TLRPC.GeoPoint geoPoint = xb0Var.J0.k.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            xb0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
