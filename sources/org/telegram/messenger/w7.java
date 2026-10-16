package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class w7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ SharedPreferences d;

    public /* synthetic */ w7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = tLObject;
        this.d = sharedPreferences;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadRestrictedStatusEmojis$246(this.c, this.d);
                break;
            default:
                this.b.lambda$loadReplyIcons$244(this.c, this.d);
                break;
        }
    }
}
