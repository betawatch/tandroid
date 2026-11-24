// default package

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class jhc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ AudioManager c;

    public /* synthetic */ jhc(VoIPService voIPService, AudioManager audioManager, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = audioManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        AudioManager audioManager = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$configureDeviceForCall$107(audioManager);
                break;
            default:
                voIPService.lambda$configureDeviceForCall$108(audioManager);
                break;
        }
    }
}
