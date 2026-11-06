package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class e0 extends oj0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final /* synthetic */ g0 f;

    public e0(g0 g0Var, Context context) {
        this.f = g0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 0;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.size() + 2;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        return i7 == b() - 1 ? 2 : 0;
    }

    @Override // v4.g0
    public final void f() {
        super.f();
        this.f.P();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        Object obj;
        if (d1Var.f != 0) {
            return;
        }
        p1 p1Var = (p1) d1Var.a;
        boolean z9 = i7 != b() + (-2);
        int i10 = i7 - 1;
        if (i10 >= 0) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                obj = arrayList.get(i10);
                if (obj instanceof s1) {
                    return;
                }
                s1 s1Var = (s1) obj;
                p1Var.a(s1Var, this.e, z9);
                p1Var.d.a(this.f.x.contains(Integer.valueOf(s1Var.a)), false);
                return;
            }
        }
        obj = null;
        if (obj instanceof s1) {
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View p1Var;
        Context context = this.c;
        if (i7 == 0) {
            p1Var = new p1(context, this.f.a, false);
        } else if (i7 != 1) {
            p1Var = new View(context);
            p1Var.setTag(-33024);
        } else {
            p1Var = new View(context);
            p1Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
            p1Var.setTag(-33024);
        }
        return new xi0(p1Var);
    }
}
