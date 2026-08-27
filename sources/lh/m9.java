package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class m9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ gg.k c;

    public /* synthetic */ m9(gg.k kVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = kVar;
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
                    gg.k kVar = this.c;
                    if (i10 >= size) {
                        kVar.getClass();
                        n9 n9Var = (n9) kVar.n;
                        kVar.h.clear();
                        kVar.b = null;
                        kVar.c = false;
                        n9Var.a.setAllowDrawCursor(true);
                        z8 z8Var = n9Var.f;
                        if (z8Var != null) {
                            z8Var.run();
                        }
                        if (n9Var.G) {
                            n9Var.fullScroll(130);
                            n9Var.G = false;
                            break;
                        }
                    } else {
                        kVar.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    gg.k kVar2 = this.c;
                    if (i11 >= size2) {
                        ArrayList arrayList3 = kVar2.h;
                        n9 n9Var2 = (n9) kVar2.n;
                        arrayList3.clear();
                        kVar2.b = null;
                        kVar2.c = false;
                        n9Var2.a.setAllowDrawCursor(true);
                        z8 z8Var2 = n9Var2.f;
                        if (z8Var2 != null) {
                            z8Var2.run();
                        }
                        if (n9Var2.G) {
                            n9Var2.fullScroll(130);
                            n9Var2.G = false;
                            break;
                        }
                    } else {
                        kVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
                break;
        }
    }
}
