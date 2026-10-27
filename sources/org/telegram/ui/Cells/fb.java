package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class fb extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public int a;
    public boolean b;
    public final eb[] c;
    public int d;
    public boolean e;
    public boolean f;
    public int h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Drawable v;

    public fb(Context context, int i10) {
        super(context);
        this.b = true;
        this.d = 3;
        this.c = new eb[i10];
        int i11 = 0;
        while (true) {
            eb[] ebVarArr = this.c;
            if (i11 >= ebVarArr.length) {
                Paint paint = new Paint();
                this.n = paint;
                paint.setColor(855638016);
                this.r = new Paint(1);
                this.v = context.getResources().getDrawable(R.drawable.background_selected).mutate();
                Paint paint2 = new Paint();
                this.s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Lh, false));
                return;
            }
            eb ebVar = new eb(this, context);
            ebVarArr[i11] = ebVar;
            ebVar.setClipToOutline(true);
            addView(ebVar);
            ebVar.setOnClickListener(new bi.pa(this, ebVar, i11, 3));
            ebVar.setOnLongClickListener(new db(this, ebVar, i11));
            i11++;
        }
    }

    public abstract void a(int i10, Object obj);

    public boolean b(Object obj, int i10) {
        return false;
    }

    public final void c(int i10, boolean z10, boolean z11) {
        eb ebVar = this.c[i10];
        di.k4 k4Var = ebVar.a;
        CheckBox checkBox = ebVar.c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = ebVar.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            ebVar.f = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            ebVar.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(k4Var, "scaleX", z10 ? 0.8875f : 1.0f), ObjectAnimator.ofFloat(k4Var, "scaleY", z10 ? 0.8875f : 1.0f));
            ebVar.f.setDuration(200L);
            ebVar.f.addListener(new bh.f0(26, ebVar, z10));
            ebVar.f.start();
        } else {
            k4Var.setScaleX(z10 ? 0.8875f : 1.0f);
            k4Var.setScaleY(z10 ? 0.8875f : 1.0f);
        }
        ebVar.invalidate();
    }

    public final void d(int i10, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        this.d = i10;
        this.e = z10;
        this.f = z11;
        int i11 = 0;
        while (true) {
            eb[] ebVarArr = this.c;
            if (i11 >= ebVarArr.length) {
                return;
            }
            ag.y0 y0Var = null;
            if ((z10 || z11) && (i11 == 0 || i11 == i10 - 1)) {
                eb ebVar = ebVarArr[i11];
                int dp = AndroidUtilities.dp(16.0f);
                boolean z14 = i11 == 0;
                boolean z15 = i11 == i10 + (-1);
                ag.v0 v0Var = ag.z0.a;
                if ((z14 || z15) && (z10 || z11)) {
                    z12 = z10;
                    z13 = z11;
                    y0Var = new ag.y0(dp, z14, z12, z15, z13);
                } else {
                    z12 = z10;
                    z13 = z11;
                }
                ebVar.setOutlineProvider(y0Var);
            } else {
                ebVarArr[i11].setOutlineProvider(null);
                z12 = z10;
                z13 = z11;
            }
            ebVarArr[i11].setVisibility(i11 < i10 ? 0 : 8);
            ebVarArr[i11].clearAnimation();
            i11++;
            z10 = z12;
            z11 = z13;
        }
    }

    public final void e(int i10, Object obj, Object obj2, int i11) {
        this.h = i10;
        eb[] ebVarArr = this.c;
        if (obj == null) {
            ebVarArr[i11].setVisibility(8);
            ebVarArr[i11].clearAnimation();
        } else {
            ebVarArr[i11].setVisibility(0);
            ebVarArr[i11].a(obj, obj2);
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
        int dp = AndroidUtilities.dp(12.0f);
        int dp2 = this.e ? AndroidUtilities.dp(12.0f) : 0;
        for (int i14 = 0; i14 < this.d; i14++) {
            eb[] ebVarArr = this.c;
            int measuredWidth = ebVarArr[i14].getMeasuredWidth();
            eb ebVar = ebVarArr[i14];
            ebVar.layout(dp, dp2, dp + measuredWidth, ebVar.getMeasuredHeight() + dp2);
            dp = org.telegram.messenger.t.D(3.0f, measuredWidth, dp);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30), wh.D(3.0f, this.a, TLObject.FLAG_30));
            setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(c3.h0.w(this.d, 1, 3, 24));
        int i13 = dp / this.d;
        int i14 = this.h;
        int dp2 = (i14 == 0 || i14 == 2 || i14 == 3) ? AndroidUtilities.dp(180.0f) : i13;
        setMeasuredDimension(size, AndroidUtilities.dp(this.f ? 12.0f : 3.0f) + (this.e ? AndroidUtilities.dp(12.0f) : 0) + dp2);
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            this.s.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Lh, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
