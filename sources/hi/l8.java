package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ls;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class l8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ah.n c;

    public /* synthetic */ l8(ah.n nVar, ArrayList arrayList, int i7) {
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
                        m8 m8Var = (m8) nVar.n;
                        nVar.h.clear();
                        nVar.b = null;
                        nVar.c = false;
                        m8Var.b.setAllowDrawCursor(true);
                        a8 a8Var = m8Var.h;
                        if (a8Var != null) {
                            a8Var.run();
                        }
                        if (m8Var.M) {
                            m8Var.fullScroll(ls.O1);
                            m8Var.M = false;
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
                        m8 m8Var2 = (m8) nVar2.n;
                        arrayList3.clear();
                        nVar2.b = null;
                        nVar2.c = false;
                        m8Var2.b.setAllowDrawCursor(true);
                        a8 a8Var2 = m8Var2.h;
                        if (a8Var2 != null) {
                            a8Var2.run();
                        }
                        if (m8Var2.M) {
                            m8Var2.fullScroll(ls.O1);
                            m8Var2.M = false;
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
