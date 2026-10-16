package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                m8.n(this.b, this.c);
                break;
            default:
                m8.r(this.b, this.c);
                break;
        }
    }
}
