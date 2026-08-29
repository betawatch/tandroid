package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends Handler {
    public boolean a;
    public final /* synthetic */ androidx.mediarouter.app.p b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.mediarouter.app.p pVar, Looper looper) {
        super(looper);
        this.b = pVar;
        this.a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.a) {
            int i10 = message.what;
            androidx.mediarouter.app.p pVar = this.b;
            switch (i10) {
                case 1:
                    d0.a(message.getData());
                    break;
                case 2:
                    pVar.b((PlaybackStateCompat) message.obj);
                    break;
                case 3:
                    pVar.a((MediaMetadataCompat) message.obj);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    d0.a((Bundle) message.obj);
                    break;
                case 8:
                    pVar.d();
                    break;
                case 9:
                    ((Integer) message.obj).getClass();
                    break;
                case 11:
                    ((Boolean) message.obj).getClass();
                    break;
                case 12:
                    ((Integer) message.obj).getClass();
                    break;
            }
        }
    }
}
