package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ec0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ rc0 a;

    public ec0(rc0 rc0Var) {
        this.a = rc0Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        rc0 rc0Var = this.a;
        if (i10 == -1) {
            rc0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                rc0Var.s0(false);
                return;
            } else {
                if (i10 == 6) {
                    rc0Var.r0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = rc0Var.x0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
