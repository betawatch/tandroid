package l2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.media.AudioDescriptor;
import android.os.SystemClock;
import com.google.firebase.FirebaseCommonRegistrar;
import g2.p;
import g9.i0;
import m2.h0;
import m2.n;
import m2.n0;
import m2.o0;
import m2.p0;
import m2.s0;
import m2.t0;
import m2.x;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.s1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements p, p1, f9.k, k5.g, bb.d {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i3) {
        this.a = i3;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor d(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override // bb.d
    public String a(Context context) {
        switch (this.a) {
            case 28:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            default:
                return FirebaseCommonRegistrar.a(context);
        }
    }

    @Override // f9.k
    public Object apply(Object obj) {
        return i0.u(Integer.valueOf(((x2.i) obj).a));
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(s1 s1Var, int i3) {
        switch (this.a) {
            case 14:
                s1Var.dismiss();
                break;
            default:
                s1Var.dismiss();
                break;
        }
    }

    @Override // g2.p
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
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                x xVar2 = ((n0) obj).a.n;
                if (xVar2 != null) {
                    xVar2.G();
                    break;
                }
                break;
            case 18:
                o0 o0Var = (o0) obj;
                s0 s0Var = o0Var.b;
                if (o0Var.equals(s0Var.j) && s0Var.n != null) {
                    p0 p0Var = s0Var.p;
                    int i3 = p0Var.b;
                    if (i3 != -1) {
                        long j11 = ((n) p0Var.e).f / i3;
                        h0 h0Var = s0Var.t;
                        h0Var.getClass();
                        j10 = g2.n0.Y(h0Var.a.getSampleRate(), j11);
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    s0Var.n.e0(g2.n0.h0(j10), ((n) s0Var.p.e).f, SystemClock.elapsedRealtime() - s0Var.W);
                    break;
                }
                break;
            case 19:
                o0 o0Var2 = (o0) obj;
                o0Var2.getClass();
                s0.c0.getAndDecrement();
                x xVar3 = o0Var2.b.n;
                if (xVar3 != null) {
                    int i10 = o0Var2.a.a;
                    xVar3.v(new t0());
                    break;
                }
                break;
            case 20:
                o0 o0Var3 = (o0) obj;
                s0 s0Var2 = o0Var3.b;
                if (o0Var3.equals(s0Var2.j) && (xVar = s0Var2.n) != null && s0Var2.O) {
                    xVar.Z();
                    break;
                }
                break;
            case 21:
                o0 o0Var4 = (o0) obj;
                s0 s0Var3 = o0Var4.b;
                if (o0Var4.equals(s0Var3.j) && s0Var3.M) {
                    s0Var3.N = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d(a aVar) {
        this.a = 4;
    }

    public /* synthetic */ d(a aVar, float f10) {
        this.a = 11;
    }

    public /* synthetic */ d(a aVar, int i3) {
        this.a = 9;
    }

    public /* synthetic */ d(a aVar, long j10) {
        this.a = 2;
    }

    public /* synthetic */ d(a aVar, d2.n0 n0Var, int i3) {
        this.a = 10;
    }

    public /* synthetic */ d(a aVar, Object obj, int i3) {
        this.a = i3;
    }

    public /* synthetic */ d(a aVar, boolean z10) {
        this.a = 6;
    }

    @Override // k5.g
    public void b(Exception exc) {
    }
}
