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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class ta extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int a;
    public boolean b;
    public final sa[] c;
    public int d;
    public boolean e;
    public boolean f;
    public int h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Drawable w;

    public ta(Context context, int i3) {
        super(context);
        this.b = true;
        this.d = 3;
        this.c = new sa[i3];
        int i10 = 0;
        while (true) {
            sa[] saVarArr = this.c;
            if (i10 >= saVarArr.length) {
                Paint paint = new Paint();
                this.n = paint;
                paint.setColor(855638016);
                this.r = new Paint(1);
                this.w = k2.p1.g(context, R.drawable.background_selected);
                Paint paint2 = new Paint();
                this.s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zi, false));
                return;
            }
            sa saVar = new sa(this, context);
            saVarArr[i10] = saVar;
            saVar.setClipToOutline(true);
            addView(saVar);
            saVar.setOnClickListener(new ai.h3(this, saVar, i10, 5));
            saVar.setOnLongClickListener(new ai.i3(this, saVar, i10));
            i10++;
        }
    }

    public abstract void a(int i3, Object obj);

    public boolean b(Object obj, int i3) {
        return false;
    }

    public final void c(int i3, boolean z10, boolean z11) {
        sa saVar = this.c[i3];
        ei.d4 d4Var = saVar.a;
        CheckBox checkBox = saVar.c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = saVar.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            saVar.f = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            saVar.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(d4Var, "scaleX", z10 ? 0.8875f : 1.0f), ObjectAnimator.ofFloat(d4Var, "scaleY", z10 ? 0.8875f : 1.0f));
            saVar.f.setDuration(200L);
            saVar.f.addListener(new dh.x(25, saVar, z10));
            saVar.f.start();
        } else {
            d4Var.setScaleX(z10 ? 0.8875f : 1.0f);
            d4Var.setScaleY(z10 ? 0.8875f : 1.0f);
        }
        saVar.invalidate();
    }

    public final void d(int i3, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        this.d = i3;
        this.e = z10;
        this.f = z11;
        int i10 = 0;
        while (true) {
            sa[] saVarArr = this.c;
            if (i10 >= saVarArr.length) {
                return;
            }
            cg.s0 s0Var = null;
            if ((z10 || z11) && (i10 == 0 || i10 == i3 - 1)) {
                sa saVar = saVarArr[i10];
                int L = org.telegram.messenger.g0.L(16.0f);
                boolean z14 = i10 == 0;
                boolean z15 = i10 == i3 + (-1);
                cg.p0 p0Var = cg.t0.a;
                if ((z14 || z15) && (z10 || z11)) {
                    z12 = z10;
                    z13 = z11;
                    s0Var = new cg.s0(L, z14, z12, z15, z13);
                } else {
                    z12 = z10;
                    z13 = z11;
                }
                saVar.setOutlineProvider(s0Var);
            } else {
                saVarArr[i10].setOutlineProvider(null);
                z12 = z10;
                z13 = z11;
            }
            saVarArr[i10].setVisibility(i10 < i3 ? 0 : 8);
            saVarArr[i10].clearAnimation();
            i10++;
            z10 = z12;
            z11 = z13;
        }
    }

    public final void e(int i3, Object obj, Object obj2, int i10) {
        this.h = i3;
        sa[] saVarArr = this.c;
        if (obj == null) {
            saVarArr[i10].setVisibility(8);
            saVarArr[i10].clearAnimation();
        } else {
            saVarArr[i10].setVisibility(0);
            saVarArr[i10].a(obj, obj2);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        for (int i3 = 0; i3 < this.d; i3++) {
            this.c[i3].invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        if (this.d == 1) {
            super.onLayout(z10, i3, i10, i11, i12);
            return;
        }
        int L = org.telegram.messenger.g0.L(12.0f);
        int L2 = this.e ? org.telegram.messenger.g0.L(12.0f) : 0;
        for (int i13 = 0; i13 < this.d; i13++) {
            sa[] saVarArr = this.c;
            int measuredWidth = saVarArr[i13].getMeasuredWidth();
            sa saVar = saVarArr[i13];
            saVar.layout(L, L2, L + measuredWidth, saVar.getMeasuredHeight() + L2);
            L = org.telegram.messenger.k5.C(3.0f, measuredWidth, L);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30), org.telegram.messenger.camera.q.B(3.0f, this.a, TLObject.FLAG_30));
            setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i3);
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

    public void setSize(int i3) {
        if (this.a != i3) {
            this.a = i3;
            requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.s.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zi, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
