package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ia0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ra0 a;

    public ia0(ra0 ra0Var) {
        this.a = ra0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        ra0 ra0Var = this.a;
        if (i7 == -1) {
            ra0Var.finishFragment();
            return;
        }
        if (i7 != 1) {
            if (i7 == 5) {
                ra0Var.C0(false);
                return;
            }
            if (i7 == 6) {
                ra0Var.B0(null);
                return;
            }
            if ((i7 == 2 || i7 == 3 || i7 == 4) && ra0Var.E != null) {
                ra0Var.D0();
                ra0Var.E.j(i7 != 3 ? i7 == 4 ? 2 : 0 : 1);
                return;
            }
            return;
        }
        try {
            TLRPC.GeoPoint geoPoint = ra0Var.D0.k.media.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            ra0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
