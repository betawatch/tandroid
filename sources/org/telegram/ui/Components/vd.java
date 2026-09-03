package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ vd(xf xfVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z4, int i10, int i11, boolean z10, String str, Object obj2) {
        this.h = xfVar;
        this.b = obj;
        this.i = photoEntry;
        this.c = z4;
        this.d = i10;
        this.e = i11;
        this.f = z10;
        this.g = str;
        this.j = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.j5;
                hd hdVar = new hd(chatActivityEnterView, (TLRPC.Document) obj2, this.g, (MessageObject.SendAnimationData) this.j, this.c, this.d, this.e, this.b, (Long) obj, this.f);
                if (!chatActivityEnterView.r1(hdVar)) {
                    hdVar.run();
                    break;
                }
                break;
            default:
                xf xfVar = (xf) obj3;
                hd hdVar2 = new hd(xfVar, this.b, (MediaController.PhotoEntry) obj2, this.c, this.d, this.e, this.f, (Long) obj, this.g, this.j);
                if (!xfVar.a.r1(hdVar2)) {
                    hdVar2.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ vd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z4, int i10, int i11, Object obj, boolean z10) {
        this.h = chatActivityEnterView;
        this.i = document;
        this.g = str;
        this.j = sendAnimationData;
        this.c = z4;
        this.d = i10;
        this.e = i11;
        this.b = obj;
        this.f = z10;
    }
}
