package fg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ l c;

    public /* synthetic */ k(l lVar, ArrayList arrayList, int i9) {
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
                    l lVar = this.c;
                    if (i9 >= size) {
                        lVar.getClass();
                        lVar.h.clear();
                        lVar.b = null;
                        lVar.c = false;
                        ((m) lVar.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        lVar.removeView((View) arrayList.get(i9));
                        i9++;
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
