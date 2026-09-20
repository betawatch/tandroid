package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.pk0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class ka extends z4.a {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ Context d;
    public final /* synthetic */ jc e;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 f;
    public final /* synthetic */ zb g;

    public ka(zb zbVar, Context context, jc jcVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.g = zbVar;
        this.d = context;
        this.e = jcVar;
        this.f = f6Var;
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        gVar.removeView(frameLayout);
        f6 f6Var = (f6) frameLayout.getChildAt(0);
        AndroidUtilities.removeFromParent(f6Var);
        this.c.add(f6Var);
    }

    @Override // z4.a
    public final int b() {
        zb zbVar = this.g;
        ArrayList arrayList = zbVar.x0;
        return arrayList != null ? arrayList.size() : zbVar.A0.size();
    }

    @Override // z4.a
    public final Object e(z4.g gVar, int i10) {
        f6 jaVar;
        Context context = this.d;
        zb zbVar = this.g;
        ma maVar = new ma(zbVar, context);
        ArrayList arrayList = this.c;
        boolean isEmpty = arrayList.isEmpty();
        jc jcVar = this.e;
        if (isEmpty) {
            jaVar = new ja(this, this.d, jcVar, zbVar.H0, this.f);
        } else {
            jaVar = (f6) arrayList.remove(0);
            jaVar.o1.a.getImageReceiver().setVisible(true, true);
            if (jaVar.e2 != null) {
                jaVar.b2.P0();
                jaVar.b2.setAlpha(1.0f - jaVar.d4);
            }
            pk0 pk0Var = jaVar.f2;
            if (pk0Var != null) {
                pk0Var.n();
            }
            pk0 pk0Var2 = jaVar.r3;
            if (pk0Var2 != null) {
                pk0Var2.n();
            }
            a60 a60Var = jaVar.J2;
            if (a60Var != null) {
                AndroidUtilities.removeFromParent(a60Var);
                jaVar.J2.c(true);
                jaVar.J2 = null;
            }
            jaVar.setActive(false);
            jaVar.setIsVisible(false);
            jaVar.L2 = false;
            jaVar.O2.d(0.0f, false);
            jaVar.l1 = null;
            jaVar.i3 = false;
            jaVar.p0();
        }
        maVar.a = jaVar;
        jaVar.setAccount(zbVar.y0);
        jaVar.setDelegate(zbVar.B0);
        jaVar.setLongpressed(jcVar.a1);
        maVar.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = zbVar.x0;
        if (arrayList2 != null) {
            if (jcVar.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            maVar.c = arrayList3;
            d9 d9Var = jcVar.O0;
            if ((d9Var instanceof v8) || (d9Var instanceof g9)) {
                MessageObject f7 = d9Var.f(((Integer) arrayList3.get(0)).intValue());
                maVar.b = f7 == null ? zbVar.w0 : f7.getDialogId();
            } else {
                maVar.b = zbVar.w0;
            }
        } else {
            maVar.c = null;
            maVar.b = ((Long) zbVar.A0.get(i10)).longValue();
        }
        maVar.addView(jaVar);
        jaVar.requestLayout();
        gVar.addView(maVar);
        return maVar;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
