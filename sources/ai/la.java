package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.t60;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class la extends z4.a {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ Context d;
    public final /* synthetic */ kc e;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 f;
    public final /* synthetic */ ac g;

    public la(ac acVar, Context context, kc kcVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.g = acVar;
        this.d = context;
        this.e = kcVar;
        this.f = e6Var;
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
        ac acVar = this.g;
        ArrayList arrayList = acVar.x0;
        return arrayList != null ? arrayList.size() : acVar.A0.size();
    }

    @Override // z4.a
    public final Object e(z4.g gVar, int i10) {
        f6 kaVar;
        Context context = this.d;
        ac acVar = this.g;
        na naVar = new na(acVar, context);
        ArrayList arrayList = this.c;
        boolean isEmpty = arrayList.isEmpty();
        kc kcVar = this.e;
        if (isEmpty) {
            kaVar = new ka(this, this.d, kcVar, acVar.H0, this.f);
        } else {
            kaVar = (f6) arrayList.remove(0);
            kaVar.o1.a.getImageReceiver().setVisible(true, true);
            if (kaVar.e2 != null) {
                kaVar.b2.N0();
                kaVar.b2.setAlpha(1.0f - kaVar.d4);
            }
            kl0 kl0Var = kaVar.f2;
            if (kl0Var != null) {
                kl0Var.n();
            }
            kl0 kl0Var2 = kaVar.r3;
            if (kl0Var2 != null) {
                kl0Var2.n();
            }
            t60 t60Var = kaVar.J2;
            if (t60Var != null) {
                AndroidUtilities.removeFromParent(t60Var);
                kaVar.J2.c(true);
                kaVar.J2 = null;
            }
            kaVar.setActive(false);
            kaVar.setIsVisible(false);
            kaVar.L2 = false;
            kaVar.O2.d(0.0f, false);
            kaVar.l1 = null;
            kaVar.i3 = false;
            kaVar.p0();
        }
        naVar.a = kaVar;
        kaVar.setAccount(acVar.y0);
        kaVar.setDelegate(acVar.B0);
        kaVar.setLongpressed(kcVar.a1);
        naVar.setTag(Integer.valueOf(i10));
        ArrayList arrayList2 = acVar.x0;
        if (arrayList2 != null) {
            if (kcVar.R0) {
                i10 = (arrayList2.size() - 1) - i10;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i10);
            naVar.c = arrayList3;
            e9 e9Var = kcVar.O0;
            if ((e9Var instanceof w8) || (e9Var instanceof h9)) {
                MessageObject f7 = e9Var.f(((Integer) arrayList3.get(0)).intValue());
                naVar.b = f7 == null ? acVar.w0 : f7.getDialogId();
            } else {
                naVar.b = acVar.w0;
            }
        } else {
            naVar.c = null;
            naVar.b = ((Long) acVar.A0.get(i10)).longValue();
        }
        naVar.addView(kaVar);
        kaVar.requestLayout();
        gVar.addView(naVar);
        return naVar;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
