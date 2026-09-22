package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ b7(i8 i8Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = i8Var;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i8.m(this.b, this.c);
                break;
            default:
                i8.p(this.b, this.c);
                break;
        }
    }
}
