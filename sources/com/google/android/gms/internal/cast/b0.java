package com.google.android.gms.internal.cast;

import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                if (obj == y.b) {
                    obj = android.support.v4.media.a.o("<supplier that returned ", String.valueOf(this.b), ">");
                }
                return android.support.v4.media.a.o("Suppliers.memoize(", String.valueOf(obj), ")");
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.cast.a0
    public Object zza() {
        a0 a0Var = (a0) this.c;
        y yVar = y.b;
        if (a0Var != yVar) {
            synchronized (this) {
                try {
                    if (((a0) this.c) != yVar) {
                        Object zza = ((a0) this.c).zza();
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
}
