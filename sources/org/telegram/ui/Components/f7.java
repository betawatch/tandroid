package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ f7(m8 m8Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = m8Var;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m8.m(this.b, this.c);
                break;
            default:
                m8.F(this.b, this.c);
                break;
        }
    }
}
