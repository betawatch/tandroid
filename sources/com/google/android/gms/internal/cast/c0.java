package com.google.android.gms.internal.cast;

import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c0 implements b0 {
    public final /* synthetic */ int a;
    public Object b;
    public volatile Object c;

    public c0(int i10) {
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
                Object obj = (b0) this.c;
                if (obj == z.b) {
                    obj = android.support.v4.media.a.o("<supplier that returned ", String.valueOf(this.b), ">");
                }
                return android.support.v4.media.a.o("Suppliers.memoize(", String.valueOf(obj), ")");
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.cast.b0
    public Object zza() {
        b0 b0Var = (b0) this.c;
        z zVar = z.b;
        if (b0Var != zVar) {
            synchronized (this) {
                try {
                    if (((b0) this.c) != zVar) {
                        Object zza = ((b0) this.c).zza();
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
