package com.google.android.gms.internal.cast;

import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                if (obj == z.b) {
                    obj = a1.g.q("<supplier that returned ", String.valueOf(this.b), ">");
                }
                return a1.g.q("Suppliers.memoize(", String.valueOf(obj), ")");
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.cast.c0
    public Object zza() {
        c0 c0Var = (c0) this.c;
        z zVar = z.b;
        if (c0Var != zVar) {
            synchronized (this) {
                try {
                    if (((c0) this.c) != zVar) {
                        Object zza = ((c0) this.c).zza();
                        this.b = zza;
                        this.c = zVar;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }
}
