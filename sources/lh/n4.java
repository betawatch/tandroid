package lh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class n4 {
    public final Runnable a;
    public m4 b;
    public m4 c;
    public m4 d;
    public int e;
    public float f;
    public final ArrayList g;
    public final m4 h;
    public final m4 i;
    public final float j;
    public final int k;
    public int l;
    public final org.telegram.ui.Components.z5 m;
    public int n = -1;

    public n4(Runnable runnable, ArrayList arrayList, m4 m4Var, m4 m4Var2, float f10, int i10) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = m4Var;
        this.i = m4Var2;
        this.j = f10;
        this.k = i10;
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(runnable, 300L, mr.h);
        this.m = z5Var;
        z5Var.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i10;
        this.b = m4Var;
        this.c = d(false);
        this.d = d(false);
    }

    public final void a() {
        m4 m4Var = this.h;
        if (m4Var != null) {
            m4Var.a();
        }
        m4 m4Var2 = this.i;
        if (m4Var2 != null) {
            m4Var2.a();
        }
    }

    public final boolean b(float f10) {
        return this.c == this.i && this.f + f10 >= ((float) this.e) + 0.5f;
    }

    public final boolean c() {
        return this.c == this.i && this.f >= ((float) this.e) + 0.5f;
    }

    public final m4 d(boolean z4) {
        ArrayList arrayList;
        if (z4) {
            m4 m4Var = this.i;
            if (m4Var.b()) {
                int i10 = this.l;
                if (i10 <= 0) {
                    return m4Var;
                }
                this.l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.n && ((m4) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((m4) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.n = intValue;
        return (m4) arrayList.get(intValue);
    }

    public final void e() {
        this.b = this.c;
        this.c = this.i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f = i10 + 0.5f;
    }

    public final float f(float f10, boolean z4) {
        long j10;
        m4 m4Var;
        int i10 = this.l;
        int i11 = this.k;
        if (i10 >= i11) {
            j10 = 450;
        } else {
            j10 = i11 == 3 ? 4500 : 2500;
        }
        org.telegram.ui.Components.z5 z5Var = this.m;
        z5Var.g = j10;
        float lerp = (f10 * AndroidUtilities.lerp(i11 == 3 ? 0.75f : 2.0f, 7.5f, z5Var.e(i10 >= i11)) * this.j) + this.f;
        this.f = lerp;
        m4 m4Var2 = this.i;
        if (lerp >= 0.0f) {
            double d = lerp;
            if (Math.floor(d) + 1.0d > this.e && (m4Var = this.c) != m4Var2) {
                this.b = m4Var;
                m4 m4Var3 = this.d;
                this.c = m4Var3;
                this.d = m4Var3 == m4Var2 ? null : d(z4);
                this.e = ((int) Math.floor(d)) + 1;
            }
        }
        return this.c == m4Var2 ? Math.min(lerp, this.e + 0.5f) : lerp;
    }
}
