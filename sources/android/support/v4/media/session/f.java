package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends Handler {
    public boolean a;
    public final /* synthetic */ androidx.mediarouter.app.r b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.mediarouter.app.r rVar, Looper looper) {
        super(looper);
        this.b = rVar;
        this.a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.a) {
            int i10 = message.what;
            androidx.mediarouter.app.r rVar = this.b;
            switch (i10) {
                case 1:
                    d0.a(message.getData());
                    break;
                case 2:
                    rVar.b((PlaybackStateCompat) message.obj);
                    break;
                case 3:
                    rVar.a((MediaMetadataCompat) message.obj);
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
                    rVar.d();
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
