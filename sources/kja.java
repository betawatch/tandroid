// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class kja extends FrameLayout implements snb {
    public fja[] a;
    public r47[] b;
    public int[] c;
    public gja d;
    public int e;
    public boolean f;
    public boolean h;
    public Paint n;
    public boolean r;
    public int s;

    public static int a(int i) {
        if (hl.O1()) {
            return (hl.L(490.0f) - (hl.L(2.0f) * (i - 1))) / i;
        }
        return (hl.q.x - (hl.L(2.0f) * (i - 1))) / i;
    }

    public final void b(int i, boolean z, boolean z2) {
        fja fjaVar = this.a[i];
        FrameLayout frameLayout = fjaVar.f;
        og2 og2Var = fjaVar.e;
        if (og2Var.getVisibility() != 0) {
            og2Var.setVisibility(0);
        }
        og2Var.a(z, true);
        AnimatorSet animatorSet = fjaVar.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            fjaVar.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        fjaVar.h = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_X, z ? 0.81f : 1.0f), ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.SCALE_Y, z ? 0.81f : 1.0f));
        fjaVar.h.setDuration(200L);
        fjaVar.h.addListener(new po9(fjaVar, (byte) 14));
        fjaVar.h.start();
    }

    public final void c(int i, int i2, r47 r47Var) {
        r47[] r47VarArr = this.b;
        r47VarArr[i] = r47Var;
        this.c[i] = i2;
        fja[] fjaVarArr = this.a;
        if (r47Var != null) {
            fjaVarArr[i].setVisibility(0);
            fjaVarArr[i].setMessageObject(r47Var);
        } else {
            fjaVarArr[i].clearAnimation();
            fjaVarArr[i].setVisibility(4);
            r47VarArr[i] = null;
        }
    }

    public gja getDelegate() {
        return this.d;
    }

    @Override // android.view.View
    public final void invalidate() {
        for (int i = 0; i < 6; i++) {
            this.a[i].invalidate();
        }
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View[] viewArr = this.a;
        int size = this.r ? (View.MeasureSpec.getSize(i) - (hl.L(2.0f) * (this.e - 1))) / this.e : a(this.e);
        this.h = true;
        for (int i3 = 0; i3 < this.e; i3++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i3].getLayoutParams();
            layoutParams.topMargin = this.f ? 0 : hl.L(2.0f);
            layoutParams.leftMargin = (hl.L(2.0f) + size) * i3;
            if (i3 != this.e - 1) {
                layoutParams.width = size;
            } else if (hl.O1()) {
                layoutParams.width = hl.L(490.0f) - ((hl.L(2.0f) + size) * (this.e - 1));
            } else {
                layoutParams.width = hl.q.x - ((hl.L(2.0f) + size) * (this.e - 1));
            }
            layoutParams.height = size;
            layoutParams.gravity = 51;
            viewArr[i3].setLayoutParams(layoutParams);
        }
        this.h = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((this.f ? 0 : hl.L(2.0f)) + size, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(gja gjaVar) {
        this.d = gjaVar;
    }

    public void setIsFirst(boolean z) {
        this.f = z;
    }

    public void setItemsCount(int i) {
        fja[] fjaVarArr = this.a;
        int i2 = 0;
        while (i2 < fjaVarArr.length) {
            fjaVarArr[i2].clearAnimation();
            fjaVarArr[i2].setVisibility(i2 < i ? 0 : 4);
            i2++;
        }
        this.e = i;
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.n.setColor(aob.w0(null, aob.Ci, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
