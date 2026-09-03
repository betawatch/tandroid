package o3;

import android.os.Handler;
import nh.n5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e implements o {
    public final m a;
    public j b;
    public boolean c;
    public final /* synthetic */ f d;

    public e(f fVar, m mVar) {
        this.d = fVar;
        this.a = mVar;
    }

    @Override // o3.o
    public final void release() {
        Handler handler = this.d.G;
        handler.getClass();
        h5.d0.K(handler, new n5(this, 14));
    }
}
