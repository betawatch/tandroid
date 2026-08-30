package kg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class i extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ j c;

    public /* synthetic */ i(j jVar, ArrayList arrayList, int i10) {
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
                    j jVar = this.c;
                    if (i10 >= size) {
                        jVar.getClass();
                        jVar.h.clear();
                        jVar.b = null;
                        jVar.c = false;
                        ((k) jVar.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        jVar.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    j jVar2 = this.c;
                    if (i11 >= size2) {
                        jVar2.h.clear();
                        jVar2.b = null;
                        jVar2.c = false;
                        ((k) jVar2.n).b.setAllowDrawCursor(true);
                        break;
                    } else {
                        jVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
        }
    }
}
