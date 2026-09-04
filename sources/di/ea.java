package di;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.m30;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class ea extends ViewGroup {
    public final /* synthetic */ int a = 0;
    public AnimatorSet b;
    public boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public final /* synthetic */ ScrollView n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(yg.i iVar, Context context) {
        super(context);
        this.n = iVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
    }

    public void a() {
        fa faVar = (fa) this.n;
        int i10 = 1;
        faVar.G = true;
        ArrayList arrayList = faVar.d;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((m30) arrayList2.get(i11)).setOnClickListener(null);
        }
        c();
        this.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.addListener(new da(this, arrayList2, i10));
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        ArrayList arrayList5 = this.d;
        arrayList5.clear();
        this.e.clear();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            m30 m30Var = (m30) arrayList2.get(i12);
            arrayList5.add(m30Var);
            arrayList4.add(ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        requestLayout();
    }

    public void b(boolean z10) {
        yg.i iVar = (yg.i) this.n;
        int i10 = 1;
        iVar.G = true;
        ArrayList arrayList = iVar.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((m30) arrayList2.get(i11)).setOnClickListener(null);
        }
        c();
        if (z10) {
            this.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.b = animatorSet;
            animatorSet.addListener(new yg.h(this, arrayList2, i10));
            ArrayList arrayList4 = this.f;
            arrayList4.clear();
            ArrayList arrayList5 = this.d;
            arrayList5.clear();
            this.e.clear();
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                m30 m30Var = (m30) arrayList2.get(i12);
                arrayList5.add(m30Var);
                arrayList4.add(ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) View.SCALE_X, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) View.SCALE_Y, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(m30Var, (Property<m30, Float>) View.ALPHA, 1.0f, 0.0f));
            }
        } else {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                removeView((View) arrayList2.get(i13));
            }
            arrayList3.clear();
            this.b = null;
            this.c = false;
            iVar.b.setAllowDrawCursor(true);
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
    /* JADX WARN: Removed duplicated region for block: B:109:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int y3;
        int i12;
        ?? r62;
        int i13;
        int i14;
        int i15;
        int i16;
        float f7;
        int i17;
        char c10;
        int y10;
        int i18;
        int i19;
        boolean z10;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = this.a;
        int i25 = TLObject.FLAG_31;
        ScrollView scrollView = this.n;
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = this.h;
        Property property = View.TRANSLATION_X;
        Property property2 = View.TRANSLATION_Y;
        switch (i24) {
            case 0:
                fa faVar = (fa) scrollView;
                o9 o9Var = faVar.f;
                h2 h2Var = faVar.a;
                int childCount = getChildCount();
                int size = View.MeasureSpec.getSize(i10);
                int dp = size - AndroidUtilities.dp(14.0f);
                int dp2 = AndroidUtilities.dp(10.0f);
                int dp3 = AndroidUtilities.dp(10.0f);
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                while (i26 < childCount) {
                    o9 o9Var2 = o9Var;
                    View childAt = getChildAt(i26);
                    int i29 = childCount;
                    if (childAt instanceof m30) {
                        i14 = i26;
                        int i30 = i27;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                        boolean contains = arrayList2.contains(childAt);
                        if (contains || childAt.getMeasuredWidth() + i30 <= dp) {
                            i15 = i30;
                        } else {
                            dp2 = org.telegram.messenger.w1.C(4.0f, childAt.getMeasuredHeight(), dp2);
                            i15 = 0;
                        }
                        if (childAt.getMeasuredWidth() + i28 > dp) {
                            dp3 = org.telegram.messenger.w1.C(4.0f, childAt.getMeasuredHeight(), dp3);
                            i28 = 0;
                        }
                        int dp4 = AndroidUtilities.dp(7.0f) + i15;
                        if (!this.c) {
                            if (contains) {
                                childAt.setTranslationX(AndroidUtilities.dp(7.0f) + i28);
                                childAt.setTranslationY(dp3);
                            } else {
                                if (arrayList2.isEmpty()) {
                                    i16 = dp;
                                    childAt.setTranslationX(dp4);
                                    childAt.setTranslationY(dp2);
                                } else {
                                    float f10 = dp4;
                                    i16 = dp;
                                    if (childAt.getTranslationX() != f10) {
                                        i17 = 1;
                                        c10 = 0;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, f10));
                                    } else {
                                        i17 = 1;
                                        c10 = 0;
                                    }
                                    float f11 = dp2;
                                    if (childAt.getTranslationY() != f11) {
                                        float[] fArr = new float[i17];
                                        fArr[c10] = f11;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, fArr));
                                    }
                                }
                                if (contains) {
                                    f7 = 4.0f;
                                    i15 = org.telegram.messenger.w1.C(4.0f, childAt.getMeasuredWidth(), i15);
                                } else {
                                    f7 = 4.0f;
                                }
                                i28 = org.telegram.messenger.w1.C(f7, childAt.getMeasuredWidth(), i28);
                            }
                        }
                        i16 = dp;
                        if (contains) {
                        }
                        i28 = org.telegram.messenger.w1.C(f7, childAt.getMeasuredWidth(), i28);
                    } else {
                        i16 = dp;
                        i14 = i26;
                        i15 = i27;
                    }
                    i27 = i15;
                    childCount = i29;
                    dp = i16;
                    i26 = i14 + 1;
                    o9Var = o9Var2;
                }
                o9 o9Var3 = o9Var;
                int i31 = dp;
                int i32 = i27;
                if (AndroidUtilities.isTablet()) {
                    y3 = AndroidUtilities.dp(394.0f) / 3;
                } else {
                    Point point = AndroidUtilities.displaySize;
                    y3 = wl.y(136.0f, Math.min(point.x, point.y), 3);
                }
                if (i31 - i32 < y3) {
                    dp2 += AndroidUtilities.dp(36.0f);
                    i12 = 0;
                } else {
                    i12 = i32;
                }
                if (i31 - i28 < y3) {
                    dp3 += AndroidUtilities.dp(36.0f);
                }
                h2Var.measure(View.MeasureSpec.makeMeasureSpec(i31 - i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                h2Var.setHintVisible(h2Var.getMeasuredWidth() > faVar.b, true);
                if (!this.c) {
                    int dp5 = AndroidUtilities.dp(38.0f) + dp3;
                    int dp6 = AndroidUtilities.dp(16.0f) + i12;
                    faVar.H = dp2;
                    if (this.b != null) {
                        int dp7 = AndroidUtilities.dp(38.0f) + dp2;
                        faVar.J = dp7;
                        float f12 = faVar.I;
                        float f13 = dp7;
                        if (f12 != f13) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f13);
                            ofFloat.addUpdateListener(new ah.d0(faVar, 27));
                            arrayList.add(ofFloat);
                        }
                        float f14 = dp6;
                        if (h2Var.getTranslationX() != f14) {
                            i13 = 1;
                            r62 = 0;
                            arrayList.add(ObjectAnimator.ofFloat(h2Var, (Property<h2, Float>) property, f14));
                        } else {
                            r62 = 0;
                            i13 = 1;
                        }
                        float translationY = h2Var.getTranslationY();
                        float f15 = faVar.H;
                        if (translationY != f15) {
                            float[] fArr2 = new float[i13];
                            fArr2[r62] = f15;
                            arrayList.add(ObjectAnimator.ofFloat(h2Var, (Property<h2, Float>) property2, fArr2));
                        }
                        h2Var.setAllowDrawCursor(r62);
                        this.b.playTogether(arrayList);
                        this.b.setDuration(180L);
                        this.b.setInterpolator(new LinearInterpolator());
                        this.b.start();
                        this.c = true;
                        if (o9Var3 != null) {
                            o9Var3.run();
                        }
                    } else {
                        faVar.J = dp5;
                        faVar.I = dp5;
                        h2Var.setTranslationX(dp6);
                        h2Var.setTranslationY(faVar.H);
                        if (o9Var3 != null) {
                            o9Var3.run();
                        }
                        if (faVar.K) {
                            post(new bi.oa(this, 28));
                            faVar.K = false;
                        }
                    }
                } else if (this.b != null) {
                    if (!faVar.G && arrayList2.isEmpty()) {
                        h2Var.bringPointIntoView(h2Var.getSelectionStart());
                    }
                    if (faVar.K) {
                        faVar.fullScroll(130);
                        faVar.K = false;
                    }
                }
                setMeasuredDimension(size, (int) faVar.I);
                break;
            default:
                yg.i iVar = (yg.i) scrollView;
                h2 h2Var2 = iVar.b;
                int childCount2 = getChildCount();
                int size2 = View.MeasureSpec.getSize(i10);
                int dp8 = size2 - AndroidUtilities.dp(28.0f);
                int dp9 = AndroidUtilities.dp(10.0f);
                int dp10 = AndroidUtilities.dp(10.0f);
                int i33 = dp9;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                while (i34 < childCount2) {
                    View childAt2 = getChildAt(i34);
                    if (childAt2 instanceof m30) {
                        i18 = childCount2;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(size2, i25), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                        boolean contains2 = arrayList2.contains(childAt2);
                        if (contains2 || childAt2.getMeasuredWidth() + i35 <= dp8) {
                            i19 = i35;
                        } else {
                            i33 = org.telegram.messenger.w1.C(4.0f, childAt2.getMeasuredHeight(), i33);
                            i19 = 0;
                        }
                        if (childAt2.getMeasuredWidth() + i36 > dp8) {
                            z10 = contains2;
                            dp10 = org.telegram.messenger.w1.C(4.0f, childAt2.getMeasuredHeight(), dp10);
                            i20 = 0;
                        } else {
                            z10 = contains2;
                            i20 = i36;
                        }
                        int dp11 = AndroidUtilities.dp(14.0f) + i19;
                        i21 = dp8;
                        if (!this.c) {
                            if (z10) {
                                childAt2.setTranslationX(AndroidUtilities.dp(14.0f) + i20);
                                childAt2.setTranslationY(dp10);
                            } else {
                                if (arrayList2.isEmpty()) {
                                    i22 = dp10;
                                    childAt2.setTranslationX(dp11);
                                    childAt2.setTranslationY(i33);
                                } else {
                                    float f16 = dp11;
                                    i22 = dp10;
                                    if (childAt2.getTranslationX() != f16) {
                                        i23 = 1;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property, f16));
                                    } else {
                                        i23 = 1;
                                    }
                                    float f17 = i33;
                                    if (childAt2.getTranslationY() != f17) {
                                        float[] fArr3 = new float[i23];
                                        fArr3[0] = f17;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property2, fArr3));
                                    }
                                }
                                if (!z10) {
                                    i19 = org.telegram.messenger.w1.C(6.0f, childAt2.getMeasuredWidth(), i19);
                                }
                                i36 = org.telegram.messenger.w1.C(6.0f, childAt2.getMeasuredWidth(), i20);
                                dp10 = i22;
                                i35 = i19;
                            }
                        }
                        i22 = dp10;
                        if (!z10) {
                        }
                        i36 = org.telegram.messenger.w1.C(6.0f, childAt2.getMeasuredWidth(), i20);
                        dp10 = i22;
                        i35 = i19;
                    } else {
                        i18 = childCount2;
                        i21 = dp8;
                    }
                    i34++;
                    childCount2 = i18;
                    dp8 = i21;
                    i25 = TLObject.FLAG_31;
                }
                int i37 = dp8;
                if (AndroidUtilities.isTablet()) {
                    y10 = AndroidUtilities.dp(376.0f) / 3;
                } else {
                    Point point2 = AndroidUtilities.displaySize;
                    y10 = wl.y(154.0f, Math.min(point2.x, point2.y), 3);
                }
                if (i37 - i35 < y10) {
                    i33 += AndroidUtilities.dp(36.0f);
                    i35 = 0;
                }
                if (i37 - i36 < y10) {
                    dp10 += AndroidUtilities.dp(36.0f);
                }
                h2Var2.measure(View.MeasureSpec.makeMeasureSpec(i37 - i35, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                h2Var2.setHintVisible(h2Var2.getMeasuredWidth() > iVar.c, true);
                if (!this.c) {
                    int dp12 = AndroidUtilities.dp(38.0f) + dp10;
                    int dp13 = AndroidUtilities.dp(16.0f) + i35;
                    iVar.H = i33;
                    if (this.b != null) {
                        int dp14 = AndroidUtilities.dp(38.0f) + i33;
                        float f18 = iVar.I;
                        float f19 = dp14;
                        if (f18 != f19) {
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f18, f19);
                            ofFloat2.addUpdateListener(new ki.a(iVar, 20));
                            arrayList.add(ofFloat2);
                        }
                        float f20 = dp13;
                        if (h2Var2.getTranslationX() != f20) {
                            arrayList.add(ObjectAnimator.ofFloat(h2Var2, (Property<h2, Float>) property, f20));
                        }
                        float translationY2 = h2Var2.getTranslationY();
                        float f21 = iVar.H;
                        if (translationY2 != f21) {
                            arrayList.add(ObjectAnimator.ofFloat(h2Var2, (Property<h2, Float>) property2, f21));
                        }
                        h2Var2.setAllowDrawCursor(false);
                        this.b.playTogether(arrayList);
                        this.b.setDuration(180L);
                        this.b.setInterpolator(new LinearInterpolator());
                        this.b.start();
                        this.c = true;
                    } else {
                        iVar.I = dp12;
                        h2Var2.setTranslationX(dp13);
                        h2Var2.setTranslationY(iVar.H);
                    }
                } else if (this.b != null && !iVar.G && arrayList2.isEmpty()) {
                    h2Var2.bringPointIntoView(h2Var2.getSelectionStart());
                }
                setMeasuredDimension(size2, (int) iVar.I);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(fa faVar, Context context) {
        super(context);
        this.n = faVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
    }
}
