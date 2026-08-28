package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class t6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ SharedPreferences c;

    public /* synthetic */ t6(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i9) {
        this.a = i9;
        this.b = mediaDataController;
        this.c = sharedPreferences;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$loadRestrictedStatusEmojis$246(this.c, tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$loadSavedReactions$240(this.c, tLObject, tL_error);
                break;
            default:
                this.b.lambda$loadReplyIcons$244(this.c, tLObject, tL_error);
                break;
        }
    }
}
