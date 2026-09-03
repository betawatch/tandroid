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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class h20 extends ScrollView {
    public final int a;
    public final a0.h b;
    public final ArrayList c;
    public final g20 d;
    public int e;
    public e20 f;
    public boolean h;
    public int n;

    public h20(Context context, int i10) {
        super(context);
        this.b = new a0.h();
        this.c = new ArrayList();
        this.a = i10;
        g20 g20Var = new g20(this, context);
        this.d = g20Var;
        setVerticalScrollBarEnabled(false);
        addView(g20Var, k7.c6.c(-2.0f, -1));
    }

    public void a(p30 p30Var) {
        g20 g20Var = this.d;
        ArrayList arrayList = g20Var.c;
        h20 h20Var = g20Var.r;
        h20Var.c.add(p30Var);
        if (!p30Var.d) {
            h20Var.b.k(p30Var, p30Var.getUid());
        }
        AnimatorSet animatorSet = g20Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            g20Var.a.setupEndValues();
            g20Var.a.cancel();
        }
        g20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        g20Var.a = animatorSet2;
        animatorSet2.addListener(new f20(g20Var, 1));
        g20Var.a.setDuration(150L);
        g20Var.d = p30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(g20Var.d, (Property<p30, Float>) View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(g20Var.d, (Property<p30, Float>) View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(g20Var.d, (Property<p30, Float>) View.ALPHA, 0.0f, 1.0f));
        g20Var.addView(p30Var);
    }

    public void b() {
        g20 g20Var = this.d;
        ArrayList arrayList = g20Var.c;
        h20 h20Var = g20Var.r;
        h20Var.h = true;
        ArrayList arrayList2 = h20Var.c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = g20Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((p30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = g20Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            g20Var.a.setupEndValues();
            g20Var.a.cancel();
        }
        g20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        g20Var.a = animatorSet2;
        animatorSet2.addListener(new eg.w2(23, g20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            p30 p30Var = (p30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(p30Var, (Property<p30, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(p30Var, (Property<p30, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(p30Var, (Property<p30, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        g20Var.requestLayout();
    }

    public void c(p30 p30Var) {
        g20 g20Var = this.d;
        ArrayList arrayList = g20Var.e;
        ArrayList arrayList2 = g20Var.c;
        h20 h20Var = g20Var.r;
        h20Var.h = true;
        if (!p30Var.d) {
            h20Var.b.l(p30Var.getUid());
        }
        h20Var.c.remove(p30Var);
        p30Var.setOnClickListener(null);
        AnimatorSet animatorSet = g20Var.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            g20Var.a.cancel();
        }
        g20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        g20Var.a = animatorSet2;
        animatorSet2.addListener(new eg.w2(22, g20Var, p30Var));
        g20Var.a.setDuration(150L);
        arrayList.clear();
        arrayList.add(p30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(p30Var, (Property<p30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(p30Var, (Property<p30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(p30Var, (Property<p30, Float>) View.ALPHA, 1.0f, 0.0f));
        g20Var.requestLayout();
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
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        if (this.h) {
            this.h = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.y3.C(20.0f, this.n, rect.top);
        rect.bottom = org.telegram.messenger.y3.C(50.0f, this.n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    public void setDelegate(e20 e20Var) {
        this.f = e20Var;
    }
}
