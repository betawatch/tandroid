// default package

import android.media.AudioManager;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
