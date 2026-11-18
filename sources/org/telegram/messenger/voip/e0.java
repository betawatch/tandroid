package org.telegram.messenger.voip;

import android.media.AudioManager;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ AudioManager c;

    public /* synthetic */ e0(VoIPService voIPService, AudioManager audioManager, int i7) {
        this.a = i7;
        this.b = voIPService;
        this.c = audioManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$configureDeviceForCall$111(this.c);
                break;
            default:
                this.b.lambda$configureDeviceForCall$112(this.c);
                break;
        }
    }
}
