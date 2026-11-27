// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class g0a extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ n1a c;

    public /* synthetic */ g0a(n1a n1aVar, boolean z, byte b) {
        this.a = b;
        this.c = n1aVar;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        byte b = this.a;
        boolean z = this.b;
        n1a n1aVar = this.c;
        switch (b) {
            case 0:
                n1aVar.j0.setVisibility(z ? 0 : 8);
                n1aVar.i0.setVisibility(z ? 8 : 0);
                n1aVar.G1 = null;
                if (!z && (arrayList2 = n1aVar.C1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = n1aVar.F1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    n1aVar.r0.E(false);
                }
                if (!z && (arrayList = n1aVar.D1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                FrameLayout frameLayout = n1aVar.k0;
                if (z && n1aVar.j0.getVisibility() == 0) {
                    r1 = 0;
                }
                frameLayout.setVisibility(r1);
                n1aVar.J1 = null;
                break;
        }
    }
}
