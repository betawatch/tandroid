package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class a9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ig.j c;

    public /* synthetic */ a9(ig.j jVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = jVar;
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
                    ig.j jVar = this.c;
                    if (i10 >= size) {
                        jVar.getClass();
                        b9 b9Var = (b9) jVar.n;
                        jVar.h.clear();
                        jVar.b = null;
                        jVar.c = false;
                        b9Var.a.setAllowDrawCursor(true);
                        o8 o8Var = b9Var.f;
                        if (o8Var != null) {
                            o8Var.run();
                        }
                        if (b9Var.G) {
                            b9Var.fullScroll(130);
                            b9Var.G = false;
                            break;
                        }
                    } else {
                        jVar.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    ig.j jVar2 = this.c;
                    if (i11 >= size2) {
                        ArrayList arrayList3 = jVar2.h;
                        b9 b9Var2 = (b9) jVar2.n;
                        arrayList3.clear();
                        jVar2.b = null;
                        jVar2.c = false;
                        b9Var2.a.setAllowDrawCursor(true);
                        o8 o8Var2 = b9Var2.f;
                        if (o8Var2 != null) {
                            o8Var2.run();
                        }
                        if (b9Var2.G) {
                            b9Var2.fullScroll(130);
                            b9Var2.G = false;
                            break;
                        }
                    } else {
                        jVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
                break;
        }
    }
}
