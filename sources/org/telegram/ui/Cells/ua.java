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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class ua extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
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

    public ua(Context context, int i7) {
        super(context);
        this.b = true;
        int i10 = 3;
        this.d = 3;
        this.c = new ta[i7];
        int i11 = 0;
        while (true) {
            ta[] taVarArr = this.c;
            if (i11 >= taVarArr.length) {
                Paint paint = new Paint();
                this.n = paint;
                paint.setColor(855638016);
                this.r = new Paint(1);
                this.w = jg.g.h(context, R.drawable.background_selected);
                Paint paint2 = new Paint();
                this.s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.zi, false));
                return;
            }
            ta taVar = new ta(this, context);
            taVarArr[i11] = taVar;
            taVar.setClipToOutline(true);
            addView(taVar);
            taVar.setOnClickListener(new bi.la(this, taVar, i11, i10));
            taVar.setOnLongClickListener(new sa(this, taVar, i11));
            i11++;
        }
    }

    public abstract void a(int i7, Object obj);

    public boolean b(Object obj, int i7) {
        return false;
    }

    public final void c(int i7, boolean z9, boolean z10) {
        ta taVar = this.c[i7];
        di.d4 d4Var = taVar.a;
        CheckBox checkBox = taVar.c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z9, z10);
        AnimatorSet animatorSet = taVar.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            taVar.f = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            taVar.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(d4Var, "scaleX", z9 ? 0.8875f : 1.0f), ObjectAnimator.ofFloat(d4Var, "scaleY", z9 ? 0.8875f : 1.0f));
            taVar.f.setDuration(200L);
            taVar.f.addListener(new ch.y(25, taVar, z9));
            taVar.f.start();
        } else {
            d4Var.setScaleX(z9 ? 0.8875f : 1.0f);
            d4Var.setScaleY(z9 ? 0.8875f : 1.0f);
        }
        taVar.invalidate();
    }

    public final void d(int i7, boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        this.d = i7;
        this.e = z9;
        this.f = z10;
        int i10 = 0;
        while (true) {
            ta[] taVarArr = this.c;
            if (i10 >= taVarArr.length) {
                return;
            }
            bg.t0 t0Var = null;
            if ((z9 || z10) && (i10 == 0 || i10 == i7 - 1)) {
                ta taVar = taVarArr[i10];
                int L = org.telegram.messenger.g0.L(16.0f);
                boolean z13 = i10 == 0;
                boolean z14 = i10 == i7 + (-1);
                bg.q0 q0Var = bg.u0.a;
                if ((z13 || z14) && (z9 || z10)) {
                    z11 = z9;
                    z12 = z10;
                    t0Var = new bg.t0(L, z13, z11, z14, z12);
                } else {
                    z11 = z9;
                    z12 = z10;
                }
                taVar.setOutlineProvider(t0Var);
            } else {
                taVarArr[i10].setOutlineProvider(null);
                z11 = z9;
                z12 = z10;
            }
            taVarArr[i10].setVisibility(i10 < i7 ? 0 : 8);
            taVarArr[i10].clearAnimation();
            i10++;
            z9 = z11;
            z10 = z12;
        }
    }

    public final void e(int i7, Object obj, Object obj2, int i10) {
        this.h = i7;
        ta[] taVarArr = this.c;
        if (obj == null) {
            taVarArr[i10].setVisibility(8);
            taVarArr[i10].clearAnimation();
        } else {
            taVarArr[i10].setVisibility(0);
            taVarArr[i10].a(obj, obj2);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        for (int i7 = 0; i7 < this.d; i7++) {
            this.c[i7].invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        if (this.d == 1) {
            super.onLayout(z9, i7, i10, i11, i12);
            return;
        }
        int L = org.telegram.messenger.g0.L(12.0f);
        int L2 = this.e ? org.telegram.messenger.g0.L(12.0f) : 0;
        for (int i13 = 0; i13 < this.d; i13++) {
            ta[] taVarArr = this.c;
            int measuredWidth = taVarArr[i13].getMeasuredWidth();
            ta taVar = taVarArr[i13];
            taVar.layout(L, L2, L + measuredWidth, taVar.getMeasuredHeight() + L2);
            L = org.telegram.messenger.k5.C(3.0f, measuredWidth, L);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30), org.telegram.messenger.camera.q.B(3.0f, this.a, TLObject.FLAG_30));
            setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(this.d, 1, 3, 24));
        int i12 = L / this.d;
        int i13 = this.h;
        int L2 = (i13 == 0 || i13 == 2 || i13 == 3) ? org.telegram.messenger.g0.L(180.0f) : i12;
        setMeasuredDimension(size, org.telegram.messenger.g0.L(this.f ? 12.0f : 3.0f) + (this.e ? org.telegram.messenger.g0.L(12.0f) : 0) + L2);
        while (true) {
            int i14 = this.d;
            if (i11 >= i14) {
                return;
            }
            this.c[i11].measure(View.MeasureSpec.makeMeasureSpec(i11 == i14 + (-1) ? L : i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L2, TLObject.FLAG_30));
            L -= i12;
            i11++;
        }
    }

    public void setSize(int i7) {
        if (this.a != i7) {
            this.a = i7;
            requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            this.s.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.zi, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
