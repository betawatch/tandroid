package com.google.android.gms.internal.cast;

import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c0 implements b0 {
    public final /* synthetic */ int a;
    public Object b;
    public volatile Object c;

    public /* synthetic */ c0(int i10) {
        this.a = i10;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                Object obj = (b0) this.c;
                if (obj == y.b) {
                    obj = a1.g.n("<supplier that returned ", String.valueOf(this.b), ">");
                }
                return a1.g.n("Suppliers.memoize(", String.valueOf(obj), ")");
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.cast.b0
    public Object zza() {
        b0 b0Var = (b0) this.c;
        y yVar = y.b;
        if (b0Var != yVar) {
            synchronized (this) {
                try {
                    if (((b0) this.c) != yVar) {
                        Object zza = ((b0) this.c).zza();
                        this.b = zza;
                        this.c = yVar;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public c0() {
        this.a = 1;
        this.b = new CopyOnWriteArraySet();
    }
}
