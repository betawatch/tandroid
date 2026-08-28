package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ SharedPreferences d;

    public /* synthetic */ c8(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i9) {
        this.a = i9;
        this.b = mediaDataController;
        this.c = tLObject;
        this.d = sharedPreferences;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadRestrictedStatusEmojis$245(this.c, this.d);
                break;
            default:
                this.b.lambda$loadReplyIcons$243(this.c, this.d);
                break;
        }
    }
}
