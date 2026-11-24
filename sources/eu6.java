// default package

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class eu6 extends MediaRouter2$RouteCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gu6 b;

    public /* synthetic */ eu6(gu6 gu6Var, byte b) {
        this.a = b;
        this.b = gu6Var;
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
