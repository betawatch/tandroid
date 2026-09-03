package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class oc0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ bd0 a;

    public oc0(bd0 bd0Var) {
        this.a = bd0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        bd0 bd0Var = this.a;
        if (i10 == -1) {
            bd0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                bd0Var.s0(false);
                return;
            } else {
                if (i10 == 6) {
                    bd0Var.r0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = bd0Var.y0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            bd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
