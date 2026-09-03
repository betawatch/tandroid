package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ x6(c8 c8Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = c8Var;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c8.m(this.b, this.c);
                break;
            default:
                c8.p(this.b, this.c);
                break;
        }
    }
}
