// default package

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class llc implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ long c;
    public final /* synthetic */ HashSet d;
    public final /* synthetic */ AtomicInteger e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;

    public /* synthetic */ llc(VoIPService voIPService, long j, HashSet hashSet, AtomicInteger atomicInteger, int i, String str, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = j;
        this.d = hashSet;
        this.e = atomicInteger;
        this.f = i;
        this.g = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$startConferenceGroupCall$54(this.c, this.d, this.e, this.f, this.g, tLObject, tL_error);
                break;
            default:
                this.b.lambda$startConferenceGroupCall$46(this.c, this.d, this.e, this.f, this.g, tLObject, tL_error);
                break;
        }
    }
}
