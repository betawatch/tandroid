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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public class j20 extends ScrollView {
    public final int a;
    public final a0.i b;
    public final ArrayList c;
    public final i20 d;
    public int e;
    public g20 f;
    public boolean h;
    public int n;

    public j20(Context context, int i10) {
        super(context);
        this.b = new a0.i();
        this.c = new ArrayList();
        this.a = i10;
        i20 i20Var = new i20(this, context);
        this.d = i20Var;
        setVerticalScrollBarEnabled(false);
        addView(i20Var, w7.z5.c(-2.0f, -1));
    }

    public void a(q30 q30Var) {
        i20 i20Var = this.d;
        ArrayList arrayList = i20Var.c;
        j20 j20Var = i20Var.r;
        j20Var.c.add(q30Var);
        if (!q30Var.d) {
            j20Var.b.k(q30Var, q30Var.getUid());
        }
        AnimatorSet animatorSet = i20Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            i20Var.a.setupEndValues();
            i20Var.a.cancel();
        }
        i20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        i20Var.a = animatorSet2;
        animatorSet2.addListener(new h20(i20Var, 1));
        i20Var.a.setDuration(150L);
        i20Var.d = q30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(i20Var.d, (Property<q30, Float>) View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(i20Var.d, (Property<q30, Float>) View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(i20Var.d, (Property<q30, Float>) View.ALPHA, 0.0f, 1.0f));
        i20Var.addView(q30Var);
    }

    public void b() {
        i20 i20Var = this.d;
        ArrayList arrayList = i20Var.c;
        j20 j20Var = i20Var.r;
        j20Var.h = true;
        ArrayList arrayList2 = j20Var.c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = i20Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((q30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = i20Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            i20Var.a.setupEndValues();
            i20Var.a.cancel();
        }
        i20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        i20Var.a = animatorSet2;
        animatorSet2.addListener(new ai.z(26, i20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            q30 q30Var = (q30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(q30Var, (Property<q30, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(q30Var, (Property<q30, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(q30Var, (Property<q30, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        i20Var.requestLayout();
    }

    public void c(q30 q30Var) {
        i20 i20Var = this.d;
        ArrayList arrayList = i20Var.e;
        ArrayList arrayList2 = i20Var.c;
        j20 j20Var = i20Var.r;
        j20Var.h = true;
        if (!q30Var.d) {
            j20Var.b.l(q30Var.getUid());
        }
        j20Var.c.remove(q30Var);
        q30Var.setOnClickListener(null);
        AnimatorSet animatorSet = i20Var.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            i20Var.a.cancel();
        }
        i20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        i20Var.a = animatorSet2;
        animatorSet2.addListener(new ai.z(25, i20Var, q30Var));
        i20Var.a.setDuration(150L);
        arrayList.clear();
        arrayList.add(q30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(q30Var, (Property<q30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(q30Var, (Property<q30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(q30Var, (Property<q30, Float>) View.ALPHA, 1.0f, 0.0f));
        i20Var.requestLayout();
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

    public void setDelegate(g20 g20Var) {
        this.f = g20Var;
    }
}
