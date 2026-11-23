package ah;

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
import hi.g9;
import hi.h9;
import hi.s3;
import hi.v8;
import hi.w;
import java.util.ArrayList;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.n20;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class n extends ViewGroup {
    public final /* synthetic */ int a = 0;
    public AnimatorSet b;
    public boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public final /* synthetic */ ScrollView n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, Context context) {
        super(context);
        this.n = oVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
    }

    public void a() {
        h9 h9Var = (h9) this.n;
        int i7 = 1;
        h9Var.I = true;
        ArrayList arrayList = h9Var.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((n20) arrayList2.get(i10)).setOnClickListener(null);
        }
        c();
        this.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.addListener(new g9(this, arrayList2, i7));
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        ArrayList arrayList5 = this.d;
        arrayList5.clear();
        this.e.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            n20 n20Var = (n20) arrayList2.get(i11);
            arrayList5.add(n20Var);
            arrayList4.add(ObjectAnimator.ofFloat(n20Var, (Property<n20, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(n20Var, (Property<n20, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(n20Var, (Property<n20, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        requestLayout();
    }

    public void b(boolean z10) {
        o oVar = (o) this.n;
        int i7 = 1;
        oVar.I = true;
        ArrayList arrayList = oVar.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((n20) arrayList2.get(i10)).setOnClickListener(null);
        }
        c();
        if (z10) {
            this.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.b = animatorSet;
            animatorSet.addListener(new m(this, arrayList2, i7));
            ArrayList arrayList4 = this.f;
            arrayList4.clear();
            ArrayList arrayList5 = this.d;
            arrayList5.clear();
            this.e.clear();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                n20 n20Var = (n20) arrayList2.get(i11);
                arrayList5.add(n20Var);
                arrayList4.add(ObjectAnimator.ofFloat(n20Var, (Property<n20, Float>) View.SCALE_X, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(n20Var, (Property<n20, Float>) View.SCALE_Y, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(n20Var, (Property<n20, Float>) View.ALPHA, 1.0f, 0.0f));
            }
        } else {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                removeView((View) arrayList2.get(i12));
            }
            arrayList3.clear();
            this.b = null;
            this.c = false;
            oVar.b.setAllowDrawCursor(true);
        }
        requestLayout();
    }

    public final void c() {
        switch (this.a) {
            case 0:
                AnimatorSet animatorSet = this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                int i7 = 0;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i10 >= arrayList.size()) {
                        while (true) {
                            ArrayList arrayList2 = this.e;
                            if (i7 >= arrayList2.size()) {
                                arrayList.clear();
                                arrayList2.clear();
                                break;
                            } else {
                                ((View) arrayList2.get(i7)).setScaleX(0.0f);
                                ((View) arrayList2.get(i7)).setScaleY(0.0f);
                                ((View) arrayList2.get(i7)).setAlpha(0.0f);
                                i7++;
                            }
                        }
                    } else {
                        ((View) arrayList.get(i10)).setScaleX(1.0f);
                        ((View) arrayList.get(i10)).setScaleY(1.0f);
                        ((View) arrayList.get(i10)).setAlpha(1.0f);
                        i10++;
                    }
                }
            default:
                AnimatorSet animatorSet2 = this.b;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    if (i12 >= arrayList3.size()) {
                        while (true) {
                            ArrayList arrayList4 = this.e;
                            if (i11 >= arrayList4.size()) {
                                arrayList3.clear();
                                arrayList4.clear();
                                break;
                            } else {
                                ((View) arrayList4.get(i11)).setScaleX(0.0f);
                                ((View) arrayList4.get(i11)).setScaleY(0.0f);
                                ((View) arrayList4.get(i11)).setAlpha(0.0f);
                                i11++;
                            }
                        }
                    } else {
                        ((View) arrayList3.get(i12)).setScaleX(1.0f);
                        ((View) arrayList3.get(i12)).setScaleY(1.0f);
                        ((View) arrayList3.get(i12)).setAlpha(1.0f);
                        i12++;
                    }
                }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                int childCount = getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                }
                break;
            default:
                int childCount2 = getChildCount();
                for (int i14 = 0; i14 < childCount2; i14++) {
                    View childAt2 = getChildAt(i14);
                    childAt2.layout(0, 0, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight());
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x034c  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        int z10;
        int i11;
        ?? r82;
        int i12;
        int i13;
        int i14;
        int i15;
        char c10;
        int z11;
        v8 v8Var;
        int i16;
        int i17;
        boolean z12;
        int i18;
        int i19;
        float f10;
        int i20 = this.a;
        ScrollView scrollView = this.n;
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = this.h;
        Property property = View.TRANSLATION_X;
        Property property2 = View.TRANSLATION_Y;
        switch (i20) {
            case 0:
                o oVar = (o) scrollView;
                i iVar = oVar.b;
                int childCount = getChildCount();
                int size = View.MeasureSpec.getSize(i7);
                int L = size - g0.L(28.0f);
                int L2 = g0.L(10.0f);
                int L3 = g0.L(10.0f);
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i21 < childCount) {
                    View childAt = getChildAt(i21);
                    int i24 = childCount;
                    if (childAt instanceof n20) {
                        i12 = i21;
                        int i25 = i22;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(g0.L(28.0f), TLObject.FLAG_30));
                        boolean contains = arrayList2.contains(childAt);
                        if (contains || childAt.getMeasuredWidth() + i25 <= L) {
                            i13 = i25;
                        } else {
                            L2 = f3.C(4.0f, childAt.getMeasuredHeight(), L2);
                            i13 = 0;
                        }
                        if (childAt.getMeasuredWidth() + i23 > L) {
                            L3 = f3.C(4.0f, childAt.getMeasuredHeight(), L3);
                            i23 = 0;
                        }
                        int L4 = g0.L(14.0f) + i13;
                        if (!this.c) {
                            if (contains) {
                                childAt.setTranslationX(g0.L(14.0f) + i23);
                                childAt.setTranslationY(L3);
                            } else {
                                if (arrayList2.isEmpty()) {
                                    i14 = L;
                                    childAt.setTranslationX(L4);
                                    childAt.setTranslationY(L2);
                                } else {
                                    float f11 = L4;
                                    i14 = L;
                                    if (childAt.getTranslationX() != f11) {
                                        i15 = 1;
                                        c10 = 0;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, f11));
                                    } else {
                                        i15 = 1;
                                        c10 = 0;
                                    }
                                    float f12 = L2;
                                    if (childAt.getTranslationY() != f12) {
                                        float[] fArr = new float[i15];
                                        fArr[c10] = f12;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, fArr));
                                    }
                                }
                                if (!contains) {
                                    i13 = f3.C(6.0f, childAt.getMeasuredWidth(), i13);
                                }
                                i23 = f3.C(6.0f, childAt.getMeasuredWidth(), i23);
                                i22 = i13;
                            }
                        }
                        i14 = L;
                        if (!contains) {
                        }
                        i23 = f3.C(6.0f, childAt.getMeasuredWidth(), i23);
                        i22 = i13;
                    } else {
                        i14 = L;
                        i12 = i21;
                    }
                    i21 = i12 + 1;
                    childCount = i24;
                    L = i14;
                }
                int i26 = L;
                int i27 = i22;
                if (g0.Q1()) {
                    z10 = g0.L(376.0f) / 3;
                } else {
                    Point point = g0.q;
                    z10 = m10.z(154.0f, Math.min(point.x, point.y), 3);
                }
                if (i26 - i27 < z10) {
                    L2 += g0.L(36.0f);
                    i11 = 0;
                } else {
                    i11 = i27;
                }
                if (i26 - i23 < z10) {
                    L3 += g0.L(36.0f);
                }
                iVar.measure(View.MeasureSpec.makeMeasureSpec(i26 - i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(28.0f), TLObject.FLAG_30));
                iVar.t(iVar.getMeasuredWidth() > oVar.c, true);
                if (!this.c) {
                    int L5 = g0.L(38.0f) + L3;
                    int L6 = g0.L(16.0f) + i11;
                    oVar.J = L2;
                    if (this.b != null) {
                        int L7 = g0.L(38.0f) + L2;
                        float f13 = oVar.K;
                        float f14 = L7;
                        if (f13 != f14) {
                            r82 = 0;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f14);
                            ofFloat.addUpdateListener(new g(oVar, 0 == true ? 1 : 0));
                            arrayList.add(ofFloat);
                        } else {
                            r82 = 0;
                        }
                        float f15 = L6;
                        if (iVar.getTranslationX() != f15) {
                            float[] fArr2 = new float[1];
                            fArr2[r82] = f15;
                            arrayList.add(ObjectAnimator.ofFloat(iVar, (Property<i, Float>) property, fArr2));
                        }
                        float translationY = iVar.getTranslationY();
                        float f16 = oVar.J;
                        if (translationY != f16) {
                            float[] fArr3 = new float[1];
                            fArr3[r82] = f16;
                            arrayList.add(ObjectAnimator.ofFloat(iVar, (Property<i, Float>) property2, fArr3));
                        }
                        iVar.setAllowDrawCursor(r82);
                        this.b.playTogether(arrayList);
                        this.b.setDuration(180L);
                        this.b.setInterpolator(new LinearInterpolator());
                        this.b.start();
                        this.c = true;
                    } else {
                        oVar.K = L5;
                        iVar.setTranslationX(L6);
                        iVar.setTranslationY(oVar.J);
                    }
                } else if (this.b != null && !oVar.I && arrayList2.isEmpty()) {
                    iVar.bringPointIntoView(iVar.getSelectionStart());
                }
                setMeasuredDimension(size, (int) oVar.K);
                break;
            default:
                h9 h9Var = (h9) scrollView;
                v8 v8Var2 = h9Var.h;
                i iVar2 = h9Var.b;
                int childCount2 = getChildCount();
                int size2 = View.MeasureSpec.getSize(i7);
                int L8 = size2 - g0.L(14.0f);
                int L9 = g0.L(10.0f);
                int L10 = g0.L(10.0f);
                int i28 = L9;
                int i29 = 0;
                int i30 = 0;
                int i31 = 0;
                while (i29 < childCount2) {
                    View childAt2 = getChildAt(i29);
                    if (childAt2 instanceof n20) {
                        v8Var = v8Var2;
                        i16 = childCount2;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(g0.L(28.0f), TLObject.FLAG_30));
                        boolean contains2 = arrayList2.contains(childAt2);
                        if (contains2 || childAt2.getMeasuredWidth() + i30 <= L8) {
                            i17 = i30;
                        } else {
                            i28 = f3.C(4.0f, childAt2.getMeasuredHeight(), i28);
                            i17 = 0;
                        }
                        if (childAt2.getMeasuredWidth() + i31 > L8) {
                            z12 = contains2;
                            L10 = f3.C(4.0f, childAt2.getMeasuredHeight(), L10);
                            i18 = 0;
                        } else {
                            z12 = contains2;
                            i18 = i31;
                        }
                        int L11 = g0.L(7.0f) + i17;
                        i19 = L8;
                        if (!this.c) {
                            if (z12) {
                                childAt2.setTranslationX(g0.L(7.0f) + i18);
                                childAt2.setTranslationY(L10);
                            } else if (arrayList2.isEmpty()) {
                                childAt2.setTranslationX(L11);
                                childAt2.setTranslationY(i28);
                            } else {
                                float f17 = L11;
                                if (childAt2.getTranslationX() != f17) {
                                    arrayList.add(ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property, f17));
                                }
                                float f18 = i28;
                                if (childAt2.getTranslationY() != f18) {
                                    arrayList.add(ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property2, f18));
                                }
                            }
                        }
                        if (z12) {
                            f10 = 4.0f;
                        } else {
                            f10 = 4.0f;
                            i17 = f3.C(4.0f, childAt2.getMeasuredWidth(), i17);
                        }
                        i31 = f3.C(f10, childAt2.getMeasuredWidth(), i18);
                        i30 = i17;
                    } else {
                        v8Var = v8Var2;
                        i16 = childCount2;
                        i19 = L8;
                    }
                    i29++;
                    v8Var2 = v8Var;
                    childCount2 = i16;
                    L8 = i19;
                }
                v8 v8Var3 = v8Var2;
                int i32 = L8;
                if (g0.Q1()) {
                    z11 = g0.L(394.0f) / 3;
                } else {
                    Point point2 = g0.q;
                    z11 = m10.z(136.0f, Math.min(point2.x, point2.y), 3);
                }
                if (i32 - i30 < z11) {
                    i28 += g0.L(36.0f);
                    i30 = 0;
                }
                if (i32 - i31 < z11) {
                    L10 += g0.L(36.0f);
                }
                iVar2.measure(View.MeasureSpec.makeMeasureSpec(i32 - i30, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(28.0f), TLObject.FLAG_30));
                iVar2.t(iVar2.getMeasuredWidth() > h9Var.c, true);
                if (!this.c) {
                    int L12 = g0.L(38.0f) + L10;
                    int L13 = g0.L(16.0f) + i30;
                    h9Var.J = i28;
                    if (this.b != null) {
                        int L14 = g0.L(38.0f) + i28;
                        h9Var.L = L14;
                        float f19 = h9Var.K;
                        float f20 = L14;
                        if (f19 != f20) {
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f19, f20);
                            ofFloat2.addUpdateListener(new s3(h9Var, 7));
                            arrayList.add(ofFloat2);
                        }
                        float f21 = L13;
                        if (iVar2.getTranslationX() != f21) {
                            arrayList.add(ObjectAnimator.ofFloat(iVar2, (Property<i, Float>) property, f21));
                        }
                        float translationY2 = iVar2.getTranslationY();
                        float f22 = h9Var.J;
                        if (translationY2 != f22) {
                            arrayList.add(ObjectAnimator.ofFloat(iVar2, (Property<i, Float>) property2, f22));
                        }
                        iVar2.setAllowDrawCursor(false);
                        this.b.playTogether(arrayList);
                        this.b.setDuration(180L);
                        this.b.setInterpolator(new LinearInterpolator());
                        this.b.start();
                        this.c = true;
                        if (v8Var3 != null) {
                            v8Var3.run();
                        }
                    } else {
                        h9Var.L = L12;
                        h9Var.K = L12;
                        iVar2.setTranslationX(L13);
                        iVar2.setTranslationY(h9Var.J);
                        if (v8Var3 != null) {
                            v8Var3.run();
                        }
                        if (h9Var.M) {
                            post(new w(this, 17));
                            h9Var.M = false;
                        }
                    }
                } else if (this.b != null) {
                    if (!h9Var.I && arrayList2.isEmpty()) {
                        iVar2.bringPointIntoView(iVar2.getSelectionStart());
                    }
                    if (h9Var.M) {
                        h9Var.fullScroll(ks.O1);
                        h9Var.M = false;
                    }
                }
                setMeasuredDimension(size2, (int) h9Var.K);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(h9 h9Var, Context context) {
        super(context);
        this.n = h9Var;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
    }
}
