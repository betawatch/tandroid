// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fu extends o39 {
    public final /* synthetic */ byte f3;
    public final /* synthetic */ Object g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu(t14 t14Var, Context context, r14 r14Var) {
        super(context, null);
        this.f3 = (byte) 16;
        this.g3 = t14Var;
        setNestedScrollingEnabled(true);
        setSelectorRadius(gl.L(4.0f));
        zkb.l(this, 20, bkb.h6, this.o2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        zr zrVar = new zr((byte) 6);
        zrVar.i1(0);
        setLayoutManager(zrVar);
        setAdapter(r14Var);
    }

    @Override // o39
    public final boolean F0(float f) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 8:
                x02 x02Var = ((k22) obj).b;
                return f >= ((float) ((gl.L(30.0f) + x02Var.Y3[0]) + (!x02Var.a2 ? gl.m : 0)));
            case 11:
                x02 x02Var2 = ((p62) obj).b;
                return f >= ((float) ((gl.L(30.0f) + x02Var2.Y3[0]) + (!x02Var2.a2 ? gl.m : 0)));
            default:
                return super.F0(f);
        }
    }

    @Override // o39
    public final boolean G0(View view) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 3:
                return view != ((r61) obj).X;
            case 18:
                he4 he4Var = (he4) obj;
                return he4Var.isEnabled() && !((ti3) he4Var.K).b.l2;
            default:
                return super.G0(view);
        }
    }

    @Override // o39
    public final boolean I0(View view, float f, float f2) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 2:
                return ((fy0) obj).E0(view, f, f2);
            case 18:
                if (((he4) obj).n) {
                    int L = gl.L(6.0f);
                    RectF rectF = ((fe4) view).f;
                    float f3 = L;
                    if (rectF.left - f3 < f && rectF.right + f3 > f) {
                        return false;
                    }
                }
                return true;
            default:
                return super.I0(view, f, f2);
        }
    }

    @Override // o39
    public final Integer W0(int i) {
        int i2;
        byte b = this.f3;
        Object obj = this.g3;
        wjb wjbVar = this.o2;
        switch (b) {
            case 14:
                i2 = ((DataSettingsActivity) obj).resetDownloadRow;
                return i == i2 ? Integer.valueOf(bkb.p1(0.1f, bkb.v0(bkb.o7, wjbVar))) : Integer.valueOf(bkb.v0(bkb.h6, wjbVar));
            case 17:
                ArrayList arrayList = ((pd4) obj).Q;
                gd4 gd4Var = (i < 0 || i >= arrayList.size()) ? null : (gd4) arrayList.get(i);
                return (gd4Var == null || !gd4Var.l) ? Integer.valueOf(bkb.v0(bkb.h6, wjbVar)) : Integer.valueOf(bkb.p1(0.12f, bkb.v0(bkb.o7, wjbVar)));
            case 24:
                return 0;
            default:
                return super.W0(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ea  */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v8, types: [boolean, int] */
    @Override // o39, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        a aVar;
        i76 i76Var;
        f37 f37Var;
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        float f;
        int i4;
        fu fuVar;
        f27 currentMessagesGroup;
        int i5;
        int backgroundDrawableLeft;
        int backgroundDrawableRight;
        int backgroundDrawableTop;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        f27 currentMessagesGroup2;
        View view;
        byte b = this.f3;
        float f2 = 0.0f;
        float f3 = 2.0f;
        boolean z = false;
        Object obj = this.g3;
        switch (b) {
            case 1:
                cx1 cx1Var = (cx1) obj;
                fu fuVar2 = cx1Var.c;
                if (fuVar2.getLayoutManager() != null && fuVar2.getAdapter() != null && fuVar2.getAdapter().b() != 0) {
                    float L = cx1Var.h - gl.L(8.0f);
                    cx1Var.e = L - gl.L(16.0f);
                    il0 il0Var = cx1Var.r;
                    if (il0Var != null) {
                        il0Var.draw(canvas);
                    }
                    RectF rectF = gl.P;
                    rectF.set((getMeasuredWidth() / 2.0f) - gl.L(12.0f), L - gl.L(4.0f), (getMeasuredWidth() / 2.0f) + gl.L(12.0f), L);
                    canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), cx1Var.d);
                    super.dispatchDraw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            case 4:
                super.dispatchDraw(canvas);
                ((b81) obj).G = false;
                break;
            case 19:
                if (getAdapter() == ((af4) obj).V) {
                    for (int i11 = 0; i11 < getChildCount(); i11++) {
                        if (T(getChildAt(i11)).f == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i11).getX(), (getChildAt(i11).getY() - getChildAt(i11).getMeasuredHeight()) + gl.L(2.0f));
                            getChildAt(i11).draw(canvas);
                            canvas.restore();
                            invalidate();
                        }
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 23:
                super.dispatchDraw(canvas);
                ca5 ca5Var = (ca5) obj;
                if (ca5Var.A0 != null && ca5Var.B0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = ca5Var.A0.getMeasuredHeight();
                    aVar = ((d) ca5Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - aVar.getMeasuredHeight()));
                    ca5Var.A0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 24:
                l18 l18Var = (l18) obj;
                int i12 = -1;
                if (!l18Var.g0) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < getChildCount()) {
                            View childAt = getChildAt(i13);
                            if (!(childAt instanceof d76) || (i76Var = ((d76) childAt).L) == null) {
                                i13++;
                            } else {
                                i12 = i76Var.a;
                            }
                        }
                    }
                }
                if (i12 > l18Var.G) {
                    l18Var.G = i12;
                    jm2 jm2Var = l18Var.j0.N1;
                    if (jm2Var != null) {
                        jm2Var.setCount(l18Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 25:
                qa6 qa6Var = (qa6) obj;
                RectF rectF2 = qa6Var.a0;
                if (qa6Var.Z != null) {
                    int L2 = gl.L(12.0f);
                    qa6Var.Z.setBounds(-L2, qa6Var.b0 - L2, getWidth() + L2, getHeight() + L2);
                    qa6Var.Z.draw(canvas);
                    byte b2 = qa6Var.N0;
                    if (b2 == 0 || b2 == 1) {
                        int L3 = gl.L(36.0f);
                        rectF2.set((getWidth() - L3) / 2.0f, gl.L(10.0f) + qa6Var.b0, (getWidth() + L3) / 2.0f, gl.L(4.0f) + r7);
                        bkb.s0.setColor(qa6Var.getThemedColor(bkb.yj));
                        canvas.drawRoundRect(rectF2, gl.L(2.0f), gl.L(2.0f), bkb.s0);
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 26:
                int i14 = 1;
                f37 f37Var2 = (f37) obj;
                n81 n81Var = f37Var2.b;
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt2 = getChildAt(i15);
                    if (childAt2 instanceof gb2) {
                        ((gb2) childAt2).B3(n81Var.getMeasuredWidth(), n81Var.getBackgroundSizeY());
                    }
                }
                int childCount = getChildCount();
                f27 f27Var = null;
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = getChildAt(i16);
                    if ((childAt3 instanceof gb2) && ((currentMessagesGroup2 = ((gb2) childAt3).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != f27Var)) {
                        f27Var = currentMessagesGroup2;
                    }
                }
                int i17 = 0;
                while (i17 < 3) {
                    l37 l37Var = f37Var2.d0;
                    ArrayList arrayList2 = l37Var.F;
                    fu fuVar3 = f37Var2.f;
                    l37Var.F.clear();
                    int i18 = 2;
                    if (i17 != 2 || fuVar3.W1) {
                        int i19 = z ? 1 : 0;
                        ?? r15 = z;
                        while (i19 < childCount) {
                            View childAt4 = fuVar3.getChildAt(i19);
                            if (childAt4 instanceof gb2) {
                                gb2 gb2Var = (gb2) childAt4;
                                if (childAt4.getY() <= fuVar3.getHeight() && childAt4.getY() + childAt4.getHeight() >= f2 && (currentMessagesGroup = gb2Var.getCurrentMessagesGroup()) != null) {
                                    e27 e27Var = currentMessagesGroup.m;
                                    if (i17 == 0) {
                                        i5 = i14;
                                        if (currentMessagesGroup.d.size() == i5) {
                                        }
                                    } else {
                                        i5 = i14;
                                    }
                                    if ((i17 != i5 || e27Var.i) && ((i17 != 0 || !gb2Var.getMessageObject().Z) && (i17 != 1 || gb2Var.getMessageObject().Z))) {
                                        boolean z2 = gb2Var.La;
                                        if (i17 == i18) {
                                            if (!z2) {
                                            }
                                            if (!arrayList2.contains(currentMessagesGroup)) {
                                                e27Var.a = r15;
                                                e27Var.b = r15;
                                                e27Var.c = r15;
                                                e27Var.d = r15;
                                                e27Var.l = r15;
                                                e27Var.k = r15;
                                                e27Var.m = gb2Var;
                                                arrayList2.add(currentMessagesGroup);
                                            }
                                            e27Var.k = gb2Var.L2();
                                            e27Var.l = gb2Var.K2();
                                            backgroundDrawableLeft = gb2Var.getBackgroundDrawableLeft() + gb2Var.getLeft();
                                            backgroundDrawableRight = gb2Var.getBackgroundDrawableRight() + gb2Var.getLeft();
                                            backgroundDrawableTop = gb2Var.getBackgroundDrawableTop() + gb2Var.getPaddingTop() + gb2Var.getTop();
                                            int backgroundDrawableBottom = gb2Var.getBackgroundDrawableBottom() + gb2Var.getPaddingTop() + gb2Var.getTop();
                                            if ((gb2Var.getCurrentPosition().l & 4) == 0) {
                                                backgroundDrawableTop -= gl.L(10.0f);
                                            }
                                            if ((gb2Var.getCurrentPosition().l & 8) == 0) {
                                                backgroundDrawableBottom = gl.L(10.0f) + backgroundDrawableBottom;
                                            }
                                            i6 = backgroundDrawableBottom;
                                            if (gb2Var.La) {
                                                e27Var.m = gb2Var;
                                            }
                                            i7 = e27Var.b;
                                            if (i7 != 0 || backgroundDrawableTop < i7) {
                                                e27Var.b = backgroundDrawableTop;
                                            }
                                            i8 = e27Var.d;
                                            if (i8 != 0 || i6 > i8) {
                                                e27Var.d = i6;
                                            }
                                            i9 = e27Var.a;
                                            if (i9 != 0 || backgroundDrawableLeft < i9) {
                                                e27Var.a = backgroundDrawableLeft;
                                            }
                                            i10 = e27Var.c;
                                            if (i10 != 0 || backgroundDrawableRight > i10) {
                                                e27Var.c = backgroundDrawableRight;
                                            }
                                        } else {
                                            if (z2) {
                                            }
                                            if (!arrayList2.contains(currentMessagesGroup)) {
                                            }
                                            e27Var.k = gb2Var.L2();
                                            e27Var.l = gb2Var.K2();
                                            backgroundDrawableLeft = gb2Var.getBackgroundDrawableLeft() + gb2Var.getLeft();
                                            backgroundDrawableRight = gb2Var.getBackgroundDrawableRight() + gb2Var.getLeft();
                                            backgroundDrawableTop = gb2Var.getBackgroundDrawableTop() + gb2Var.getPaddingTop() + gb2Var.getTop();
                                            int backgroundDrawableBottom2 = gb2Var.getBackgroundDrawableBottom() + gb2Var.getPaddingTop() + gb2Var.getTop();
                                            if ((gb2Var.getCurrentPosition().l & 4) == 0) {
                                            }
                                            if ((gb2Var.getCurrentPosition().l & 8) == 0) {
                                            }
                                            i6 = backgroundDrawableBottom2;
                                            if (gb2Var.La) {
                                            }
                                            i7 = e27Var.b;
                                            if (i7 != 0) {
                                            }
                                            e27Var.b = backgroundDrawableTop;
                                            i8 = e27Var.d;
                                            if (i8 != 0) {
                                            }
                                            e27Var.d = i6;
                                            i9 = e27Var.a;
                                            if (i9 != 0) {
                                            }
                                            e27Var.a = backgroundDrawableLeft;
                                            i10 = e27Var.c;
                                            if (i10 != 0) {
                                            }
                                            e27Var.c = backgroundDrawableRight;
                                        }
                                    }
                                }
                            }
                            i19++;
                            i18 = 2;
                            f2 = 0.0f;
                            r15 = 0;
                            i14 = 1;
                        }
                        int i20 = 0;
                        ArrayList arrayList3 = arrayList2;
                        while (i20 < arrayList3.size()) {
                            f27 f27Var2 = (f27) arrayList3.get(i20);
                            if (f27Var2 == null) {
                                f37Var = f37Var2;
                                i2 = i17;
                                arrayList = arrayList3;
                                i3 = i20;
                                f = f3;
                                i4 = childCount;
                                fuVar = fuVar3;
                            } else {
                                e27 e27Var2 = f27Var2.m;
                                float U1 = e27Var2.m.U1(true);
                                float f4 = e27Var2.a + U1 + e27Var2.e;
                                float f5 = e27Var2.b + e27Var2.f;
                                float f6 = e27Var2.g + e27Var2.c + U1;
                                float f7 = e27Var2.d + e27Var2.h;
                                if (!e27Var2.j) {
                                    f5 += e27Var2.m.getTranslationY();
                                    f7 += e27Var2.m.getTranslationY();
                                }
                                if (f5 < (-gl.L(20.0f))) {
                                    f5 = -gl.L(20.0f);
                                }
                                float f8 = f5;
                                if (f7 > gl.L(20.0f) + fuVar3.getMeasuredHeight()) {
                                    f7 = gl.L(20.0f) + fuVar3.getMeasuredHeight();
                                }
                                float f9 = f7;
                                boolean z3 = (e27Var2.m.getScaleX() == 1.0f && e27Var2.m.getScaleY() == 1.0f) ? false : true;
                                if (z3) {
                                    canvas.save();
                                    f37Var = f37Var2;
                                    i = childCount;
                                    i2 = i17;
                                    canvas.scale(e27Var2.m.getScaleX(), e27Var2.m.getScaleY(), oo1.z(f6, f4, f3, f4), oo1.z(f9, f8, f3, f8));
                                } else {
                                    f37Var = f37Var2;
                                    i = childCount;
                                    i2 = i17;
                                }
                                arrayList = arrayList3;
                                i3 = i20;
                                f = f3;
                                i4 = i;
                                fuVar = fuVar3;
                                e27Var2.m.K0(canvas, (int) f4, (int) f8, (int) f6, (int) f9, e27Var2.k, e27Var2.l, false, 0);
                                e27Var2.m = null;
                                e27Var2.o = f27Var2.c;
                                if (z3) {
                                    canvas.restore();
                                    for (int i21 = 0; i21 < i4; i21++) {
                                        View childAt5 = fuVar.getChildAt(i21);
                                        if (childAt5 instanceof gb2) {
                                            gb2 gb2Var2 = (gb2) childAt5;
                                            if (gb2Var2.getCurrentMessagesGroup() == f27Var2) {
                                                int left = gb2Var2.getLeft();
                                                int top = gb2Var2.getTop();
                                                childAt5.setPivotX(((f6 - f4) / f) + (f4 - left));
                                                childAt5.setPivotY(((f9 - f8) / f) + (f8 - top));
                                            }
                                        }
                                    }
                                }
                            }
                            fuVar3 = fuVar;
                            childCount = i4;
                            f3 = f;
                            i17 = i2;
                            arrayList3 = arrayList;
                            i20 = i3 + 1;
                            f37Var2 = f37Var;
                        }
                    }
                    i17++;
                    childCount = childCount;
                    f3 = f3;
                    f37Var2 = f37Var2;
                    f2 = 0.0f;
                    z = false;
                    i14 = 1;
                }
                super.dispatchDraw(canvas);
                break;
            case 27:
                z08 z08Var = (z08) obj;
                Paint paint = z08Var.x;
                RectF rectF3 = z08Var.s;
                RectF rectF4 = z08Var.r;
                RectF rectF5 = z08Var.n;
                t26 t26Var = z08Var.b;
                if (!z08Var.f.isEmpty()) {
                    float e = z08Var.e.e(false, z08Var.d);
                    double d = e;
                    int j = Utilities.j((int) Math.floor(d), r9.size() - 1, 0);
                    int j2 = Utilities.j((int) Math.ceil(d), r9.size() - 1, 0);
                    View m = t26Var.m(j);
                    View m2 = t26Var.m(j2);
                    if (m != null) {
                        view = m;
                    } else if (m2 != null) {
                        view = m2;
                    }
                    rectF5.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (m2 != null) {
                        m = m2;
                    }
                    rectF4.set(m.getLeft(), m.getTop(), m.getRight(), m.getBottom());
                    gl.X1(rectF5, rectF4, e - j, rectF3);
                    paint.setColor(z08Var.y);
                    float height = rectF3.height() / 2.0f;
                    canvas.drawRoundRect(rectF3, height, height, paint);
                    super.dispatchDraw(canvas);
                    break;
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // o39, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        yc ycVar;
        s49 K;
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 9:
                if (motionEvent.getActionMasked() == 0) {
                    c42 c42Var = (c42) obj;
                    if (motionEvent.getY() < c42Var.t0 && (ycVar = c42Var.K) != null && ycVar.getVisibility() == 0 && (K = K(0)) != null && motionEvent.getY() >= gl.L(32.0f) + Math.max(0, K.a.getTop())) {
                    }
                }
                break;
            case 22:
                if (!((sr4) obj).L) {
                    break;
                }
                break;
            case 24:
                if (!((l18) obj).g0) {
                    break;
                }
                break;
            case 25:
                if (motionEvent.getActionMasked() != 0 || motionEvent.getY() >= ((qa6) obj).b0) {
                    break;
                }
                break;
            case 28:
                t09 t09Var = (t09) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && t09Var.getPullingLeftProgress() > 0.95f) {
                        t09Var.o();
                    } else if (t09Var.C0 != 0.0f) {
                        ValueAnimator valueAnimator = t09Var.z0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(t09Var.C0, 0.0f);
                        t09Var.z0 = ofFloat;
                        ofFloat.addUpdateListener(new u28(t09Var, (byte) 25));
                        t09Var.z0.setDuration(150L);
                        t09Var.z0.start();
                    }
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0162  */
    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        gb2 gb2Var;
        ImageReceiver avatarImage;
        boolean z;
        int y;
        int b;
        byte b2 = this.f3;
        Object obj = this.g3;
        switch (b2) {
            case 5:
                nf1 nf1Var = (nf1) obj;
                if (view instanceof ob2) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    ((ob2) view).a(canvas);
                    canvas.restore();
                }
                boolean drawChild = super.drawChild(canvas, view, j);
                if ((view instanceof gb2) && (avatarImage = (gb2Var = (gb2) view).getAvatarImage()) != null) {
                    if (!gb2Var.getMessageObject().Z) {
                        nf1Var.w.getClass();
                        if (RecyclerView.R(gb2Var) != -1) {
                            z = true;
                            if (!gb2Var.getMessageObject().Z) {
                                avatarImage.v0(false, false);
                                break;
                            } else {
                                int y2 = (int) view.getY();
                                if (gb2Var.n() && (b = nf1Var.w.T(view).b()) >= 0) {
                                    if (nf1Var.w.K(b + 1) != null) {
                                        avatarImage.v0(false, false);
                                        break;
                                    }
                                }
                                float checkBoxTranslation = gb2Var.getCheckBoxTranslation() + gb2Var.getSlidingOffsetX();
                                int layoutHeight = gb2Var.getLayoutHeight() + ((int) view.getY());
                                int measuredHeight = nf1Var.w.getMeasuredHeight() - nf1Var.w.getPaddingBottom();
                                if (layoutHeight > measuredHeight) {
                                    layoutHeight = measuredHeight;
                                }
                                if (gb2Var.j() && (r13 = nf1Var.w.T(view).b()) >= 0) {
                                    int i = 0;
                                    while (i < 20) {
                                        i++;
                                        int b3 = b3 - 1;
                                        s49 K = nf1Var.w.K(b3);
                                        if (K != null) {
                                            View view2 = K.a;
                                            int top = view2.getTop();
                                            if (view2 instanceof gb2) {
                                                gb2Var = (gb2) view2;
                                                if (gb2Var.j()) {
                                                    y2 = top;
                                                }
                                            }
                                            y2 = top;
                                        }
                                    }
                                }
                                if (layoutHeight - gl.L(48.0f) < y2) {
                                    layoutHeight = gl.L(48.0f) + y2;
                                }
                                if (!gb2Var.n() && layoutHeight > (y = (int) (gb2Var.getY() + gb2Var.getMeasuredHeight()))) {
                                    layoutHeight = y;
                                }
                                canvas.save();
                                if (checkBoxTranslation != 0.0f) {
                                    canvas.translate(checkBoxTranslation, 0.0f);
                                }
                                if (gb2Var.getCurrentMessagesGroup() != null && gb2Var.getCurrentMessagesGroup().m.j) {
                                    layoutHeight = (int) (layoutHeight - gb2Var.getTranslationY());
                                }
                                if (z) {
                                    avatarImage.M0 = layoutHeight - gl.L(44.0f);
                                }
                                if (gb2Var.a()) {
                                    avatarImage.setAlpha(gb2Var.getAlpha());
                                    canvas.scale(gb2Var.getScaleX(), gb2Var.getScaleY(), gb2Var.getPivotX() + gb2Var.getX(), gb2Var.getY() + (gb2Var.getHeight() >> 1));
                                } else {
                                    avatarImage.setAlpha(1.0f);
                                }
                                if (z) {
                                    avatarImage.v0(true, false);
                                }
                                avatarImage.h(canvas, null);
                                canvas.restore();
                                break;
                            }
                        }
                    }
                    z = false;
                    if (!gb2Var.getMessageObject().Z) {
                    }
                }
                break;
            case 19:
                if (getAdapter() != ((af4) obj).V || T(view).f != 1) {
                    break;
                }
                break;
            case 26:
                if (!(view instanceof gb2)) {
                    break;
                } else {
                    gb2 gb2Var2 = (gb2) view;
                    boolean drawChild2 = super.drawChild(canvas, view, j);
                    gb2Var2.S0(canvas);
                    canvas.save();
                    canvas.translate(gb2Var2.getX(), gb2Var2.getY());
                    canvas.save();
                    canvas.scale(gb2Var2.getScaleX(), gb2Var2.getScaleY(), gb2Var2.getPivotX(), gb2Var2.getPivotY());
                    gb2Var2.c1(canvas, true);
                    gb2Var2.V2(true);
                    gb2Var2.g1(canvas);
                    if (gb2Var2.getCurrentMessagesGroup() == null || ((gb2Var2.getCurrentPosition() != null && (((gb2Var2.getCurrentPosition().l & gb2Var2.H()) != 0 && (gb2Var2.getCurrentPosition().l & 1) != 0) || (gb2Var2.getCurrentMessagesGroup() != null && gb2Var2.getCurrentMessagesGroup().i))) || gb2Var2.getTransitionParams().x0)) {
                        gb2Var2.Q0(gb2Var2.getAlpha(), canvas, false);
                        gb2Var2.q1(canvas, gb2Var2.getAlpha(), null);
                        gb2Var2.V0(canvas, gb2Var2.getAlpha());
                    }
                    if (gb2Var2.getCurrentMessagesGroup() != null || gb2Var2.getTransitionParams().x0) {
                        gb2Var2.h1(canvas, gb2Var2.getAlpha());
                    }
                    if ((gb2Var2.getCurrentPosition() != null && gb2Var2.getCurrentPosition().h) || gb2Var2.getTransitionParams().x0) {
                        gb2Var2.A1(gb2Var2.getAlpha(), canvas, true);
                    }
                    gb2Var2.j1(canvas);
                    canvas.restore();
                    gb2Var2.getTransitionParams().d();
                    canvas.restore();
                    break;
                }
                break;
            case 28:
                h19 h19Var = ((t09) obj).m0;
                if (h19Var == null || !(view instanceof r09) || !((r09) view).e.equals(h19Var)) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.View
    public final void invalidate() {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 13:
                super.invalidate();
                View view = ((kf2) obj).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 24:
                super.invalidate();
                ((l18) obj).invalidate();
                break;
            case 27:
                super.invalidate();
                i08 i08Var = ((z08) obj).G;
                if (i08Var != null) {
                    i08Var.run();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i) {
        switch (this.f3) {
            case 26:
                if (i == 0) {
                    ((f37) this.g3).e.U();
                    break;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 10:
                m52 m52Var = (m52) obj;
                m52Var.invalidate();
                m52Var.b.H1(m52Var, i);
                l52 l52Var = m52Var.w;
                boolean z = true;
                int i2 = 0;
                boolean z2 = l52Var.y == null;
                if (z2) {
                    l52Var.y = l52Var.d();
                } else {
                    boolean[] d = l52Var.d();
                    if (d.length == l52Var.y.length) {
                        while (true) {
                            if (i2 >= d.length) {
                                z = z2;
                            } else if (d[i2] == l52Var.y[i2]) {
                                i2++;
                            }
                        }
                    }
                    z2 = z;
                }
                if (z2) {
                    l52Var.invalidate();
                    break;
                }
                break;
            case 11:
                break;
            case 26:
                ((f37) obj).e.F();
                break;
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.f3) {
            case 6:
                super.onAttachedToWindow();
                ra7 ra7Var = ((mu1) this.g3).b4;
                if (ra7Var != null) {
                    kk7.f(ra7Var.r).b(ra7Var, kk7.z5);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.f3) {
            case 6:
                super.onDetachedFromWindow();
                ra7 ra7Var = ((mu1) this.g3).b4;
                if (ra7Var != null) {
                    gl.r(ra7Var.F);
                    kk7.f(ra7Var.r).n(ra7Var, kk7.z5);
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 7:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((v12) obj).b.Y3[0] - gl.L(80.0f)) {
                    break;
                }
                break;
            case 10:
                if (((m52) obj).K == null) {
                    break;
                }
                break;
            case 12:
                if (!((zc2) obj).I) {
                    break;
                }
                break;
            case 15:
                nv3 nv3Var = (nv3) obj;
                boolean g = xv2.e().g(motionEvent, nv3Var.b, nv3Var.f, this.o2);
                if (!super.onInterceptTouchEvent(motionEvent) && !g) {
                    break;
                }
                break;
            case 16:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((t14) obj).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 22:
                if (!((sr4) obj).L) {
                    break;
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        k27 k27Var;
        byte b = this.f3;
        int i6 = 0;
        Object[] objArr = 0;
        Object obj = this.g3;
        switch (b) {
            case 2:
                ((fy0) obj).D0();
                super.onLayout(z, i, i2, i3, i4);
                break;
            case 5:
                nf1 nf1Var = (nf1) obj;
                if (nf1Var.w != null && nf1Var.y != null && (i5 = nf1Var.N0) >= 0) {
                    if (nf1Var.M0 != 0) {
                        while (true) {
                            kf1 kf1Var = nf1Var.F;
                            if (i6 < kf1Var.d) {
                                if (i6 < kf1Var.f || i6 >= kf1Var.h) {
                                    k27Var = null;
                                } else {
                                    ArrayList arrayList = kf1Var.n.p0;
                                    k27Var = (k27) arrayList.get((arrayList.size() - (i6 - kf1Var.f)) - 1);
                                }
                                if (k27Var == null || k27Var.T != nf1Var.M0) {
                                    i6++;
                                } else {
                                    i5 = i6;
                                }
                            }
                        }
                    }
                    nf1Var.y.h1(i5, nf1Var.O0, true);
                    nf1Var.N0 = -1;
                    nf1Var.M0 = 0L;
                }
                super.onLayout(z, i, i2, i3, i4);
                break;
            case 7:
                super.onLayout(z, i, i2, i3, i4);
                PhotoViewer.r0().t();
                break;
            case 9:
                super.onLayout(z, i, i2, i3, i4);
                c42 c42Var = (c42) obj;
                c42Var.j0();
                c42Var.h0();
                break;
            case 26:
                f37 f37Var = (f37) obj;
                int i7 = f37Var.a;
                if (f37Var.L) {
                    if (i7 != 0) {
                        w0(0);
                    }
                    f37Var.L = false;
                }
                super.onLayout(z, i, i2, i3, i4);
                f37Var.j();
                fu fuVar = f37Var.f;
                if (f37Var.V) {
                    if (fuVar.computeVerticalScrollRange() > fuVar.computeVerticalScrollExtent()) {
                        f37Var.postDelayed(new w27(f37Var, objArr == true ? 1 : 0), 0L);
                    }
                    f37Var.V = false;
                }
                if (f37Var.O && i7 == 0) {
                    int i8 = f37Var.M;
                    int i9 = f37Var.N;
                    f37Var.O = false;
                    post(new bt((Object) this, i8, i9, (byte) 12));
                    break;
                }
                break;
            case 29:
                super.onLayout(z, i, i2, i3, i4);
                ((hs9) obj).a();
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.f3) {
            case 24:
                int size = View.MeasureSpec.getSize(i);
                View.MeasureSpec.getSize(i2);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i2)));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 7:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((v12) obj).b.Y3[0] - gl.L(80.0f)) {
                    break;
                }
                break;
            case 10:
                if (((m52) obj).K == null) {
                    break;
                }
                break;
            case 12:
                if (!((zc2) obj).I) {
                    break;
                }
                break;
            case 21:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    gl.e3(new s54((Object) this, (byte) 13), 250L);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        switch (this.f3) {
            case 17:
                return false;
            default:
                return super.requestFocus(i, rect);
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 0:
                if (!((mu) obj).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 20:
                if (!((cf4) obj).s1) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.f3) {
            case 18:
                super.setAlpha(f);
                ((he4) this.g3).invalidate();
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }

    @Override // o39
    public final boolean u1(View view) {
        switch (this.f3) {
            case 21:
                return !(view instanceof ff4) || ((ff4) view).getDraggingProgress() <= 0.0f;
            default:
                return super.u1(view);
        }
    }

    private final void z1(int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fu(Object obj, Context context, wjb wjbVar, byte b) {
        super(context, wjbVar);
        this.f3 = b;
        this.g3 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fu(byte b, Context context, Object obj) {
        super(context, null);
        this.f3 = b;
        this.g3 = obj;
    }
}
