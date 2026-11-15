package androidx.emoji2.text;

import android.os.Trace;
import android.util.SparseIntArray;
import fi.l7;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.r5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.voip.i2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                i10[] i10VarArr = l7.a;
                ns.f(m10.t0).k(2, 0);
                g0.i3(l7.o, 1000L);
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
                    r5Var.i = new j6.o(r5Var, 7);
                    r5Var.d = max;
                    r5Var.f = Utilities.b.nextInt();
                    r5.k = r5Var;
                }
                Utilities.e.c(new org.telegram.messenger.k(i7, arrayList2));
                return;
            case 5:
                j6.j = false;
                j6.m(false);
                return;
            case 6:
                j6.k = false;
                j6.m(true);
                return;
            case 7:
                return;
            case 8:
                i2 i2Var = i2.U;
                if (i2Var != null) {
                    g0.r(i2Var.b.f.O);
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
