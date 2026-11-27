// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class m67 extends d79 {
    public final ArrayList f3;
    public final mm g3;
    public final mm h3;
    public final pm3 i3;
    public final /* synthetic */ q67 j3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m67(q67 q67Var, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.j3 = q67Var;
        this.f3 = new ArrayList(10);
        k43 k43Var = k43.h;
        this.g3 = new mm(this, 0L, 360L, k43Var);
        this.h3 = new mm(this, 0L, 360L, k43Var);
        this.i3 = new pm3((byte) 7);
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
    @Override // d79, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        ArrayList arrayList3;
        m47 currentMessagesGroup;
        int i2;
        float f;
        ArrayList arrayList4;
        m47 m47Var;
        m67 m67Var;
        m67 m67Var2;
        ArrayList arrayList5;
        q67 q67Var;
        int i3;
        m47 currentMessagesGroup2;
        int x;
        int x2;
        int y;
        int y2;
        int i4;
        int i5;
        int i6;
        int i7;
        m47 currentMessagesGroup3;
        q67 q67Var2 = this.j3;
        l67 l67Var = q67Var2.G;
        int measuredHeight = l67Var.getMeasuredHeight();
        m67 m67Var3 = q67Var2.K;
        int childCount = m67Var3.getChildCount();
        boolean z = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = m67Var3.getChildAt(i8);
            if (childAt instanceof wb2) {
                wb2 wb2Var = (wb2) childAt;
                RectF rectF = yic.h;
                yic.c(wb2Var, l67Var, rectF);
                float f2 = rectF.top;
                int i9 = (int) f2;
                childAt.getMeasuredHeight();
                int i10 = i9 >= 0 ? 0 : -i9;
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i10 + measuredHeight;
                }
                wb2Var.D3(i10, measuredHeight2 - i10, measuredHeight, f2, f2, l67Var.getMeasuredWidth(), l67Var.getMeasuredHeight(), 0, 0, 0);
            }
        }
        boolean z2 = true;
        canvas.saveLayerAlpha(0.0f, getScrollY() + 1, getWidth(), (getHeight() + getScrollY()) - 1, jn7.d4, 31);
        Canvas canvas2 = canvas;
        canvas2.save();
        int childCount2 = getChildCount();
        m47 m47Var2 = null;
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if ((childAt2 instanceof wb2) && ((currentMessagesGroup3 = ((wb2) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup3 != m47Var2)) {
                m47Var2 = currentMessagesGroup3;
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
            if (i12 != 2 || m67Var3.W1) {
                int i14 = z ? 1 : 0;
                ?? r9 = z;
                while (i14 < childCount2) {
                    View childAt3 = m67Var3.getChildAt(i14);
                    if (childAt3 instanceof wb2) {
                        wb2 wb2Var2 = (wb2) childAt3;
                        if (childAt3.getY() <= m67Var3.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup2 = wb2Var2.getCurrentMessagesGroup()) != null) {
                            l47 l47Var = currentMessagesGroup2.m;
                            if ((i12 != 0 || currentMessagesGroup2.d.size() != z2) && ((i12 != z2 || l47Var.i) && ((i12 != 0 || !wb2Var2.getMessageObject().Z) && (i12 != z2 || wb2Var2.getMessageObject().Z)))) {
                                boolean z3 = wb2Var2.La;
                                if (i12 == i13) {
                                    if (!z3) {
                                    }
                                    if (!arrayList.contains(currentMessagesGroup2)) {
                                        l47Var.a = r9;
                                        l47Var.b = r9;
                                        l47Var.c = r9;
                                        l47Var.d = r9;
                                        l47Var.l = r9;
                                        l47Var.k = r9;
                                        l47Var.m = wb2Var2;
                                        arrayList.add(currentMessagesGroup2);
                                    }
                                    l47Var.k = wb2Var2.L2();
                                    l47Var.l = wb2Var2.K2();
                                    x = (int) (wb2Var2.getX() + wb2Var2.getBackgroundDrawableLeft());
                                    x2 = (int) (wb2Var2.getX() + wb2Var2.getBackgroundDrawableRight());
                                    y = (int) (wb2Var2.getY() + wb2Var2.getPaddingTop() + wb2Var2.getBackgroundDrawableTop());
                                    y2 = (int) (wb2Var2.getY() + wb2Var2.getPaddingTop() + wb2Var2.getBackgroundDrawableBottom());
                                    if ((wb2Var2.getCurrentPosition().l & 4) == 0) {
                                        y -= hl.L(10.0f);
                                    }
                                    if ((wb2Var2.getCurrentPosition().l & 8) == 0) {
                                        y2 += hl.L(10.0f);
                                    }
                                    if (wb2Var2.La) {
                                        l47Var.m = wb2Var2;
                                    }
                                    i4 = l47Var.b;
                                    if (i4 != 0 || y < i4) {
                                        l47Var.b = y;
                                    }
                                    i5 = l47Var.d;
                                    if (i5 != 0 || y2 > i5) {
                                        l47Var.d = y2;
                                    }
                                    i6 = l47Var.a;
                                    if (i6 != 0 || x < i6) {
                                        l47Var.a = x;
                                    }
                                    i7 = l47Var.c;
                                    if (i7 != 0 || x2 > i7) {
                                        l47Var.c = x2;
                                    }
                                } else {
                                    if (z3) {
                                    }
                                    if (!arrayList.contains(currentMessagesGroup2)) {
                                    }
                                    l47Var.k = wb2Var2.L2();
                                    l47Var.l = wb2Var2.K2();
                                    x = (int) (wb2Var2.getX() + wb2Var2.getBackgroundDrawableLeft());
                                    x2 = (int) (wb2Var2.getX() + wb2Var2.getBackgroundDrawableRight());
                                    y = (int) (wb2Var2.getY() + wb2Var2.getPaddingTop() + wb2Var2.getBackgroundDrawableTop());
                                    y2 = (int) (wb2Var2.getY() + wb2Var2.getPaddingTop() + wb2Var2.getBackgroundDrawableBottom());
                                    if ((wb2Var2.getCurrentPosition().l & 4) == 0) {
                                    }
                                    if ((wb2Var2.getCurrentPosition().l & 8) == 0) {
                                    }
                                    if (wb2Var2.La) {
                                    }
                                    i4 = l47Var.b;
                                    if (i4 != 0) {
                                    }
                                    l47Var.b = y;
                                    i5 = l47Var.d;
                                    if (i5 != 0) {
                                    }
                                    l47Var.d = y2;
                                    i6 = l47Var.a;
                                    if (i6 != 0) {
                                    }
                                    l47Var.a = x;
                                    i7 = l47Var.c;
                                    if (i7 != 0) {
                                    }
                                    l47Var.c = x2;
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
                    m47 m47Var3 = (m47) arrayList6.get(i15);
                    if (m47Var3 == null) {
                        arrayList5 = arrayList6;
                        m67Var2 = m67Var3;
                        q67Var = q67Var2;
                        i3 = i15;
                    } else {
                        l47 l47Var2 = m47Var3.m;
                        float U1 = l47Var2.m.U1(z2);
                        float f3 = l47Var2.a + U1 + l47Var2.e;
                        float f4 = l47Var2.b + l47Var2.f;
                        float f5 = l47Var2.g + l47Var2.c + U1;
                        float f6 = l47Var2.d + l47Var2.h;
                        if (f4 < (-hl.L(20.0f))) {
                            f4 = -hl.L(20.0f);
                        }
                        if (f6 > hl.L(20.0f) + m67Var3.getMeasuredHeight()) {
                            f6 = hl.L(20.0f) + m67Var3.getMeasuredHeight();
                        }
                        boolean z4 = (l47Var2.m.getScaleX() == 1.0f && l47Var2.m.getScaleY() == 1.0f) ? false : z2;
                        if (z4) {
                            canvas2.save();
                            arrayList4 = arrayList6;
                            m47Var = m47Var3;
                            m67Var = m67Var3;
                            canvas2.scale(l47Var2.m.getScaleX(), l47Var2.m.getScaleY(), bp1.z(f5, f3, 2.0f, f3), bp1.z(f6, f4, 2.0f, f4));
                        } else {
                            arrayList4 = arrayList6;
                            m47Var = m47Var3;
                            m67Var = m67Var3;
                        }
                        float f7 = f4;
                        float f8 = f6;
                        m67Var2 = m67Var;
                        arrayList5 = arrayList4;
                        q67Var = q67Var2;
                        m47 m47Var4 = m47Var;
                        i3 = i15;
                        l47Var2.m.K0(canvas, (int) f3, (int) f4, (int) f5, (int) f6, l47Var2.k, l47Var2.l, false, 0);
                        l47Var2.m = null;
                        l47Var2.o = m47Var4.c;
                        if (z4) {
                            canvas.restore();
                            for (int i16 = 0; i16 < childCount2; i16++) {
                                View childAt4 = m67Var2.getChildAt(i16);
                                if (childAt4 instanceof wb2) {
                                    wb2 wb2Var3 = (wb2) childAt4;
                                    if (wb2Var3.getCurrentMessagesGroup() == m47Var4) {
                                        int left = wb2Var3.getLeft();
                                        int top = wb2Var3.getTop();
                                        childAt4.setPivotX(((f5 - f3) / 2.0f) + (f3 - left));
                                        childAt4.setPivotY(((f8 - f7) / 2.0f) + (f7 - top));
                                    }
                                }
                            }
                        }
                    }
                    i15 = i3 + 1;
                    canvas2 = canvas;
                    m67Var3 = m67Var2;
                    q67Var2 = q67Var;
                    arrayList6 = arrayList5;
                    z2 = true;
                }
            }
            i12++;
            canvas2 = canvas;
            m67Var3 = m67Var3;
            q67Var2 = q67Var2;
            z = false;
            z2 = true;
        }
        ArrayList arrayList7 = arrayList;
        m67 m67Var4 = m67Var3;
        q67 q67Var3 = q67Var2;
        float f9 = 0.0f;
        super.dispatchDraw(canvas);
        int childCount3 = getChildCount();
        m47 m47Var5 = null;
        int i17 = 0;
        while (i17 < childCount3) {
            View childAt5 = getChildAt(i17);
            if (childAt5 instanceof wb2) {
                wb2 wb2Var4 = (wb2) childAt5;
                m47 currentMessagesGroup4 = wb2Var4.getCurrentMessagesGroup();
                if (currentMessagesGroup4 == null) {
                    i2 = i;
                    f = f9;
                    q67Var3.h(wb2Var4.getBoundsLeft(), wb2Var4.getY(), wb2Var4.getBoundsRight(), wb2Var4.getY() + wb2Var4.getHeight(), canvas);
                } else if (currentMessagesGroup4 != m47Var5) {
                    i2 = i;
                    f = f9;
                }
                m47Var5 = currentMessagesGroup4;
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
            if (i19 != 2 || m67Var4.W1) {
                int i20 = 0;
                while (i20 < childCount3) {
                    View childAt6 = m67Var4.getChildAt(i20);
                    if (childAt6 instanceof wb2) {
                        wb2 wb2Var5 = (wb2) childAt6;
                        if (childAt6.getY() <= m67Var4.getHeight() && childAt6.getY() + childAt6.getHeight() >= f10 && (currentMessagesGroup = wb2Var5.getCurrentMessagesGroup()) != null) {
                            l47 l47Var3 = currentMessagesGroup.m;
                            int i21 = i19 == 0 ? 1 : 1;
                            if ((i19 != i21 || l47Var3.i) && ((i19 != 0 || !wb2Var5.getMessageObject().Z) && (i19 != 1 || wb2Var5.getMessageObject().Z))) {
                                boolean z5 = wb2Var5.La;
                                if (i19 != 2 ? !z5 : z5) {
                                    arrayList3 = arrayList7;
                                    if (!arrayList3.contains(currentMessagesGroup)) {
                                        l47Var3.a = 0;
                                        l47Var3.b = 0;
                                        l47Var3.c = 0;
                                        l47Var3.d = 0;
                                        l47Var3.l = false;
                                        l47Var3.k = false;
                                        l47Var3.m = wb2Var5;
                                        arrayList3.add(currentMessagesGroup);
                                    }
                                    l47Var3.k = wb2Var5.L2();
                                    l47Var3.l = wb2Var5.K2();
                                    int x3 = (int) (wb2Var5.getX() + wb2Var5.getBackgroundDrawableLeft());
                                    int x4 = (int) (wb2Var5.getX() + wb2Var5.getBackgroundDrawableRight());
                                    int y3 = (int) (wb2Var5.getY() + wb2Var5.getPaddingTop() + wb2Var5.getBackgroundDrawableTop());
                                    int y4 = (int) (wb2Var5.getY() + wb2Var5.getPaddingTop() + wb2Var5.getBackgroundDrawableBottom());
                                    if ((wb2Var5.getCurrentPosition().l & 4) == 0) {
                                        y3 -= hl.L(10.0f);
                                    }
                                    if ((wb2Var5.getCurrentPosition().l & 8) == 0) {
                                        y4 += hl.L(10.0f);
                                    }
                                    if (wb2Var5.La) {
                                        l47Var3.m = wb2Var5;
                                    }
                                    int i22 = l47Var3.b;
                                    if (i22 == 0 || y3 < i22) {
                                        l47Var3.b = y3;
                                    }
                                    int i23 = l47Var3.d;
                                    if (i23 == 0 || y4 > i23) {
                                        l47Var3.d = y4;
                                    }
                                    int i24 = l47Var3.a;
                                    if (i24 == 0 || x3 < i24) {
                                        l47Var3.a = x3;
                                    }
                                    int i25 = l47Var3.c;
                                    if (i25 == 0 || x4 > i25) {
                                        l47Var3.c = x4;
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
                    l47 l47Var4 = ((m47) arrayList2.get(i26)).m;
                    float U12 = l47Var4.m.U1(true);
                    float f11 = l47Var4.a + U12 + l47Var4.e;
                    float f12 = l47Var4.b + l47Var4.f;
                    float f13 = l47Var4.c + U12 + l47Var4.g;
                    float f14 = l47Var4.d + l47Var4.h;
                    if (f12 < (-hl.L(20.0f))) {
                        f12 = -hl.L(20.0f);
                    }
                    if (f14 > hl.L(20.0f) + m67Var4.getMeasuredHeight()) {
                        f14 = hl.L(20.0f) + m67Var4.getMeasuredHeight();
                    }
                    float f15 = f14;
                    q67 q67Var4 = q67Var3;
                    q67Var4.h(f11, f12, f13, f15, canvas);
                    q67Var3 = q67Var4;
                    l47Var4.m = null;
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
        RectF rectF2 = hl.P;
        rectF2.set(f10, getScrollY(), getWidth(), hl.L(14.0f) + getScrollY());
        pm3 pm3Var = this.i3;
        pm3Var.r(canvas, rectF2, 1, d);
        rectF2.set(f10, (getHeight() + getScrollY()) - hl.L(14.0f), getWidth(), getHeight() + getScrollY());
        pm3Var.r(canvas, rectF2, i18, d2);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        wb2 wb2Var;
        q67 q67Var = this.j3;
        if (q67Var.w && ((view == (wb2Var = q67Var.Q) && wb2Var != null && wb2Var.getCurrentPosition() == null) || view == q67Var.X)) {
            return false;
        }
        if (!(view instanceof wb2)) {
            return true;
        }
        wb2 wb2Var2 = (wb2) view;
        wb2Var2.setInvalidatesParent(true);
        wb2Var2.S0(canvas);
        canvas.save();
        canvas.translate(wb2Var2.getX(), wb2Var2.getY());
        canvas.scale(wb2Var2.getScaleX(), wb2Var2.getScaleY(), wb2Var2.getPivotX(), wb2Var2.getPivotY());
        if (wb2Var2.L0() && wb2Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, wb2Var2.getPaddingTop());
            wb2Var2.M0(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.save();
        canvas.translate(wb2Var2.getX(), wb2Var2.getY() + wb2Var2.getPaddingTop());
        canvas.scale(wb2Var2.getScaleX(), wb2Var2.getScaleY(), wb2Var2.getPivotX(), wb2Var2.getPivotY());
        if (wb2Var2.getCurrentPosition() != null && (((wb2Var2.getCurrentPosition().l & wb2Var2.G()) != 0 && (wb2Var2.getCurrentPosition().l & 1) != 0) || (wb2Var2.getCurrentMessagesGroup() != null && wb2Var2.getCurrentMessagesGroup().i))) {
            wb2Var2.Q0(wb2Var2.getAlpha(), canvas, false);
        }
        if (wb2Var2.getCurrentPosition() != null && (((wb2Var2.getCurrentPosition().l & 8) != 0 && (wb2Var2.getCurrentPosition().l & 1) != 0) || (wb2Var2.getCurrentMessagesGroup() != null && wb2Var2.getCurrentMessagesGroup().i))) {
            wb2Var2.q1(canvas, wb2Var2.getAlpha(), null);
            wb2Var2.V0(canvas, wb2Var2.getAlpha());
        }
        if (wb2Var2.getCurrentPosition() != null) {
            wb2Var2.h1(canvas, wb2Var2.getAlpha());
        }
        if (wb2Var2.getCurrentPosition() == null || wb2Var2.getCurrentPosition().h) {
            wb2Var2.A1(wb2Var2.getAlpha(), canvas, true);
        }
        wb2Var2.i1(canvas);
        wb2Var2.getTransitionParams().d();
        canvas.restore();
        wb2Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getTop() != 0 && (childAt instanceof p67)) {
                p67 p67Var = (p67) childAt;
                p67Var.Ld = childAt.getTop();
                p67Var.Md = childAt.getBottom();
                p67Var.Nd = p67Var.getMessageObject().e1();
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        q67 q67Var = this.j3;
        int L = hl.L(q67Var.N.isEmpty() ? -6.0f : 48.0f);
        ViewGroup viewGroup = q67Var.Z;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((hl.q.y - (L + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight()))) - hl.L(8.0f)) - q67Var.d.b), TLObject.FLAG_31));
        int max = Math.max(hl.L(12.0f) + (q67Var.p0 ? q67Var.Y : q67Var.W.l()), -((hl.L(7.0f) + q67Var.r0[0]) - getMeasuredWidth()));
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - hl.L(8.0f)) + Math.max(0, q67Var.O - ((getMeasuredWidth() - max) - hl.L((q67Var.P.i() ? 0 : 40) + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
