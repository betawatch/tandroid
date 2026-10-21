package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class ac0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ nc0 a;

    public ac0(nc0 nc0Var) {
        this.a = nc0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        nc0 nc0Var = this.a;
        if (i10 == -1) {
            nc0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                nc0Var.r0(false);
                return;
            } else {
                if (i10 == 6) {
                    nc0Var.q0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = nc0Var.B0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            nc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
