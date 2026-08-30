package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class nc0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ad0 a;

    public nc0(ad0 ad0Var) {
        this.a = ad0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        ad0 ad0Var = this.a;
        if (i10 == -1) {
            ad0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                ad0Var.s0(false);
                return;
            } else {
                if (i10 == 6) {
                    ad0Var.r0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = ad0Var.y0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            ad0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
