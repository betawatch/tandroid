package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class z9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ aa c;

    public /* synthetic */ z9(aa aaVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = aaVar;
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
                    aa aaVar = this.c;
                    if (i10 >= size) {
                        aaVar.getClass();
                        ba baVar = (ba) aaVar.n;
                        aaVar.h.clear();
                        aaVar.b = null;
                        aaVar.c = false;
                        baVar.a.setAllowDrawCursor(true);
                        l9 l9Var = baVar.f;
                        if (l9Var != null) {
                            l9Var.run();
                        }
                        if (baVar.K) {
                            baVar.fullScroll(130);
                            baVar.K = false;
                            break;
                        }
                    } else {
                        aaVar.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    aa aaVar2 = this.c;
                    if (i11 >= size2) {
                        ArrayList arrayList3 = aaVar2.h;
                        ba baVar2 = (ba) aaVar2.n;
                        arrayList3.clear();
                        aaVar2.b = null;
                        aaVar2.c = false;
                        baVar2.a.setAllowDrawCursor(true);
                        l9 l9Var2 = baVar2.f;
                        if (l9Var2 != null) {
                            l9Var2.run();
                        }
                        if (baVar2.K) {
                            baVar2.fullScroll(130);
                            baVar2.K = false;
                            break;
                        }
                    } else {
                        aaVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
                break;
        }
    }
}
