package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class mb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ nb c;

    public /* synthetic */ mb(nb nbVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.c = nbVar;
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
                    nb nbVar = this.c;
                    if (i10 >= size) {
                        nbVar.getClass();
                        ob obVar = (ob) nbVar.n;
                        nbVar.h.clear();
                        nbVar.b = null;
                        nbVar.c = false;
                        obVar.a.setAllowDrawCursor(true);
                        sa saVar = obVar.f;
                        if (saVar != null) {
                            saVar.run();
                        }
                        if (obVar.K) {
                            obVar.fullScroll(130);
                            obVar.K = false;
                            break;
                        }
                    } else {
                        nbVar.removeView((View) arrayList.get(i10));
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    int size2 = arrayList2.size();
                    nb nbVar2 = this.c;
                    if (i11 >= size2) {
                        ArrayList arrayList3 = nbVar2.h;
                        ob obVar2 = (ob) nbVar2.n;
                        arrayList3.clear();
                        nbVar2.b = null;
                        nbVar2.c = false;
                        obVar2.a.setAllowDrawCursor(true);
                        sa saVar2 = obVar2.f;
                        if (saVar2 != null) {
                            saVar2.run();
                        }
                        if (obVar2.K) {
                            obVar2.fullScroll(130);
                            obVar2.K = false;
                            break;
                        }
                    } else {
                        nbVar2.removeView((View) arrayList2.get(i11));
                        i11++;
                    }
                }
                break;
        }
    }
}
