// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class kca extends kr0 {
    public final /* synthetic */ nfa H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(nfa nfaVar, Context context, d dVar, long j) {
        super(context, dVar, j);
        this.H = nfaVar;
    }

    @Override // kr0
    public final boolean c(k27 k27Var) {
        nfa nfaVar = this.H;
        return nfaVar.c1[(k27.B0(k27Var.k) > nfaVar.m1 ? 1 : (k27.B0(k27Var.k) == nfaVar.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(k27Var.e1()) >= 0;
    }

    @Override // kr0
    public final boolean e(k27 k27Var) {
        nfa nfaVar = this.H;
        ArrayList arrayList = nfaVar.Q0;
        SparseArray[] sparseArrayArr = nfaVar.c1;
        if (k27Var != null) {
            char c = k27.B0(k27Var.k) == nfaVar.m1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c].indexOfKey(k27Var.e1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c].put(k27Var.e1(), k27Var);
                    if (!k27Var.s(null, false)) {
                        nfaVar.d1++;
                    }
                    if (nfaVar.F1) {
                        nfaVar.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        gl.t1(nfaVar.y1.getParentActivity().getCurrentFocus());
                        int i = 8;
                        nfaVar.o0.setVisibility(nfaVar.d1 == 0 ? 0 : 8);
                        r7 r7Var = nfaVar.x0;
                        if (r7Var != null) {
                            r7Var.setVisibility((nfaVar.getClosestTab() == 8 || nfaVar.getClosestTab() == 13) ? 8 : 0);
                        }
                        r7 r7Var2 = nfaVar.y0;
                        if (r7Var2 != null) {
                            r7Var2.setVisibility(8);
                        }
                        r7 r7Var3 = nfaVar.z0;
                        if (r7Var3 != null) {
                            r7Var3.setVisibility(8);
                        }
                        r7 r7Var4 = nfaVar.w0;
                        if (r7Var4 != null) {
                            if (nfaVar.getClosestTab() != 8 && nfaVar.getClosestTab() != 13) {
                                i = 0;
                            }
                            r7Var4.setVisibility(i);
                        }
                        nfaVar.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            View view = (View) arrayList.get(i2);
                            gl.y(view);
                            arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        }
                        animatorSet.playTogether(arrayList2);
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        nfaVar.e1 = false;
                        nfaVar.l1(true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kr0
    public final boolean g(k27 k27Var) {
        nfa nfaVar = this.H;
        ArrayList arrayList = nfaVar.Q0;
        SparseArray[] sparseArrayArr = nfaVar.c1;
        if (k27Var != null) {
            char c = k27.B0(k27Var.k) == nfaVar.m1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0) {
                sparseArrayArr[c].remove(k27Var.e1());
                if (!k27Var.s(null, false)) {
                    nfaVar.d1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    gl.t1(nfaVar.y1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i = 8;
                    nfaVar.o0.setVisibility(nfaVar.d1 == 0 ? 0 : 8);
                    r7 r7Var = nfaVar.x0;
                    if (r7Var != null) {
                        r7Var.setVisibility((nfaVar.getClosestTab() == 8 || nfaVar.getClosestTab() == 13) ? 8 : 0);
                    }
                    r7 r7Var2 = nfaVar.y0;
                    if (r7Var2 != null) {
                        r7Var2.setVisibility(8);
                    }
                    r7 r7Var3 = nfaVar.z0;
                    if (r7Var3 != null) {
                        r7Var3.setVisibility(8);
                    }
                    r7 r7Var4 = nfaVar.w0;
                    if (r7Var4 != null) {
                        if (nfaVar.getClosestTab() != 8 && nfaVar.getClosestTab() != 13) {
                            i = 0;
                        }
                        r7Var4.setVisibility(i);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        View view = (View) arrayList.get(i2);
                        gl.y(view);
                        arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.1f));
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    nfaVar.e1 = false;
                    gl.e3(new z6a(this, (byte) 4), 20L);
                } else {
                    nfaVar.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
