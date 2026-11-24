// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o37 extends r59 {
    public final ArrayList f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final /* synthetic */ pv7 k3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o37(pv7 pv7Var, Context context, t37 t37Var) {
        super(context, t37Var);
        this.k3 = pv7Var;
        this.f3 = new ArrayList();
        this.g3 = new ArrayList();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList(10);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ac  */
    @Override // r59, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        float f2;
        boolean z;
        float f3;
        int i3;
        ArrayList arrayList;
        f47 currentMessagesGroup;
        int backgroundDrawableLeft;
        int backgroundDrawableRight;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        canvas.save();
        this.F1.setEmpty();
        int childCount = getChildCount();
        int i11 = 0;
        f47 f47Var = null;
        while (true) {
            f = 0.0f;
            i = 4;
            i2 = 2;
            f2 = 2.0f;
            z = true;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 4) {
                if (childAt instanceof rc2) {
                    rc2 rc2Var = (rc2) childAt;
                    f47 currentMessagesGroup2 = rc2Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 == null || currentMessagesGroup2 != f47Var) {
                        c47 currentPosition = rc2Var.getCurrentPosition();
                        f37 backgroundDrawable = rc2Var.getBackgroundDrawable();
                        if ((backgroundDrawable.f || rc2Var.B2()) && (currentPosition == null || (currentPosition.l & 2) != 0)) {
                            int y = (int) rc2Var.getY();
                            canvas.save();
                            if (currentPosition == null) {
                                i10 = rc2Var.getMeasuredHeight();
                            } else {
                                int measuredHeight = rc2Var.getMeasuredHeight() + y;
                                long j = 0;
                                float f4 = 0.0f;
                                for (int i12 = 0; i12 < childCount; i12++) {
                                    View childAt2 = getChildAt(i12);
                                    if (childAt2 instanceof rc2) {
                                        rc2 rc2Var2 = (rc2) childAt2;
                                        if (rc2Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                            f37 backgroundDrawable2 = rc2Var2.getBackgroundDrawable();
                                            int min = Math.min(y, (int) rc2Var2.getY());
                                            int max = Math.max(measuredHeight, rc2Var2.getMeasuredHeight() + ((int) rc2Var2.getY()));
                                            long j2 = backgroundDrawable2.l;
                                            if (j2 > j) {
                                                float x = rc2Var2.getX() + backgroundDrawable2.h;
                                                f4 = rc2Var2.getY() + backgroundDrawable2.i;
                                                f = x;
                                                j = j2;
                                            }
                                            y = min;
                                            measuredHeight = max;
                                        }
                                    }
                                }
                                backgroundDrawable.j = f;
                                backgroundDrawable.k = f4 - y;
                                i10 = measuredHeight - y;
                            }
                            int i13 = i10 + y;
                            canvas.clipRect(0, y, getMeasuredWidth(), i13);
                            backgroundDrawable.b = null;
                            backgroundDrawable.a.setColor(cmb.v0(cmb.xd, this.o2));
                            backgroundDrawable.setBounds(0, y, getMeasuredWidth(), i13);
                            backgroundDrawable.draw(canvas);
                            canvas.restore();
                        }
                        f47Var = currentMessagesGroup2;
                    }
                } else if (childAt instanceof cm1) {
                    cm1 cm1Var = (cm1) childAt;
                    if (cm1Var.Q()) {
                        canvas.save();
                        canvas.translate(cm1Var.getX(), cm1Var.getY() + cm1Var.getPaddingTop());
                        canvas.scale(cm1Var.getScaleX(), cm1Var.getScaleY(), cm1Var.getMeasuredWidth() / 2.0f, cm1Var.getMeasuredHeight() / 2.0f);
                        cm1Var.F(canvas, true);
                        cm1Var.I(canvas, true);
                        canvas.restore();
                    }
                }
            }
            i11++;
        }
        int i14 = 0;
        while (i14 < 3) {
            ArrayList arrayList2 = this.j3;
            arrayList2.clear();
            if (i14 != i2 || this.W1) {
                int i15 = 0;
                while (i15 < childCount) {
                    View childAt3 = getChildAt(i15);
                    if (childAt3 instanceof rc2) {
                        rc2 rc2Var3 = (rc2) childAt3;
                        if (childAt3.getY() <= getHeight() && childAt3.getY() + childAt3.getHeight() >= f && rc2Var3.getVisibility() != i && rc2Var3.getVisibility() != 8 && (currentMessagesGroup = rc2Var3.getCurrentMessagesGroup()) != null) {
                            e47 e47Var = currentMessagesGroup.m;
                            if ((i14 != 0 || currentMessagesGroup.d.size() != z) && ((i14 != z || e47Var.i) && ((i14 != 0 || !rc2Var3.getMessageObject().Z) && (i14 != z || rc2Var3.getMessageObject().Z)))) {
                                boolean z2 = rc2Var3.La;
                                if (i14 == i2) {
                                    if (!z2) {
                                    }
                                    if (!arrayList2.contains(currentMessagesGroup)) {
                                        e47Var.a = 0;
                                        e47Var.b = 0;
                                        e47Var.c = 0;
                                        e47Var.d = 0;
                                        e47Var.l = false;
                                        e47Var.k = false;
                                        e47Var.m = rc2Var3;
                                        arrayList2.add(currentMessagesGroup);
                                    }
                                    e47Var.k = rc2Var3.L2();
                                    e47Var.l = rc2Var3.K2();
                                    backgroundDrawableLeft = rc2Var3.getBackgroundDrawableLeft() + rc2Var3.getLeft();
                                    backgroundDrawableRight = rc2Var3.getBackgroundDrawableRight() + rc2Var3.getLeft();
                                    int backgroundDrawableTop = rc2Var3.getBackgroundDrawableTop() + rc2Var3.getPaddingTop() + rc2Var3.getTop();
                                    int backgroundDrawableBottom = rc2Var3.getBackgroundDrawableBottom() + rc2Var3.getPaddingTop() + rc2Var3.getTop();
                                    if ((rc2Var3.getCurrentPosition().l & i) == 0) {
                                        backgroundDrawableTop -= gm.L(10.0f);
                                    }
                                    i4 = backgroundDrawableTop;
                                    if ((rc2Var3.getCurrentPosition().l & 8) == 0) {
                                        backgroundDrawableBottom = gm.L(10.0f) + backgroundDrawableBottom;
                                    }
                                    i5 = backgroundDrawableBottom;
                                    if (rc2Var3.La) {
                                        e47Var.m = rc2Var3;
                                    }
                                    i6 = e47Var.b;
                                    if (i6 != 0 || i4 < i6) {
                                        e47Var.b = i4;
                                    }
                                    i7 = e47Var.d;
                                    if (i7 != 0 || i5 > i7) {
                                        e47Var.d = i5;
                                    }
                                    i8 = e47Var.a;
                                    if (i8 != 0 || backgroundDrawableLeft < i8) {
                                        e47Var.a = backgroundDrawableLeft;
                                    }
                                    i9 = e47Var.c;
                                    if (i9 != 0 || backgroundDrawableRight > i9) {
                                        e47Var.c = backgroundDrawableRight;
                                    }
                                } else {
                                    if (z2) {
                                    }
                                    if (!arrayList2.contains(currentMessagesGroup)) {
                                    }
                                    e47Var.k = rc2Var3.L2();
                                    e47Var.l = rc2Var3.K2();
                                    backgroundDrawableLeft = rc2Var3.getBackgroundDrawableLeft() + rc2Var3.getLeft();
                                    backgroundDrawableRight = rc2Var3.getBackgroundDrawableRight() + rc2Var3.getLeft();
                                    int backgroundDrawableTop2 = rc2Var3.getBackgroundDrawableTop() + rc2Var3.getPaddingTop() + rc2Var3.getTop();
                                    int backgroundDrawableBottom2 = rc2Var3.getBackgroundDrawableBottom() + rc2Var3.getPaddingTop() + rc2Var3.getTop();
                                    if ((rc2Var3.getCurrentPosition().l & i) == 0) {
                                    }
                                    i4 = backgroundDrawableTop2;
                                    if ((rc2Var3.getCurrentPosition().l & 8) == 0) {
                                    }
                                    i5 = backgroundDrawableBottom2;
                                    if (rc2Var3.La) {
                                    }
                                    i6 = e47Var.b;
                                    if (i6 != 0) {
                                    }
                                    e47Var.b = i4;
                                    i7 = e47Var.d;
                                    if (i7 != 0) {
                                    }
                                    e47Var.d = i5;
                                    i8 = e47Var.a;
                                    if (i8 != 0) {
                                    }
                                    e47Var.a = backgroundDrawableLeft;
                                    i9 = e47Var.c;
                                    if (i9 != 0) {
                                    }
                                    e47Var.c = backgroundDrawableRight;
                                }
                            }
                        }
                    }
                    i15++;
                    i2 = 2;
                    f = 0.0f;
                }
                int i16 = 0;
                while (i16 < arrayList2.size()) {
                    f47 f47Var2 = (f47) arrayList2.get(i16);
                    e47 e47Var2 = f47Var2.m;
                    float U1 = e47Var2.m.U1(z);
                    float f5 = e47Var2.a + U1 + e47Var2.e;
                    float f6 = e47Var2.b + e47Var2.f;
                    float f7 = e47Var2.g + e47Var2.c + U1;
                    float f8 = e47Var2.d + e47Var2.h;
                    if (!e47Var2.j) {
                        f6 += e47Var2.m.getTranslationY();
                        f8 += e47Var2.m.getTranslationY();
                    }
                    boolean z3 = (e47Var2.m.getScaleX() == 1.0f && e47Var2.m.getScaleY() == 1.0f) ? false : z;
                    if (z3) {
                        canvas.save();
                        arrayList = arrayList2;
                        canvas.scale(e47Var2.m.getScaleX(), e47Var2.m.getScaleY(), aq1.z(f7, f5, f2, f5), aq1.z(f8, f6, f2, f6));
                    } else {
                        arrayList = arrayList2;
                    }
                    float f9 = f2;
                    float f10 = f6;
                    float f11 = f8;
                    e47Var2.m.K0(canvas, (int) f5, (int) f6, (int) f7, (int) f8, e47Var2.k, e47Var2.l, false, 0);
                    e47Var2.m = null;
                    e47Var2.o = f47Var2.c;
                    if (z3) {
                        canvas.restore();
                        for (int i17 = 0; i17 < childCount; i17++) {
                            View childAt4 = getChildAt(i17);
                            if (childAt4 instanceof rc2) {
                                rc2 rc2Var4 = (rc2) childAt4;
                                if (rc2Var4.getCurrentMessagesGroup() == f47Var2) {
                                    int left = rc2Var4.getLeft();
                                    int top = rc2Var4.getTop();
                                    childAt4.setPivotX(((f7 - f5) / f9) + (f5 - left));
                                    childAt4.setPivotY(((f11 - f10) / f9) + (f10 - top));
                                }
                            }
                        }
                    }
                    i16++;
                    arrayList2 = arrayList;
                    f2 = f9;
                    z = true;
                }
                i3 = 2;
            } else {
                i3 = i2;
            }
            i14++;
            i2 = i3;
            f2 = f2;
            z = true;
            f = 0.0f;
            i = 4;
        }
        super.dispatchDraw(canvas);
        ArrayList arrayList3 = this.f3;
        int size = arrayList3.size();
        if (size > 0) {
            for (int i18 = 0; i18 < size; i18++) {
                rc2 rc2Var5 = (rc2) arrayList3.get(i18);
                canvas.save();
                canvas.translate(rc2Var5.U1(false) + rc2Var5.getLeft(), rc2Var5.getY());
                rc2Var5.A1(rc2Var5.a() ? rc2Var5.getAlpha() : 1.0f, canvas, true);
                canvas.restore();
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.g3;
        int size2 = arrayList4.size();
        if (size2 > 0) {
            for (int i19 = 0; i19 < size2; i19++) {
                rc2 rc2Var6 = (rc2) arrayList4.get(i19);
                float U12 = rc2Var6.U1(false) + rc2Var6.getLeft();
                float y2 = rc2Var6.getY();
                float alpha = rc2Var6.a() ? rc2Var6.getAlpha() : 1.0f;
                canvas.save();
                canvas.translate(U12, y2);
                rc2Var6.setInvalidatesParent(true);
                rc2Var6.h1(canvas, alpha);
                rc2Var6.setInvalidatesParent(false);
                canvas.restore();
            }
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.h3;
        int size3 = arrayList5.size();
        if (size3 > 0) {
            for (int i20 = 0; i20 < size3; i20++) {
                rc2 rc2Var7 = (rc2) arrayList5.get(i20);
                boolean z4 = rc2Var7.getCurrentPosition() != null && (rc2Var7.getCurrentPosition().l & 1) == 0;
                float alpha2 = rc2Var7.a() ? rc2Var7.getAlpha() : 1.0f;
                float U13 = rc2Var7.U1(false) + rc2Var7.getLeft();
                float y3 = rc2Var7.getY();
                canvas.save();
                f47 currentMessagesGroup3 = rc2Var7.getCurrentMessagesGroup();
                if (currentMessagesGroup3 != null) {
                    e47 e47Var3 = currentMessagesGroup3.m;
                    if (e47Var3.j) {
                        float U14 = rc2Var7.U1(true);
                        float f12 = e47Var3.a + U14 + e47Var3.e;
                        float f13 = e47Var3.b + e47Var3.f;
                        float f14 = e47Var3.c + U14 + e47Var3.g;
                        float f15 = e47Var3.d + e47Var3.h;
                        if (!e47Var3.j) {
                            f13 += rc2Var7.getTranslationY();
                            f15 += rc2Var7.getTranslationY();
                        }
                        canvas.clipRect(f12 + gm.L(8.0f), f13 + gm.L(8.0f), f14 - gm.L(8.0f), f15 - gm.L(8.0f));
                    }
                }
                if (rc2Var7.getTransitionParams().w0) {
                    canvas.translate(U13, y3);
                    rc2Var7.setInvalidatesParent(true);
                    rc2Var7.Q0(alpha2, canvas, z4);
                    rc2Var7.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            f3 = 8.0f;
            arrayList5.clear();
        } else {
            f3 = 8.0f;
        }
        ArrayList arrayList6 = this.i3;
        int size4 = arrayList6.size();
        if (size4 > 0) {
            for (int i21 = 0; i21 < size4; i21++) {
                rc2 rc2Var8 = (rc2) arrayList6.get(i21);
                if (rc2Var8.getCurrentPosition() == null || (rc2Var8.getCurrentPosition().l & 1) != 0) {
                    float alpha3 = rc2Var8.a() ? rc2Var8.getAlpha() : 1.0f;
                    float U15 = rc2Var8.U1(false) + rc2Var8.getLeft();
                    float y4 = rc2Var8.getY();
                    canvas.save();
                    f47 currentMessagesGroup4 = rc2Var8.getCurrentMessagesGroup();
                    if (currentMessagesGroup4 != null) {
                        e47 e47Var4 = currentMessagesGroup4.m;
                        if (e47Var4.j) {
                            float U16 = rc2Var8.U1(true);
                            float f16 = e47Var4.a + U16 + e47Var4.e;
                            float f17 = e47Var4.b + e47Var4.f;
                            float f18 = e47Var4.c + U16 + e47Var4.g;
                            float f19 = e47Var4.d + e47Var4.h;
                            if (!e47Var4.j) {
                                f17 += rc2Var8.getTranslationY();
                                f19 += rc2Var8.getTranslationY();
                            }
                            canvas.clipRect(f16 + gm.L(f3), f17 + gm.L(f3), f18 - gm.L(f3), f19 - gm.L(f3));
                        }
                    }
                    if (rc2Var8.getTransitionParams().w0) {
                        canvas.translate(U15, y4);
                        rc2Var8.setInvalidatesParent(true);
                        rc2Var8.q1(canvas, alpha3, null);
                        rc2Var8.V0(canvas, alpha3);
                        rc2Var8.setInvalidatesParent(false);
                        canvas.restore();
                    }
                }
            }
            arrayList6.clear();
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x00fd, code lost:
    
        if ((r11 & 1) != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x00b0, code lost:
    
        if (r7.c != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (r5.getTransitionParams().x0 != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010a  */
    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        rc2 rc2Var;
        cm1 cm1Var;
        float f;
        ImageReceiver avatarImage;
        float f2;
        boolean z;
        int i;
        int b;
        int b2;
        int i2;
        pv7 pv7Var = this.k3;
        f47 f47Var = pv7Var.v0;
        if (view instanceof rc2) {
            rc2Var = (rc2) view;
        } else {
            if (view instanceof cm1) {
                cm1Var = (cm1) view;
                rc2Var = null;
                boolean drawChild = super.drawChild(canvas, view, j);
                if (rc2Var == null && rc2Var.l2()) {
                    canvas.save();
                    canvas.translate(rc2Var.getX(), rc2Var.getY() + rc2Var.getPaddingTop());
                    rc2Var.i1(canvas);
                    canvas.restore();
                } else if (cm1Var != null) {
                    canvas.save();
                    canvas.translate(cm1Var.getX(), cm1Var.getY());
                    cm1Var.H(canvas);
                    canvas.restore();
                }
                float f3 = 0.0f;
                if (view.getTranslationY() != 0.0f) {
                    canvas.save();
                    canvas.translate(0.0f, view.getTranslationY());
                }
                if (rc2Var != null) {
                    rc2Var.S0(canvas);
                }
                if (view.getTranslationY() != 0.0f) {
                    canvas.restore();
                }
                if (view.getTranslationY() != 0.0f) {
                    canvas.save();
                    canvas.translate(0.0f, view.getTranslationY());
                }
                if (rc2Var != null) {
                    rc2Var.getMessageObject();
                    c47 currentPosition = rc2Var.getCurrentPosition();
                    if (currentPosition != null) {
                        if (!currentPosition.h) {
                            if (currentPosition.a == 0) {
                            }
                            if (currentPosition == null || rc2Var.getTransitionParams().D0 || rc2Var.getTransitionParams().x0) {
                                if (currentPosition != null || (currentPosition.l & rc2Var.C()) != 0) {
                                    this.h3.add(rc2Var);
                                }
                                if (currentPosition != null) {
                                    int i3 = currentPosition.l;
                                    if ((i3 & 8) != 0) {
                                    }
                                }
                                this.i3.add(rc2Var);
                            }
                            avatarImage = rc2Var.getAvatarImage();
                            if (avatarImage != null) {
                                boolean z2 = this.W1 || (f47Var != null && f47Var.m.j);
                                int top = z2 ? view.getTop() : (int) view.getY();
                                if (!rc2Var.n() || (b2 = pv7Var.t0.T(view).b()) < 0) {
                                    f2 = 0.0f;
                                    z = true;
                                } else {
                                    if (f47Var == null || currentPosition == null) {
                                        f2 = 0.0f;
                                        z = true;
                                        i2 = b2 - 1;
                                    } else {
                                        int indexOf = f47Var.e.indexOf(currentPosition);
                                        int size = f47Var.e.size();
                                        z = true;
                                        if ((currentPosition.l & 8) == 0) {
                                            i2 = b2 - 1;
                                            int i4 = indexOf + 1;
                                            while (i4 < size) {
                                                f2 = f3;
                                                if (((c47) f47Var.e.get(i4)).c > currentPosition.d) {
                                                    break;
                                                }
                                                i2--;
                                                i4++;
                                                f3 = f2;
                                            }
                                        } else {
                                            i2 = (b2 - size) + indexOf;
                                        }
                                        f2 = f3;
                                    }
                                    if (K(i2) != null) {
                                        if (view.getTranslationY() != f2) {
                                            canvas.restore();
                                        }
                                        avatarImage.v0(false, false);
                                        return drawChild;
                                    }
                                }
                                float checkBoxTranslation = rc2Var.getCheckBoxTranslation() + rc2Var.getSlidingOffsetX();
                                int top2 = (int) ((z2 ? view.getTop() : view.getY()) + rc2Var.getLayoutHeight() + rc2Var.getTransitionParams().j0);
                                int measuredHeight = getMeasuredHeight() - getPaddingBottom();
                                boolean z3 = ((rc2Var.n1 || rc2Var.o1) && checkBoxTranslation == f2) ? z : false;
                                if (rc2Var.M2() || rc2Var.getTransitionParams().l2) {
                                    if (rc2Var.getTransitionParams().l2) {
                                        float f4 = rc2Var.getTransitionParams().L1;
                                        if (!rc2Var.M2()) {
                                            f4 = 1.0f - f4;
                                        }
                                        top2 = (int) td4.A(1.0f, f4, Math.min(top2, measuredHeight), top2 * f4);
                                    }
                                } else if (top2 > measuredHeight) {
                                    top2 = measuredHeight;
                                }
                                if (!z2 && view.getTranslationY() != f2) {
                                    canvas.restore();
                                }
                                if (rc2Var.j() && (b = T(view).b()) >= 0) {
                                    int i5 = 0;
                                    while (i5 < 20) {
                                        i5++;
                                        if (f47Var != null && currentPosition != null) {
                                            int indexOf2 = f47Var.e.indexOf(currentPosition);
                                            if (indexOf2 < 0) {
                                                break;
                                            }
                                            f47Var.e.size();
                                            if ((currentPosition.l & 4) == 0) {
                                                b++;
                                                int i6 = indexOf2 - 1;
                                                while (i6 >= 0) {
                                                    i = top2;
                                                    if (((c47) f47Var.e.get(i6)).d < currentPosition.c) {
                                                        break;
                                                    }
                                                    b++;
                                                    i6--;
                                                    top2 = i;
                                                }
                                            } else {
                                                b = b + indexOf2 + 1;
                                            }
                                            i = top2;
                                        } else {
                                            i = top2;
                                            b++;
                                        }
                                        u69 K = K(b);
                                        if (K == null) {
                                            break;
                                        }
                                        View view2 = K.a;
                                        top = view2.getTop();
                                        if (!(view2 instanceof rc2)) {
                                            break;
                                        }
                                        rc2Var = (rc2) view2;
                                        float checkBoxTranslation2 = rc2Var.getCheckBoxTranslation() + rc2Var.getSlidingOffsetX();
                                        if (z3 && checkBoxTranslation2 > f2) {
                                            checkBoxTranslation = checkBoxTranslation2;
                                        }
                                        if (!rc2Var.j()) {
                                            break;
                                        }
                                        top2 = i;
                                    }
                                }
                                i = top2;
                                int L = i - gm.L(42.0f) < top ? gm.L(42.0f) + top : i;
                                if (!rc2Var.n()) {
                                    int bottom = z2 ? rc2Var.getBottom() : (int) (rc2Var.getY() + rc2Var.getMeasuredHeight() + rc2Var.getTransitionParams().j0);
                                    if (L > bottom) {
                                        L = bottom;
                                    }
                                }
                                canvas.save();
                                if (checkBoxTranslation != f2) {
                                    canvas.translate(checkBoxTranslation, f2);
                                }
                                if (rc2Var.getCurrentMessagesGroup() != null && rc2Var.getCurrentMessagesGroup().m.j) {
                                    L = (int) (L - rc2Var.getTranslationY());
                                }
                                avatarImage.M0 = L - gm.L(40.0f);
                                if (rc2Var.a()) {
                                    avatarImage.setAlpha(rc2Var.getAlpha());
                                    canvas.scale(rc2Var.getScaleX(), rc2Var.getScaleY(), rc2Var.getPivotX() + rc2Var.getX(), rc2Var.getY() + (rc2Var.getHeight() >> 1));
                                } else {
                                    avatarImage.setAlpha(1.0f);
                                }
                                avatarImage.v0(z, false);
                                avatarImage.h(canvas, null);
                                canvas.restore();
                                if (z2) {
                                    f = 0.0f;
                                } else {
                                    f = 0.0f;
                                    if (view.getTranslationY() != 0.0f) {
                                        canvas.save();
                                    }
                                }
                                if (view.getTranslationY() != f) {
                                    canvas.restore();
                                }
                                return drawChild;
                            }
                        }
                    }
                    if (currentPosition == null || currentPosition.h) {
                        this.f3.add(rc2Var);
                    }
                    if ((currentPosition == null || (currentPosition.a == 0 && currentPosition.c == 0)) && rc2Var.k2()) {
                        this.g3.add(rc2Var);
                    }
                    if (currentPosition == null) {
                    }
                    if (currentPosition != null) {
                    }
                    this.h3.add(rc2Var);
                    if (currentPosition != null) {
                    }
                    this.i3.add(rc2Var);
                    avatarImage = rc2Var.getAvatarImage();
                    if (avatarImage != null) {
                    }
                }
                f = 0.0f;
                if (view.getTranslationY() != f) {
                }
                return drawChild;
            }
            rc2Var = null;
        }
        cm1Var = null;
        boolean drawChild2 = super.drawChild(canvas, view, j);
        if (rc2Var == null) {
        }
        if (cm1Var != null) {
        }
        float f32 = 0.0f;
        if (view.getTranslationY() != 0.0f) {
        }
        if (rc2Var != null) {
        }
        if (view.getTranslationY() != 0.0f) {
        }
        if (view.getTranslationY() != 0.0f) {
        }
        if (rc2Var != null) {
        }
        f = 0.0f;
        if (view.getTranslationY() != f) {
        }
        return drawChild2;
    }
}
