// default package

import android.app.Activity;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class nt7 extends mu1 {
    public final /* synthetic */ i8c vd;
    public final /* synthetic */ wt7 wd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt7(wt7 wt7Var, i8c i8cVar) {
        super(null);
        this.wd = wt7Var;
        this.vd = i8cVar;
    }

    @Override // mu1
    public final boolean O7() {
        return false;
    }

    @Override // mu1, sy1
    public final long a() {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mu1, ma6
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
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
            long j2 = tL_messageMediaVenue.query_id;
            if (j2 == -1 || j2 == -2) {
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint3 = new TL_stories.TL_mediaAreaGeoPoint();
                tL_mediaAreaGeoPoint3.geo = messageMedia.geo;
                TL_stories.TL_geoPointAddress tL_geoPointAddress = tL_messageMediaVenue.geoAddress;
                tL_mediaAreaGeoPoint3.address = tL_geoPointAddress;
                if (tL_geoPointAddress != null) {
                    tL_mediaAreaGeoPoint3.flags |= 1;
                }
                Utilities.e.c(new bj7(messageMedia, tL_mediaAreaGeoPoint3, (byte) 15));
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

    @Override // org.telegram.ui.ActionBar.d
    public final Activity getParentActivity() {
        return gl.W(this.wd.getContext());
    }

    @Override // mu1, org.telegram.ui.ActionBar.d
    public final wjb getResourceProvider() {
        return this.wd.w1;
    }

    @Override // mu1, sy1
    public final TLRPC.User h() {
        return y6c.h(this.currentAccount).f();
    }

    @Override // mu1, org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return false;
    }
}
