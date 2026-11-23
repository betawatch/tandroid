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
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class va extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int a;
    public boolean b;
    public final ua[] c;
    public int d;
    public boolean e;
    public boolean f;
    public int h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Drawable w;

    public va(Context context, int i7) {
        super(context);
        this.b = true;
        this.d = 3;
        this.c = new ua[i7];
        int i10 = 0;
        while (true) {
            ua[] uaVarArr = this.c;
            if (i10 >= uaVarArr.length) {
                Paint paint = new Paint();
                this.n = paint;
                paint.setColor(855638016);
                this.r = new Paint(1);
                this.w = i5.c.g(context, R.drawable.background_selected);
                Paint paint2 = new Paint();
                this.s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ci, false));
                return;
            }
            ua uaVar = new ua(this, context);
            uaVarArr[i10] = uaVar;
            uaVar.setClipToOutline(true);
            addView(uaVar);
            uaVar.setOnClickListener(new bi.h5(this, uaVar, i10, 5));
            uaVar.setOnLongClickListener(new bi.i5(this, uaVar, i10));
            i10++;
        }
    }

    public abstract void a(int i7, Object obj);

    public boolean b(Object obj, int i7) {
        return false;
    }

    public final void c(int i7, boolean z10, boolean z11) {
        ua uaVar = this.c[i7];
        fi.t3 t3Var = uaVar.a;
        CheckBox checkBox = uaVar.c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = uaVar.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            uaVar.f = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            uaVar.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(t3Var, "scaleX", z10 ? 0.8875f : 1.0f), ObjectAnimator.ofFloat(t3Var, "scaleY", z10 ? 0.8875f : 1.0f));
            uaVar.f.setDuration(200L);
            uaVar.f.addListener(new bi.g7(26, uaVar, z10));
            uaVar.f.start();
        } else {
            t3Var.setScaleX(z10 ? 0.8875f : 1.0f);
            t3Var.setScaleY(z10 ? 0.8875f : 1.0f);
        }
        uaVar.invalidate();
    }

    public final void d(int i7, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        this.d = i7;
        this.e = z10;
        this.f = z11;
        int i10 = 0;
        while (true) {
            ua[] uaVarArr = this.c;
            if (i10 >= uaVarArr.length) {
                return;
            }
            bg.t0 t0Var = null;
            if ((z10 || z11) && (i10 == 0 || i10 == i7 - 1)) {
                ua uaVar = uaVarArr[i10];
                int L = org.telegram.messenger.g0.L(16.0f);
                boolean z14 = i10 == 0;
                boolean z15 = i10 == i7 + (-1);
                bg.q0 q0Var = bg.u0.a;
                if ((z14 || z15) && (z10 || z11)) {
                    z12 = z10;
                    z13 = z11;
                    t0Var = new bg.t0(L, z14, z12, z15, z13);
                } else {
                    z12 = z10;
                    z13 = z11;
                }
                uaVar.setOutlineProvider(t0Var);
            } else {
                uaVarArr[i10].setOutlineProvider(null);
                z12 = z10;
                z13 = z11;
            }
            uaVarArr[i10].setVisibility(i10 < i7 ? 0 : 8);
            uaVarArr[i10].clearAnimation();
            i10++;
            z10 = z12;
            z11 = z13;
        }
    }

    public final void e(int i7, Object obj, Object obj2, int i10) {
        this.h = i7;
        ua[] uaVarArr = this.c;
        if (obj == null) {
            uaVarArr[i10].setVisibility(8);
            uaVarArr[i10].clearAnimation();
        } else {
            uaVarArr[i10].setVisibility(0);
            uaVarArr[i10].a(obj, obj2);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        if (this.d == 1) {
            super.onLayout(z10, i7, i10, i11, i12);
            return;
        }
        int L = org.telegram.messenger.g0.L(12.0f);
        int L2 = this.e ? org.telegram.messenger.g0.L(12.0f) : 0;
        for (int i13 = 0; i13 < this.d; i13++) {
            ua[] uaVarArr = this.c;
            int measuredWidth = uaVarArr[i13].getMeasuredWidth();
            ua uaVar = uaVarArr[i13];
            uaVar.layout(L, L2, L + measuredWidth, uaVar.getMeasuredHeight() + L2);
            L = org.telegram.messenger.f3.C(3.0f, measuredWidth, L);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30), o10.C(3.0f, this.a, TLObject.FLAG_30));
            setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(this.d, 1, 3, 24));
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.s.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ci, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
