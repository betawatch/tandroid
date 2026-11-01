package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class iw extends s4.s0 {
    public boolean a;
    public final /* synthetic */ yx b;
    public final /* synthetic */ sx c;
    public final /* synthetic */ zx d;

    public iw(zx zxVar, yx yxVar, sx sxVar) {
        this.d = zxVar;
        this.b = yxVar;
        this.c = sxVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        zx zxVar = this.d;
        if (i10 == 1) {
            this.a = true;
            zxVar.e3 = true;
            a5.a aVar = zxVar.e0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.c).cancel();
                aVar.c = null;
            }
            if (zxVar.X.r.getText().length() == 0 && zxVar.X.r.hasFocus()) {
                org.telegram.messenger.i0.v1(zxVar.X.r);
                zxVar.X.r.clearFocus();
            }
        } else {
            zxVar.e3 = false;
        }
        if (i10 == 0) {
            this.a = false;
            zxVar.e2 = false;
            boolean z10 = zxVar.b1;
            yx yxVar = this.b;
            if (z10) {
                zxVar.b1 = false;
                if (zxVar.d1) {
                    vx vxVar = yxVar.a;
                    int i11 = vx.B3;
                    vxVar.D1();
                    zxVar.d1 = false;
                }
                yxVar.d.f();
            }
            zx.v1(zxVar, yxVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        tg.f fVar;
        vx vxVar;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        View childAt;
        boolean z10;
        Object[] objArr;
        this.c.V();
        yx yxVar = this.b;
        ew ewVar = yxVar.y;
        int i12 = -i11;
        ArrayList arrayList = ewVar.x;
        ArrayList arrayList2 = ewVar.o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = ((s4.c1) arrayList2.get(i13)).a;
                view.setTranslationY(view.getTranslationY() + i12);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                View view2 = ((s4.c1) arrayList.get(i14)).a;
                view2.setTranslationY(view2.getTranslationY() + i12);
            }
        }
        int i15 = -1;
        int i16 = -1;
        for (int i17 = 0; i17 < recyclerView.getChildCount(); i17++) {
            int R = RecyclerView.R(recyclerView.getChildAt(i17));
            if (R >= 0) {
                if (i15 == -1 || R > i15) {
                    i15 = R;
                }
                if (i16 == -1 || R < i16) {
                    i16 = R;
                }
            }
        }
        zx zxVar = this.d;
        zxVar.C3(yxVar);
        zxVar.Q = true;
        View view3 = zxVar.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (zxVar.R0 != 10 && this.a && recyclerView.getChildCount() > 0 && i16 != -1) {
            s4.c1 K = recyclerView.K(i16);
            if (!zxVar.l4() || (K != null && K.b() >= 0)) {
                int top = K != null ? K.a.getTop() : 0;
                int i18 = zxVar.Y1;
                if (i18 == i16) {
                    int i19 = zxVar.Z1;
                    int i20 = i19 - top;
                    z10 = top < i19;
                    if (Math.abs(i20) <= 1) {
                        objArr = false;
                        if (objArr != false && zxVar.a2 && (z10 || zxVar.e3)) {
                            zxVar.o4(z10);
                        }
                        zxVar.Y1 = i16;
                        zxVar.Z1 = top;
                        zxVar.a2 = true;
                    }
                } else {
                    z10 = i16 > i18;
                }
                objArr = true;
                if (objArr != false) {
                    zxVar.o4(z10);
                }
                zxVar.Y1 = i16;
                zxVar.Z1 = top;
                zxVar.a2 = true;
            }
        }
        if (!zxVar.K && recyclerView == zxVar.e0[0].a && !zxVar.j2) {
            lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
            if (lVar != null) {
                lVar2 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                if (!lVar2.u() && !zxVar.e2 && !zxVar.F3.c()) {
                    if (i11 > 0 && zxVar.l4() && zxVar.e0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top2 = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top2 + i11 > 0) {
                            if (top2 >= 0) {
                                return;
                            } else {
                                i11 = -top2;
                            }
                        }
                    }
                    zxVar.Q = true;
                    View view4 = zxVar.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        ww wwVar = zxVar.F3;
        if (wwVar != null && wwVar.c() && (vxVar = yxVar.a) != null) {
            vxVar.invalidate();
        }
        tw twVar = zxVar.E0;
        if (twVar != null && twVar.getPremiumHint() != null && zxVar.E0.getPremiumHint().V) {
            zxVar.E0.getPremiumHint().e(true);
        }
        ?? l4 = zxVar.l4();
        View childAt2 = yxVar.a.getChildAt(l4 == true ? 1 : 0);
        zxVar.e.a(i16 > l4 || (((float) (childAt2 != null ? childAt2.getTop() : 0)) - zxVar.N) + ((float) org.telegram.messenger.i0.L(5.0f)) < ((float) yxVar.a.getPaddingTop()), true);
        if (i11 == 0 || (fVar = zxVar.j4) == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        fVar.f(i10, i11);
    }
}
