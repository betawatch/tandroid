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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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

    public za(Context context, int i10) {
        super(context);
        this.b = true;
        this.d = 3;
        this.c = new ya[i10];
        int i11 = 0;
        while (true) {
            ya[] yaVarArr = this.c;
            if (i11 >= yaVarArr.length) {
                Paint paint = new Paint();
                this.n = paint;
                paint.setColor(855638016);
                this.r = new Paint(1);
                this.v = context.getResources().getDrawable(R.drawable.background_selected).mutate();
                Paint paint2 = new Paint();
                this.s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Lh, false));
                return;
            }
            ya yaVar = new ya(this, context);
            yaVarArr[i11] = yaVar;
            addView(yaVar);
            yaVar.setOnClickListener(new eg.k2(this, yaVar, i11, 5));
            yaVar.setOnLongClickListener(new lh.i2(this, yaVar, i11));
            i11++;
        }
    }

    public abstract void a(int i10, Object obj);

    public boolean b(Object obj, int i10) {
        return false;
    }

    public final void c(int i10, boolean z4, boolean z10) {
        ya yaVar = this.c[i10];
        oh.a4 a4Var = yaVar.a;
        CheckBox checkBox = yaVar.c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z4, z10);
        AnimatorSet animatorSet = yaVar.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            yaVar.f = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            yaVar.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(a4Var, "scaleX", z4 ? 0.8875f : 1.0f), ObjectAnimator.ofFloat(a4Var, "scaleY", z4 ? 0.8875f : 1.0f));
            yaVar.f.setDuration(200L);
            yaVar.f.addListener(new eg.u2(15, yaVar, z4));
            yaVar.f.start();
        } else {
            a4Var.setScaleX(z4 ? 0.8875f : 1.0f);
            a4Var.setScaleY(z4 ? 0.8875f : 1.0f);
        }
        yaVar.invalidate();
    }

    public final void d(int i10, boolean z4, boolean z10) {
        this.d = i10;
        this.e = z4;
        this.f = z10;
        int i11 = 0;
        while (true) {
            ya[] yaVarArr = this.c;
            if (i11 >= yaVarArr.length) {
                return;
            }
            yaVarArr[i11].setVisibility(i11 < i10 ? 0 : 8);
            yaVarArr[i11].clearAnimation();
            i11++;
        }
    }

    public final void e(int i10, Object obj, Object obj2, int i11) {
        this.h = i10;
        ya[] yaVarArr = this.c;
        if (obj == null) {
            yaVarArr[i11].setVisibility(8);
            yaVarArr[i11].clearAnimation();
        } else {
            yaVarArr[i11].setVisibility(0);
            yaVarArr[i11].a(obj, obj2);
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        if (this.d == 1) {
            super.onLayout(z4, i10, i11, i12, i13);
            return;
        }
        int dp = AndroidUtilities.dp(14.0f);
        int dp2 = this.e ? AndroidUtilities.dp(14.0f) : 0;
        for (int i14 = 0; i14 < this.d; i14++) {
            ya[] yaVarArr = this.c;
            int measuredWidth = yaVarArr[i14].getMeasuredWidth();
            ya yaVar = yaVarArr[i14];
            yaVar.layout(dp, dp2, dp + measuredWidth, yaVar.getMeasuredHeight() + dp2);
            dp = org.telegram.messenger.y3.C(6.0f, measuredWidth, dp);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30), org.telegram.ui.b.B(6.0f, this.a, TLObject.FLAG_30));
            setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(e2.c.e(this.d, 1, 6, 28));
        int i13 = dp / this.d;
        int i14 = this.h;
        int dp2 = (i14 == 0 || i14 == 2 || i14 == 3) ? AndroidUtilities.dp(180.0f) : i13;
        setMeasuredDimension(size, AndroidUtilities.dp(this.f ? 14.0f : 6.0f) + (this.e ? AndroidUtilities.dp(14.0f) : 0) + dp2);
        while (true) {
            int i15 = this.d;
            if (i12 >= i15) {
                return;
            }
            this.c[i12].measure(View.MeasureSpec.makeMeasureSpec(i12 == i15 + (-1) ? dp : i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp2, TLObject.FLAG_30));
            dp -= i13;
            i12++;
        }
    }

    public void setSize(int i10) {
        if (this.a != i10) {
            this.a = i10;
            requestLayout();
        }
    }
}
