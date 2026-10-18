package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class cc0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ pc0 a;

    public cc0(pc0 pc0Var) {
        this.a = pc0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        pc0 pc0Var = this.a;
        if (i10 == -1) {
            pc0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                pc0Var.r0(false);
                return;
            } else {
                if (i10 == 6) {
                    pc0Var.q0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = pc0Var.B0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            pc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
