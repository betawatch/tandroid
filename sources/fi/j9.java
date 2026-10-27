package fi;

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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.x30;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class j9 extends ViewGroup {
    public final /* synthetic */ int a = 0;
    public AnimatorSet b;
    public boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public final /* synthetic */ ScrollView n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(zg.i iVar, Context context) {
        super(context);
        this.n = iVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
    }

    public void a() {
        k9 k9Var = (k9) this.n;
        int i10 = 1;
        k9Var.H = true;
        ArrayList arrayList = k9Var.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((x30) arrayList2.get(i11)).setOnClickListener(null);
        }
        c();
        this.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.addListener(new i9(this, arrayList2, i10));
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        ArrayList arrayList5 = this.d;
        arrayList5.clear();
        this.e.clear();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            x30 x30Var = (x30) arrayList2.get(i12);
            arrayList5.add(x30Var);
            arrayList4.add(ObjectAnimator.ofFloat(x30Var, (Property<x30, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(x30Var, (Property<x30, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(x30Var, (Property<x30, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        requestLayout();
    }

    public void b(boolean z10) {
        zg.i iVar = (zg.i) this.n;
        int i10 = 1;
        iVar.H = true;
        ArrayList arrayList = iVar.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((x30) arrayList2.get(i11)).setOnClickListener(null);
        }
        c();
        if (z10) {
            this.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.b = animatorSet;
            animatorSet.addListener(new zg.h(this, arrayList2, i10));
            ArrayList arrayList4 = this.f;
            arrayList4.clear();
            ArrayList arrayList5 = this.d;
            arrayList5.clear();
            this.e.clear();
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                x30 x30Var = (x30) arrayList2.get(i12);
                arrayList5.add(x30Var);
                arrayList4.add(ObjectAnimator.ofFloat(x30Var, (Property<x30, Float>) View.SCALE_X, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(x30Var, (Property<x30, Float>) View.SCALE_Y, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(x30Var, (Property<x30, Float>) View.ALPHA, 1.0f, 0.0f));
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
    /* JADX WARN: Removed duplicated region for block: B:110:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int B;
        int i12;
        ?? r72;
        int i13;
        int i14;
        int i15;
        int i16;
        float f7;
        int i17;
        char c10;
        int B2;
        ?? r73;
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
                k9 k9Var = (k9) scrollView;
                w8 w8Var = k9Var.h;
                c2 c2Var = k9Var.b;
                int childCount = getChildCount();
                int size = View.MeasureSpec.getSize(i10);
                int dp = size - AndroidUtilities.dp(14.0f);
                int dp2 = AndroidUtilities.dp(10.0f);
                int dp3 = AndroidUtilities.dp(10.0f);
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                while (i26 < childCount) {
                    w8 w8Var2 = w8Var;
                    View childAt = getChildAt(i26);
                    int i29 = childCount;
                    if (childAt instanceof x30) {
                        i14 = i26;
                        int i30 = i27;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                        boolean contains = arrayList2.contains(childAt);
                        if (contains || childAt.getMeasuredWidth() + i30 <= dp) {
                            i15 = i30;
                        } else {
                            dp2 = org.telegram.messenger.t.D(4.0f, childAt.getMeasuredHeight(), dp2);
                            i15 = 0;
                        }
                        if (childAt.getMeasuredWidth() + i28 > dp) {
                            dp3 = org.telegram.messenger.t.D(4.0f, childAt.getMeasuredHeight(), dp3);
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
                                    i15 = org.telegram.messenger.t.D(4.0f, childAt.getMeasuredWidth(), i15);
                                } else {
                                    f7 = 4.0f;
                                }
                                i28 = org.telegram.messenger.t.D(f7, childAt.getMeasuredWidth(), i28);
                            }
                        }
                        i16 = dp;
                        if (contains) {
                        }
                        i28 = org.telegram.messenger.t.D(f7, childAt.getMeasuredWidth(), i28);
                    } else {
                        i16 = dp;
                        i14 = i26;
                        i15 = i27;
                    }
                    i27 = i15;
                    childCount = i29;
                    dp = i16;
                    i26 = i14 + 1;
                    w8Var = w8Var2;
                }
                w8 w8Var3 = w8Var;
                int i31 = dp;
                int i32 = i27;
                if (AndroidUtilities.isTablet()) {
                    B = AndroidUtilities.dp(394.0f) / 3;
                } else {
                    Point point = AndroidUtilities.displaySize;
                    B = wh.B(136.0f, Math.min(point.x, point.y), 3);
                }
                if (i31 - i32 < B) {
                    dp2 += AndroidUtilities.dp(36.0f);
                    i12 = 0;
                } else {
                    i12 = i32;
                }
                if (i31 - i28 < B) {
                    dp3 += AndroidUtilities.dp(36.0f);
                }
                c2Var.measure(View.MeasureSpec.makeMeasureSpec(i31 - i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                c2Var.setHintVisible(c2Var.getMeasuredWidth() > k9Var.c, true);
                if (!this.c) {
                    int dp5 = AndroidUtilities.dp(38.0f) + dp3;
                    int dp6 = AndroidUtilities.dp(16.0f) + i12;
                    k9Var.I = dp2;
                    if (this.b != null) {
                        int dp7 = AndroidUtilities.dp(38.0f) + dp2;
                        k9Var.K = dp7;
                        float f12 = k9Var.J;
                        float f13 = dp7;
                        if (f12 != f13) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f13);
                            ofFloat.addUpdateListener(new e4(k9Var, 6));
                            arrayList.add(ofFloat);
                        }
                        float f14 = dp6;
                        if (c2Var.getTranslationX() != f14) {
                            i13 = 1;
                            r72 = 0;
                            arrayList.add(ObjectAnimator.ofFloat(c2Var, (Property<c2, Float>) property, f14));
                        } else {
                            r72 = 0;
                            i13 = 1;
                        }
                        float translationY = c2Var.getTranslationY();
                        float f15 = k9Var.I;
                        if (translationY != f15) {
                            float[] fArr2 = new float[i13];
                            fArr2[r72] = f15;
                            arrayList.add(ObjectAnimator.ofFloat(c2Var, (Property<c2, Float>) property2, fArr2));
                        }
                        c2Var.setAllowDrawCursor(r72);
                        this.b.playTogether(arrayList);
                        this.b.setDuration(180L);
                        this.b.setInterpolator(new LinearInterpolator());
                        this.b.start();
                        this.c = true;
                        if (w8Var3 != null) {
                            w8Var3.run();
                        }
                    } else {
                        k9Var.K = dp5;
                        k9Var.J = dp5;
                        c2Var.setTranslationX(dp6);
                        c2Var.setTranslationY(k9Var.I);
                        if (w8Var3 != null) {
                            w8Var3.run();
                        }
                        if (k9Var.L) {
                            post(new di.s8(this, 26));
                            k9Var.L = false;
                        }
                    }
                } else if (this.b != null) {
                    if (!k9Var.H && arrayList2.isEmpty()) {
                        c2Var.bringPointIntoView(c2Var.getSelectionStart());
                    }
                    if (k9Var.L) {
                        k9Var.fullScroll(130);
                        k9Var.L = false;
                    }
                }
                setMeasuredDimension(size, (int) k9Var.J);
                break;
            default:
                zg.i iVar = (zg.i) scrollView;
                c2 c2Var2 = iVar.b;
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
                    if (childAt2 instanceof x30) {
                        i18 = childCount2;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(size2, i25), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                        boolean contains2 = arrayList2.contains(childAt2);
                        if (contains2 || childAt2.getMeasuredWidth() + i35 <= dp8) {
                            i19 = i35;
                        } else {
                            i33 = org.telegram.messenger.t.D(4.0f, childAt2.getMeasuredHeight(), i33);
                            i19 = 0;
                        }
                        if (childAt2.getMeasuredWidth() + i36 > dp8) {
                            z10 = contains2;
                            dp10 = org.telegram.messenger.t.D(4.0f, childAt2.getMeasuredHeight(), dp10);
                            i20 = 0;
                        } else {
                            z10 = contains2;
                            i20 = i36;
                        }
                        int dp11 = AndroidUtilities.dp(14.0f) + i19;
                        i21 = i34;
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
                                    i19 = org.telegram.messenger.t.D(6.0f, childAt2.getMeasuredWidth(), i19);
                                }
                                i36 = org.telegram.messenger.t.D(6.0f, childAt2.getMeasuredWidth(), i20);
                                dp10 = i22;
                                i35 = i19;
                            }
                        }
                        i22 = dp10;
                        if (!z10) {
                        }
                        i36 = org.telegram.messenger.t.D(6.0f, childAt2.getMeasuredWidth(), i20);
                        dp10 = i22;
                        i35 = i19;
                    } else {
                        i18 = childCount2;
                        i21 = i34;
                    }
                    i34 = i21 + 1;
                    childCount2 = i18;
                    i25 = TLObject.FLAG_31;
                }
                if (AndroidUtilities.isTablet()) {
                    B2 = AndroidUtilities.dp(376.0f) / 3;
                } else {
                    Point point2 = AndroidUtilities.displaySize;
                    B2 = wh.B(154.0f, Math.min(point2.x, point2.y), 3);
                }
                if (dp8 - i35 < B2) {
                    i33 += AndroidUtilities.dp(36.0f);
                    i35 = 0;
                }
                if (dp8 - i36 < B2) {
                    dp10 += AndroidUtilities.dp(36.0f);
                }
                c2Var2.measure(View.MeasureSpec.makeMeasureSpec(dp8 - i35, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                c2Var2.setHintVisible(c2Var2.getMeasuredWidth() > iVar.c, true);
                if (!this.c) {
                    int dp12 = AndroidUtilities.dp(38.0f) + dp10;
                    int dp13 = AndroidUtilities.dp(16.0f) + i35;
                    iVar.I = i33;
                    if (this.b != null) {
                        int dp14 = AndroidUtilities.dp(38.0f) + i33;
                        float f18 = iVar.J;
                        float f19 = dp14;
                        if (f18 != f19) {
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f18, f19);
                            boolean z11 = false;
                            ofFloat2.addUpdateListener(new zg.e(z11 ? 1 : 0, iVar));
                            arrayList.add(ofFloat2);
                            r73 = z11;
                        } else {
                            r73 = 0;
                        }
                        float f20 = dp13;
                        if (c2Var2.getTranslationX() != f20) {
                            float[] fArr4 = new float[1];
                            fArr4[r73] = f20;
                            arrayList.add(ObjectAnimator.ofFloat(c2Var2, (Property<c2, Float>) property, fArr4));
                        }
                        float translationY2 = c2Var2.getTranslationY();
                        float f21 = iVar.I;
                        if (translationY2 != f21) {
                            float[] fArr5 = new float[1];
                            fArr5[r73] = f21;
                            arrayList.add(ObjectAnimator.ofFloat(c2Var2, (Property<c2, Float>) property2, fArr5));
                        }
                        c2Var2.setAllowDrawCursor(r73);
                        this.b.playTogether(arrayList);
                        this.b.setDuration(180L);
                        this.b.setInterpolator(new LinearInterpolator());
                        this.b.start();
                        this.c = true;
                    } else {
                        iVar.J = dp12;
                        c2Var2.setTranslationX(dp13);
                        c2Var2.setTranslationY(iVar.I);
                    }
                } else if (this.b != null && !iVar.H && arrayList2.isEmpty()) {
                    c2Var2.bringPointIntoView(c2Var2.getSelectionStart());
                }
                setMeasuredDimension(size2, (int) iVar.J);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(k9 k9Var, Context context) {
        super(context);
        this.n = k9Var;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
    }
}
