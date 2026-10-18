package n2;

import android.os.Handler;
import e2.m0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class d implements m {
    public final k a;
    public h b;
    public boolean c;
    public final /* synthetic */ f d;

    public d(f fVar, k kVar) {
        this.d = fVar;
        this.a = kVar;
    }

    @Override // n2.m
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        m0.W(handler, new ki.u(this, 7));
    }
}
