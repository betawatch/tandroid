package mi;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.b20;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.ye;
import org.telegram.messenger.z10;
import org.telegram.messenger.zi;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class v4 implements cs {
    public final int a;
    public final k4.j b;
    public zi c;
    public b20 d;
    public String e;
    public boolean f;
    public boolean h;
    public boolean n;

    public v4(int i3, ye yeVar, k4.j jVar) {
        this.a = i3;
        this.b = jVar;
    }

    public static boolean c(ye yeVar) {
        if (!yeVar.b) {
            ArrayList arrayList = yeVar.q;
            ArrayList arrayList2 = (arrayList == null || arrayList.isEmpty()) ? yeVar.p : yeVar.q;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    z10 z10Var = (z10) arrayList2.get(i3);
                    if (z10Var != null) {
                        if (z10Var.a == 0) {
                            byte b10 = z10Var.b;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = z10Var.k;
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
        k4.j jVar = this.b;
        t3 t3Var = (t3) jVar.c;
        IdentityHashMap identityHashMap = t3Var.i4;
        s sVar = (s) jVar.a;
        identityHashMap.remove(sVar);
        sVar.a = 3;
        t3Var.t4((a) jVar.b, sVar);
        t3Var.p3.onContentChanged();
    }

    public final void d() {
        hs f10 = hs.f(this.a);
        f10.n(this, hs.a2);
        f10.n(this, hs.b2);
        f10.n(this, hs.c2);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        k4.j jVar = this.b;
        a aVar = (a) jVar.b;
        s sVar = (s) jVar.a;
        t3 t3Var = (t3) jVar.c;
        if (this.h || this.n || i10 != this.a || objArr.length == 0 || objArr[0] != this.c) {
            return;
        }
        if (i3 != hs.b2) {
            if (i3 == hs.c2) {
                b();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[3]).longValue();
        sVar.f = ((Float) objArr[4]).floatValue();
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof t4) {
            C1.requestLayout();
            C1.invalidate();
        }
        if (longValue > 0) {
            this.n = true;
            d();
            String str = this.e;
            b20 b20Var = this.d;
            int i11 = b20Var.k;
            int i12 = b20Var.l;
            int ceil = (int) Math.ceil(b20Var.r / 1000.0d);
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
            t3Var.O4((a) jVar.b, sVar, str, true, sVar.j, sVar.k, ceil);
        }
    }
}
