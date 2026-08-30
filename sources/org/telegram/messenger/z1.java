package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class z1 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Thread b;

    public /* synthetic */ z1(Thread thread, int i10) {
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
