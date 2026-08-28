package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cc0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ pc0 a;

    public cc0(pc0 pc0Var) {
        this.a = pc0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        pc0 pc0Var = this.a;
        if (i9 == -1) {
            pc0Var.finishFragment();
            return;
        }
        if (i9 != 1) {
            if (i9 == 5) {
                pc0Var.r0(false);
                return;
            } else {
                if (i9 == 6) {
                    pc0Var.q0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = pc0Var.x0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d9 = geoPoint._long;
            pc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d9 + "?q=" + d + "," + d9)));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
