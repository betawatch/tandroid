package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class m extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ n c;

    public /* synthetic */ m(n nVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.c = nVar;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    int size = arrayList.size();
                    n nVar = this.c;
                    if (i7 >= size) {
                        nVar.getClass();
                        nVar.h.clear();
                        nVar.b = null;
                        nVar.c = false;
                        ((o) nVar.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        nVar.removeView((View) arrayList.get(i7));
                        i7++;
                    }
                }
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    n nVar2 = this.c;
                    if (i10 >= size2) {
                        nVar2.h.clear();
                        nVar2.b = null;
                        nVar2.c = false;
                        ((o) nVar2.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        nVar2.removeView((View) arrayList2.get(i10));
                        i10++;
                    }
                }
        }
    }
}
