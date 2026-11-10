package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ja0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ sa0 a;

    public ja0(sa0 sa0Var) {
        this.a = sa0Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i7) {
        sa0 sa0Var = this.a;
        if (i7 == -1) {
            sa0Var.finishFragment();
            return;
        }
        if (i7 != 1) {
            if (i7 == 5) {
                sa0Var.C0(false);
                return;
            }
            if (i7 == 6) {
                sa0Var.B0(null);
                return;
            }
            if ((i7 == 2 || i7 == 3 || i7 == 4) && sa0Var.E != null) {
                sa0Var.D0();
                sa0Var.E.j(i7 != 3 ? i7 == 4 ? 2 : 0 : 1);
                return;
            }
            return;
        }
        try {
            TLRPC.GeoPoint geoPoint = sa0Var.D0.k.media.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            sa0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
