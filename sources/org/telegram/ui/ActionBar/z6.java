package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class z6 {
    public int a;
    public int b = -1;
    public int c;
    public float d;
    public WeakReference e;
    public u6 f;
    public int g;
    public PorterDuff.Mode h;
    public Object i;
    public WeakReference j;
    public boolean k;
    public int l;
    public boolean m;
    public c7 n;
    public d7 o;

    public final boolean a() {
        WeakReference weakReference = this.e;
        return weakReference != null && weakReference.get() == null;
    }

    public final int b() {
        int i10 = this.a;
        int i11 = this.b;
        int i12 = this.c;
        float f7 = this.d;
        u6 u6Var = this.f;
        if (u6Var == null) {
            WeakReference weakReference = this.e;
            u6Var = weakReference != null ? (u6) weakReference.get() : null;
        }
        return f7.Q(i10, i11, i12, f7, u6Var);
    }

    public final void c(int i10, int i11, int i12, float f7, u6 u6Var) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = f7;
        if (u6Var == null) {
            this.e = null;
            this.f = null;
            return;
        }
        Class<?> cls = u6Var.getClass();
        if (cls.isSynthetic() || cls.getName().contains("$$Lambda") || cls.getName().contains("$$ExternalSynthetic")) {
            this.e = null;
            this.f = u6Var;
        } else {
            this.e = new WeakReference(u6Var);
            this.f = null;
        }
    }
}
