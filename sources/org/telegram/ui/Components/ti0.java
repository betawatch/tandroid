package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ti0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ v4.h0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ui0 d;
    public final /* synthetic */ wi0 e;

    public ti0(wi0 wi0Var, v4.h0 h0Var, ArrayList arrayList, boolean z10, ui0 ui0Var) {
        this.e = wi0Var;
        this.a = h0Var;
        this.b = arrayList;
        this.c = z10;
        this.d = ui0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        final ArrayList arrayList;
        int height;
        long min;
        View view2;
        wi0 wi0Var = this.e;
        HashMap hashMap = (HashMap) wi0Var.k;
        uj0 uj0Var = (uj0) wi0Var.e;
        uj0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        uj0Var.C0();
        int childCount = uj0Var.getChildCount();
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
            View childAt = uj0Var.getChildAt(i17);
            arrayList2.add(childAt);
            if (childAt.getTop() < i18) {
                i18 = childAt.getTop();
            }
            if (childAt.getBottom() > i19) {
                i19 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) childAt).b(true, false);
            }
            v4.h0 h0Var = this.a;
            if (h0Var != null && (h0Var.b || wi0Var.c)) {
                uj0Var.getClass();
                long c10 = h0Var.c(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(c10)) && (view2 = (View) hashMap.get(Long.valueOf(c10))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) view2).b(false, false);
                    }
                    arrayList.remove(view2);
                    c8.ma maVar = (c8.ma) wi0Var.i;
                    if (maVar != null) {
                        maVar.d(view2);
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
                uj0Var.addView(view3);
                ((v4.b0) wi0Var.f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) view3).b(true, true);
            }
        }
        int i24 = i23 == Integer.MAX_VALUE ? 0 : i23;
        c8.ma maVar2 = (c8.ma) wi0Var.i;
        if (maVar2 != null) {
            maVar2.b();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i20);
        } else {
            boolean z11 = this.c;
            if (!z11) {
                i21 = uj0Var.getHeight() - i24;
            }
            height = (z11 ? -i18 : i19 - uj0Var.getHeight()) + i21;
        }
        final int paddingBottom = uj0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) wi0Var.g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) wi0Var.g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        wi0Var.g = ofFloat;
        final boolean z12 = this.c;
        final int i25 = height;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.si0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i26;
                wi0 wi0Var2 = ti0.this.e;
                uj0 uj0Var2 = (uj0) wi0Var2.e;
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
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y10 <= uj0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i26) * floatValue);
                        } else {
                            view4.setTranslationY(i26 * floatValue);
                        }
                    }
                    i27++;
                }
                int paddingBottom2 = paddingBottom - uj0Var2.getPaddingBottom();
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
                uj0Var2.invalidate();
                vi0 vi0Var = (vi0) wi0Var2.h;
                if (vi0Var != null) {
                    vi0Var.i();
                }
            }
        });
        ((ValueAnimator) wi0Var.g).addListener(new y50(1, this, arrayList2));
        if (!wi0Var.d) {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i25 / uj0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) wi0Var.g).setDuration(min);
            ((ValueAnimator) wi0Var.g).setInterpolator(er.h);
        } else if (z10) {
            ((ValueAnimator) wi0Var.g).setDuration(150L);
            ((ValueAnimator) wi0Var.g).setInterpolator(er.g);
        } else {
            long measuredHeight2 = (long) (((i25 / uj0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) wi0Var.g).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) wi0Var.g).setInterpolator(er.h);
        }
        ((ValueAnimator) wi0Var.g).start();
    }
}
