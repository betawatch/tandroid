package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class ua extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public int a;
    public boolean b;
    public final ta[] c;
    public int d;
    public boolean e;
    public boolean f;
    public int h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Drawable w;

    public ua(Context context, int i10) {
        super(context);
        this.b = true;
        int i11 = 3;
        this.d = 3;
        this.c = new ta[i10];
        int i12 = 0;
        while (true) {
            ta[] taVarArr = this.c;
            if (i12 >= taVarArr.length) {
                Paint paint = new Paint();
                this.n = paint;
                paint.setColor(855638016);
                this.r = new Paint(1);
                this.w = i0.a.f(context, R.drawable.background_selected);
                Paint paint2 = new Paint();
                this.s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zi, false));
                return;
            }
            ta taVar = new ta(this, context);
            taVarArr[i12] = taVar;
            taVar.setClipToOutline(true);
            addView(taVar);
            taVar.setOnClickListener(new jg.w1(this, taVar, i12, i11));
            taVar.setOnLongClickListener(new sa(this, taVar, i12));
            i12++;
        }
    }

    public abstract void a(int i10, Object obj);

    public boolean b(Object obj, int i10) {
        return false;
    }

    public final void c(int i10, boolean z10, boolean z11) {
        ta taVar = this.c[i10];
        ag.d2 d2Var = taVar.a;
        CheckBox checkBox = taVar.c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = taVar.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            taVar.f = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            taVar.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(d2Var, "scaleX", z10 ? 0.8875f : 1.0f), ObjectAnimator.ofFloat(d2Var, "scaleY", z10 ? 0.8875f : 1.0f));
            taVar.f.setDuration(200L);
            taVar.f.addListener(new eg.m(11, taVar, z10));
            taVar.f.start();
        } else {
            d2Var.setScaleX(z10 ? 0.8875f : 1.0f);
            d2Var.setScaleY(z10 ? 0.8875f : 1.0f);
        }
        taVar.invalidate();
    }

    public final void d(int i10, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        this.d = i10;
        this.e = z10;
        this.f = z11;
        int i11 = 0;
        while (true) {
            ta[] taVarArr = this.c;
            if (i11 >= taVarArr.length) {
                return;
            }
            rf.d0 d0Var = null;
            if ((z10 || z11) && (i11 == 0 || i11 == i10 - 1)) {
                ta taVar = taVarArr[i11];
                int L = org.telegram.messenger.i0.L(16.0f);
                boolean z14 = i11 == 0;
                boolean z15 = i11 == i10 + (-1);
                bi.d2 d2Var = rf.e0.a;
                if ((z14 || z15) && (z10 || z11)) {
                    z12 = z10;
                    z13 = z11;
                    d0Var = new rf.d0(L, z14, z12, z15, z13);
                } else {
                    z12 = z10;
                    z13 = z11;
                }
                taVar.setOutlineProvider(d0Var);
            } else {
                taVarArr[i11].setOutlineProvider(null);
                z12 = z10;
                z13 = z11;
            }
            taVarArr[i11].setVisibility(i11 < i10 ? 0 : 8);
            taVarArr[i11].clearAnimation();
            i11++;
            z10 = z12;
            z11 = z13;
        }
    }

    public final void e(int i10, Object obj, Object obj2, int i11) {
        this.h = i10;
        ta[] taVarArr = this.c;
        if (obj == null) {
            taVarArr[i11].setVisibility(8);
            taVarArr[i11].clearAnimation();
        } else {
            taVarArr[i11].setVisibility(0);
            taVarArr[i11].a(obj, obj2);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        for (int i10 = 0; i10 < this.d; i10++) {
            this.c[i10].invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.d == 1) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int L = org.telegram.messenger.i0.L(12.0f);
        int L2 = this.e ? org.telegram.messenger.i0.L(12.0f) : 0;
        for (int i14 = 0; i14 < this.d; i14++) {
            ta[] taVarArr = this.c;
            int measuredWidth = taVarArr[i14].getMeasuredWidth();
            ta taVar = taVarArr[i14];
            taVar.layout(L, L2, L + measuredWidth, taVar.getMeasuredHeight() + L2);
            L = org.telegram.messenger.m5.C(3.0f, measuredWidth, L);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30), z20.B(3.0f, this.a, TLObject.FLAG_30));
            setPadding(0, 0, 0, org.telegram.messenger.i0.L(3.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int L = size - org.telegram.messenger.i0.L(i0.a.e(this.d, 1, 3, 24));
        int i13 = L / this.d;
        int i14 = this.h;
        int L2 = (i14 == 0 || i14 == 2 || i14 == 3) ? org.telegram.messenger.i0.L(180.0f) : i13;
        setMeasuredDimension(size, org.telegram.messenger.i0.L(this.f ? 12.0f : 3.0f) + (this.e ? org.telegram.messenger.i0.L(12.0f) : 0) + L2);
        while (true) {
            int i15 = this.d;
            if (i12 >= i15) {
                return;
            }
            this.c[i12].measure(View.MeasureSpec.makeMeasureSpec(i12 == i15 + (-1) ? L : i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L2, TLObject.FLAG_30));
            L -= i13;
            i12++;
        }
    }

    public void setSize(int i10) {
        if (this.a != i10) {
            this.a = i10;
            requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.s.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zi, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
