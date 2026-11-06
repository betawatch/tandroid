package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class o8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ah.n c;

    public /* synthetic */ o8(ah.n nVar, ArrayList arrayList, int i7) {
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
                        p8 p8Var = (p8) nVar.n;
                        nVar.h.clear();
                        nVar.b = null;
                        nVar.c = false;
                        p8Var.b.setAllowDrawCursor(true);
                        d8 d8Var = p8Var.h;
                        if (d8Var != null) {
                            d8Var.run();
                        }
                        if (p8Var.L) {
                            p8Var.fullScroll(qs.O1);
                            p8Var.L = false;
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
                        p8 p8Var2 = (p8) nVar2.n;
                        arrayList3.clear();
                        nVar2.b = null;
                        nVar2.c = false;
                        p8Var2.b.setAllowDrawCursor(true);
                        d8 d8Var2 = p8Var2.h;
                        if (d8Var2 != null) {
                            d8Var2.run();
                        }
                        if (p8Var2.L) {
                            p8Var2.fullScroll(qs.O1);
                            p8Var2.L = false;
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
