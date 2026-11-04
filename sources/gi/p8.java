package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ bh.l c;

    public /* synthetic */ p8(bh.l lVar, ArrayList arrayList, int i3) {
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
                    bh.l lVar = this.c;
                    if (i3 >= size) {
                        lVar.getClass();
                        q8 q8Var = (q8) lVar.n;
                        lVar.h.clear();
                        lVar.b = null;
                        lVar.c = false;
                        q8Var.b.setAllowDrawCursor(true);
                        c8 c8Var = q8Var.h;
                        if (c8Var != null) {
                            c8Var.run();
                        }
                        if (q8Var.M) {
                            q8Var.fullScroll(hs.O1);
                            q8Var.M = false;
                            break;
                        }
                    } else {
                        lVar.removeView((View) arrayList.get(i3));
                        i3++;
                    }
                }
                break;
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    bh.l lVar2 = this.c;
                    if (i10 >= size2) {
                        ArrayList arrayList3 = lVar2.h;
                        q8 q8Var2 = (q8) lVar2.n;
                        arrayList3.clear();
                        lVar2.b = null;
                        lVar2.c = false;
                        q8Var2.b.setAllowDrawCursor(true);
                        c8 c8Var2 = q8Var2.h;
                        if (c8Var2 != null) {
                            c8Var2.run();
                        }
                        if (q8Var2.M) {
                            q8Var2.fullScroll(hs.O1);
                            q8Var2.M = false;
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
