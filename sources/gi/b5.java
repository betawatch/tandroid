package gi;

import android.app.Activity;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.h10;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b5 extends wm {
    public final /* synthetic */ n10 sd;
    public final /* synthetic */ m5 td;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(m5 m5Var, n10 n10Var) {
        super(null);
        this.td = m5Var;
        this.sd = n10Var;
    }

    @Override // org.telegram.ui.wm
    public final boolean T9() {
        return false;
    }

    @Override // org.telegram.ui.wm, org.telegram.ui.Components.ig, org.telegram.ui.Components.x30
    public final long a() {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.wm, org.telegram.ui.ia0
    public final void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint;
        TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint2;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            tL_mediaAreaGeoPoint2 = new TL_stories.TL_mediaAreaGeoPoint();
            tL_mediaAreaGeoPoint2.geo = messageMedia.geo;
        } else {
            if (!(messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                return;
            }
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) messageMedia;
            long j11 = tL_messageMediaVenue.query_id;
            if (j11 == -1 || j11 == -2) {
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint3 = new TL_stories.TL_mediaAreaGeoPoint();
                tL_mediaAreaGeoPoint3.geo = messageMedia.geo;
                TL_stories.TL_geoPointAddress tL_geoPointAddress = tL_messageMediaVenue.geoAddress;
                tL_mediaAreaGeoPoint3.address = tL_geoPointAddress;
                if (tL_geoPointAddress != null) {
                    tL_mediaAreaGeoPoint3.flags |= 1;
                }
                Utilities.e.c(new g2.c(12, messageMedia, tL_mediaAreaGeoPoint3));
                tL_mediaAreaGeoPoint = tL_mediaAreaGeoPoint3;
            } else {
                TL_stories.TL_inputMediaAreaVenue tL_inputMediaAreaVenue = new TL_stories.TL_inputMediaAreaVenue();
                tL_inputMediaAreaVenue.query_id = tL_messageMediaVenue.query_id;
                tL_inputMediaAreaVenue.result_id = tL_messageMediaVenue.result_id;
                tL_mediaAreaGeoPoint = tL_inputMediaAreaVenue;
            }
            tL_mediaAreaGeoPoint2 = tL_mediaAreaGeoPoint;
        }
        this.sd.a(messageMedia, tL_mediaAreaGeoPoint2);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.td.getContext());
    }

    @Override // org.telegram.ui.wm, org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.td.q1;
    }

    @Override // org.telegram.ui.wm, org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.wm, org.telegram.ui.Components.ig
    public final TLRPC.User j() {
        return h10.i(this.currentAccount).f();
    }
}
