package oh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.z50;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class o7 extends m2.a {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ Context d;
    public final /* synthetic */ i9 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 f;
    public final /* synthetic */ y8 g;

    public o7(y8 y8Var, Context context, i9 i9Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.g = y8Var;
        this.d = context;
        this.e = i9Var;
        this.f = g6Var;
    }

    @Override // m2.a
    public final void a(m2.h hVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        hVar.removeView(frameLayout);
        f4 f4Var = (f4) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(f4Var);
        this.c.add(f4Var);
    }

    @Override // m2.a
    public final int b() {
        y8 y8Var = this.g;
        ArrayList arrayList = y8Var.u0;
        return arrayList != null ? arrayList.size() : y8Var.x0.size();
    }

    @Override // m2.a
    public final Object e(m2.h hVar, int i10) {
        f4 n7Var;
        Context context = this.d;
        y8 y8Var = this.g;
        q7 q7Var = new q7(y8Var, context);
        ArrayList arrayList = this.c;
        boolean isEmpty = arrayList.isEmpty();
        i9 i9Var = this.e;
        if (isEmpty) {
            n7Var = new n7(this, this.d, i9Var, y8Var.E0, this.f);
        } else {
            n7Var = (f4) arrayList.remove(0);
            n7Var.l1.a.getImageReceiver().setVisible(true, true);
            if (n7Var.b2 != null) {
                n7Var.Y1.P0();
                n7Var.Y1.setAlpha(1.0f - n7Var.a4);
            }
            rk0 rk0Var = n7Var.c2;
            if (rk0Var != null) {
                rk0Var.n();
            }
            rk0 rk0Var2 = n7Var.o3;
            if (rk0Var2 != null) {
                rk0Var2.n();
            }
            z50 z50Var = n7Var.G2;
            if (z50Var != null) {
                AndroidUtilities.removeFromParent(z50Var);
                n7Var.G2.h(true);
                n7Var.G2 = null;
            }
            n7Var.setActive(false);
            n7Var.setIsVisible(false);
            n7Var.I2 = false;
            n7Var.L2.d(0.0f, false);
            n7Var.i1 = null;
            n7Var.f3 = false;
            n7Var.p0();
        }
        q7Var.a = n7Var;
        n7Var.setAccount(y8Var.v0);
        n7Var.setDelegate(y8Var.y0);
        n7Var.setLongpressed(i9Var.X0);
        q7Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = y8Var.u0;
        if (arrayList2 != null) {
            if (i9Var.O0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            q7Var.c = arrayList3;
            l6 l6Var = i9Var.L0;
            if ((l6Var instanceof f6) || (l6Var instanceof o6)) {
                MessageObject f10 = l6Var.f(((Integer) arrayList3.get(0)).intValue());
                q7Var.b = f10 == null ? y8Var.t0 : f10.getDialogId();
            } else {
                q7Var.b = y8Var.t0;
            }
        } else {
            q7Var.c = null;
            q7Var.b = ((Long) y8Var.x0.get(i10)).longValue();
        }
        q7Var.addView(n7Var);
        n7Var.requestLayout();
        hVar.addView(q7Var);
        return q7Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
