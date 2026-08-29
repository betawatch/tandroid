package android.support.v4.media.session;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r extends Handler {
    public final /* synthetic */ t a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, Looper looper) {
        super(looper);
        this.a = tVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        u uVar;
        t tVar;
        r rVar;
        if (message.what == 1) {
            synchronized (this.a.mLock) {
                uVar = this.a.mSessionImpl.get();
                tVar = this.a;
                rVar = tVar.mCallbackHandler;
            }
            if (uVar == null || tVar != uVar.a() || rVar == null) {
                return;
            }
            uVar.d((y1.a) message.obj);
            this.a.handleMediaPlayPauseIfPendingOnHandler(uVar, rVar);
            uVar.d(null);
        }
    }
}
