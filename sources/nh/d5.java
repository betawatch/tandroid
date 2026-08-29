package nh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class d5 extends tn {
    public final /* synthetic */ Utilities.Callback2 Mc;
    public final /* synthetic */ t5 Nc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(t5 t5Var, Utilities.Callback2 callback2) {
        super(null);
        this.Nc = t5Var;
        this.Mc = callback2;
    }

    @Override // org.telegram.ui.tn, org.telegram.ui.Components.ug, org.telegram.ui.Components.l50
    public final long a() {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.tn, org.telegram.ui.mc0
    public final void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
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
                Utilities.globalQueue.postRunnable(new lh.r3(29, messageMedia, tL_mediaAreaGeoPoint3));
                tL_mediaAreaGeoPoint = tL_mediaAreaGeoPoint3;
            } else {
                TL_stories.TL_inputMediaAreaVenue tL_inputMediaAreaVenue = new TL_stories.TL_inputMediaAreaVenue();
                tL_inputMediaAreaVenue.query_id = tL_messageMediaVenue.query_id;
                tL_inputMediaAreaVenue.result_id = tL_messageMediaVenue.result_id;
                tL_mediaAreaGeoPoint = tL_inputMediaAreaVenue;
            }
            tL_mediaAreaGeoPoint2 = tL_mediaAreaGeoPoint;
        }
        this.Mc.run(messageMedia, tL_mediaAreaGeoPoint2);
    }

    @Override // org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.l50
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Nc.getContext());
    }

    @Override // org.telegram.ui.tn, org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.Nc.C1;
    }

    @Override // org.telegram.ui.tn, org.telegram.ui.Components.ug
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.tn, org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.tn
    public final boolean x9() {
        return false;
    }
}
