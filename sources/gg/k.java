package gg;

import ag.u;
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
import lh.m2;
import lh.m9;
import lh.n9;
import lh.z8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rl;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.a30;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class k extends ViewGroup {
    public final /* synthetic */ int a = 0;
    public AnimatorSet b;
    public boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public final /* synthetic */ ScrollView n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Context context) {
        super(context);
        this.n = lVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
    }

    public void a() {
        n9 n9Var = (n9) this.n;
        int i10 = 1;
        n9Var.C = true;
        ArrayList arrayList = n9Var.d;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((a30) arrayList2.get(i11)).setOnClickListener(null);
        }
        c();
        this.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.addListener(new m9(this, arrayList2, i10));
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        ArrayList arrayList5 = this.d;
        arrayList5.clear();
        this.e.clear();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            a30 a30Var = (a30) arrayList2.get(i12);
            arrayList5.add(a30Var);
            arrayList4.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        requestLayout();
    }

    public void b(boolean z10) {
        l lVar = (l) this.n;
        int i10 = 1;
        lVar.C = true;
        ArrayList arrayList = lVar.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((a30) arrayList2.get(i11)).setOnClickListener(null);
        }
        c();
        if (z10) {
            this.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.b = animatorSet;
            animatorSet.addListener(new j(this, arrayList2, i10));
            ArrayList arrayList4 = this.f;
            arrayList4.clear();
            ArrayList arrayList5 = this.d;
            arrayList5.clear();
            this.e.clear();
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                a30 a30Var = (a30) arrayList2.get(i12);
                arrayList5.add(a30Var);
                arrayList4.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_X, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_Y, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.ALPHA, 1.0f, 0.0f));
            }
        } else {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                removeView((View) arrayList2.get(i13));
            }
            arrayList3.clear();
            this.b = null;
            this.c = false;
            lVar.b.setAllowDrawCursor(true);
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
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i11 >= arrayList.size()) {
                        while (true) {
                            ArrayList arrayList2 = this.e;
                            if (i10 >= arrayList2.size()) {
                                arrayList.clear();
                                arrayList2.clear();
                                break;
                            } else {
                                ((View) arrayList2.get(i10)).setScaleX(0.0f);
                                ((View) arrayList2.get(i10)).setScaleY(0.0f);
                                ((View) arrayList2.get(i10)).setAlpha(0.0f);
                                i10++;
                            }
                        }
                    } else {
                        ((View) arrayList.get(i11)).setScaleX(1.0f);
                        ((View) arrayList.get(i11)).setScaleY(1.0f);
                        ((View) arrayList.get(i11)).setAlpha(1.0f);
                        i11++;
                    }
                }
            default:
                AnimatorSet animatorSet2 = this.b;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    if (i13 >= arrayList3.size()) {
                        while (true) {
                            ArrayList arrayList4 = this.e;
                            if (i12 >= arrayList4.size()) {
                                arrayList3.clear();
                                arrayList4.clear();
                                break;
                            } else {
                                ((View) arrayList4.get(i12)).setScaleX(0.0f);
                                ((View) arrayList4.get(i12)).setScaleY(0.0f);
                                ((View) arrayList4.get(i12)).setAlpha(0.0f);
                                i12++;
                            }
                        }
                    } else {
                        ((View) arrayList3.get(i13)).setScaleX(1.0f);
                        ((View) arrayList3.get(i13)).setScaleY(1.0f);
                        ((View) arrayList3.get(i13)).setAlpha(1.0f);
                        i13++;
                    }
                }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                int childCount = getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                }
                break;
            default:
                int childCount2 = getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = getChildAt(i15);
                    childAt2.layout(0, 0, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight());
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0342  */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int x8;
        int i12;
        int i13;
        ?? r72;
        int i14;
        int i15;
        int i16;
        int i17;
        char c10;
        int x10;
        z8 z8Var;
        int i18;
        int i19;
        boolean z10;
        int i20;
        int i21;
        float f10;
        int i22 = this.a;
        ScrollView scrollView = this.n;
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = this.h;
        Property property = View.TRANSLATION_X;
        Property property2 = View.TRANSLATION_Y;
        switch (i22) {
            case 0:
                l lVar = (l) scrollView;
                g gVar = lVar.b;
                int childCount = getChildCount();
                int size = View.MeasureSpec.getSize(i10);
                int dp = size - AndroidUtilities.dp(28.0f);
                int dp2 = AndroidUtilities.dp(10.0f);
                int dp3 = AndroidUtilities.dp(10.0f);
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                while (i23 < childCount) {
                    View childAt = getChildAt(i23);
                    int i26 = childCount;
                    if (childAt instanceof a30) {
                        i14 = i23;
                        int i27 = i24;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                        boolean contains = arrayList2.contains(childAt);
                        if (contains || childAt.getMeasuredWidth() + i27 <= dp) {
                            i15 = i27;
                        } else {
                            dp2 = y1.C(4.0f, childAt.getMeasuredHeight(), dp2);
                            i15 = 0;
                        }
                        if (childAt.getMeasuredWidth() + i25 > dp) {
                            dp3 = y1.C(4.0f, childAt.getMeasuredHeight(), dp3);
                            i25 = 0;
                        }
                        int dp4 = AndroidUtilities.dp(14.0f) + i15;
                        if (!this.c) {
                            if (contains) {
                                childAt.setTranslationX(AndroidUtilities.dp(14.0f) + i25);
                                childAt.setTranslationY(dp3);
                            } else {
                                if (arrayList2.isEmpty()) {
                                    i16 = dp;
                                    childAt.setTranslationX(dp4);
                                    childAt.setTranslationY(dp2);
                                } else {
                                    float f11 = dp4;
                                    i16 = dp;
                                    if (childAt.getTranslationX() != f11) {
                                        i17 = 1;
                                        c10 = 0;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, f11));
                                    } else {
                                        i17 = 1;
                                        c10 = 0;
                                    }
                                    float f12 = dp2;
                                    if (childAt.getTranslationY() != f12) {
                                        float[] fArr = new float[i17];
                                        fArr[c10] = f12;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, fArr));
                                    }
                                }
                                if (!contains) {
                                    i15 = y1.C(6.0f, childAt.getMeasuredWidth(), i15);
                                }
                                i25 = y1.C(6.0f, childAt.getMeasuredWidth(), i25);
                                i24 = i15;
                            }
                        }
                        i16 = dp;
                        if (!contains) {
                        }
                        i25 = y1.C(6.0f, childAt.getMeasuredWidth(), i25);
                        i24 = i15;
                    } else {
                        i16 = dp;
                        i14 = i23;
                    }
                    i23 = i14 + 1;
                    childCount = i26;
                    dp = i16;
                }
                int i28 = dp;
                int i29 = i24;
                if (AndroidUtilities.isTablet()) {
                    x8 = AndroidUtilities.dp(376.0f) / 3;
                } else {
                    Point point = AndroidUtilities.displaySize;
                    x8 = rl.x(154.0f, Math.min(point.x, point.y), 3);
                }
                if (i28 - i29 < x8) {
                    dp2 += AndroidUtilities.dp(36.0f);
                    i12 = 0;
                } else {
                    i12 = i29;
                }
                if (i28 - i25 < x8) {
                    dp3 += AndroidUtilities.dp(36.0f);
                }
                gVar.measure(View.MeasureSpec.makeMeasureSpec(i28 - i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                gVar.setHintVisible(gVar.getMeasuredWidth() > lVar.c, true);
                if (!this.c) {
                    int dp5 = AndroidUtilities.dp(38.0f) + dp3;
                    int dp6 = AndroidUtilities.dp(16.0f) + i12;
                    lVar.D = dp2;
                    if (this.b != null) {
                        int dp7 = AndroidUtilities.dp(38.0f) + dp2;
                        float f13 = lVar.E;
                        float f14 = dp7;
                        if (f13 != f14) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f14);
                            ofFloat.addUpdateListener(new u(lVar, 4));
                            arrayList.add(ofFloat);
                        }
                        float f15 = dp6;
                        if (gVar.getTranslationX() != f15) {
                            i13 = 1;
                            r72 = 0;
                            arrayList.add(ObjectAnimator.ofFloat(gVar, (Property<g, Float>) property, f15));
                        } else {
                            i13 = 1;
                            r72 = 0;
                        }
                        float translationY = gVar.getTranslationY();
                        float f16 = lVar.D;
                        if (translationY != f16) {
                            float[] fArr2 = new float[i13];
                            fArr2[r72] = f16;
                            arrayList.add(ObjectAnimator.ofFloat(gVar, (Property<g, Float>) property2, fArr2));
                        }
                        gVar.setAllowDrawCursor(r72);
                        this.b.playTogether(arrayList);
                        this.b.setDuration(180L);
                        this.b.setInterpolator(new LinearInterpolator());
                        this.b.start();
                        this.c = true;
                    } else {
                        lVar.E = dp5;
                        gVar.setTranslationX(dp6);
                        gVar.setTranslationY(lVar.D);
                    }
                } else if (this.b != null && !lVar.C && arrayList2.isEmpty()) {
                    gVar.bringPointIntoView(gVar.getSelectionStart());
                }
                setMeasuredDimension(size, (int) lVar.E);
                break;
            default:
                n9 n9Var = (n9) scrollView;
                z8 z8Var2 = n9Var.f;
                g gVar2 = n9Var.a;
                int childCount2 = getChildCount();
                int size2 = View.MeasureSpec.getSize(i10);
                int dp8 = size2 - AndroidUtilities.dp(14.0f);
                int dp9 = AndroidUtilities.dp(10.0f);
                int dp10 = AndroidUtilities.dp(10.0f);
                int i30 = dp9;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                while (i31 < childCount2) {
                    View childAt2 = getChildAt(i31);
                    if (childAt2 instanceof a30) {
                        z8Var = z8Var2;
                        i18 = childCount2;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                        boolean contains2 = arrayList2.contains(childAt2);
                        if (contains2 || childAt2.getMeasuredWidth() + i32 <= dp8) {
                            i19 = i32;
                        } else {
                            i30 = y1.C(4.0f, childAt2.getMeasuredHeight(), i30);
                            i19 = 0;
                        }
                        if (childAt2.getMeasuredWidth() + i33 > dp8) {
                            z10 = contains2;
                            dp10 = y1.C(4.0f, childAt2.getMeasuredHeight(), dp10);
                            i20 = 0;
                        } else {
                            z10 = contains2;
                            i20 = i33;
                        }
                        int dp11 = AndroidUtilities.dp(7.0f) + i19;
                        i21 = dp8;
                        if (!this.c) {
                            if (z10) {
                                childAt2.setTranslationX(AndroidUtilities.dp(7.0f) + i20);
                                childAt2.setTranslationY(dp10);
                            } else if (arrayList2.isEmpty()) {
                                childAt2.setTranslationX(dp11);
                                childAt2.setTranslationY(i30);
                            } else {
                                float f17 = dp11;
                                if (childAt2.getTranslationX() != f17) {
                                    arrayList.add(ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property, f17));
                                }
                                float f18 = i30;
                                if (childAt2.getTranslationY() != f18) {
                                    arrayList.add(ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property2, f18));
                                }
                            }
                        }
                        if (z10) {
                            f10 = 4.0f;
                        } else {
                            f10 = 4.0f;
                            i19 = y1.C(4.0f, childAt2.getMeasuredWidth(), i19);
                        }
                        i33 = y1.C(f10, childAt2.getMeasuredWidth(), i20);
                        i32 = i19;
                    } else {
                        z8Var = z8Var2;
                        i18 = childCount2;
                        i21 = dp8;
                    }
                    i31++;
                    z8Var2 = z8Var;
                    childCount2 = i18;
                    dp8 = i21;
                }
                z8 z8Var3 = z8Var2;
                int i34 = dp8;
                if (AndroidUtilities.isTablet()) {
                    x10 = AndroidUtilities.dp(394.0f) / 3;
                } else {
                    Point point2 = AndroidUtilities.displaySize;
                    x10 = rl.x(136.0f, Math.min(point2.x, point2.y), 3);
                }
                if (i34 - i32 < x10) {
                    i30 += AndroidUtilities.dp(36.0f);
                    i32 = 0;
                }
                if (i34 - i33 < x10) {
                    dp10 += AndroidUtilities.dp(36.0f);
                }
                gVar2.measure(View.MeasureSpec.makeMeasureSpec(i34 - i32, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                gVar2.setHintVisible(gVar2.getMeasuredWidth() > n9Var.b, true);
                if (!this.c) {
                    int dp12 = AndroidUtilities.dp(38.0f) + dp10;
                    int dp13 = AndroidUtilities.dp(16.0f) + i32;
                    n9Var.D = i30;
                    if (this.b != null) {
                        int dp14 = AndroidUtilities.dp(38.0f) + i30;
                        n9Var.F = dp14;
                        float f19 = n9Var.E;
                        float f20 = dp14;
                        if (f19 != f20) {
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f19, f20);
                            ofFloat2.addUpdateListener(new m2(n9Var, 9));
                            arrayList.add(ofFloat2);
                        }
                        float f21 = dp13;
                        if (gVar2.getTranslationX() != f21) {
                            arrayList.add(ObjectAnimator.ofFloat(gVar2, (Property<g, Float>) property, f21));
                        }
                        float translationY2 = gVar2.getTranslationY();
                        float f22 = n9Var.D;
                        if (translationY2 != f22) {
                            arrayList.add(ObjectAnimator.ofFloat(gVar2, (Property<g, Float>) property2, f22));
                        }
                        gVar2.setAllowDrawCursor(false);
                        this.b.playTogether(arrayList);
                        this.b.setDuration(180L);
                        this.b.setInterpolator(new LinearInterpolator());
                        this.b.start();
                        this.c = true;
                        if (z8Var3 != null) {
                            z8Var3.run();
                        }
                    } else {
                        n9Var.F = dp12;
                        n9Var.E = dp12;
                        gVar2.setTranslationX(dp13);
                        gVar2.setTranslationY(n9Var.D);
                        if (z8Var3 != null) {
                            z8Var3.run();
                        }
                        if (n9Var.G) {
                            post(new kh.c(this, 19));
                            n9Var.G = false;
                        }
                    }
                } else if (this.b != null) {
                    if (!n9Var.C && arrayList2.isEmpty()) {
                        gVar2.bringPointIntoView(gVar2.getSelectionStart());
                    }
                    if (n9Var.G) {
                        n9Var.fullScroll(130);
                        n9Var.G = false;
                    }
                }
                setMeasuredDimension(size2, (int) n9Var.E);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n9 n9Var, Context context) {
        super(context);
        this.n = n9Var;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
    }
}
