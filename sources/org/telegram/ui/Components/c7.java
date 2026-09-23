package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class c7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ c7(j8 j8Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = j8Var;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j8.m(this.b, this.c);
                break;
            default:
                j8.p(this.b, this.c);
                break;
        }
    }
}
