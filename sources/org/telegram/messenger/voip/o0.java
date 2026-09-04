package org.telegram.messenger.voip;

import android.media.AudioManager;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ AudioManager c;

    public /* synthetic */ o0(VoIPService voIPService, AudioManager audioManager, int i10) {
        this.a = i10;
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
                this.b.lambda$configureDeviceForCall$110(this.c);
                break;
        }
    }
}
