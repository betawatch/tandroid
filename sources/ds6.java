// default package

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ds6 extends MediaRouter2$RouteCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fs6 b;

    public /* synthetic */ ds6(fs6 fs6Var, byte b) {
        this.a = b;
        this.b = fs6Var;
    }

    public final void onRoutesAdded(List list) {
        switch (this.a) {
            case 0:
                this.b.q();
                break;
            default:
                super.onRoutesAdded(list);
                break;
        }
    }

    public final void onRoutesChanged(List list) {
        switch (this.a) {
            case 0:
                this.b.q();
                break;
            default:
                super.onRoutesChanged(list);
                break;
        }
    }

    public final void onRoutesRemoved(List list) {
        switch (this.a) {
            case 0:
                this.b.q();
                break;
            default:
                super.onRoutesRemoved(list);
                break;
        }
    }

    public final void onRoutesUpdated(List list) {
        switch (this.a) {
            case 1:
                this.b.q();
                break;
            default:
                super.onRoutesUpdated(list);
                break;
        }
    }
}
