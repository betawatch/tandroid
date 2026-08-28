package com.google.android.gms.internal.cast;

import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d0 implements c0 {
    public final /* synthetic */ int a;
    public Object b;
    public volatile Object c;

    public d0(int i9) {
        this.a = i9;
        switch (i9) {
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
                    obj = aa.d.o("<supplier that returned ", String.valueOf(this.b), ">");
                }
                return aa.d.o("Suppliers.memoize(", String.valueOf(obj), ")");
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
