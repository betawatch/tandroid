package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class w00 extends ScrollView {
    public final int a;
    public final a0.h b;
    public final ArrayList c;
    public final v00 d;
    public int e;
    public t00 f;
    public boolean h;
    public int n;

    public w00(Context context, int i7) {
        super(context);
        this.b = new a0.h();
        this.c = new ArrayList();
        this.a = i7;
        v00 v00Var = new v00(this, context);
        this.d = v00Var;
        setVerticalScrollBarEnabled(false);
        addView(v00Var, c8.ha.c(-2.0f, -1));
    }

    public void a(d20 d20Var) {
        v00 v00Var = this.d;
        ArrayList arrayList = v00Var.c;
        w00 w00Var = v00Var.r;
        w00Var.c.add(d20Var);
        if (!d20Var.d) {
            w00Var.b.k(d20Var, d20Var.getUid());
        }
        AnimatorSet animatorSet = v00Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            v00Var.a.setupEndValues();
            v00Var.a.cancel();
        }
        v00Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        v00Var.a = animatorSet2;
        animatorSet2.addListener(new u00(v00Var, 1));
        v00Var.a.setDuration(150L);
        v00Var.d = d20Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(v00Var.d, (Property<d20, Float>) View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(v00Var.d, (Property<d20, Float>) View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(v00Var.d, (Property<d20, Float>) View.ALPHA, 0.0f, 1.0f));
        v00Var.addView(d20Var);
    }

    public void b() {
        v00 v00Var = this.d;
        ArrayList arrayList = v00Var.c;
        w00 w00Var = v00Var.r;
        w00Var.h = true;
        ArrayList arrayList2 = w00Var.c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = v00Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            ((d20) arrayList3.get(i7)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = v00Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            v00Var.a.setupEndValues();
            v00Var.a.cancel();
        }
        v00Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        v00Var.a = animatorSet2;
        animatorSet2.addListener(new ah.l(29, v00Var, arrayList3));
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            d20 d20Var = (d20) arrayList3.get(i10);
            arrayList.add(ObjectAnimator.ofFloat(d20Var, (Property<d20, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(d20Var, (Property<d20, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(d20Var, (Property<d20, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        v00Var.requestLayout();
    }

    public void c(d20 d20Var) {
        v00 v00Var = this.d;
        ArrayList arrayList = v00Var.e;
        ArrayList arrayList2 = v00Var.c;
        w00 w00Var = v00Var.r;
        w00Var.h = true;
        if (!d20Var.d) {
            w00Var.b.l(d20Var.getUid());
        }
        w00Var.c.remove(d20Var);
        d20Var.setOnClickListener(null);
        AnimatorSet animatorSet = v00Var.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            v00Var.a.cancel();
        }
        v00Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        v00Var.a = animatorSet2;
        animatorSet2.addListener(new ah.l(28, v00Var, d20Var));
        v00Var.a.setDuration(150L);
        arrayList.clear();
        arrayList.add(d20Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(d20Var, (Property<d20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(d20Var, (Property<d20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(d20Var, (Property<d20, Float>) View.ALPHA, 1.0f, 0.0f));
        v00Var.requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f10 = this.e;
        float y10 = motionEvent.getY();
        if (action != 0 || y10 <= f10) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public ViewGroup getSpansContainer() {
        return this.d;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        if (this.h) {
            this.h = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.k5.C(20.0f, this.n, rect.top);
        rect.bottom = org.telegram.messenger.k5.C(50.0f, this.n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z9);
    }

    public void setDelegate(t00 t00Var) {
        this.f = t00Var;
    }
}
