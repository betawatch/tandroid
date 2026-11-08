package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ga0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ pa0 a;

    public ga0(pa0 pa0Var) {
        this.a = pa0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        pa0 pa0Var = this.a;
        if (i7 == -1) {
            pa0Var.finishFragment();
            return;
        }
        if (i7 != 1) {
            if (i7 == 5) {
                pa0Var.C0(false);
                return;
            }
            if (i7 == 6) {
                pa0Var.B0(null);
                return;
            }
            if ((i7 == 2 || i7 == 3 || i7 == 4) && pa0Var.E != null) {
                pa0Var.D0();
                pa0Var.E.j(i7 != 3 ? i7 == 4 ? 2 : 0 : 1);
                return;
            }
            return;
        }
        try {
            TLRPC.GeoPoint geoPoint = pa0Var.D0.k.media.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            pa0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
