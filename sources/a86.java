// default package

import android.os.Looper;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
