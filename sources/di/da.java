package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class da extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ea c;

    public /* synthetic */ da(ea eaVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = eaVar;
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
                    ea eaVar = this.c;
                    if (i10 >= size) {
                        eaVar.getClass();
                        fa faVar = (fa) eaVar.n;
                        eaVar.h.clear();
                        eaVar.b = null;
                        eaVar.c = false;
                        faVar.a.setAllowDrawCursor(true);
                        o9 o9Var = faVar.f;
                        if (o9Var != null) {
                            o9Var.run();
                        }
                        if (faVar.K) {
                            faVar.fullScroll(130);
                            faVar.K = false;
                            break;
                        }
                    } else {
                        eaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    ea eaVar2 = this.c;
                    if (i11 >= size2) {
                        ArrayList arrayList3 = eaVar2.h;
                        fa faVar2 = (fa) eaVar2.n;
                        arrayList3.clear();
                        eaVar2.b = null;
                        eaVar2.c = false;
                        faVar2.a.setAllowDrawCursor(true);
                        o9 o9Var2 = faVar2.f;
                        if (o9Var2 != null) {
                            o9Var2.run();
                        }
                        if (faVar2.K) {
                            faVar2.fullScroll(130);
                            faVar2.K = false;
                            break;
                        }
                    } else {
                        eaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
                break;
        }
    }
}
