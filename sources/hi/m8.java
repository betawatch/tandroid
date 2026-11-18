package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class m8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ah.n c;

    public /* synthetic */ m8(ah.n nVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.c = nVar;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    int size = arrayList.size();
                    ah.n nVar = this.c;
                    if (i7 >= size) {
                        nVar.getClass();
                        n8 n8Var = (n8) nVar.n;
                        nVar.h.clear();
                        nVar.b = null;
                        nVar.c = false;
                        n8Var.b.setAllowDrawCursor(true);
                        b8 b8Var = n8Var.h;
                        if (b8Var != null) {
                            b8Var.run();
                        }
                        if (n8Var.M) {
                            n8Var.fullScroll(ks.O1);
                            n8Var.M = false;
                            break;
                        }
                    } else {
                        nVar.removeView((View) arrayList.get(i7));
                        i7++;
                    }
                }
                break;
            default:
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    ah.n nVar2 = this.c;
                    if (i10 >= size2) {
                        ArrayList arrayList3 = nVar2.h;
                        n8 n8Var2 = (n8) nVar2.n;
                        arrayList3.clear();
                        nVar2.b = null;
                        nVar2.c = false;
                        n8Var2.b.setAllowDrawCursor(true);
                        b8 b8Var2 = n8Var2.h;
                        if (b8Var2 != null) {
                            b8Var2.run();
                        }
                        if (n8Var2.M) {
                            n8Var2.fullScroll(ks.O1);
                            n8Var2.M = false;
                            break;
                        }
                    } else {
                        nVar2.removeView((View) arrayList2.get(i10));
                        i10++;
                    }
                }
                break;
        }
    }
}
