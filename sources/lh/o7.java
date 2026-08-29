package lh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.s50;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class o7 extends m2.a {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ Context d;
    public final /* synthetic */ i9 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 f;
    public final /* synthetic */ y8 g;

    public o7(y8 y8Var, Context context, i9 i9Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.g = y8Var;
        this.d = context;
        this.e = i9Var;
        this.f = c6Var;
    }

    @Override // m2.a
    public final void a(m2.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        d4 d4Var = (d4) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(d4Var);
        this.c.add(d4Var);
    }

    @Override // m2.a
    public final int b() {
        y8 y8Var = this.g;
        ArrayList arrayList = y8Var.t0;
        return arrayList != null ? arrayList.size() : y8Var.w0.size();
    }

    @Override // m2.a
    public final Object e(m2.g gVar, int i10) {
        d4 n7Var;
        Context context = this.d;
        y8 y8Var = this.g;
        q7 q7Var = new q7(y8Var, context);
        ArrayList arrayList = this.c;
        boolean isEmpty = arrayList.isEmpty();
        i9 i9Var = this.e;
        if (isEmpty) {
            n7Var = new n7(this, this.d, i9Var, y8Var.D0, this.f);
        } else {
            n7Var = (d4) arrayList.remove(0);
            n7Var.k1.a.getImageReceiver().setVisible(true, true);
            if (n7Var.a2 != null) {
                n7Var.X1.P0();
                n7Var.X1.setAlpha(1.0f - n7Var.Z3);
            }
            fk0 fk0Var = n7Var.b2;
            if (fk0Var != null) {
                fk0Var.n();
            }
            fk0 fk0Var2 = n7Var.n3;
            if (fk0Var2 != null) {
                fk0Var2.n();
            }
            s50 s50Var = n7Var.F2;
            if (s50Var != null) {
                AndroidUtilities.removeFromParent(s50Var);
                n7Var.F2.h(true);
                n7Var.F2 = null;
            }
            n7Var.setActive(false);
            n7Var.setIsVisible(false);
            n7Var.H2 = false;
            n7Var.K2.d(0.0f, false);
            n7Var.h1 = null;
            n7Var.e3 = false;
            n7Var.p0();
        }
        q7Var.a = n7Var;
        n7Var.setAccount(y8Var.u0);
        n7Var.setDelegate(y8Var.x0);
        n7Var.setLongpressed(i9Var.W0);
        q7Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = y8Var.t0;
        if (arrayList2 != null) {
            if (i9Var.N0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            q7Var.c = arrayList3;
            k6 k6Var = i9Var.K0;
            if ((k6Var instanceof e6) || (k6Var instanceof n6)) {
                MessageObject f9 = k6Var.f(((Integer) arrayList3.get(0)).intValue());
                q7Var.b = f9 == null ? y8Var.s0 : f9.getDialogId();
            } else {
                q7Var.b = y8Var.s0;
            }
        } else {
            q7Var.c = null;
            q7Var.b = ((Long) y8Var.w0.get(i10)).longValue();
        }
        q7Var.addView(n7Var);
        n7Var.requestLayout();
        gVar.addView(q7Var);
        return q7Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
