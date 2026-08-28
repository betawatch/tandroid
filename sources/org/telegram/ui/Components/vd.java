package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public /* synthetic */ vd(xf xfVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i9, int i10, boolean z11, String str, Object obj2) {
        this.h = xfVar;
        this.b = obj;
        this.i = photoEntry;
        this.c = z10;
        this.d = i9;
        this.e = i10;
        this.f = z11;
        this.g = str;
        this.j = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i9 = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i9) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.i5;
                gd gdVar = new gd(chatActivityEnterView, (TLRPC.Document) obj2, this.g, (MessageObject.SendAnimationData) this.j, this.c, this.d, this.e, this.b, (Long) obj, this.f);
                if (!chatActivityEnterView.r1(gdVar)) {
                    gdVar.run();
                    break;
                }
                break;
            default:
                xf xfVar = (xf) obj3;
                gd gdVar2 = new gd(xfVar, this.b, (MediaController.PhotoEntry) obj2, this.c, this.d, this.e, this.f, (Long) obj, this.g, this.j);
                if (!xfVar.a.r1(gdVar2)) {
                    gdVar2.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ vd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i9, int i10, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.i = document;
        this.g = str;
        this.j = sendAnimationData;
        this.c = z10;
        this.d = i9;
        this.e = i10;
        this.b = obj;
        this.f = z11;
    }
}
