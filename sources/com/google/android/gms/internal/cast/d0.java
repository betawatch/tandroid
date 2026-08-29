package com.google.android.gms.internal.cast;

import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d0 implements c0 {
    public final /* synthetic */ int a;
    public Object b;
    public volatile Object c;

    public d0(int i10) {
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
                Object obj = (c0) this.c;
                if (obj == a0.b) {
                    obj = a4.w.n("<supplier that returned ", String.valueOf(this.b), ">");
                }
                return a4.w.n("Suppliers.memoize(", String.valueOf(obj), ")");
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.cast.c0
    public Object zza() {
        c0 c0Var = (c0) this.c;
        a0 a0Var = a0.b;
        if (c0Var != a0Var) {
            synchronized (this) {
                try {
                    if (((c0) this.c) != a0Var) {
                        Object zza = ((c0) this.c).zza();
                        this.b = zza;
                        this.c = a0Var;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }
}
