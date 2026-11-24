// default package

import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ojc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ HashSet c;
    public final /* synthetic */ String d;

    public /* synthetic */ ojc(VoIPService voIPService, HashSet hashSet, String str, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = hashSet;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.d;
        HashSet hashSet = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$startConferenceGroupCall$53(hashSet, str);
                break;
            default:
                voIPService.lambda$startConferenceGroupCall$45(hashSet, str);
                break;
        }
    }
}
