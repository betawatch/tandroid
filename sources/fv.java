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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fv extends r59 {
    public final /* synthetic */ byte f3;
    public final /* synthetic */ Object g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv(e34 e34Var, Context context, c34 c34Var) {
        super(context, null);
        this.f3 = (byte) 16;
        this.g3 = e34Var;
        setNestedScrollingEnabled(true);
        setSelectorRadius(gm.L(4.0f));
        anb.l(this, 20, cmb.h6, this.o2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        zs zsVar = new zs((byte) 6);
        zsVar.i1(0);
        setLayoutManager(zsVar);
        setAdapter(c34Var);
    }

    @Override // r59
    public final boolean F0(float f) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 8:
                i22 i22Var = ((w32) obj).b;
                return f >= ((float) ((gm.L(30.0f) + i22Var.Y3[0]) + (!i22Var.a2 ? gm.m : 0)));
            case 11:
                i22 i22Var2 = ((a82) obj).b;
                return f >= ((float) ((gm.L(30.0f) + i22Var2.Y3[0]) + (!i22Var2.a2 ? gm.m : 0)));
            default:
                return super.F0(f);
        }
    }

    @Override // r59
    public final boolean G0(View view) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 3:
                return view != ((y71) obj).X;
            case 18:
                ig4 ig4Var = (ig4) obj;
                return ig4Var.isEnabled() && !((dk3) ig4Var.K).b.l2;
            default:
                return super.G0(view);
        }
    }

    @Override // r59
    public final boolean I0(View view, float f, float f2) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 2:
                return ((mz0) obj).E0(view, f, f2);
            case 18:
                if (((ig4) obj).n) {
                    int L = gm.L(6.0f);
                    RectF rectF = ((gg4) view).f;
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

    @Override // r59
    public final Integer W0(int i) {
        int i2;
        byte b = this.f3;
        Object obj = this.g3;
        ylb ylbVar = this.o2;
        switch (b) {
            case 14:
                i2 = ((DataSettingsActivity) obj).resetDownloadRow;
                return i == i2 ? Integer.valueOf(cmb.p1(0.1f, cmb.v0(cmb.o7, ylbVar))) : Integer.valueOf(cmb.v0(cmb.h6, ylbVar));
            case 17:
                ArrayList arrayList = ((qf4) obj).Q;
                gf4 gf4Var = (i < 0 || i >= arrayList.size()) ? null : (gf4) arrayList.get(i);
                return (gf4Var == null || !gf4Var.l) ? Integer.valueOf(cmb.v0(cmb.h6, ylbVar)) : Integer.valueOf(cmb.p1(0.12f, cmb.v0(cmb.o7, ylbVar)));
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
    @Override // r59, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        a aVar;
        i96 i96Var;
        f57 f57Var;
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        float f;
        int i4;
        fv fvVar;
        f47 currentMessagesGroup;
        int i5;
        int backgroundDrawableLeft;
        int backgroundDrawableRight;
        int backgroundDrawableTop;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        f47 currentMessagesGroup2;
        View view;
        byte b = this.f3;
        float f2 = 0.0f;
        float f3 = 2.0f;
        boolean z = false;
        Object obj = this.g3;
        switch (b) {
            case 1:
                py1 py1Var = (py1) obj;
                fv fvVar2 = py1Var.c;
                if (fvVar2.getLayoutManager() != null && fvVar2.getAdapter() != null && fvVar2.getAdapter().b() != 0) {
                    float L = py1Var.h - gm.L(8.0f);
                    py1Var.e = L - gm.L(16.0f);
                    im0 im0Var = py1Var.r;
                    if (im0Var != null) {
                        im0Var.draw(canvas);
                    }
                    RectF rectF = gm.P;
                    rectF.set((getMeasuredWidth() / 2.0f) - gm.L(12.0f), L - gm.L(4.0f), (getMeasuredWidth() / 2.0f) + gm.L(12.0f), L);
                    canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), py1Var.d);
                    super.dispatchDraw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            case 4:
                super.dispatchDraw(canvas);
                ((k91) obj).G = false;
                break;
            case 19:
                if (getAdapter() == ((ch4) obj).V) {
                    for (int i11 = 0; i11 < getChildCount(); i11++) {
                        if (T(getChildAt(i11)).f == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i11).getX(), (getChildAt(i11).getY() - getChildAt(i11).getMeasuredHeight()) + gm.L(2.0f));
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
                ac5 ac5Var = (ac5) obj;
                if (ac5Var.A0 != null && ac5Var.B0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = ac5Var.A0.getMeasuredHeight();
                    aVar = ((d) ac5Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - aVar.getMeasuredHeight()));
                    ac5Var.A0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 24:
                n38 n38Var = (n38) obj;
                int i12 = -1;
                if (!n38Var.g0) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < getChildCount()) {
                            View childAt = getChildAt(i13);
                            if (!(childAt instanceof d96) || (i96Var = ((d96) childAt).L) == null) {
                                i13++;
                            } else {
                                i12 = i96Var.a;
                            }
                        }
                    }
                }
                if (i12 > n38Var.G) {
                    n38Var.G = i12;
                    vn2 vn2Var = n38Var.j0.N1;
                    if (vn2Var != null) {
                        vn2Var.setCount(n38Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 25:
                pc6 pc6Var = (pc6) obj;
                RectF rectF2 = pc6Var.a0;
                if (pc6Var.Z != null) {
                    int L2 = gm.L(12.0f);
                    pc6Var.Z.setBounds(-L2, pc6Var.b0 - L2, getWidth() + L2, getHeight() + L2);
                    pc6Var.Z.draw(canvas);
                    byte b2 = pc6Var.N0;
                    if (b2 == 0 || b2 == 1) {
                        int L3 = gm.L(36.0f);
                        rectF2.set((getWidth() - L3) / 2.0f, gm.L(10.0f) + pc6Var.b0, (getWidth() + L3) / 2.0f, gm.L(4.0f) + r7);
                        cmb.s0.setColor(pc6Var.getThemedColor(cmb.yj));
                        canvas.drawRoundRect(rectF2, gm.L(2.0f), gm.L(2.0f), cmb.s0);
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 26:
                int i14 = 1;
                f57 f57Var2 = (f57) obj;
                w91 w91Var = f57Var2.b;
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt2 = getChildAt(i15);
                    if (childAt2 instanceof rc2) {
                        ((rc2) childAt2).B3(w91Var.getMeasuredWidth(), w91Var.getBackgroundSizeY());
                    }
                }
                int childCount = getChildCount();
                f47 f47Var = null;
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = getChildAt(i16);
                    if ((childAt3 instanceof rc2) && ((currentMessagesGroup2 = ((rc2) childAt3).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != f47Var)) {
                        f47Var = currentMessagesGroup2;
                    }
                }
                int i17 = 0;
                while (i17 < 3) {
                    l57 l57Var = f57Var2.d0;
                    ArrayList arrayList2 = l57Var.F;
                    fv fvVar3 = f57Var2.f;
                    l57Var.F.clear();
                    int i18 = 2;
                    if (i17 != 2 || fvVar3.W1) {
                        int i19 = z ? 1 : 0;
                        ?? r15 = z;
                        while (i19 < childCount) {
                            View childAt4 = fvVar3.getChildAt(i19);
                            if (childAt4 instanceof rc2) {
                                rc2 rc2Var = (rc2) childAt4;
                                if (childAt4.getY() <= fvVar3.getHeight() && childAt4.getY() + childAt4.getHeight() >= f2 && (currentMessagesGroup = rc2Var.getCurrentMessagesGroup()) != null) {
                                    e47 e47Var = currentMessagesGroup.m;
                                    if (i17 == 0) {
                                        i5 = i14;
                                        if (currentMessagesGroup.d.size() == i5) {
                                        }
                                    } else {
                                        i5 = i14;
                                    }
                                    if ((i17 != i5 || e47Var.i) && ((i17 != 0 || !rc2Var.getMessageObject().Z) && (i17 != 1 || rc2Var.getMessageObject().Z))) {
                                        boolean z2 = rc2Var.La;
                                        if (i17 == i18) {
                                            if (!z2) {
                                            }
                                            if (!arrayList2.contains(currentMessagesGroup)) {
                                                e47Var.a = r15;
                                                e47Var.b = r15;
                                                e47Var.c = r15;
                                                e47Var.d = r15;
                                                e47Var.l = r15;
                                                e47Var.k = r15;
                                                e47Var.m = rc2Var;
                                                arrayList2.add(currentMessagesGroup);
                                            }
                                            e47Var.k = rc2Var.L2();
                                            e47Var.l = rc2Var.K2();
                                            backgroundDrawableLeft = rc2Var.getBackgroundDrawableLeft() + rc2Var.getLeft();
                                            backgroundDrawableRight = rc2Var.getBackgroundDrawableRight() + rc2Var.getLeft();
                                            backgroundDrawableTop = rc2Var.getBackgroundDrawableTop() + rc2Var.getPaddingTop() + rc2Var.getTop();
                                            int backgroundDrawableBottom = rc2Var.getBackgroundDrawableBottom() + rc2Var.getPaddingTop() + rc2Var.getTop();
                                            if ((rc2Var.getCurrentPosition().l & 4) == 0) {
                                                backgroundDrawableTop -= gm.L(10.0f);
                                            }
                                            if ((rc2Var.getCurrentPosition().l & 8) == 0) {
                                                backgroundDrawableBottom = gm.L(10.0f) + backgroundDrawableBottom;
                                            }
                                            i6 = backgroundDrawableBottom;
                                            if (rc2Var.La) {
                                                e47Var.m = rc2Var;
                                            }
                                            i7 = e47Var.b;
                                            if (i7 != 0 || backgroundDrawableTop < i7) {
                                                e47Var.b = backgroundDrawableTop;
                                            }
                                            i8 = e47Var.d;
                                            if (i8 != 0 || i6 > i8) {
                                                e47Var.d = i6;
                                            }
                                            i9 = e47Var.a;
                                            if (i9 != 0 || backgroundDrawableLeft < i9) {
                                                e47Var.a = backgroundDrawableLeft;
                                            }
                                            i10 = e47Var.c;
                                            if (i10 != 0 || backgroundDrawableRight > i10) {
                                                e47Var.c = backgroundDrawableRight;
                                            }
                                        } else {
                                            if (z2) {
                                            }
                                            if (!arrayList2.contains(currentMessagesGroup)) {
                                            }
                                            e47Var.k = rc2Var.L2();
                                            e47Var.l = rc2Var.K2();
                                            backgroundDrawableLeft = rc2Var.getBackgroundDrawableLeft() + rc2Var.getLeft();
                                            backgroundDrawableRight = rc2Var.getBackgroundDrawableRight() + rc2Var.getLeft();
                                            backgroundDrawableTop = rc2Var.getBackgroundDrawableTop() + rc2Var.getPaddingTop() + rc2Var.getTop();
                                            int backgroundDrawableBottom2 = rc2Var.getBackgroundDrawableBottom() + rc2Var.getPaddingTop() + rc2Var.getTop();
                                            if ((rc2Var.getCurrentPosition().l & 4) == 0) {
                                            }
                                            if ((rc2Var.getCurrentPosition().l & 8) == 0) {
                                            }
                                            i6 = backgroundDrawableBottom2;
                                            if (rc2Var.La) {
                                            }
                                            i7 = e47Var.b;
                                            if (i7 != 0) {
                                            }
                                            e47Var.b = backgroundDrawableTop;
                                            i8 = e47Var.d;
                                            if (i8 != 0) {
                                            }
                                            e47Var.d = i6;
                                            i9 = e47Var.a;
                                            if (i9 != 0) {
                                            }
                                            e47Var.a = backgroundDrawableLeft;
                                            i10 = e47Var.c;
                                            if (i10 != 0) {
                                            }
                                            e47Var.c = backgroundDrawableRight;
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
                            f47 f47Var2 = (f47) arrayList3.get(i20);
                            if (f47Var2 == null) {
                                f57Var = f57Var2;
                                i2 = i17;
                                arrayList = arrayList3;
                                i3 = i20;
                                f = f3;
                                i4 = childCount;
                                fvVar = fvVar3;
                            } else {
                                e47 e47Var2 = f47Var2.m;
                                float U1 = e47Var2.m.U1(true);
                                float f4 = e47Var2.a + U1 + e47Var2.e;
                                float f5 = e47Var2.b + e47Var2.f;
                                float f6 = e47Var2.g + e47Var2.c + U1;
                                float f7 = e47Var2.d + e47Var2.h;
                                if (!e47Var2.j) {
                                    f5 += e47Var2.m.getTranslationY();
                                    f7 += e47Var2.m.getTranslationY();
                                }
                                if (f5 < (-gm.L(20.0f))) {
                                    f5 = -gm.L(20.0f);
                                }
                                float f8 = f5;
                                if (f7 > gm.L(20.0f) + fvVar3.getMeasuredHeight()) {
                                    f7 = gm.L(20.0f) + fvVar3.getMeasuredHeight();
                                }
                                float f9 = f7;
                                boolean z3 = (e47Var2.m.getScaleX() == 1.0f && e47Var2.m.getScaleY() == 1.0f) ? false : true;
                                if (z3) {
                                    canvas.save();
                                    f57Var = f57Var2;
                                    i = childCount;
                                    i2 = i17;
                                    canvas.scale(e47Var2.m.getScaleX(), e47Var2.m.getScaleY(), aq1.z(f6, f4, f3, f4), aq1.z(f9, f8, f3, f8));
                                } else {
                                    f57Var = f57Var2;
                                    i = childCount;
                                    i2 = i17;
                                }
                                arrayList = arrayList3;
                                i3 = i20;
                                f = f3;
                                i4 = i;
                                fvVar = fvVar3;
                                e47Var2.m.K0(canvas, (int) f4, (int) f8, (int) f6, (int) f9, e47Var2.k, e47Var2.l, false, 0);
                                e47Var2.m = null;
                                e47Var2.o = f47Var2.c;
                                if (z3) {
                                    canvas.restore();
                                    for (int i21 = 0; i21 < i4; i21++) {
                                        View childAt5 = fvVar.getChildAt(i21);
                                        if (childAt5 instanceof rc2) {
                                            rc2 rc2Var2 = (rc2) childAt5;
                                            if (rc2Var2.getCurrentMessagesGroup() == f47Var2) {
                                                int left = rc2Var2.getLeft();
                                                int top = rc2Var2.getTop();
                                                childAt5.setPivotX(((f6 - f4) / f) + (f4 - left));
                                                childAt5.setPivotY(((f9 - f8) / f) + (f8 - top));
                                            }
                                        }
                                    }
                                }
                            }
                            fvVar3 = fvVar;
                            childCount = i4;
                            f3 = f;
                            i17 = i2;
                            arrayList3 = arrayList;
                            i20 = i3 + 1;
                            f57Var2 = f57Var;
                        }
                    }
                    i17++;
                    childCount = childCount;
                    f3 = f3;
                    f57Var2 = f57Var2;
                    f2 = 0.0f;
                    z = false;
                    i14 = 1;
                }
                super.dispatchDraw(canvas);
                break;
            case 27:
                c38 c38Var = (c38) obj;
                Paint paint = c38Var.x;
                RectF rectF3 = c38Var.s;
                RectF rectF4 = c38Var.r;
                RectF rectF5 = c38Var.n;
                u46 u46Var = c38Var.b;
                if (!c38Var.f.isEmpty()) {
                    float e = c38Var.e.e(false, c38Var.d);
                    double d = e;
                    int j = Utilities.j((int) Math.floor(d), r9.size() - 1, 0);
                    int j2 = Utilities.j((int) Math.ceil(d), r9.size() - 1, 0);
                    View m = u46Var.m(j);
                    View m2 = u46Var.m(j2);
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
                    gm.X1(rectF5, rectF4, e - j, rectF3);
                    paint.setColor(c38Var.y);
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

    @Override // r59, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        yd ydVar;
        u69 K;
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 9:
                if (motionEvent.getActionMasked() == 0) {
                    n52 n52Var = (n52) obj;
                    if (motionEvent.getY() < n52Var.t0 && (ydVar = n52Var.K) != null && ydVar.getVisibility() == 0 && (K = K(0)) != null && motionEvent.getY() >= gm.L(32.0f) + Math.max(0, K.a.getTop())) {
                    }
                }
                break;
            case 22:
                if (!((tt4) obj).L) {
                    break;
                }
                break;
            case 24:
                if (!((n38) obj).g0) {
                    break;
                }
                break;
            case 25:
                if (motionEvent.getActionMasked() != 0 || motionEvent.getY() >= ((pc6) obj).b0) {
                    break;
                }
                break;
            case 28:
                v29 v29Var = (v29) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && v29Var.getPullingLeftProgress() > 0.95f) {
                        v29Var.o();
                    } else if (v29Var.C0 != 0.0f) {
                        ValueAnimator valueAnimator = v29Var.z0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(v29Var.C0, 0.0f);
                        v29Var.z0 = ofFloat;
                        ofFloat.addUpdateListener(new fx7(v29Var, (byte) 27));
                        v29Var.z0.setDuration(150L);
                        v29Var.z0.start();
                    }
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0162  */
    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        rc2 rc2Var;
        ImageReceiver avatarImage;
        boolean z;
        int y;
        int b;
        byte b2 = this.f3;
        Object obj = this.g3;
        switch (b2) {
            case 5:
                vg1 vg1Var = (vg1) obj;
                if (view instanceof zc2) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    ((zc2) view).a(canvas);
                    canvas.restore();
                }
                boolean drawChild = super.drawChild(canvas, view, j);
                if ((view instanceof rc2) && (avatarImage = (rc2Var = (rc2) view).getAvatarImage()) != null) {
                    if (!rc2Var.getMessageObject().Z) {
                        vg1Var.w.getClass();
                        if (RecyclerView.R(rc2Var) != -1) {
                            z = true;
                            if (!rc2Var.getMessageObject().Z) {
                                avatarImage.v0(false, false);
                                break;
                            } else {
                                int y2 = (int) view.getY();
                                if (rc2Var.n() && (b = vg1Var.w.T(view).b()) >= 0) {
                                    if (vg1Var.w.K(b + 1) != null) {
                                        avatarImage.v0(false, false);
                                        break;
                                    }
                                }
                                float checkBoxTranslation = rc2Var.getCheckBoxTranslation() + rc2Var.getSlidingOffsetX();
                                int layoutHeight = rc2Var.getLayoutHeight() + ((int) view.getY());
                                int measuredHeight = vg1Var.w.getMeasuredHeight() - vg1Var.w.getPaddingBottom();
                                if (layoutHeight > measuredHeight) {
                                    layoutHeight = measuredHeight;
                                }
                                if (rc2Var.j() && (r13 = vg1Var.w.T(view).b()) >= 0) {
                                    int i = 0;
                                    while (i < 20) {
                                        i++;
                                        int b3 = b3 - 1;
                                        u69 K = vg1Var.w.K(b3);
                                        if (K != null) {
                                            View view2 = K.a;
                                            int top = view2.getTop();
                                            if (view2 instanceof rc2) {
                                                rc2Var = (rc2) view2;
                                                if (rc2Var.j()) {
                                                    y2 = top;
                                                }
                                            }
                                            y2 = top;
                                        }
                                    }
                                }
                                if (layoutHeight - gm.L(48.0f) < y2) {
                                    layoutHeight = gm.L(48.0f) + y2;
                                }
                                if (!rc2Var.n() && layoutHeight > (y = (int) (rc2Var.getY() + rc2Var.getMeasuredHeight()))) {
                                    layoutHeight = y;
                                }
                                canvas.save();
                                if (checkBoxTranslation != 0.0f) {
                                    canvas.translate(checkBoxTranslation, 0.0f);
                                }
                                if (rc2Var.getCurrentMessagesGroup() != null && rc2Var.getCurrentMessagesGroup().m.j) {
                                    layoutHeight = (int) (layoutHeight - rc2Var.getTranslationY());
                                }
                                if (z) {
                                    avatarImage.M0 = layoutHeight - gm.L(44.0f);
                                }
                                if (rc2Var.a()) {
                                    avatarImage.setAlpha(rc2Var.getAlpha());
                                    canvas.scale(rc2Var.getScaleX(), rc2Var.getScaleY(), rc2Var.getPivotX() + rc2Var.getX(), rc2Var.getY() + (rc2Var.getHeight() >> 1));
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
                    if (!rc2Var.getMessageObject().Z) {
                    }
                }
                break;
            case 19:
                if (getAdapter() != ((ch4) obj).V || T(view).f != 1) {
                    break;
                }
                break;
            case 26:
                if (!(view instanceof rc2)) {
                    break;
                } else {
                    rc2 rc2Var2 = (rc2) view;
                    boolean drawChild2 = super.drawChild(canvas, view, j);
                    rc2Var2.S0(canvas);
                    canvas.save();
                    canvas.translate(rc2Var2.getX(), rc2Var2.getY());
                    canvas.save();
                    canvas.scale(rc2Var2.getScaleX(), rc2Var2.getScaleY(), rc2Var2.getPivotX(), rc2Var2.getPivotY());
                    rc2Var2.c1(canvas, true);
                    rc2Var2.V2(true);
                    rc2Var2.g1(canvas);
                    if (rc2Var2.getCurrentMessagesGroup() == null || ((rc2Var2.getCurrentPosition() != null && (((rc2Var2.getCurrentPosition().l & rc2Var2.C()) != 0 && (rc2Var2.getCurrentPosition().l & 1) != 0) || (rc2Var2.getCurrentMessagesGroup() != null && rc2Var2.getCurrentMessagesGroup().i))) || rc2Var2.getTransitionParams().x0)) {
                        rc2Var2.Q0(rc2Var2.getAlpha(), canvas, false);
                        rc2Var2.q1(canvas, rc2Var2.getAlpha(), null);
                        rc2Var2.V0(canvas, rc2Var2.getAlpha());
                    }
                    if (rc2Var2.getCurrentMessagesGroup() != null || rc2Var2.getTransitionParams().x0) {
                        rc2Var2.h1(canvas, rc2Var2.getAlpha());
                    }
                    if ((rc2Var2.getCurrentPosition() != null && rc2Var2.getCurrentPosition().h) || rc2Var2.getTransitionParams().x0) {
                        rc2Var2.A1(rc2Var2.getAlpha(), canvas, true);
                    }
                    rc2Var2.j1(canvas);
                    canvas.restore();
                    rc2Var2.getTransitionParams().d();
                    canvas.restore();
                    break;
                }
                break;
            case 28:
                k39 k39Var = ((v29) obj).m0;
                if (k39Var == null || !(view instanceof t29) || !((t29) view).e.equals(k39Var)) {
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
                View view = ((wg2) obj).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 24:
                super.invalidate();
                ((n38) obj).invalidate();
                break;
            case 27:
                super.invalidate();
                l28 l28Var = ((c38) obj).G;
                if (l28Var != null) {
                    l28Var.run();
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
                    ((f57) this.g3).e.U();
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
                x62 x62Var = (x62) obj;
                x62Var.invalidate();
                x62Var.b.H1(x62Var, i);
                w62 w62Var = x62Var.w;
                boolean z = true;
                int i2 = 0;
                boolean z2 = w62Var.y == null;
                if (z2) {
                    w62Var.y = w62Var.d();
                } else {
                    boolean[] d = w62Var.d();
                    if (d.length == w62Var.y.length) {
                        while (true) {
                            if (i2 >= d.length) {
                                z = z2;
                            } else if (d[i2] == w62Var.y[i2]) {
                                i2++;
                            }
                        }
                    }
                    z2 = z;
                }
                if (z2) {
                    w62Var.invalidate();
                    break;
                }
                break;
            case 11:
                break;
            case 26:
                ((f57) obj).e.F();
                break;
        }
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.f3) {
            case 6:
                super.onAttachedToWindow();
                sc7 sc7Var = ((yv1) this.g3).b4;
                if (sc7Var != null) {
                    nm7.f(sc7Var.r).b(sc7Var, nm7.B5);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.f3) {
            case 6:
                super.onDetachedFromWindow();
                sc7 sc7Var = ((yv1) this.g3).b4;
                if (sc7Var != null) {
                    gm.r(sc7Var.F);
                    nm7.f(sc7Var.r).n(sc7Var, nm7.B5);
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 7:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((h32) obj).b.Y3[0] - gm.L(80.0f)) {
                    break;
                }
                break;
            case 10:
                if (((x62) obj).K == null) {
                    break;
                }
                break;
            case 12:
                if (!((ke2) obj).I) {
                    break;
                }
                break;
            case 15:
                yw3 yw3Var = (yw3) obj;
                boolean g = hx2.e().g(motionEvent, yw3Var.b, yw3Var.f, this.o2);
                if (!super.onInterceptTouchEvent(motionEvent) && !g) {
                    break;
                }
                break;
            case 16:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((e34) obj).h.requestDisallowInterceptTouchEvent(true);
                }
                break;
            case 22:
                if (!((tt4) obj).L) {
                    break;
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        k47 k47Var;
        byte b = this.f3;
        int i6 = 0;
        Object[] objArr = 0;
        Object obj = this.g3;
        switch (b) {
            case 2:
                ((mz0) obj).D0();
                super.onLayout(z, i, i2, i3, i4);
                break;
            case 5:
                vg1 vg1Var = (vg1) obj;
                if (vg1Var.w != null && vg1Var.y != null && (i5 = vg1Var.N0) >= 0) {
                    if (vg1Var.M0 != 0) {
                        while (true) {
                            sg1 sg1Var = vg1Var.F;
                            if (i6 < sg1Var.d) {
                                if (i6 < sg1Var.f || i6 >= sg1Var.h) {
                                    k47Var = null;
                                } else {
                                    ArrayList arrayList = sg1Var.n.p0;
                                    k47Var = (k47) arrayList.get((arrayList.size() - (i6 - sg1Var.f)) - 1);
                                }
                                if (k47Var == null || k47Var.T != vg1Var.M0) {
                                    i6++;
                                } else {
                                    i5 = i6;
                                }
                            }
                        }
                    }
                    vg1Var.y.h1(i5, vg1Var.O0, true);
                    vg1Var.N0 = -1;
                    vg1Var.M0 = 0L;
                }
                super.onLayout(z, i, i2, i3, i4);
                break;
            case 7:
                super.onLayout(z, i, i2, i3, i4);
                PhotoViewer.r0().r();
                break;
            case 9:
                super.onLayout(z, i, i2, i3, i4);
                n52 n52Var = (n52) obj;
                n52Var.j0();
                n52Var.h0();
                break;
            case 26:
                f57 f57Var = (f57) obj;
                int i7 = f57Var.a;
                if (f57Var.L) {
                    if (i7 != 0) {
                        w0(0);
                    }
                    f57Var.L = false;
                }
                super.onLayout(z, i, i2, i3, i4);
                f57Var.j();
                fv fvVar = f57Var.f;
                if (f57Var.V) {
                    if (fvVar.computeVerticalScrollRange() > fvVar.computeVerticalScrollExtent()) {
                        f57Var.postDelayed(new w47(f57Var, objArr == true ? 1 : 0), 0L);
                    }
                    f57Var.V = false;
                }
                if (f57Var.O && i7 == 0) {
                    int i8 = f57Var.M;
                    int i9 = f57Var.N;
                    f57Var.O = false;
                    post(new cu((Object) this, i8, i9, (byte) 12));
                    break;
                }
                break;
            case 29:
                super.onLayout(z, i, i2, i3, i4);
                ((ju9) obj).a();
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
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

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 7:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((h32) obj).b.Y3[0] - gm.L(80.0f)) {
                    break;
                }
                break;
            case 10:
                if (((x62) obj).K == null) {
                    break;
                }
                break;
            case 12:
                if (!((ke2) obj).I) {
                    break;
                }
                break;
            case 21:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    gm.d3(new a14((Object) this, (byte) 20), 250L);
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

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 0:
                if (!((mv) obj).r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 20:
                if (!((dh4) obj).s1) {
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
                ((ig4) this.g3).invalidate();
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }

    @Override // r59
    public final boolean u1(View view) {
        switch (this.f3) {
            case 21:
                return !(view instanceof hh4) || ((hh4) view).getDraggingProgress() <= 0.0f;
            default:
                return super.u1(view);
        }
    }

    private final void z1(int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fv(Object obj, Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
        this.f3 = b;
        this.g3 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fv(byte b, Context context, Object obj) {
        super(context, null);
        this.f3 = b;
        this.g3 = obj;
    }
}
