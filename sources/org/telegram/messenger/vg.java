package org.telegram.messenger;

import android.media.SoundPool;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class vg implements SoundPool.OnLoadCompleteListener {
    public final /* synthetic */ int a;

    public /* synthetic */ vg(int i10) {
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
