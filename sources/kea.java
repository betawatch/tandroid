// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kea extends ks0 {
    public final /* synthetic */ nha H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kea(nha nhaVar, Context context, d dVar, long j) {
        super(context, dVar, j);
        this.H = nhaVar;
    }

    @Override // ks0
    public final boolean c(k47 k47Var) {
        nha nhaVar = this.H;
        return nhaVar.c1[(k47.B0(k47Var.k) > nhaVar.m1 ? 1 : (k47.B0(k47Var.k) == nhaVar.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(k47Var.e1()) >= 0;
    }

    @Override // ks0
    public final boolean e(k47 k47Var) {
        nha nhaVar = this.H;
        ArrayList arrayList = nhaVar.Q0;
        SparseArray[] sparseArrayArr = nhaVar.c1;
        if (k47Var != null) {
            char c = k47.B0(k47Var.k) == nhaVar.m1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c].indexOfKey(k47Var.e1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c].put(k47Var.e1(), k47Var);
                    if (!k47Var.s(null, false)) {
                        nhaVar.d1++;
                    }
                    if (nhaVar.F1) {
                        nhaVar.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        gm.t1(nhaVar.y1.getParentActivity().getCurrentFocus());
                        int i = 8;
                        nhaVar.o0.setVisibility(nhaVar.d1 == 0 ? 0 : 8);
                        r7 r7Var = nhaVar.x0;
                        if (r7Var != null) {
                            r7Var.setVisibility((nhaVar.getClosestTab() == 8 || nhaVar.getClosestTab() == 13) ? 8 : 0);
                        }
                        r7 r7Var2 = nhaVar.y0;
                        if (r7Var2 != null) {
                            r7Var2.setVisibility(8);
                        }
                        r7 r7Var3 = nhaVar.z0;
                        if (r7Var3 != null) {
                            r7Var3.setVisibility(8);
                        }
                        r7 r7Var4 = nhaVar.w0;
                        if (r7Var4 != null) {
                            if (nhaVar.getClosestTab() != 8 && nhaVar.getClosestTab() != 13) {
                                i = 0;
                            }
                            r7Var4.setVisibility(i);
                        }
                        nhaVar.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            View view = (View) arrayList.get(i2);
                            gm.y(view);
                            arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        }
                        animatorSet.playTogether(arrayList2);
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        nhaVar.e1 = false;
                        nhaVar.l1(true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ks0
    public final boolean g(k47 k47Var) {
        nha nhaVar = this.H;
        ArrayList arrayList = nhaVar.Q0;
        SparseArray[] sparseArrayArr = nhaVar.c1;
        if (k47Var != null) {
            char c = k47.B0(k47Var.k) == nhaVar.m1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0) {
                sparseArrayArr[c].remove(k47Var.e1());
                if (!k47Var.s(null, false)) {
                    nhaVar.d1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    gm.t1(nhaVar.y1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i = 8;
                    nhaVar.o0.setVisibility(nhaVar.d1 == 0 ? 0 : 8);
                    r7 r7Var = nhaVar.x0;
                    if (r7Var != null) {
                        r7Var.setVisibility((nhaVar.getClosestTab() == 8 || nhaVar.getClosestTab() == 13) ? 8 : 0);
                    }
                    r7 r7Var2 = nhaVar.y0;
                    if (r7Var2 != null) {
                        r7Var2.setVisibility(8);
                    }
                    r7 r7Var3 = nhaVar.z0;
                    if (r7Var3 != null) {
                        r7Var3.setVisibility(8);
                    }
                    r7 r7Var4 = nhaVar.w0;
                    if (r7Var4 != null) {
                        if (nhaVar.getClosestTab() != 8 && nhaVar.getClosestTab() != 13) {
                            i = 0;
                        }
                        r7Var4.setVisibility(i);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        View view = (View) arrayList.get(i2);
                        gm.y(view);
                        arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.1f));
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    nhaVar.e1 = false;
                    gm.d3(new c0a(this, (byte) 12), 20L);
                } else {
                    nhaVar.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override // ks0
    public final int getStartedTrackingX() {
        return this.H.C1;
    }
}
