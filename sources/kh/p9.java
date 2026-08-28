package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class p9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ fg.l c;

    public /* synthetic */ p9(fg.l lVar, ArrayList arrayList, int i9) {
        this.a = i9;
        this.c = lVar;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                int i9 = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    int size = arrayList.size();
                    fg.l lVar = this.c;
                    if (i9 >= size) {
                        lVar.getClass();
                        q9 q9Var = (q9) lVar.n;
                        lVar.h.clear();
                        lVar.b = null;
                        lVar.c = false;
                        q9Var.a.setAllowDrawCursor(true);
                        c9 c9Var = q9Var.f;
                        if (c9Var != null) {
                            c9Var.run();
                        }
                        if (q9Var.G) {
                            q9Var.fullScroll(130);
                            q9Var.G = false;
                            break;
                        }
                    } else {
                        lVar.removeView((View) arrayList.get(i9));
                        i9++;
                    }
                }
                break;
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    fg.l lVar2 = this.c;
                    if (i10 >= size2) {
                        ArrayList arrayList3 = lVar2.h;
                        q9 q9Var2 = (q9) lVar2.n;
                        arrayList3.clear();
                        lVar2.b = null;
                        lVar2.c = false;
                        q9Var2.a.setAllowDrawCursor(true);
                        c9 c9Var2 = q9Var2.f;
                        if (c9Var2 != null) {
                            c9Var2.run();
                        }
                        if (q9Var2.G) {
                            q9Var2.fullScroll(130);
                            q9Var2.G = false;
                            break;
                        }
                    } else {
                        lVar2.removeView((View) arrayList2.get(i10));
                        i10++;
                    }
                }
                break;
        }
    }
}
