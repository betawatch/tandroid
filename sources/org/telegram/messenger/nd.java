package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class nd implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ BaseController d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ nd(ChatThemeController chatThemeController, TLObject tLObject, long j10, boolean z4, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.e = tLObject;
        this.b = j10;
        this.c = z4;
        this.f = str;
        this.h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.d).lambda$getSendAsPeers$442((TLRPC.TL_channels_sendAsPeers) this.e, (a0.h) this.f, this.b, (MessagesController.SendAsPeersInfo) this.h, this.c);
                break;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.e, this.b, (TranslateController.PendingTranslation) this.f, this.c, (Set) this.h);
                break;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.e, this.b, this.c, (String) this.f, (Runnable) this.h);
                break;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.e, this.c, this.b, (HashSet) this.f, (Runnable) this.h);
                break;
        }
    }

    public /* synthetic */ nd(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z4) {
        this.d = messagesController;
        this.e = tL_channels_sendAsPeers;
        this.f = hVar;
        this.b = j10;
        this.h = sendAsPeersInfo;
        this.c = z4;
    }

    public /* synthetic */ nd(TopicsController topicsController, TLObject tLObject, boolean z4, long j10, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.e = tLObject;
        this.c = z4;
        this.b = j10;
        this.f = hashSet;
        this.h = runnable;
    }

    public /* synthetic */ nd(TranslateController translateController, HashMap hashMap, long j10, TranslateController.PendingTranslation pendingTranslation, boolean z4, Set set) {
        this.d = translateController;
        this.e = hashMap;
        this.b = j10;
        this.f = pendingTranslation;
        this.c = z4;
        this.h = set;
    }
}
