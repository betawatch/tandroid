package org.telegram.messenger;

import android.media.SoundPool;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class ah implements SoundPool.OnLoadCompleteListener {
    public final /* synthetic */ int a;

    public /* synthetic */ ah(int i10) {
        this.a = i10;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
        switch (this.a) {
            case 0:
                NotificationsController.lambda$playInChatSound$40(soundPool, i10, i11);
                break;
            default:
                NotificationsController.lambda$playOutChatSound$49(soundPool, i10, i11);
                break;
        }
    }
}
