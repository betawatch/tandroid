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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gz9 extends ViewGroup {
    public final /* synthetic */ byte a = 0;
    public AnimatorSet b;
    public boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public final /* synthetic */ ScrollView n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz9(hz9 hz9Var, Context context) {
        super(context);
        this.n = hz9Var;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void a() {
        v5b v5bVar = (v5b) this.n;
        byte b = 1;
        v5bVar.I = true;
        ArrayList arrayList = v5bVar.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i = 0; i < arrayList2.size(); i++) {
            ((ya5) arrayList2.get(i)).setOnClickListener(null);
        }
        c();
        this.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.addListener(new u5b(this, arrayList2, b));
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        ArrayList arrayList5 = this.d;
        arrayList5.clear();
        this.e.clear();
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ya5 ya5Var = (ya5) arrayList2.get(i2);
            arrayList5.add(ya5Var);
            arrayList4.add(ObjectAnimator.ofFloat(ya5Var, (Property<ya5, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(ya5Var, (Property<ya5, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(ya5Var, (Property<ya5, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        requestLayout();
    }

    public final void b(boolean z) {
        hz9 hz9Var = (hz9) this.n;
        byte b = 1;
        hz9Var.I = true;
        ArrayList arrayList = hz9Var.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i = 0; i < arrayList2.size(); i++) {
            ((ya5) arrayList2.get(i)).setOnClickListener(null);
        }
        c();
        if (z) {
            this.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.b = animatorSet;
            animatorSet.addListener(new fz9(this, arrayList2, b));
            ArrayList arrayList4 = this.f;
            arrayList4.clear();
            ArrayList arrayList5 = this.d;
            arrayList5.clear();
            this.e.clear();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                ya5 ya5Var = (ya5) arrayList2.get(i2);
                arrayList5.add(ya5Var);
                arrayList4.add(ObjectAnimator.ofFloat(ya5Var, (Property<ya5, Float>) View.SCALE_X, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(ya5Var, (Property<ya5, Float>) View.SCALE_Y, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(ya5Var, (Property<ya5, Float>) View.ALPHA, 1.0f, 0.0f));
            }
        } else {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                removeView((View) arrayList2.get(i3));
            }
            arrayList3.clear();
            this.b = null;
            this.c = false;
            hz9Var.b.setAllowDrawCursor(true);
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
    /* JADX WARN: Removed duplicated region for block: B:118:0x033c  */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int D;
        int i3;
        int i4;
        ?? r7;
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
        float f;
        byte b = this.a;
        ScrollView scrollView = this.n;
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = this.h;
        Property property = View.TRANSLATION_X;
        Property property2 = View.TRANSLATION_Y;
        switch (b) {
            case 0:
                hz9 hz9Var = (hz9) scrollView;
                l7 l7Var = hz9Var.b;
                int childCount = getChildCount();
                int size = View.MeasureSpec.getSize(i);
                int L = size - gl.L(28.0f);
                int L2 = gl.L(10.0f);
                int L3 = gl.L(10.0f);
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (i13 < childCount) {
                    View childAt = getChildAt(i13);
                    int i16 = childCount;
                    if (childAt instanceof ya5) {
                        i5 = i13;
                        int i17 = i14;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(28.0f), TLObject.FLAG_30));
                        boolean contains = arrayList2.contains(childAt);
                        if (contains || childAt.getMeasuredWidth() + i17 <= L) {
                            i6 = i17;
                        } else {
                            L2 = de9.w(4.0f, childAt.getMeasuredHeight(), L2);
                            i6 = 0;
                        }
                        if (childAt.getMeasuredWidth() + i15 > L) {
                            L3 = de9.w(4.0f, childAt.getMeasuredHeight(), L3);
                            i15 = 0;
                        }
                        int L4 = gl.L(14.0f) + i6;
                        if (!this.c) {
                            if (contains) {
                                childAt.setTranslationX(gl.L(14.0f) + i15);
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
                                    i6 = de9.w(6.0f, childAt.getMeasuredWidth(), i6);
                                }
                                i15 = de9.w(6.0f, childAt.getMeasuredWidth(), i15);
                                i14 = i6;
                            }
                        }
                        i7 = L;
                        if (!contains) {
                        }
                        i15 = de9.w(6.0f, childAt.getMeasuredWidth(), i15);
                        i14 = i6;
                    } else {
                        i7 = L;
                        i5 = i13;
                    }
                    i13 = i5 + 1;
                    childCount = i16;
                    L = i7;
                }
                int i18 = L;
                int i19 = i14;
                if (gl.O1()) {
                    D = gl.L(376.0f) / 3;
                } else {
                    Point point = gl.q;
                    D = ug8.D(154.0f, Math.min(point.x, point.y), 3);
                }
                if (i18 - i19 < D) {
                    L2 += gl.L(36.0f);
                    i3 = 0;
                } else {
                    i3 = i19;
                }
                if (i18 - i15 < D) {
                    L3 += gl.L(36.0f);
                }
                l7Var.measure(View.MeasureSpec.makeMeasureSpec(i18 - i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(28.0f), TLObject.FLAG_30));
                l7Var.t(l7Var.getMeasuredWidth() > hz9Var.c, true);
                if (!this.c) {
                    int L5 = gl.L(38.0f) + L3;
                    int L6 = gl.L(16.0f) + i3;
                    hz9Var.J = L2;
                    if (this.b != null) {
                        int L7 = gl.L(38.0f) + L2;
                        float f4 = hz9Var.K;
                        float f5 = L7;
                        if (f4 != f5) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, f5);
                            ofFloat.addUpdateListener(new x89(hz9Var, (byte) 19));
                            arrayList.add(ofFloat);
                        }
                        float f6 = L6;
                        if (l7Var.getTranslationX() != f6) {
                            i4 = 1;
                            r7 = 0;
                            arrayList.add(ObjectAnimator.ofFloat(l7Var, (Property<l7, Float>) property, f6));
                        } else {
                            i4 = 1;
                            r7 = 0;
                        }
                        float translationY = l7Var.getTranslationY();
                        float f7 = hz9Var.J;
                        if (translationY != f7) {
                            float[] fArr2 = new float[i4];
                            fArr2[r7] = f7;
                            arrayList.add(ObjectAnimator.ofFloat(l7Var, (Property<l7, Float>) property2, fArr2));
                        }
                        l7Var.setAllowDrawCursor(r7);
                        this.b.playTogether(arrayList);
                        this.b.setDuration(180L);
                        this.b.setInterpolator(new LinearInterpolator());
                        this.b.start();
                        this.c = true;
                    } else {
                        hz9Var.K = L5;
                        l7Var.setTranslationX(L6);
                        l7Var.setTranslationY(hz9Var.J);
                    }
                } else if (this.b != null && !hz9Var.I && arrayList2.isEmpty()) {
                    l7Var.bringPointIntoView(l7Var.getSelectionStart());
                }
                setMeasuredDimension(size, (int) hz9Var.K);
                break;
            default:
                v5b v5bVar = (v5b) scrollView;
                l5b l5bVar = v5bVar.h;
                l7 l7Var2 = v5bVar.b;
                int childCount2 = getChildCount();
                int size2 = View.MeasureSpec.getSize(i);
                int L8 = size2 - gl.L(14.0f);
                int L9 = gl.L(10.0f);
                int L10 = gl.L(10.0f);
                int i20 = L9;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i21 < childCount2) {
                    View childAt2 = getChildAt(i21);
                    l5b l5bVar2 = l5bVar;
                    if (childAt2 instanceof ya5) {
                        i9 = childCount2;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(28.0f), TLObject.FLAG_30));
                        boolean contains2 = arrayList2.contains(childAt2);
                        if (contains2 || childAt2.getMeasuredWidth() + i22 <= L8) {
                            i10 = i22;
                        } else {
                            i20 = de9.w(4.0f, childAt2.getMeasuredHeight(), i20);
                            i10 = 0;
                        }
                        if (childAt2.getMeasuredWidth() + i23 > L8) {
                            z = contains2;
                            L10 = de9.w(4.0f, childAt2.getMeasuredHeight(), L10);
                            i11 = 0;
                        } else {
                            z = contains2;
                            i11 = i23;
                        }
                        int L11 = gl.L(7.0f) + i10;
                        i12 = L8;
                        if (!this.c) {
                            if (z) {
                                childAt2.setTranslationX(gl.L(7.0f) + i11);
                                childAt2.setTranslationY(L10);
                            } else if (arrayList2.isEmpty()) {
                                childAt2.setTranslationX(L11);
                                childAt2.setTranslationY(i20);
                            } else {
                                float f8 = L11;
                                if (childAt2.getTranslationX() != f8) {
                                    arrayList.add(ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property, f8));
                                }
                                float f9 = i20;
                                if (childAt2.getTranslationY() != f9) {
                                    arrayList.add(ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property2, f9));
                                }
                            }
                        }
                        if (z) {
                            f = 4.0f;
                        } else {
                            f = 4.0f;
                            i10 = de9.w(4.0f, childAt2.getMeasuredWidth(), i10);
                        }
                        i23 = de9.w(f, childAt2.getMeasuredWidth(), i11);
                        i22 = i10;
                    } else {
                        i9 = childCount2;
                        i12 = L8;
                    }
                    i21++;
                    l5bVar = l5bVar2;
                    childCount2 = i9;
                    L8 = i12;
                }
                l5b l5bVar3 = l5bVar;
                int i24 = L8;
                if (gl.O1()) {
                    D2 = gl.L(394.0f) / 3;
                } else {
                    Point point2 = gl.q;
                    D2 = ug8.D(136.0f, Math.min(point2.x, point2.y), 3);
                }
                if (i24 - i22 < D2) {
                    i20 += gl.L(36.0f);
                    i22 = 0;
                }
                if (i24 - i23 < D2) {
                    L10 += gl.L(36.0f);
                }
                l7Var2.measure(View.MeasureSpec.makeMeasureSpec(i24 - i22, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(28.0f), TLObject.FLAG_30));
                l7Var2.t(l7Var2.getMeasuredWidth() > v5bVar.c, true);
                if (!this.c) {
                    int L12 = gl.L(38.0f) + L10;
                    int L13 = gl.L(16.0f) + i22;
                    v5bVar.J = i20;
                    if (this.b != null) {
                        int L14 = gl.L(38.0f) + i20;
                        v5bVar.L = L14;
                        float f10 = v5bVar.K;
                        float f11 = L14;
                        if (f10 != f11) {
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, f11);
                            ofFloat2.addUpdateListener(new gja(v5bVar, (byte) 18));
                            arrayList.add(ofFloat2);
                        }
                        float f12 = L13;
                        if (l7Var2.getTranslationX() != f12) {
                            arrayList.add(ObjectAnimator.ofFloat(l7Var2, (Property<l7, Float>) property, f12));
                        }
                        float translationY2 = l7Var2.getTranslationY();
                        float f13 = v5bVar.J;
                        if (translationY2 != f13) {
                            arrayList.add(ObjectAnimator.ofFloat(l7Var2, (Property<l7, Float>) property2, f13));
                        }
                        l7Var2.setAllowDrawCursor(false);
                        this.b.playTogether(arrayList);
                        this.b.setDuration(180L);
                        this.b.setInterpolator(new LinearInterpolator());
                        this.b.start();
                        this.c = true;
                        if (l5bVar3 != null) {
                            l5bVar3.run();
                        }
                    } else {
                        v5bVar.L = L12;
                        v5bVar.K = L12;
                        l7Var2.setTranslationX(L13);
                        l7Var2.setTranslationY(v5bVar.J);
                        if (l5bVar3 != null) {
                            l5bVar3.run();
                        }
                        if (v5bVar.M) {
                            post(new kya((Object) this, (byte) 15));
                            v5bVar.M = false;
                        }
                    }
                } else if (this.b != null) {
                    if (!v5bVar.I && arrayList2.isEmpty()) {
                        l7Var2.bringPointIntoView(l7Var2.getSelectionStart());
                    }
                    if (v5bVar.M) {
                        v5bVar.fullScroll(kk7.N1);
                        v5bVar.M = false;
                    }
                }
                setMeasuredDimension(size2, (int) v5bVar.K);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz9(v5b v5bVar, Context context) {
        super(context);
        this.n = v5bVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
    }
}
