package j3;

import android.os.Handler;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m {
    public final Handler a;
    public final n b;

    public m(Handler handler, n nVar) {
        if (nVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.a = handler;
        this.b = nVar;
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
