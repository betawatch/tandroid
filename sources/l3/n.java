package l3;

import android.os.Handler;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public final void a(m3.f fVar) {
        synchronized (fVar) {
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new l(this, fVar, 1));
        }
    }
}
