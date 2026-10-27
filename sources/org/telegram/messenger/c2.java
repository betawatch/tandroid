package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class c2 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Thread b;

    public /* synthetic */ c2(Thread thread, int i10) {
        this.a = i10;
        this.b = thread;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean lambda$run$0;
        boolean lambda$run$02;
        switch (this.a) {
            case 0:
                lambda$run$0 = ((DispatchQueue) this.b).lambda$run$0(message);
                return lambda$run$0;
            default:
                lambda$run$02 = ((DispatchQueue2) this.b).lambda$run$0(message);
                return lambda$run$02;
        }
    }
}
