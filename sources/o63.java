// default package

import org.webrtc.DataChannel;
import org.webrtc.NativeLifecycleLock;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o63 implements NativeLifecycleLock.NativeRunnable, NativeLifecycleLock.NativeCallable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DataChannel b;

    public /* synthetic */ o63(DataChannel dataChannel, byte b) {
        this.a = b;
        this.b = dataChannel;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeCallable
    public final Object call() {
        DataChannel.State lambda$state$4;
        String lambda$label$2;
        Integer lambda$id$3;
        Long lambda$bufferedAmount$5;
        byte b = this.a;
        DataChannel dataChannel = this.b;
        switch (b) {
            case 1:
                lambda$state$4 = dataChannel.lambda$state$4();
                return lambda$state$4;
            case 2:
            default:
                lambda$bufferedAmount$5 = dataChannel.lambda$bufferedAmount$5();
                return lambda$bufferedAmount$5;
            case 3:
                lambda$label$2 = dataChannel.lambda$label$2();
                return lambda$label$2;
            case 4:
                lambda$id$3 = dataChannel.lambda$id$3();
                return lambda$id$3;
        }
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeRunnable
    public final void run() {
        byte b = this.a;
        DataChannel dataChannel = this.b;
        switch (b) {
            case 0:
                dataChannel.lambda$close$6();
                break;
            default:
                dataChannel.lambda$unregisterObserver$1();
                break;
        }
    }
}
