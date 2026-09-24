package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class aa extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ba c;

    public /* synthetic */ aa(ba baVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = baVar;
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
                    ba baVar = this.c;
                    if (i10 >= size) {
                        baVar.getClass();
                        ca caVar = (ca) baVar.n;
                        baVar.h.clear();
                        baVar.b = null;
                        baVar.c = false;
                        caVar.a.setAllowDrawCursor(true);
                        m9 m9Var = caVar.f;
                        if (m9Var != null) {
                            m9Var.run();
                        }
                        if (caVar.K) {
                            caVar.fullScroll(130);
                            caVar.K = false;
                            break;
                        }
                    } else {
                        baVar.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    ba baVar2 = this.c;
                    if (i11 >= size2) {
                        ArrayList arrayList3 = baVar2.h;
                        ca caVar2 = (ca) baVar2.n;
                        arrayList3.clear();
                        baVar2.b = null;
                        baVar2.c = false;
                        caVar2.a.setAllowDrawCursor(true);
                        m9 m9Var2 = caVar2.f;
                        if (m9Var2 != null) {
                            m9Var2.run();
                        }
                        if (caVar2.K) {
                            caVar2.fullScroll(130);
                            caVar2.K = false;
                            break;
                        }
                    } else {
                        baVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
                break;
        }
    }
}
