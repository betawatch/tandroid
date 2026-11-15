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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class z00 extends ScrollView {
    public final int a;
    public final a0.h b;
    public final ArrayList c;
    public final y00 d;
    public int e;
    public w00 f;
    public boolean h;
    public int n;

    public z00(Context context, int i7) {
        super(context);
        this.b = new a0.h();
        this.c = new ArrayList();
        this.a = i7;
        y00 y00Var = new y00(this, context);
        this.d = y00Var;
        setVerticalScrollBarEnabled(false);
        addView(y00Var, c8.ja.c(-2.0f, -1));
    }

    public void a(f20 f20Var) {
        y00 y00Var = this.d;
        ArrayList arrayList = y00Var.c;
        z00 z00Var = y00Var.r;
        z00Var.c.add(f20Var);
        if (!f20Var.d) {
            z00Var.b.k(f20Var, f20Var.getUid());
        }
        AnimatorSet animatorSet = y00Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            y00Var.a.setupEndValues();
            y00Var.a.cancel();
        }
        y00Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        y00Var.a = animatorSet2;
        animatorSet2.addListener(new x00(y00Var, 1));
        y00Var.a.setDuration(150L);
        y00Var.d = f20Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(y00Var.d, (Property<f20, Float>) View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(y00Var.d, (Property<f20, Float>) View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(y00Var.d, (Property<f20, Float>) View.ALPHA, 0.0f, 1.0f));
        y00Var.addView(f20Var);
    }

    public void b() {
        y00 y00Var = this.d;
        ArrayList arrayList = y00Var.c;
        z00 z00Var = y00Var.r;
        z00Var.h = true;
        ArrayList arrayList2 = z00Var.c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = y00Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            ((f20) arrayList3.get(i7)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = y00Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            y00Var.a.setupEndValues();
            y00Var.a.cancel();
        }
        y00Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        y00Var.a = animatorSet2;
        animatorSet2.addListener(new ah.l(29, y00Var, arrayList3));
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            f20 f20Var = (f20) arrayList3.get(i10);
            arrayList.add(ObjectAnimator.ofFloat(f20Var, (Property<f20, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(f20Var, (Property<f20, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(f20Var, (Property<f20, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        y00Var.requestLayout();
    }

    public void c(f20 f20Var) {
        y00 y00Var = this.d;
        ArrayList arrayList = y00Var.e;
        ArrayList arrayList2 = y00Var.c;
        z00 z00Var = y00Var.r;
        z00Var.h = true;
        if (!f20Var.d) {
            z00Var.b.l(f20Var.getUid());
        }
        z00Var.c.remove(f20Var);
        f20Var.setOnClickListener(null);
        AnimatorSet animatorSet = y00Var.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            y00Var.a.cancel();
        }
        y00Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        y00Var.a = animatorSet2;
        animatorSet2.addListener(new ah.l(28, y00Var, f20Var));
        y00Var.a.setDuration(150L);
        arrayList.clear();
        arrayList.add(f20Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(f20Var, (Property<f20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(f20Var, (Property<f20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(f20Var, (Property<f20, Float>) View.ALPHA, 1.0f, 0.0f));
        y00Var.requestLayout();
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
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.h) {
            this.h = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.k5.C(20.0f, this.n, rect.top);
        rect.bottom = org.telegram.messenger.k5.C(50.0f, this.n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(w00 w00Var) {
        this.f = w00Var;
    }
}
