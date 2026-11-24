// default package

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ijc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ ijc(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, byte b) {
        this.a = b;
        this.b = tLObject;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$51(this.b, this.c, this.d, this.e);
                break;
            default:
                VoIPService.lambda$startConferenceGroupCall$43(this.b, this.c, this.d, this.e);
                break;
        }
    }
}
