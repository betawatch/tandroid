// default package

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class hjc implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ long c;
    public final /* synthetic */ HashSet d;
    public final /* synthetic */ AtomicInteger e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;

    public /* synthetic */ hjc(VoIPService voIPService, long j, HashSet hashSet, AtomicInteger atomicInteger, int i, String str, byte b) {
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
