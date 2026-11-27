// default package

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class amc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ AudioManager c;

    public /* synthetic */ amc(VoIPService voIPService, AudioManager audioManager, byte b) {
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
                voIPService.lambda$configureDeviceForCall$108(audioManager);
                break;
            default:
                voIPService.lambda$configureDeviceForCall$109(audioManager);
                break;
        }
    }
}
