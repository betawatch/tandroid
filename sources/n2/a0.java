package n2;

import android.graphics.BlendMode;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import com.google.android.gms.tasks.OnSuccessListener;
import org.telegram.messenger.a8;
import org.telegram.messenger.j9;
import org.telegram.messenger.r2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements h2.o, g9.k, l5.g, j9, OnSuccessListener, q1 {
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

    @Override // org.telegram.ui.ActionBar.q1
    public void h(t1 t1Var, int i7) {
        t1Var.dismiss();
    }

    @Override // h2.o
    public void invoke(Object obj) {
        v vVar;
        switch (this.a) {
            case 0:
                n0 n0Var = (n0) obj;
                n0Var.getClass();
                r0.c0.getAndDecrement();
                v vVar2 = n0Var.b.n;
                if (vVar2 != null) {
                    int i7 = n0Var.a.a;
                    vVar2.f(new s0());
                    break;
                }
                break;
            case 1:
                n0 n0Var2 = (n0) obj;
                r0 r0Var = n0Var2.b;
                if (n0Var2.equals(r0Var.j) && (vVar = r0Var.n) != null && r0Var.O) {
                    vVar.n0();
                    break;
                }
                break;
            case 2:
                n0 n0Var3 = (n0) obj;
                r0 r0Var2 = n0Var3.b;
                if (n0Var3.equals(r0Var2.j) && r0Var2.M) {
                    r0Var2.N = true;
                    break;
                }
                break;
            default:
                v vVar3 = ((m0) obj).a.n;
                if (vVar3 != null) {
                    vVar3.G();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.j9
    public Object o(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 14:
                Typeface typeface = org.telegram.messenger.g0.a;
                return "%s";
            default:
                return "%" + (num.intValue() + 1) + "$s";
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z10 = r2.a;
        a8.b("sms listener registered");
    }

    @Override // l5.g
    public void a(Exception exc) {
    }
}
