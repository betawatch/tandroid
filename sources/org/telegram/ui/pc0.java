package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pc0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ cd0 a;

    public pc0(cd0 cd0Var) {
        this.a = cd0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        cd0 cd0Var = this.a;
        if (i10 == -1) {
            cd0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                cd0Var.s0(false);
                return;
            } else {
                if (i10 == 6) {
                    cd0Var.r0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = cd0Var.y0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            cd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
