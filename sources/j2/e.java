package j2;

import android.media.AudioDescriptor;
import android.os.SystemClock;
import e2.m0;
import e2.o;
import k2.h0;
import k2.n0;
import k2.o0;
import k2.p0;
import k2.s0;
import k2.t0;
import k2.x;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements o {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor b(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override // e2.o
    public void invoke(Object obj) {
        long j10;
        x xVar;
        switch (this.a) {
            case 0:
                ((b) obj).getClass();
                break;
            case 1:
                ((b) obj).getClass();
                break;
            case 2:
                ((b) obj).getClass();
                break;
            case 3:
                ((b) obj).getClass();
                break;
            case 4:
                ((b) obj).getClass();
                break;
            case 5:
                ((b) obj).getClass();
                break;
            case 6:
                ((b) obj).getClass();
                break;
            case 7:
                ((b) obj).getClass();
                break;
            case 8:
                ((b) obj).getClass();
                break;
            case 9:
                ((b) obj).getClass();
                break;
            case 10:
                ((b) obj).getClass();
                break;
            case 11:
                ((b) obj).getClass();
                break;
            case 12:
                ((b) obj).getClass();
                break;
            case 13:
                ((b) obj).getClass();
                break;
            case 14:
                ((b) obj).getClass();
                break;
            case 15:
                ((b) obj).getClass();
                break;
            case 16:
                ((b) obj).getClass();
                break;
            case 17:
                ((b) obj).getClass();
                break;
            case 18:
                ((b) obj).getClass();
                break;
            case 19:
                ((b) obj).getClass();
                break;
            case 20:
                ((b) obj).getClass();
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                x xVar2 = ((n0) obj).a.n;
                if (xVar2 != null) {
                    xVar2.w();
                    break;
                }
                break;
            case 25:
                o0 o0Var = (o0) obj;
                s0 s0Var = o0Var.b;
                if (o0Var.equals(s0Var.j) && s0Var.n != null) {
                    p0 p0Var = s0Var.p;
                    int i10 = p0Var.b;
                    if (i10 != -1) {
                        long j11 = ((k2.o) p0Var.e).f / i10;
                        h0 h0Var = s0Var.t;
                        h0Var.getClass();
                        j10 = m0.Y(h0Var.a.getSampleRate(), j11);
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    s0Var.n.t(((k2.o) s0Var.p.e).f, m0.h0(j10), SystemClock.elapsedRealtime() - s0Var.W);
                    break;
                }
                break;
            case 26:
                o0 o0Var2 = (o0) obj;
                o0Var2.getClass();
                s0.c0.getAndDecrement();
                x xVar3 = o0Var2.b.n;
                if (xVar3 != null) {
                    int i11 = o0Var2.a.a;
                    xVar3.F(new t0());
                    break;
                }
                break;
            case 27:
                o0 o0Var3 = (o0) obj;
                s0 s0Var2 = o0Var3.b;
                if (o0Var3.equals(s0Var2.j) && (xVar = s0Var2.n) != null && s0Var2.O) {
                    xVar.G();
                    break;
                }
                break;
            case 28:
                o0 o0Var4 = (o0) obj;
                s0 s0Var3 = o0Var4.b;
                if (o0Var4.equals(s0Var3.j) && s0Var3.M) {
                    s0Var3.N = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e(a aVar, float f7) {
        this.a = 20;
    }

    public /* synthetic */ e(a aVar, int i10) {
        this.a = i10;
    }

    public /* synthetic */ e(a aVar, int i10, int i11) {
        this.a = i11;
    }

    public /* synthetic */ e(a aVar, long j10) {
        this.a = 11;
    }

    public /* synthetic */ e(a aVar, b2.x xVar, i2.f fVar) {
        this.a = 2;
    }

    public /* synthetic */ e(a aVar, b2.p0 p0Var, int i10) {
        this.a = 19;
    }

    public /* synthetic */ e(a aVar, Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ e(a aVar, boolean z10, int i10) {
        this.a = i10;
    }
}
