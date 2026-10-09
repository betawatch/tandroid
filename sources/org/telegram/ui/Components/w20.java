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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class w20 extends ScrollView {
    public final int a;
    public final a0.i b;
    public final ArrayList c;
    public final v20 d;
    public int e;
    public t20 f;
    public boolean h;
    public int n;

    public w20(Context context, int i10) {
        super(context);
        this.b = new a0.i();
        this.c = new ArrayList();
        this.a = i10;
        v20 v20Var = new v20(this, context);
        this.d = v20Var;
        setVerticalScrollBarEnabled(false);
        addView(v20Var, w7.x5.d(-2.0f, -1));
    }

    public void a(d40 d40Var) {
        v20 v20Var = this.d;
        ArrayList arrayList = v20Var.c;
        w20 w20Var = v20Var.r;
        w20Var.c.add(d40Var);
        if (!d40Var.d) {
            w20Var.b.k(d40Var, d40Var.getUid());
        }
        AnimatorSet animatorSet = v20Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            v20Var.a.setupEndValues();
            v20Var.a.cancel();
        }
        v20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        v20Var.a = animatorSet2;
        animatorSet2.addListener(new u20(v20Var, 1));
        v20Var.a.setDuration(150L);
        v20Var.d = d40Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(v20Var.d, (Property<d40, Float>) View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(v20Var.d, (Property<d40, Float>) View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(v20Var.d, (Property<d40, Float>) View.ALPHA, 0.0f, 1.0f));
        v20Var.addView(d40Var);
    }

    public void b() {
        v20 v20Var = this.d;
        ArrayList arrayList = v20Var.c;
        w20 w20Var = v20Var.r;
        w20Var.h = true;
        ArrayList arrayList2 = w20Var.c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = v20Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((d40) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = v20Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            v20Var.a.setupEndValues();
            v20Var.a.cancel();
        }
        v20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        v20Var.a = animatorSet2;
        animatorSet2.addListener(new ai.z(26, v20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            d40 d40Var = (d40) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(d40Var, (Property<d40, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(d40Var, (Property<d40, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(d40Var, (Property<d40, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        v20Var.requestLayout();
    }

    public void c(d40 d40Var) {
        v20 v20Var = this.d;
        ArrayList arrayList = v20Var.e;
        ArrayList arrayList2 = v20Var.c;
        w20 w20Var = v20Var.r;
        w20Var.h = true;
        if (!d40Var.d) {
            w20Var.b.l(d40Var.getUid());
        }
        w20Var.c.remove(d40Var);
        d40Var.setOnClickListener(null);
        AnimatorSet animatorSet = v20Var.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            v20Var.a.cancel();
        }
        v20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        v20Var.a = animatorSet2;
        animatorSet2.addListener(new ai.z(25, v20Var, d40Var));
        v20Var.a.setDuration(150L);
        arrayList.clear();
        arrayList.add(d40Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(d40Var, (Property<d40, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(d40Var, (Property<d40, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(d40Var, (Property<d40, Float>) View.ALPHA, 1.0f, 0.0f));
        v20Var.requestLayout();
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
        rect.top = org.telegram.messenger.q.C(20.0f, this.n, rect.top);
        rect.bottom = org.telegram.messenger.q.C(50.0f, this.n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(t20 t20Var) {
        this.f = t20Var;
    }
}
