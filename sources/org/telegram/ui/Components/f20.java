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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class f20 extends ScrollView {
    public final int a;
    public final a0.i b;
    public final ArrayList c;
    public final e20 d;
    public int e;
    public c20 f;
    public boolean h;
    public int n;

    public f20(Context context, int i10) {
        super(context);
        this.b = new a0.i();
        this.c = new ArrayList();
        this.a = i10;
        e20 e20Var = new e20(this, context);
        this.d = e20Var;
        setVerticalScrollBarEnabled(false);
        addView(e20Var, w7.x5.c(-2.0f, -1));
    }

    public void a(m30 m30Var) {
        e20 e20Var = this.d;
        ArrayList arrayList = e20Var.c;
        f20 f20Var = e20Var.r;
        f20Var.c.add(m30Var);
        if (!m30Var.d) {
            f20Var.b.k(m30Var, m30Var.getUid());
        }
        AnimatorSet animatorSet = e20Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            e20Var.a.setupEndValues();
            e20Var.a.cancel();
        }
        e20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        e20Var.a = animatorSet2;
        animatorSet2.addListener(new d20(e20Var, 1));
        e20Var.a.setDuration(150L);
        e20Var.d = m30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(e20Var.d, (Property<m30, Float>) View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(e20Var.d, (Property<m30, Float>) View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(e20Var.d, (Property<m30, Float>) View.ALPHA, 0.0f, 1.0f));
        e20Var.addView(m30Var);
    }

    public void b() {
        e20 e20Var = this.d;
        ArrayList arrayList = e20Var.c;
        f20 f20Var = e20Var.r;
        f20Var.h = true;
        ArrayList arrayList2 = f20Var.c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = e20Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((m30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = e20Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            e20Var.a.setupEndValues();
            e20Var.a.cancel();
        }
        e20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        e20Var.a = animatorSet2;
        animatorSet2.addListener(new bi.t(26, e20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            m30 m30Var = (m30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        e20Var.requestLayout();
    }

    public void c(m30 m30Var) {
        e20 e20Var = this.d;
        ArrayList arrayList = e20Var.e;
        ArrayList arrayList2 = e20Var.c;
        f20 f20Var = e20Var.r;
        f20Var.h = true;
        if (!m30Var.d) {
            f20Var.b.l(m30Var.getUid());
        }
        f20Var.c.remove(m30Var);
        m30Var.setOnClickListener(null);
        AnimatorSet animatorSet = e20Var.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            e20Var.a.cancel();
        }
        e20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        e20Var.a = animatorSet2;
        animatorSet2.addListener(new bi.t(25, e20Var, m30Var));
        e20Var.a.setDuration(150L);
        arrayList.clear();
        arrayList.add(m30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) View.ALPHA, 1.0f, 0.0f));
        e20Var.requestLayout();
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
        rect.top = org.telegram.messenger.w1.C(20.0f, this.n, rect.top);
        rect.bottom = org.telegram.messenger.w1.C(50.0f, this.n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(c20 c20Var) {
        this.f = c20Var;
    }
}
