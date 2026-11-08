package androidx.emoji2.text;

import android.os.Trace;
import android.util.SparseIntArray;
import di.r7;
import java.util.ArrayList;
import m.f3;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.r5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.voip.e2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s2;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class n implements Runnable {
    public static final /* synthetic */ n b = new n(1);
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i7) {
        this.a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 2;
        boolean z9 = true;
        switch (this.a) {
            case 0:
                try {
                    int i10 = n0.g.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (l.j == null) {
                        z9 = false;
                    }
                    if (z9) {
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
                f10[] f10VarArr = r7.a;
                qs.f(p10.s0).k(2, 0);
                g0.i3(r7.o, 1000L);
                LaunchActivity.Q().getFragmentView();
                return;
            case 3:
                return;
            case 4:
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
                    r5Var.i = new f3(r5Var, 4);
                    r5Var.d = max;
                    r5Var.f = Utilities.b.nextInt();
                    r5.k = r5Var;
                }
                Utilities.e.c(new org.telegram.messenger.k(i7, arrayList2));
                return;
            case 5:
                k6.j = false;
                k6.m(false);
                return;
            case 6:
                k6.k = false;
                k6.m(true);
                return;
            case 7:
                return;
            case 8:
                e2 e2Var = e2.T;
                if (e2Var != null) {
                    g0.r(e2Var.b.f.N);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public n(s2 s2Var) {
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
