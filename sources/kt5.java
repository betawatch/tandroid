// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class kt5 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public zc5 c;
    public boolean d;
    public final /* synthetic */ lt5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt5(lt5 lt5Var, Context context) {
        super(context);
        this.e = lt5Var;
        this.b = new ArrayList();
    }

    public final void a(zc5 zc5Var, boolean z) {
        byte b = 1;
        this.d = true;
        lt5 lt5Var = this.e;
        lt5Var.Z1.k(zc5Var.getUid(), zc5Var);
        AnimatorSet animatorSet = lt5Var.X1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            lt5Var.X1.cancel();
        }
        this.a = false;
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            lt5Var.X1 = animatorSet2;
            animatorSet2.addListener(new jt5(this, b));
            lt5Var.X1.setDuration(150L);
            lt5Var.X1.setInterpolator(k43.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(zc5Var, (Property<zc5, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(zc5Var, (Property<zc5, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(zc5Var, (Property<zc5, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(zc5Var);
    }

    public final void b(zc5 zc5Var) {
        this.d = false;
        lt5 lt5Var = this.e;
        lt5Var.Z1.l(zc5Var.getUid());
        zc5Var.setOnClickListener(null);
        AnimatorSet animatorSet = lt5Var.X1;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            lt5Var.X1.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        lt5Var.X1 = animatorSet2;
        animatorSet2.addListener(new v5(this, zc5Var, (byte) 27));
        lt5Var.X1.setDuration(150L);
        this.c = zc5Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<zc5, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<zc5, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<zc5, Float>) View.ALPHA, 1.0f, 0.0f));
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
        f89 L;
        AnimatorSet animatorSet;
        yc ycVar;
        int i3;
        lt5 lt5Var = this.e;
        yc ycVar2 = lt5Var.P1;
        gw9 gw9Var = lt5Var.n1;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i);
        int L2 = size - hl.L(26.0f);
        int L3 = hl.L(10.0f);
        int L4 = hl.L(10.0f);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            arrayList = this.b;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt instanceof zc5) {
                ycVar = ycVar2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_30));
                if (childAt != this.c && childAt.getMeasuredWidth() + i5 > L2) {
                    L3 = uh9.w(8.0f, childAt.getMeasuredHeight(), L3);
                    i5 = 0;
                }
                if (childAt.getMeasuredWidth() + i6 > L2) {
                    L4 = uh9.w(8.0f, childAt.getMeasuredHeight(), L4);
                    i6 = 0;
                }
                int L5 = hl.L(13.0f) + i5;
                if (!this.a) {
                    zc5 zc5Var = this.c;
                    if (childAt == zc5Var) {
                        childAt.setTranslationX(hl.L(13.0f) + i6);
                        childAt.setTranslationY(L4);
                    } else if (zc5Var != null) {
                        float f = L5;
                        if (childAt.getTranslationX() != f) {
                            i3 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f));
                        } else {
                            i3 = 1;
                        }
                        float f2 = L3;
                        if (childAt.getTranslationY() != f2) {
                            float[] fArr = new float[i3];
                            fArr[0] = f2;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(L5);
                        childAt.setTranslationY(L3);
                    }
                }
                if (childAt != this.c) {
                    i5 = uh9.w(9.0f, childAt.getMeasuredWidth(), i5);
                }
                i6 = uh9.w(9.0f, childAt.getMeasuredWidth(), i6);
            } else {
                ycVar = ycVar2;
            }
            i4++;
            ycVar2 = ycVar;
        }
        yc ycVar3 = ycVar2;
        int L6 = hl.L(42.0f) + L4;
        final int L7 = hl.L(42.0f) + L3;
        int min = lt5Var.g2 != null ? lt5Var.a2 ? Math.min(lt5Var.m2, L7) : 0 : c00.d(52.0f, Math.min(lt5Var.m2, L7), 0);
        int i7 = lt5Var.o2;
        int L8 = (lt5Var.g2 != null || lt5Var.Z1.m() <= 0) ? 0 : hl.L(56.0f);
        lt5Var.o2 = L8;
        if (min != lt5Var.i2 || i7 != L8) {
            lt5Var.i2 = min;
            if (gw9Var.getAdapter() != null && gw9Var.getAdapter().b() > 0 && (L = gw9Var.L(0)) != null) {
                gw9Var.getAdapter().g(0);
                lt5Var.L1.g1(0, L.a.getTop() - gw9Var.getPaddingTop());
                if (gw9Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ce0(this, (byte) 6));
                    ofFloat.setDuration(gw9Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(lt5Var.m2, L7);
        int i8 = lt5Var.e2;
        if (i8 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i8, min2);
            ofInt.addUpdateListener(new ch4(this, (byte) 14));
            arrayList.add(ofInt);
        }
        if (this.d) {
            if (L7 > lt5Var.m2) {
                final byte b = 0;
                hl.c3(new Runnable(this) { // from class: it5
                    public final /* synthetic */ kt5 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        int i9 = L7;
                        kt5 kt5Var = this.b;
                        switch (b2) {
                            case 0:
                                lt5 lt5Var2 = kt5Var.e;
                                lt5Var2.P1.smoothScrollTo(0, i9 - lt5Var2.m2);
                                break;
                            default:
                                lt5 lt5Var3 = kt5Var.e;
                                lt5Var3.P1.smoothScrollTo(0, i9 - lt5Var3.m2);
                                break;
                        }
                    }
                });
            }
        } else if (ycVar3.getMeasuredHeight() + ycVar3.getScrollY() > L7) {
            final byte b2 = 1;
            hl.c3(new Runnable(this) { // from class: it5
                public final /* synthetic */ kt5 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b2;
                    int i9 = L7;
                    kt5 kt5Var = this.b;
                    switch (b22) {
                        case 0:
                            lt5 lt5Var2 = kt5Var.e;
                            lt5Var2.P1.smoothScrollTo(0, i9 - lt5Var2.m2);
                            break;
                        default:
                            lt5 lt5Var3 = kt5Var.e;
                            lt5Var3.P1.smoothScrollTo(0, i9 - lt5Var3.m2);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = lt5Var.X1) != null) {
            animatorSet.playTogether(arrayList);
            lt5Var.X1.addListener(new jt5(this, (byte) 0));
            lt5Var.X1.start();
            this.a = true;
        }
        if (lt5Var.X1 == null) {
            lt5Var.e2 = min2;
            lt5Var.b.invalidate();
        }
        setMeasuredDimension(size, Math.max(L7, L6));
        gw9Var.setTranslationY(0.0f);
    }
}
