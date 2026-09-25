package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ge implements Utilities.Callback {
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

    public /* synthetic */ ge(hg hgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = hgVar;
        this.b = obj;
        this.i = photoEntry;
        this.c = z10;
        this.d = i10;
        this.e = i11;
        this.f = z11;
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
                int i11 = ChatActivityEnterView.n5;
                sd sdVar = new sd(chatActivityEnterView, (TLRPC.Document) obj2, this.g, (MessageObject.SendAnimationData) this.j, this.c, this.d, this.e, this.b, (Long) obj, this.f);
                if (!chatActivityEnterView.r1(sdVar)) {
                    sdVar.run();
                    break;
                }
                break;
            default:
                hg hgVar = (hg) obj3;
                sd sdVar2 = new sd(hgVar, this.b, (MediaController.PhotoEntry) obj2, this.c, this.d, this.e, this.f, (Long) obj, this.g, this.j);
                if (!hgVar.a.r1(sdVar2)) {
                    sdVar2.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ge(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.i = document;
        this.g = str;
        this.j = sendAnimationData;
        this.c = z10;
        this.d = i10;
        this.e = i11;
        this.b = obj;
        this.f = z11;
    }
}
