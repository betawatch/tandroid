package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class o6 {
    public int a;
    public int b = -1;
    public int c;
    public float d;
    public WeakReference e;
    public i6 f;
    public int g;
    public PorterDuff.Mode h;
    public Object i;
    public WeakReference j;
    public boolean k;
    public int l;
    public boolean m;
    public r6 n;
    public s6 o;

    public final boolean a() {
        WeakReference weakReference = this.e;
        return weakReference != null && weakReference.get() == null;
    }

    public final int b() {
        int i7 = this.a;
        int i10 = this.b;
        int i11 = this.c;
        float f10 = this.d;
        i6 i6Var = this.f;
        if (i6Var == null) {
            WeakReference weakReference = this.e;
            i6Var = weakReference != null ? (i6) weakReference.get() : null;
        }
        return u6.P(i7, i10, i11, f10, i6Var);
    }

    public final void c(int i7, int i10, int i11, float f10, i6 i6Var) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = f10;
        if (i6Var == null) {
            this.e = null;
            this.f = null;
            return;
        }
        Class<?> cls = i6Var.getClass();
        if (cls.isSynthetic() || cls.getName().contains("$$Lambda") || cls.getName().contains("$$ExternalSynthetic")) {
            this.e = null;
            this.f = i6Var;
        } else {
            this.e = new WeakReference(i6Var);
            this.f = null;
        }
    }
}
