package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final /* synthetic */ class t7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ SharedPreferences d;

    public /* synthetic */ t7(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, int i10) {
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
