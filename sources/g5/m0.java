package g5;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class m0 implements n0 {
    public static final c4.e d = new c4.e(0, -9223372036854775807L, false);
    public static final c4.e e = new c4.e(2, -9223372036854775807L, false);
    public static final c4.e f = new c4.e(3, -9223372036854775807L, false);
    public final ExecutorService a;
    public i0 b;
    public IOException c;

    public m0(String str) {
        String concat = "ExoPlayer:Loader:".concat(str);
        int i10 = h5.d0.a;
        this.a = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a(concat, 1));
    }

    @Override // g5.n0
    public final void a() {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        i0 i0Var = this.b;
        if (i0Var != null) {
            int i10 = i0Var.a;
            IOException iOException2 = i0Var.e;
            if (iOException2 != null && i0Var.f > i10) {
                throw iOException2;
            }
        }
    }

    public final void b() {
        i0 i0Var = this.b;
        h5.a.j(i0Var);
        i0Var.a(false);
    }

    public final boolean c() {
        return this.c != null;
    }

    public final boolean d() {
        return this.b != null;
    }

    public final void e(k0 k0Var) {
        i0 i0Var = this.b;
        if (i0Var != null) {
            i0Var.a(true);
        }
        ExecutorService executorService = this.a;
        if (k0Var != null) {
            executorService.execute(new androidx.activity.i(k0Var, 20));
        }
        executorService.shutdown();
    }

    public final long f(j0 j0Var, h0 h0Var, int i10) {
        Looper myLooper = Looper.myLooper();
        h5.a.j(myLooper);
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        i0 i0Var = new i0(this, myLooper, j0Var, h0Var, i10, elapsedRealtime);
        h5.a.i(this.b == null);
        this.b = i0Var;
        i0Var.e = null;
        this.a.execute(i0Var);
        return elapsedRealtime;
    }
}
