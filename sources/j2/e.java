package j2;

import android.media.AudioDescriptor;
import android.os.SystemClock;
import b2.p0;
import b2.x;
import com.google.android.gms.tasks.OnFailureListener;
import e2.l0;
import e2.o;
import jg.v2;
import k2.j0;
import k2.s0;
import k2.w0;
import k2.x0;
import k2.z;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements o, OnFailureListener {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor a(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override // e2.o
    public void invoke(Object obj) {
        long j10;
        z zVar;
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
            case 23:
            case 24:
            case 25:
            default:
                s0 s0Var = (s0) obj;
                w0 w0Var = s0Var.b;
                if (s0Var.equals(w0Var.j) && w0Var.M) {
                    w0Var.N = true;
                    break;
                }
                break;
            case 26:
                s0 s0Var2 = (s0) obj;
                w0 w0Var2 = s0Var2.b;
                if (s0Var2.equals(w0Var2.j) && w0Var2.n != null) {
                    ji.a aVar = w0Var2.p;
                    int i10 = aVar.b;
                    if (i10 != -1) {
                        long j11 = ((k2.o) aVar.e).f / i10;
                        j0 j0Var = w0Var2.t;
                        j0Var.getClass();
                        j10 = l0.Y(j0Var.a.getSampleRate(), j11);
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    w0Var2.n.i0(l0.h0(j10), ((k2.o) w0Var2.p.e).f, SystemClock.elapsedRealtime() - w0Var2.W);
                    break;
                }
                break;
            case 27:
                s0 s0Var3 = (s0) obj;
                s0Var3.getClass();
                w0.c0.getAndDecrement();
                z zVar2 = s0Var3.b.n;
                if (zVar2 != null) {
                    int i11 = s0Var3.a.a;
                    zVar2.e0(new x0());
                    break;
                }
                break;
            case 28:
                s0 s0Var4 = (s0) obj;
                w0 w0Var3 = s0Var4.b;
                if (s0Var4.equals(w0Var3.j) && (zVar = w0Var3.n) != null && w0Var3.O) {
                    zVar.f0();
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i10 = v2.r0;
    }

    public /* synthetic */ e(a aVar, float f7) {
        this.a = 21;
    }

    public /* synthetic */ e(a aVar, int i10) {
        this.a = i10;
    }

    public /* synthetic */ e(a aVar, int i10, int i11) {
        this.a = i11;
    }

    public /* synthetic */ e(a aVar, long j10) {
        this.a = 12;
    }

    public /* synthetic */ e(a aVar, x xVar, i2.e eVar) {
        this.a = 3;
    }

    public /* synthetic */ e(a aVar, p0 p0Var, int i10) {
        this.a = 20;
    }

    public /* synthetic */ e(a aVar, Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ e(a aVar, boolean z10, int i10) {
        this.a = i10;
    }
}
