package com.google.android.gms.internal.cast;

import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class b0 implements a0 {
    public final /* synthetic */ int a;
    public Object b;
    public volatile Object c;

    public /* synthetic */ b0(int i7) {
        this.a = i7;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                Object obj = (a0) this.c;
                if (obj == x.b) {
                    obj = a8.p0.p("<supplier that returned ", String.valueOf(this.b), ">");
                }
                return a8.p0.p("Suppliers.memoize(", String.valueOf(obj), ")");
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.cast.a0
    public Object zza() {
        a0 a0Var = (a0) this.c;
        x xVar = x.b;
        if (a0Var != xVar) {
            synchronized (this) {
                try {
                    if (((a0) this.c) != xVar) {
                        Object zza = ((a0) this.c).zza();
                        this.b = zza;
                        this.c = xVar;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public b0() {
        this.a = 1;
        this.b = new CopyOnWriteArraySet();
    }
}
