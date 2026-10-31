package m4;

import android.graphics.RenderNode;
import android.graphics.Typeface;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.List;
import org.telegram.messenger.f8;
import org.telegram.messenger.l9;
import org.telegram.messenger.v2;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.wb0;
import v7.p8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements g1, h1, e2.j, org.telegram.ui.ActionBar.u1, wb0, n2.l, d9.k, l9, OnSuccessListener {
    public final /* synthetic */ int a;

    public /* synthetic */ v0(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ RenderNode b(Object obj) {
        return (RenderNode) obj;
    }

    @Override // m4.g1
    public void a(n1 n1Var, w wVar, List list) {
        switch (this.a) {
            case 0:
                n1Var.x0(list);
                break;
            default:
                n1Var.x0(list);
                break;
        }
    }

    @Override // e2.j
    public void accept(Object obj) {
        n1 n1Var = (n1) obj;
        switch (this.a) {
            case 3:
                n1Var.stop();
                break;
            case 4:
                n1Var.b0();
                break;
            case 5:
                n1Var.G();
                break;
            case 6:
            default:
                n1Var.u();
                break;
            case 7:
                n1Var.a();
                break;
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.n0.u(e9.s.x(qVar.Y.b, new th.m1(4)));
    }

    @Override // org.telegram.ui.Components.wb0
    public String e(int i10) {
        switch (this.a) {
            case 14:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override // m4.h1
    public Object f(f0 f0Var, w wVar, int i10) {
        switch (this.a) {
            case 2:
                f0Var.getClass();
                throw new ClassCastException();
            case 6:
                f0Var.getClass();
                throw new ClassCastException();
            case 8:
                f0Var.getClass();
                throw new ClassCastException();
            case 10:
                f0Var.getClass();
                throw new ClassCastException();
            default:
                oa.d dVar = f0Var.e;
                f0Var.s(wVar);
                dVar.getClass();
                return p8.b(new t1(-6));
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(x1 x1Var, int i10) {
        switch (this.a) {
            case 13:
                break;
            case 14:
            case 15:
            default:
                x1Var.dismiss();
                break;
            case 16:
                x1Var.dismiss();
                break;
            case 17:
                x1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.l9
    public Object l(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 24:
                Typeface typeface = org.telegram.messenger.i0.a;
                return "%s";
            default:
                return "%" + (num.intValue() + 1) + "$s";
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z10 = v2.a;
        f8.b("sms listener registered");
    }

    public /* synthetic */ v0(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ v0(String str, int i10, int i11, r rVar) {
        this.a = 2;
    }

    public /* synthetic */ v0(String str, r rVar, int i10) {
        this.a = i10;
    }

    @Override // n2.l
    public void release() {
    }

    private final void d(x1 x1Var, int i10) {
    }
}
