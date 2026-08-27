package jh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.wj0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class n7 extends m2.a {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ Context d;
    public final /* synthetic */ i9 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 f;
    public final /* synthetic */ y8 g;

    public n7(y8 y8Var, Context context, i9 i9Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.g = y8Var;
        this.d = context;
        this.e = i9Var;
        this.f = c6Var;
    }

    @Override // m2.a
    public final void a(m2.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        e4 e4Var = (e4) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(e4Var);
        this.c.add(e4Var);
    }

    @Override // m2.a
    public final int b() {
        y8 y8Var = this.g;
        ArrayList arrayList = y8Var.t0;
        return arrayList != null ? arrayList.size() : y8Var.w0.size();
    }

    @Override // m2.a
    public final Object e(m2.g gVar, int i10) {
        e4 m7Var;
        Context context = this.d;
        y8 y8Var = this.g;
        p7 p7Var = new p7(y8Var, context);
        ArrayList arrayList = this.c;
        boolean isEmpty = arrayList.isEmpty();
        i9 i9Var = this.e;
        if (isEmpty) {
            m7Var = new m7(this, this.d, i9Var, y8Var.D0, this.f);
        } else {
            m7Var = (e4) arrayList.remove(0);
            m7Var.k1.a.getImageReceiver().setVisible(true, true);
            if (m7Var.a2 != null) {
                m7Var.X1.P0();
                m7Var.X1.setAlpha(1.0f - m7Var.Z3);
            }
            wj0 wj0Var = m7Var.b2;
            if (wj0Var != null) {
                wj0Var.n();
            }
            wj0 wj0Var2 = m7Var.n3;
            if (wj0Var2 != null) {
                wj0Var2.n();
            }
            k50 k50Var = m7Var.F2;
            if (k50Var != null) {
                AndroidUtilities.removeFromParent(k50Var);
                m7Var.F2.h(true);
                m7Var.F2 = null;
            }
            m7Var.setActive(false);
            m7Var.setIsVisible(false);
            m7Var.H2 = false;
            m7Var.K2.d(0.0f, false);
            m7Var.h1 = null;
            m7Var.e3 = false;
            m7Var.p0();
        }
        p7Var.a = m7Var;
        m7Var.setAccount(y8Var.u0);
        m7Var.setDelegate(y8Var.x0);
        m7Var.setLongpressed(i9Var.W0);
        p7Var.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = y8Var.t0;
        if (arrayList2 != null) {
            if (i9Var.N0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            p7Var.c = arrayList3;
            j6 j6Var = i9Var.K0;
            if ((j6Var instanceof d6) || (j6Var instanceof m6)) {
                MessageObject f10 = j6Var.f(((Integer) arrayList3.get(0)).intValue());
                p7Var.b = f10 == null ? y8Var.s0 : f10.getDialogId();
            } else {
                p7Var.b = y8Var.s0;
            }
        } else {
            p7Var.c = null;
            p7Var.b = ((Long) y8Var.w0.get(i10)).longValue();
        }
        p7Var.addView(m7Var);
        m7Var.requestLayout();
        gVar.addView(p7Var);
        return p7Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
