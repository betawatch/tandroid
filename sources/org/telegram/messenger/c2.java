package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
