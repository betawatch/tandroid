package j3;

import android.os.Handler;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n {
    public final Handler a;
    public final o b;

    public n(Handler handler, o oVar) {
        if (oVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.a = handler;
        this.b = oVar;
    }

    public final void a(k3.f fVar) {
        synchronized (fVar) {
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new l(this, fVar, 1));
        }
    }
}
