package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class k6 {
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
    public n6 n;
    public o6 o;

    public final boolean a() {
        WeakReference weakReference = this.e;
        return weakReference != null && weakReference.get() == null;
    }

    public final int b() {
        int i7 = this.a;
        int i10 = this.b;
        int i11 = this.c;
        float f10 = this.d;
        e6 e6Var = this.f;
        if (e6Var == null) {
            WeakReference weakReference = this.e;
            e6Var = weakReference != null ? (e6) weakReference.get() : null;
        }
        return q6.P(i7, i10, i11, f10, e6Var);
    }

    public final void c(int i7, int i10, int i11, float f10, e6 e6Var) {
        this.a = i7;
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
