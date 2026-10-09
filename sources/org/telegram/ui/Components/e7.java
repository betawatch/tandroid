package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8 b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ e7(l8 l8Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = l8Var;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l8.o(this.b, this.c);
                break;
            default:
                l8.r(this.b, this.c);
                break;
        }
    }
}
