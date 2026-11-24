// default package

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dqa {
    public final Runnable a;
    public cqa b;
    public cqa c;
    public cqa d;
    public int e;
    public float f;
    public final ArrayList g;
    public final cqa h;
    public final cqa i;
    public final float j;
    public final byte k;
    public int l;
    public final lm m;
    public int n = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public dqa(Runnable runnable, ArrayList arrayList, cqa cqaVar, cqa cqaVar2, float f, int i) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = cqaVar;
        this.i = cqaVar2;
        this.j = f;
        this.k = i;
        lm lmVar = new lm(runnable, 300L, s33.h);
        this.m = lmVar;
        lmVar.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i;
        this.b = cqaVar;
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

    public final cqa d(boolean z) {
        ArrayList arrayList;
        if (z) {
            cqa cqaVar = this.i;
            if (cqaVar.b()) {
                int i = this.l;
                if (i <= 0) {
                    return cqaVar;
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
            if (i2 != this.n && ((cqa) arrayList.get(i2)).b()) {
                arrayList2.add(Integer.valueOf(i2));
            }
            i2++;
        }
        if (arrayList2.isEmpty()) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (((cqa) arrayList.get(i3)).b()) {
                    arrayList2.add(Integer.valueOf(i3));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        Typeface typeface = gl.a;
        int intValue = ((Integer) (arrayList2.isEmpty() ? null : arrayList2.get(Math.abs(((int) Utilities.c.nextLong()) % arrayList2.size())))).intValue();
        this.n = intValue;
        return (cqa) arrayList.get(intValue);
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
        cqa cqaVar;
        int i = this.l;
        byte b = this.k;
        if (i >= b) {
            j = 450;
        } else {
            j = b == 3 ? 4500 : 2500;
        }
        lm lmVar = this.m;
        lmVar.g = j;
        float R1 = (f * gl.R1(b == 3 ? 0.75f : 2.0f, 7.5f, lmVar.d(i >= b)) * this.j) + this.f;
        this.f = R1;
        cqa cqaVar2 = this.i;
        if (R1 >= 0.0f) {
            double d = R1;
            if (Math.floor(d) + 1.0d > this.e && (cqaVar = this.c) != cqaVar2) {
                this.b = cqaVar;
                cqa cqaVar3 = this.d;
                this.c = cqaVar3;
                this.d = cqaVar3 == cqaVar2 ? null : d(z);
                this.e = ((int) Math.floor(d)) + 1;
            }
        }
        return this.c == cqaVar2 ? Math.min(R1, this.e + 0.5f) : R1;
    }
}
