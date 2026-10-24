package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
