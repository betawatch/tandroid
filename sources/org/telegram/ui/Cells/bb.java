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
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class bb extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int a;
    public boolean b;
    public final ab[] c;
    public int d;
    public boolean e;
    public boolean f;
    public int h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Drawable v;

    public bb(Context context, int i10) {
        super(context);
        this.b = true;
        this.d = 3;
        this.c = new ab[i10];
        int i11 = 0;
        while (true) {
            ab[] abVarArr = this.c;
            if (i11 >= abVarArr.length) {
                Paint paint = new Paint();
                this.n = paint;
                paint.setColor(855638016);
                this.r = new Paint(1);
                this.v = context.getResources().getDrawable(R.drawable.background_selected).mutate();
                Paint paint2 = new Paint();
                this.s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Lh, false));
                return;
            }
            ab abVar = new ab(this, context);
            abVarArr[i11] = abVar;
            addView(abVar);
            abVar.setOnClickListener(new ai.ia(this, abVar, i11, 2));
            abVar.setOnLongClickListener(new za(this, abVar, i11));
            i11++;
        }
    }

    public abstract void a(int i10, Object obj);

    public boolean b(Object obj, int i10) {
        return false;
    }

    public final void c(int i10, boolean z10, boolean z11) {
        ab abVar = this.c[i10];
        ci.j4 j4Var = abVar.a;
        CheckBox checkBox = abVar.c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = abVar.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            abVar.f = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            abVar.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(j4Var, "scaleX", z10 ? 0.8875f : 1.0f), ObjectAnimator.ofFloat(j4Var, "scaleY", z10 ? 0.8875f : 1.0f));
            abVar.f.setDuration(200L);
            abVar.f.addListener(new ah.p0(26, abVar, z10));
            abVar.f.start();
        } else {
            j4Var.setScaleX(z10 ? 0.8875f : 1.0f);
            j4Var.setScaleY(z10 ? 0.8875f : 1.0f);
        }
        abVar.invalidate();
    }

    public final void d(int i10, boolean z10, boolean z11) {
        this.d = i10;
        this.e = z10;
        this.f = z11;
        int i11 = 0;
        while (true) {
            ab[] abVarArr = this.c;
            if (i11 >= abVarArr.length) {
                return;
            }
            abVarArr[i11].setVisibility(i11 < i10 ? 0 : 8);
            abVarArr[i11].clearAnimation();
            i11++;
        }
    }

    public final void e(int i10, Object obj, Object obj2, int i11) {
        this.h = i10;
        ab[] abVarArr = this.c;
        if (obj == null) {
            abVarArr[i11].setVisibility(8);
            abVarArr[i11].clearAnimation();
        } else {
            abVarArr[i11].setVisibility(0);
            abVarArr[i11].a(obj, obj2);
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
            ab[] abVarArr = this.c;
            int measuredWidth = abVarArr[i14].getMeasuredWidth();
            ab abVar = abVarArr[i14];
            abVar.layout(dp, dp2, dp + measuredWidth, abVar.getMeasuredHeight() + dp2);
            dp = org.telegram.messenger.v0.C(6.0f, measuredWidth, dp);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a, TLObject.FLAG_30), sl.C(6.0f, this.a, TLObject.FLAG_30));
            setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(this.d, 1, 6, 28));
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.s.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Lh, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
