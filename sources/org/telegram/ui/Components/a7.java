package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ a7(h8 h8Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = h8Var;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h8.m(this.b, this.c);
                break;
            default:
                h8.p(this.b, this.c);
                break;
        }
    }
}
