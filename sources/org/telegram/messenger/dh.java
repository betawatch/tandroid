package org.telegram.messenger;

import android.media.SoundPool;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
