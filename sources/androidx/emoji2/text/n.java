package androidx.emoji2.text;

import android.os.Trace;
import android.util.SparseIntArray;
import java.util.ArrayList;
import mg.c2;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
import org.telegram.messenger.i0;
import org.telegram.messenger.t5;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.u10;
import org.telegram.ui.Components.voip.u1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s2;
import th.w5;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class n implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 2;
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
            case 2:
                return;
            case 3:
                ArrayList arrayList = t5.j;
                if (arrayList == null || arrayList.isEmpty()) {
                    t5.j = null;
                    return;
                }
                ArrayList arrayList2 = t5.j;
                t5.j = null;
                if (t5.k == null) {
                    int max = Math.max(1, Runtime.getRuntime().availableProcessors());
                    t5 t5Var = new t5();
                    t5Var.a = new ArrayList(10);
                    t5Var.b = new SparseIntArray();
                    t5Var.c = new ArrayList(10);
                    t5Var.i = new c2(t5Var, i10);
                    t5Var.d = max;
                    t5Var.f = Utilities.b.nextInt();
                    t5.k = t5Var;
                }
                Utilities.e.c(new org.telegram.messenger.l(i10, arrayList2));
                return;
            case 4:
                t6.j = false;
                t6.m(false);
                return;
            case 5:
                t6.k = false;
                t6.m(true);
                return;
            case 6:
                return;
            case 7:
                u1 u1Var = u1.V;
                if (u1Var != null) {
                    i0.r(u1Var.b.f.N);
                    return;
                }
                return;
            default:
                Math.abs(Utilities.b.nextInt() % 3);
                u10[] u10VarArr = w5.a;
                at.f(e20.s0).k(2, 0);
                i0.h3(w5.o, 1000L);
                LaunchActivity.Q().getFragmentView();
                return;
        }
    }

    public n(s2 s2Var) {
        this.a = 6;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
