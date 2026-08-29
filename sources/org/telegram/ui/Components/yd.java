package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd implements Utilities.Callback {
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

    public /* synthetic */ yd(ag agVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = agVar;
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
                int i11 = ChatActivityEnterView.i5;
                kd kdVar = new kd(chatActivityEnterView, (TLRPC.Document) obj2, this.g, (MessageObject.SendAnimationData) this.j, this.c, this.d, this.e, this.b, (Long) obj, this.f);
                if (!chatActivityEnterView.r1(kdVar)) {
                    kdVar.run();
                    break;
                }
                break;
            default:
                ag agVar = (ag) obj3;
                kd kdVar2 = new kd(agVar, this.b, (MediaController.PhotoEntry) obj2, this.c, this.d, this.e, this.f, (Long) obj, this.g, this.j);
                if (!agVar.a.r1(kdVar2)) {
                    kdVar2.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ yd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
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
