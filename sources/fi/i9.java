package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class i9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ j9 c;

    public /* synthetic */ i9(j9 j9Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = j9Var;
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
                    j9 j9Var = this.c;
                    if (i10 >= size) {
                        j9Var.getClass();
                        k9 k9Var = (k9) j9Var.n;
                        j9Var.h.clear();
                        j9Var.b = null;
                        j9Var.c = false;
                        k9Var.b.setAllowDrawCursor(true);
                        w8 w8Var = k9Var.h;
                        if (w8Var != null) {
                            w8Var.run();
                        }
                        if (k9Var.L) {
                            k9Var.fullScroll(130);
                            k9Var.L = false;
                            break;
                        }
                    } else {
                        j9Var.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    j9 j9Var2 = this.c;
                    if (i11 >= size2) {
                        ArrayList arrayList3 = j9Var2.h;
                        k9 k9Var2 = (k9) j9Var2.n;
                        arrayList3.clear();
                        j9Var2.b = null;
                        j9Var2.c = false;
                        k9Var2.b.setAllowDrawCursor(true);
                        w8 w8Var2 = k9Var2.h;
                        if (w8Var2 != null) {
                            w8Var2.run();
                        }
                        if (k9Var2.L) {
                            k9Var2.fullScroll(130);
                            k9Var2.L = false;
                            break;
                        }
                    } else {
                        j9Var2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
                break;
        }
    }
}
