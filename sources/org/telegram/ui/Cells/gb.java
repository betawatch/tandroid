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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class gb extends FrameLayout {
    public int a;
    public boolean b;
    public final fb[] c;
    public int d;
    public boolean e;
    public boolean f;
    public int h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Drawable v;

    public gb(Context context, int i10) {
        super(context);
        this.b = true;
        this.d = 3;
        this.c = new fb[i10];
        int i11 = 0;
        while (true) {
            fb[] fbVarArr = this.c;
            if (i11 >= fbVarArr.length) {
                Paint paint = new Paint();
                this.n = paint;
                paint.setColor(855638016);
                this.r = new Paint(1);
                this.v = context.getResources().getDrawable(R.drawable.background_selected).mutate();
                Paint paint2 = new Paint();
                this.s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lh, false));
                return;
            }
            fb fbVar = new fb(this, context);
            fbVarArr[i11] = fbVar;
            addView(fbVar);
            fbVar.setOnClickListener(new wa(this, fbVar, i11, 1));
            fbVar.setOnLongClickListener(new eb(this, fbVar, i11));
            i11++;
        }
    }

    public abstract void a(int i10, Object obj);

    public boolean b(Object obj, int i10) {
        return false;
    }

    public final void c(int i10, boolean z10, boolean z11) {
        fb fbVar = this.c[i10];
        gg.i1 i1Var = fbVar.a;
        CheckBox checkBox = fbVar.c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = fbVar.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            fbVar.f = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            fbVar.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(i1Var, "scaleX", z10 ? 0.8875f : 1.0f), ObjectAnimator.ofFloat(i1Var, "scaleY", z10 ? 0.8875f : 1.0f));
            fbVar.f.setDuration(200L);
            fbVar.f.addListener(new ai.e(21, fbVar, z10));
            fbVar.f.start();
        } else {
            i1Var.setScaleX(z10 ? 0.8875f : 1.0f);
            i1Var.setScaleY(z10 ? 0.8875f : 1.0f);
        }
        fbVar.invalidate();
    }

    public final void d(int i10, boolean z10, boolean z11) {
        this.d = i10;
        this.e = z10;
        this.f = z11;
        int i11 = 0;
        while (true) {
            fb[] fbVarArr = this.c;
            if (i11 >= fbVarArr.length) {
                return;
            }
            fbVarArr[i11].setVisibility(i11 < i10 ? 0 : 8);
            fbVarArr[i11].clearAnimation();
            i11++;
        }
    }

    public final void e(int i10, Object obj, Object obj2, int i11) {
        this.h = i10;
        fb[] fbVarArr = this.c;
        if (obj == null) {
            fbVarArr[i11].setVisibility(8);
            fbVarArr[i11].clearAnimation();
        } else {
            fbVarArr[i11].setVisibility(0);
            fbVarArr[i11].a(obj, obj2);
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
        int dp = AndroidUtilities.dp(14.0f);
        int dp2 = this.e ? AndroidUtilities.dp(14.0f) : 0;
        for (int i14 = 0; i14 < this.d; i14++) {
            fb[] fbVarArr = this.c;
            int measuredWidth = fbVarArr[i14].getMeasuredWidth();
            fb fbVar = fbVarArr[i14];
            fbVar.layout(dp, dp2, dp + measuredWidth, fbVar.getMeasuredHeight() + dp2);
            dp = org.telegram.messenger.a2.C(6.0f, measuredWidth, dp);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30), em.C(6.0f, this.a, TLObject.FLAG_30));
            setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(hc.b.B(this.d, 1, 6, 28));
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
