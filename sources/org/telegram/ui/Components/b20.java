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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class b20 extends ScrollView {
    public final int a;
    public final a0.h b;
    public final ArrayList c;
    public final a20 d;
    public int e;
    public y10 f;
    public boolean h;
    public int n;

    public b20(Context context, int i10) {
        super(context);
        this.b = new a0.h();
        this.c = new ArrayList();
        this.a = i10;
        a20 a20Var = new a20(this, context);
        this.d = a20Var;
        setVerticalScrollBarEnabled(false);
        addView(a20Var, i7.f6.c(-2.0f, -1));
    }

    public void a(j30 j30Var) {
        a20 a20Var = this.d;
        ArrayList arrayList = a20Var.c;
        b20 b20Var = a20Var.r;
        b20Var.c.add(j30Var);
        if (!j30Var.d) {
            b20Var.b.k(j30Var, j30Var.getUid());
        }
        AnimatorSet animatorSet = a20Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            a20Var.a.setupEndValues();
            a20Var.a.cancel();
        }
        a20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        a20Var.a = animatorSet2;
        animatorSet2.addListener(new z10(a20Var, 1));
        a20Var.a.setDuration(150L);
        a20Var.d = j30Var;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(a20Var.d, (Property<j30, Float>) View.SCALE_X, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(a20Var.d, (Property<j30, Float>) View.SCALE_Y, 0.01f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(a20Var.d, (Property<j30, Float>) View.ALPHA, 0.0f, 1.0f));
        a20Var.addView(j30Var);
    }

    public void b() {
        a20 a20Var = this.d;
        ArrayList arrayList = a20Var.c;
        b20 b20Var = a20Var.r;
        b20Var.h = true;
        ArrayList arrayList2 = b20Var.c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        ArrayList arrayList4 = a20Var.e;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((j30) arrayList3.get(i10)).setOnClickListener(null);
        }
        AnimatorSet animatorSet = a20Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            a20Var.a.setupEndValues();
            a20Var.a.cancel();
        }
        a20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        a20Var.a = animatorSet2;
        animatorSet2.addListener(new bg.c3(27, a20Var, arrayList3));
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            j30 j30Var = (j30) arrayList3.get(i11);
            arrayList.add(ObjectAnimator.ofFloat(j30Var, (Property<j30, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(j30Var, (Property<j30, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList.add(ObjectAnimator.ofFloat(j30Var, (Property<j30, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        a20Var.requestLayout();
    }

    public void c(j30 j30Var) {
        a20 a20Var = this.d;
        ArrayList arrayList = a20Var.e;
        ArrayList arrayList2 = a20Var.c;
        b20 b20Var = a20Var.r;
        b20Var.h = true;
        if (!j30Var.d) {
            b20Var.b.l(j30Var.getUid());
        }
        b20Var.c.remove(j30Var);
        j30Var.setOnClickListener(null);
        AnimatorSet animatorSet = a20Var.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            a20Var.a.cancel();
        }
        a20Var.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        a20Var.a = animatorSet2;
        animatorSet2.addListener(new bg.c3(26, a20Var, j30Var));
        a20Var.a.setDuration(150L);
        arrayList.clear();
        arrayList.add(j30Var);
        arrayList2.clear();
        arrayList2.add(ObjectAnimator.ofFloat(j30Var, (Property<j30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(j30Var, (Property<j30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList2.add(ObjectAnimator.ofFloat(j30Var, (Property<j30, Float>) View.ALPHA, 1.0f, 0.0f));
        a20Var.requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f9 = this.e;
        float y8 = motionEvent.getY();
        if (action != 0 || y8 <= f9) {
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
        rect.top = org.telegram.messenger.x3.C(20.0f, this.n, rect.top);
        rect.bottom = org.telegram.messenger.x3.C(50.0f, this.n, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setDelegate(y10 y10Var) {
        this.f = y10Var;
    }
}
