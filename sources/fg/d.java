package fg;

import a3.g0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements RequestTimeDelegate {
    public final /* synthetic */ f a;
    public final /* synthetic */ e b;

    public /* synthetic */ d(f fVar, e eVar) {
        this.a = fVar;
        this.b = eVar;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new g0(this.a, this.b, j3, 8));
    }
}
