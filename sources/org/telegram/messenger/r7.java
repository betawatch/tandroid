package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class r7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ SharedPreferences c;

    public /* synthetic */ r7(MediaDataController mediaDataController, SharedPreferences sharedPreferences, int i10) {
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
