package android.support.v4.media.session;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class q extends Handler {
    public final /* synthetic */ s a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, Looper looper) {
        super(looper);
        this.a = sVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        t tVar;
        s sVar;
        q qVar;
        if (message.what == 1) {
            synchronized (this.a.mLock) {
                tVar = this.a.mSessionImpl.get();
                sVar = this.a;
                qVar = sVar.mCallbackHandler;
            }
            if (tVar == null || sVar != tVar.a() || qVar == null) {
                return;
            }
            tVar.d((y1.a) message.obj);
            this.a.handleMediaPlayPauseIfPendingOnHandler(tVar, qVar);
            tVar.d(null);
        }
    }
}
