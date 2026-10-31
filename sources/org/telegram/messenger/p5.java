package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class p5 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Thread b;

    public /* synthetic */ p5(Thread thread, int i10) {
        this.a = i10;
        this.b = thread;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                ((s5) this.b).handleMessage(message);
                break;
            default:
                ((r5) this.b).getClass();
                break;
        }
        return true;
    }
}
