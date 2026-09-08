package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class fe implements Utilities.Callback {
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

    public /* synthetic */ fe(hg hgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
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
                int i11 = ChatActivityEnterView.m5;
                rd rdVar = new rd(chatActivityEnterView, (TLRPC.Document) obj2, this.g, (MessageObject.SendAnimationData) this.j, this.c, this.d, this.e, this.b, (Long) obj, this.f);
                if (!chatActivityEnterView.r1(rdVar)) {
                    rdVar.run();
                    break;
                }
                break;
            default:
                hg hgVar = (hg) obj3;
                rd rdVar2 = new rd(hgVar, this.b, (MediaController.PhotoEntry) obj2, this.c, this.d, this.e, this.f, (Long) obj, this.g, this.j);
                if (!hgVar.a.r1(rdVar2)) {
                    rdVar2.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
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
