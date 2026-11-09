package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class m6 {
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
    public p6 n;
    public q6 o;

    public final boolean a() {
        WeakReference weakReference = this.e;
        return weakReference != null && weakReference.get() == null;
    }

    public final int b() {
        int i7 = this.a;
        int i10 = this.b;
        int i11 = this.c;
        float f10 = this.d;
        g6 g6Var = this.f;
        if (g6Var == null) {
            WeakReference weakReference = this.e;
            g6Var = weakReference != null ? (g6) weakReference.get() : null;
        }
        return s6.P(i7, i10, i11, f10, g6Var);
    }

    public final void c(int i7, int i10, int i11, float f10, g6 g6Var) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = f10;
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
