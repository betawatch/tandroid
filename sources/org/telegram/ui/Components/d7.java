package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ d7(k8 k8Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = k8Var;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k8.n(this.b, this.c);
                break;
            default:
                k8.q(this.b, this.c);
                break;
        }
    }
}
