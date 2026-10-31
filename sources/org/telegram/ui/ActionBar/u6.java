package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u6 {
    public int a;
    public int b = -1;
    public int c;
    public float d;
    public WeakReference e;
    public p6 f;
    public int g;
    public PorterDuff.Mode h;
    public Object i;
    public WeakReference j;
    public boolean k;
    public int l;
    public boolean m;
    public x6 n;
    public y6 o;

    public final boolean a() {
        WeakReference weakReference = this.e;
        return weakReference != null && weakReference.get() == null;
    }

    public final int b() {
        int i10 = this.a;
        int i11 = this.b;
        int i12 = this.c;
        float f7 = this.d;
        p6 p6Var = this.f;
        if (p6Var == null) {
            WeakReference weakReference = this.e;
            p6Var = weakReference != null ? (p6) weakReference.get() : null;
        }
        return a7.Q(i10, i11, i12, f7, p6Var);
    }

    public final void c(int i10, int i11, int i12, float f7, p6 p6Var) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = f7;
        if (p6Var == null) {
            this.e = null;
            this.f = null;
            return;
        }
        Class<?> cls = p6Var.getClass();
        if (cls.isSynthetic() || cls.getName().contains("$$Lambda") || cls.getName().contains("$$ExternalSynthetic")) {
            this.e = null;
            this.f = p6Var;
        } else {
            this.e = new WeakReference(p6Var);
            this.f = null;
        }
    }
}
