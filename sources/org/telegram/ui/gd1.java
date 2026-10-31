package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gd1 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public org.telegram.ui.Components.s20 d;
    public org.telegram.ui.Components.s20 e;
    public final /* synthetic */ UsersSelectActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd1(UsersSelectActivity usersSelectActivity, Context context) {
        super(context);
        this.f = usersSelectActivity;
        this.c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.s20 s20Var, boolean z10) {
        UsersSelectActivity usersSelectActivity = this.f;
        usersSelectActivity.O.add(s20Var);
        long uid = s20Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.x++;
        }
        usersSelectActivity.N.k(s20Var, uid);
        org.telegram.ui.ActionBar.n0 n0Var = usersSelectActivity.c;
        n0Var.t(false, TextUtils.isEmpty(n0Var.getText()));
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.a.setupEndValues();
            this.a.cancel();
        }
        this.b = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.a = animatorSet2;
            animatorSet2.addListener(new ns0(this, 14));
            this.a.setDuration(150L);
            this.d = s20Var;
            ArrayList arrayList = this.c;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.Components.s20, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.Components.s20, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.Components.s20, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(s20Var);
    }

    public final void b(org.telegram.ui.Components.s20 s20Var) {
        UsersSelectActivity usersSelectActivity = this.f;
        usersSelectActivity.w = true;
        long uid = s20Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.x--;
        }
        usersSelectActivity.N.l(uid);
        usersSelectActivity.O.remove(s20Var);
        s20Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            this.a.cancel();
        }
        this.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.iw0(11, (Object) this, (Object) s20Var));
        this.a.setDuration(150L);
        this.e = s20Var;
        ArrayList arrayList = this.c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.s20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.s20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.s20, Float>) View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        Property property;
        Property property2;
        ArrayList arrayList;
        int y3;
        int i12;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int L = size - org.telegram.messenger.i0.L(26.0f);
        int L2 = org.telegram.messenger.i0.L(10.0f);
        int L3 = org.telegram.messenger.i0.L(10.0f);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            property = View.TRANSLATION_Y;
            property2 = View.TRANSLATION_X;
            arrayList = this.c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Components.s20) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30));
                if (childAt != this.e && childAt.getMeasuredWidth() + i14 > L) {
                    L2 = org.telegram.messenger.m5.C(8.0f, childAt.getMeasuredHeight(), L2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > L) {
                    L3 = org.telegram.messenger.m5.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i15 = 0;
                }
                int L4 = org.telegram.messenger.i0.L(13.0f) + i14;
                if (!this.b) {
                    org.telegram.ui.Components.s20 s20Var = this.e;
                    if (childAt == s20Var) {
                        childAt.setTranslationX(org.telegram.messenger.i0.L(13.0f) + i15);
                        childAt.setTranslationY(L3);
                    } else if (s20Var != null) {
                        float f7 = L4;
                        if (childAt.getTranslationX() != f7) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, f7));
                        } else {
                            i12 = 1;
                        }
                        float f10 = L2;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr = new float[i12];
                            fArr[0] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, fArr));
                        }
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                    }
                }
                if (childAt != this.e) {
                    i14 = org.telegram.messenger.m5.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.m5.C(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i13++;
        }
        if (org.telegram.messenger.i0.Q1()) {
            y3 = org.telegram.messenger.i0.L(372.0f) / 3;
        } else {
            Point point = org.telegram.messenger.i0.q;
            y3 = org.telegram.messenger.z20.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (L - i14 < y3) {
            L2 += org.telegram.messenger.i0.L(40.0f);
            i14 = 0;
        }
        if (L - i15 < y3) {
            L3 += org.telegram.messenger.i0.L(40.0f);
        }
        UsersSelectActivity usersSelectActivity = this.f;
        usersSelectActivity.c.measure(View.MeasureSpec.makeMeasureSpec(L - i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30));
        if (!this.b) {
            int L5 = org.telegram.messenger.i0.L(42.0f) + L3;
            int L6 = org.telegram.messenger.i0.L(16.0f) + i14;
            usersSelectActivity.Q = L2;
            if (this.a != null) {
                int L7 = org.telegram.messenger.i0.L(42.0f) + L2;
                if (usersSelectActivity.D != L7) {
                    arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", L7));
                }
                float f11 = L6;
                if (usersSelectActivity.c.getTranslationX() != f11) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.c, (Property<org.telegram.ui.ActionBar.n0, Float>) property2, f11));
                }
                float translationY = usersSelectActivity.c.getTranslationY();
                float f12 = usersSelectActivity.Q;
                if (translationY != f12) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.c, (Property<org.telegram.ui.ActionBar.n0, Float>) property, f12));
                }
                usersSelectActivity.c.setAllowDrawCursor(false);
                this.a.playTogether(arrayList);
                this.a.start();
                this.b = true;
            } else {
                usersSelectActivity.D = L5;
                usersSelectActivity.c.setTranslationX(L6);
                usersSelectActivity.c.setTranslationY(usersSelectActivity.Q);
            }
        } else if (this.a != null && !usersSelectActivity.w && this.e == null) {
            org.telegram.ui.ActionBar.n0 n0Var = usersSelectActivity.c;
            n0Var.bringPointIntoView(n0Var.getSelectionStart());
        }
        setMeasuredDimension(size, usersSelectActivity.D);
    }
}
