package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class cj0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ v4.i0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ dj0 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.l5 e;

    public cj0(org.telegram.ui.ActionBar.l5 l5Var, v4.i0 i0Var, ArrayList arrayList, boolean z10, dj0 dj0Var) {
        this.e = l5Var;
        this.a = i0Var;
        this.b = arrayList;
        this.c = z10;
        this.d = dj0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        final ArrayList arrayList;
        int height;
        long min;
        View view2;
        org.telegram.ui.ActionBar.l5 l5Var = this.e;
        HashMap hashMap = (HashMap) l5Var.w;
        ck0 ck0Var = (ck0) l5Var.e;
        ck0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        ck0Var.C0();
        int childCount = ck0Var.getChildCount();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.b;
            if (i17 >= childCount) {
                break;
            }
            View childAt = ck0Var.getChildAt(i17);
            arrayList2.add(childAt);
            if (childAt.getTop() < i18) {
                i18 = childAt.getTop();
            }
            if (childAt.getBottom() > i19) {
                i19 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) childAt).c(true, false);
            }
            v4.i0 i0Var = this.a;
            if (i0Var != null && (i0Var.b || l5Var.c)) {
                ck0Var.getClass();
                long c10 = i0Var.c(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(c10)) && (view2 = (View) hashMap.get(Long.valueOf(c10))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) view2).c(false, false);
                    }
                    arrayList.remove(view2);
                    c8.oa oaVar = (c8.oa) l5Var.r;
                    if (oaVar != null) {
                        oaVar.d(view2);
                    }
                    int top = childAt.getTop() - view2.getTop();
                    if (top != 0) {
                        i20 = top;
                    }
                    z10 = true;
                }
            }
            i17++;
        }
        hashMap.clear();
        int size = arrayList.size();
        int i21 = 0;
        int i22 = 0;
        int i23 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        while (i22 < size) {
            Object obj = arrayList.get(i22);
            i22++;
            View view3 = (View) obj;
            int bottom = view3.getBottom();
            int top2 = view3.getTop();
            if (bottom > i21) {
                i21 = bottom;
            }
            if (top2 < i23) {
                i23 = top2;
            }
            if (view3.getParent() == null) {
                ck0Var.addView(view3);
                ((v4.c0) l5Var.f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) view3).c(true, true);
            }
        }
        int i24 = i23 == Integer.MAX_VALUE ? 0 : i23;
        c8.oa oaVar2 = (c8.oa) l5Var.r;
        if (oaVar2 != null) {
            oaVar2.b();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i20);
        } else {
            boolean z11 = this.c;
            if (!z11) {
                i21 = ck0Var.getHeight() - i24;
            }
            height = (z11 ? -i18 : i19 - ck0Var.getHeight()) + i21;
        }
        final int paddingBottom = ck0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) l5Var.h;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) l5Var.h).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        l5Var.h = ofFloat;
        final boolean z12 = this.c;
        final int i25 = height;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.bj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i26;
                org.telegram.ui.ActionBar.l5 l5Var2 = cj0.this.e;
                ck0 ck0Var2 = (ck0) l5Var2.e;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = arrayList;
                int size2 = arrayList3.size();
                int i27 = 0;
                while (true) {
                    z13 = z12;
                    i26 = i25;
                    if (i27 >= size2) {
                        break;
                    }
                    View view4 = (View) arrayList3.get(i27);
                    float y10 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y10 <= ck0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i26) * floatValue);
                        } else {
                            view4.setTranslationY(i26 * floatValue);
                        }
                    }
                    i27++;
                }
                int paddingBottom2 = paddingBottom - ck0Var2.getPaddingBottom();
                ArrayList arrayList4 = arrayList2;
                int size3 = arrayList4.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    View view5 = (View) arrayList4.get(i28);
                    if (z13) {
                        view5.setTranslationY(((1.0f - floatValue) * i26) + paddingBottom2);
                    } else {
                        view5.setTranslationY((1.0f - floatValue) * (-i26));
                    }
                }
                ck0Var2.invalidate();
                ej0 ej0Var = (ej0) l5Var2.n;
                if (ej0Var != null) {
                    ej0Var.i();
                }
            }
        });
        ((ValueAnimator) l5Var.h).addListener(new h60(1, this, arrayList2));
        if (!l5Var.d) {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i25 / ck0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) l5Var.h).setDuration(min);
            ((ValueAnimator) l5Var.h).setInterpolator(lr.h);
        } else if (z10) {
            ((ValueAnimator) l5Var.h).setDuration(150L);
            ((ValueAnimator) l5Var.h).setInterpolator(lr.g);
        } else {
            long measuredHeight2 = (long) (((i25 / ck0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) l5Var.h).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) l5Var.h).setInterpolator(lr.h);
        }
        ((ValueAnimator) l5Var.h).start();
    }
}
