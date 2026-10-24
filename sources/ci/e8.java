package ci;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.n60;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class e8 extends z4.a {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ Context d;
    public final /* synthetic */ z9 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 f;
    public final /* synthetic */ p9 g;

    public e8(p9 p9Var, Context context, z9 z9Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.g = p9Var;
        this.d = context;
        this.e = z9Var;
        this.f = g6Var;
    }

    @Override // z4.a
    public final void a(z4.h hVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        hVar.removeView(frameLayout);
        p4 p4Var = (p4) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(p4Var);
        this.c.add(p4Var);
    }

    @Override // z4.a
    public final int b() {
        p9 p9Var = this.g;
        ArrayList arrayList = p9Var.x0;
        return arrayList != null ? arrayList.size() : p9Var.A0.size();
    }

    @Override // z4.a
    public final Object e(z4.h hVar, int i10) {
        p4 d8Var;
        Context context = this.d;
        p9 p9Var = this.g;
        g8 g8Var = new g8(p9Var, context);
        ArrayList arrayList = this.c;
        boolean isEmpty = arrayList.isEmpty();
        z9 z9Var = this.e;
        if (isEmpty) {
            d8Var = new d8(this, this.d, z9Var, p9Var.H0, this.f);
        } else {
            d8Var = (p4) arrayList.remove(0);
            d8Var.o1.a.getImageReceiver().setVisible(true, true);
            if (d8Var.e2 != null) {
                d8Var.b2.N0();
                d8Var.b2.setAlpha(1.0f - d8Var.d4);
            }
            gl0 gl0Var = d8Var.f2;
            if (gl0Var != null) {
                gl0Var.n();
            }
            gl0 gl0Var2 = d8Var.r3;
            if (gl0Var2 != null) {
                gl0Var2.n();
            }
            n60 n60Var = d8Var.J2;
            if (n60Var != null) {
                AndroidUtilities.removeFromParent(n60Var);
                d8Var.J2.c(true);
                d8Var.J2 = null;
            }
            d8Var.setActive(false);
            d8Var.setIsVisible(false);
            d8Var.L2 = false;
            d8Var.O2.d(0.0f, false);
            d8Var.l1 = null;
            d8Var.i3 = false;
            d8Var.o0();
        }
        g8Var.a = d8Var;
        d8Var.setAccount(p9Var.y0);
        d8Var.setDelegate(p9Var.B0);
        d8Var.setLongpressed(z9Var.a1);
        g8Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = p9Var.x0;
        if (arrayList2 != null) {
            if (z9Var.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            g8Var.c = arrayList3;
            z6 z6Var = z9Var.O0;
            if ((z6Var instanceof t6) || (z6Var instanceof c7)) {
                MessageObject f7 = z6Var.f(((Integer) arrayList3.get(0)).intValue());
                g8Var.b = f7 == null ? p9Var.w0 : f7.getDialogId();
            } else {
                g8Var.b = p9Var.w0;
            }
        } else {
            g8Var.c = null;
            g8Var.b = ((Long) p9Var.A0.get(i10)).longValue();
        }
        g8Var.addView(d8Var);
        d8Var.requestLayout();
        hVar.addView(g8Var);
        return g8Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
