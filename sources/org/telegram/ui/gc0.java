package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gc0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ tc0 a;

    public gc0(tc0 tc0Var) {
        this.a = tc0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        tc0 tc0Var = this.a;
        if (i10 == -1) {
            tc0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                tc0Var.s0(false);
                return;
            } else {
                if (i10 == 6) {
                    tc0Var.r0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = tc0Var.x0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            tc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
