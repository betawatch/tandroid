package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ha0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ qa0 a;

    public ha0(qa0 qa0Var) {
        this.a = qa0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        qa0 qa0Var = this.a;
        if (i7 == -1) {
            qa0Var.finishFragment();
            return;
        }
        if (i7 != 1) {
            if (i7 == 5) {
                qa0Var.C0(false);
                return;
            }
            if (i7 == 6) {
                qa0Var.B0(null);
                return;
            }
            if ((i7 == 2 || i7 == 3 || i7 == 4) && qa0Var.F != null) {
                qa0Var.D0();
                qa0Var.F.j(i7 != 3 ? i7 == 4 ? 2 : 0 : 1);
                return;
            }
            return;
        }
        try {
            TLRPC.GeoPoint geoPoint = qa0Var.J0.k.media.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            qa0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
