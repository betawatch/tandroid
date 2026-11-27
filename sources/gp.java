// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class gp {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static gp c;
    public vd9 a;

    public static synchronized gp a() {
        gp gpVar;
        synchronized (gp.class) {
            if (c == null) {
                c();
            }
            gpVar = c;
        }
        return gpVar;
    }

    public static synchronized void c() {
        synchronized (gp.class) {
            if (c == null) {
                gp gpVar = new gp();
                c = gpVar;
                gpVar.a = vd9.d();
                c.a.l(new fp((byte) 0));
            }
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.g(context, i);
    }
}
