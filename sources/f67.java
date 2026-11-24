// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f67 extends r59 {
    public final ArrayList f3;
    public final ln g3;
    public final ln h3;
    public final in3 i3;
    public final /* synthetic */ j67 j3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f67(j67 j67Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.j3 = j67Var;
        this.f3 = new ArrayList(10);
        d53 d53Var = d53.h;
        this.g3 = new ln(this, 0L, 360L, d53Var);
        this.h3 = new ln(this, 0L, 360L, d53Var);
        this.i3 = new in3((byte) 7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x038a, code lost:
    
        if (r2.d.size() != 1) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0186  */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v31 */
    @Override // r59, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        ArrayList arrayList3;
        f47 currentMessagesGroup;
        int i2;
        float f;
        ArrayList arrayList4;
        f47 f47Var;
        f67 f67Var;
        f67 f67Var2;
        ArrayList arrayList5;
        j67 j67Var;
        int i3;
        f47 currentMessagesGroup2;
        int x;
        int x2;
        int y;
        int y2;
        int i4;
        int i5;
        int i6;
        int i7;
        f47 currentMessagesGroup3;
        j67 j67Var2 = this.j3;
        e67 e67Var = j67Var2.G;
        int measuredHeight = e67Var.getMeasuredHeight();
        f67 f67Var3 = j67Var2.K;
        int childCount = f67Var3.getChildCount();
        boolean z = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = f67Var3.getChildAt(i8);
            if (childAt instanceof rc2) {
                rc2 rc2Var = (rc2) childAt;
                RectF rectF = zgc.h;
                zgc.c(rc2Var, e67Var, rectF);
                float f2 = rectF.top;
                int i9 = (int) f2;
                childAt.getMeasuredHeight();
                int i10 = i9 >= 0 ? 0 : -i9;
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i10 + measuredHeight;
                }
                rc2Var.D3(i10, measuredHeight2 - i10, measuredHeight, f2, f2, e67Var.getMeasuredWidth(), e67Var.getMeasuredHeight(), 0, 0, 0);
            }
        }
        boolean z2 = true;
        canvas.saveLayerAlpha(0.0f, getScrollY() + 1, getWidth(), (getHeight() + getScrollY()) - 1, nm7.d4, 31);
        Canvas canvas2 = canvas;
        canvas2.save();
        int childCount2 = getChildCount();
        f47 f47Var2 = null;
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if ((childAt2 instanceof rc2) && ((currentMessagesGroup3 = ((rc2) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup3 != f47Var2)) {
                f47Var2 = currentMessagesGroup3;
            }
        }
        int i12 = 0;
        while (true) {
            arrayList = this.f3;
            int i13 = 2;
            i = 3;
            if (i12 >= 3) {
                break;
            }
            arrayList.clear();
            if (i12 != 2 || f67Var3.W1) {
                int i14 = z ? 1 : 0;
                ?? r9 = z;
                while (i14 < childCount2) {
                    View childAt3 = f67Var3.getChildAt(i14);
                    if (childAt3 instanceof rc2) {
                        rc2 rc2Var2 = (rc2) childAt3;
                        if (childAt3.getY() <= f67Var3.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup2 = rc2Var2.getCurrentMessagesGroup()) != null) {
                            e47 e47Var = currentMessagesGroup2.m;
                            if ((i12 != 0 || currentMessagesGroup2.d.size() != z2) && ((i12 != z2 || e47Var.i) && ((i12 != 0 || !rc2Var2.getMessageObject().Z) && (i12 != z2 || rc2Var2.getMessageObject().Z)))) {
                                boolean z3 = rc2Var2.La;
                                if (i12 == i13) {
                                    if (!z3) {
                                    }
                                    if (!arrayList.contains(currentMessagesGroup2)) {
                                        e47Var.a = r9;
                                        e47Var.b = r9;
                                        e47Var.c = r9;
                                        e47Var.d = r9;
                                        e47Var.l = r9;
                                        e47Var.k = r9;
                                        e47Var.m = rc2Var2;
                                        arrayList.add(currentMessagesGroup2);
                                    }
                                    e47Var.k = rc2Var2.L2();
                                    e47Var.l = rc2Var2.K2();
                                    x = (int) (rc2Var2.getX() + rc2Var2.getBackgroundDrawableLeft());
                                    x2 = (int) (rc2Var2.getX() + rc2Var2.getBackgroundDrawableRight());
                                    y = (int) (rc2Var2.getY() + rc2Var2.getPaddingTop() + rc2Var2.getBackgroundDrawableTop());
                                    y2 = (int) (rc2Var2.getY() + rc2Var2.getPaddingTop() + rc2Var2.getBackgroundDrawableBottom());
                                    if ((rc2Var2.getCurrentPosition().l & 4) == 0) {
                                        y -= gm.L(10.0f);
                                    }
                                    if ((rc2Var2.getCurrentPosition().l & 8) == 0) {
                                        y2 += gm.L(10.0f);
                                    }
                                    if (rc2Var2.La) {
                                        e47Var.m = rc2Var2;
                                    }
                                    i4 = e47Var.b;
                                    if (i4 != 0 || y < i4) {
                                        e47Var.b = y;
                                    }
                                    i5 = e47Var.d;
                                    if (i5 != 0 || y2 > i5) {
                                        e47Var.d = y2;
                                    }
                                    i6 = e47Var.a;
                                    if (i6 != 0 || x < i6) {
                                        e47Var.a = x;
                                    }
                                    i7 = e47Var.c;
                                    if (i7 != 0 || x2 > i7) {
                                        e47Var.c = x2;
                                    }
                                } else {
                                    if (z3) {
                                    }
                                    if (!arrayList.contains(currentMessagesGroup2)) {
                                    }
                                    e47Var.k = rc2Var2.L2();
                                    e47Var.l = rc2Var2.K2();
                                    x = (int) (rc2Var2.getX() + rc2Var2.getBackgroundDrawableLeft());
                                    x2 = (int) (rc2Var2.getX() + rc2Var2.getBackgroundDrawableRight());
                                    y = (int) (rc2Var2.getY() + rc2Var2.getPaddingTop() + rc2Var2.getBackgroundDrawableTop());
                                    y2 = (int) (rc2Var2.getY() + rc2Var2.getPaddingTop() + rc2Var2.getBackgroundDrawableBottom());
                                    if ((rc2Var2.getCurrentPosition().l & 4) == 0) {
                                    }
                                    if ((rc2Var2.getCurrentPosition().l & 8) == 0) {
                                    }
                                    if (rc2Var2.La) {
                                    }
                                    i4 = e47Var.b;
                                    if (i4 != 0) {
                                    }
                                    e47Var.b = y;
                                    i5 = e47Var.d;
                                    if (i5 != 0) {
                                    }
                                    e47Var.d = y2;
                                    i6 = e47Var.a;
                                    if (i6 != 0) {
                                    }
                                    e47Var.a = x;
                                    i7 = e47Var.c;
                                    if (i7 != 0) {
                                    }
                                    e47Var.c = x2;
                                }
                            }
                        }
                    }
                    i14++;
                    i13 = 2;
                    r9 = 0;
                }
                int i15 = 0;
                ArrayList arrayList6 = arrayList;
                while (i15 < arrayList6.size()) {
                    f47 f47Var3 = (f47) arrayList6.get(i15);
                    if (f47Var3 == null) {
                        arrayList5 = arrayList6;
                        f67Var2 = f67Var3;
                        j67Var = j67Var2;
                        i3 = i15;
                    } else {
                        e47 e47Var2 = f47Var3.m;
                        float U1 = e47Var2.m.U1(z2);
                        float f3 = e47Var2.a + U1 + e47Var2.e;
                        float f4 = e47Var2.b + e47Var2.f;
                        float f5 = e47Var2.g + e47Var2.c + U1;
                        float f6 = e47Var2.d + e47Var2.h;
                        if (f4 < (-gm.L(20.0f))) {
                            f4 = -gm.L(20.0f);
                        }
                        if (f6 > gm.L(20.0f) + f67Var3.getMeasuredHeight()) {
                            f6 = gm.L(20.0f) + f67Var3.getMeasuredHeight();
                        }
                        boolean z4 = (e47Var2.m.getScaleX() == 1.0f && e47Var2.m.getScaleY() == 1.0f) ? false : z2;
                        if (z4) {
                            canvas2.save();
                            arrayList4 = arrayList6;
                            f47Var = f47Var3;
                            f67Var = f67Var3;
                            canvas2.scale(e47Var2.m.getScaleX(), e47Var2.m.getScaleY(), aq1.z(f5, f3, 2.0f, f3), aq1.z(f6, f4, 2.0f, f4));
                        } else {
                            arrayList4 = arrayList6;
                            f47Var = f47Var3;
                            f67Var = f67Var3;
                        }
                        float f7 = f4;
                        float f8 = f6;
                        f67Var2 = f67Var;
                        arrayList5 = arrayList4;
                        j67Var = j67Var2;
                        f47 f47Var4 = f47Var;
                        i3 = i15;
                        e47Var2.m.K0(canvas, (int) f3, (int) f4, (int) f5, (int) f6, e47Var2.k, e47Var2.l, false, 0);
                        e47Var2.m = null;
                        e47Var2.o = f47Var4.c;
                        if (z4) {
                            canvas.restore();
                            for (int i16 = 0; i16 < childCount2; i16++) {
                                View childAt4 = f67Var2.getChildAt(i16);
                                if (childAt4 instanceof rc2) {
                                    rc2 rc2Var3 = (rc2) childAt4;
                                    if (rc2Var3.getCurrentMessagesGroup() == f47Var4) {
                                        int left = rc2Var3.getLeft();
                                        int top = rc2Var3.getTop();
                                        childAt4.setPivotX(((f5 - f3) / 2.0f) + (f3 - left));
                                        childAt4.setPivotY(((f8 - f7) / 2.0f) + (f7 - top));
                                    }
                                }
                            }
                        }
                    }
                    i15 = i3 + 1;
                    canvas2 = canvas;
                    f67Var3 = f67Var2;
                    j67Var2 = j67Var;
                    arrayList6 = arrayList5;
                    z2 = true;
                }
            }
            i12++;
            canvas2 = canvas;
            f67Var3 = f67Var3;
            j67Var2 = j67Var2;
            z = false;
            z2 = true;
        }
        ArrayList arrayList7 = arrayList;
        f67 f67Var4 = f67Var3;
        j67 j67Var3 = j67Var2;
        float f9 = 0.0f;
        super.dispatchDraw(canvas);
        int childCount3 = getChildCount();
        f47 f47Var5 = null;
        int i17 = 0;
        while (i17 < childCount3) {
            View childAt5 = getChildAt(i17);
            if (childAt5 instanceof rc2) {
                rc2 rc2Var4 = (rc2) childAt5;
                f47 currentMessagesGroup4 = rc2Var4.getCurrentMessagesGroup();
                if (currentMessagesGroup4 == null) {
                    i2 = i;
                    f = f9;
                    j67Var3.h(rc2Var4.getBoundsLeft(), rc2Var4.getY(), rc2Var4.getBoundsRight(), rc2Var4.getY() + rc2Var4.getHeight(), canvas);
                } else if (currentMessagesGroup4 != f47Var5) {
                    i2 = i;
                    f = f9;
                }
                f47Var5 = currentMessagesGroup4;
                i17++;
                i = i2;
                f9 = f;
            }
            i2 = i;
            f = f9;
            i17++;
            i = i2;
            f9 = f;
        }
        int i18 = i;
        float f10 = f9;
        int i19 = 0;
        while (i19 < i18) {
            arrayList7.clear();
            if (i19 != 2 || f67Var4.W1) {
                int i20 = 0;
                while (i20 < childCount3) {
                    View childAt6 = f67Var4.getChildAt(i20);
                    if (childAt6 instanceof rc2) {
                        rc2 rc2Var5 = (rc2) childAt6;
                        if (childAt6.getY() <= f67Var4.getHeight() && childAt6.getY() + childAt6.getHeight() >= f10 && (currentMessagesGroup = rc2Var5.getCurrentMessagesGroup()) != null) {
                            e47 e47Var3 = currentMessagesGroup.m;
                            int i21 = i19 == 0 ? 1 : 1;
                            if ((i19 != i21 || e47Var3.i) && ((i19 != 0 || !rc2Var5.getMessageObject().Z) && (i19 != 1 || rc2Var5.getMessageObject().Z))) {
                                boolean z5 = rc2Var5.La;
                                if (i19 != 2 ? !z5 : z5) {
                                    arrayList3 = arrayList7;
                                    if (!arrayList3.contains(currentMessagesGroup)) {
                                        e47Var3.a = 0;
                                        e47Var3.b = 0;
                                        e47Var3.c = 0;
                                        e47Var3.d = 0;
                                        e47Var3.l = false;
                                        e47Var3.k = false;
                                        e47Var3.m = rc2Var5;
                                        arrayList3.add(currentMessagesGroup);
                                    }
                                    e47Var3.k = rc2Var5.L2();
                                    e47Var3.l = rc2Var5.K2();
                                    int x3 = (int) (rc2Var5.getX() + rc2Var5.getBackgroundDrawableLeft());
                                    int x4 = (int) (rc2Var5.getX() + rc2Var5.getBackgroundDrawableRight());
                                    int y3 = (int) (rc2Var5.getY() + rc2Var5.getPaddingTop() + rc2Var5.getBackgroundDrawableTop());
                                    int y4 = (int) (rc2Var5.getY() + rc2Var5.getPaddingTop() + rc2Var5.getBackgroundDrawableBottom());
                                    if ((rc2Var5.getCurrentPosition().l & 4) == 0) {
                                        y3 -= gm.L(10.0f);
                                    }
                                    if ((rc2Var5.getCurrentPosition().l & 8) == 0) {
                                        y4 += gm.L(10.0f);
                                    }
                                    if (rc2Var5.La) {
                                        e47Var3.m = rc2Var5;
                                    }
                                    int i22 = e47Var3.b;
                                    if (i22 == 0 || y3 < i22) {
                                        e47Var3.b = y3;
                                    }
                                    int i23 = e47Var3.d;
                                    if (i23 == 0 || y4 > i23) {
                                        e47Var3.d = y4;
                                    }
                                    int i24 = e47Var3.a;
                                    if (i24 == 0 || x3 < i24) {
                                        e47Var3.a = x3;
                                    }
                                    int i25 = e47Var3.c;
                                    if (i25 == 0 || x4 > i25) {
                                        e47Var3.c = x4;
                                    }
                                    i20++;
                                    arrayList7 = arrayList3;
                                }
                            }
                        }
                    }
                    arrayList3 = arrayList7;
                    i20++;
                    arrayList7 = arrayList3;
                }
                arrayList2 = arrayList7;
                for (int i26 = 0; i26 < arrayList2.size(); i26++) {
                    e47 e47Var4 = ((f47) arrayList2.get(i26)).m;
                    float U12 = e47Var4.m.U1(true);
                    float f11 = e47Var4.a + U12 + e47Var4.e;
                    float f12 = e47Var4.b + e47Var4.f;
                    float f13 = e47Var4.c + U12 + e47Var4.g;
                    float f14 = e47Var4.d + e47Var4.h;
                    if (f12 < (-gm.L(20.0f))) {
                        f12 = -gm.L(20.0f);
                    }
                    if (f14 > gm.L(20.0f) + f67Var4.getMeasuredHeight()) {
                        f14 = gm.L(20.0f) + f67Var4.getMeasuredHeight();
                    }
                    float f15 = f14;
                    j67 j67Var4 = j67Var3;
                    j67Var4.h(f11, f12, f13, f15, canvas);
                    j67Var3 = j67Var4;
                    e47Var4.m = null;
                }
            } else {
                arrayList2 = arrayList7;
            }
            i19++;
            arrayList7 = arrayList2;
        }
        canvas.save();
        float d = this.g3.d(canScrollVertically(-1));
        float d2 = this.h3.d(canScrollVertically(1));
        RectF rectF2 = gm.P;
        rectF2.set(f10, getScrollY(), getWidth(), gm.L(14.0f) + getScrollY());
        in3 in3Var = this.i3;
        in3Var.r(canvas, rectF2, 1, d);
        rectF2.set(f10, (getHeight() + getScrollY()) - gm.L(14.0f), getWidth(), getHeight() + getScrollY());
        in3Var.r(canvas, rectF2, i18, d2);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        rc2 rc2Var;
        j67 j67Var = this.j3;
        if (j67Var.w && ((view == (rc2Var = j67Var.Q) && rc2Var != null && rc2Var.getCurrentPosition() == null) || view == j67Var.X)) {
            return false;
        }
        if (!(view instanceof rc2)) {
            return true;
        }
        rc2 rc2Var2 = (rc2) view;
        rc2Var2.setInvalidatesParent(true);
        rc2Var2.S0(canvas);
        canvas.save();
        canvas.translate(rc2Var2.getX(), rc2Var2.getY());
        canvas.scale(rc2Var2.getScaleX(), rc2Var2.getScaleY(), rc2Var2.getPivotX(), rc2Var2.getPivotY());
        if (rc2Var2.L0() && rc2Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, rc2Var2.getPaddingTop());
            rc2Var2.M0(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.save();
        canvas.translate(rc2Var2.getX(), rc2Var2.getY() + rc2Var2.getPaddingTop());
        canvas.scale(rc2Var2.getScaleX(), rc2Var2.getScaleY(), rc2Var2.getPivotX(), rc2Var2.getPivotY());
        if (rc2Var2.getCurrentPosition() != null && (((rc2Var2.getCurrentPosition().l & rc2Var2.C()) != 0 && (rc2Var2.getCurrentPosition().l & 1) != 0) || (rc2Var2.getCurrentMessagesGroup() != null && rc2Var2.getCurrentMessagesGroup().i))) {
            rc2Var2.Q0(rc2Var2.getAlpha(), canvas, false);
        }
        if (rc2Var2.getCurrentPosition() != null && (((rc2Var2.getCurrentPosition().l & 8) != 0 && (rc2Var2.getCurrentPosition().l & 1) != 0) || (rc2Var2.getCurrentMessagesGroup() != null && rc2Var2.getCurrentMessagesGroup().i))) {
            rc2Var2.q1(canvas, rc2Var2.getAlpha(), null);
            rc2Var2.V0(canvas, rc2Var2.getAlpha());
        }
        if (rc2Var2.getCurrentPosition() != null) {
            rc2Var2.h1(canvas, rc2Var2.getAlpha());
        }
        if (rc2Var2.getCurrentPosition() == null || rc2Var2.getCurrentPosition().h) {
            rc2Var2.A1(rc2Var2.getAlpha(), canvas, true);
        }
        rc2Var2.i1(canvas);
        rc2Var2.getTransitionParams().d();
        canvas.restore();
        rc2Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getTop() != 0 && (childAt instanceof i67)) {
                i67 i67Var = (i67) childAt;
                i67Var.Ld = childAt.getTop();
                i67Var.Md = childAt.getBottom();
                i67Var.Nd = i67Var.getMessageObject().e1();
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        j67 j67Var = this.j3;
        int L = gm.L(j67Var.N.isEmpty() ? -6.0f : 48.0f);
        ViewGroup viewGroup = j67Var.Z;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((gm.q.y - (L + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight()))) - gm.L(8.0f)) - j67Var.d.b), TLObject.FLAG_31));
        int max = Math.max(gm.L(12.0f) + (j67Var.p0 ? j67Var.Y : j67Var.W.l()), -((gm.L(7.0f) + j67Var.r0[0]) - getMeasuredWidth()));
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - gm.L(8.0f)) + Math.max(0, j67Var.O - ((getMeasuredWidth() - max) - gm.L((j67Var.P.i() ? 0 : 40) + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
