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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public class s20 extends ScrollView {
    public final int a;
    public final a0.h b;
    public final ArrayList c;
    public final r20 d;
    public int e;
    public p20 f;
    public boolean h;
    public int n;

    public s20(Context context, int i10) {
        super(context);
        this.b = new a0.h();
        this.c = new ArrayList();
        this.a = i10;
        r20 r20Var = new r20(this, context);
        this.d = r20Var;
        setVerticalScrollBarEnabled(false);
        addView(r20Var, w7.z5.d(-2.0f, -1));
    }

    public void a(z30 z30Var) {
        r20 r20Var = this.d;
        ArrayList arrayList = r20Var.c;
        s20 s20Var = r20Var.r;
        s20Var.c.add(z30Var);
        if (!z30Var.d) {
            s20Var.b.k(z30Var, z30Var.getUid());
        }
        AnimatorSet animatorSet = r20Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            r20Var.a.setupEndValues();
            r20Var.a.cancel();
        }
        r20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        r20Var.a = animatorSet2;
        animatorSet2.addListener(new q20(r20Var, 1));
        r20Var.a.setDuration(150L);
        r20Var.d = z30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(r20Var.d, (Property<z30, Float>) View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(r20Var.d, (Property<z30, Float>) View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(r20Var.d, (Property<z30, Float>) View.ALPHA, 0.0f, 1.0f));
        r20Var.addView(z30Var);
    }

    public void b() {
        r20 r20Var = this.d;
        ArrayList arrayList = r20Var.c;
        s20 s20Var = r20Var.r;
        s20Var.h = true;
        ArrayList arrayList2 = s20Var.c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = r20Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((z30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = r20Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            r20Var.a.setupEndValues();
            r20Var.a.cancel();
        }
        r20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        r20Var.a = animatorSet2;
        animatorSet2.addListener(new bi.t(26, r20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            z30 z30Var = (z30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(z30Var, (Property<z30, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(z30Var, (Property<z30, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(z30Var, (Property<z30, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        r20Var.requestLayout();
    }

    public void c(z30 z30Var) {
        r20 r20Var = this.d;
        ArrayList arrayList = r20Var.e;
        ArrayList arrayList2 = r20Var.c;
        s20 s20Var = r20Var.r;
        s20Var.h = true;
        if (!z30Var.d) {
            s20Var.b.l(z30Var.getUid());
        }
        s20Var.c.remove(z30Var);
        z30Var.setOnClickListener(null);
        AnimatorSet animatorSet = r20Var.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            r20Var.a.cancel();
        }
        r20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        r20Var.a = animatorSet2;
        animatorSet2.addListener(new bi.t(25, r20Var, z30Var));
        r20Var.a.setDuration(150L);
        arrayList.clear();
        arrayList.add(z30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(z30Var, (Property<z30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(z30Var, (Property<z30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(z30Var, (Property<z30, Float>) View.ALPHA, 1.0f, 0.0f));
        r20Var.requestLayout();
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
        rect.top = org.telegram.messenger.g0.C(20.0f, this.n, rect.top);
        rect.bottom = org.telegram.messenger.g0.C(50.0f, this.n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(p20 p20Var) {
        this.f = p20Var;
    }
}
