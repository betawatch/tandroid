package hg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.pm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class h0 extends pm0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public String e;
    public final /* synthetic */ j0 f;

    public h0(j0 j0Var, Context context) {
        this.f = j0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return d1Var.f == 0;
    }

    @Override // s4.i0
    public final int h() {
        return this.d.size() + 2;
    }

    @Override // s4.i0
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == h() - 1 ? 2 : 0;
    }

    @Override // s4.i0
    public final void l() {
        super.l();
        this.f.O();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // s4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.d1 d1Var, int i10) {
        Object obj;
        if (d1Var.f != 0) {
            return;
        }
        y1 y1Var = (y1) d1Var.a;
        boolean z10 = i10 != h() + (-2);
        int i11 = i10 - 1;
        if (i11 >= 0) {
            ArrayList arrayList = this.d;
            if (i11 < arrayList.size()) {
                obj = arrayList.get(i11);
                if (obj instanceof b2) {
                    return;
                }
                b2 b2Var = (b2) obj;
                y1Var.a(b2Var, this.e, z10);
                y1Var.d.a(this.f.w.contains(Integer.valueOf(b2Var.a)), false);
                return;
            }
        }
        obj = null;
        if (obj instanceof b2) {
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View y1Var;
        Context context = this.c;
        if (i10 == 0) {
            y1Var = new y1(context, this.f.a, false);
        } else if (i10 != 1) {
            y1Var = new View(context);
            y1Var.setTag(-33024);
        } else {
            y1Var = new View(context);
            y1Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
            y1Var.setTag(-33024);
        }
        return new am0(y1Var);
    }
}
