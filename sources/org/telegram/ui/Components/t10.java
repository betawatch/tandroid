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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class t10 extends ScrollView {
    public final int a;
    public final a0.h b;
    public final ArrayList c;
    public final s10 d;
    public int e;
    public q10 f;
    public boolean h;
    public int n;

    public t10(Context context, int i10) {
        super(context);
        this.b = new a0.h();
        this.c = new ArrayList();
        this.a = i10;
        s10 s10Var = new s10(this, context);
        this.d = s10Var;
        setVerticalScrollBarEnabled(false);
        addView(s10Var, h7.z5.c(-2.0f, -1));
    }

    public void a(a30 a30Var) {
        s10 s10Var = this.d;
        ArrayList arrayList = s10Var.c;
        t10 t10Var = s10Var.r;
        t10Var.c.add(a30Var);
        if (!a30Var.d) {
            t10Var.b.k(a30Var, a30Var.getUid());
        }
        AnimatorSet animatorSet = s10Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            s10Var.a.setupEndValues();
            s10Var.a.cancel();
        }
        s10Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        s10Var.a = animatorSet2;
        animatorSet2.addListener(new r10(s10Var, 1));
        s10Var.a.setDuration(150L);
        s10Var.d = a30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(s10Var.d, (Property<a30, Float>) View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(s10Var.d, (Property<a30, Float>) View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(s10Var.d, (Property<a30, Float>) View.ALPHA, 0.0f, 1.0f));
        s10Var.addView(a30Var);
    }

    public void b() {
        s10 s10Var = this.d;
        ArrayList arrayList = s10Var.c;
        t10 t10Var = s10Var.r;
        t10Var.h = true;
        ArrayList arrayList2 = t10Var.c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = s10Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((a30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = s10Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            s10Var.a.setupEndValues();
            s10Var.a.cancel();
        }
        s10Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        s10Var.a = animatorSet2;
        animatorSet2.addListener(new ag.x1(26, s10Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            a30 a30Var = (a30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        s10Var.requestLayout();
    }

    public void c(a30 a30Var) {
        s10 s10Var = this.d;
        ArrayList arrayList = s10Var.e;
        ArrayList arrayList2 = s10Var.c;
        t10 t10Var = s10Var.r;
        t10Var.h = true;
        if (!a30Var.d) {
            t10Var.b.l(a30Var.getUid());
        }
        t10Var.c.remove(a30Var);
        a30Var.setOnClickListener(null);
        AnimatorSet animatorSet = s10Var.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            s10Var.a.cancel();
        }
        s10Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        s10Var.a = animatorSet2;
        animatorSet2.addListener(new ag.x1(25, s10Var, a30Var));
        s10Var.a.setDuration(150L);
        arrayList.clear();
        arrayList.add(a30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.ALPHA, 1.0f, 0.0f));
        s10Var.requestLayout();
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
        rect.top = org.telegram.messenger.y1.C(20.0f, this.n, rect.top);
        rect.bottom = org.telegram.messenger.y1.C(50.0f, this.n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(q10 q10Var) {
        this.f = q10Var;
    }
}
