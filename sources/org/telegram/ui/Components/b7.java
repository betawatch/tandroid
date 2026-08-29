package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ b7(g8 g8Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = g8Var;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g8.m(this.b, this.c);
                break;
            default:
                g8.p(this.b, this.c);
                break;
        }
    }
}
