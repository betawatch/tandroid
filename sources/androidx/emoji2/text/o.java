package androidx.emoji2.text;

import android.os.Trace;
import android.util.SparseIntArray;
import ei.s7;
import java.util.ArrayList;
import mi.b0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.r5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.voip.u1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.t2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o implements Runnable {
    public static final /* synthetic */ o b = new o(1);
    public final /* synthetic */ int a;

    public /* synthetic */ o(int i3) {
        this.a = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = 2;
        int i10 = 3;
        boolean z10 = true;
        switch (this.a) {
            case 0:
                try {
                    int i11 = n0.g.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (l.j == null) {
                        z10 = false;
                    }
                    if (z10) {
                        l.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th2) {
                    int i12 = n0.g.a;
                    Trace.endSection();
                    throw th2;
                }
            case 1:
                return;
            case 2:
                Math.abs(Utilities.b.nextInt() % 3);
                b10[] b10VarArr = s7.a;
                hs.f(h10.t0).k(2, 0);
                g0.i3(s7.o, 1000L);
                LaunchActivity.Q().getFragmentView();
                return;
            case 3:
            case 4:
                return;
            case 5:
                ArrayList arrayList = r5.j;
                if (arrayList == null || arrayList.isEmpty()) {
                    r5.j = null;
                    return;
                }
                ArrayList arrayList2 = r5.j;
                r5.j = null;
                if (r5.k == null) {
                    int max = Math.max(1, Runtime.getRuntime().availableProcessors());
                    r5 r5Var = new r5();
                    r5Var.a = new ArrayList(10);
                    r5Var.b = new SparseIntArray();
                    r5Var.c = new ArrayList(10);
                    r5Var.i = new b0(r5Var, i10);
                    r5Var.d = max;
                    r5Var.f = Utilities.b.nextInt();
                    r5.k = r5Var;
                }
                Utilities.e.c(new org.telegram.messenger.k(i3, arrayList2));
                return;
            case 6:
                k6.j = false;
                k6.m(false);
                return;
            case 7:
                k6.k = false;
                k6.m(true);
                return;
            case 8:
                return;
            default:
                u1 u1Var = u1.W;
                if (u1Var != null) {
                    g0.r(u1Var.b.f.O);
                    return;
                }
                return;
        }
    }

    public o(t2 t2Var) {
        this.a = 8;
    }

    private final /* synthetic */ void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void e() {
    }
}
