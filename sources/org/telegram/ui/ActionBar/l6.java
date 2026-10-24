package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class l6 {
    public int a;
    public int b = -1;
    public int c;
    public float d;
    public WeakReference e;
    public g6 f;
    public int g;
    public PorterDuff.Mode h;
    public Object i;
    public WeakReference j;
    public boolean k;
    public int l;
    public boolean m;
    public o6 n;
    public p6 o;

    public final boolean a() {
        WeakReference weakReference = this.e;
        return weakReference != null && weakReference.get() == null;
    }

    public final int b() {
        int i10 = this.a;
        int i11 = this.b;
        int i12 = this.c;
        float f7 = this.d;
        g6 g6Var = this.f;
        if (g6Var == null) {
            WeakReference weakReference = this.e;
            g6Var = weakReference != null ? (g6) weakReference.get() : null;
        }
        return r6.R(i10, i11, i12, f7, g6Var);
    }

    public final void c(int i10, int i11, int i12, float f7, g6 g6Var) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = f7;
        if (g6Var == null) {
            this.e = null;
            this.f = null;
            return;
        }
        Class<?> cls = g6Var.getClass();
        if (cls.isSynthetic() || cls.getName().contains("$$Lambda") || cls.getName().contains("$$ExternalSynthetic")) {
            this.e = null;
            this.f = g6Var;
        } else {
            this.e = new WeakReference(g6Var);
            this.f = null;
        }
    }
}
