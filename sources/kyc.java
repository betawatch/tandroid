// default package

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.utils.twidget.x;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class kyc implements eo4 {
    public final /* synthetic */ Context a;

    public kyc(Context context) {
        this.a = context;
    }

    @Override // eo4
    public final void a() {
        x xVar = x.v;
        synchronized (xVar.a) {
            xVar.l = false;
        }
        xVar.b.removeCallbacks(xVar.u);
        xVar.b.postDelayed(xVar.u, 30000L);
    }

    @Override // eo4
    public final void b() {
        Utilities.e.c(new dh1(this.a, (byte) 29));
    }
}
