package j2;

import android.media.AudioDescriptor;
import android.os.SystemClock;
import b2.o0;
import b2.w;
import e2.m0;
import e2.o;
import k2.i0;
import k2.p0;
import k2.q0;
import k2.t0;
import k2.u0;
import k2.x;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                ((b) obj).getClass();
                break;
            case 22:
                ((b) obj).getClass();
                break;
            case 23:
            case 24:
            case 25:
            case 26:
            default:
                p0 p0Var = (p0) obj;
                t0 t0Var = p0Var.b;
                if (p0Var.equals(t0Var.j) && (xVar = t0Var.n) != null && t0Var.O) {
                    xVar.U();
                    break;
                }
                break;
            case 27:
                p0 p0Var2 = (p0) obj;
                t0 t0Var2 = p0Var2.b;
                if (p0Var2.equals(t0Var2.j) && t0Var2.n != null) {
                    q0 q0Var = t0Var2.p;
                    int i10 = q0Var.b;
                    if (i10 != -1) {
                        long j11 = ((k2.o) q0Var.e).f / i10;
                        i0 i0Var = t0Var2.t;
                        i0Var.getClass();
                        j10 = m0.Y(i0Var.a.getSampleRate(), j11);
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    t0Var2.n.t(((k2.o) t0Var2.p.e).f, m0.h0(j10), SystemClock.elapsedRealtime() - t0Var2.W);
                    break;
                }
                break;
            case 28:
                p0 p0Var3 = (p0) obj;
                p0Var3.getClass();
                t0.c0.getAndDecrement();
                x xVar2 = p0Var3.b.n;
                if (xVar2 != null) {
                    int i11 = p0Var3.a.a;
                    xVar2.T(new u0());
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e(a aVar, float f7) {
        this.a = 22;
    }

    public /* synthetic */ e(a aVar, int i10) {
        this.a = i10;
    }

    public /* synthetic */ e(a aVar, int i10, int i11) {
        this.a = i11;
    }

    public /* synthetic */ e(a aVar, long j10) {
        this.a = 13;
    }

    public /* synthetic */ e(a aVar, w wVar, i2.g gVar, int i10) {
        this.a = i10;
    }

    public /* synthetic */ e(a aVar, o0 o0Var, int i10) {
        this.a = 21;
    }

    public /* synthetic */ e(a aVar, Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ e(a aVar, boolean z10, int i10) {
        this.a = i10;
    }
}
