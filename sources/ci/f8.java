package ci;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.m60;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class f8 extends z4.a {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ Context d;
    public final /* synthetic */ aa e;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 f;
    public final /* synthetic */ q9 g;

    public f8(q9 q9Var, Context context, aa aaVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.g = q9Var;
        this.d = context;
        this.e = aaVar;
        this.f = d6Var;
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        q4 q4Var = (q4) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(q4Var);
        this.c.add(q4Var);
    }

    @Override // z4.a
    public final int b() {
        q9 q9Var = this.g;
        ArrayList arrayList = q9Var.x0;
        return arrayList != null ? arrayList.size() : q9Var.A0.size();
    }

    @Override // z4.a
    public final Object e(z4.g gVar, int i10) {
        q4 e8Var;
        Context context = this.d;
        q9 q9Var = this.g;
        h8 h8Var = new h8(q9Var, context);
        ArrayList arrayList = this.c;
        boolean isEmpty = arrayList.isEmpty();
        aa aaVar = this.e;
        if (isEmpty) {
            e8Var = new e8(this, this.d, aaVar, q9Var.H0, this.f);
        } else {
            e8Var = (q4) arrayList.remove(0);
            e8Var.o1.a.getImageReceiver().setVisible(true, true);
            if (e8Var.e2 != null) {
                e8Var.b2.N0();
                e8Var.b2.setAlpha(1.0f - e8Var.d4);
            }
            cl0 cl0Var = e8Var.f2;
            if (cl0Var != null) {
                cl0Var.n();
            }
            cl0 cl0Var2 = e8Var.r3;
            if (cl0Var2 != null) {
                cl0Var2.n();
            }
            m60 m60Var = e8Var.J2;
            if (m60Var != null) {
                AndroidUtilities.removeFromParent(m60Var);
                e8Var.J2.c(true);
                e8Var.J2 = null;
            }
            e8Var.setActive(false);
            e8Var.setIsVisible(false);
            e8Var.L2 = false;
            e8Var.O2.d(0.0f, false);
            e8Var.l1 = null;
            e8Var.i3 = false;
            e8Var.p0();
        }
        h8Var.a = e8Var;
        e8Var.setAccount(q9Var.y0);
        e8Var.setDelegate(q9Var.B0);
        e8Var.setLongpressed(aaVar.a1);
        h8Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = q9Var.x0;
        if (arrayList2 != null) {
            if (aaVar.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            h8Var.c = arrayList3;
            a7 a7Var = aaVar.O0;
            if ((a7Var instanceof u6) || (a7Var instanceof d7)) {
                MessageObject f7 = a7Var.f(((Integer) arrayList3.get(0)).intValue());
                h8Var.b = f7 == null ? q9Var.w0 : f7.getDialogId();
            } else {
                h8Var.b = q9Var.w0;
            }
        } else {
            h8Var.c = null;
            h8Var.b = ((Long) q9Var.A0.get(i10)).longValue();
        }
        h8Var.addView(e8Var);
        e8Var.requestLayout();
        gVar.addView(h8Var);
        return h8Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
