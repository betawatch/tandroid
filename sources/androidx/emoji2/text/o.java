package androidx.emoji2.text;

import android.os.Trace;
import android.util.SparseIntArray;
import fi.i7;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.s5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.voip.h2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s2;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class o implements Runnable {
    public static final /* synthetic */ o b = new o(1);
    public final /* synthetic */ int a;

    public /* synthetic */ o(int i7) {
        this.a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 2;
        boolean z10 = true;
        switch (this.a) {
            case 0:
                try {
                    int i10 = n0.g.a;
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
                    int i11 = n0.g.a;
                    Trace.endSection();
                    throw th2;
                }
            case 1:
                return;
            case 2:
                Math.abs(Utilities.b.nextInt() % 3);
                s10[] s10VarArr = i7.a;
                ls.f(k10.t0).k(2, 0);
                g0.h3(i7.o, 1000L);
                LaunchActivity.Q().getFragmentView();
                return;
            case 3:
                return;
            case 4:
                ArrayList arrayList = s5.j;
                if (arrayList == null || arrayList.isEmpty()) {
                    s5.j = null;
                    return;
                }
                ArrayList arrayList2 = s5.j;
                s5.j = null;
                if (s5.k == null) {
                    int max = Math.max(1, Runtime.getRuntime().availableProcessors());
                    s5 s5Var = new s5();
                    s5Var.a = new ArrayList(10);
                    s5Var.b = new SparseIntArray();
                    s5Var.c = new ArrayList(10);
                    s5Var.i = new j6.o(s5Var, 7);
                    s5Var.d = max;
                    s5Var.f = Utilities.b.nextInt();
                    s5.k = s5Var;
                }
                Utilities.e.c(new org.telegram.messenger.k(i7, arrayList2));
                return;
            case 5:
                m6.j = false;
                m6.m(false);
                return;
            case 6:
                m6.k = false;
                m6.m(true);
                return;
            case 7:
                return;
            case 8:
                h2 h2Var = h2.U;
                if (h2Var != null) {
                    g0.r(h2Var.b.f.O);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public o(s2 s2Var) {
        this.a = 7;
    }

    private final /* synthetic */ void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
