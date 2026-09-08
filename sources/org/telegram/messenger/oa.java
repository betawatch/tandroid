package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class oa implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ BaseController d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ oa(BaseController baseController, Object obj, boolean z10, long j3, Object obj2, int i10) {
        this.a = i10;
        this.d = baseController;
        this.e = obj;
        this.b = z10;
        this.c = j3;
        this.f = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.d).lambda$getSendAsPeers$443((a0.i) this.e, this.c, (MessagesController.SendAsPeersInfo) this.f, this.b, tLObject, tL_error);
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

    public /* synthetic */ oa(ChatThemeController chatThemeController, long j3, boolean z10, String str, Runnable runnable) {
        this.a = 2;
        this.d = chatThemeController;
        this.c = j3;
        this.b = z10;
        this.e = str;
        this.f = runnable;
    }

    public /* synthetic */ oa(MessagesController messagesController, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.a = 0;
        this.d = messagesController;
        this.e = iVar;
        this.c = j3;
        this.f = sendAsPeersInfo;
        this.b = z10;
    }

    public /* synthetic */ oa(TopicsController topicsController, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.a = 4;
        this.d = topicsController;
        this.b = z10;
        this.c = j3;
        this.e = hashSet;
        this.f = runnable;
    }
}
