package ni;

import a3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements RequestTimeDelegate {
    public final /* synthetic */ f a;
    public final /* synthetic */ e b;

    public /* synthetic */ d(f fVar, e eVar) {
        this.a = fVar;
        this.b = eVar;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j3) {
        AndroidUtilities.runOnUIThread(new h0(this.a, this.b, j3, 9));
    }
}
