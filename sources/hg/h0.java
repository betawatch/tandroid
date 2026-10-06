package hg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class h0 extends yl0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final /* synthetic */ j0 f;

    public h0(j0 j0Var, Context context) {
        this.f = j0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.size() + 2;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == h() - 1 ? 2 : 0;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        this.f.J();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        Object obj;
        if (c1Var.f != 0) {
            return;
        }
        x1 x1Var = (x1) c1Var.a;
        boolean z10 = i10 != h() + (-2);
        int i11 = i10 - 1;
        if (i11 >= 0) {
            ArrayList arrayList = this.d;
            if (i11 < arrayList.size()) {
                obj = arrayList.get(i11);
                if (obj instanceof a2) {
                    return;
                }
                a2 a2Var = (a2) obj;
                x1Var.a(a2Var, this.e, z10);
                x1Var.d.a(this.f.w.contains(Integer.valueOf(a2Var.a)), false);
                return;
            }
        }
        obj = null;
        if (obj instanceof a2) {
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View x1Var;
        Context context = this.c;
        if (i10 == 0) {
            x1Var = new x1(context, this.f.a, false);
        } else if (i10 != 1) {
            x1Var = new View(context);
            x1Var.setTag(-33024);
        } else {
            x1Var = new View(context);
            x1Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
            x1Var.setTag(-33024);
        }
        return new il0(x1Var);
    }
}
