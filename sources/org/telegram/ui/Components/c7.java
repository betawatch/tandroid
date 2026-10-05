package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
