package jh;

import a8.qd;
import android.graphics.Bitmap;
import android.media.AudioDescriptor;
import android.os.Bundle;
import android.os.SystemClock;
import e2.n0;
import e2.o;
import f9.i0;
import java.util.List;
import k2.j0;
import k2.p;
import k2.p0;
import k2.q0;
import k2.r0;
import k2.u0;
import k2.v0;
import k2.y;
import m4.e0;
import m4.f0;
import m4.g1;
import m4.h1;
import m4.n1;
import m4.p1;
import m4.r;
import m4.t1;
import m4.v;
import m4.w;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements ih.b, o, e9.k, e0, h1, e2.j, g1 {
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor e(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override // ih.b
    public Object a(Bitmap bitmap) {
        switch (this.a) {
            case 0:
                int i10 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i10 = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(i10);
            default:
                int i11 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    i11 = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                }
                return Integer.valueOf(i11);
        }
    }

    @Override // e2.j
    public void accept(Object obj) {
        n1 n1Var = (n1) obj;
        switch (this.a) {
            case 15:
                n1Var.B0();
                break;
            case 16:
                n1Var.e();
                break;
            case 17:
                n1Var.f0();
                break;
            case 18:
            case 23:
            default:
                n1Var.K();
                break;
            case 19:
                n1Var.C0();
                break;
            case 20:
                n1Var.J0();
                break;
            case 21:
                n1Var.V();
                break;
            case 22:
                n1Var.E();
                break;
            case 24:
                n1Var.I0();
                break;
            case 25:
                n1Var.H0();
                break;
        }
    }

    @Override // e9.k
    public Object apply(Object obj) {
        return i0.y(Integer.valueOf(((v2.i) obj).a));
    }

    @Override // m4.g1
    public void b(n1 n1Var, w wVar, List list) {
        switch (this.a) {
            case 28:
                n1Var.x0(list);
                break;
            default:
                n1Var.x0(list);
                break;
        }
    }

    @Override // m4.h1
    public Object c(f0 f0Var, w wVar, int i10) {
        switch (this.a) {
            case 13:
                f0Var.getClass();
                throw new ClassCastException();
            case 14:
                f0Var.getClass();
                throw new ClassCastException();
            case 18:
                return f0Var.n(wVar);
            case 23:
                f0Var.getClass();
                throw new ClassCastException();
            default:
                qb.a aVar = f0Var.e;
                f0Var.s(wVar);
                aVar.getClass();
                return qd.b(new t1(-6));
        }
    }

    @Override // m4.e0
    public void d(v vVar, int i10) {
        switch (this.a) {
            case 10:
                vVar.getClass();
                break;
            case 11:
                vVar.b(i10);
                break;
            default:
                vVar.getClass();
                break;
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        long j10;
        y yVar;
        switch (this.a) {
            case 3:
                q0 q0Var = (q0) obj;
                u0 u0Var = q0Var.b;
                if (q0Var.equals(u0Var.j) && u0Var.n != null) {
                    r0 r0Var = u0Var.p;
                    int i10 = r0Var.b;
                    if (i10 != -1) {
                        long j11 = ((p) r0Var.e).f / i10;
                        j0 j0Var = u0Var.t;
                        j0Var.getClass();
                        j10 = n0.Y(j0Var.a.getSampleRate(), j11);
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    u0Var.n.m(((p) u0Var.p.e).f, n0.h0(j10), SystemClock.elapsedRealtime() - u0Var.W);
                    break;
                }
                break;
            case 4:
                q0 q0Var2 = (q0) obj;
                q0Var2.getClass();
                u0.c0.getAndDecrement();
                y yVar2 = q0Var2.b.n;
                if (yVar2 != null) {
                    int i11 = q0Var2.a.a;
                    yVar2.J(new v0());
                    break;
                }
                break;
            case 5:
                q0 q0Var3 = (q0) obj;
                u0 u0Var2 = q0Var3.b;
                if (q0Var3.equals(u0Var2.j) && (yVar = u0Var2.n) != null && u0Var2.O) {
                    yVar.N();
                    break;
                }
                break;
            case 6:
                q0 q0Var4 = (q0) obj;
                u0 u0Var3 = q0Var4.b;
                if (q0Var4.equals(u0Var3.j) && u0Var3.M) {
                    u0Var3.N = true;
                    break;
                }
                break;
            default:
                y yVar3 = ((p0) obj).a.n;
                if (yVar3 != null) {
                    yVar3.n();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ l(String str, int i10, int i11, r rVar) {
        this.a = 14;
    }

    public /* synthetic */ l(String str, b2.h1 h1Var) {
        this.a = 26;
    }

    public /* synthetic */ l(boolean z10, p1 p1Var, Bundle bundle) {
        this.a = 18;
    }
}
