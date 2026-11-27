// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gs5 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public zc5 d;
    public int e;
    public final /* synthetic */ hs5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs5(hs5 hs5Var, Context context) {
        super(context);
        this.f = hs5Var;
        this.c = new ArrayList();
    }

    public final void a(zc5 zc5Var) {
        hs5 hs5Var = this.f;
        hs5Var.E.remove(zc5Var.getKey());
        hs5Var.F.remove(zc5Var);
        zc5Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.a.setupEndValues();
            this.a.cancel();
        }
        this.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a = animatorSet2;
        animatorSet2.addListener(new v5(this, zc5Var, (byte) 26));
        this.a.setInterpolator(k43.h);
        this.a.setDuration(320L);
        this.d = zc5Var;
        ArrayList arrayList = this.c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<zc5, Float>) View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<zc5, Float>) View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<zc5, Float>) View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ArrayList arrayList;
        int i3;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i);
        int L = hl.L(8.0f);
        int i4 = size - (L << 1);
        int i5 = L;
        int i6 = i5;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            arrayList = this.c;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt instanceof zc5) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(28.0f), TLObject.FLAG_30));
                if (childAt != this.d && childAt.getMeasuredWidth() + i9 > i4) {
                    i6 += hl.L(34.0f);
                    i9 = 0;
                }
                if (childAt.getMeasuredWidth() + i10 > i4) {
                    i5 += hl.L(34.0f);
                    i10 = 0;
                }
                int i11 = L + i9;
                if (!this.b) {
                    zc5 zc5Var = this.d;
                    if (childAt == zc5Var) {
                        childAt.setTranslationX(L + i10);
                        childAt.setTranslationY(i5);
                    } else if (zc5Var != null) {
                        float f = i11;
                        if (childAt.getTranslationX() != f) {
                            i3 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f));
                        } else {
                            i3 = 1;
                        }
                        float f2 = i6;
                        if (childAt.getTranslationY() != f2) {
                            float[] fArr = new float[i3];
                            fArr[0] = f2;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(i11);
                        childAt.setTranslationY(i6);
                    }
                }
                if (childAt != this.d) {
                    int w = uh9.w(6.0f, childAt.getMeasuredWidth(), i9);
                    i8 = Math.max(i8, i6);
                    i9 = w;
                }
                i10 = uh9.w(6.0f, childAt.getMeasuredWidth(), i10);
            }
            i7++;
        }
        int w2 = uh9.w(28.0f, i8, L);
        if (!this.b) {
            AnimatorSet animatorSet = this.a;
            if (animatorSet != null) {
                this.e = w2;
                animatorSet.playTogether(arrayList);
                this.a.start();
                this.b = true;
            } else {
                this.e = Math.max(w2, hl.L(28.0f) + i5 + L);
            }
        }
        hs5 hs5Var = this.f;
        hs5Var.a.a(hs5Var.F.isEmpty() ? 0.0f : Math.min(w2, hs5Var.x));
        setMeasuredDimension(size, this.e);
    }
}
