package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bj;
import org.telegram.messenger.dj;
import org.telegram.messenger.ej;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.tk0;
import vh.s3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c1 extends tk0 {
    public final ArrayList e3;
    public final ArrayList f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final /* synthetic */ s3 j3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(s3 s3Var, Context context, i1 i1Var) {
        super(context, i1Var);
        this.j3 = s3Var;
        this.e3 = new ArrayList();
        this.f3 = new ArrayList();
        this.g3 = new ArrayList();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList(10);
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x049d A[SYNTHETIC] */
    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        float f10;
        boolean z10;
        float f11;
        int i12;
        ArrayList arrayList;
        ej currentMessagesGroup;
        int i13;
        canvas.save();
        this.E1.setEmpty();
        int childCount = getChildCount();
        int i14 = 0;
        ej ejVar = null;
        while (true) {
            f7 = 0.0f;
            i10 = 4;
            i11 = 2;
            f10 = 2.0f;
            z10 = true;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 4) {
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    ej currentMessagesGroup2 = q1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 == null || currentMessagesGroup2 != ejVar) {
                        bj currentPosition = q1Var.getCurrentPosition();
                        aa0 backgroundDrawable = q1Var.getBackgroundDrawable();
                        if ((backgroundDrawable.f || q1Var.w2()) && (currentPosition == null || (2 & currentPosition.l) != 0)) {
                            int y3 = (int) q1Var.getY();
                            canvas.save();
                            if (currentPosition == null) {
                                i13 = q1Var.getMeasuredHeight();
                            } else {
                                int measuredHeight = q1Var.getMeasuredHeight() + y3;
                                long j10 = 0;
                                float f12 = 0.0f;
                                for (int i15 = 0; i15 < childCount; i15++) {
                                    View childAt2 = getChildAt(i15);
                                    if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt2;
                                        if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                            aa0 backgroundDrawable2 = q1Var2.getBackgroundDrawable();
                                            int min = Math.min(y3, (int) q1Var2.getY());
                                            int max = Math.max(measuredHeight, q1Var2.getMeasuredHeight() + ((int) q1Var2.getY()));
                                            long j11 = backgroundDrawable2.l;
                                            if (j11 > j10) {
                                                float x10 = q1Var2.getX() + backgroundDrawable2.h;
                                                f12 = q1Var2.getY() + backgroundDrawable2.i;
                                                f7 = x10;
                                                j10 = j11;
                                            }
                                            y3 = min;
                                            measuredHeight = max;
                                        }
                                    }
                                }
                                backgroundDrawable.j = f7;
                                backgroundDrawable.k = f12 - y3;
                                i13 = measuredHeight - y3;
                            }
                            int i16 = i13 + y3;
                            canvas.clipRect(0, y3, getMeasuredWidth(), i16);
                            backgroundDrawable.b = null;
                            backgroundDrawable.a.setColor(t6.w0(t6.vd, this.n2));
                            backgroundDrawable.setBounds(0, y3, getMeasuredWidth(), i16);
                            backgroundDrawable.draw(canvas);
                            canvas.restore();
                        }
                        ejVar = currentMessagesGroup2;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                    org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) childAt;
                    if (s0Var.R()) {
                        canvas.save();
                        canvas.translate(s0Var.getX(), s0Var.getY() + s0Var.getPaddingTop());
                        canvas.scale(s0Var.getScaleX(), s0Var.getScaleY(), s0Var.getMeasuredWidth() / 2.0f, s0Var.getMeasuredHeight() / 2.0f);
                        s0Var.H(canvas, true);
                        s0Var.J(canvas, true);
                        canvas.restore();
                    }
                }
            }
            i14++;
        }
        int i17 = 0;
        while (i17 < 3) {
            ArrayList arrayList2 = this.i3;
            arrayList2.clear();
            if (i17 != i11 || this.V1) {
                int i18 = 0;
                while (i18 < childCount) {
                    View childAt3 = getChildAt(i18);
                    if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) childAt3;
                        if (childAt3.getY() <= getHeight() && childAt3.getY() + childAt3.getHeight() >= f7 && q1Var3.getVisibility() != i10 && q1Var3.getVisibility() != 8 && (currentMessagesGroup = q1Var3.getCurrentMessagesGroup()) != null) {
                            dj djVar = currentMessagesGroup.m;
                            if ((i17 != 0 || currentMessagesGroup.d.size() != z10) && ((i17 != z10 || djVar.i) && ((i17 != 0 || !q1Var3.getMessageObject().Z) && ((i17 != z10 || q1Var3.getMessageObject().Z) && ((i17 != i11 || q1Var3.xa) && (i17 == i11 || !q1Var3.xa)))))) {
                                if (!arrayList2.contains(currentMessagesGroup)) {
                                    djVar.a = 0;
                                    djVar.b = 0;
                                    djVar.c = 0;
                                    djVar.d = 0;
                                    djVar.l = false;
                                    djVar.k = false;
                                    djVar.m = q1Var3;
                                    arrayList2.add(currentMessagesGroup);
                                }
                                djVar.k = q1Var3.F2();
                                djVar.l = q1Var3.E2();
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                int backgroundDrawableRight = q1Var3.getBackgroundDrawableRight() + q1Var3.getLeft();
                                int backgroundDrawableTop = q1Var3.getBackgroundDrawableTop() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                int backgroundDrawableBottom = q1Var3.getBackgroundDrawableBottom() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                if ((q1Var3.getCurrentPosition().l & i10) == 0) {
                                    backgroundDrawableTop -= org.telegram.messenger.i0.L(10.0f);
                                }
                                int i19 = backgroundDrawableTop;
                                if ((q1Var3.getCurrentPosition().l & 8) == 0) {
                                    backgroundDrawableBottom = org.telegram.messenger.i0.L(10.0f) + backgroundDrawableBottom;
                                }
                                int i20 = backgroundDrawableBottom;
                                if (q1Var3.xa) {
                                    djVar.m = q1Var3;
                                }
                                int i21 = djVar.b;
                                if (i21 == 0 || i19 < i21) {
                                    djVar.b = i19;
                                }
                                int i22 = djVar.d;
                                if (i22 == 0 || i20 > i22) {
                                    djVar.d = i20;
                                }
                                int i23 = djVar.a;
                                if (i23 == 0 || backgroundDrawableLeft < i23) {
                                    djVar.a = backgroundDrawableLeft;
                                }
                                int i24 = djVar.c;
                                if (i24 == 0 || backgroundDrawableRight > i24) {
                                    djVar.c = backgroundDrawableRight;
                                }
                                i18++;
                                i11 = 2;
                                f7 = 0.0f;
                            }
                        }
                    }
                    i18++;
                    i11 = 2;
                    f7 = 0.0f;
                }
                int i25 = 0;
                while (i25 < arrayList2.size()) {
                    ej ejVar2 = (ej) arrayList2.get(i25);
                    dj djVar2 = ejVar2.m;
                    float P1 = djVar2.m.P1(z10);
                    float f13 = djVar2.a + P1 + djVar2.e;
                    float f14 = djVar2.b + djVar2.f;
                    float f15 = djVar2.g + djVar2.c + P1;
                    float f16 = djVar2.d + djVar2.h;
                    if (!djVar2.j) {
                        f14 += djVar2.m.getTranslationY();
                        f16 += djVar2.m.getTranslationY();
                    }
                    boolean z11 = (djVar2.m.getScaleX() == 1.0f && djVar2.m.getScaleY() == 1.0f) ? false : z10;
                    if (z11) {
                        canvas.save();
                        arrayList = arrayList2;
                        canvas.scale(djVar2.m.getScaleX(), djVar2.m.getScaleY(), c3.i0.B(f15, f13, f10, f13), c3.i0.B(f16, f14, f10, f14));
                    } else {
                        arrayList = arrayList2;
                    }
                    float f17 = f10;
                    float f18 = f14;
                    float f19 = f16;
                    djVar2.m.I0(canvas, (int) f13, (int) f14, (int) f15, (int) f16, djVar2.k, djVar2.l, false, 0);
                    djVar2.m = null;
                    djVar2.o = ejVar2.c;
                    if (z11) {
                        canvas.restore();
                        for (int i26 = 0; i26 < childCount; i26++) {
                            View childAt4 = getChildAt(i26);
                            if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt4;
                                if (q1Var4.getCurrentMessagesGroup() == ejVar2) {
                                    int left = q1Var4.getLeft();
                                    int top = q1Var4.getTop();
                                    childAt4.setPivotX(((f15 - f13) / f17) + (f13 - left));
                                    childAt4.setPivotY(((f19 - f18) / f17) + (f18 - top));
                                }
                            }
                        }
                    }
                    i25++;
                    arrayList2 = arrayList;
                    f10 = f17;
                    z10 = true;
                }
                i12 = 2;
            } else {
                i12 = i11;
            }
            i17++;
            i11 = i12;
            f10 = f10;
            z10 = true;
            f7 = 0.0f;
            i10 = 4;
        }
        super.dispatchDraw(canvas);
        ArrayList arrayList3 = this.e3;
        int size = arrayList3.size();
        if (size > 0) {
            for (int i27 = 0; i27 < size; i27++) {
                org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) arrayList3.get(i27);
                canvas.save();
                canvas.translate(q1Var5.P1(false) + q1Var5.getLeft(), q1Var5.getY());
                q1Var5.v1(q1Var5.a() ? q1Var5.getAlpha() : 1.0f, canvas, true);
                canvas.restore();
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f3;
        int size2 = arrayList4.size();
        if (size2 > 0) {
            for (int i28 = 0; i28 < size2; i28++) {
                org.telegram.ui.Cells.q1 q1Var6 = (org.telegram.ui.Cells.q1) arrayList4.get(i28);
                float P12 = q1Var6.P1(false) + q1Var6.getLeft();
                float y10 = q1Var6.getY();
                float alpha = q1Var6.a() ? q1Var6.getAlpha() : 1.0f;
                canvas.save();
                canvas.translate(P12, y10);
                q1Var6.setInvalidatesParent(true);
                q1Var6.f1(canvas, alpha);
                q1Var6.setInvalidatesParent(false);
                canvas.restore();
            }
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.g3;
        int size3 = arrayList5.size();
        if (size3 > 0) {
            for (int i29 = 0; i29 < size3; i29++) {
                org.telegram.ui.Cells.q1 q1Var7 = (org.telegram.ui.Cells.q1) arrayList5.get(i29);
                boolean z12 = q1Var7.getCurrentPosition() != null && (q1Var7.getCurrentPosition().l & 1) == 0;
                float alpha2 = q1Var7.a() ? q1Var7.getAlpha() : 1.0f;
                float P13 = q1Var7.P1(false) + q1Var7.getLeft();
                float y11 = q1Var7.getY();
                canvas.save();
                ej currentMessagesGroup3 = q1Var7.getCurrentMessagesGroup();
                if (currentMessagesGroup3 != null) {
                    dj djVar3 = currentMessagesGroup3.m;
                    if (djVar3.j) {
                        float P14 = q1Var7.P1(true);
                        float f20 = djVar3.a + P14 + djVar3.e;
                        float f21 = djVar3.b + djVar3.f;
                        float f22 = djVar3.c + P14 + djVar3.g;
                        float f23 = djVar3.d + djVar3.h;
                        if (!djVar3.j) {
                            f21 += q1Var7.getTranslationY();
                            f23 += q1Var7.getTranslationY();
                        }
                        canvas.clipRect(f20 + org.telegram.messenger.i0.L(8.0f), f21 + org.telegram.messenger.i0.L(8.0f), f22 - org.telegram.messenger.i0.L(8.0f), f23 - org.telegram.messenger.i0.L(8.0f));
                        if (!q1Var7.getTransitionParams().w0) {
                            canvas.translate(P13, y11);
                            q1Var7.setInvalidatesParent(true);
                            q1Var7.O0(alpha2, canvas, z12);
                            q1Var7.setInvalidatesParent(false);
                            canvas.restore();
                        }
                    }
                }
                if (!q1Var7.getTransitionParams().w0) {
                }
            }
            f11 = 8.0f;
            arrayList5.clear();
        } else {
            f11 = 8.0f;
        }
        ArrayList arrayList6 = this.h3;
        int size4 = arrayList6.size();
        if (size4 > 0) {
            for (int i30 = 0; i30 < size4; i30++) {
                org.telegram.ui.Cells.q1 q1Var8 = (org.telegram.ui.Cells.q1) arrayList6.get(i30);
                if (q1Var8.getCurrentPosition() == null || (q1Var8.getCurrentPosition().l & 1) != 0) {
                    float alpha3 = q1Var8.a() ? q1Var8.getAlpha() : 1.0f;
                    float P15 = q1Var8.P1(false) + q1Var8.getLeft();
                    float y12 = q1Var8.getY();
                    canvas.save();
                    ej currentMessagesGroup4 = q1Var8.getCurrentMessagesGroup();
                    if (currentMessagesGroup4 != null) {
                        dj djVar4 = currentMessagesGroup4.m;
                        if (djVar4.j) {
                            float P16 = q1Var8.P1(true);
                            float f24 = djVar4.a + P16 + djVar4.e;
                            float f25 = djVar4.b + djVar4.f;
                            float f26 = djVar4.c + P16 + djVar4.g;
                            float f27 = djVar4.d + djVar4.h;
                            if (!djVar4.j) {
                                f25 += q1Var8.getTranslationY();
                                f27 += q1Var8.getTranslationY();
                            }
                            canvas.clipRect(f24 + org.telegram.messenger.i0.L(f11), f25 + org.telegram.messenger.i0.L(f11), f26 - org.telegram.messenger.i0.L(f11), f27 - org.telegram.messenger.i0.L(f11));
                        }
                    }
                    if (q1Var8.getTransitionParams().w0) {
                        canvas.translate(P15, y12);
                        q1Var8.setInvalidatesParent(true);
                        q1Var8.m1(canvas, alpha3, null);
                        q1Var8.T0(canvas, alpha3);
                        q1Var8.setInvalidatesParent(false);
                        canvas.restore();
                    }
                }
            }
            arrayList6.clear();
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x00fe, code lost:
    
        if ((r11 & 1) != 0) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.s0 s0Var;
        float f7;
        float f10;
        boolean z10;
        int i10;
        int b10;
        int b11;
        int i11;
        s3 s3Var = this.j3;
        ej ejVar = s3Var.t0;
        if (view instanceof org.telegram.ui.Cells.q1) {
            q1Var = (org.telegram.ui.Cells.q1) view;
        } else {
            if (view instanceof org.telegram.ui.Cells.s0) {
                s0Var = (org.telegram.ui.Cells.s0) view;
                q1Var = null;
                boolean drawChild = super.drawChild(canvas, view, j10);
                if (q1Var == null && q1Var.h2()) {
                    canvas.save();
                    canvas.translate(q1Var.getX(), q1Var.getY() + q1Var.getPaddingTop());
                    q1Var.g1(canvas);
                    canvas.restore();
                } else if (s0Var != null) {
                    canvas.save();
                    canvas.translate(s0Var.getX(), s0Var.getY());
                    s0Var.I(canvas);
                    canvas.restore();
                }
                float f11 = 0.0f;
                if (view.getTranslationY() != 0.0f) {
                    canvas.save();
                    canvas.translate(0.0f, view.getTranslationY());
                }
                if (q1Var != null) {
                    q1Var.Q0(canvas);
                }
                if (view.getTranslationY() != 0.0f) {
                    canvas.restore();
                }
                if (view.getTranslationY() != 0.0f) {
                    canvas.save();
                    canvas.translate(0.0f, view.getTranslationY());
                }
                if (q1Var != null) {
                    q1Var.getMessageObject();
                    bj currentPosition = q1Var.getCurrentPosition();
                    if (currentPosition != null || q1Var.getTransitionParams().x0) {
                        if (currentPosition == null || currentPosition.h || (currentPosition.a == 0 && currentPosition.c == 0)) {
                            if (currentPosition == null || currentPosition.h) {
                                this.e3.add(q1Var);
                            }
                            if ((currentPosition == null || (currentPosition.a == 0 && currentPosition.c == 0)) && q1Var.g2()) {
                                this.f3.add(q1Var);
                            }
                        }
                        if (currentPosition != null || q1Var.getTransitionParams().D0 || q1Var.getTransitionParams().x0) {
                            if (currentPosition == null || (currentPosition.l & q1Var.F()) != 0) {
                                this.g3.add(q1Var);
                            }
                            if (currentPosition != null) {
                                int i12 = currentPosition.l;
                                if ((i12 & 8) != 0) {
                                }
                            }
                            this.h3.add(q1Var);
                        }
                    }
                    ImageReceiver avatarImage = q1Var.getAvatarImage();
                    if (avatarImage != null) {
                        boolean z11 = this.V1 || (ejVar != null && ejVar.m.j);
                        int top = z11 ? view.getTop() : (int) view.getY();
                        if (!q1Var.l() || (b11 = s3Var.r0.T(view).b()) < 0) {
                            f10 = 0.0f;
                            z10 = true;
                        } else {
                            if (ejVar == null || currentPosition == null) {
                                f10 = 0.0f;
                                z10 = true;
                                i11 = b11 - 1;
                            } else {
                                int indexOf = ejVar.e.indexOf(currentPosition);
                                int size = ejVar.e.size();
                                z10 = true;
                                if ((currentPosition.l & 8) != 0) {
                                    i11 = (b11 - size) + indexOf;
                                } else {
                                    i11 = b11 - 1;
                                    int i13 = indexOf + 1;
                                    while (i13 < size) {
                                        f10 = f11;
                                        if (((bj) ejVar.e.get(i13)).c > currentPosition.d) {
                                            break;
                                        }
                                        i11--;
                                        i13++;
                                        f11 = f10;
                                    }
                                }
                                f10 = f11;
                            }
                            if (K(i11) != null) {
                                if (view.getTranslationY() != f10) {
                                    canvas.restore();
                                }
                                avatarImage.O0(false, false);
                                return drawChild;
                            }
                        }
                        float checkBoxTranslation = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                        int top2 = (int) ((z11 ? view.getTop() : view.getY()) + q1Var.getLayoutHeight() + q1Var.getTransitionParams().j0);
                        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
                        boolean z12 = ((q1Var.m1 || q1Var.n1) && checkBoxTranslation == f10) ? z10 : false;
                        if (q1Var.G2() || q1Var.getTransitionParams().l2) {
                            if (q1Var.getTransitionParams().l2) {
                                float f12 = q1Var.getTransitionParams().L1;
                                if (!q1Var.G2()) {
                                    f12 = 1.0f - f12;
                                }
                                top2 = (int) c3.i0.z(1.0f, f12, Math.min(top2, measuredHeight), top2 * f12);
                            }
                        } else if (top2 > measuredHeight) {
                            top2 = measuredHeight;
                        }
                        if (!z11 && view.getTranslationY() != f10) {
                            canvas.restore();
                        }
                        if (q1Var.g() && (b10 = T(view).b()) >= 0) {
                            int i14 = 0;
                            while (i14 < 20) {
                                i14++;
                                if (ejVar == null || currentPosition == null) {
                                    i10 = top2;
                                    b10++;
                                } else {
                                    int indexOf2 = ejVar.e.indexOf(currentPosition);
                                    if (indexOf2 < 0) {
                                        break;
                                    }
                                    ejVar.e.size();
                                    if ((currentPosition.l & 4) != 0) {
                                        b10 = b10 + indexOf2 + 1;
                                    } else {
                                        b10++;
                                        int i15 = indexOf2 - 1;
                                        while (i15 >= 0) {
                                            i10 = top2;
                                            if (((bj) ejVar.e.get(i15)).d < currentPosition.c) {
                                                break;
                                            }
                                            b10++;
                                            i15--;
                                            top2 = i10;
                                        }
                                    }
                                    i10 = top2;
                                }
                                s4.c1 K = K(b10);
                                if (K == null) {
                                    break;
                                }
                                View view2 = K.a;
                                top = view2.getTop();
                                if (!(view2 instanceof org.telegram.ui.Cells.q1)) {
                                    break;
                                }
                                q1Var = (org.telegram.ui.Cells.q1) view2;
                                float checkBoxTranslation2 = q1Var.getCheckBoxTranslation() + q1Var.getSlidingOffsetX();
                                if (z12 && checkBoxTranslation2 > f10) {
                                    checkBoxTranslation = checkBoxTranslation2;
                                }
                                if (!q1Var.g()) {
                                    break;
                                }
                                top2 = i10;
                            }
                        }
                        i10 = top2;
                        int L = i10 - org.telegram.messenger.i0.L(42.0f) < top ? org.telegram.messenger.i0.L(42.0f) + top : i10;
                        if (!q1Var.l()) {
                            int bottom = z11 ? q1Var.getBottom() : (int) (q1Var.getY() + q1Var.getMeasuredHeight() + q1Var.getTransitionParams().j0);
                            if (L > bottom) {
                                L = bottom;
                            }
                        }
                        canvas.save();
                        if (checkBoxTranslation != f10) {
                            canvas.translate(checkBoxTranslation, f10);
                        }
                        if (q1Var.getCurrentMessagesGroup() != null && q1Var.getCurrentMessagesGroup().m.j) {
                            L = (int) (L - q1Var.getTranslationY());
                        }
                        avatarImage.L0 = L - org.telegram.messenger.i0.L(40.0f);
                        if (q1Var.a()) {
                            avatarImage.setAlpha(q1Var.getAlpha());
                            canvas.scale(q1Var.getScaleX(), q1Var.getScaleY(), q1Var.getPivotX() + q1Var.getX(), q1Var.getY() + (q1Var.getHeight() >> 1));
                        } else {
                            avatarImage.setAlpha(1.0f);
                        }
                        avatarImage.O0(z10, false);
                        avatarImage.h(canvas, null);
                        canvas.restore();
                        if (z11) {
                            f7 = 0.0f;
                        } else {
                            f7 = 0.0f;
                            if (view.getTranslationY() != 0.0f) {
                                canvas.save();
                            }
                        }
                        if (view.getTranslationY() != f7) {
                            canvas.restore();
                        }
                        return drawChild;
                    }
                }
                f7 = 0.0f;
                if (view.getTranslationY() != f7) {
                }
                return drawChild;
            }
            q1Var = null;
        }
        s0Var = null;
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        if (q1Var == null) {
        }
        if (s0Var != null) {
        }
        float f112 = 0.0f;
        if (view.getTranslationY() != 0.0f) {
        }
        if (q1Var != null) {
        }
        if (view.getTranslationY() != 0.0f) {
        }
        if (view.getTranslationY() != 0.0f) {
        }
        if (q1Var != null) {
        }
        f7 = 0.0f;
        if (view.getTranslationY() != f7) {
        }
        return drawChild2;
    }
}
