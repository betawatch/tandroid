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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class kb1 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public org.telegram.ui.Components.c20 d;
    public org.telegram.ui.Components.c20 e;
    public final /* synthetic */ UsersSelectActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb1(UsersSelectActivity usersSelectActivity, Context context) {
        super(context);
        this.f = usersSelectActivity;
        this.c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.c20 c20Var, boolean z9) {
        UsersSelectActivity usersSelectActivity = this.f;
        usersSelectActivity.P.add(c20Var);
        long uid = c20Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.x++;
        }
        usersSelectActivity.O.k(c20Var, uid);
        ah.i iVar = usersSelectActivity.c;
        iVar.t(false, TextUtils.isEmpty(iVar.getText()));
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.a.setupEndValues();
            this.a.cancel();
        }
        this.b = false;
        if (z9) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.a = animatorSet2;
            animatorSet2.addListener(new r81(this, 3));
            this.a.setDuration(150L);
            this.d = c20Var;
            ArrayList arrayList = this.c;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.Components.c20, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.Components.c20, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.Components.c20, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(c20Var);
    }

    public final void b(org.telegram.ui.Components.c20 c20Var) {
        UsersSelectActivity usersSelectActivity = this.f;
        usersSelectActivity.w = true;
        long uid = c20Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.x--;
        }
        usersSelectActivity.O.l(uid);
        usersSelectActivity.P.remove(c20Var);
        c20Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            this.a.cancel();
        }
        this.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.v50(16, this, c20Var));
        this.a.setDuration(150L);
        this.e = c20Var;
        ArrayList arrayList = this.c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.c20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.c20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.c20, Float>) View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        Property property;
        Property property2;
        ArrayList arrayList;
        int y10;
        int i11;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(26.0f);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int L3 = org.telegram.messenger.g0.L(10.0f);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            property = View.TRANSLATION_Y;
            property2 = View.TRANSLATION_X;
            arrayList = this.c;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Components.c20) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
                if (childAt != this.e && childAt.getMeasuredWidth() + i13 > L) {
                    L2 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L2);
                    i13 = 0;
                }
                if (childAt.getMeasuredWidth() + i14 > L) {
                    L3 = org.telegram.messenger.k5.C(8.0f, childAt.getMeasuredHeight(), L3);
                    i14 = 0;
                }
                int L4 = org.telegram.messenger.g0.L(13.0f) + i13;
                if (!this.b) {
                    org.telegram.ui.Components.c20 c20Var = this.e;
                    if (childAt == c20Var) {
                        childAt.setTranslationX(org.telegram.messenger.g0.L(13.0f) + i14);
                        childAt.setTranslationY(L3);
                    } else if (c20Var != null) {
                        float f10 = L4;
                        if (childAt.getTranslationX() != f10) {
                            i11 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, f10));
                        } else {
                            i11 = 1;
                        }
                        float f11 = L2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr = new float[i11];
                            fArr[0] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, fArr));
                        }
                    } else {
                        childAt.setTranslationX(L4);
                        childAt.setTranslationY(L2);
                    }
                }
                if (childAt != this.e) {
                    i13 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i13);
                }
                i14 = org.telegram.messenger.k5.C(9.0f, childAt.getMeasuredWidth(), i14);
            }
            i12++;
        }
        if (org.telegram.messenger.g0.Q1()) {
            y10 = org.telegram.messenger.g0.L(372.0f) / 3;
        } else {
            Point point = org.telegram.messenger.g0.q;
            y10 = org.telegram.messenger.camera.q.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (L - i13 < y10) {
            L2 += org.telegram.messenger.g0.L(40.0f);
            i13 = 0;
        }
        if (L - i14 < y10) {
            L3 += org.telegram.messenger.g0.L(40.0f);
        }
        UsersSelectActivity usersSelectActivity = this.f;
        usersSelectActivity.c.measure(View.MeasureSpec.makeMeasureSpec(L - i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
        if (!this.b) {
            int L5 = org.telegram.messenger.g0.L(42.0f) + L3;
            int L6 = org.telegram.messenger.g0.L(16.0f) + i13;
            usersSelectActivity.R = L2;
            if (this.a != null) {
                int L7 = org.telegram.messenger.g0.L(42.0f) + L2;
                if (usersSelectActivity.D != L7) {
                    arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", L7));
                }
                float f12 = L6;
                if (usersSelectActivity.c.getTranslationX() != f12) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.c, (Property<ah.i, Float>) property2, f12));
                }
                float translationY = usersSelectActivity.c.getTranslationY();
                float f13 = usersSelectActivity.R;
                if (translationY != f13) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.c, (Property<ah.i, Float>) property, f13));
                }
                usersSelectActivity.c.setAllowDrawCursor(false);
                this.a.playTogether(arrayList);
                this.a.start();
                this.b = true;
            } else {
                usersSelectActivity.D = L5;
                usersSelectActivity.c.setTranslationX(L6);
                usersSelectActivity.c.setTranslationY(usersSelectActivity.R);
            }
        } else if (this.a != null && !usersSelectActivity.w && this.e == null) {
            ah.i iVar = usersSelectActivity.c;
            iVar.bringPointIntoView(iVar.getSelectionStart());
        }
        setMeasuredDimension(size, usersSelectActivity.D);
    }
}
