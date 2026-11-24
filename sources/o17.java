// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o17 extends o39 {
    public final ArrayList f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final /* synthetic */ ot7 k3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o17(ot7 ot7Var, Context context, t17 t17Var) {
        super(context, t17Var);
        this.k3 = ot7Var;
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
    @Override // o39, android.view.ViewGroup, android.view.View
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
        f27 currentMessagesGroup;
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
        f27 f27Var = null;
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
                if (childAt instanceof gb2) {
                    gb2 gb2Var = (gb2) childAt;
                    f27 currentMessagesGroup2 = gb2Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 == null || currentMessagesGroup2 != f27Var) {
                        c27 currentPosition = gb2Var.getCurrentPosition();
                        f17 backgroundDrawable = gb2Var.getBackgroundDrawable();
                        if ((backgroundDrawable.f || gb2Var.B2()) && (currentPosition == null || (currentPosition.l & 2) != 0)) {
                            int y = (int) gb2Var.getY();
                            canvas.save();
                            if (currentPosition == null) {
                                i10 = gb2Var.getMeasuredHeight();
                            } else {
                                int measuredHeight = gb2Var.getMeasuredHeight() + y;
                                long j = 0;
                                float f4 = 0.0f;
                                for (int i12 = 0; i12 < childCount; i12++) {
                                    View childAt2 = getChildAt(i12);
                                    if (childAt2 instanceof gb2) {
                                        gb2 gb2Var2 = (gb2) childAt2;
                                        if (gb2Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                            f17 backgroundDrawable2 = gb2Var2.getBackgroundDrawable();
                                            int min = Math.min(y, (int) gb2Var2.getY());
                                            int max = Math.max(measuredHeight, gb2Var2.getMeasuredHeight() + ((int) gb2Var2.getY()));
                                            long j2 = backgroundDrawable2.l;
                                            if (j2 > j) {
                                                float x = gb2Var2.getX() + backgroundDrawable2.h;
                                                f4 = gb2Var2.getY() + backgroundDrawable2.i;
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
                            backgroundDrawable.a.setColor(bkb.v0(bkb.xd, this.o2));
                            backgroundDrawable.setBounds(0, y, getMeasuredWidth(), i13);
                            backgroundDrawable.draw(canvas);
                            canvas.restore();
                        }
                        f27Var = currentMessagesGroup2;
                    }
                } else if (childAt instanceof uk1) {
                    uk1 uk1Var = (uk1) childAt;
                    if (uk1Var.T()) {
                        canvas.save();
                        canvas.translate(uk1Var.getX(), uk1Var.getY() + uk1Var.getPaddingTop());
                        canvas.scale(uk1Var.getScaleX(), uk1Var.getScaleY(), uk1Var.getMeasuredWidth() / 2.0f, uk1Var.getMeasuredHeight() / 2.0f);
                        uk1Var.J(canvas, true);
                        uk1Var.M(canvas, true);
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
                    if (childAt3 instanceof gb2) {
                        gb2 gb2Var3 = (gb2) childAt3;
                        if (childAt3.getY() <= getHeight() && childAt3.getY() + childAt3.getHeight() >= f && gb2Var3.getVisibility() != i && gb2Var3.getVisibility() != 8 && (currentMessagesGroup = gb2Var3.getCurrentMessagesGroup()) != null) {
                            e27 e27Var = currentMessagesGroup.m;
                            if ((i14 != 0 || currentMessagesGroup.d.size() != z) && ((i14 != z || e27Var.i) && ((i14 != 0 || !gb2Var3.getMessageObject().Z) && (i14 != z || gb2Var3.getMessageObject().Z)))) {
                                boolean z2 = gb2Var3.La;
                                if (i14 == i2) {
                                    if (!z2) {
                                    }
                                    if (!arrayList2.contains(currentMessagesGroup)) {
                                        e27Var.a = 0;
                                        e27Var.b = 0;
                                        e27Var.c = 0;
                                        e27Var.d = 0;
                                        e27Var.l = false;
                                        e27Var.k = false;
                                        e27Var.m = gb2Var3;
                                        arrayList2.add(currentMessagesGroup);
                                    }
                                    e27Var.k = gb2Var3.L2();
                                    e27Var.l = gb2Var3.K2();
                                    backgroundDrawableLeft = gb2Var3.getBackgroundDrawableLeft() + gb2Var3.getLeft();
                                    backgroundDrawableRight = gb2Var3.getBackgroundDrawableRight() + gb2Var3.getLeft();
                                    int backgroundDrawableTop = gb2Var3.getBackgroundDrawableTop() + gb2Var3.getPaddingTop() + gb2Var3.getTop();
                                    int backgroundDrawableBottom = gb2Var3.getBackgroundDrawableBottom() + gb2Var3.getPaddingTop() + gb2Var3.getTop();
                                    if ((gb2Var3.getCurrentPosition().l & i) == 0) {
                                        backgroundDrawableTop -= gl.L(10.0f);
                                    }
                                    i4 = backgroundDrawableTop;
                                    if ((gb2Var3.getCurrentPosition().l & 8) == 0) {
                                        backgroundDrawableBottom = gl.L(10.0f) + backgroundDrawableBottom;
                                    }
                                    i5 = backgroundDrawableBottom;
                                    if (gb2Var3.La) {
                                        e27Var.m = gb2Var3;
                                    }
                                    i6 = e27Var.b;
                                    if (i6 != 0 || i4 < i6) {
                                        e27Var.b = i4;
                                    }
                                    i7 = e27Var.d;
                                    if (i7 != 0 || i5 > i7) {
                                        e27Var.d = i5;
                                    }
                                    i8 = e27Var.a;
                                    if (i8 != 0 || backgroundDrawableLeft < i8) {
                                        e27Var.a = backgroundDrawableLeft;
                                    }
                                    i9 = e27Var.c;
                                    if (i9 != 0 || backgroundDrawableRight > i9) {
                                        e27Var.c = backgroundDrawableRight;
                                    }
                                } else {
                                    if (z2) {
                                    }
                                    if (!arrayList2.contains(currentMessagesGroup)) {
                                    }
                                    e27Var.k = gb2Var3.L2();
                                    e27Var.l = gb2Var3.K2();
                                    backgroundDrawableLeft = gb2Var3.getBackgroundDrawableLeft() + gb2Var3.getLeft();
                                    backgroundDrawableRight = gb2Var3.getBackgroundDrawableRight() + gb2Var3.getLeft();
                                    int backgroundDrawableTop2 = gb2Var3.getBackgroundDrawableTop() + gb2Var3.getPaddingTop() + gb2Var3.getTop();
                                    int backgroundDrawableBottom2 = gb2Var3.getBackgroundDrawableBottom() + gb2Var3.getPaddingTop() + gb2Var3.getTop();
                                    if ((gb2Var3.getCurrentPosition().l & i) == 0) {
                                    }
                                    i4 = backgroundDrawableTop2;
                                    if ((gb2Var3.getCurrentPosition().l & 8) == 0) {
                                    }
                                    i5 = backgroundDrawableBottom2;
                                    if (gb2Var3.La) {
                                    }
                                    i6 = e27Var.b;
                                    if (i6 != 0) {
                                    }
                                    e27Var.b = i4;
                                    i7 = e27Var.d;
                                    if (i7 != 0) {
                                    }
                                    e27Var.d = i5;
                                    i8 = e27Var.a;
                                    if (i8 != 0) {
                                    }
                                    e27Var.a = backgroundDrawableLeft;
                                    i9 = e27Var.c;
                                    if (i9 != 0) {
                                    }
                                    e27Var.c = backgroundDrawableRight;
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
                    f27 f27Var2 = (f27) arrayList2.get(i16);
                    e27 e27Var2 = f27Var2.m;
                    float U1 = e27Var2.m.U1(z);
                    float f5 = e27Var2.a + U1 + e27Var2.e;
                    float f6 = e27Var2.b + e27Var2.f;
                    float f7 = e27Var2.g + e27Var2.c + U1;
                    float f8 = e27Var2.d + e27Var2.h;
                    if (!e27Var2.j) {
                        f6 += e27Var2.m.getTranslationY();
                        f8 += e27Var2.m.getTranslationY();
                    }
                    boolean z3 = (e27Var2.m.getScaleX() == 1.0f && e27Var2.m.getScaleY() == 1.0f) ? false : z;
                    if (z3) {
                        canvas.save();
                        arrayList = arrayList2;
                        canvas.scale(e27Var2.m.getScaleX(), e27Var2.m.getScaleY(), oo1.z(f7, f5, f2, f5), oo1.z(f8, f6, f2, f6));
                    } else {
                        arrayList = arrayList2;
                    }
                    float f9 = f2;
                    float f10 = f6;
                    float f11 = f8;
                    e27Var2.m.K0(canvas, (int) f5, (int) f6, (int) f7, (int) f8, e27Var2.k, e27Var2.l, false, 0);
                    e27Var2.m = null;
                    e27Var2.o = f27Var2.c;
                    if (z3) {
                        canvas.restore();
                        for (int i17 = 0; i17 < childCount; i17++) {
                            View childAt4 = getChildAt(i17);
                            if (childAt4 instanceof gb2) {
                                gb2 gb2Var4 = (gb2) childAt4;
                                if (gb2Var4.getCurrentMessagesGroup() == f27Var2) {
                                    int left = gb2Var4.getLeft();
                                    int top = gb2Var4.getTop();
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
                gb2 gb2Var5 = (gb2) arrayList3.get(i18);
                canvas.save();
                canvas.translate(gb2Var5.U1(false) + gb2Var5.getLeft(), gb2Var5.getY());
                gb2Var5.A1(gb2Var5.a() ? gb2Var5.getAlpha() : 1.0f, canvas, true);
                canvas.restore();
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.g3;
        int size2 = arrayList4.size();
        if (size2 > 0) {
            for (int i19 = 0; i19 < size2; i19++) {
                gb2 gb2Var6 = (gb2) arrayList4.get(i19);
                float U12 = gb2Var6.U1(false) + gb2Var6.getLeft();
                float y2 = gb2Var6.getY();
                float alpha = gb2Var6.a() ? gb2Var6.getAlpha() : 1.0f;
                canvas.save();
                canvas.translate(U12, y2);
                gb2Var6.setInvalidatesParent(true);
                gb2Var6.h1(canvas, alpha);
                gb2Var6.setInvalidatesParent(false);
                canvas.restore();
            }
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.h3;
        int size3 = arrayList5.size();
        if (size3 > 0) {
            for (int i20 = 0; i20 < size3; i20++) {
                gb2 gb2Var7 = (gb2) arrayList5.get(i20);
                boolean z4 = gb2Var7.getCurrentPosition() != null && (gb2Var7.getCurrentPosition().l & 1) == 0;
                float alpha2 = gb2Var7.a() ? gb2Var7.getAlpha() : 1.0f;
                float U13 = gb2Var7.U1(false) + gb2Var7.getLeft();
                float y3 = gb2Var7.getY();
                canvas.save();
                f27 currentMessagesGroup3 = gb2Var7.getCurrentMessagesGroup();
                if (currentMessagesGroup3 != null) {
                    e27 e27Var3 = currentMessagesGroup3.m;
                    if (e27Var3.j) {
                        float U14 = gb2Var7.U1(true);
                        float f12 = e27Var3.a + U14 + e27Var3.e;
                        float f13 = e27Var3.b + e27Var3.f;
                        float f14 = e27Var3.c + U14 + e27Var3.g;
                        float f15 = e27Var3.d + e27Var3.h;
                        if (!e27Var3.j) {
                            f13 += gb2Var7.getTranslationY();
                            f15 += gb2Var7.getTranslationY();
                        }
                        canvas.clipRect(f12 + gl.L(8.0f), f13 + gl.L(8.0f), f14 - gl.L(8.0f), f15 - gl.L(8.0f));
                    }
                }
                if (gb2Var7.getTransitionParams().w0) {
                    canvas.translate(U13, y3);
                    gb2Var7.setInvalidatesParent(true);
                    gb2Var7.Q0(alpha2, canvas, z4);
                    gb2Var7.setInvalidatesParent(false);
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
                gb2 gb2Var8 = (gb2) arrayList6.get(i21);
                if (gb2Var8.getCurrentPosition() == null || (gb2Var8.getCurrentPosition().l & 1) != 0) {
                    float alpha3 = gb2Var8.a() ? gb2Var8.getAlpha() : 1.0f;
                    float U15 = gb2Var8.U1(false) + gb2Var8.getLeft();
                    float y4 = gb2Var8.getY();
                    canvas.save();
                    f27 currentMessagesGroup4 = gb2Var8.getCurrentMessagesGroup();
                    if (currentMessagesGroup4 != null) {
                        e27 e27Var4 = currentMessagesGroup4.m;
                        if (e27Var4.j) {
                            float U16 = gb2Var8.U1(true);
                            float f16 = e27Var4.a + U16 + e27Var4.e;
                            float f17 = e27Var4.b + e27Var4.f;
                            float f18 = e27Var4.c + U16 + e27Var4.g;
                            float f19 = e27Var4.d + e27Var4.h;
                            if (!e27Var4.j) {
                                f17 += gb2Var8.getTranslationY();
                                f19 += gb2Var8.getTranslationY();
                            }
                            canvas.clipRect(f16 + gl.L(f3), f17 + gl.L(f3), f18 - gl.L(f3), f19 - gl.L(f3));
                        }
                    }
                    if (gb2Var8.getTransitionParams().w0) {
                        canvas.translate(U15, y4);
                        gb2Var8.setInvalidatesParent(true);
                        gb2Var8.q1(canvas, alpha3, null);
                        gb2Var8.V0(canvas, alpha3);
                        gb2Var8.setInvalidatesParent(false);
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
    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        gb2 gb2Var;
        uk1 uk1Var;
        float f;
        ImageReceiver avatarImage;
        float f2;
        boolean z;
        int i;
        int b;
        int b2;
        int i2;
        ot7 ot7Var = this.k3;
        f27 f27Var = ot7Var.v0;
        if (view instanceof gb2) {
            gb2Var = (gb2) view;
        } else {
            if (view instanceof uk1) {
                uk1Var = (uk1) view;
                gb2Var = null;
                boolean drawChild = super.drawChild(canvas, view, j);
                if (gb2Var == null && gb2Var.l2()) {
                    canvas.save();
                    canvas.translate(gb2Var.getX(), gb2Var.getY() + gb2Var.getPaddingTop());
                    gb2Var.i1(canvas);
                    canvas.restore();
                } else if (uk1Var != null) {
                    canvas.save();
                    canvas.translate(uk1Var.getX(), uk1Var.getY());
                    uk1Var.L(canvas);
                    canvas.restore();
                }
                float f3 = 0.0f;
                if (view.getTranslationY() != 0.0f) {
                    canvas.save();
                    canvas.translate(0.0f, view.getTranslationY());
                }
                if (gb2Var != null) {
                    gb2Var.S0(canvas);
                }
                if (view.getTranslationY() != 0.0f) {
                    canvas.restore();
                }
                if (view.getTranslationY() != 0.0f) {
                    canvas.save();
                    canvas.translate(0.0f, view.getTranslationY());
                }
                if (gb2Var != null) {
                    gb2Var.getMessageObject();
                    c27 currentPosition = gb2Var.getCurrentPosition();
                    if (currentPosition != null) {
                        if (!currentPosition.h) {
                            if (currentPosition.a == 0) {
                            }
                            if (currentPosition == null || gb2Var.getTransitionParams().D0 || gb2Var.getTransitionParams().x0) {
                                if (currentPosition != null || (currentPosition.l & gb2Var.H()) != 0) {
                                    this.h3.add(gb2Var);
                                }
                                if (currentPosition != null) {
                                    int i3 = currentPosition.l;
                                    if ((i3 & 8) != 0) {
                                    }
                                }
                                this.i3.add(gb2Var);
                            }
                            avatarImage = gb2Var.getAvatarImage();
                            if (avatarImage != null) {
                                boolean z2 = this.W1 || (f27Var != null && f27Var.m.j);
                                int top = z2 ? view.getTop() : (int) view.getY();
                                if (!gb2Var.n() || (b2 = ot7Var.t0.T(view).b()) < 0) {
                                    f2 = 0.0f;
                                    z = true;
                                } else {
                                    if (f27Var == null || currentPosition == null) {
                                        f2 = 0.0f;
                                        z = true;
                                        i2 = b2 - 1;
                                    } else {
                                        int indexOf = f27Var.e.indexOf(currentPosition);
                                        int size = f27Var.e.size();
                                        z = true;
                                        if ((currentPosition.l & 8) == 0) {
                                            i2 = b2 - 1;
                                            int i4 = indexOf + 1;
                                            while (i4 < size) {
                                                f2 = f3;
                                                if (((c27) f27Var.e.get(i4)).c > currentPosition.d) {
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
                                float checkBoxTranslation = gb2Var.getCheckBoxTranslation() + gb2Var.getSlidingOffsetX();
                                int top2 = (int) ((z2 ? view.getTop() : view.getY()) + gb2Var.getLayoutHeight() + gb2Var.getTransitionParams().j0);
                                int measuredHeight = getMeasuredHeight() - getPaddingBottom();
                                boolean z3 = ((gb2Var.n1 || gb2Var.o1) && checkBoxTranslation == f2) ? z : false;
                                if (gb2Var.M2() || gb2Var.getTransitionParams().l2) {
                                    if (gb2Var.getTransitionParams().l2) {
                                        float f4 = gb2Var.getTransitionParams().L1;
                                        if (!gb2Var.M2()) {
                                            f4 = 1.0f - f4;
                                        }
                                        top2 = (int) tb4.A(1.0f, f4, Math.min(top2, measuredHeight), top2 * f4);
                                    }
                                } else if (top2 > measuredHeight) {
                                    top2 = measuredHeight;
                                }
                                if (!z2 && view.getTranslationY() != f2) {
                                    canvas.restore();
                                }
                                if (gb2Var.j() && (b = T(view).b()) >= 0) {
                                    int i5 = 0;
                                    while (i5 < 20) {
                                        i5++;
                                        if (f27Var != null && currentPosition != null) {
                                            int indexOf2 = f27Var.e.indexOf(currentPosition);
                                            if (indexOf2 < 0) {
                                                break;
                                            }
                                            f27Var.e.size();
                                            if ((currentPosition.l & 4) == 0) {
                                                b++;
                                                int i6 = indexOf2 - 1;
                                                while (i6 >= 0) {
                                                    i = top2;
                                                    if (((c27) f27Var.e.get(i6)).d < currentPosition.c) {
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
                                        s49 K = K(b);
                                        if (K == null) {
                                            break;
                                        }
                                        View view2 = K.a;
                                        top = view2.getTop();
                                        if (!(view2 instanceof gb2)) {
                                            break;
                                        }
                                        gb2Var = (gb2) view2;
                                        float checkBoxTranslation2 = gb2Var.getCheckBoxTranslation() + gb2Var.getSlidingOffsetX();
                                        if (z3 && checkBoxTranslation2 > f2) {
                                            checkBoxTranslation = checkBoxTranslation2;
                                        }
                                        if (!gb2Var.j()) {
                                            break;
                                        }
                                        top2 = i;
                                    }
                                }
                                i = top2;
                                int L = i - gl.L(42.0f) < top ? gl.L(42.0f) + top : i;
                                if (!gb2Var.n()) {
                                    int bottom = z2 ? gb2Var.getBottom() : (int) (gb2Var.getY() + gb2Var.getMeasuredHeight() + gb2Var.getTransitionParams().j0);
                                    if (L > bottom) {
                                        L = bottom;
                                    }
                                }
                                canvas.save();
                                if (checkBoxTranslation != f2) {
                                    canvas.translate(checkBoxTranslation, f2);
                                }
                                if (gb2Var.getCurrentMessagesGroup() != null && gb2Var.getCurrentMessagesGroup().m.j) {
                                    L = (int) (L - gb2Var.getTranslationY());
                                }
                                avatarImage.M0 = L - gl.L(40.0f);
                                if (gb2Var.a()) {
                                    avatarImage.setAlpha(gb2Var.getAlpha());
                                    canvas.scale(gb2Var.getScaleX(), gb2Var.getScaleY(), gb2Var.getPivotX() + gb2Var.getX(), gb2Var.getY() + (gb2Var.getHeight() >> 1));
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
                        this.f3.add(gb2Var);
                    }
                    if ((currentPosition == null || (currentPosition.a == 0 && currentPosition.c == 0)) && gb2Var.k2()) {
                        this.g3.add(gb2Var);
                    }
                    if (currentPosition == null) {
                    }
                    if (currentPosition != null) {
                    }
                    this.h3.add(gb2Var);
                    if (currentPosition != null) {
                    }
                    this.i3.add(gb2Var);
                    avatarImage = gb2Var.getAvatarImage();
                    if (avatarImage != null) {
                    }
                }
                f = 0.0f;
                if (view.getTranslationY() != f) {
                }
                return drawChild;
            }
            gb2Var = null;
        }
        uk1Var = null;
        boolean drawChild2 = super.drawChild(canvas, view, j);
        if (gb2Var == null) {
        }
        if (uk1Var != null) {
        }
        float f32 = 0.0f;
        if (view.getTranslationY() != 0.0f) {
        }
        if (gb2Var != null) {
        }
        if (view.getTranslationY() != 0.0f) {
        }
        if (view.getTranslationY() != 0.0f) {
        }
        if (gb2Var != null) {
        }
        f = 0.0f;
        if (view.getTranslationY() != f) {
        }
        return drawChild2;
    }
}
