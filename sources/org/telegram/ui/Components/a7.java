package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
