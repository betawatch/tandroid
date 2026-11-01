package bi;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.at;
import org.telegram.messenger.ff;
import org.telegram.messenger.kj;
import org.telegram.messenger.vs;
import org.telegram.messenger.w20;
import org.telegram.messenger.y20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class h5 implements vs {
    public final int a;
    public final android.support.v4.media.session.a0 b;
    public kj c;
    public y20 d;
    public String e;
    public boolean f;
    public boolean h;
    public boolean n;

    public h5(int i10, ff ffVar, android.support.v4.media.session.a0 a0Var) {
        this.a = i10;
        this.b = a0Var;
    }

    public static boolean c(ff ffVar) {
        if (!ffVar.b) {
            ArrayList arrayList = ffVar.q;
            ArrayList arrayList2 = (arrayList == null || arrayList.isEmpty()) ? ffVar.p : ffVar.q;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    w20 w20Var = (w20) arrayList2.get(i10);
                    if (w20Var != null) {
                        if (w20Var.a == 0) {
                            byte b10 = w20Var.b;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = w20Var.k;
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
        android.support.v4.media.session.a0 a0Var = this.b;
        d4 d4Var = (d4) a0Var.d;
        IdentityHashMap identityHashMap = d4Var.h4;
        w wVar = (w) a0Var.b;
        identityHashMap.remove(wVar);
        wVar.a = 3;
        d4Var.t4((a) a0Var.c, wVar);
        d4Var.o3.onContentChanged();
    }

    public final void d() {
        at f7 = at.f(this.a);
        f7.n(this, at.a2);
        f7.n(this, at.b2);
        f7.n(this, at.c2);
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        android.support.v4.media.session.a0 a0Var = this.b;
        a aVar = (a) a0Var.c;
        w wVar = (w) a0Var.b;
        d4 d4Var = (d4) a0Var.d;
        if (this.h || this.n || i11 != this.a || objArr.length == 0 || objArr[0] != this.c) {
            return;
        }
        if (i10 != at.b2) {
            if (i10 == at.c2) {
                b();
                return;
            }
            return;
        }
        long longValue = ((Long) objArr[3]).longValue();
        wVar.f = ((Float) objArr[4]).floatValue();
        View C1 = d4Var.C1(aVar);
        if (C1 instanceof f5) {
            C1.requestLayout();
            C1.invalidate();
        }
        if (longValue > 0) {
            this.n = true;
            d();
            String str = this.e;
            y20 y20Var = this.d;
            int i12 = y20Var.k;
            int i13 = y20Var.l;
            int ceil = (int) Math.ceil(y20Var.r / 1000.0d);
            d4Var.h4.remove(wVar);
            wVar.b = true;
            wVar.e = str;
            if (i12 > 0) {
                wVar.j = i12;
            }
            if (i13 > 0) {
                wVar.k = i13;
            }
            wVar.l = 0;
            wVar.m = 0;
            wVar.f = 0.0f;
            d4Var.q4(aVar);
            d4Var.O4((a) a0Var.c, wVar, str, true, wVar.j, wVar.k, ceil);
        }
    }
}
