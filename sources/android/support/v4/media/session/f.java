package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends Handler {
    public boolean a;
    public final /* synthetic */ androidx.mediarouter.app.s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.mediarouter.app.s sVar, Looper looper) {
        super(looper);
        this.b = sVar;
        this.a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.a) {
            int i9 = message.what;
            androidx.mediarouter.app.s sVar = this.b;
            switch (i9) {
                case 1:
                    d0.a(message.getData());
                    break;
                case 2:
                    sVar.b((PlaybackStateCompat) message.obj);
                    break;
                case 3:
                    sVar.a((MediaMetadataCompat) message.obj);
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
                    sVar.d();
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
