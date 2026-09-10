package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class l2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((FactCheckController) this.b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.c, (ArrayList) this.d, (HashMap) this.e, tLObject, tL_error);
                break;
            case 1:
                ((LocationController) this.b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.e, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.b).lambda$didReceivedNotification$45((org.telegram.ui.ActionBar.c6) this.c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.e, tLObject, tL_error);
                break;
            case 3:
                ((MessagesController) this.b).lambda$deleteUserChannelHistory$133((TLRPC.Chat) this.c, (TLRPC.User) this.d, (TLRPC.Chat) this.e, tLObject, tL_error);
                break;
            case 4:
                ((SecretChatHelper) this.b).lambda$startSecretChat$30((Context) this.c, (org.telegram.ui.ActionBar.d2) this.d, (TLRPC.User) this.e, tLObject, tL_error);
                break;
            default:
                ((SendMessagesHelper) this.b).lambda$sendVote$32((MessageObject) this.c, (String) this.d, (Runnable) this.e, tLObject, tL_error);
                break;
        }
    }
}
