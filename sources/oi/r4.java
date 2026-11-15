package oi;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.e20;
import org.telegram.messenger.ff;
import org.telegram.messenger.g20;
import org.telegram.messenger.gj;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class r4 implements is {
    public final int a;
    public final h6.m b;
    public gj c;
    public g20 d;
    public String e;
    public boolean f;
    public boolean h;
    public boolean n;

    public r4(int i7, ff ffVar, h6.m mVar) {
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
                    e20 e20Var = (e20) arrayList2.get(i7);
                    if (e20Var != null) {
                        if (e20Var.a == 0) {
                            byte b10 = e20Var.b;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = e20Var.k;
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
        q3 q3Var = (q3) mVar.d;
        IdentityHashMap identityHashMap = q3Var.i4;
        r rVar = (r) mVar.b;
        identityHashMap.remove(rVar);
        rVar.a = 3;
        q3Var.t4((a) mVar.c, rVar);
        q3Var.p3.onContentChanged();
    }

    public final void d() {
        ns f10 = ns.f(this.a);
        f10.n(this, ns.a2);
        f10.n(this, ns.b2);
        f10.n(this, ns.c2);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h6.m mVar = this.b;
        a aVar = (a) mVar.c;
        r rVar = (r) mVar.b;
        q3 q3Var = (q3) mVar.d;
        if (this.h || this.n || i10 != this.a || objArr.length == 0 || objArr[0] != this.c) {
            return;
        }
        if (i7 != ns.b2) {
            if (i7 == ns.c2) {
                b();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[3]).longValue();
        rVar.f = ((Float) objArr[4]).floatValue();
        View C1 = q3Var.C1(aVar);
        if (C1 instanceof p4) {
            C1.requestLayout();
            C1.invalidate();
        }
        if (longValue > 0) {
            this.n = true;
            d();
            String str = this.e;
            g20 g20Var = this.d;
            int i11 = g20Var.k;
            int i12 = g20Var.l;
            int ceil = (int) Math.ceil(g20Var.r / 1000.0d);
            q3Var.i4.remove(rVar);
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
            q3Var.q4(aVar);
            q3Var.O4((a) mVar.c, rVar, str, true, rVar.j, rVar.k, ceil);
        }
    }
}
