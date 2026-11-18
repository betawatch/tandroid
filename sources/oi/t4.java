package oi;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.c20;
import org.telegram.messenger.e20;
import org.telegram.messenger.ef;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class t4 implements fs {
    public final int a;
    public final h6.m b;
    public fj c;
    public e20 d;
    public String e;
    public boolean f;
    public boolean h;
    public boolean n;

    public t4(int i7, ef efVar, h6.m mVar) {
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
                    c20 c20Var = (c20) arrayList2.get(i7);
                    if (c20Var != null) {
                        if (c20Var.a == 0) {
                            byte b10 = c20Var.b;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = c20Var.k;
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
        s3 s3Var = (s3) mVar.d;
        IdentityHashMap identityHashMap = s3Var.i4;
        r rVar = (r) mVar.b;
        identityHashMap.remove(rVar);
        rVar.a = 3;
        s3Var.t4((a) mVar.c, rVar);
        s3Var.p3.onContentChanged();
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
        r rVar = (r) mVar.b;
        s3 s3Var = (s3) mVar.d;
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
        rVar.f = ((Float) objArr[4]).floatValue();
        View C1 = s3Var.C1(aVar);
        if (C1 instanceof r4) {
            C1.requestLayout();
            C1.invalidate();
        }
        if (longValue > 0) {
            this.n = true;
            d();
            String str = this.e;
            e20 e20Var = this.d;
            int i11 = e20Var.k;
            int i12 = e20Var.l;
            int ceil = (int) Math.ceil(e20Var.r / 1000.0d);
            s3Var.i4.remove(rVar);
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
            s3Var.q4(aVar);
            s3Var.O4((a) mVar.c, rVar, str, true, rVar.j, rVar.k, ceil);
        }
    }
}
