// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nw9 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tx9 c;

    public /* synthetic */ nw9(tx9 tx9Var, boolean z, byte b) {
        this.a = b;
        this.c = tx9Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        byte b = this.a;
        boolean z = this.b;
        tx9 tx9Var = this.c;
        switch (b) {
            case 0:
                tx9Var.j0.setVisibility(z ? 0 : 8);
                tx9Var.i0.setVisibility(z ? 8 : 0);
                tx9Var.G1 = null;
                if (!z && (arrayList2 = tx9Var.C1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = tx9Var.F1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    tx9Var.r0.E(false);
                }
                if (!z && (arrayList = tx9Var.D1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                FrameLayout frameLayout = tx9Var.k0;
                if (z && tx9Var.j0.getVisibility() == 0) {
                    r1 = 0;
                }
                frameLayout.setVisibility(r1);
                tx9Var.J1 = null;
                break;
        }
    }
}
