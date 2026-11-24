// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ht5 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public wc5 c;
    public boolean d;
    public final /* synthetic */ it5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht5(it5 it5Var, Context context) {
        super(context);
        this.e = it5Var;
        this.b = new ArrayList();
    }

    public final void a(wc5 wc5Var, boolean z) {
        byte b = 1;
        this.d = true;
        it5 it5Var = this.e;
        it5Var.Z1.k(wc5Var, wc5Var.getUid());
        AnimatorSet animatorSet = it5Var.X1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            it5Var.X1.cancel();
        }
        this.a = false;
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            it5Var.X1 = animatorSet2;
            animatorSet2.addListener(new gt5(this, b));
            it5Var.X1.setDuration(150L);
            it5Var.X1.setInterpolator(d53.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(wc5Var, (Property<wc5, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(wc5Var, (Property<wc5, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(wc5Var, (Property<wc5, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(wc5Var);
    }

    public final void b(wc5 wc5Var) {
        this.d = false;
        it5 it5Var = this.e;
        it5Var.Z1.l(wc5Var.getUid());
        wc5Var.setOnClickListener(null);
        AnimatorSet animatorSet = it5Var.X1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            it5Var.X1.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        it5Var.X1 = animatorSet2;
        animatorSet2.addListener(new u5(this, wc5Var, (byte) 27));
        it5Var.X1.setDuration(150L);
        this.c = wc5Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<wc5, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<wc5, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<wc5, Float>) View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ArrayList arrayList;
        u69 K;
        AnimatorSet animatorSet;
        xd xdVar;
        int i3;
        it5 it5Var = this.e;
        xd xdVar2 = it5Var.P1;
        pu9 pu9Var = it5Var.n1;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i);
        int L = size - gm.L(26.0f);
        int L2 = gm.L(10.0f);
        int L3 = gm.L(10.0f);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            arrayList = this.b;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt instanceof wc5) {
                xdVar = xdVar2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), TLObject.FLAG_30));
                if (childAt != this.c && childAt.getMeasuredWidth() + i5 > L) {
                    L2 = hg9.v(8.0f, childAt.getMeasuredHeight(), L2);
                    i5 = 0;
                }
                if (childAt.getMeasuredWidth() + i6 > L) {
                    L3 = hg9.v(8.0f, childAt.getMeasuredHeight(), L3);
                    i6 = 0;
                }
                int L4 = gm.L(13.0f) + i5;
                if (!this.a) {
                    wc5 wc5Var = this.c;
                    if (childAt == wc5Var) {
                        childAt.setTranslationX(gm.L(13.0f) + i6);
                        childAt.setTranslationY(L3);
                    } else if (wc5Var != null) {
                        float f = L4;
                        if (childAt.getTranslationX() != f) {
                            i3 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f));
                        } else {
                            i3 = 1;
                        }
                        float f2 = L2;
                        if (childAt.getTranslationY() != f2) {
                            float[] fArr = new float[i3];
                            fArr[0] = f2;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                    }
                }
                if (childAt != this.c) {
                    i5 = hg9.v(9.0f, childAt.getMeasuredWidth(), i5);
                }
                i6 = hg9.v(9.0f, childAt.getMeasuredWidth(), i6);
            } else {
                xdVar = xdVar2;
            }
            i4++;
            xdVar2 = xdVar;
        }
        xd xdVar3 = xdVar2;
        int L5 = gm.L(42.0f) + L3;
        final int L6 = gm.L(42.0f) + L2;
        int min = it5Var.g2 != null ? it5Var.a2 ? Math.min(it5Var.m2, L6) : 0 : b10.c(52.0f, Math.min(it5Var.m2, L6), 0);
        int i7 = it5Var.o2;
        int L7 = (it5Var.g2 != null || it5Var.Z1.m() <= 0) ? 0 : gm.L(56.0f);
        it5Var.o2 = L7;
        if (min != it5Var.i2 || i7 != L7) {
            it5Var.i2 = min;
            if (pu9Var.getAdapter() != null && pu9Var.getAdapter().b() > 0 && (K = pu9Var.K(0)) != null) {
                pu9Var.getAdapter().g(0);
                it5Var.L1.g1(0, K.a.getTop() - pu9Var.getPaddingTop());
                if (pu9Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new af0(this, (byte) 6));
                    ofFloat.setDuration(pu9Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(it5Var.m2, L6);
        int i8 = it5Var.e2;
        if (i8 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i8, min2);
            ofInt.addUpdateListener(new fh4(this, (byte) 14));
            arrayList.add(ofInt);
        }
        if (this.d) {
            if (L6 > it5Var.m2) {
                final byte b = 0;
                gm.c3(new Runnable(this) { // from class: ft5
                    public final /* synthetic */ ht5 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        int i9 = L6;
                        ht5 ht5Var = this.b;
                        switch (b2) {
                            case 0:
                                it5 it5Var2 = ht5Var.e;
                                it5Var2.P1.smoothScrollTo(0, i9 - it5Var2.m2);
                                break;
                            default:
                                it5 it5Var3 = ht5Var.e;
                                it5Var3.P1.smoothScrollTo(0, i9 - it5Var3.m2);
                                break;
                        }
                    }
                });
            }
        } else if (xdVar3.getMeasuredHeight() + xdVar3.getScrollY() > L6) {
            final byte b2 = 1;
            gm.c3(new Runnable(this) { // from class: ft5
                public final /* synthetic */ ht5 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b2;
                    int i9 = L6;
                    ht5 ht5Var = this.b;
                    switch (b22) {
                        case 0:
                            it5 it5Var2 = ht5Var.e;
                            it5Var2.P1.smoothScrollTo(0, i9 - it5Var2.m2);
                            break;
                        default:
                            it5 it5Var3 = ht5Var.e;
                            it5Var3.P1.smoothScrollTo(0, i9 - it5Var3.m2);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = it5Var.X1) != null) {
            animatorSet.playTogether(arrayList);
            it5Var.X1.addListener(new gt5(this, (byte) 0));
            it5Var.X1.start();
            this.a = true;
        }
        if (it5Var.X1 == null) {
            it5Var.e2 = min2;
            it5Var.b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L6, L5));
        pu9Var.setTranslationY(0.0f);
    }
}
