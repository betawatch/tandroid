// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class a3a extends ViewGroup {
    public final /* synthetic */ byte a = 0;
    public AnimatorSet b;
    public boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public final /* synthetic */ ScrollView n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3a(b3a b3aVar, Context context) {
        super(context);
        this.n = b3aVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void a() {
        t9b t9bVar = (t9b) this.n;
        byte b = 1;
        t9bVar.I = true;
        ArrayList arrayList = t9bVar.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i = 0; i < arrayList2.size(); i++) {
            ((zc5) arrayList2.get(i)).setOnClickListener(null);
        }
        c();
        this.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.addListener(new s9b(this, arrayList2, b));
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        ArrayList arrayList5 = this.d;
        arrayList5.clear();
        this.e.clear();
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            zc5 zc5Var = (zc5) arrayList2.get(i2);
            arrayList5.add(zc5Var);
            arrayList4.add(ObjectAnimator.ofFloat(zc5Var, (Property<zc5, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(zc5Var, (Property<zc5, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(zc5Var, (Property<zc5, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        requestLayout();
    }

    public final void b(boolean z) {
        b3a b3aVar = (b3a) this.n;
        byte b = 1;
        b3aVar.I = true;
        ArrayList arrayList = b3aVar.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i = 0; i < arrayList2.size(); i++) {
            ((zc5) arrayList2.get(i)).setOnClickListener(null);
        }
        c();
        if (z) {
            this.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.b = animatorSet;
            animatorSet.addListener(new z2a(this, arrayList2, b));
            ArrayList arrayList4 = this.f;
            arrayList4.clear();
            ArrayList arrayList5 = this.d;
            arrayList5.clear();
            this.e.clear();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                zc5 zc5Var = (zc5) arrayList2.get(i2);
                arrayList5.add(zc5Var);
                arrayList4.add(ObjectAnimator.ofFloat(zc5Var, (Property<zc5, Float>) View.SCALE_X, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(zc5Var, (Property<zc5, Float>) View.SCALE_Y, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(zc5Var, (Property<zc5, Float>) View.ALPHA, 1.0f, 0.0f));
            }
        } else {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                removeView((View) arrayList2.get(i3));
            }
            arrayList3.clear();
            this.b = null;
            this.c = false;
            b3aVar.b.setAllowDrawCursor(true);
        }
        requestLayout();
    }

    public final void c() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.e;
        int i = 0;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((View) arrayList.get(i2)).setScaleX(1.0f);
                    ((View) arrayList.get(i2)).setScaleY(1.0f);
                    ((View) arrayList.get(i2)).setAlpha(1.0f);
                }
                while (i < arrayList2.size()) {
                    ((View) arrayList2.get(i)).setScaleX(0.0f);
                    ((View) arrayList2.get(i)).setScaleY(0.0f);
                    ((View) arrayList2.get(i)).setAlpha(0.0f);
                    i++;
                }
                arrayList.clear();
                arrayList2.clear();
                break;
            default:
                AnimatorSet animatorSet2 = this.b;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((View) arrayList.get(i3)).setScaleX(1.0f);
                    ((View) arrayList.get(i3)).setScaleY(1.0f);
                    ((View) arrayList.get(i3)).setAlpha(1.0f);
                }
                while (i < arrayList2.size()) {
                    ((View) arrayList2.get(i)).setScaleX(0.0f);
                    ((View) arrayList2.get(i)).setScaleY(0.0f);
                    ((View) arrayList2.get(i)).setAlpha(0.0f);
                    i++;
                }
                arrayList.clear();
                arrayList2.clear();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                int childCount = getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                }
                break;
            default:
                int childCount2 = getChildCount();
                for (int i6 = 0; i6 < childCount2; i6++) {
                    View childAt2 = getChildAt(i6);
                    childAt2.layout(0, 0, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight());
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0113  */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int D;
        int i3;
        ?? r5;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char c;
        int D2;
        int i9;
        int i10;
        boolean z;
        int i11;
        int i12;
        int i13;
        float f;
        int i14;
        byte b = this.a;
        ScrollView scrollView = this.n;
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = this.h;
        Property property = View.TRANSLATION_X;
        Property property2 = View.TRANSLATION_Y;
        switch (b) {
            case 0:
                b3a b3aVar = (b3a) scrollView;
                m7 m7Var = b3aVar.b;
                int childCount = getChildCount();
                int size = View.MeasureSpec.getSize(i);
                int L = size - hl.L(28.0f);
                int L2 = hl.L(10.0f);
                int L3 = hl.L(10.0f);
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (i15 < childCount) {
                    View childAt = getChildAt(i15);
                    int i18 = childCount;
                    if (childAt instanceof zc5) {
                        i5 = i15;
                        int i19 = i16;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(28.0f), TLObject.FLAG_30));
                        boolean contains = arrayList2.contains(childAt);
                        if (contains || childAt.getMeasuredWidth() + i19 <= L) {
                            i6 = i19;
                        } else {
                            L2 = uh9.w(4.0f, childAt.getMeasuredHeight(), L2);
                            i6 = 0;
                        }
                        if (childAt.getMeasuredWidth() + i17 > L) {
                            L3 = uh9.w(4.0f, childAt.getMeasuredHeight(), L3);
                            i17 = 0;
                        }
                        int L4 = hl.L(14.0f) + i6;
                        if (!this.c) {
                            if (contains) {
                                childAt.setTranslationX(hl.L(14.0f) + i17);
                                childAt.setTranslationY(L3);
                            } else {
                                if (arrayList2.isEmpty()) {
                                    i7 = L;
                                    childAt.setTranslationX(L4);
                                    childAt.setTranslationY(L2);
                                } else {
                                    float f2 = L4;
                                    i7 = L;
                                    if (childAt.getTranslationX() != f2) {
                                        i8 = 1;
                                        c = 0;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, f2));
                                    } else {
                                        i8 = 1;
                                        c = 0;
                                    }
                                    float f3 = L2;
                                    if (childAt.getTranslationY() != f3) {
                                        float[] fArr = new float[i8];
                                        fArr[c] = f3;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, fArr));
                                    }
                                }
                                if (!contains) {
                                    i6 = uh9.w(6.0f, childAt.getMeasuredWidth(), i6);
                                }
                                i17 = uh9.w(6.0f, childAt.getMeasuredWidth(), i17);
                                i16 = i6;
                            }
                        }
                        i7 = L;
                        if (!contains) {
                        }
                        i17 = uh9.w(6.0f, childAt.getMeasuredWidth(), i17);
                        i16 = i6;
                    } else {
                        i7 = L;
                        i5 = i15;
                    }
                    i15 = i5 + 1;
                    childCount = i18;
                    L = i7;
                }
                int i20 = L;
                int i21 = i16;
                if (hl.O1()) {
                    D = hl.L(376.0f) / 3;
                } else {
                    Point point = hl.q;
                    D = ik8.D(154.0f, Math.min(point.x, point.y), 3);
                }
                if (i20 - i21 < D) {
                    L2 += hl.L(36.0f);
                    i3 = 0;
                } else {
                    i3 = i21;
                }
                if (i20 - i17 < D) {
                    L3 += hl.L(36.0f);
                }
                m7Var.measure(View.MeasureSpec.makeMeasureSpec(i20 - i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(28.0f), TLObject.FLAG_30));
                m7Var.t(m7Var.getMeasuredWidth() > b3aVar.c, true);
                if (!this.c) {
                    int L5 = hl.L(38.0f) + L3;
                    int L6 = hl.L(16.0f) + i3;
                    b3aVar.J = L2;
                    if (this.b != null) {
                        int L7 = hl.L(38.0f) + L2;
                        float f4 = b3aVar.K;
                        float f5 = L7;
                        if (f4 != f5) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, f5);
                            ofFloat.addUpdateListener(new b49(b3aVar, (byte) 21));
                            arrayList.add(ofFloat);
                        }
                        float f6 = L6;
                        if (m7Var.getTranslationX() != f6) {
                            i4 = 1;
                            r5 = 0;
                            arrayList.add(ObjectAnimator.ofFloat(m7Var, (Property<m7, Float>) property, f6));
                        } else {
                            r5 = 0;
                            i4 = 1;
                        }
                        float translationY = m7Var.getTranslationY();
                        float f7 = b3aVar.J;
                        if (translationY != f7) {
                            float[] fArr2 = new float[i4];
                            fArr2[r5] = f7;
                            arrayList.add(ObjectAnimator.ofFloat(m7Var, (Property<m7, Float>) property2, fArr2));
                        }
                        m7Var.setAllowDrawCursor(r5);
                        this.b.playTogether(arrayList);
                        this.b.setDuration(180L);
                        this.b.setInterpolator(new LinearInterpolator());
                        this.b.start();
                        this.c = true;
                    } else {
                        b3aVar.K = L5;
                        m7Var.setTranslationX(L6);
                        m7Var.setTranslationY(b3aVar.J);
                    }
                } else if (this.b != null && !b3aVar.I && arrayList2.isEmpty()) {
                    m7Var.bringPointIntoView(m7Var.getSelectionStart());
                }
                setMeasuredDimension(size, (int) b3aVar.K);
                break;
            default:
                t9b t9bVar = (t9b) scrollView;
                i9b i9bVar = t9bVar.h;
                m7 m7Var2 = t9bVar.b;
                int childCount2 = getChildCount();
                int size2 = View.MeasureSpec.getSize(i);
                int L8 = size2 - hl.L(14.0f);
                int L9 = hl.L(10.0f);
                int L10 = hl.L(10.0f);
                int i22 = L9;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                while (i23 < childCount2) {
                    View childAt2 = getChildAt(i23);
                    i9b i9bVar2 = i9bVar;
                    if (childAt2 instanceof zc5) {
                        i9 = childCount2;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(28.0f), TLObject.FLAG_30));
                        boolean contains2 = arrayList2.contains(childAt2);
                        if (contains2 || childAt2.getMeasuredWidth() + i24 <= L8) {
                            i10 = i24;
                        } else {
                            i22 = uh9.w(4.0f, childAt2.getMeasuredHeight(), i22);
                            i10 = 0;
                        }
                        if (childAt2.getMeasuredWidth() + i25 > L8) {
                            z = contains2;
                            L10 = uh9.w(4.0f, childAt2.getMeasuredHeight(), L10);
                            i11 = 0;
                        } else {
                            z = contains2;
                            i11 = i25;
                        }
                        int L11 = hl.L(7.0f) + i10;
                        i12 = L8;
                        if (!this.c) {
                            if (z) {
                                childAt2.setTranslationX(hl.L(7.0f) + i11);
                                childAt2.setTranslationY(L10);
                            } else {
                                if (arrayList2.isEmpty()) {
                                    i13 = L10;
                                    childAt2.setTranslationX(L11);
                                    childAt2.setTranslationY(i22);
                                } else {
                                    float f8 = L11;
                                    i13 = L10;
                                    if (childAt2.getTranslationX() != f8) {
                                        i14 = 1;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property, f8));
                                    } else {
                                        i14 = 1;
                                    }
                                    float f9 = i22;
                                    if (childAt2.getTranslationY() != f9) {
                                        float[] fArr3 = new float[i14];
                                        fArr3[0] = f9;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property2, fArr3));
                                    }
                                }
                                if (z) {
                                    f = 4.0f;
                                    i10 = uh9.w(4.0f, childAt2.getMeasuredWidth(), i10);
                                } else {
                                    f = 4.0f;
                                }
                                i25 = uh9.w(f, childAt2.getMeasuredWidth(), i11);
                                L10 = i13;
                                i24 = i10;
                            }
                        }
                        i13 = L10;
                        if (z) {
                        }
                        i25 = uh9.w(f, childAt2.getMeasuredWidth(), i11);
                        L10 = i13;
                        i24 = i10;
                    } else {
                        i9 = childCount2;
                        i12 = L8;
                    }
                    i23++;
                    i9bVar = i9bVar2;
                    childCount2 = i9;
                    L8 = i12;
                }
                i9b i9bVar3 = i9bVar;
                int i26 = L8;
                if (hl.O1()) {
                    D2 = hl.L(394.0f) / 3;
                } else {
                    Point point2 = hl.q;
                    D2 = ik8.D(136.0f, Math.min(point2.x, point2.y), 3);
                }
                if (i26 - i24 < D2) {
                    i22 += hl.L(36.0f);
                    i24 = 0;
                }
                if (i26 - i25 < D2) {
                    L10 += hl.L(36.0f);
                }
                m7Var2.measure(View.MeasureSpec.makeMeasureSpec(i26 - i24, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(28.0f), TLObject.FLAG_30));
                m7Var2.t(m7Var2.getMeasuredWidth() > t9bVar.c, true);
                if (!this.c) {
                    int L12 = hl.L(38.0f) + L10;
                    int L13 = hl.L(16.0f) + i24;
                    t9bVar.J = i22;
                    if (this.b != null) {
                        int L14 = hl.L(38.0f) + i22;
                        t9bVar.L = L14;
                        float f10 = t9bVar.K;
                        float f11 = L14;
                        if (f10 != f11) {
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, f11);
                            ofFloat2.addUpdateListener(new ija(t9bVar, (byte) 20));
                            arrayList.add(ofFloat2);
                        }
                        float f12 = L13;
                        if (m7Var2.getTranslationX() != f12) {
                            arrayList.add(ObjectAnimator.ofFloat(m7Var2, (Property<m7, Float>) property, f12));
                        }
                        float translationY2 = m7Var2.getTranslationY();
                        float f13 = t9bVar.J;
                        if (translationY2 != f13) {
                            arrayList.add(ObjectAnimator.ofFloat(m7Var2, (Property<m7, Float>) property2, f13));
                        }
                        m7Var2.setAllowDrawCursor(false);
                        this.b.playTogether(arrayList);
                        this.b.setDuration(180L);
                        this.b.setInterpolator(new LinearInterpolator());
                        this.b.start();
                        this.c = true;
                        if (i9bVar3 != null) {
                            i9bVar3.run();
                        }
                    } else {
                        t9bVar.L = L12;
                        t9bVar.K = L12;
                        m7Var2.setTranslationX(L13);
                        m7Var2.setTranslationY(t9bVar.J);
                        if (i9bVar3 != null) {
                            i9bVar3.run();
                        }
                        if (t9bVar.M) {
                            post(new s8b(this, (byte) 2));
                            t9bVar.M = false;
                        }
                    }
                } else if (this.b != null) {
                    if (!t9bVar.I && arrayList2.isEmpty()) {
                        m7Var2.bringPointIntoView(m7Var2.getSelectionStart());
                    }
                    if (t9bVar.M) {
                        t9bVar.fullScroll(jn7.N1);
                        t9bVar.M = false;
                    }
                }
                setMeasuredDimension(size2, (int) t9bVar.K);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3a(t9b t9bVar, Context context) {
        super(context);
        this.n = t9bVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
    }
}
