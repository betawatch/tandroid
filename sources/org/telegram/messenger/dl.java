package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class dl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ long h;

    public /* synthetic */ dl(TopicsController topicsController, TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        this.a = 2;
        this.b = topicsController;
        this.c = tLObject;
        this.h = j3;
        this.d = tL_messages_forumTopics;
        this.e = iVar;
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((TranslateController) this.b).lambda$translatePhoto$43((MessageObject) this.c, (String) this.d, (TranslateController.MessageKey) this.e, this.f, this.h);
                break;
            case 1:
                ((TranslateController) this.b).lambda$translatePhoto$45((MessageObject) this.c, (String) this.d, (TranslateController.MessageKey) this.e, this.f, this.h);
                break;
            default:
                ((TopicsController) this.b).lambda$reloadTopics$14((TLObject) this.c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.i) this.e, this.f);
                break;
        }
    }

    public /* synthetic */ dl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, int i10) {
        this.a = i10;
        this.b = translateController;
        this.c = messageObject;
        this.d = str;
        this.e = messageKey;
        this.f = runnable;
        this.h = j3;
    }
}
