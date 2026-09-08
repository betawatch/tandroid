package android.support.v4.media.session;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
            tVar.c((y1.a) message.obj);
            this.a.handleMediaPlayPauseIfPendingOnHandler(tVar, qVar);
            tVar.c(null);
        }
    }
}
