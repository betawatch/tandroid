package fg;

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
import kh.c9;
import kh.f1;
import kh.g4;
import kh.p9;
import kh.q9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.l0;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.w20;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l extends ViewGroup {
    public final /* synthetic */ int a = 0;
    public AnimatorSet b;
    public boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public final /* synthetic */ ScrollView n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context) {
        super(context);
        this.n = mVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
    }

    public void a() {
        q9 q9Var = (q9) this.n;
        int i9 = 1;
        q9Var.C = true;
        ArrayList arrayList = q9Var.d;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((w20) arrayList2.get(i10)).setOnClickListener(null);
        }
        c();
        this.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.addListener(new p9(this, arrayList2, i9));
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        ArrayList arrayList5 = this.d;
        arrayList5.clear();
        this.e.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            w20 w20Var = (w20) arrayList2.get(i11);
            arrayList5.add(w20Var);
            arrayList4.add(ObjectAnimator.ofFloat(w20Var, (Property<w20, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(w20Var, (Property<w20, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList4.add(ObjectAnimator.ofFloat(w20Var, (Property<w20, Float>) View.ALPHA, 1.0f, 0.0f));
        }
        requestLayout();
    }

    public void b(boolean z10) {
        m mVar = (m) this.n;
        int i9 = 1;
        mVar.C = true;
        ArrayList arrayList = mVar.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList.clear();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((w20) arrayList2.get(i10)).setOnClickListener(null);
        }
        c();
        if (z10) {
            this.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.b = animatorSet;
            animatorSet.addListener(new k(this, arrayList2, i9));
            ArrayList arrayList4 = this.f;
            arrayList4.clear();
            ArrayList arrayList5 = this.d;
            arrayList5.clear();
            this.e.clear();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                w20 w20Var = (w20) arrayList2.get(i11);
                arrayList5.add(w20Var);
                arrayList4.add(ObjectAnimator.ofFloat(w20Var, (Property<w20, Float>) View.SCALE_X, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(w20Var, (Property<w20, Float>) View.SCALE_Y, 1.0f, 0.01f));
                arrayList4.add(ObjectAnimator.ofFloat(w20Var, (Property<w20, Float>) View.ALPHA, 1.0f, 0.0f));
            }
        } else {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                removeView((View) arrayList2.get(i12));
            }
            arrayList3.clear();
            this.b = null;
            this.c = false;
            mVar.b.setAllowDrawCursor(true);
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
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i10 >= arrayList.size()) {
                        while (true) {
                            ArrayList arrayList2 = this.e;
                            if (i9 >= arrayList2.size()) {
                                arrayList.clear();
                                arrayList2.clear();
                                break;
                            } else {
                                ((View) arrayList2.get(i9)).setScaleX(0.0f);
                                ((View) arrayList2.get(i9)).setScaleY(0.0f);
                                ((View) arrayList2.get(i9)).setAlpha(0.0f);
                                i9++;
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
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
    /* JADX WARN: Removed duplicated region for block: B:119:0x0341  */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i9, int i10) {
        int y10;
        int i11;
        int i12;
        ?? r72;
        int i13;
        int i14;
        int i15;
        int i16;
        char c10;
        int y11;
        c9 c9Var;
        int i17;
        int i18;
        boolean z10;
        int i19;
        int i20;
        float f10;
        int i21 = this.a;
        ScrollView scrollView = this.n;
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = this.h;
        Property property = View.TRANSLATION_X;
        Property property2 = View.TRANSLATION_Y;
        switch (i21) {
            case 0:
                m mVar = (m) scrollView;
                g gVar = mVar.b;
                int childCount = getChildCount();
                int size = View.MeasureSpec.getSize(i9);
                int dp = size - AndroidUtilities.dp(28.0f);
                int dp2 = AndroidUtilities.dp(10.0f);
                int dp3 = AndroidUtilities.dp(10.0f);
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i22 < childCount) {
                    View childAt = getChildAt(i22);
                    int i25 = childCount;
                    if (childAt instanceof w20) {
                        i13 = i22;
                        int i26 = i23;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                        boolean contains = arrayList2.contains(childAt);
                        if (contains || childAt.getMeasuredWidth() + i26 <= dp) {
                            i14 = i26;
                        } else {
                            dp2 = l0.C(4.0f, childAt.getMeasuredHeight(), dp2);
                            i14 = 0;
                        }
                        if (childAt.getMeasuredWidth() + i24 > dp) {
                            dp3 = l0.C(4.0f, childAt.getMeasuredHeight(), dp3);
                            i24 = 0;
                        }
                        int dp4 = AndroidUtilities.dp(14.0f) + i14;
                        if (!this.c) {
                            if (contains) {
                                childAt.setTranslationX(AndroidUtilities.dp(14.0f) + i24);
                                childAt.setTranslationY(dp3);
                            } else {
                                if (arrayList2.isEmpty()) {
                                    i15 = dp;
                                    childAt.setTranslationX(dp4);
                                    childAt.setTranslationY(dp2);
                                } else {
                                    float f11 = dp4;
                                    i15 = dp;
                                    if (childAt.getTranslationX() != f11) {
                                        i16 = 1;
                                        c10 = 0;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, f11));
                                    } else {
                                        i16 = 1;
                                        c10 = 0;
                                    }
                                    float f12 = dp2;
                                    if (childAt.getTranslationY() != f12) {
                                        float[] fArr = new float[i16];
                                        fArr[c10] = f12;
                                        arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, fArr));
                                    }
                                }
                                if (!contains) {
                                    i14 = l0.C(6.0f, childAt.getMeasuredWidth(), i14);
                                }
                                i24 = l0.C(6.0f, childAt.getMeasuredWidth(), i24);
                                i23 = i14;
                            }
                        }
                        i15 = dp;
                        if (!contains) {
                        }
                        i24 = l0.C(6.0f, childAt.getMeasuredWidth(), i24);
                        i23 = i14;
                    } else {
                        i15 = dp;
                        i13 = i22;
                    }
                    i22 = i13 + 1;
                    childCount = i25;
                    dp = i15;
                }
                int i27 = dp;
                int i28 = i23;
                if (AndroidUtilities.isTablet()) {
                    y10 = AndroidUtilities.dp(376.0f) / 3;
                } else {
                    Point point = AndroidUtilities.displaySize;
                    y10 = ll.y(154.0f, Math.min(point.x, point.y), 3);
                }
                if (i27 - i28 < y10) {
                    dp2 += AndroidUtilities.dp(36.0f);
                    i11 = 0;
                } else {
                    i11 = i28;
                }
                if (i27 - i24 < y10) {
                    dp3 += AndroidUtilities.dp(36.0f);
                }
                gVar.measure(View.MeasureSpec.makeMeasureSpec(i27 - i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                gVar.setHintVisible(gVar.getMeasuredWidth() > mVar.c, true);
                if (!this.c) {
                    int dp5 = AndroidUtilities.dp(38.0f) + dp3;
                    int dp6 = AndroidUtilities.dp(16.0f) + i11;
                    mVar.D = dp2;
                    if (this.b != null) {
                        int dp7 = AndroidUtilities.dp(38.0f) + dp2;
                        float f13 = mVar.E;
                        float f14 = dp7;
                        if (f13 != f14) {
                            i12 = 1;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f14);
                            ofFloat.addUpdateListener(new bg.b(mVar, i12));
                            arrayList.add(ofFloat);
                        } else {
                            i12 = 1;
                        }
                        float f15 = dp6;
                        if (gVar.getTranslationX() != f15) {
                            float[] fArr2 = new float[i12];
                            r72 = 0;
                            fArr2[0] = f15;
                            arrayList.add(ObjectAnimator.ofFloat(gVar, (Property<g, Float>) property, fArr2));
                        } else {
                            r72 = 0;
                        }
                        float translationY = gVar.getTranslationY();
                        float f16 = mVar.D;
                        if (translationY != f16) {
                            float[] fArr3 = new float[i12];
                            fArr3[r72] = f16;
                            arrayList.add(ObjectAnimator.ofFloat(gVar, (Property<g, Float>) property2, fArr3));
                        }
                        gVar.setAllowDrawCursor(r72);
                        this.b.playTogether(arrayList);
                        this.b.setDuration(180L);
                        this.b.setInterpolator(new LinearInterpolator());
                        this.b.start();
                        this.c = true;
                    } else {
                        mVar.E = dp5;
                        gVar.setTranslationX(dp6);
                        gVar.setTranslationY(mVar.D);
                    }
                } else if (this.b != null && !mVar.C && arrayList2.isEmpty()) {
                    gVar.bringPointIntoView(gVar.getSelectionStart());
                }
                setMeasuredDimension(size, (int) mVar.E);
                break;
            default:
                q9 q9Var = (q9) scrollView;
                c9 c9Var2 = q9Var.f;
                g gVar2 = q9Var.a;
                int childCount2 = getChildCount();
                int size2 = View.MeasureSpec.getSize(i9);
                int dp8 = size2 - AndroidUtilities.dp(14.0f);
                int dp9 = AndroidUtilities.dp(10.0f);
                int dp10 = AndroidUtilities.dp(10.0f);
                int i29 = dp9;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                while (i30 < childCount2) {
                    View childAt2 = getChildAt(i30);
                    if (childAt2 instanceof w20) {
                        c9Var = c9Var2;
                        i17 = childCount2;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                        boolean contains2 = arrayList2.contains(childAt2);
                        if (contains2 || childAt2.getMeasuredWidth() + i31 <= dp8) {
                            i18 = i31;
                        } else {
                            i29 = l0.C(4.0f, childAt2.getMeasuredHeight(), i29);
                            i18 = 0;
                        }
                        if (childAt2.getMeasuredWidth() + i32 > dp8) {
                            z10 = contains2;
                            dp10 = l0.C(4.0f, childAt2.getMeasuredHeight(), dp10);
                            i19 = 0;
                        } else {
                            z10 = contains2;
                            i19 = i32;
                        }
                        int dp11 = AndroidUtilities.dp(7.0f) + i18;
                        i20 = dp8;
                        if (!this.c) {
                            if (z10) {
                                childAt2.setTranslationX(AndroidUtilities.dp(7.0f) + i19);
                                childAt2.setTranslationY(dp10);
                            } else if (arrayList2.isEmpty()) {
                                childAt2.setTranslationX(dp11);
                                childAt2.setTranslationY(i29);
                            } else {
                                float f17 = dp11;
                                if (childAt2.getTranslationX() != f17) {
                                    arrayList.add(ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property, f17));
                                }
                                float f18 = i29;
                                if (childAt2.getTranslationY() != f18) {
                                    arrayList.add(ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) property2, f18));
                                }
                            }
                        }
                        if (z10) {
                            f10 = 4.0f;
                        } else {
                            f10 = 4.0f;
                            i18 = l0.C(4.0f, childAt2.getMeasuredWidth(), i18);
                        }
                        i32 = l0.C(f10, childAt2.getMeasuredWidth(), i19);
                        i31 = i18;
                    } else {
                        c9Var = c9Var2;
                        i17 = childCount2;
                        i20 = dp8;
                    }
                    i30++;
                    c9Var2 = c9Var;
                    childCount2 = i17;
                    dp8 = i20;
                }
                c9 c9Var3 = c9Var2;
                int i33 = dp8;
                if (AndroidUtilities.isTablet()) {
                    y11 = AndroidUtilities.dp(394.0f) / 3;
                } else {
                    Point point2 = AndroidUtilities.displaySize;
                    y11 = ll.y(136.0f, Math.min(point2.x, point2.y), 3);
                }
                if (i33 - i31 < y11) {
                    i29 += AndroidUtilities.dp(36.0f);
                    i31 = 0;
                }
                if (i33 - i32 < y11) {
                    dp10 += AndroidUtilities.dp(36.0f);
                }
                gVar2.measure(View.MeasureSpec.makeMeasureSpec(i33 - i31, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                gVar2.setHintVisible(gVar2.getMeasuredWidth() > q9Var.b, true);
                if (!this.c) {
                    int dp12 = AndroidUtilities.dp(38.0f) + dp10;
                    int dp13 = AndroidUtilities.dp(16.0f) + i31;
                    q9Var.D = i29;
                    if (this.b != null) {
                        int dp14 = AndroidUtilities.dp(38.0f) + i29;
                        q9Var.F = dp14;
                        float f19 = q9Var.E;
                        float f20 = dp14;
                        if (f19 != f20) {
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f19, f20);
                            ofFloat2.addUpdateListener(new g4(q9Var, 6));
                            arrayList.add(ofFloat2);
                        }
                        float f21 = dp13;
                        if (gVar2.getTranslationX() != f21) {
                            arrayList.add(ObjectAnimator.ofFloat(gVar2, (Property<g, Float>) property, f21));
                        }
                        float translationY2 = gVar2.getTranslationY();
                        float f22 = q9Var.D;
                        if (translationY2 != f22) {
                            arrayList.add(ObjectAnimator.ofFloat(gVar2, (Property<g, Float>) property2, f22));
                        }
                        gVar2.setAllowDrawCursor(false);
                        this.b.playTogether(arrayList);
                        this.b.setDuration(180L);
                        this.b.setInterpolator(new LinearInterpolator());
                        this.b.start();
                        this.c = true;
                        if (c9Var3 != null) {
                            c9Var3.run();
                        }
                    } else {
                        q9Var.F = dp12;
                        q9Var.E = dp12;
                        gVar2.setTranslationX(dp13);
                        gVar2.setTranslationY(q9Var.D);
                        if (c9Var3 != null) {
                            c9Var3.run();
                        }
                        if (q9Var.G) {
                            post(new f1(this, 12));
                            q9Var.G = false;
                        }
                    }
                } else if (this.b != null) {
                    if (!q9Var.C && arrayList2.isEmpty()) {
                        gVar2.bringPointIntoView(gVar2.getSelectionStart());
                    }
                    if (q9Var.G) {
                        q9Var.fullScroll(130);
                        q9Var.G = false;
                    }
                }
                setMeasuredDimension(size2, (int) q9Var.E);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q9 q9Var, Context context) {
        super(context);
        this.n = q9Var;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
    }
}
