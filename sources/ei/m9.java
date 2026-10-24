package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class m9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ n9 c;

    public /* synthetic */ m9(n9 n9Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = n9Var;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    int size = arrayList.size();
                    n9 n9Var = this.c;
                    if (i10 >= size) {
                        n9Var.getClass();
                        o9 o9Var = (o9) n9Var.n;
                        n9Var.h.clear();
                        n9Var.b = null;
                        n9Var.c = false;
                        o9Var.b.setAllowDrawCursor(true);
                        a9 a9Var = o9Var.h;
                        if (a9Var != null) {
                            a9Var.run();
                        }
                        if (o9Var.L) {
                            o9Var.fullScroll(130);
                            o9Var.L = false;
                            break;
                        }
                    } else {
                        n9Var.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    n9 n9Var2 = this.c;
                    if (i11 >= size2) {
                        ArrayList arrayList3 = n9Var2.h;
                        o9 o9Var2 = (o9) n9Var2.n;
                        arrayList3.clear();
                        n9Var2.b = null;
                        n9Var2.c = false;
                        o9Var2.b.setAllowDrawCursor(true);
                        a9 a9Var2 = o9Var2.h;
                        if (a9Var2 != null) {
                            a9Var2.run();
                        }
                        if (o9Var2.L) {
                            o9Var2.fullScroll(130);
                            o9Var2.L = false;
                            break;
                        }
                    } else {
                        n9Var2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
                break;
        }
    }
}
