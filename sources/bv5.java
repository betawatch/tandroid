// default package

import java.nio.ByteBuffer;
import org.webrtc.JniCommon;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
