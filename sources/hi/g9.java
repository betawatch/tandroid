package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class g9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ah.n c;

    public /* synthetic */ g9(ah.n nVar, ArrayList arrayList, int i7) {
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
                    ah.n nVar = this.c;
                    if (i7 >= size) {
                        nVar.getClass();
                        h9 h9Var = (h9) nVar.n;
                        nVar.h.clear();
                        nVar.b = null;
                        nVar.c = false;
                        h9Var.b.setAllowDrawCursor(true);
                        v8 v8Var = h9Var.h;
                        if (v8Var != null) {
                            v8Var.run();
                        }
                        if (h9Var.M) {
                            h9Var.fullScroll(ks.O1);
                            h9Var.M = false;
                            break;
                        }
                    } else {
                        nVar.removeView((View) arrayList.get(i7));
                        i7++;
                    }
                }
                break;
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    ah.n nVar2 = this.c;
                    if (i10 >= size2) {
                        ArrayList arrayList3 = nVar2.h;
                        h9 h9Var2 = (h9) nVar2.n;
                        arrayList3.clear();
                        nVar2.b = null;
                        nVar2.c = false;
                        h9Var2.b.setAllowDrawCursor(true);
                        v8 v8Var2 = h9Var2.h;
                        if (v8Var2 != null) {
                            v8Var2.run();
                        }
                        if (h9Var2.M) {
                            h9Var2.fullScroll(ks.O1);
                            h9Var2.M = false;
                            break;
                        }
                    } else {
                        nVar2.removeView((View) arrayList2.get(i10));
                        i10++;
                    }
                }
                break;
        }
    }
}
