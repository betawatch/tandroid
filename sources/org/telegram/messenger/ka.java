package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ka implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ BaseController d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ka(BaseController baseController, Object obj, boolean z10, long j10, Object obj2, int i9) {
        this.a = i9;
        this.d = baseController;
        this.e = obj;
        this.b = z10;
        this.c = j10;
        this.f = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.d).lambda$getSendAsPeers$443((a0.h) this.e, this.c, (MessagesController.SendAsPeersInfo) this.f, this.b, tLObject, tL_error);
                break;
            case 1:
                TranslateController translateController = (TranslateController) this.d;
                TranslateController.PendingTranslation pendingTranslation = (TranslateController.PendingTranslation) this.e;
                Set set = (Set) this.f;
                translateController.lambda$pushToTranslate$23(pendingTranslation, this.b, this.c, set, tLObject, tL_error);
                break;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.c, this.b, (String) this.e, (Runnable) this.f, tLObject, tL_error);
                break;
            case 3:
                MemberRequestsController memberRequestsController = (MemberRequestsController) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                RequestDelegate requestDelegate = (RequestDelegate) this.f;
                memberRequestsController.lambda$getImporters$1(tL_chatInviteImporter, this.b, this.c, requestDelegate, tLObject, tL_error);
                break;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.b, this.c, (HashSet) this.e, (Runnable) this.f, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ ka(ChatThemeController chatThemeController, long j10, boolean z10, String str, Runnable runnable) {
        this.a = 2;
        this.d = chatThemeController;
        this.c = j10;
        this.b = z10;
        this.e = str;
        this.f = runnable;
    }

    public /* synthetic */ ka(MessagesController messagesController, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.a = 0;
        this.d = messagesController;
        this.e = hVar;
        this.c = j10;
        this.f = sendAsPeersInfo;
        this.b = z10;
    }

    public /* synthetic */ ka(TopicsController topicsController, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.a = 4;
        this.d = topicsController;
        this.b = z10;
        this.c = j10;
        this.e = hashSet;
        this.f = runnable;
    }
}
