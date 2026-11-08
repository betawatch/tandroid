package m2;

import android.media.AudioDescriptor;
import android.os.SystemClock;
import e2.u;
import h2.o;
import n2.f0;
import n2.l0;
import n2.m0;
import n2.n;
import n2.n0;
import n2.q0;
import n2.r0;
import n2.v;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements o {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i7) {
        this.a = i7;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor a(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override // h2.o
    public void invoke(Object obj) {
        long j3;
        v vVar;
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
            case 20:
            case 21:
            case 22:
            default:
                v vVar2 = ((l0) obj).a.n;
                if (vVar2 != null) {
                    vVar2.H0();
                    break;
                }
                break;
            case 23:
                m0 m0Var = (m0) obj;
                q0 q0Var = m0Var.b;
                if (m0Var.equals(q0Var.j) && q0Var.n != null) {
                    n0 n0Var = q0Var.p;
                    int i7 = n0Var.b;
                    if (i7 != -1) {
                        long j10 = ((n) n0Var.e).f / i7;
                        f0 f0Var = q0Var.t;
                        f0Var.getClass();
                        j3 = h2.m0.Y(f0Var.a.getSampleRate(), j10);
                    } else {
                        j3 = -9223372036854775807L;
                    }
                    q0Var.n.O1(h2.m0.h0(j3), ((n) q0Var.p.e).f, SystemClock.elapsedRealtime() - q0Var.W);
                    break;
                }
                break;
            case 24:
                m0 m0Var2 = (m0) obj;
                m0Var2.getClass();
                q0.c0.getAndDecrement();
                v vVar3 = m0Var2.b.n;
                if (vVar3 != null) {
                    int i10 = m0Var2.a.a;
                    vVar3.i(new r0());
                    break;
                }
                break;
            case 25:
                m0 m0Var3 = (m0) obj;
                q0 q0Var2 = m0Var3.b;
                if (m0Var3.equals(q0Var2.j) && (vVar = q0Var2.n) != null && q0Var2.O) {
                    vVar.t1();
                    break;
                }
                break;
            case 26:
                m0 m0Var4 = (m0) obj;
                q0 q0Var3 = m0Var4.b;
                if (m0Var4.equals(q0Var3.j) && q0Var3.M) {
                    q0Var3.N = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d(a aVar, float f10) {
        this.a = 18;
    }

    public /* synthetic */ d(a aVar, int i7) {
        this.a = 16;
    }

    public /* synthetic */ d(a aVar, int i7, byte b10) {
        this.a = i7;
    }

    public /* synthetic */ d(a aVar, long j3) {
        this.a = 9;
    }

    public /* synthetic */ d(a aVar, u uVar, l2.e eVar) {
        this.a = 0;
    }

    public /* synthetic */ d(a aVar, e2.l0 l0Var, int i7) {
        this.a = 17;
    }

    public /* synthetic */ d(a aVar, Object obj, int i7) {
        this.a = i7;
    }

    public /* synthetic */ d(a aVar, boolean z9, int i7) {
        this.a = i7;
    }
}
