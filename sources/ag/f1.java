package ag;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.sk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f1 extends sk0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final /* synthetic */ h1 f;

    public f1(h1 h1Var, Context context) {
        this.f = h1Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.size() + 2;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == b() - 1 ? 2 : 0;
    }

    @Override // s4.g0
    public final void f() {
        super.f();
        this.f.O();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        Object obj;
        if (c1Var.f != 0) {
            return;
        }
        y2 y2Var = (y2) c1Var.a;
        boolean z10 = i10 != b() + (-2);
        int i11 = i10 - 1;
        if (i11 >= 0) {
            ArrayList arrayList = this.d;
            if (i11 < arrayList.size()) {
                obj = arrayList.get(i11);
                if (obj instanceof h3) {
                    return;
                }
                h3 h3Var = (h3) obj;
                y2Var.a(h3Var, this.e, z10);
                y2Var.d.a(this.f.x.contains(Integer.valueOf(h3Var.a)), false);
                return;
            }
        }
        obj = null;
        if (obj instanceof h3) {
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View y2Var;
        Context context = this.c;
        if (i10 == 0) {
            y2Var = new y2(context, this.f.a, false);
        } else if (i10 != 1) {
            y2Var = new View(context);
            y2Var.setTag(-33024);
        } else {
            y2Var = new View(context);
            y2Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(56.0f)));
            y2Var.setTag(-33024);
        }
        return new ck0(y2Var);
    }
}
