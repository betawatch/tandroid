// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class f47 extends o39 {
    public final ArrayList f3;
    public final lm g3;
    public final lm h3;
    public final xl3 i3;
    public final /* synthetic */ j47 j3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f47(j47 j47Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.j3 = j47Var;
        this.f3 = new ArrayList(10);
        s33 s33Var = s33.h;
        this.g3 = new lm(this, 0L, 360L, s33Var);
        this.h3 = new lm(this, 0L, 360L, s33Var);
        this.i3 = new xl3((byte) 7);
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
    @Override // o39, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        ArrayList arrayList3;
        f27 currentMessagesGroup;
        int i2;
        float f;
        ArrayList arrayList4;
        f27 f27Var;
        f47 f47Var;
        f47 f47Var2;
        ArrayList arrayList5;
        j47 j47Var;
        int i3;
        f27 currentMessagesGroup2;
        int x;
        int x2;
        int y;
        int y2;
        int i4;
        int i5;
        int i6;
        int i7;
        f27 currentMessagesGroup3;
        j47 j47Var2 = this.j3;
        e47 e47Var = j47Var2.G;
        int measuredHeight = e47Var.getMeasuredHeight();
        f47 f47Var3 = j47Var2.K;
        int childCount = f47Var3.getChildCount();
        boolean z = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = f47Var3.getChildAt(i8);
            if (childAt instanceof gb2) {
                gb2 gb2Var = (gb2) childAt;
                RectF rectF = zec.h;
                zec.c(gb2Var, e47Var, rectF);
                float f2 = rectF.top;
                int i9 = (int) f2;
                childAt.getMeasuredHeight();
                int i10 = i9 >= 0 ? 0 : -i9;
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i10 + measuredHeight;
                }
                gb2Var.D3(i10, measuredHeight2 - i10, measuredHeight, f2, f2, e47Var.getMeasuredWidth(), e47Var.getMeasuredHeight(), 0, 0, 0);
            }
        }
        boolean z2 = true;
        canvas.saveLayerAlpha(0.0f, getScrollY() + 1, getWidth(), (getHeight() + getScrollY()) - 1, kk7.d4, 31);
        Canvas canvas2 = canvas;
        canvas2.save();
        int childCount2 = getChildCount();
        f27 f27Var2 = null;
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if ((childAt2 instanceof gb2) && ((currentMessagesGroup3 = ((gb2) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup3 != f27Var2)) {
                f27Var2 = currentMessagesGroup3;
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
            if (i12 != 2 || f47Var3.W1) {
                int i14 = z ? 1 : 0;
                ?? r9 = z;
                while (i14 < childCount2) {
                    View childAt3 = f47Var3.getChildAt(i14);
                    if (childAt3 instanceof gb2) {
                        gb2 gb2Var2 = (gb2) childAt3;
                        if (childAt3.getY() <= f47Var3.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup2 = gb2Var2.getCurrentMessagesGroup()) != null) {
                            e27 e27Var = currentMessagesGroup2.m;
                            if ((i12 != 0 || currentMessagesGroup2.d.size() != z2) && ((i12 != z2 || e27Var.i) && ((i12 != 0 || !gb2Var2.getMessageObject().Z) && (i12 != z2 || gb2Var2.getMessageObject().Z)))) {
                                boolean z3 = gb2Var2.La;
                                if (i12 == i13) {
                                    if (!z3) {
                                    }
                                    if (!arrayList.contains(currentMessagesGroup2)) {
                                        e27Var.a = r9;
                                        e27Var.b = r9;
                                        e27Var.c = r9;
                                        e27Var.d = r9;
                                        e27Var.l = r9;
                                        e27Var.k = r9;
                                        e27Var.m = gb2Var2;
                                        arrayList.add(currentMessagesGroup2);
                                    }
                                    e27Var.k = gb2Var2.L2();
                                    e27Var.l = gb2Var2.K2();
                                    x = (int) (gb2Var2.getX() + gb2Var2.getBackgroundDrawableLeft());
                                    x2 = (int) (gb2Var2.getX() + gb2Var2.getBackgroundDrawableRight());
                                    y = (int) (gb2Var2.getY() + gb2Var2.getPaddingTop() + gb2Var2.getBackgroundDrawableTop());
                                    y2 = (int) (gb2Var2.getY() + gb2Var2.getPaddingTop() + gb2Var2.getBackgroundDrawableBottom());
                                    if ((gb2Var2.getCurrentPosition().l & 4) == 0) {
                                        y -= gl.L(10.0f);
                                    }
                                    if ((gb2Var2.getCurrentPosition().l & 8) == 0) {
                                        y2 += gl.L(10.0f);
                                    }
                                    if (gb2Var2.La) {
                                        e27Var.m = gb2Var2;
                                    }
                                    i4 = e27Var.b;
                                    if (i4 != 0 || y < i4) {
                                        e27Var.b = y;
                                    }
                                    i5 = e27Var.d;
                                    if (i5 != 0 || y2 > i5) {
                                        e27Var.d = y2;
                                    }
                                    i6 = e27Var.a;
                                    if (i6 != 0 || x < i6) {
                                        e27Var.a = x;
                                    }
                                    i7 = e27Var.c;
                                    if (i7 != 0 || x2 > i7) {
                                        e27Var.c = x2;
                                    }
                                } else {
                                    if (z3) {
                                    }
                                    if (!arrayList.contains(currentMessagesGroup2)) {
                                    }
                                    e27Var.k = gb2Var2.L2();
                                    e27Var.l = gb2Var2.K2();
                                    x = (int) (gb2Var2.getX() + gb2Var2.getBackgroundDrawableLeft());
                                    x2 = (int) (gb2Var2.getX() + gb2Var2.getBackgroundDrawableRight());
                                    y = (int) (gb2Var2.getY() + gb2Var2.getPaddingTop() + gb2Var2.getBackgroundDrawableTop());
                                    y2 = (int) (gb2Var2.getY() + gb2Var2.getPaddingTop() + gb2Var2.getBackgroundDrawableBottom());
                                    if ((gb2Var2.getCurrentPosition().l & 4) == 0) {
                                    }
                                    if ((gb2Var2.getCurrentPosition().l & 8) == 0) {
                                    }
                                    if (gb2Var2.La) {
                                    }
                                    i4 = e27Var.b;
                                    if (i4 != 0) {
                                    }
                                    e27Var.b = y;
                                    i5 = e27Var.d;
                                    if (i5 != 0) {
                                    }
                                    e27Var.d = y2;
                                    i6 = e27Var.a;
                                    if (i6 != 0) {
                                    }
                                    e27Var.a = x;
                                    i7 = e27Var.c;
                                    if (i7 != 0) {
                                    }
                                    e27Var.c = x2;
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
                    f27 f27Var3 = (f27) arrayList6.get(i15);
                    if (f27Var3 == null) {
                        arrayList5 = arrayList6;
                        f47Var2 = f47Var3;
                        j47Var = j47Var2;
                        i3 = i15;
                    } else {
                        e27 e27Var2 = f27Var3.m;
                        float U1 = e27Var2.m.U1(z2);
                        float f3 = e27Var2.a + U1 + e27Var2.e;
                        float f4 = e27Var2.b + e27Var2.f;
                        float f5 = e27Var2.g + e27Var2.c + U1;
                        float f6 = e27Var2.d + e27Var2.h;
                        if (f4 < (-gl.L(20.0f))) {
                            f4 = -gl.L(20.0f);
                        }
                        if (f6 > gl.L(20.0f) + f47Var3.getMeasuredHeight()) {
                            f6 = gl.L(20.0f) + f47Var3.getMeasuredHeight();
                        }
                        boolean z4 = (e27Var2.m.getScaleX() == 1.0f && e27Var2.m.getScaleY() == 1.0f) ? false : z2;
                        if (z4) {
                            canvas2.save();
                            arrayList4 = arrayList6;
                            f27Var = f27Var3;
                            f47Var = f47Var3;
                            canvas2.scale(e27Var2.m.getScaleX(), e27Var2.m.getScaleY(), oo1.z(f5, f3, 2.0f, f3), oo1.z(f6, f4, 2.0f, f4));
                        } else {
                            arrayList4 = arrayList6;
                            f27Var = f27Var3;
                            f47Var = f47Var3;
                        }
                        float f7 = f4;
                        float f8 = f6;
                        f47Var2 = f47Var;
                        arrayList5 = arrayList4;
                        j47Var = j47Var2;
                        f27 f27Var4 = f27Var;
                        i3 = i15;
                        e27Var2.m.K0(canvas, (int) f3, (int) f4, (int) f5, (int) f6, e27Var2.k, e27Var2.l, false, 0);
                        e27Var2.m = null;
                        e27Var2.o = f27Var4.c;
                        if (z4) {
                            canvas.restore();
                            for (int i16 = 0; i16 < childCount2; i16++) {
                                View childAt4 = f47Var2.getChildAt(i16);
                                if (childAt4 instanceof gb2) {
                                    gb2 gb2Var3 = (gb2) childAt4;
                                    if (gb2Var3.getCurrentMessagesGroup() == f27Var4) {
                                        int left = gb2Var3.getLeft();
                                        int top = gb2Var3.getTop();
                                        childAt4.setPivotX(((f5 - f3) / 2.0f) + (f3 - left));
                                        childAt4.setPivotY(((f8 - f7) / 2.0f) + (f7 - top));
                                    }
                                }
                            }
                        }
                    }
                    i15 = i3 + 1;
                    canvas2 = canvas;
                    f47Var3 = f47Var2;
                    j47Var2 = j47Var;
                    arrayList6 = arrayList5;
                    z2 = true;
                }
            }
            i12++;
            canvas2 = canvas;
            f47Var3 = f47Var3;
            j47Var2 = j47Var2;
            z = false;
            z2 = true;
        }
        ArrayList arrayList7 = arrayList;
        f47 f47Var4 = f47Var3;
        j47 j47Var3 = j47Var2;
        float f9 = 0.0f;
        super.dispatchDraw(canvas);
        int childCount3 = getChildCount();
        f27 f27Var5 = null;
        int i17 = 0;
        while (i17 < childCount3) {
            View childAt5 = getChildAt(i17);
            if (childAt5 instanceof gb2) {
                gb2 gb2Var4 = (gb2) childAt5;
                f27 currentMessagesGroup4 = gb2Var4.getCurrentMessagesGroup();
                if (currentMessagesGroup4 == null) {
                    i2 = i;
                    f = f9;
                    j47Var3.h(gb2Var4.getBoundsLeft(), gb2Var4.getY(), gb2Var4.getBoundsRight(), gb2Var4.getY() + gb2Var4.getHeight(), canvas);
                } else if (currentMessagesGroup4 != f27Var5) {
                    i2 = i;
                    f = f9;
                }
                f27Var5 = currentMessagesGroup4;
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
            if (i19 != 2 || f47Var4.W1) {
                int i20 = 0;
                while (i20 < childCount3) {
                    View childAt6 = f47Var4.getChildAt(i20);
                    if (childAt6 instanceof gb2) {
                        gb2 gb2Var5 = (gb2) childAt6;
                        if (childAt6.getY() <= f47Var4.getHeight() && childAt6.getY() + childAt6.getHeight() >= f10 && (currentMessagesGroup = gb2Var5.getCurrentMessagesGroup()) != null) {
                            e27 e27Var3 = currentMessagesGroup.m;
                            int i21 = i19 == 0 ? 1 : 1;
                            if ((i19 != i21 || e27Var3.i) && ((i19 != 0 || !gb2Var5.getMessageObject().Z) && (i19 != 1 || gb2Var5.getMessageObject().Z))) {
                                boolean z5 = gb2Var5.La;
                                if (i19 != 2 ? !z5 : z5) {
                                    arrayList3 = arrayList7;
                                    if (!arrayList3.contains(currentMessagesGroup)) {
                                        e27Var3.a = 0;
                                        e27Var3.b = 0;
                                        e27Var3.c = 0;
                                        e27Var3.d = 0;
                                        e27Var3.l = false;
                                        e27Var3.k = false;
                                        e27Var3.m = gb2Var5;
                                        arrayList3.add(currentMessagesGroup);
                                    }
                                    e27Var3.k = gb2Var5.L2();
                                    e27Var3.l = gb2Var5.K2();
                                    int x3 = (int) (gb2Var5.getX() + gb2Var5.getBackgroundDrawableLeft());
                                    int x4 = (int) (gb2Var5.getX() + gb2Var5.getBackgroundDrawableRight());
                                    int y3 = (int) (gb2Var5.getY() + gb2Var5.getPaddingTop() + gb2Var5.getBackgroundDrawableTop());
                                    int y4 = (int) (gb2Var5.getY() + gb2Var5.getPaddingTop() + gb2Var5.getBackgroundDrawableBottom());
                                    if ((gb2Var5.getCurrentPosition().l & 4) == 0) {
                                        y3 -= gl.L(10.0f);
                                    }
                                    if ((gb2Var5.getCurrentPosition().l & 8) == 0) {
                                        y4 += gl.L(10.0f);
                                    }
                                    if (gb2Var5.La) {
                                        e27Var3.m = gb2Var5;
                                    }
                                    int i22 = e27Var3.b;
                                    if (i22 == 0 || y3 < i22) {
                                        e27Var3.b = y3;
                                    }
                                    int i23 = e27Var3.d;
                                    if (i23 == 0 || y4 > i23) {
                                        e27Var3.d = y4;
                                    }
                                    int i24 = e27Var3.a;
                                    if (i24 == 0 || x3 < i24) {
                                        e27Var3.a = x3;
                                    }
                                    int i25 = e27Var3.c;
                                    if (i25 == 0 || x4 > i25) {
                                        e27Var3.c = x4;
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
                    e27 e27Var4 = ((f27) arrayList2.get(i26)).m;
                    float U12 = e27Var4.m.U1(true);
                    float f11 = e27Var4.a + U12 + e27Var4.e;
                    float f12 = e27Var4.b + e27Var4.f;
                    float f13 = e27Var4.c + U12 + e27Var4.g;
                    float f14 = e27Var4.d + e27Var4.h;
                    if (f12 < (-gl.L(20.0f))) {
                        f12 = -gl.L(20.0f);
                    }
                    if (f14 > gl.L(20.0f) + f47Var4.getMeasuredHeight()) {
                        f14 = gl.L(20.0f) + f47Var4.getMeasuredHeight();
                    }
                    float f15 = f14;
                    j47 j47Var4 = j47Var3;
                    j47Var4.h(f11, f12, f13, f15, canvas);
                    j47Var3 = j47Var4;
                    e27Var4.m = null;
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
        RectF rectF2 = gl.P;
        rectF2.set(f10, getScrollY(), getWidth(), gl.L(14.0f) + getScrollY());
        xl3 xl3Var = this.i3;
        xl3Var.s(canvas, rectF2, 1, d);
        rectF2.set(f10, (getHeight() + getScrollY()) - gl.L(14.0f), getWidth(), getHeight() + getScrollY());
        xl3Var.s(canvas, rectF2, i18, d2);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        gb2 gb2Var;
        j47 j47Var = this.j3;
        if (j47Var.w && ((view == (gb2Var = j47Var.Q) && gb2Var != null && gb2Var.getCurrentPosition() == null) || view == j47Var.X)) {
            return false;
        }
        if (!(view instanceof gb2)) {
            return true;
        }
        gb2 gb2Var2 = (gb2) view;
        gb2Var2.setInvalidatesParent(true);
        gb2Var2.S0(canvas);
        canvas.save();
        canvas.translate(gb2Var2.getX(), gb2Var2.getY());
        canvas.scale(gb2Var2.getScaleX(), gb2Var2.getScaleY(), gb2Var2.getPivotX(), gb2Var2.getPivotY());
        if (gb2Var2.L0() && gb2Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, gb2Var2.getPaddingTop());
            gb2Var2.M0(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.save();
        canvas.translate(gb2Var2.getX(), gb2Var2.getY() + gb2Var2.getPaddingTop());
        canvas.scale(gb2Var2.getScaleX(), gb2Var2.getScaleY(), gb2Var2.getPivotX(), gb2Var2.getPivotY());
        if (gb2Var2.getCurrentPosition() != null && (((gb2Var2.getCurrentPosition().l & gb2Var2.H()) != 0 && (gb2Var2.getCurrentPosition().l & 1) != 0) || (gb2Var2.getCurrentMessagesGroup() != null && gb2Var2.getCurrentMessagesGroup().i))) {
            gb2Var2.Q0(gb2Var2.getAlpha(), canvas, false);
        }
        if (gb2Var2.getCurrentPosition() != null && (((gb2Var2.getCurrentPosition().l & 8) != 0 && (gb2Var2.getCurrentPosition().l & 1) != 0) || (gb2Var2.getCurrentMessagesGroup() != null && gb2Var2.getCurrentMessagesGroup().i))) {
            gb2Var2.q1(canvas, gb2Var2.getAlpha(), null);
            gb2Var2.V0(canvas, gb2Var2.getAlpha());
        }
        if (gb2Var2.getCurrentPosition() != null) {
            gb2Var2.h1(canvas, gb2Var2.getAlpha());
        }
        if (gb2Var2.getCurrentPosition() == null || gb2Var2.getCurrentPosition().h) {
            gb2Var2.A1(gb2Var2.getAlpha(), canvas, true);
        }
        gb2Var2.i1(canvas);
        gb2Var2.getTransitionParams().d();
        canvas.restore();
        gb2Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getTop() != 0 && (childAt instanceof i47)) {
                i47 i47Var = (i47) childAt;
                i47Var.Ld = childAt.getTop();
                i47Var.Md = childAt.getBottom();
                i47Var.Nd = i47Var.getMessageObject().e1();
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        j47 j47Var = this.j3;
        int L = gl.L(j47Var.N.isEmpty() ? -6.0f : 48.0f);
        ViewGroup viewGroup = j47Var.Z;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((gl.q.y - (L + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight()))) - gl.L(8.0f)) - j47Var.d.b), TLObject.FLAG_31));
        int max = Math.max(gl.L(12.0f) + (j47Var.p0 ? j47Var.Y : j47Var.W.l()), -((gl.L(7.0f) + j47Var.r0[0]) - getMeasuredWidth()));
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - gl.L(8.0f)) + Math.max(0, j47Var.O - ((getMeasuredWidth() - max) - gl.L((j47Var.P.i() ? 0 : 40) + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
