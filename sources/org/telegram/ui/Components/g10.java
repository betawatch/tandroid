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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class g10 extends ScrollView {
    public final int a;
    public final a0.h b;
    public final ArrayList c;
    public final f10 d;
    public int e;
    public d10 f;
    public boolean h;
    public int n;

    public g10(Context context, int i7) {
        super(context);
        this.b = new a0.h();
        this.c = new ArrayList();
        this.a = i7;
        f10 f10Var = new f10(this, context);
        this.d = f10Var;
        setVerticalScrollBarEnabled(false);
        addView(f10Var, c8.ma.c(-2.0f, -1));
    }

    public void a(m20 m20Var) {
        f10 f10Var = this.d;
        ArrayList arrayList = f10Var.c;
        g10 g10Var = f10Var.r;
        g10Var.c.add(m20Var);
        if (!m20Var.d) {
            g10Var.b.k(m20Var, m20Var.getUid());
        }
        AnimatorSet animatorSet = f10Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            f10Var.a.setupEndValues();
            f10Var.a.cancel();
        }
        f10Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        f10Var.a = animatorSet2;
        animatorSet2.addListener(new e10(f10Var, 1));
        f10Var.a.setDuration(150L);
        f10Var.d = m20Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(f10Var.d, (Property<m20, Float>) View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(f10Var.d, (Property<m20, Float>) View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(f10Var.d, (Property<m20, Float>) View.ALPHA, 0.0f, 1.0f));
        f10Var.addView(m20Var);
    }

    public void b() {
        f10 f10Var = this.d;
        ArrayList arrayList = f10Var.c;
        g10 g10Var = f10Var.r;
        g10Var.h = true;
        ArrayList arrayList2 = g10Var.c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = f10Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            ((m20) arrayList3.get(i7)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = f10Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            f10Var.a.setupEndValues();
            f10Var.a.cancel();
        }
        f10Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        f10Var.a = animatorSet2;
        animatorSet2.addListener(new ah.l(29, f10Var, arrayList3));
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            m20 m20Var = (m20) arrayList3.get(i10);
            arrayList.add(ObjectAnimator.ofFloat(m20Var, (Property<m20, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(m20Var, (Property<m20, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(m20Var, (Property<m20, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        f10Var.requestLayout();
    }

    public void c(m20 m20Var) {
        f10 f10Var = this.d;
        ArrayList arrayList = f10Var.e;
        ArrayList arrayList2 = f10Var.c;
        g10 g10Var = f10Var.r;
        g10Var.h = true;
        if (!m20Var.d) {
            g10Var.b.l(m20Var.getUid());
        }
        g10Var.c.remove(m20Var);
        m20Var.setOnClickListener(null);
        AnimatorSet animatorSet = f10Var.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            f10Var.a.cancel();
        }
        f10Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        f10Var.a = animatorSet2;
        animatorSet2.addListener(new ah.l(28, f10Var, m20Var));
        f10Var.a.setDuration(150L);
        arrayList.clear();
        arrayList.add(m20Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(m20Var, (Property<m20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(m20Var, (Property<m20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(m20Var, (Property<m20, Float>) View.ALPHA, 1.0f, 0.0f));
        f10Var.requestLayout();
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
        rect.top = org.telegram.messenger.f3.C(20.0f, this.n, rect.top);
        rect.bottom = org.telegram.messenger.f3.C(50.0f, this.n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(d10 d10Var) {
        this.f = d10Var;
    }
}
