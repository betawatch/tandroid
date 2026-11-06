package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class n5 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Thread b;

    public /* synthetic */ n5(Thread thread, int i7) {
        this.a = i7;
        this.b = thread;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                ((q5) this.b).handleMessage(message);
                break;
            default:
                ((p5) this.b).getClass();
                break;
        }
        return true;
    }
}
