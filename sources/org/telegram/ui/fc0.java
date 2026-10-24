package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class fc0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ sc0 a;

    public fc0(sc0 sc0Var) {
        this.a = sc0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        sc0 sc0Var = this.a;
        if (i10 == -1) {
            sc0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                sc0Var.s0(false);
                return;
            } else {
                if (i10 == 6) {
                    sc0Var.r0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = sc0Var.B0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            sc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
