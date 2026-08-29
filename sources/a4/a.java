package a4;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import f5.d0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5.i b;

    public /* synthetic */ a(n nVar, g5.i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.a) {
            case 0:
                g5.i iVar = this.b;
                Handler handler = iVar.a;
                if (d0.a >= 30) {
                    iVar.a(j10);
                    break;
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                    break;
                }
            default:
                g5.i iVar2 = this.b;
                Handler handler2 = iVar2.a;
                if (d0.a >= 30) {
                    iVar2.a(j10);
                    break;
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                    break;
                }
        }
    }
}
