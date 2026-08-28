package org.telegram.messenger;

import android.media.SoundPool;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class wg implements SoundPool.OnLoadCompleteListener {
    public final /* synthetic */ int a;

    public /* synthetic */ wg(int i9) {
        this.a = i9;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(SoundPool soundPool, int i9, int i10) {
        switch (this.a) {
            case 0:
                NotificationsController.lambda$playOutChatSound$48(soundPool, i9, i10);
                break;
            default:
                NotificationsController.lambda$playInChatSound$39(soundPool, i9, i10);
                break;
        }
    }
}
