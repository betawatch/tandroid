// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class d72 extends c79 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final /* synthetic */ f72 f;

    public d72(f72 f72Var, Context context) {
        this.f = f72Var;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 0;
    }

    @Override // j79
    public final int b() {
        return this.d.size() + 2;
    }

    @Override // j79
    public final int d(int i) {
        if (i == 0) {
            return 1;
        }
        return i == b() - 1 ? 2 : 0;
    }

    @Override // j79
    public final void f() {
        super.f();
        this.f.P();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        Object obj;
        if (f89Var.f != 0) {
            return;
        }
        v09 v09Var = (v09) f89Var.a;
        boolean z = i != b() + (-2);
        int i2 = i - 1;
        if (i2 >= 0) {
            ArrayList arrayList = this.d;
            if (i2 < arrayList.size()) {
                obj = arrayList.get(i2);
                if (obj instanceof a19) {
                    return;
                }
                a19 a19Var = (a19) obj;
                v09Var.a(a19Var, this.e, z);
                v09Var.d.a(this.f.x.contains(Integer.valueOf(a19Var.a)), false);
                return;
            }
        }
        obj = null;
        if (obj instanceof a19) {
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View v09Var;
        Context context = this.c;
        if (i == 0) {
            v09Var = new v09(this.f.a, context, false);
        } else if (i != 1) {
            v09Var = new View(context);
            v09Var.setTag(-33024);
        } else {
            v09Var = new View(context);
            v09Var.setLayoutParams(new r79(-1, hl.L(56.0f)));
            v09Var.setTag(-33024);
        }
        return new n69(v09Var);
    }
}
