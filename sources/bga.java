// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class bga extends kr0 {
    public final /* synthetic */ eja H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bga(eja ejaVar, Context context, e eVar, long j) {
        super(context, eVar, j);
        this.H = ejaVar;
    }

    @Override // kr0
    public final boolean c(r47 r47Var) {
        eja ejaVar = this.H;
        return ejaVar.c1[(r47.B0(r47Var.k) > ejaVar.m1 ? 1 : (r47.B0(r47Var.k) == ejaVar.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(r47Var.e1()) >= 0;
    }

    @Override // kr0
    public final boolean e(r47 r47Var) {
        eja ejaVar = this.H;
        ArrayList arrayList = ejaVar.Q0;
        SparseArray[] sparseArrayArr = ejaVar.c1;
        if (r47Var != null) {
            char c = r47.B0(r47Var.k) == ejaVar.m1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c].indexOfKey(r47Var.e1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c].put(r47Var.e1(), r47Var);
                    if (!r47Var.s(null, false)) {
                        ejaVar.d1++;
                    }
                    if (ejaVar.F1) {
                        ejaVar.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        hl.t1(ejaVar.y1.getParentActivity().getCurrentFocus());
                        int i = 8;
                        ejaVar.o0.setVisibility(ejaVar.d1 == 0 ? 0 : 8);
                        s7 s7Var = ejaVar.x0;
                        if (s7Var != null) {
                            s7Var.setVisibility((ejaVar.getClosestTab() == 8 || ejaVar.getClosestTab() == 13) ? 8 : 0);
                        }
                        s7 s7Var2 = ejaVar.y0;
                        if (s7Var2 != null) {
                            s7Var2.setVisibility(8);
                        }
                        s7 s7Var3 = ejaVar.z0;
                        if (s7Var3 != null) {
                            s7Var3.setVisibility(8);
                        }
                        s7 s7Var4 = ejaVar.w0;
                        if (s7Var4 != null) {
                            if (ejaVar.getClosestTab() != 8 && ejaVar.getClosestTab() != 13) {
                                i = 0;
                            }
                            s7Var4.setVisibility(i);
                        }
                        ejaVar.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            View view = (View) arrayList.get(i2);
                            hl.y(view);
                            arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        }
                        animatorSet.playTogether(arrayList2);
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        ejaVar.e1 = false;
                        ejaVar.l1(true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kr0
    public final boolean g(r47 r47Var) {
        eja ejaVar = this.H;
        ArrayList arrayList = ejaVar.Q0;
        SparseArray[] sparseArrayArr = ejaVar.c1;
        if (r47Var != null) {
            char c = r47.B0(r47Var.k) == ejaVar.m1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0) {
                sparseArrayArr[c].remove(r47Var.e1());
                if (!r47Var.s(null, false)) {
                    ejaVar.d1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    hl.t1(ejaVar.y1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i = 8;
                    ejaVar.o0.setVisibility(ejaVar.d1 == 0 ? 0 : 8);
                    s7 s7Var = ejaVar.x0;
                    if (s7Var != null) {
                        s7Var.setVisibility((ejaVar.getClosestTab() == 8 || ejaVar.getClosestTab() == 13) ? 8 : 0);
                    }
                    s7 s7Var2 = ejaVar.y0;
                    if (s7Var2 != null) {
                        s7Var2.setVisibility(8);
                    }
                    s7 s7Var3 = ejaVar.z0;
                    if (s7Var3 != null) {
                        s7Var3.setVisibility(8);
                    }
                    s7 s7Var4 = ejaVar.w0;
                    if (s7Var4 != null) {
                        if (ejaVar.getClosestTab() != 8 && ejaVar.getClosestTab() != 13) {
                            i = 0;
                        }
                        s7Var4.setVisibility(i);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        View view = (View) arrayList.get(i2);
                        hl.y(view);
                        arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.1f));
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    ejaVar.e1 = false;
                    hl.d3(new ux9(this, (byte) 21), 20L);
                } else {
                    ejaVar.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override // kr0
    public final int getStartedTrackingX() {
        return this.H.C1;
    }
}
