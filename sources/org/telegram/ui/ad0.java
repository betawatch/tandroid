package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ad0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ nd0 a;

    public ad0(nd0 nd0Var) {
        this.a = nd0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        nd0 nd0Var = this.a;
        if (i10 == -1) {
            nd0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                nd0Var.r0(false);
                return;
            } else {
                if (i10 == 6) {
                    nd0Var.q0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = nd0Var.B0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            nd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
