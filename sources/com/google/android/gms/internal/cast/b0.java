package com.google.android.gms.internal.cast;

import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b0 implements a0 {
    public final /* synthetic */ int a;
    public Object b;
    public volatile Object c;

    public b0(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new CopyOnWriteArraySet();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                Object obj = (a0) this.c;
                if (obj == x.b) {
                    obj = a1.g.p("<supplier that returned ", String.valueOf(this.b), ">");
                }
                return a1.g.p("Suppliers.memoize(", String.valueOf(obj), ")");
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
}
