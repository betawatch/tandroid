package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class za extends FrameLayout {
    public int a;
    public boolean b;
    public final ya[] c;
    public int d;
    public boolean e;
    public boolean f;
    public int h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Drawable v;

    public za(Context context, int i9) {
        super(context);
        this.b = true;
        this.d = 3;
        this.c = new ya[i9];
        int i10 = 0;
        while (true) {
            ya[] yaVarArr = this.c;
            if (i10 >= yaVarArr.length) {
                Paint paint = new Paint();
                this.n = paint;
                paint.setColor(855638016);
                this.r = new Paint(1);
                this.v = context.getResources().getDrawable(R.drawable.background_selected).mutate();
                Paint paint2 = new Paint();
                this.s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Lh, false));
                return;
            }
            ya yaVar = new ya(this, context);
            yaVarArr[i10] = yaVar;
            addView(yaVar);
            yaVar.setOnClickListener(new fh.a3(this, yaVar, i10, 4));
            yaVar.setOnLongClickListener(new fh.r2(this, yaVar, i10));
            i10++;
        }
    }

    public abstract void a(int i9, Object obj);

    public boolean b(Object obj, int i9) {
        return false;
    }

    public final void c(int i9, boolean z10, boolean z11) {
        ya yaVar = this.c[i9];
        ih.d4 d4Var = yaVar.a;
        CheckBox checkBox = yaVar.c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = yaVar.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            yaVar.f = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            yaVar.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(d4Var, "scaleX", z10 ? 0.8875f : 1.0f), ObjectAnimator.ofFloat(d4Var, "scaleY", z10 ? 0.8875f : 1.0f));
            yaVar.f.setDuration(200L);
            yaVar.f.addListener(new hg.b0(25, yaVar, z10));
            yaVar.f.start();
        } else {
            d4Var.setScaleX(z10 ? 0.8875f : 1.0f);
            d4Var.setScaleY(z10 ? 0.8875f : 1.0f);
        }
        yaVar.invalidate();
    }

    public final void d(int i9, boolean z10, boolean z11) {
        this.d = i9;
        this.e = z10;
        this.f = z11;
        int i10 = 0;
        while (true) {
            ya[] yaVarArr = this.c;
            if (i10 >= yaVarArr.length) {
                return;
            }
            yaVarArr[i10].setVisibility(i10 < i9 ? 0 : 8);
            yaVarArr[i10].clearAnimation();
            i10++;
        }
    }

    public final void e(int i9, Object obj, Object obj2, int i10) {
        this.h = i9;
        ya[] yaVarArr = this.c;
        if (obj == null) {
            yaVarArr[i10].setVisibility(8);
            yaVarArr[i10].clearAnimation();
        } else {
            yaVarArr[i10].setVisibility(0);
            yaVarArr[i10].a(obj, obj2);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        for (int i9 = 0; i9 < this.d; i9++) {
            this.c[i9].invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        if (this.d == 1) {
            super.onLayout(z10, i9, i10, i11, i12);
            return;
        }
        int dp = AndroidUtilities.dp(14.0f);
        int dp2 = this.e ? AndroidUtilities.dp(14.0f) : 0;
        for (int i13 = 0; i13 < this.d; i13++) {
            ya[] yaVarArr = this.c;
            int measuredWidth = yaVarArr[i13].getMeasuredWidth();
            ya yaVar = yaVarArr[i13];
            yaVar.layout(dp, dp2, dp + measuredWidth, yaVar.getMeasuredHeight() + dp2);
            dp = org.telegram.messenger.l0.C(6.0f, measuredWidth, dp);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30), ll.C(6.0f, this.a, TLObject.FLAG_30));
            setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i9);
        int dp = size - AndroidUtilities.dp(e2.c.e(this.d, 1, 6, 28));
        int i12 = dp / this.d;
        int i13 = this.h;
        int dp2 = (i13 == 0 || i13 == 2 || i13 == 3) ? AndroidUtilities.dp(180.0f) : i12;
        setMeasuredDimension(size, AndroidUtilities.dp(this.f ? 14.0f : 6.0f) + (this.e ? AndroidUtilities.dp(14.0f) : 0) + dp2);
        while (true) {
            int i14 = this.d;
            if (i11 >= i14) {
                return;
            }
            this.c[i11].measure(View.MeasureSpec.makeMeasureSpec(i11 == i14 + (-1) ? dp : i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp2, TLObject.FLAG_30));
            dp -= i12;
            i11++;
        }
    }

    public void setSize(int i9) {
        if (this.a != i9) {
            this.a = i9;
            requestLayout();
        }
    }
}
