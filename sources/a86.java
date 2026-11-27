// default package

import android.os.Looper;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class a86 {
    public final ne5 a;
    public volatile y76 b;

    public a86(Looper looper, Object obj, String str) {
        this.a = new ne5(looper);
        xve.i(obj, "Listener must not be null");
        xve.f(str);
        this.b = new y76(obj, str);
    }

    public final void a(z76 z76Var) {
        this.a.execute(new xs4((Object) this, (Object) z76Var, (byte) 15));
    }
}
