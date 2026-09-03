package d4;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import h5.d0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5.i b;

    public /* synthetic */ a(k kVar, i5.i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.a) {
            case 0:
                i5.i iVar = this.b;
                Handler handler = iVar.a;
                if (d0.a >= 30) {
                    iVar.a(j10);
                    break;
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                    break;
                }
            default:
                i5.i iVar2 = this.b;
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
