// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class n62 extends n39 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final /* synthetic */ p62 f;

    public n62(p62 p62Var, Context context) {
        this.f = p62Var;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 0;
    }

    @Override // w39
    public final int b() {
        return this.d.size() + 2;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return 1;
        }
        return i == b() - 1 ? 2 : 0;
    }

    @Override // w39
    public final void f() {
        super.f();
        this.f.Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        Object obj;
        if (s49Var.f != 0) {
            return;
        }
        jx8 jx8Var = (jx8) s49Var.a;
        boolean z = i != b() + (-2);
        int i2 = i - 1;
        if (i2 >= 0) {
            ArrayList arrayList = this.d;
            if (i2 < arrayList.size()) {
                obj = arrayList.get(i2);
                if (obj instanceof nx8) {
                    return;
                }
                nx8 nx8Var = (nx8) obj;
                jx8Var.a(nx8Var, this.e, z);
                jx8Var.d.a(this.f.x.contains(Integer.valueOf(nx8Var.a)), false);
                return;
            }
        }
        obj = null;
        if (obj instanceof nx8) {
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View jx8Var;
        Context context = this.c;
        if (i == 0) {
            jx8Var = new jx8(this.f.a, context, false);
        } else if (i != 1) {
            jx8Var = new View(context);
            jx8Var.setTag(-33024);
        } else {
            jx8Var = new View(context);
            jx8Var.setLayoutParams(new e49(-1, gl.L(56.0f)));
            jx8Var.setTag(-33024);
        }
        return new y29(jx8Var);
    }
}
