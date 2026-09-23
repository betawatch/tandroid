package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class qc0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ dd0 a;

    public qc0(dd0 dd0Var) {
        this.a = dd0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        dd0 dd0Var = this.a;
        if (i10 == -1) {
            dd0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                dd0Var.s0(false);
                return;
            } else {
                if (i10 == 6) {
                    dd0Var.r0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = dd0Var.B0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            dd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
