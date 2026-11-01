package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
