package ih;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class r7 extends m2.a {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ Context d;
    public final /* synthetic */ m9 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 f;
    public final /* synthetic */ c9 g;

    public r7(c9 c9Var, Context context, m9 m9Var, org.telegram.ui.ActionBar.b6 b6Var) {
        this.g = c9Var;
        this.d = context;
        this.e = m9Var;
        this.f = b6Var;
    }

    @Override // m2.a
    public final void a(m2.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        i4 i4Var = (i4) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(i4Var);
        this.c.add(i4Var);
    }

    @Override // m2.a
    public final int b() {
        c9 c9Var = this.g;
        ArrayList arrayList = c9Var.t0;
        return arrayList != null ? arrayList.size() : c9Var.w0.size();
    }

    @Override // m2.a
    public final Object e(m2.g gVar, int i9) {
        i4 q7Var;
        Context context = this.d;
        c9 c9Var = this.g;
        t7 t7Var = new t7(c9Var, context);
        ArrayList arrayList = this.c;
        boolean isEmpty = arrayList.isEmpty();
        m9 m9Var = this.e;
        if (isEmpty) {
            q7Var = new q7(this, this.d, m9Var, c9Var.D0, this.f);
        } else {
            q7Var = (i4) arrayList.remove(0);
            q7Var.k1.a.getImageReceiver().setVisible(true, true);
            if (q7Var.a2 != null) {
                q7Var.X1.P0();
                q7Var.X1.setAlpha(1.0f - q7Var.Z3);
            }
            uj0 uj0Var = q7Var.b2;
            if (uj0Var != null) {
                uj0Var.n();
            }
            uj0 uj0Var2 = q7Var.n3;
            if (uj0Var2 != null) {
                uj0Var2.n();
            }
            f50 f50Var = q7Var.F2;
            if (f50Var != null) {
                AndroidUtilities.removeFromParent(f50Var);
                q7Var.F2.h(true);
                q7Var.F2 = null;
            }
            q7Var.setActive(false);
            q7Var.setIsVisible(false);
            q7Var.H2 = false;
            q7Var.K2.d(0.0f, false);
            q7Var.h1 = null;
            q7Var.e3 = false;
            q7Var.p0();
        }
        t7Var.a = q7Var;
        q7Var.setAccount(c9Var.u0);
        q7Var.setDelegate(c9Var.x0);
        q7Var.setLongpressed(m9Var.W0);
        t7Var.setTag(Integer.valueOf(i9));
        ArrayList arrayList2 = c9Var.t0;
        if (arrayList2 != null) {
            if (m9Var.N0) {
                i9 = (arrayList2.size() - 1) - i9;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i9);
            t7Var.c = arrayList3;
            n6 n6Var = m9Var.K0;
            if ((n6Var instanceof h6) || (n6Var instanceof q6)) {
                MessageObject f10 = n6Var.f(((Integer) arrayList3.get(0)).intValue());
                t7Var.b = f10 == null ? c9Var.s0 : f10.getDialogId();
            } else {
                t7Var.b = c9Var.s0;
            }
        } else {
            t7Var.c = null;
            t7Var.b = ((Long) c9Var.w0.get(i9)).longValue();
        }
        t7Var.addView(q7Var);
        q7Var.requestLayout();
        gVar.addView(t7Var);
        return t7Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
