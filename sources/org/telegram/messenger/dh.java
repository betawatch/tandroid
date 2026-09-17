package org.telegram.messenger;

import android.media.SoundPool;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
