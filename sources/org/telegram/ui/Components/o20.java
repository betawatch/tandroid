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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class o20 extends ScrollView {
    public final int a;
    public final a0.i b;
    public final ArrayList c;
    public final n20 d;
    public int e;
    public l20 f;
    public boolean h;
    public int n;

    public o20(Context context, int i10) {
        super(context);
        this.b = new a0.i();
        this.c = new ArrayList();
        this.a = i10;
        n20 n20Var = new n20(this, context);
        this.d = n20Var;
        setVerticalScrollBarEnabled(false);
        addView(n20Var, w7.a6.c(-2.0f, -1));
    }

    public void a(w30 w30Var) {
        n20 n20Var = this.d;
        ArrayList arrayList = n20Var.c;
        o20 o20Var = n20Var.r;
        o20Var.c.add(w30Var);
        if (!w30Var.d) {
            o20Var.b.k(w30Var, w30Var.getUid());
        }
        AnimatorSet animatorSet = n20Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            n20Var.a.setupEndValues();
            n20Var.a.cancel();
        }
        n20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        n20Var.a = animatorSet2;
        animatorSet2.addListener(new m20(n20Var, 1));
        n20Var.a.setDuration(150L);
        n20Var.d = w30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(n20Var.d, (Property<w30, Float>) View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(n20Var.d, (Property<w30, Float>) View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(n20Var.d, (Property<w30, Float>) View.ALPHA, 0.0f, 1.0f));
        n20Var.addView(w30Var);
    }

    public void b() {
        n20 n20Var = this.d;
        ArrayList arrayList = n20Var.c;
        o20 o20Var = n20Var.r;
        o20Var.h = true;
        ArrayList arrayList2 = o20Var.c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = n20Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((w30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = n20Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            n20Var.a.setupEndValues();
            n20Var.a.cancel();
        }
        n20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        n20Var.a = animatorSet2;
        animatorSet2.addListener(new bi.u3(24, n20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            w30 w30Var = (w30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(w30Var, (Property<w30, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(w30Var, (Property<w30, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(w30Var, (Property<w30, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        n20Var.requestLayout();
    }

    public void c(w30 w30Var) {
        n20 n20Var = this.d;
        ArrayList arrayList = n20Var.e;
        ArrayList arrayList2 = n20Var.c;
        o20 o20Var = n20Var.r;
        o20Var.h = true;
        if (!w30Var.d) {
            o20Var.b.l(w30Var.getUid());
        }
        o20Var.c.remove(w30Var);
        w30Var.setOnClickListener(null);
        AnimatorSet animatorSet = n20Var.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            n20Var.a.cancel();
        }
        n20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        n20Var.a = animatorSet2;
        animatorSet2.addListener(new bi.u3(23, n20Var, w30Var));
        n20Var.a.setDuration(150L);
        arrayList.clear();
        arrayList.add(w30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(w30Var, (Property<w30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(w30Var, (Property<w30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(w30Var, (Property<w30, Float>) View.ALPHA, 1.0f, 0.0f));
        n20Var.requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f7 = this.e;
        float y3 = motionEvent.getY();
        if (action != 0 || y3 <= f7) {
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
        rect.top = org.telegram.messenger.a2.C(20.0f, this.n, rect.top);
        rect.bottom = org.telegram.messenger.a2.C(50.0f, this.n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(l20 l20Var) {
        this.f = l20Var;
    }
}
