// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fq {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static fq c;
    public hc9 a;

    public static synchronized fq a() {
        fq fqVar;
        synchronized (fq.class) {
            if (c == null) {
                c();
            }
            fqVar = c;
        }
        return fqVar;
    }

    public static synchronized void c() {
        synchronized (fq.class) {
            if (c == null) {
                fq fqVar = new fq();
                c = fqVar;
                fqVar.a = hc9.d();
                c.a.l(new eq((byte) 0));
            }
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.g(context, i);
    }
}
