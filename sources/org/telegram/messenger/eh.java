package org.telegram.messenger;

import android.media.SoundPool;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class eh implements SoundPool.OnLoadCompleteListener {
    public final /* synthetic */ int a;

    public /* synthetic */ eh(int i10) {
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
