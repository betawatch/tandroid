package com.google.android.gms.internal.cast;

import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class f0 implements e0 {
    public final /* synthetic */ int a;
    public Object b;
    public volatile Object c;

    public f0(int i10) {
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
                Object obj = (e0) this.c;
                if (obj == b0.b) {
                    obj = a4.a.p("<supplier that returned ", String.valueOf(this.b), ">");
                }
                return a4.a.p("Suppliers.memoize(", String.valueOf(obj), ")");
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.cast.e0
    public Object zza() {
        e0 e0Var = (e0) this.c;
        b0 b0Var = b0.b;
        if (e0Var != b0Var) {
            synchronized (this) {
                try {
                    if (((e0) this.c) != b0Var) {
                        Object zza = ((e0) this.c).zza();
                        this.b = zza;
                        this.c = b0Var;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }
}
