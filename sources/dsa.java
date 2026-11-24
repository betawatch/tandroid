// default package

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dsa {
    public final Runnable a;
    public csa b;
    public csa c;
    public csa d;
    public int e;
    public float f;
    public final ArrayList g;
    public final csa h;
    public final csa i;
    public final float j;
    public final byte k;
    public int l;
    public final ln m;
    public int n = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public dsa(Runnable runnable, ArrayList arrayList, csa csaVar, csa csaVar2, float f, int i) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = csaVar;
        this.i = csaVar2;
        this.j = f;
        this.k = i;
        ln lnVar = new ln(runnable, 300L, d53.h);
        this.m = lnVar;
        lnVar.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i;
        this.b = csaVar;
        this.c = d(false);
        this.d = d(false);
    }

    public final void a() {
        this.h.a();
        this.i.a();
    }

    public final boolean b(float f) {
        return this.c == this.i && this.f + f >= ((float) this.e) + 0.5f;
    }

    public final boolean c() {
        return this.c == this.i && this.f >= ((float) this.e) + 0.5f;
    }

    public final csa d(boolean z) {
        ArrayList arrayList;
        if (z) {
            csa csaVar = this.i;
            if (csaVar.b()) {
                int i = this.l;
                if (i <= 0) {
                    return csaVar;
                }
                this.l = i - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (true) {
            arrayList = this.g;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (i2 != this.n && ((csa) arrayList.get(i2)).b()) {
                arrayList2.add(Integer.valueOf(i2));
            }
            i2++;
        }
        if (arrayList2.isEmpty()) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (((csa) arrayList.get(i3)).b()) {
                    arrayList2.add(Integer.valueOf(i3));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        Typeface typeface = gm.a;
        int intValue = ((Integer) (arrayList2.isEmpty() ? null : arrayList2.get(Math.abs(((int) Utilities.c.nextLong()) % arrayList2.size())))).intValue();
        this.n = intValue;
        return (csa) arrayList.get(intValue);
    }

    public final void e() {
        this.b = this.c;
        this.c = this.i;
        this.d = null;
        int i = this.e + 1;
        this.e = i;
        this.f = i + 0.5f;
    }

    public final float f(boolean z, float f) {
        long j;
        csa csaVar;
        int i = this.l;
        byte b = this.k;
        if (i >= b) {
            j = 450;
        } else {
            j = b == 3 ? 4500 : 2500;
        }
        ln lnVar = this.m;
        lnVar.g = j;
        float R1 = (f * gm.R1(b == 3 ? 0.75f : 2.0f, 7.5f, lnVar.d(i >= b)) * this.j) + this.f;
        this.f = R1;
        csa csaVar2 = this.i;
        if (R1 >= 0.0f) {
            double d = R1;
            if (Math.floor(d) + 1.0d > this.e && (csaVar = this.c) != csaVar2) {
                this.b = csaVar;
                csa csaVar3 = this.d;
                this.c = csaVar3;
                this.d = csaVar3 == csaVar2 ? null : d(z);
                this.e = ((int) Math.floor(d)) + 1;
            }
        }
        return this.c == csaVar2 ? Math.min(R1, this.e + 0.5f) : R1;
    }
}
