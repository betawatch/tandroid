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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gu extends d79 {
    public final /* synthetic */ byte f3;
    public final /* synthetic */ Object g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu(o24 o24Var, Context context, m24 m24Var) {
        super(context, null);
        this.f3 = (byte) 16;
        this.g3 = o24Var;
        setNestedScrollingEnabled(true);
        setSelectorRadius(hl.L(4.0f));
        yob.l(this, 20, aob.i6, this.o2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        as asVar = new as((byte) 6);
        asVar.i1(0);
        setLayoutManager(asVar);
        setAdapter(m24Var);
    }

    @Override // d79
    public final boolean G0(float f) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 8:
                n12 n12Var = ((b32) obj).b;
                return f >= ((float) ((hl.L(30.0f) + n12Var.Y3[0]) + (!n12Var.a2 ? hl.m : 0)));
            case 11:
                n12 n12Var2 = ((f72) obj).b;
                return f >= ((float) ((hl.L(30.0f) + n12Var2.Y3[0]) + (!n12Var2.a2 ? hl.m : 0)));
            default:
                return super.G0(f);
        }
    }

    @Override // d79
    public final boolean H0(View view) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 3:
                return view != ((z61) obj).X;
            case 18:
                fg4 fg4Var = (fg4) obj;
                return fg4Var.isEnabled() && fg4Var.K.b();
            default:
                return super.H0(view);
        }
    }

    @Override // d79
    public final boolean J0(View view, float f, float f2) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 2:
                return ((ny0) obj).F0(view, f, f2);
            case 18:
                if (((fg4) obj).n) {
                    int L = hl.L(6.0f);
                    RectF rectF = ((dg4) view).f;
                    float f3 = L;
                    if (rectF.left - f3 < f && rectF.right + f3 > f) {
                        return false;
                    }
                }
                return true;
            default:
                return super.J0(view, f, f2);
        }
    }

    @Override // d79
    public final Integer X0(int i) {
        int i2;
        byte b = this.f3;
        Object obj = this.g3;
        vnb vnbVar = this.o2;
        switch (b) {
            case 14:
                i2 = ((DataSettingsActivity) obj).resetDownloadRow;
                return i == i2 ? Integer.valueOf(aob.p1(0.1f, aob.v0(aob.p7, vnbVar))) : Integer.valueOf(aob.v0(aob.i6, vnbVar));
            case 17:
                ArrayList arrayList = ((nf4) obj).Q;
                ef4 ef4Var = (i < 0 || i >= arrayList.size()) ? null : (ef4) arrayList.get(i);
                return (ef4Var == null || !ef4Var.l) ? Integer.valueOf(aob.v0(aob.i6, vnbVar)) : Integer.valueOf(aob.p1(0.12f, aob.v0(aob.p7, vnbVar)));
            case 24:
                return 0;
            default:
                return super.X0(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ea  */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v8, types: [boolean, int] */
    @Override // d79, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        a aVar;
        m96 m96Var;
        m57 m57Var;
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        float f;
        int i4;
        gu guVar;
        m47 currentMessagesGroup;
        int i5;
        int backgroundDrawableLeft;
        int backgroundDrawableRight;
        int backgroundDrawableTop;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        m47 currentMessagesGroup2;
        View view;
        byte b = this.f3;
        float f2 = 0.0f;
        float f3 = 2.0f;
        boolean z = false;
        Object obj = this.g3;
        switch (b) {
            case 1:
                qx1 qx1Var = (qx1) obj;
                gu guVar2 = qx1Var.c;
                if (guVar2.getLayoutManager() != null && guVar2.getAdapter() != null && guVar2.getAdapter().b() != 0) {
                    float L = qx1Var.h - hl.L(8.0f);
                    qx1Var.e = L - hl.L(16.0f);
                    jl0 jl0Var = qx1Var.r;
                    if (jl0Var != null) {
                        jl0Var.draw(canvas);
                    }
                    RectF rectF = hl.P;
                    rectF.set((getMeasuredWidth() / 2.0f) - hl.L(12.0f), L - hl.L(4.0f), (getMeasuredWidth() / 2.0f) + hl.L(12.0f), L);
                    canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), qx1Var.d);
                    super.dispatchDraw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            case 4:
                super.dispatchDraw(canvas);
                ((j81) obj).G = false;
                break;
            case 19:
                if (getAdapter() == ((yg4) obj).V) {
                    for (int i11 = 0; i11 < getChildCount(); i11++) {
                        if (U(getChildAt(i11)).f == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i11).getX(), (getChildAt(i11).getY() - getChildAt(i11).getMeasuredHeight()) + hl.L(2.0f));
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
                dc5 dc5Var = (dc5) obj;
                if (dc5Var.A0 != null && dc5Var.B0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = dc5Var.A0.getMeasuredHeight();
                    aVar = ((e) dc5Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - aVar.getMeasuredHeight()));
                    dc5Var.A0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 24:
                b58 b58Var = (b58) obj;
                int i12 = -1;
                if (!b58Var.g0) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < getChildCount()) {
                            View childAt = getChildAt(i13);
                            if (!(childAt instanceof h96) || (m96Var = ((h96) childAt).L) == null) {
                                i13++;
                            } else {
                                i12 = m96Var.a;
                            }
                        }
                    }
                }
                if (i12 > b58Var.G) {
                    b58Var.G = i12;
                    dn2 dn2Var = b58Var.j0.H1;
                    if (dn2Var != null) {
                        dn2Var.setCount(b58Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 25:
                uc6 uc6Var = (uc6) obj;
                RectF rectF2 = uc6Var.a0;
                if (uc6Var.Z != null) {
                    int L2 = hl.L(12.0f);
                    uc6Var.Z.setBounds(-L2, uc6Var.b0 - L2, getWidth() + L2, getHeight() + L2);
                    uc6Var.Z.draw(canvas);
                    byte b2 = uc6Var.N0;
                    if (b2 == 0 || b2 == 1) {
                        int L3 = hl.L(36.0f);
                        rectF2.set((getWidth() - L3) / 2.0f, hl.L(10.0f) + uc6Var.b0, (getWidth() + L3) / 2.0f, hl.L(4.0f) + r7);
                        aob.s0.setColor(uc6Var.getThemedColor(aob.zj));
                        canvas.drawRoundRect(rectF2, hl.L(2.0f), hl.L(2.0f), aob.s0);
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 26:
                int i14 = 1;
                m57 m57Var2 = (m57) obj;
                w81 w81Var = m57Var2.b;
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt2 = getChildAt(i15);
                    if (childAt2 instanceof wb2) {
                        ((wb2) childAt2).B3(w81Var.getMeasuredWidth(), w81Var.getBackgroundSizeY());
                    }
                }
                int childCount = getChildCount();
                m47 m47Var = null;
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = getChildAt(i16);
                    if ((childAt3 instanceof wb2) && ((currentMessagesGroup2 = ((wb2) childAt3).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != m47Var)) {
                        m47Var = currentMessagesGroup2;
                    }
                }
                int i17 = 0;
                while (i17 < 3) {
                    s57 s57Var = m57Var2.d0;
                    ArrayList arrayList2 = s57Var.F;
                    gu guVar3 = m57Var2.f;
                    s57Var.F.clear();
                    int i18 = 2;
                    if (i17 != 2 || guVar3.W1) {
                        int i19 = z ? 1 : 0;
                        ?? r15 = z;
                        while (i19 < childCount) {
                            View childAt4 = guVar3.getChildAt(i19);
                            if (childAt4 instanceof wb2) {
                                wb2 wb2Var = (wb2) childAt4;
                                if (childAt4.getY() <= guVar3.getHeight() && childAt4.getY() + childAt4.getHeight() >= f2 && (currentMessagesGroup = wb2Var.getCurrentMessagesGroup()) != null) {
                                    l47 l47Var = currentMessagesGroup.m;
                                    if (i17 == 0) {
                                        i5 = i14;
                                        if (currentMessagesGroup.d.size() == i5) {
                                        }
                                    } else {
                                        i5 = i14;
                                    }
                                    if ((i17 != i5 || l47Var.i) && ((i17 != 0 || !wb2Var.getMessageObject().Z) && (i17 != 1 || wb2Var.getMessageObject().Z))) {
                                        boolean z2 = wb2Var.La;
                                        if (i17 == i18) {
                                            if (!z2) {
                                            }
                                            if (!arrayList2.contains(currentMessagesGroup)) {
                                                l47Var.a = r15;
                                                l47Var.b = r15;
                                                l47Var.c = r15;
                                                l47Var.d = r15;
                                                l47Var.l = r15;
                                                l47Var.k = r15;
                                                l47Var.m = wb2Var;
                                                arrayList2.add(currentMessagesGroup);
                                            }
                                            l47Var.k = wb2Var.L2();
                                            l47Var.l = wb2Var.K2();
                                            backgroundDrawableLeft = wb2Var.getBackgroundDrawableLeft() + wb2Var.getLeft();
                                            backgroundDrawableRight = wb2Var.getBackgroundDrawableRight() + wb2Var.getLeft();
                                            backgroundDrawableTop = wb2Var.getBackgroundDrawableTop() + wb2Var.getPaddingTop() + wb2Var.getTop();
                                            int backgroundDrawableBottom = wb2Var.getBackgroundDrawableBottom() + wb2Var.getPaddingTop() + wb2Var.getTop();
                                            if ((wb2Var.getCurrentPosition().l & 4) == 0) {
                                                backgroundDrawableTop -= hl.L(10.0f);
                                            }
                                            if ((wb2Var.getCurrentPosition().l & 8) == 0) {
                                                backgroundDrawableBottom = hl.L(10.0f) + backgroundDrawableBottom;
                                            }
                                            i6 = backgroundDrawableBottom;
                                            if (wb2Var.La) {
                                                l47Var.m = wb2Var;
                                            }
                                            i7 = l47Var.b;
                                            if (i7 != 0 || backgroundDrawableTop < i7) {
                                                l47Var.b = backgroundDrawableTop;
                                            }
                                            i8 = l47Var.d;
                                            if (i8 != 0 || i6 > i8) {
                                                l47Var.d = i6;
                                            }
                                            i9 = l47Var.a;
                                            if (i9 != 0 || backgroundDrawableLeft < i9) {
                                                l47Var.a = backgroundDrawableLeft;
                                            }
                                            i10 = l47Var.c;
                                            if (i10 != 0 || backgroundDrawableRight > i10) {
                                                l47Var.c = backgroundDrawableRight;
                                            }
                                        } else {
                                            if (z2) {
                                            }
                                            if (!arrayList2.contains(currentMessagesGroup)) {
                                            }
                                            l47Var.k = wb2Var.L2();
                                            l47Var.l = wb2Var.K2();
                                            backgroundDrawableLeft = wb2Var.getBackgroundDrawableLeft() + wb2Var.getLeft();
                                            backgroundDrawableRight = wb2Var.getBackgroundDrawableRight() + wb2Var.getLeft();
                                            backgroundDrawableTop = wb2Var.getBackgroundDrawableTop() + wb2Var.getPaddingTop() + wb2Var.getTop();
                                            int backgroundDrawableBottom2 = wb2Var.getBackgroundDrawableBottom() + wb2Var.getPaddingTop() + wb2Var.getTop();
                                            if ((wb2Var.getCurrentPosition().l & 4) == 0) {
                                            }
                                            if ((wb2Var.getCurrentPosition().l & 8) == 0) {
                                            }
                                            i6 = backgroundDrawableBottom2;
                                            if (wb2Var.La) {
                                            }
                                            i7 = l47Var.b;
                                            if (i7 != 0) {
                                            }
                                            l47Var.b = backgroundDrawableTop;
                                            i8 = l47Var.d;
                                            if (i8 != 0) {
                                            }
                                            l47Var.d = i6;
                                            i9 = l47Var.a;
                                            if (i9 != 0) {
                                            }
                                            l47Var.a = backgroundDrawableLeft;
                                            i10 = l47Var.c;
                                            if (i10 != 0) {
                                            }
                                            l47Var.c = backgroundDrawableRight;
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
                            m47 m47Var2 = (m47) arrayList3.get(i20);
                            if (m47Var2 == null) {
                                m57Var = m57Var2;
                                i2 = i17;
                                arrayList = arrayList3;
                                i3 = i20;
                                f = f3;
                                i4 = childCount;
                                guVar = guVar3;
                            } else {
                                l47 l47Var2 = m47Var2.m;
                                float U1 = l47Var2.m.U1(true);
                                float f4 = l47Var2.a + U1 + l47Var2.e;
                                float f5 = l47Var2.b + l47Var2.f;
                                float f6 = l47Var2.g + l47Var2.c + U1;
                                float f7 = l47Var2.d + l47Var2.h;
                                if (!l47Var2.j) {
                                    f5 += l47Var2.m.getTranslationY();
                                    f7 += l47Var2.m.getTranslationY();
                                }
                                if (f5 < (-hl.L(20.0f))) {
                                    f5 = -hl.L(20.0f);
                                }
                                float f8 = f5;
                                if (f7 > hl.L(20.0f) + guVar3.getMeasuredHeight()) {
                                    f7 = hl.L(20.0f) + guVar3.getMeasuredHeight();
                                }
                                float f9 = f7;
                                boolean z3 = (l47Var2.m.getScaleX() == 1.0f && l47Var2.m.getScaleY() == 1.0f) ? false : true;
                                if (z3) {
                                    canvas.save();
                                    m57Var = m57Var2;
                                    i = childCount;
                                    i2 = i17;
                                    canvas.scale(l47Var2.m.getScaleX(), l47Var2.m.getScaleY(), bp1.z(f6, f4, f3, f4), bp1.z(f9, f8, f3, f8));
                                } else {
                                    m57Var = m57Var2;
                                    i = childCount;
                                    i2 = i17;
                                }
                                arrayList = arrayList3;
                                i3 = i20;
                                f = f3;
                                i4 = i;
                                guVar = guVar3;
                                l47Var2.m.K0(canvas, (int) f4, (int) f8, (int) f6, (int) f9, l47Var2.k, l47Var2.l, false, 0);
                                l47Var2.m = null;
                                l47Var2.o = m47Var2.c;
                                if (z3) {
                                    canvas.restore();
                                    for (int i21 = 0; i21 < i4; i21++) {
                                        View childAt5 = guVar.getChildAt(i21);
                                        if (childAt5 instanceof wb2) {
                                            wb2 wb2Var2 = (wb2) childAt5;
                                            if (wb2Var2.getCurrentMessagesGroup() == m47Var2) {
                                                int left = wb2Var2.getLeft();
                                                int top = wb2Var2.getTop();
                                                childAt5.setPivotX(((f6 - f4) / f) + (f4 - left));
                                                childAt5.setPivotY(((f9 - f8) / f) + (f8 - top));
                                            }
                                        }
                                    }
                                }
                            }
                            guVar3 = guVar;
                            childCount = i4;
                            f3 = f;
                            i17 = i2;
                            arrayList3 = arrayList;
                            i20 = i3 + 1;
                            m57Var2 = m57Var;
                        }
                    }
                    i17++;
                    childCount = childCount;
                    f3 = f3;
                    m57Var2 = m57Var2;
                    f2 = 0.0f;
                    z = false;
                    i14 = 1;
                }
                super.dispatchDraw(canvas);
                break;
            case 27:
                g48 g48Var = (g48) obj;
                Paint paint = g48Var.x;
                RectF rectF3 = g48Var.s;
                RectF rectF4 = g48Var.r;
                RectF rectF5 = g48Var.n;
                x46 x46Var = g48Var.b;
                if (!g48Var.f.isEmpty()) {
                    float e = g48Var.e.e(false, g48Var.d);
                    double d = e;
                    int j = Utilities.j((int) Math.floor(d), r9.size() - 1, 0);
                    int j2 = Utilities.j((int) Math.ceil(d), r9.size() - 1, 0);
                    View m = x46Var.m(j);
                    View m2 = x46Var.m(j2);
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
                    hl.X1(rectF5, rectF4, e - j, rectF3);
                    paint.setColor(g48Var.y);
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

    @Override // d79, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zc zcVar;
        f89 L;
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 9:
                if (motionEvent.getActionMasked() == 0) {
                    s42 s42Var = (s42) obj;
                    if (motionEvent.getY() < s42Var.t0 && (zcVar = s42Var.K) != null && zcVar.getVisibility() == 0 && (L = L(0)) != null && motionEvent.getY() >= hl.L(32.0f) + Math.max(0, L.a.getTop())) {
                    }
                }
                break;
            case 22:
                if (!((wt4) obj).L) {
                    break;
                }
                break;
            case 24:
                if (!((b58) obj).g0) {
                    break;
                }
                break;
            case 25:
                if (motionEvent.getActionMasked() != 0 || motionEvent.getY() >= ((uc6) obj).b0) {
                    break;
                }
                break;
            case 28:
                i49 i49Var = (i49) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && i49Var.getPullingLeftProgress() > 0.95f) {
                        i49Var.o();
                    } else if (i49Var.C0 != 0.0f) {
                        ValueAnimator valueAnimator = i49Var.z0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(i49Var.C0, 0.0f);
                        i49Var.z0 = ofFloat;
                        ofFloat.addUpdateListener(new pv7(i49Var, (byte) 28));
                        i49Var.z0.setDuration(150L);
                        i49Var.z0.start();
                    }
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0162  */
    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        wb2 wb2Var;
        ImageReceiver avatarImage;
        boolean z;
        int y;
        int b;
        byte b2 = this.f3;
        Object obj = this.g3;
        switch (b2) {
            case 5:
                wf1 wf1Var = (wf1) obj;
                if (view instanceof ec2) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    ((ec2) view).a(canvas);
                    canvas.restore();
                }
                boolean drawChild = super.drawChild(canvas, view, j);
                if ((view instanceof wb2) && (avatarImage = (wb2Var = (wb2) view).getAvatarImage()) != null) {
                    if (!wb2Var.getMessageObject().Z) {
                        wf1Var.w.getClass();
                        if (RecyclerView.S(wb2Var) != -1) {
                            z = true;
                            if (!wb2Var.getMessageObject().Z) {
                                avatarImage.v0(false, false);
                                break;
                            } else {
                                int y2 = (int) view.getY();
                                if (wb2Var.n() && (b = wf1Var.w.U(view).b()) >= 0) {
                                    if (wf1Var.w.L(b + 1) != null) {
                                        avatarImage.v0(false, false);
                                        break;
                                    }
                                }
                                float checkBoxTranslation = wb2Var.getCheckBoxTranslation() + wb2Var.getSlidingOffsetX();
                                int layoutHeight = wb2Var.getLayoutHeight() + ((int) view.getY());
                                int measuredHeight = wf1Var.w.getMeasuredHeight() - wf1Var.w.getPaddingBottom();
                                if (layoutHeight > measuredHeight) {
                                    layoutHeight = measuredHeight;
                                }
                                if (wb2Var.j() && (r13 = wf1Var.w.U(view).b()) >= 0) {
                                    int i = 0;
                                    while (i < 20) {
                                        i++;
                                        int b3 = b3 - 1;
                                        f89 L = wf1Var.w.L(b3);
                                        if (L != null) {
                                            View view2 = L.a;
                                            int top = view2.getTop();
                                            if (view2 instanceof wb2) {
                                                wb2Var = (wb2) view2;
                                                if (wb2Var.j()) {
                                                    y2 = top;
                                                }
                                            }
                                            y2 = top;
                                        }
                                    }
                                }
                                if (layoutHeight - hl.L(48.0f) < y2) {
                                    layoutHeight = hl.L(48.0f) + y2;
                                }
                                if (!wb2Var.n() && layoutHeight > (y = (int) (wb2Var.getY() + wb2Var.getMeasuredHeight()))) {
                                    layoutHeight = y;
                                }
                                canvas.save();
                                if (checkBoxTranslation != 0.0f) {
                                    canvas.translate(checkBoxTranslation, 0.0f);
                                }
                                if (wb2Var.getCurrentMessagesGroup() != null && wb2Var.getCurrentMessagesGroup().m.j) {
                                    layoutHeight = (int) (layoutHeight - wb2Var.getTranslationY());
                                }
                                if (z) {
                                    avatarImage.M0 = layoutHeight - hl.L(44.0f);
                                }
                                if (wb2Var.a()) {
                                    avatarImage.setAlpha(wb2Var.getAlpha());
                                    canvas.scale(wb2Var.getScaleX(), wb2Var.getScaleY(), wb2Var.getPivotX() + wb2Var.getX(), wb2Var.getY() + (wb2Var.getHeight() >> 1));
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
                    if (!wb2Var.getMessageObject().Z) {
                    }
                }
                break;
            case 19:
                if (getAdapter() != ((yg4) obj).V || U(view).f != 1) {
                    break;
                }
                break;
            case 26:
                if (!(view instanceof wb2)) {
                    break;
                } else {
                    wb2 wb2Var2 = (wb2) view;
                    boolean drawChild2 = super.drawChild(canvas, view, j);
                    wb2Var2.S0(canvas);
                    canvas.save();
                    canvas.translate(wb2Var2.getX(), wb2Var2.getY());
                    canvas.save();
                    canvas.scale(wb2Var2.getScaleX(), wb2Var2.getScaleY(), wb2Var2.getPivotX(), wb2Var2.getPivotY());
                    wb2Var2.c1(canvas, true);
                    wb2Var2.V2(true);
                    wb2Var2.g1(canvas);
                    if (wb2Var2.getCurrentMessagesGroup() == null || ((wb2Var2.getCurrentPosition() != null && (((wb2Var2.getCurrentPosition().l & wb2Var2.G()) != 0 && (wb2Var2.getCurrentPosition().l & 1) != 0) || (wb2Var2.getCurrentMessagesGroup() != null && wb2Var2.getCurrentMessagesGroup().i))) || wb2Var2.getTransitionParams().x0)) {
                        wb2Var2.Q0(wb2Var2.getAlpha(), canvas, false);
                        wb2Var2.q1(canvas, wb2Var2.getAlpha(), null);
                        wb2Var2.V0(canvas, wb2Var2.getAlpha());
                    }
                    if (wb2Var2.getCurrentMessagesGroup() != null || wb2Var2.getTransitionParams().x0) {
                        wb2Var2.h1(canvas, wb2Var2.getAlpha());
                    }
                    if ((wb2Var2.getCurrentPosition() != null && wb2Var2.getCurrentPosition().h) || wb2Var2.getTransitionParams().x0) {
                        wb2Var2.A1(wb2Var2.getAlpha(), canvas, true);
                    }
                    wb2Var2.j1(canvas);
                    canvas.restore();
                    wb2Var2.getTransitionParams().d();
                    canvas.restore();
                    break;
                }
                break;
            case 28:
                w49 w49Var = ((i49) obj).m0;
                if (w49Var == null || !(view instanceof g49) || !((g49) view).e.equals(w49Var)) {
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
                View view = ((bg2) obj).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 24:
                super.invalidate();
                ((b58) obj).invalidate();
                break;
            case 27:
                super.invalidate();
                o38 o38Var = ((g48) obj).G;
                if (o38Var != null) {
                    o38Var.run();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i) {
        switch (this.f3) {
            case 26:
                if (i == 0) {
                    ((m57) this.g3).e.U();
                    break;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void n0(int i) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 10:
                c62 c62Var = (c62) obj;
                c62Var.invalidate();
                c62Var.b.I1(c62Var, i);
                b62 b62Var = c62Var.w;
                boolean z = true;
                int i2 = 0;
                boolean z2 = b62Var.y == null;
                if (z2) {
                    b62Var.y = b62Var.d();
                } else {
                    boolean[] d = b62Var.d();
                    if (d.length == b62Var.y.length) {
                        while (true) {
                            if (i2 >= d.length) {
                                z = z2;
                            } else if (d[i2] == b62Var.y[i2]) {
                                i2++;
                            }
                        }
                    }
                    z2 = z;
                }
                if (z2) {
                    b62Var.invalidate();
                    break;
                }
                break;
            case 11:
                break;
            case 26:
                ((m57) obj).e.F();
                break;
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.f3) {
            case 6:
                super.onAttachedToWindow();
                yc7 yc7Var = ((zu1) this.g3).b4;
                if (yc7Var != null) {
                    jn7.f(yc7Var.r).b(yc7Var, jn7.A5);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.f3) {
            case 6:
                super.onDetachedFromWindow();
                yc7 yc7Var = ((zu1) this.g3).b4;
                if (yc7Var != null) {
                    hl.r(yc7Var.F);
                    jn7.f(yc7Var.r).n(yc7Var, jn7.A5);
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 7:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((m22) obj).b.Y3[0] - hl.L(80.0f)) {
                    break;
                }
                break;
            case 10:
                if (((c62) obj).K == null) {
                    break;
                }
                break;
            case 12:
                if (!((pd2) obj).I) {
                    break;
                }
                break;
            case 15:
                hw3 hw3Var = (hw3) obj;
                boolean g = rw2.e().g(motionEvent, hw3Var.b, hw3Var.f, this.o2);
                if (!super.onInterceptTouchEvent(motionEvent) && !g) {
                    break;
                }
                break;
            case 16:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((o24) obj).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 22:
                if (!((wt4) obj).L) {
                    break;
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        r47 r47Var;
        byte b = this.f3;
        int i6 = 0;
        Object[] objArr = 0;
        Object obj = this.g3;
        switch (b) {
            case 2:
                ((ny0) obj).E0();
                super.onLayout(z, i, i2, i3, i4);
                break;
            case 5:
                wf1 wf1Var = (wf1) obj;
                if (wf1Var.w != null && wf1Var.y != null && (i5 = wf1Var.N0) >= 0) {
                    if (wf1Var.M0 != 0) {
                        while (true) {
                            tf1 tf1Var = wf1Var.F;
                            if (i6 < tf1Var.d) {
                                if (i6 < tf1Var.f || i6 >= tf1Var.h) {
                                    r47Var = null;
                                } else {
                                    ArrayList arrayList = tf1Var.n.p0;
                                    r47Var = (r47) arrayList.get((arrayList.size() - (i6 - tf1Var.f)) - 1);
                                }
                                if (r47Var == null || r47Var.T != wf1Var.M0) {
                                    i6++;
                                } else {
                                    i5 = i6;
                                }
                            }
                        }
                    }
                    wf1Var.y.h1(i5, wf1Var.O0, true);
                    wf1Var.N0 = -1;
                    wf1Var.M0 = 0L;
                }
                super.onLayout(z, i, i2, i3, i4);
                break;
            case 7:
                super.onLayout(z, i, i2, i3, i4);
                PhotoViewer.q0().r();
                break;
            case 9:
                super.onLayout(z, i, i2, i3, i4);
                s42 s42Var = (s42) obj;
                s42Var.i0();
                s42Var.g0();
                break;
            case 26:
                m57 m57Var = (m57) obj;
                int i7 = m57Var.a;
                if (m57Var.L) {
                    if (i7 != 0) {
                        x0(0);
                    }
                    m57Var.L = false;
                }
                super.onLayout(z, i, i2, i3, i4);
                m57Var.j();
                gu guVar = m57Var.f;
                if (m57Var.V) {
                    if (guVar.computeVerticalScrollRange() > guVar.computeVerticalScrollExtent()) {
                        m57Var.postDelayed(new d57(m57Var, objArr == true ? 1 : 0), 0L);
                    }
                    m57Var.V = false;
                }
                if (m57Var.O && i7 == 0) {
                    int i8 = m57Var.M;
                    int i9 = m57Var.N;
                    m57Var.O = false;
                    post(new bt((Object) this, i8, i9, (byte) 12));
                    break;
                }
                break;
            case 29:
                super.onLayout(z, i, i2, i3, i4);
                ((aw9) obj).a();
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
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

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 7:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((m22) obj).b.Y3[0] - hl.L(80.0f)) {
                    break;
                }
                break;
            case 10:
                if (((c62) obj).K == null) {
                    break;
                }
                break;
            case 12:
                if (!((pd2) obj).I) {
                    break;
                }
                break;
            case 21:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    hl.d3(new lw3((Object) this, (byte) 26), 250L);
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

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 0:
                if (!((nu) obj).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 20:
                if (!((ah4) obj).s1) {
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
                ((fg4) this.g3).invalidate();
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }

    @Override // d79
    public final boolean v1(View view) {
        switch (this.f3) {
            case 21:
                return !(view instanceof eh4) || ((eh4) view).getDraggingProgress() <= 0.0f;
            default:
                return super.v1(view);
        }
    }

    private final void A1(int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gu(Object obj, Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.f3 = b;
        this.g3 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gu(byte b, Context context, Object obj) {
        super(context, null);
        this.f3 = b;
        this.g3 = obj;
    }
}
