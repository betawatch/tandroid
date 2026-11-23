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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class j10 extends ScrollView {
    public final int a;
    public final a0.h b;
    public final ArrayList c;
    public final i10 d;
    public int e;
    public f10 f;
    public boolean h;
    public int n;

    public j10(Context context, int i7) {
        super(context);
        this.b = new a0.h();
        this.c = new ArrayList();
        this.a = i7;
        i10 i10Var = new i10(this, context);
        this.d = i10Var;
        setVerticalScrollBarEnabled(false);
        addView(i10Var, c8.ma.c(-2.0f, -1));
    }

    public void a(p20 p20Var) {
        i10 i10Var = this.d;
        ArrayList arrayList = i10Var.c;
        j10 j10Var = i10Var.r;
        j10Var.c.add(p20Var);
        if (!p20Var.d) {
            j10Var.b.k(p20Var, p20Var.getUid());
        }
        AnimatorSet animatorSet = i10Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            i10Var.a.setupEndValues();
            i10Var.a.cancel();
        }
        i10Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        i10Var.a = animatorSet2;
        animatorSet2.addListener(new g10(i10Var, 1));
        i10Var.a.setDuration(150L);
        i10Var.d = p20Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(i10Var.d, (Property<p20, Float>) View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(i10Var.d, (Property<p20, Float>) View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(i10Var.d, (Property<p20, Float>) View.ALPHA, 0.0f, 1.0f));
        i10Var.addView(p20Var);
    }

    public void b() {
        i10 i10Var = this.d;
        ArrayList arrayList = i10Var.c;
        j10 j10Var = i10Var.r;
        j10Var.h = true;
        ArrayList arrayList2 = j10Var.c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = i10Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((p20) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = i10Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            i10Var.a.setupEndValues();
            i10Var.a.cancel();
        }
        i10Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        i10Var.a = animatorSet2;
        animatorSet2.addListener(new h10(i7, i10Var, arrayList3));
        arrayList.clear();
        while (i7 < arrayList3.size()) {
            p20 p20Var = (p20) arrayList3.get(i7);
            arrayList.add(ObjectAnimator.ofFloat(p20Var, (Property<p20, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(p20Var, (Property<p20, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(p20Var, (Property<p20, Float>) View.ALPHA, 1.0f, 0.0f));
            i7++;
        }
        i10Var.requestLayout();
    }

    public void c(p20 p20Var) {
        i10 i10Var = this.d;
        ArrayList arrayList = i10Var.e;
        ArrayList arrayList2 = i10Var.c;
        j10 j10Var = i10Var.r;
        j10Var.h = true;
        if (!p20Var.d) {
            j10Var.b.l(p20Var.getUid());
        }
        j10Var.c.remove(p20Var);
        p20Var.setOnClickListener(null);
        AnimatorSet animatorSet = i10Var.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            i10Var.a.cancel();
        }
        i10Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        i10Var.a = animatorSet2;
        animatorSet2.addListener(new ah.l(29, i10Var, p20Var));
        i10Var.a.setDuration(150L);
        arrayList.clear();
        arrayList.add(p20Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(p20Var, (Property<p20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(p20Var, (Property<p20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(p20Var, (Property<p20, Float>) View.ALPHA, 1.0f, 0.0f));
        i10Var.requestLayout();
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

    public void setDelegate(f10 f10Var) {
        this.f = f10Var;
    }
}
