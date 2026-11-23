package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f0 extends dk0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final /* synthetic */ h0 f;

    public f0(h0 h0Var, Context context) {
        this.f = h0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 0;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.size() + 2;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        return i7 == b() - 1 ? 2 : 0;
    }

    @Override // v4.i0
    public final void f() {
        super.f();
        this.f.Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        Object obj;
        if (f1Var.f != 0) {
            return;
        }
        s1 s1Var = (s1) f1Var.a;
        boolean z10 = i7 != b() + (-2);
        int i10 = i7 - 1;
        if (i10 >= 0) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                obj = arrayList.get(i10);
                if (obj instanceof v1) {
                    return;
                }
                v1 v1Var = (v1) obj;
                s1Var.a(v1Var, this.e, z10);
                s1Var.d.a(this.f.x.contains(Integer.valueOf(v1Var.a)), false);
                return;
            }
        }
        obj = null;
        if (obj instanceof v1) {
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View s1Var;
        Context context = this.c;
        if (i7 == 0) {
            s1Var = new s1(context, this.f.a, false);
        } else if (i7 != 1) {
            s1Var = new View(context);
            s1Var.setTag(-33024);
        } else {
            s1Var = new View(context);
            s1Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
            s1Var.setTag(-33024);
        }
        return new mj0(s1Var);
    }
}
