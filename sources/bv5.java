// default package

import java.nio.ByteBuffer;
import org.webrtc.JniCommon;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bv5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ByteBuffer b;

    public /* synthetic */ bv5(ByteBuffer byteBuffer, byte b) {
        this.a = b;
        this.b = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ByteBuffer byteBuffer = this.b;
        switch (b) {
            case 0:
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                break;
            default:
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                break;
        }
    }
}
