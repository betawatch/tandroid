package n2;

import android.graphics.BlendMode;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.os.SystemClock;
import com.google.android.gms.tasks.OnSuccessListener;
import org.telegram.messenger.a8;
import org.telegram.messenger.i9;
import org.telegram.messenger.s2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements h2.o, g9.k, l5.g, i9, OnSuccessListener, q1 {
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

    @Override // org.telegram.messenger.i9
    public Object h(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 15:
                Typeface typeface = org.telegram.messenger.g0.a;
                return "%s";
            default:
                return "%" + (num.intValue() + 1) + "$s";
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(t1 t1Var, int i7) {
        t1Var.dismiss();
    }

    @Override // h2.o
    public void invoke(Object obj) {
        long j3;
        v vVar;
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) obj;
                s0 s0Var = o0Var.b;
                if (o0Var.equals(s0Var.j) && s0Var.n != null) {
                    p0 p0Var = s0Var.p;
                    int i7 = p0Var.b;
                    if (i7 != -1) {
                        long j10 = ((n) p0Var.e).f / i7;
                        h0 h0Var = s0Var.t;
                        h0Var.getClass();
                        j3 = h2.l0.Y(h0Var.a.getSampleRate(), j10);
                    } else {
                        j3 = -9223372036854775807L;
                    }
                    s0Var.n.k0(h2.l0.h0(j3), ((n) s0Var.p.e).f, SystemClock.elapsedRealtime() - s0Var.W);
                    break;
                }
                break;
            case 1:
                o0 o0Var2 = (o0) obj;
                o0Var2.getClass();
                s0.c0.getAndDecrement();
                v vVar2 = o0Var2.b.n;
                if (vVar2 != null) {
                    int i10 = o0Var2.a.a;
                    vVar2.f(new t0());
                    break;
                }
                break;
            case 2:
                o0 o0Var3 = (o0) obj;
                s0 s0Var2 = o0Var3.b;
                if (o0Var3.equals(s0Var2.j) && (vVar = s0Var2.n) != null && s0Var2.O) {
                    vVar.f0();
                    break;
                }
                break;
            case 3:
                o0 o0Var4 = (o0) obj;
                s0 s0Var3 = o0Var4.b;
                if (o0Var4.equals(s0Var3.j) && s0Var3.M) {
                    s0Var3.N = true;
                    break;
                }
                break;
            default:
                v vVar3 = ((n0) obj).a.n;
                if (vVar3 != null) {
                    vVar3.N();
                    break;
                }
                break;
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
