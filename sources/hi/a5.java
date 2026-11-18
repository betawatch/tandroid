package hi;

import android.app.Activity;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j10;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class a5 extends bn {
    public final /* synthetic */ q10 vd;
    public final /* synthetic */ l5 wd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(l5 l5Var, q10 q10Var) {
        super(null);
        this.wd = l5Var;
        this.vd = q10Var;
    }

    @Override // org.telegram.ui.bn
    public final boolean V9() {
        return false;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.Components.zg, org.telegram.ui.Components.m40
    public final long a() {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.bn, org.telegram.ui.na0
    public final void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
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
                Utilities.e.c(new r1(3, messageMedia, tL_mediaAreaGeoPoint3));
                tL_mediaAreaGeoPoint = tL_mediaAreaGeoPoint3;
            } else {
                TL_stories.TL_inputMediaAreaVenue tL_inputMediaAreaVenue = new TL_stories.TL_inputMediaAreaVenue();
                tL_inputMediaAreaVenue.query_id = tL_messageMediaVenue.query_id;
                tL_inputMediaAreaVenue.result_id = tL_messageMediaVenue.result_id;
                tL_mediaAreaGeoPoint = tL_inputMediaAreaVenue;
            }
            tL_mediaAreaGeoPoint2 = tL_mediaAreaGeoPoint;
        }
        this.vd.a(messageMedia, tL_mediaAreaGeoPoint2);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.wd.getContext());
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return this.wd.q1;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.h2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.bn, org.telegram.ui.Components.zg
    public final TLRPC.User j() {
        return j10.i(this.currentAccount).f();
    }
}
