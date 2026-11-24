// default package

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n04 extends pr7 {
    public final /* synthetic */ t14 c;

    public n04(t14 t14Var) {
        this.c = t14Var;
    }

    @Override // pr7
    public final void a(gec gecVar, Object obj) {
        gecVar.removeView((View) obj);
    }

    @Override // pr7
    public final int b() {
        return this.c.e.size();
    }

    @Override // pr7
    public final CharSequence d(int i) {
        if (i == 0) {
            return k96.M0(2131751184, null);
        }
        if (i == 1) {
            return k96.M0(2131754879, null);
        }
        if (i != 2) {
            return null;
        }
        return k96.M0(2131754755, null);
    }

    @Override // pr7
    public final Object e(gec gecVar, int i) {
        FrameLayout frameLayout = ((p14) this.c.e.get(i)).b;
        gecVar.addView(frameLayout);
        return frameLayout;
    }

    @Override // pr7
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
