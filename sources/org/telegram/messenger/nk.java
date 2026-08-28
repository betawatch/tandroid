package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class nk implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ BaseController d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ nk(long j10, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.e = pendingTranslation;
        this.f = tLObject;
        this.b = z10;
        this.h = tL_error;
        this.c = j10;
        this.n = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TranslateController translateController = (TranslateController) this.d;
                TranslateController.PendingTranslation pendingTranslation = (TranslateController.PendingTranslation) this.e;
                TLObject tLObject = (TLObject) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                Set set = (Set) this.n;
                translateController.lambda$pushToTranslate$22(pendingTranslation, tLObject, this.b, tL_error, this.c, set);
                break;
            case 1:
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.e, this.b, (ArrayList) this.f, (ArrayList) this.h, (a0.h) this.n, this.c);
                break;
            default:
                MemberRequestsController memberRequestsController = (MemberRequestsController) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                TLObject tLObject2 = (TLObject) this.f;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                RequestDelegate requestDelegate = (RequestDelegate) this.n;
                memberRequestsController.lambda$getImporters$0(tL_error2, tLObject2, tL_chatInviteImporter, this.b, this.c, requestDelegate);
                break;
        }
    }

    public /* synthetic */ nk(long j10, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f = tLObject;
        this.e = tL_chatInviteImporter;
        this.b = z10;
        this.c = j10;
        this.n = requestDelegate;
    }

    public /* synthetic */ nk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.d = mediaDataController;
        this.e = arrayList;
        this.b = z10;
        this.f = arrayList2;
        this.h = arrayList3;
        this.n = hVar;
        this.c = j10;
    }
}
