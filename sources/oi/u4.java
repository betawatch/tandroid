package oi;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.b20;
import org.telegram.messenger.d20;
import org.telegram.messenger.ef;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class u4 implements fs {
    public final int a;
    public final h6.m b;
    public fj c;
    public d20 d;
    public String e;
    public boolean f;
    public boolean h;
    public boolean n;

    public u4(int i7, ef efVar, h6.m mVar) {
        this.a = i7;
        this.b = mVar;
    }

    public static boolean c(ef efVar) {
        if (!efVar.b) {
            ArrayList arrayList = efVar.q;
            ArrayList arrayList2 = (arrayList == null || arrayList.isEmpty()) ? efVar.p : efVar.q;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    b20 b20Var = (b20) arrayList2.get(i7);
                    if (b20Var != null) {
                        if (b20Var.a == 0) {
                            byte b10 = b20Var.b;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = b20Var.k;
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
        s sVar = (s) mVar.b;
        identityHashMap.remove(sVar);
        sVar.a = 3;
        t3Var.t4((a) mVar.c, sVar);
        t3Var.p3.onContentChanged();
    }

    public final void d() {
        ks f10 = ks.f(this.a);
        f10.n(this, ks.a2);
        f10.n(this, ks.b2);
        f10.n(this, ks.c2);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h6.m mVar = this.b;
        a aVar = (a) mVar.c;
        s sVar = (s) mVar.b;
        t3 t3Var = (t3) mVar.d;
        if (this.h || this.n || i10 != this.a || objArr.length == 0 || objArr[0] != this.c) {
            return;
        }
        if (i7 != ks.b2) {
            if (i7 == ks.c2) {
                b();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[3]).longValue();
        sVar.f = ((Float) objArr[4]).floatValue();
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof s4) {
            C1.requestLayout();
            C1.invalidate();
        }
        if (longValue > 0) {
            this.n = true;
            d();
            String str = this.e;
            d20 d20Var = this.d;
            int i11 = d20Var.k;
            int i12 = d20Var.l;
            int ceil = (int) Math.ceil(d20Var.r / 1000.0d);
            t3Var.i4.remove(sVar);
            sVar.b = true;
            sVar.e = str;
            if (i11 > 0) {
                sVar.j = i11;
            }
            if (i12 > 0) {
                sVar.k = i12;
            }
            sVar.l = 0;
            sVar.m = 0;
            sVar.f = 0.0f;
            t3Var.q4(aVar);
            t3Var.O4((a) mVar.c, sVar, str, true, sVar.j, sVar.k, ceil);
        }
    }
}
