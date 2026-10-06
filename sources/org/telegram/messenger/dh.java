package org.telegram.messenger;

import android.media.SoundPool;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final /* synthetic */ class dh implements SoundPool.OnLoadCompleteListener {
    public final /* synthetic */ int a;

    public /* synthetic */ dh(int i10) {
        this.a = i10;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
        switch (this.a) {
            case 0:
                NotificationsController.lambda$playOutChatSound$48(soundPool, i10, i11);
                break;
            default:
                NotificationsController.lambda$playInChatSound$39(soundPool, i10, i11);
                break;
        }
    }
}
