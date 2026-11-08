package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class l6 {
    public int a;
    public int b = -1;
    public int c;
    public float d;
    public WeakReference e;
    public f6 f;
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
        int i7 = this.a;
        int i10 = this.b;
        int i11 = this.c;
        float f10 = this.d;
        f6 f6Var = this.f;
        if (f6Var == null) {
            WeakReference weakReference = this.e;
            f6Var = weakReference != null ? (f6) weakReference.get() : null;
        }
        return r6.Q(i7, i10, i11, f10, f6Var);
    }

    public final void c(int i7, int i10, int i11, float f10, f6 f6Var) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = f10;
        if (f6Var == null) {
            this.e = null;
            this.f = null;
            return;
        }
        Class<?> cls = f6Var.getClass();
        if (cls.isSynthetic() || cls.getName().contains("$$Lambda") || cls.getName().contains("$$ExternalSynthetic")) {
            this.e = null;
            this.f = f6Var;
        } else {
            this.e = new WeakReference(f6Var);
            this.f = null;
        }
    }
}
