package bh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ l c;

    public /* synthetic */ k(l lVar, ArrayList arrayList, int i3) {
        this.a = i3;
        this.c = lVar;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    int size = arrayList.size();
                    l lVar = this.c;
                    if (i3 >= size) {
                        lVar.getClass();
                        lVar.h.clear();
                        lVar.b = null;
                        lVar.c = false;
                        ((m) lVar.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        lVar.removeView((View) arrayList.get(i3));
                        i3++;
                    }
                }
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    l lVar2 = this.c;
                    if (i10 >= size2) {
                        lVar2.h.clear();
                        lVar2.b = null;
                        lVar2.c = false;
                        ((m) lVar2.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        lVar2.removeView((View) arrayList2.get(i10));
                        i10++;
                    }
                }
        }
    }
}
