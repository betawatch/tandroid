package n2;

import android.graphics.BlendMode;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.os.SystemClock;
import com.google.android.gms.tasks.OnSuccessListener;
import org.telegram.messenger.a8;
import org.telegram.messenger.i9;
import org.telegram.messenger.s2;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements h2.o, g9.k, l5.g, i9, OnSuccessListener, r1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a0(int i7) {
        this.a = i7;
    }

    public static /* bridge */ /* synthetic */ BlendMode c(Object obj) {
        return (BlendMode) obj;
    }

    public static /* bridge */ /* synthetic */ RenderNode d(Object obj) {
        return (RenderNode) obj;
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        return h9.i0.u(Integer.valueOf(((y2.i) obj).a));
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(u1 u1Var, int i7) {
        u1Var.dismiss();
    }

    @Override // h2.o
    public void invoke(Object obj) {
        long j3;
        v vVar;
        switch (this.a) {
            case 0:
                n0 n0Var = (n0) obj;
                r0 r0Var = n0Var.b;
                if (n0Var.equals(r0Var.j) && r0Var.n != null) {
                    o0 o0Var = r0Var.p;
                    int i7 = o0Var.b;
                    if (i7 != -1) {
                        long j10 = ((n) o0Var.e).f / i7;
                        g0 g0Var = r0Var.t;
                        g0Var.getClass();
                        j3 = h2.l0.Y(g0Var.a.getSampleRate(), j10);
                    } else {
                        j3 = -9223372036854775807L;
                    }
                    r0Var.n.W1(h2.l0.h0(j3), ((n) r0Var.p.e).f, SystemClock.elapsedRealtime() - r0Var.W);
                    break;
                }
                break;
            case 1:
                n0 n0Var2 = (n0) obj;
                n0Var2.getClass();
                r0.c0.getAndDecrement();
                v vVar2 = n0Var2.b.n;
                if (vVar2 != null) {
                    int i10 = n0Var2.a.a;
                    vVar2.k(new s0());
                    break;
                }
                break;
            case 2:
                n0 n0Var3 = (n0) obj;
                r0 r0Var2 = n0Var3.b;
                if (n0Var3.equals(r0Var2.j) && (vVar = r0Var2.n) != null && r0Var2.O) {
                    vVar.D1();
                    break;
                }
                break;
            case 3:
                n0 n0Var4 = (n0) obj;
                r0 r0Var3 = n0Var4.b;
                if (n0Var4.equals(r0Var3.j) && r0Var3.M) {
                    r0Var3.N = true;
                    break;
                }
                break;
            default:
                v vVar3 = ((m0) obj).a.n;
                if (vVar3 != null) {
                    vVar3.M0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.i9
    public Object m(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 15:
                Typeface typeface = org.telegram.messenger.g0.a;
                return "%s";
            default:
                return "%" + (num.intValue() + 1) + "$s";
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z10 = s2.a;
        a8.b("sms listener registered");
    }

    @Override // l5.g
    public void a(Exception exc) {
    }
}
