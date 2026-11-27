// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
