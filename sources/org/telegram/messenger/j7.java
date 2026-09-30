package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class j7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ SharedPreferences c;

    public /* synthetic */ j7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = sharedPreferences;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$loadSavedReactions$241(this.c, tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$loadReplyIcons$245(this.c, tLObject, tL_error);
                break;
            default:
                this.b.lambda$loadRestrictedStatusEmojis$247(this.c, tLObject, tL_error);
                break;
        }
    }
}
