// default package

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class f69 implements View.OnLayoutChangeListener {
    public final /* synthetic */ j79 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ g69 d;
    public final /* synthetic */ hw6 e;

    public f69(hw6 hw6Var, j79 j79Var, ArrayList arrayList, boolean z, g69 g69Var) {
        this.e = hw6Var;
        this.a = j79Var;
        this.b = arrayList;
        this.c = z;
        this.d = g69Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        final ArrayList arrayList;
        int height;
        int i9;
        long min;
        View view2;
        hw6 hw6Var = this.e;
        HashMap hashMap = (HashMap) hw6Var.w;
        d79 d79Var = (d79) hw6Var.e;
        d79Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        d79Var.E0();
        int childCount = d79Var.getChildCount();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z = false;
        while (true) {
            arrayList = this.b;
            if (i10 >= childCount) {
                break;
            }
            View childAt = d79Var.getChildAt(i10);
            arrayList2.add(childAt);
            if (childAt.getTop() < i11) {
                i11 = childAt.getTop();
            }
            if (childAt.getBottom() > i12) {
                i12 = childAt.getBottom();
            }
            if (childAt instanceof pk5) {
                ((pk5) childAt).b(true, false);
            }
            j79 j79Var = this.a;
            if (j79Var != null && (j79Var.b || hw6Var.c)) {
                d79Var.getClass();
                long c = j79Var.c(RecyclerView.S(childAt));
                if (hashMap.containsKey(Long.valueOf(c)) && (view2 = (View) hashMap.get(Long.valueOf(c))) != 0) {
                    if (view2 instanceof pk5) {
                        ((pk5) view2).b(false, false);
                    }
                    arrayList.remove(view2);
                    cxe cxeVar = (cxe) hw6Var.r;
                    if (cxeVar != null) {
                        cxeVar.d(view2);
                    }
                    int top = childAt.getTop() - view2.getTop();
                    if (top != 0) {
                        i13 = top;
                    }
                    z = true;
                }
            }
            i10++;
        }
        hashMap.clear();
        int size = arrayList.size();
        int i14 = 0;
        int i15 = 0;
        int i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            View view3 = (View) obj;
            int bottom = view3.getBottom();
            int top2 = view3.getTop();
            if (bottom > i14) {
                i14 = bottom;
            }
            if (top2 < i16) {
                i16 = top2;
            }
            if (view3.getParent() == null) {
                d79Var.addView(view3);
                ((x46) hw6Var.f).L(view3);
            }
            if (view3 instanceof pk5) {
                ((pk5) view3).b(true, true);
            }
        }
        int i17 = i16 == Integer.MAX_VALUE ? 0 : i16;
        cxe cxeVar2 = (cxe) hw6Var.r;
        if (cxeVar2 != null) {
            cxeVar2.b();
        }
        if (arrayList.isEmpty()) {
            i9 = Math.abs(i13);
        } else {
            if (this.c) {
                height = -i11;
            } else {
                i14 = d79Var.getHeight() - i17;
                height = i12 - d79Var.getHeight();
            }
            i9 = height + i14;
        }
        final int paddingBottom = d79Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) hw6Var.h;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) hw6Var.h).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        hw6Var.h = ofFloat;
        final boolean z2 = this.c;
        final int i18 = i9;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: e69
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z3;
                int i19;
                hw6 hw6Var2 = f69.this.e;
                d79 d79Var2 = (d79) hw6Var2.e;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = arrayList;
                int size2 = arrayList3.size();
                int i20 = 0;
                while (true) {
                    z3 = z2;
                    i19 = i18;
                    if (i20 >= size2) {
                        break;
                    }
                    View view4 = (View) arrayList3.get(i20);
                    float y = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y <= d79Var2.getMeasuredHeight()) {
                        if (z3) {
                            view4.setTranslationY((-i19) * floatValue);
                        } else {
                            view4.setTranslationY(i19 * floatValue);
                        }
                    }
                    i20++;
                }
                int paddingBottom2 = paddingBottom - d79Var2.getPaddingBottom();
                ArrayList arrayList4 = arrayList2;
                int size3 = arrayList4.size();
                for (int i21 = 0; i21 < size3; i21++) {
                    View view5 = (View) arrayList4.get(i21);
                    if (z3) {
                        view5.setTranslationY(((1.0f - floatValue) * i19) + paddingBottom2);
                    } else {
                        view5.setTranslationY((1.0f - floatValue) * (-i19));
                    }
                }
                d79Var2.invalidate();
                h69 h69Var = (h69) hw6Var2.n;
                if (h69Var != null) {
                    h69Var.f();
                }
            }
        });
        ((ValueAnimator) hw6Var.h).addListener(new wd8(this, arrayList2, (byte) 6));
        if (!hw6Var.d) {
            if (z) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i18 / d79Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) hw6Var.h).setDuration(min);
            ((ValueAnimator) hw6Var.h).setInterpolator(k43.h);
        } else if (z) {
            ((ValueAnimator) hw6Var.h).setDuration(150L);
            ((ValueAnimator) hw6Var.h).setInterpolator(k43.g);
        } else {
            long measuredHeight2 = (long) (((i18 / d79Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) hw6Var.h).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) hw6Var.h).setInterpolator(k43.h);
        }
        ((ValueAnimator) hw6Var.h).start();
    }
}
