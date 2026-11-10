package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n6 {
    public int a;
    public int b = -1;
    public int c;
    public float d;
    public WeakReference e;
    public h6 f;
    public int g;
    public PorterDuff.Mode h;
    public Object i;
    public WeakReference j;
    public boolean k;
    public int l;
    public boolean m;
    public q6 n;
    public r6 o;

    public final boolean a() {
        WeakReference weakReference = this.e;
        return weakReference != null && weakReference.get() == null;
    }

    public final int b() {
        int i7 = this.a;
        int i10 = this.b;
        int i11 = this.c;
        float f10 = this.d;
        h6 h6Var = this.f;
        if (h6Var == null) {
            WeakReference weakReference = this.e;
            h6Var = weakReference != null ? (h6) weakReference.get() : null;
        }
        return t6.P(i7, i10, i11, f10, h6Var);
    }

    public final void c(int i7, int i10, int i11, float f10, h6 h6Var) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = f10;
        if (h6Var == null) {
            this.e = null;
            this.f = null;
            return;
        }
        Class<?> cls = h6Var.getClass();
        if (cls.isSynthetic() || cls.getName().contains("$$Lambda") || cls.getName().contains("$$ExternalSynthetic")) {
            this.e = null;
            this.f = h6Var;
        } else {
            this.e = new WeakReference(h6Var);
            this.f = null;
        }
    }
}
