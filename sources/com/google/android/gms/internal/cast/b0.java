package com.google.android.gms.internal.cast;

import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
