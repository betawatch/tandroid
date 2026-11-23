package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class o5 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Thread b;

    public /* synthetic */ o5(Thread thread, int i7) {
        this.a = i7;
        this.b = thread;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                ((r5) this.b).handleMessage(message);
                break;
            default:
                ((q5) this.b).getClass();
                break;
        }
        return true;
    }
}
