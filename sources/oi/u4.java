package oi;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.d20;
import org.telegram.messenger.f20;
import org.telegram.messenger.ff;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class u4 implements gs {
    public final int a;
    public final h6.m b;
    public gj c;
    public f20 d;
    public String e;
    public boolean f;
    public boolean h;
    public boolean n;

    public u4(int i7, ff ffVar, h6.m mVar) {
        this.a = i7;
        this.b = mVar;
    }

    public static boolean c(ff ffVar) {
        if (!ffVar.b) {
            ArrayList arrayList = ffVar.q;
            ArrayList arrayList2 = (arrayList == null || arrayList.isEmpty()) ? ffVar.p : ffVar.q;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    d20 d20Var = (d20) arrayList2.get(i7);
                    if (d20Var != null) {
                        if (d20Var.a == 0) {
                            byte b10 = d20Var.b;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = d20Var.k;
                        if (arrayList3 != null && !arrayList3.isEmpty()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void a() {
        if (this.n || this.h) {
            return;
        }
        this.h = true;
        if (this.c != null && this.d != null) {
            try {
                MediaController.B().i(this.c);
            } catch (Throwable unused) {
            }
        }
        d();
    }

    public final void b() {
        if (this.n) {
            return;
        }
        this.n = true;
        d();
        h6.m mVar = this.b;
        t3 t3Var = (t3) mVar.d;
        IdentityHashMap identityHashMap = t3Var.i4;
        r rVar = (r) mVar.b;
        identityHashMap.remove(rVar);
        rVar.a = 3;
        t3Var.t4((a) mVar.c, rVar);
        t3Var.p3.onContentChanged();
    }

    public final void d() {
        ls f10 = ls.f(this.a);
        f10.n(this, ls.a2);
        f10.n(this, ls.b2);
        f10.n(this, ls.c2);
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h6.m mVar = this.b;
        a aVar = (a) mVar.c;
        r rVar = (r) mVar.b;
        t3 t3Var = (t3) mVar.d;
        if (this.h || this.n || i10 != this.a || objArr.length == 0 || objArr[0] != this.c) {
            return;
        }
        if (i7 != ls.b2) {
            if (i7 == ls.c2) {
                b();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[3]).longValue();
        rVar.f = ((Float) objArr[4]).floatValue();
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof s4) {
            C1.requestLayout();
            C1.invalidate();
        }
        if (longValue > 0) {
            this.n = true;
            d();
            String str = this.e;
            f20 f20Var = this.d;
            int i11 = f20Var.k;
            int i12 = f20Var.l;
            int ceil = (int) Math.ceil(f20Var.r / 1000.0d);
            t3Var.i4.remove(rVar);
            rVar.b = true;
            rVar.e = str;
            if (i11 > 0) {
                rVar.j = i11;
            }
            if (i12 > 0) {
                rVar.k = i12;
            }
            rVar.l = 0;
            rVar.m = 0;
            rVar.f = 0.0f;
            t3Var.q4(aVar);
            t3Var.O4((a) mVar.c, rVar, str, true, rVar.j, rVar.k, ceil);
        }
    }
}
