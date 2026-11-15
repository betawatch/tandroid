package m2;

import android.media.AudioDescriptor;
import android.os.SystemClock;
import h2.l0;
import h2.o;
import n2.g0;
import n2.n;
import n2.n0;
import n2.o0;
import n2.r0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements o {
    public final /* synthetic */ int a;

    public /* synthetic */ c() {
        this.a = 29;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor a(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override // h2.o
    public void invoke(Object obj) {
        long j3;
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
                ((b) obj).getClass();
                break;
            case 24:
                ((b) obj).getClass();
                break;
            default:
                n0 n0Var = (n0) obj;
                r0 r0Var = n0Var.b;
                if (n0Var.equals(r0Var.j) && r0Var.n != null) {
                    o0 o0Var = r0Var.p;
                    int i7 = o0Var.b;
                    if (i7 != -1) {
                        long j10 = ((n) o0Var.e).f / i7;
                        g0 g0Var = r0Var.t;
                        g0Var.getClass();
                        j3 = l0.Y(g0Var.a.getSampleRate(), j10);
                    } else {
                        j3 = -9223372036854775807L;
                    }
                    r0Var.n.w0(l0.h0(j3), ((n) r0Var.p.e).f, SystemClock.elapsedRealtime() - r0Var.W);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c(a aVar, float f10) {
        this.a = 24;
    }

    public /* synthetic */ c(a aVar, int i7) {
        this.a = i7;
    }

    public /* synthetic */ c(a aVar, int i7, int i10) {
        this.a = i10;
    }

    public /* synthetic */ c(a aVar, long j3) {
        this.a = 15;
    }

    public /* synthetic */ c(a aVar, e2.l0 l0Var, int i7) {
        this.a = 23;
    }

    public /* synthetic */ c(a aVar, Object obj, int i7) {
        this.a = i7;
    }

    public /* synthetic */ c(a aVar, Object obj, Object obj2, int i7) {
        this.a = i7;
    }

    public /* synthetic */ c(a aVar, boolean z10, int i7) {
        this.a = i7;
    }
}
