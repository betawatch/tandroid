package fi;

import android.app.Activity;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class d5 extends an {
    public final /* synthetic */ v10 rd;
    public final /* synthetic */ o5 sd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(o5 o5Var, v10 v10Var) {
        super(null);
        this.sd = o5Var;
        this.rd = v10Var;
    }

    @Override // org.telegram.ui.an
    public final boolean T9() {
        return false;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.Components.kg, org.telegram.ui.Components.b40
    public final long a() {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.an, org.telegram.ui.ma0
    public final void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
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
            long j10 = tL_messageMediaVenue.query_id;
            if (j10 == -1 || j10 == -2) {
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint3 = new TL_stories.TL_mediaAreaGeoPoint();
                tL_mediaAreaGeoPoint3.geo = messageMedia.geo;
                TL_stories.TL_geoPointAddress tL_geoPointAddress = tL_messageMediaVenue.geoAddress;
                tL_mediaAreaGeoPoint3.address = tL_geoPointAddress;
                if (tL_geoPointAddress != null) {
                    tL_mediaAreaGeoPoint3.flags |= 1;
                }
                Utilities.e.c(new f2.h(6, messageMedia, tL_mediaAreaGeoPoint3));
                tL_mediaAreaGeoPoint = tL_mediaAreaGeoPoint3;
            } else {
                TL_stories.TL_inputMediaAreaVenue tL_inputMediaAreaVenue = new TL_stories.TL_inputMediaAreaVenue();
                tL_inputMediaAreaVenue.query_id = tL_messageMediaVenue.query_id;
                tL_inputMediaAreaVenue.result_id = tL_messageMediaVenue.result_id;
                tL_mediaAreaGeoPoint = tL_inputMediaAreaVenue;
            }
            tL_mediaAreaGeoPoint2 = tL_mediaAreaGeoPoint;
        }
        this.rd.a(messageMedia, tL_mediaAreaGeoPoint2);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.sd.getContext());
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.sd.p1;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.an, org.telegram.ui.Components.kg
    public final TLRPC.User j() {
        return p10.i(this.currentAccount).f();
    }
}
