package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.p60;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class u9 extends z4.a {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ Context d;
    public final /* synthetic */ sb e;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 f;
    public final /* synthetic */ ib g;

    public u9(ib ibVar, Context context, sb sbVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.g = ibVar;
        this.d = context;
        this.e = sbVar;
        this.f = c6Var;
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        q5 q5Var = (q5) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(q5Var);
        this.c.add(q5Var);
    }

    @Override // z4.a
    public final int b() {
        ib ibVar = this.g;
        ArrayList arrayList = ibVar.x0;
        return arrayList != null ? arrayList.size() : ibVar.A0.size();
    }

    @Override // z4.a
    public final Object e(z4.g gVar, int i10) {
        q5 t9Var;
        Context context = this.d;
        ib ibVar = this.g;
        w9 w9Var = new w9(ibVar, context);
        ArrayList arrayList = this.c;
        boolean isEmpty = arrayList.isEmpty();
        sb sbVar = this.e;
        if (isEmpty) {
            t9Var = new t9(this, this.d, sbVar, ibVar.H0, this.f);
        } else {
            t9Var = (q5) arrayList.remove(0);
            t9Var.o1.a.getImageReceiver().setVisible(true, true);
            if (t9Var.e2 != null) {
                t9Var.b2.N0();
                t9Var.b2.setAlpha(1.0f - t9Var.d4);
            }
            gl0 gl0Var = t9Var.f2;
            if (gl0Var != null) {
                gl0Var.n();
            }
            gl0 gl0Var2 = t9Var.r3;
            if (gl0Var2 != null) {
                gl0Var2.n();
            }
            p60 p60Var = t9Var.J2;
            if (p60Var != null) {
                AndroidUtilities.removeFromParent(p60Var);
                t9Var.J2.c(true);
                t9Var.J2 = null;
            }
            t9Var.setActive(false);
            t9Var.setIsVisible(false);
            t9Var.L2 = false;
            t9Var.O2.d(0.0f, false);
            t9Var.l1 = null;
            t9Var.i3 = false;
            t9Var.p0();
        }
        w9Var.a = t9Var;
        t9Var.setAccount(ibVar.y0);
        t9Var.setDelegate(ibVar.B0);
        t9Var.setLongpressed(sbVar.a1);
        w9Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = ibVar.x0;
        if (arrayList2 != null) {
            if (sbVar.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            w9Var.c = arrayList3;
            o8 o8Var = sbVar.O0;
            if ((o8Var instanceof g8) || (o8Var instanceof r8)) {
                MessageObject f7 = o8Var.f(((Integer) arrayList3.get(0)).intValue());
                w9Var.b = f7 == null ? ibVar.w0 : f7.getDialogId();
            } else {
                w9Var.b = ibVar.w0;
            }
        } else {
            w9Var.c = null;
            w9Var.b = ((Long) ibVar.A0.get(i10)).longValue();
        }
        w9Var.addView(t9Var);
        t9Var.requestLayout();
        gVar.addView(w9Var);
        return w9Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
