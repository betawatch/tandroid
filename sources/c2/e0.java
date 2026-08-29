package c2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j3.x1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e0 implements f5.n {
    public boolean a;
    public long b;
    public long c;
    public final Object d;
    public Object e;

    public e0(a4.g gVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = gVar;
    }

    public void a(long j10) {
        this.b = j10;
        if (this.a) {
            ((f5.y) this.d).getClass();
            this.c = SystemClock.elapsedRealtime();
        }
    }

    public void b() {
        if (this.a) {
            return;
        }
        ((f5.y) this.d).getClass();
        this.c = SystemClock.elapsedRealtime();
        this.a = true;
    }

    @Override // f5.n
    public x1 getPlaybackParameters() {
        return (x1) this.e;
    }

    @Override // f5.n
    public long getPositionUs() {
        long j10 = this.b;
        if (!this.a) {
            return j10;
        }
        ((f5.y) this.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        return (((x1) this.e).a == 1.0f ? f5.d0.H(elapsedRealtime) : elapsedRealtime * r4.c) + j10;
    }

    @Override // f5.n
    public void setPlaybackParameters(x1 x1Var) {
        if (this.a) {
            a(getPositionUs());
        }
        this.e = x1Var;
    }

    public e0(f5.y yVar) {
        this.d = yVar;
        this.e = x1.d;
    }
}
