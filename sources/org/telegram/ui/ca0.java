package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ca0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ la0 a;

    public ca0(la0 la0Var) {
        this.a = la0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        la0 la0Var = this.a;
        if (i3 == -1) {
            la0Var.finishFragment();
            return;
        }
        if (i3 != 1) {
            if (i3 == 5) {
                la0Var.C0(false);
                return;
            }
            if (i3 == 6) {
                la0Var.B0(null);
                return;
            }
            if ((i3 == 2 || i3 == 3 || i3 == 4) && la0Var.F != null) {
                la0Var.D0();
                la0Var.F.j(i3 != 3 ? i3 == 4 ? 2 : 0 : 1);
                return;
            }
            return;
        }
        try {
            TLRPC.GeoPoint geoPoint = la0Var.E0.k.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            la0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
