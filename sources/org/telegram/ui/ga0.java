package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
            if ((i7 == 2 || i7 == 3 || i7 == 4) && pa0Var.F != null) {
                pa0Var.D0();
                pa0Var.F.j(i7 != 3 ? i7 == 4 ? 2 : 0 : 1);
                return;
            }
            return;
        }
        try {
            TLRPC.GeoPoint geoPoint = pa0Var.J0.k.media.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            pa0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
