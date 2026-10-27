package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ec0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ rc0 a;

    public ec0(rc0 rc0Var) {
        this.a = rc0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        rc0 rc0Var = this.a;
        if (i10 == -1) {
            rc0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                rc0Var.t0(false);
                return;
            } else {
                if (i10 == 6) {
                    rc0Var.s0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = rc0Var.A0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
