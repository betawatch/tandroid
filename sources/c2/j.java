package c2;

import android.media.MediaRouter2;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j extends MediaRouter2.RouteCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ j(l lVar, int i9) {
        this.a = i9;
        this.b = lVar;
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public void onRoutesAdded(List list) {
        switch (this.a) {
            case 0:
                this.b.q();
                break;
            default:
                super.onRoutesAdded(list);
                break;
        }
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public void onRoutesChanged(List list) {
        switch (this.a) {
            case 0:
                this.b.q();
                break;
            default:
                super.onRoutesChanged(list);
                break;
        }
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public void onRoutesRemoved(List list) {
        switch (this.a) {
            case 0:
                this.b.q();
                break;
            default:
                super.onRoutesRemoved(list);
                break;
        }
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public void onRoutesUpdated(List list) {
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
