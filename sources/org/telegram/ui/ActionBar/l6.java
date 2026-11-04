package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l6 {
    public int a;
    public int b = -1;
    public int c;
    public float d;
    public WeakReference e;
    public e6 f;
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
        int i3 = this.a;
        int i10 = this.b;
        int i11 = this.c;
        float f10 = this.d;
        e6 e6Var = this.f;
        if (e6Var == null) {
            WeakReference weakReference = this.e;
            e6Var = weakReference != null ? (e6) weakReference.get() : null;
        }
        return r6.Q(i3, i10, i11, f10, e6Var);
    }

    public final void c(int i3, int i10, int i11, float f10, e6 e6Var) {
        this.a = i3;
        this.b = i10;
        this.c = i11;
        this.d = f10;
        if (e6Var == null) {
            this.e = null;
            this.f = null;
            return;
        }
        Class<?> cls = e6Var.getClass();
        if (cls.isSynthetic() || cls.getName().contains("$$Lambda") || cls.getName().contains("$$ExternalSynthetic")) {
            this.e = null;
            this.f = e6Var;
        } else {
            this.e = new WeakReference(e6Var);
            this.f = null;
        }
    }
}
