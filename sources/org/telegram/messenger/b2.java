package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class b2 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Thread b;

    public /* synthetic */ b2(Thread thread, int i10) {
        this.a = i10;
        this.b = thread;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean lambda$run$0;
        boolean lambda$run$1;
        switch (this.a) {
            case 0:
                lambda$run$0 = ((DispatchQueue) this.b).lambda$run$0(message);
                return lambda$run$0;
            default:
                lambda$run$1 = ((DispatchQueueMainThreadSync) this.b).lambda$run$1(message);
                return lambda$run$1;
        }
    }
}
