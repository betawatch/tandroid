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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ir5 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public ya5 c;
    public boolean d;
    public final /* synthetic */ jr5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir5(jr5 jr5Var, Context context) {
        super(context);
        this.e = jr5Var;
        this.b = new ArrayList();
    }

    public final void a(ya5 ya5Var, boolean z) {
        byte b = 1;
        this.d = true;
        jr5 jr5Var = this.e;
        jr5Var.Z1.k(ya5Var, ya5Var.getUid());
        AnimatorSet animatorSet = jr5Var.X1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            jr5Var.X1.cancel();
        }
        this.a = false;
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            jr5Var.X1 = animatorSet2;
            animatorSet2.addListener(new hr5(this, b));
            jr5Var.X1.setDuration(150L);
            jr5Var.X1.setInterpolator(s33.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(ya5Var, (Property<ya5, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(ya5Var, (Property<ya5, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(ya5Var, (Property<ya5, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(ya5Var);
    }

    public final void b(ya5 ya5Var) {
        this.d = false;
        jr5 jr5Var = this.e;
        jr5Var.Z1.l(ya5Var.getUid());
        ya5Var.setOnClickListener(null);
        AnimatorSet animatorSet = jr5Var.X1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            jr5Var.X1.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        jr5Var.X1 = animatorSet2;
        animatorSet2.addListener(new u5(this, ya5Var, (byte) 27));
        jr5Var.X1.setDuration(150L);
        this.c = ya5Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<ya5, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<ya5, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<ya5, Float>) View.ALPHA, 1.0f, 0.0f));
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
        s49 K;
        AnimatorSet animatorSet;
        xc xcVar;
        int i3;
        jr5 jr5Var = this.e;
        xc xcVar2 = jr5Var.P1;
        ns9 ns9Var = jr5Var.n1;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i);
        int L = size - gl.L(26.0f);
        int L2 = gl.L(10.0f);
        int L3 = gl.L(10.0f);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            arrayList = this.b;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt instanceof ya5) {
                xcVar = xcVar2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(32.0f), TLObject.FLAG_30));
                if (childAt != this.c && childAt.getMeasuredWidth() + i5 > L) {
                    L2 = de9.w(8.0f, childAt.getMeasuredHeight(), L2);
                    i5 = 0;
                }
                if (childAt.getMeasuredWidth() + i6 > L) {
                    L3 = de9.w(8.0f, childAt.getMeasuredHeight(), L3);
                    i6 = 0;
                }
                int L4 = gl.L(13.0f) + i5;
                if (!this.a) {
                    ya5 ya5Var = this.c;
                    if (childAt == ya5Var) {
                        childAt.setTranslationX(gl.L(13.0f) + i6);
                        childAt.setTranslationY(L3);
                    } else if (ya5Var != null) {
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
                    i5 = de9.w(9.0f, childAt.getMeasuredWidth(), i5);
                }
                i6 = de9.w(9.0f, childAt.getMeasuredWidth(), i6);
            } else {
                xcVar = xcVar2;
            }
            i4++;
            xcVar2 = xcVar;
        }
        xc xcVar3 = xcVar2;
        int L5 = gl.L(42.0f) + L3;
        final int L6 = gl.L(42.0f) + L2;
        int min = jr5Var.g2 != null ? jr5Var.a2 ? Math.min(jr5Var.m2, L6) : 0 : b00.c(52.0f, Math.min(jr5Var.m2, L6), 0);
        int i7 = jr5Var.o2;
        int L7 = (jr5Var.g2 != null || jr5Var.Z1.m() <= 0) ? 0 : gl.L(56.0f);
        jr5Var.o2 = L7;
        if (min != jr5Var.i2 || i7 != L7) {
            jr5Var.i2 = min;
            if (ns9Var.getAdapter() != null && ns9Var.getAdapter().b() > 0 && (K = ns9Var.K(0)) != null) {
                ns9Var.getAdapter().g(0);
                jr5Var.L1.g1(0, K.a.getTop() - ns9Var.getPaddingTop());
                if (ns9Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ae0(this, (byte) 6));
                    ofFloat.setDuration(ns9Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(jr5Var.m2, L6);
        int i8 = jr5Var.e2;
        if (i8 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i8, min2);
            ofInt.addUpdateListener(new ni4(this, (byte) 12));
            arrayList.add(ofInt);
        }
        if (this.d) {
            if (L6 > jr5Var.m2) {
                final byte b = 0;
                gl.d3(new Runnable(this) { // from class: gr5
                    public final /* synthetic */ ir5 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        int i9 = L6;
                        ir5 ir5Var = this.b;
                        switch (b2) {
                            case 0:
                                jr5 jr5Var2 = ir5Var.e;
                                jr5Var2.P1.smoothScrollTo(0, i9 - jr5Var2.m2);
                                break;
                            default:
                                jr5 jr5Var3 = ir5Var.e;
                                jr5Var3.P1.smoothScrollTo(0, i9 - jr5Var3.m2);
                                break;
                        }
                    }
                });
            }
        } else if (xcVar3.getMeasuredHeight() + xcVar3.getScrollY() > L6) {
            final byte b2 = 1;
            gl.d3(new Runnable(this) { // from class: gr5
                public final /* synthetic */ ir5 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b2;
                    int i9 = L6;
                    ir5 ir5Var = this.b;
                    switch (b22) {
                        case 0:
                            jr5 jr5Var2 = ir5Var.e;
                            jr5Var2.P1.smoothScrollTo(0, i9 - jr5Var2.m2);
                            break;
                        default:
                            jr5 jr5Var3 = ir5Var.e;
                            jr5Var3.P1.smoothScrollTo(0, i9 - jr5Var3.m2);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = jr5Var.X1) != null) {
            animatorSet.playTogether(arrayList);
            jr5Var.X1.addListener(new hr5(this, (byte) 0));
            jr5Var.X1.start();
            this.a = true;
        }
        if (jr5Var.X1 == null) {
            jr5Var.e2 = min2;
            jr5Var.b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L6, L5));
        ns9Var.setTranslationY(0.0f);
    }
}
